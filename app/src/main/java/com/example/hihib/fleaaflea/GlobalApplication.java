package com.example.hihib.fleaaflea;

import android.app.Activity;
import android.app.Application;

import com.kakao.auth.IApplicationConfig;
import com.kakao.auth.KakaoAdapter;
import com.kakao.auth.KakaoSDK;

/**
 * Created by hihib on 2017-11-19.
 */

public class GlobalApplication extends Application {



    private static volatile GlobalApplication instance = null;

    private static volatile Activity currentActivity = null;



    @Override

    public void onCreate() {

        super.onCreate();

        instance = this;

        KakaoSDK.init(new KakaoApapter());

    }



    public static GlobalApplication getGlobalApplicationContext(){

        return instance;

    }



    public static void setCurrentActivity(Activity currentActivity){

        GlobalApplication.currentActivity = currentActivity;

    }



    public static Activity getCurrentActivity(){

        return currentActivity;

    }

}