package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.cast.framework.h;
import com.google.android.gms.internal.cast.a;
import com.google.android.gms.internal.cast.n0;

public abstract class o extends a implements m {
    public o() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.a J3 = ((h.a) this).J3();
                parcel2.writeNoException();
                n0.b(parcel2, J3);
                break;
            case 2:
                ((h.a) this).I3((Bundle) n0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                ((h.a) this).H3((Bundle) n0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                int i3 = n0.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ((h.a) this).D3(z);
                parcel2.writeNoException();
                break;
            case 5:
                long E3 = ((h.a) this).E3();
                parcel2.writeNoException();
                parcel2.writeLong(E3);
                break;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            case 7:
                ((h.a) this).G3((Bundle) n0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                ((h.a) this).F3((Bundle) n0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
