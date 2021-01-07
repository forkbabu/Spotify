package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: yv  reason: default package */
public final class yv implements Parcelable.Creator<xv> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final xv createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        zv zvVar = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 2) {
                zvVar = (zv) SafeParcelReader.f(parcel, readInt, zv.CREATOR);
            } else if (i4 == 3) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 4) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i4 != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i3 = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new xv(zvVar, i, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ xv[] newArray(int i) {
        return new xv[i];
    }
}
