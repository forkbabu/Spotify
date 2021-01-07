package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: lw  reason: default package */
public final class lw extends a {
    public static final Parcelable.Creator<lw> CREATOR = new mw();
    private byte a;
    private final byte b;
    private final String c;

    public lw(byte b2, byte b3, String str) {
        this.a = b2;
        this.b = b3;
        this.c = str;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lw.class != obj.getClass()) {
            return false;
        }
        lw lwVar = (lw) obj;
        return this.a == lwVar.a && this.b == lwVar.b && this.c.equals(lwVar.c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    @Override // java.lang.Object
    public final String toString() {
        byte b2 = this.a;
        byte b3 = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append((int) b2);
        sb.append(", mAttributeId=");
        sb.append((int) b3);
        sb.append(", mValue='");
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.F(parcel, 2, this.a);
        SafeParcelReader.F(parcel, 3, this.b);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.m(parcel, a2);
    }
}
