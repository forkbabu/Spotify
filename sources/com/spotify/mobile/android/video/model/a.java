package com.spotify.mobile.android.video.model;

public class a {
    private final String a;
    private final int b;
    private final String c;
    private final String d;

    public a(String str, int i, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = str3;
        this.d = str2;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b != aVar.b) {
            return false;
        }
        String str = this.a;
        if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? aVar.c != null : !str2.equals(aVar.c)) {
            return false;
        }
        String str3 = this.d;
        return str3 == null ? aVar.d == null : str3.equals(aVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VideoMetadata{mUrl='");
        je.A(V0, this.a, '\'', ", mBitrate=");
        V0.append(this.b);
        V0.append(", mMimeType='");
        je.A(V0, this.c, '\'', ", mEncryption='");
        V0.append(this.d);
        V0.append('\'');
        V0.append('}');
        return V0.toString();
    }
}
