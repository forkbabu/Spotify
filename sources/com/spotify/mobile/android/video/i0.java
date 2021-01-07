package com.spotify.mobile.android.video;

public class i0 {
    private final String a;
    private final boolean b;

    public i0(String str) {
        String[] split = str.split("-x-");
        if (split.length == 1) {
            this.a = str;
            this.b = false;
            return;
        }
        this.a = split[0];
        this.b = "cc".equals(split[1]);
    }

    public String a() {
        String str = this.a;
        return (str == null || str.length() < 2) ? "" : this.a.substring(0, 2);
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(this.b ? "-x-cc" : "");
        return sb.toString();
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.b != i0Var.b) {
            return false;
        }
        String str = this.a;
        String str2 = i0Var.a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Subtitle{mLocale='");
        je.A(V0, this.a, '\'', ", mIsClosedCaption=");
        return je.O0(V0, this.b, '}');
    }
}
