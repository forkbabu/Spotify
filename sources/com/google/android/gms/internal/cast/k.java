package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class k extends a implements l {
    public k() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        n nVar;
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) n0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    nVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof n) {
                        nVar = (n) queryLocalInterface;
                    } else {
                        nVar = new m(readStrongBinder);
                    }
                }
                ((o) this).F3(bundle, nVar);
                parcel2.writeNoException();
                return true;
            case 2:
                ((o) this).E3((Bundle) n0.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                ((o) this).P3((Bundle) n0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean K3 = ((o) this).K3((Bundle) n0.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(K3 ? 1 : 0);
                return true;
            case 5:
                ((o) this).Q3(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                ((o) this).L3();
                parcel2.writeNoException();
                return true;
            case 7:
                boolean M3 = ((o) this).M3();
                parcel2.writeNoException();
                int i3 = n0.a;
                parcel2.writeInt(M3 ? 1 : 0);
                return true;
            case 8:
                Bundle R3 = ((o) this).R3(parcel.readString());
                parcel2.writeNoException();
                n0.d(parcel2, R3);
                return true;
            case 9:
                String N3 = ((o) this).N3();
                parcel2.writeNoException();
                parcel2.writeString(N3);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            case 11:
                ((o) this).O3();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
