package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class x0 implements Parcelable.Creator<MediaError> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final MediaError createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 3) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (i == 4) {
                num = SafeParcelReader.w(parcel, readInt);
            } else if (i == 5) {
                str2 = SafeParcelReader.g(parcel, readInt);
            } else if (i != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str3 = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new MediaError(str, j, num, str2, str3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaError[] newArray(int i) {
        return new MediaError[i];
    }
}
