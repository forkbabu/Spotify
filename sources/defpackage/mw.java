package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: mw  reason: default package */
public final class mw implements Parcelable.Creator<lw> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final lw createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                b = SafeParcelReader.p(parcel, readInt);
            } else if (i == 3) {
                b2 = SafeParcelReader.p(parcel, readInt);
            } else if (i != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new lw(b, b2, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lw[] newArray(int i) {
        return new lw[i];
    }
}
