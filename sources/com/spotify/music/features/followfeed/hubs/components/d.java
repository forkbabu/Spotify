package com.spotify.music.features.followfeed.hubs.components;

import com.spotify.music.features.followfeed.hubs.components.c;
import defpackage.o25;
import kotlin.jvm.internal.h;

public final class d implements c.a {
    final /* synthetic */ c a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;

    d(c cVar, String str, int i, String str2) {
        this.a = cVar;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // com.spotify.music.features.followfeed.hubs.components.c.a
    public void a(String str, String str2, int i) {
        h.e(str, "trackUri");
        h.e(str2, "trackName");
        this.a.b.a(new o25.v(this.c, this.d, i, str, str2));
    }

    @Override // com.spotify.music.features.followfeed.hubs.components.c.a
    public void b(String str, int i) {
        h.e(str, "trackUri");
        this.a.b.a(new o25.u(this.b, this.c, this.d, str, i));
    }

    @Override // com.spotify.music.features.followfeed.hubs.components.c.a
    public void c(String str, String str2, int i) {
        h.e(str, "trackUri");
        h.e(str2, "trackName");
        this.a.b.a(new o25.w(this.c, this.d, i, str, str2));
    }
}
