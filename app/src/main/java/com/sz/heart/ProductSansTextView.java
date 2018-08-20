package com.sz.heart;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by sahaa_000 on 2018-08-20.
 */

public class ProductSansTextView extends TextView {

    private int typefaceType;

    public ProductSansTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.ProductSansTextView,
                0, 0);
        try {
            typefaceType = array.getInteger(R.styleable.ProductSansTextView_product_sans,0);
        }finally {
            array.recycle();
        }
        if(!isInEditMode()){
            setTypeface(MainApplication.getApp().getTypeFace(typefaceType));
        }
    }
}
