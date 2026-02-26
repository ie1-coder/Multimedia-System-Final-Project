package com.media.model;

/**
 * Model class representing a multimedia file.
 */
public class MediaFile {
    private String fileName;
    private String fileType; // "audio" or "video"

    public MediaFile(String fileName, String fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }
}