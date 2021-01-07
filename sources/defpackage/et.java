package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: et  reason: default package */
public final class et implements Parcelable.Creator<ft> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final ft createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                credential = (Credential) SafeParcelReader.f(parcel, readInt, Credential.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new ft(credential);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ft[] newArray(int i) {
        return new ft[i];
    }
}
