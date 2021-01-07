package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class o0 implements Parcelable.Creator<g> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final g createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    arrayList = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    iArr = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 6:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 8:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 9:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 10:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 11:
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 12:
                    i7 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 13:
                    i8 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 14:
                    i9 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 15:
                    i10 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 16:
                    i11 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 17:
                    i12 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 18:
                    i13 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 19:
                    i14 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 20:
                    i15 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 21:
                    i16 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 22:
                    i17 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 23:
                    i18 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 24:
                    i19 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 25:
                    i20 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 26:
                    i21 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 27:
                    i22 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 28:
                    i23 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 29:
                    i24 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 30:
                    i25 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 31:
                    i26 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 32:
                    i27 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 33:
                    iBinder = SafeParcelReader.u(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new g(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i) {
        return new g[i];
    }
}
