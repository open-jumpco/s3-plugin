package io.jumpco.open.gradle.s3;

public class S3Extension {
    private String profile;
    private String region;
    private String bucket;
    private String awsAccessKeyId;
    private String awsSecretAccessKey;

    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    public void setAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
    }

    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    public void setAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Override
    public String toString() {
        return "S3Extension{" +
                "profile='" + profile + '\'' +
                ", region='" + region + '\'' +
                ", bucket='" + bucket + '\'' +
                ", awsAccessKeyId='" + awsAccessKeyId + '\'' +
                ", awsSecretAccessKey='" + (awsSecretAccessKey != null ? "********" : "null") + '\'' +
                '}';
    }
}