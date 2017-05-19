package com.quaner.wxnews.common;

import com.quaner.wxnews.Application;
import com.wxandroid.common.base.BasePresenterImpl;
import com.wxandroid.common.base.LoadingBaseActivity;

/**
 * Created by wenxin
 * contact with yangwenxin711@gmail.com
 */
public abstract class WXLoadingActivity<P extends BasePresenterImpl> extends LoadingBaseActivity<P> {


    protected Application mApplication;

    @Override
    protected void initInject() {
        mApplication = (Application) getApplication();
        setupActivityComponent(mApplication.getAppComponent());
    }


    //提供AppComponent(提供所有的单例对象)给子类，进行Component依赖
    protected abstract void setupActivityComponent(AppComponent appComponent);


}
