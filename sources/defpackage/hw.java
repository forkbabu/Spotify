package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: hw  reason: default package */
public final class hw implements Parcelable.Creator<gw> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final gw createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 == 3) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i2 == 4) {
                bArr = SafeParcelReader.c(parcel, readInt);
            } else if (i2 != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str2 = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new gw(i, str, bArr, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gw[] newArray(int i) {
        return new gw[i];
    }
}
