package com.sz.heart;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by sahaa_000 on 2018-08-20.
 */

public class TypeFactory {

    final String PRODUCT_SANS_REGULAR="fonts/product_sans_regular.ttf";
    final String RODUCT_SANS_BOLD="fonts/product_sans_bold.ttf";
    final String RODUCT_SANS_ITALIC="fonts/product_sans_italic.ttf";
    final String RODUCT_SANS_BOLD_ITALIC="fonts/product_sans_bold_italic.ttf";

    Typeface regular;
    Typeface bold;
    Typeface italic;
    Typeface bold_italic;

    public TypeFactory(Context context){
        regular = Typeface.createFromAsset(context.getAssets(),PRODUCT_SANS_REGULAR);
        bold = Typeface.createFromAsset(context.getAssets(),RODUCT_SANS_BOLD);
        italic = Typeface.createFromAsset(context.getAssets(),RODUCT_SANS_ITALIC);
        bold_italic = Typeface.createFromAsset(context.getAssets(),RODUCT_SANS_BOLD_ITALIC);
    }

    public Typeface getRegular(){
        return regular;
    }

    public Typeface getBold() {
        return bold;
    }

    public Typeface getItalic() {
        return italic;
    }

    public Typeface getBoldItalic() {
        return bold_italic;
    }
}
