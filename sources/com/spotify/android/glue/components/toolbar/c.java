package com.spotify.android.glue.components.toolbar;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;

public interface c extends g90 {
    void F0(boolean z);

    void G(ToolbarSide toolbarSide);

    void H1(ToolbarSide toolbarSide, View view, int i);

    void K1(MenuItem menuItem);

    void S1(float f);

    void b0(ToolbarSide toolbarSide, float f);

    void o(float f);

    void setBackgroundColor(int i);

    void setTitle(CharSequence charSequence);

    void u(Drawable drawable);
}
