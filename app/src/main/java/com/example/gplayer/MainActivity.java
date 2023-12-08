package com.example.gplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tencent.liteav.demo.superplayer.SuperPlayerModel;
import com.tencent.liteav.demo.superplayer.SuperPlayerView;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLiveBaseListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SuperPlayerView mSuperPlayerView=findViewById(R.id.superPlayerView);

        String licenceURL = "https://license.vod2.myqcloud.com/license/v2/1251521527_1/v_cube.license"; // 获取到的 licence url
        String licenceKey = "cac7be17625b9722becca585e3c8ec3f"; // 获取到的 licence key
        TXLiveBase.getInstance().setLicence(this, licenceURL, licenceKey);
        TXLiveBase.setListener(new TXLiveBaseListener() {
            @Override
            public void onLicenceLoaded(int result, String reason) {


            }
        });



        SuperPlayerModel model = new SuperPlayerModel();
        model.appId = 1251245530; // 配置 AppId
        model.url = "http://1251245530.vod2.myqcloud.com/5d4e8085vodsh1251245530/58fc7db73270835012316147760/1FzoHvB3pskA.mp4";   // 配置您的播放视频 url
        mSuperPlayerView.playWithModelNeedLicence(model);



    }
}