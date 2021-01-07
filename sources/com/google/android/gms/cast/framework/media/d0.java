package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.t;
import java.util.ArrayList;
import java.util.List;

public final class d0 extends t implements b0 {
    d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // com.google.android.gms.cast.framework.media.b0
    public final int[] P0() {
        Parcel a0 = a0(4, T());
        int[] createIntArray = a0.createIntArray();
        a0.recycle();
        return createIntArray;
    }

    @Override // com.google.android.gms.cast.framework.media.b0
    public final List<e> X1() {
        Parcel a0 = a0(3, T());
        ArrayList createTypedArrayList = a0.createTypedArrayList(e.CREATOR);
        a0.recycle();
        return createTypedArrayList;
    }
}
