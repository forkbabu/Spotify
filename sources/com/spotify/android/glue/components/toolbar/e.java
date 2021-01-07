package com.spotify.android.glue.components.toolbar;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class e implements c {
    private final GlueToolbarLayout a;
    private final TextView b;
    private Drawable c;
    private int f;

    public e(GlueToolbarLayout glueToolbarLayout) {
        this.a = glueToolbarLayout;
        this.b = glueToolbarLayout.getTextView();
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void F0(boolean z) {
        GlueToolbarLayout glueToolbarLayout = this.a;
        Drawable drawable = z ? null : this.c;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        glueToolbarLayout.setBackground(drawable);
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void G(ToolbarSide toolbarSide) {
        this.a.c(toolbarSide);
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void H1(ToolbarSide toolbarSide, View view, int i) {
        this.a.b(toolbarSide, view, i);
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void K1(MenuItem menuItem) {
        this.a.a(menuItem);
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void S1(float f2) {
        int i = (int) (f2 * 255.0f);
        this.f = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void b0(ToolbarSide toolbarSide, float f2) {
        for (View view : this.a.d(toolbarSide)) {
            view.setAlpha(f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
        }
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void o(float f2) {
        this.b.setAlpha(f2);
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.c = colorDrawable;
        GlueToolbarLayout glueToolbarLayout = this.a;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        glueToolbarLayout.setBackground(colorDrawable);
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // com.spotify.android.glue.components.toolbar.c
    public void u(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            drawable.setAlpha(this.f);
        }
        GlueToolbarLayout glueToolbarLayout = this.a;
        Drawable drawable2 = this.c;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        glueToolbarLayout.setBackground(drawable2);
    }
}
