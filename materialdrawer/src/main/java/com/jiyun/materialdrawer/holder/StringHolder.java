package com.jiyun.materialdrawer.holder;

import android.support.annotation.StringRes;

/**
 * Created by mikepenz on 13.07.15.
 */
public class StringHolder extends com.mikepenz.materialize.holder.StringHolder {
    public StringHolder(CharSequence text) {
        super(text);
    }

    public StringHolder(@StringRes int textRes) {
        super(textRes);
    }
}
