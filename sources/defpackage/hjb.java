package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: hjb  reason: default package */
public final class hjb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final ijb u;

    /* renamed from: hjb$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new hjb(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (ijb) ijb.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new hjb[i];
        }
    }

    public hjb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ijb ijb) {
        h.e(str, "adId");
        h.e(str3, "coverImageUrl");
        h.e(str4, "title");
        h.e(str5, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str6, "primaryArtistUri");
        h.e(str10, "entityUri");
        h.e(str11, "lineItemId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = str9;
        this.s = str10;
        this.t = str11;
        this.u = ijb;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.s;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjb)) {
            return false;
        }
        hjb hjb = (hjb) obj;
        return h.a(this.a, hjb.a) && h.a(this.b, hjb.b) && h.a(this.c, hjb.c) && h.a(this.f, hjb.f) && h.a(this.n, hjb.n) && h.a(this.o, hjb.o) && h.a(this.p, hjb.p) && h.a(this.q, hjb.q) && h.a(this.r, hjb.r) && h.a(this.s, hjb.s) && h.a(this.t, hjb.t) && h.a(this.u, hjb.u);
    }

    public final String f() {
        return this.q;
    }

    public final String g() {
        return this.r;
    }

    public final String h() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.n;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.o;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.p;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.q;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.r;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.s;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.t;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        ijb ijb = this.u;
        if (ijb != null) {
            i = ijb.hashCode();
        }
        return hashCode11 + i;
    }

    public final String i() {
        return this.t;
    }

    public final ijb j() {
        return this.u;
    }

    public final String k() {
        return this.o;
    }

    public final String l() {
        return this.n;
    }

    public final String m() {
        return this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Marquee(adId=");
        V0.append(this.a);
        V0.append(", header=");
        V0.append(this.b);
        V0.append(", coverImageUrl=");
        V0.append(this.c);
        V0.append(", title=");
        V0.append(this.f);
        V0.append(", subtitle=");
        V0.append(this.n);
        V0.append(", primaryArtistUri=");
        V0.append(this.o);
        V0.append(", ctaText=");
        V0.append(this.p);
        V0.append(", footer=");
        V0.append(this.q);
        V0.append(", footerCta=");
        V0.append(this.r);
        V0.append(", entityUri=");
        V0.append(this.s);
        V0.append(", lineItemId=");
        V0.append(this.t);
        V0.append(", optOut=");
        V0.append(this.u);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        ijb ijb = this.u;
        if (ijb != null) {
            parcel.writeInt(1);
            ijb.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
