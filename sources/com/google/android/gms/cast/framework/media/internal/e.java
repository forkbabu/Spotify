package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;

public interface e extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.cast.a implements e {
        public static e D3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof e) {
                return (e) queryLocalInterface;
            }
            return new g(iBinder);
        }
    }

    Bitmap C1(Uri uri);
}
