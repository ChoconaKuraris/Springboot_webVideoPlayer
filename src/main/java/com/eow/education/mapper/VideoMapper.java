package com.eow.education.mapper;

import com.eow.education.entity.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface VideoMapper {
    ArrayList<Video> getVideoById(int id);

}
