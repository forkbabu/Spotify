package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: lt  reason: default package */
public final class lt extends a {
    public static final Parcelable.Creator<lt> CREATOR = new kt();
    private final Credential a;

    public lt(Credential credential) {
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 1, this.a, i, false);
        SafeParcelReader.m(parcel, a2);
    }
}
