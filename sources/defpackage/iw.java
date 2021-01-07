package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: iw  reason: default package */
public final class iw extends a {
    public static final Parcelable.Creator<iw> CREATOR = new jw();
    private final String a;
    private final String b;
    private final int c;
    private final boolean f;

    public iw(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = z;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof iw)) {
            return false;
        }
        return ((iw) obj).a.equals(this.a);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        int i = this.c;
        boolean z = this.f;
        StringBuilder U0 = je.U0(je.N0(str2, je.N0(str, 45)), "Node{", str, ", id=", str2);
        U0.append(", hops=");
        U0.append(i);
        U0.append(", isNearby=");
        U0.append(z);
        U0.append("}");
        return U0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.C(parcel, 5, this.f);
        SafeParcelReader.m(parcel, a2);
    }
}
