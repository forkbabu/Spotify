package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: kt  reason: default package */
public final class kt implements Parcelable.Creator<lt> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final lt createFromParcel(Parcel parcel) {
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
        return new lt(credential);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lt[] newArray(int i) {
        return new lt[i];
    }
}
