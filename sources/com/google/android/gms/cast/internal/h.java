package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.d;
import com.google.android.gms.internal.cast.a;
import com.google.android.gms.internal.cast.n0;

public abstract class h extends a implements i {
    public h() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case 1:
                r(parcel.readInt());
                break;
            case 2:
                d dVar = (d) n0.a(parcel, d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C(dVar, readString, readString2, z);
                break;
            case 3:
                z(parcel.readInt());
                break;
            case 4:
                String readString3 = parcel.readString();
                double readDouble = parcel.readDouble();
                int i3 = n0.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                M(readString3, readDouble, z);
                break;
            case 5:
                h3(parcel.readString(), parcel.readString());
                break;
            case 6:
                T0(parcel.readString(), parcel.createByteArray());
                break;
            case 7:
                e1(parcel.readInt());
                break;
            case 8:
                S0(parcel.readInt());
                break;
            case 9:
                G1(parcel.readInt());
                break;
            case 10:
                v2(parcel.readString(), parcel.readLong(), parcel.readInt());
                break;
            case 11:
                H1(parcel.readString(), parcel.readLong());
                break;
            case 12:
                P((c) n0.a(parcel, c.CREATOR));
                break;
            case 13:
                l3((m0) n0.a(parcel, m0.CREATOR));
                break;
            case 14:
                f0(parcel.readInt());
                break;
            case 15:
                E1(parcel.readInt());
                break;
            default:
                return false;
        }
        return true;
    }
}
