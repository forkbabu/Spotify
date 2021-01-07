package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* access modifiers changed from: package-private */
public final class g0 extends c<f0> {
    g0(Picasso picasso, f0 f0Var, y yVar, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, f0Var, yVar, i, i2, i3, drawable, str, obj, false);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.c
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        f0 f0Var = (f0) d();
        if (f0Var != null) {
            f0Var.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.c
    public void c(Exception exc) {
        f0 f0Var = (f0) d();
        if (f0Var == null) {
            return;
        }
        if (this.g != 0) {
            f0Var.onBitmapFailed(exc, this.a.e.getResources().getDrawable(this.g));
        } else {
            f0Var.onBitmapFailed(exc, this.h);
        }
    }
}
