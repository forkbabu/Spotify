package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: jw  reason: default package */
public final class jw implements Parcelable.Creator<iw> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final iw createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i2 == 3) {
                str2 = SafeParcelReader.g(parcel, readInt);
            } else if (i2 == 4) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z = SafeParcelReader.n(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new iw(str, str2, i, z);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ iw[] newArray(int i) {
        return new iw[i];
    }
}
