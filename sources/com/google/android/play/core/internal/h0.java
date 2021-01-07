package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class h0 extends c0 implements i0 {
    public h0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.c0
    public final boolean C3(int i, Parcel parcel) {
        switch (i) {
            case 2:
                e3(parcel.readInt(), (Bundle) d0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) d0.a(parcel, Bundle.CREATOR);
                D(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) d0.a(parcel, Bundle.CREATOR);
                R2(readInt2);
                return true;
            case 5:
                A(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) d0.a(parcel, creator);
                u((Bundle) d0.a(parcel, creator));
                return true;
            case 7:
                j((Bundle) d0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) d0.a(parcel, creator2);
                p0((Bundle) d0.a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) d0.a(parcel, creator3);
                f3((Bundle) d0.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                t((Bundle) d0.a(parcel, creator4), (Bundle) d0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                F0((Bundle) d0.a(parcel, creator5), (Bundle) d0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                T2((Bundle) d0.a(parcel, creator6), (Bundle) d0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) d0.a(parcel, creator7);
                Bundle bundle7 = (Bundle) d0.a(parcel, creator7);
                g2();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) d0.a(parcel, Bundle.CREATOR);
                e();
                return true;
        }
    }
}
