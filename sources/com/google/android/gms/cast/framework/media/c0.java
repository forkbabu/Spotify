package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.cast.t;

public final class c0 extends t implements v {
    c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // com.google.android.gms.cast.framework.media.v
    public final a Q1() {
        Parcel a0 = a0(2, T());
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }
}
