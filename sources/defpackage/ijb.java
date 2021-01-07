package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

/* renamed from: ijb  reason: default package */
public final class ijb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;

    /* renamed from: ijb$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new ijb(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ijb[i];
        }
    }

    public ijb(String str, String str2, String str3, String str4, String str5) {
        h.e(str, "text");
        h.e(str2, "textCta");
        h.e(str3, "artistUri");
        h.e(str4, "artistCta");
        h.e(str5, "marqueeCta");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijb)) {
            return false;
        }
        ijb ijb = (ijb) obj;
        return h.a(this.a, ijb.a) && h.a(this.b, ijb.b) && h.a(this.c, ijb.c) && h.a(this.f, ijb.f) && h.a(this.n, ijb.n);
    }

    public final String f() {
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
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OptOut(text=");
        V0.append(this.a);
        V0.append(", textCta=");
        V0.append(this.b);
        V0.append(", artistUri=");
        V0.append(this.c);
        V0.append(", artistCta=");
        V0.append(this.f);
        V0.append(", marqueeCta=");
        return je.I0(V0, this.n, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
    }
}
