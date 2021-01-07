package com.google.android.gms.internal.wearable;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

public class a extends Binder implements IInterface {
    protected a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        fw fwVar = (fw) this;
        switch (i) {
            case 1:
                fwVar.V((DataHolder) b.a(parcel, DataHolder.CREATOR));
                break;
            case 2:
                fwVar.K2((gw) b.a(parcel, gw.CREATOR));
                break;
            case 3:
                fwVar.i0((iw) b.a(parcel, iw.CREATOR));
                break;
            case 4:
                fwVar.a3((iw) b.a(parcel, iw.CREATOR));
                break;
            case 5:
                fwVar.B3(parcel.createTypedArrayList(iw.CREATOR));
                break;
            case 6:
                fwVar.u1((nw) b.a(parcel, nw.CREATOR));
                break;
            case 7:
                fwVar.L1((xv) b.a(parcel, xv.CREATOR));
                break;
            case 8:
                fwVar.t2((tv) b.a(parcel, tv.CREATOR));
                break;
            case 9:
                fwVar.y0((lw) b.a(parcel, lw.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
