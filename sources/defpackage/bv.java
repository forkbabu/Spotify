package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bv  reason: default package */
public final class bv implements Parcelable.Creator<zu> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final zu createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i3 == 2) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i3 != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                intent = (Intent) SafeParcelReader.f(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new zu(i, i2, intent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zu[] newArray(int i) {
        return new zu[i];
    }
}
