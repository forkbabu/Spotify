package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.wearable.c;

/* renamed from: zv  reason: default package */
public final class zv extends a implements com.google.android.gms.wearable.a, c.a {
    public static final Parcelable.Creator<zv> CREATOR = new aw();
    private final String a;
    private final String b;
    private final String c;

    public zv(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("null reference");
            }
            throw new NullPointerException("null reference");
        }
        throw new NullPointerException("null reference");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zv)) {
            return false;
        }
        zv zvVar = (zv) obj;
        return this.a.equals(zvVar.a) && m.a(zvVar.b, this.b) && m.a(zvVar.c, this.c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        int i = 0;
        for (char c2 : this.a.toCharArray()) {
            i += c2;
        }
        String trim = this.a.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder U0 = je.U0(je.N0(substring2, je.N0(substring, 16)), substring, "...", substring2, "::");
            U0.append(i);
            trim = U0.toString();
        }
        String str = this.b;
        String str2 = this.c;
        return je.J0(je.U0(je.N0(str2, je.N0(str, je.N0(trim, 31))), "Channel{token=", trim, ", nodeId=", str), ", path=", str2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.m(parcel, a2);
    }
}
