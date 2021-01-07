package com.spotify.music.nowplaying.core.navcontext;

import android.content.res.Resources;

public class f {
    private final String a;
    private final String b;
    private final ksb c;
    private final ksb d;

    public f(ksb ksb, ksb ksb2, String str, String str2) {
        this.c = ksb;
        this.d = ksb2;
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c(Resources resources) {
        return this.d.a(resources);
    }

    public String d(Resources resources) {
        return this.c.a(resources);
    }

    public boolean e() {
        return !this.b.isEmpty();
    }
}
