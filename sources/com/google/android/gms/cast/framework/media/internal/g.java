package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.t;

public final class g extends t implements e {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // com.google.android.gms.cast.framework.media.internal.e
    public final Bitmap C1(Uri uri) {
        Parcel T = T();
        n0.c(T, uri);
        Parcel a0 = a0(1, T);
        Bitmap bitmap = (Bitmap) n0.a(a0, Bitmap.CREATOR);
        a0.recycle();
        return bitmap;
    }
}
