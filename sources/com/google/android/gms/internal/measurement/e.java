package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class e extends a implements c {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void V2(String str, String str2, Bundle bundle, long j) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        v.c(T, bundle);
        T.writeLong(j);
        C0(1, T);
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int a() {
        Parcel a0 = a0(2, T());
        int readInt = a0.readInt();
        a0.recycle();
        return readInt;
    }
}
