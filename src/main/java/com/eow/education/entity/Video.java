package com.eow.education.entity;

public class Video {
    private int VideoId;
    private String VideoName;
    private String VideoPoster;
    private String VideoPath;
    private int Episodes;
    private String AssociatedFileName;

    public String getAssociatedFileName() {
        return AssociatedFileName;
    }

    public void setAssociatedFileName(String associatedFileName) {
        AssociatedFileName = associatedFileName;
    }

    public int getEpisodes() {
        return Episodes;
    }

    public void setEpisodes(int episodes) {
        Episodes = episodes;
    }

    public String getVideoPath() {
        return VideoPath;
    }

    public void setVideoPath(String videoPath) {
        VideoPath = videoPath;
    }

    public int getVideoId() {
        return VideoId;
    }

    public void setVideoId(int videoId) {
        VideoId = videoId;
    }

    public String getVideoName() {
        return VideoName;
    }

    public void setVideoName(String videoName) {
        VideoName = videoName;
    }

    public String getVideoPoster() {
        return VideoPoster;
    }

    public void setVideoPoster(String videoPoster) {
        VideoPoster = videoPoster;
    }
}
