package com.sz.heart;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by sahaa_000 on 2018-08-20.
 */

public class MainApplication extends Application {


    private static MainApplication mInstance;
    private TypeFactory mFontFactory;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized MainApplication getApp(){
        return mInstance;
    }

    public Typeface getTypeFace(int type){
        if(mFontFactory==null)
            mFontFactory = new TypeFactory(this);

        switch (type){
            case Constants.REGULAR : return mFontFactory.getRegular();

            case Constants.BOLD: return mFontFactory.getBold();

            case Constants.ITALIC: return mFontFactory.getItalic();

            case Constants.BOLD_ITALIC: return mFontFactory.getBoldItalic();

            default: return mFontFactory.getRegular();
        }
    }

    public interface Constants {
        int REGULAR = 1,
                BOLD = 2,
                ITALIC = 3,
                BOLD_ITALIC=4;
    }

}
