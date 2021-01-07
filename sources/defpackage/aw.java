package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: aw  reason: default package */
public final class aw implements Parcelable.Creator<zv> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final zv createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 3) {
                str2 = SafeParcelReader.g(parcel, readInt);
            } else if (i != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str3 = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new zv(str, str2, str3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zv[] newArray(int i) {
        return new zv[i];
    }
}
