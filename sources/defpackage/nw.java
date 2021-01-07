package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.AdvertisementType;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: nw  reason: default package */
public final class nw extends a {
    public static final Parcelable.Creator<nw> CREATOR = new ow();
    private int a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final String o;
    private final String p;
    private final byte q;
    private final byte r;
    private final byte s;
    private final byte t;
    private final String u;

    public nw(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b2, byte b3, byte b4, byte b5, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = b2;
        this.r = b3;
        this.s = b4;
        this.t = b5;
        this.u = str7;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nw.class == obj.getClass()) {
            nw nwVar = (nw) obj;
            if (this.a != nwVar.a || this.q != nwVar.q || this.r != nwVar.r || this.s != nwVar.s || this.t != nwVar.t || !this.b.equals(nwVar.b)) {
                return false;
            }
            String str = this.c;
            if (str == null ? nwVar.c != null : !str.equals(nwVar.c)) {
                return false;
            }
            if (!this.f.equals(nwVar.f) || !this.n.equals(nwVar.n) || !this.o.equals(nwVar.o)) {
                return false;
            }
            String str2 = this.p;
            if (str2 == null ? nwVar.p != null : !str2.equals(nwVar.p)) {
                return false;
            }
            String str3 = this.u;
            String str4 = nwVar.u;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int Y0 = je.Y0(this.b, (this.a + 31) * 31, 31);
        String str = this.c;
        int i = 0;
        int Y02 = je.Y0(this.o, je.Y0(this.n, je.Y0(this.f, (Y0 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31);
        String str2 = this.p;
        int hashCode = (((((((((Y02 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31;
        String str3 = this.u;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.f;
        String str4 = this.n;
        String str5 = this.o;
        String str6 = this.p;
        byte b2 = this.q;
        byte b3 = this.r;
        byte b4 = this.s;
        byte b5 = this.t;
        String str7 = this.u;
        StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + String.valueOf(str6).length() + String.valueOf(str5).length() + String.valueOf(str4).length() + String.valueOf(str3).length() + String.valueOf(str2).length() + String.valueOf(str).length() + AdvertisementType.ON_DEMAND_PRE_ROLL);
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append('\'');
        sb.append(", dateTime='");
        sb.append(str2);
        sb.append('\'');
        sb.append(", notificationText='");
        sb.append(str3);
        sb.append('\'');
        sb.append(", title='");
        sb.append(str4);
        sb.append('\'');
        sb.append(", subtitle='");
        sb.append(str5);
        sb.append('\'');
        sb.append(", displayName='");
        sb.append(str6);
        sb.append('\'');
        sb.append(", eventId=");
        sb.append((int) b2);
        sb.append(", eventFlags=");
        sb.append((int) b3);
        sb.append(", categoryId=");
        sb.append((int) b4);
        sb.append(", categoryCount=");
        sb.append((int) b5);
        sb.append(", packageName='");
        sb.append(str7);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 2, this.a);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.T(parcel, 6, this.n, false);
        SafeParcelReader.T(parcel, 7, this.o, false);
        String str = this.p;
        if (str == null) {
            str = this.b;
        }
        SafeParcelReader.T(parcel, 8, str, false);
        SafeParcelReader.F(parcel, 9, this.q);
        SafeParcelReader.F(parcel, 10, this.r);
        SafeParcelReader.F(parcel, 11, this.s);
        SafeParcelReader.F(parcel, 12, this.t);
        SafeParcelReader.T(parcel, 13, this.u, false);
        SafeParcelReader.m(parcel, a2);
    }
}
