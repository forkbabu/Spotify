package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class f4 {
    public String a;
    private String b;
    private long c;
    public Bundle d;

    private f4(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static f4 b(r rVar) {
        return new f4(rVar.a, rVar.c, rVar.b.p2(), rVar.f);
    }

    public final r a() {
        return new r(this.a, new m(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.d);
        return je.I0(je.U0(valueOf.length() + je.N0(str2, je.N0(str, 21)), "origin=", str, ",name=", str2), ",params=", valueOf);
    }
}
