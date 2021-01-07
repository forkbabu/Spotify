package com.spotify.music.carmodehome.shelf;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.jvm.internal.h;

final class i extends LayerDrawable {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Drawable[] drawableArr) {
        super(drawableArr);
        h.e(drawableArr, "layers");
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }
}
