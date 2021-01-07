package com.spotify.music.features.eventshub.artistconcerts;

import com.spotify.ubi.specification.factories.h0;

public class d {
    private final jz1 a;
    private final ere b;
    private final h0 c;
    private final cqe d;

    d(jz1 jz1, ere ere, h0 h0Var, cqe cqe) {
        this.a = jz1;
        this.b = ere;
        this.c = h0Var;
        this.d = cqe;
    }

    public void a(String str) {
        this.b.a(this.c.b().a(str));
    }

    @Deprecated
    public void b(String str, ifd ifd) {
        this.a.a(new da1(str, ifd.getName(), null, null, -1, null, "page", null, (double) this.d.d()));
    }

    @Deprecated
    public void c(String str, ifd ifd, String str2, int i, String str3) {
        this.a.a(new fa1(str, ifd.getName(), null, str2, (long) i, str3, "hit", null, (double) this.d.d()));
    }

    public void d(String str, int i, String str2) {
        this.b.a(this.c.c().b(Integer.valueOf(i), str).a(str2));
    }

    public void e(String str, int i, String str2) {
        this.b.a(this.c.d().b(Integer.valueOf(i), str).a(str2));
    }
}
