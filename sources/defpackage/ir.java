package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ir  reason: default package */
public final class ir implements Parcelable.Creator<hr> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final hr createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 2) {
                uri = (Uri) SafeParcelReader.f(parcel, readInt, Uri.CREATOR);
            } else if (i4 == 3) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i4 != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i3 = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new hr(i, uri, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hr[] newArray(int i) {
        return new hr[i];
    }
}
