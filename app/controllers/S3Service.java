package controllers;

import java.io.File;
import java.io.IOException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import play.mvc.Http;

public class S3Service {

    private static String bucketName     = "images.cheapeat.fgoeldi.com/big";
    private static String keyName        = "filename.jpg";
    //private static String uploadFileName = "*** Provide file name ***";

    public static void uploadImage(File file){
        AWSCredentials awsCredentials = new BasicAWSCredentials("AKIAJMSRSEWBG5FZIDLQ","xcg5E5bJhcQD7Rx6SlLQbWdoVIWcvb/P0M3wXtxT");

        AmazonS3 s3client = new AmazonS3Client(awsCredentials);
        try {

            System.out.println("Uploading a new object to S3 from a file\n");
            //File file = new File(uploadFileName);
            s3client.putObject(new PutObjectRequest(
                    bucketName, keyName, file));

        } catch (AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, which " +
                    "means your request made it " +
                    "to Amazon S3, but was rejected with an error response" +
                    " for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } catch (AmazonClientException ace) {
            System.out.println("Caught an AmazonClientException, which " +
                    "means the client encountered " +
                    "an internal error while trying to " +
                    "communicate with S3, " +
                    "such as not being able to access the network.");
            System.out.println("Error Message: " + ace.getMessage());
        }
    }
}
