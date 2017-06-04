package com.yoyiyi.soleil.di.component;

import android.app.Activity;

import com.yoyiyi.soleil.di.module.ActivityModule;
import com.yoyiyi.soleil.di.scope.ActivityScope;
import com.yoyiyi.soleil.module.app.SplashActivity;
import com.yoyiyi.soleil.module.region.RegionTypeActivity;
import com.yoyiyi.soleil.module.search.TotalSearchActivity;

import dagger.Component;

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * @date 创建时间：2017/4/27 19:39
 * 描述:ActivityComponent
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(SplashActivity splashActivity);

    void inject(TotalSearchActivity totalSearchActivity);

    //void inject(LiveRegionActivity liveRegionActivity);

    void inject(RegionTypeActivity regionTypeActivity);



}
