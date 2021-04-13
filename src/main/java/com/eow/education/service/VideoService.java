package com.eow.education.service;

import com.eow.education.entity.Video;
import com.eow.education.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class VideoService  {


    @Autowired
    private VideoMapper videoMapper;

    public Video getVideoByIdAndPath(int id,String path) {
        ArrayList VideoList=videoMapper.getVideoById(id);
        Video temp=new Video();
        if(!VideoList.isEmpty())
        {
            for (int i = 0; i < VideoList.size(); i++) {
                temp= (Video) VideoList.get(i);
                if (temp.getVideoPath()==path)
                {
                    break;
                }
            }
        }
        return temp;

    }
}
