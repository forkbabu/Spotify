package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.wearable.f;

/* renamed from: gw  reason: default package */
public final class gw extends a implements f {
    public static final Parcelable.Creator<gw> CREATOR = new hw();
    private final int a;
    private final String b;
    private final byte[] c;
    private final String f;

    public gw(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.f = str2;
    }

    public final byte[] I1() {
        return this.c;
    }

    @Override // java.lang.Object
    public final String toString() {
        int i = this.a;
        String str = this.b;
        byte[] bArr = this.c;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder(valueOf.length() + je.N0(str, 43));
        sb.append("MessageEventParcelable[");
        sb.append(i);
        sb.append(",");
        sb.append(str);
        return je.J0(sb, ", size=", valueOf, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 2, this.a);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.G(parcel, 4, this.c, false);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.m(parcel, a2);
    }
}
