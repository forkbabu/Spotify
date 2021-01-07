package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.internal.a;

final class c0 implements a {
    private final /* synthetic */ a0 a;

    c0(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.a
    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (a0.g(this.a) != null) {
                a0.g(this.a).setVisibility(4);
            }
            a0.h(this.a).setVisibility(0);
            a0.h(this.a).setImageBitmap(bitmap);
        }
    }
}
