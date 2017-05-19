package com.wxandroid.common.injector.module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.wxandroid.common.injector.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;
/**
 * Created by wenxin
 */
@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @FragmentScope
    public Activity provideActivity() {
        return fragment.getActivity();
    }

}
