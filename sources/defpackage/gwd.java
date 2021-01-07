package defpackage;

import android.graphics.Bitmap;
import com.squareup.picasso.h0;

/* renamed from: gwd  reason: default package */
public final class gwd implements h0 {
    private static final gwd a = new gwd();

    private gwd() {
    }

    public static gwd c() {
        return a;
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return "IdentityTransformation";
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        return bitmap;
    }
}
