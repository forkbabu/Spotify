package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: iv  reason: default package */
public final class iv extends a {
    public static final Parcelable.Creator<iv> CREATOR = new kv();
    private final int a;
    private final k0 b;

    iv(int i, k0 k0Var) {
        this.a = i;
        this.b = k0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.S(parcel, 2, this.b, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    public iv(k0 k0Var) {
        this.a = 1;
        this.b = k0Var;
    }
}
