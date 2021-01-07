package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: kv  reason: default package */
public final class kv implements Parcelable.Creator<iv> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final iv createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        k0 k0Var = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 != 2) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                k0Var = (k0) SafeParcelReader.f(parcel, readInt, k0.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new iv(i, k0Var);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ iv[] newArray(int i) {
        return new iv[i];
    }
}
