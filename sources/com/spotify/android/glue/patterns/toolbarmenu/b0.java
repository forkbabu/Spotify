package com.spotify.android.glue.patterns.toolbarmenu;

import android.graphics.drawable.Drawable;
import android.view.View;

public interface b0 {
    b0 a(Runnable runnable);

    View getActionView();

    b0 setActionView(View view);

    b0 setIcon(int i);

    b0 setIcon(Drawable drawable);
}
