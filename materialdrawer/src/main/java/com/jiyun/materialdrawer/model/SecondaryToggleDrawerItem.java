package com.jiyun.materialdrawer.model;

import android.content.Context;
import android.support.annotation.LayoutRes;

import com.jiyun.materialdrawer.R;
import com.jiyun.materialdrawer.holder.ColorHolder;


/**
 * Created by mikepenz on 03.02.15.
 */
public class SecondaryToggleDrawerItem extends AbstractToggleableDrawerItem<SecondaryToggleDrawerItem> {

    @Override
    public int getType() {
        return R.id.material_drawer_item_secondary_toggle;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_secondary_toggle;
    }

    /**
     * helper method to decide for the correct color
     * OVERWRITE to get the correct secondary color
     *
     * @param ctx
     * @return
     */
    @Override
    protected int getColor(Context ctx) {
        int color;
        if (this.isEnabled()) {
            color = ColorHolder.color(getTextColor(), ctx, R.attr.material_drawer_secondary_text, R.color.material_drawer_secondary_text);
        } else {
            color = ColorHolder.color(getDisabledTextColor(), ctx, R.attr.material_drawer_hint_text, R.color.material_drawer_hint_text);
        }
        return color;
    }
}
