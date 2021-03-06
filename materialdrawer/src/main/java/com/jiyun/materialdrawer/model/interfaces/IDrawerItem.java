package com.jiyun.materialdrawer.model.interfaces;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;


import java.util.List;

/**
 * Created by mikepenz on 03.02.15.
 */
public interface IDrawerItem<T, VH extends RecyclerView.ViewHolder> extends IItem<T, VH>, IExpandable<T, IDrawerItem>, ISubItem<IDrawerItem, IDrawerItem> {

    Object getTag();

    boolean isEnabled();

    boolean isSelected();

    T withSetSelected(boolean selected);

    boolean isSelectable();

    T withSelectable(boolean selectable);

    int getType();

    int getLayoutRes();

    View generateView(Context ctx);

    View generateView(Context ctx, ViewGroup parent);

    VH getViewHolder(ViewGroup parent);

    void unbindView(VH holder);

    void bindView(VH holder, List<Object> payloads);

    boolean equals(long id);
}
