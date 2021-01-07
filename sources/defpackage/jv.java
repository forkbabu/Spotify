package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: jv  reason: default package */
public final class jv extends a {
    public static final Parcelable.Creator<jv> CREATOR = new lv();
    private final int a;
    private final ConnectionResult b;
    private final l0 c;

    jv(int i, ConnectionResult connectionResult, l0 l0Var) {
        this.a = i;
        this.b = connectionResult;
        this.c = l0Var;
    }

    public final ConnectionResult I1() {
        return this.b;
    }

    public final l0 Q1() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.S(parcel, 2, this.b, i, false);
        SafeParcelReader.S(parcel, 3, this.c, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    public jv() {
        ConnectionResult connectionResult = new ConnectionResult(8, null);
        this.a = 1;
        this.b = connectionResult;
        this.c = null;
    }
}
