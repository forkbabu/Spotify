package com.google.android.gms.cast.framework.media;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.j;
import com.google.android.gms.internal.cast.n0;

public interface v extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.cast.a implements v {
        public a() {
            super("com.google.android.gms.cast.framework.media.IImagePicker");
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.cast.a
        public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                hr D3 = ((c.a) this).D3((j) n0.a(parcel, j.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                n0.d(parcel2, D3);
            } else if (i == 2) {
                com.google.android.gms.dynamic.a Q1 = ((c.a) this).Q1();
                parcel2.writeNoException();
                n0.b(parcel2, Q1);
            } else if (i == 3) {
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
            } else if (i != 4) {
                return false;
            } else {
                hr E3 = ((c.a) this).E3((j) n0.a(parcel, j.CREATOR), (b) n0.a(parcel, b.CREATOR));
                parcel2.writeNoException();
                n0.d(parcel2, E3);
            }
            return true;
        }
    }

    com.google.android.gms.dynamic.a Q1();
}
