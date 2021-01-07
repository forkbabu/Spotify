package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class l1 implements Parcelable.Creator<p> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final p createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    f = SafeParcelReader.s(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 8:
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 9:
                    i7 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 10:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 11:
                    i8 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 12:
                    i9 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 13:
                    str2 = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new p(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p[] newArray(int i) {
        return new p[i];
    }
}
