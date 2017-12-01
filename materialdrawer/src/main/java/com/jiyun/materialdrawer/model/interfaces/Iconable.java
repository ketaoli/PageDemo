package com.jiyun.materialdrawer.model.interfaces;

import android.graphics.drawable.Drawable;

import com.jiyun.materialdrawer.holder.ImageHolder;


/**
 * Created by mikepenz on 03.02.15.
 */
public interface Iconable<T> {
    T withIcon(Drawable icon);

    T withIcon(IIcon iicon);

    T withIcon(ImageHolder icon);

    ImageHolder getIcon();
}
