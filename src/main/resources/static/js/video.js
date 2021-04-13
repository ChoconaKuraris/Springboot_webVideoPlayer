
/*-----------------------------------------------------------------------------------
/*
/* Init JS
/*
-----------------------------------------------------------------------------------*/

<!--接收值-->

   var VideoPath = [[${VideoPath}]];
   var PosterPath = [[${PosterPath}]];
   var Episodes = [[${Episodes}]];
   var VideoId = [[${VideoId}]];
   var VideoName = [[${VideoName}]];


var player = videojs(document.getElementById('myVideo'), {
    controls: true, // 是否显示控制条
    poster: '//vjs.zencdn.net/v/oceans.png', // 视频封面图地址
    preload: 'auto',
    autoplay: false,
    fluid: true, // 自适应宽高
    language: 'zh-CN', // 设置语言
    muted: false, // 是否静音
    inactivityTimeout: false,
    controlBar: { // 设置控制条组件
        /* 设置控制条里面组件的相关属性及显示与否
        'currentTimeDisplay':true,
        'timeDivider':true,
        'durationDisplay':true,
        'remainingTimeDisplay':false,
        volumePanel: {
          inline: false,
        }

        /* 使用children的形式可以控制每一个控件的位置，以及显示与否 */
       children: [
            {name: 'playToggle'}, // 播放按钮
            {name: 'currentTimeDisplay'}, // 当前已播放时间
            {name: 'progressControl'}, // 播放进度条
            {name: 'durationDisplay'}, // 总时间
            { // 倍数播放
                name: 'playbackRateMenuButton',
                'playbackRates': [0.5, 1, 1.5, 2, 2.5]
            },
            {
                name: 'volumePanel', // 音量控制
                inline: false, // 不使用水平方式
            },
            {name: 'FullscreenToggle'} // 全屏
        ]
    },
    sources:[ // 视频源
        {
            src: "//vjs.zencdn.net/v/oceans.mp4",
            type: 'video/mp4',
            poster: '//vjs.zencdn.net/v/oceans.png'
        }
    ]
}, function (){
    console.log('视频可以播放了',this);
});




var operate_div = document.getElementById("ChooseEpisodes");

setButton();

function setButton() {
    for (var i = 0; i < Episodes; i++) {
        var input_ly = document.createElement("input");
        input_ly.type = "button";
        input_ly.setAttribute("class","button");
        input_ly.setAttribute("left","12px");
        input_ly.setAttribute("font-size","13px");
        input_ly.setAttribute("height","22px");
        input_ly.setAttribute("value","第"+(i++)+"集");
        input_ly.onclick=function () {        //绑定点击事件
            location.href="video/"+VideoPath+"/"+VideoId;
        };
        operate_div.appendChild(input_ly);
    }
    input_ly=null;
}



