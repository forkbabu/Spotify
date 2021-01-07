package com.spotify.paste.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public final class a implements pud {
    final /* synthetic */ float a;

    a(float f) {
        this.a = f;
    }

    @Override // defpackage.pud
    public Drawable createDrawable(Bitmap bitmap) {
        return new b(bitmap, this.a);
    }
}
