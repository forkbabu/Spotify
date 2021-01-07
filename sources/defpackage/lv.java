package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: lv  reason: default package */
public final class lv implements Parcelable.Creator<jv> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final jv createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ConnectionResult connectionResult = null;
        l0 l0Var = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.f(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                l0Var = (l0) SafeParcelReader.f(parcel, readInt, l0.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new jv(i, connectionResult, l0Var);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jv[] newArray(int i) {
        return new jv[i];
    }
}
