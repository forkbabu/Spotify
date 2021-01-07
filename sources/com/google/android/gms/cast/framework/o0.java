package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.cast.a;
import com.google.android.gms.internal.cast.n0;

public abstract class o0 extends a implements m0 {
    public o0() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.a H3 = ((q) this).H3();
                parcel2.writeNoException();
                n0.b(parcel2, H3);
                break;
            case 2:
                ((q) this).D3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 3:
                ((q) this).F3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                ((q) this).E3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 5:
                ((q) this).I3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 6:
                ((q) this).J3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                ((q) this).K3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 8:
                com.google.android.gms.dynamic.a D3 = a.AbstractBinderC0099a.D3(parcel.readStrongBinder());
                int i3 = n0.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ((q) this).G3(D3, z);
                parcel2.writeNoException();
                break;
            case 9:
                ((q) this).L3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 10:
                ((q) this).M3(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            default:
                return false;
        }
        return true;
    }
}
