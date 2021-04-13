package com.eow.education.controller;

import com.eow.education.entity.Video;
import com.eow.education.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class VideoController {


    @Autowired
    private VideoService videoService;

    //点击播放按钮，开始播放视频
    @GetMapping(value = "/video/{path}/{id}")
    public String video(@PathVariable int id,@PathVariable String path, ModelMap model)
    {
        Video video = videoService.getVideoByIdAndPath(id,path);

        String VideoPath = "/videos/"+video.getVideoPath()+"/"+video.getVideoName()+".mp4";
        String PosterPath = "/posters/"+video.getVideoPoster()+".jpg";

        //Get方式向前端传送Video属性

        try{
                model.addAttribute("VideoPath",VideoPath);
                model.addAttribute("PosterPath",PosterPath);
                model.addAttribute("VideoId",video.getVideoId());
                model.addAttribute("VideoName",video.getVideoName());
                model.addAttribute("Episodes",video.getEpisodes());
                model.addAttribute("FilePath",video.getVideoPath());
                model.addAttribute("AssociatedFileName",video.getAssociatedFileName());
                System.out.printf("\n success.........");
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return "video";
    }


}
