package com.spotify.music.features.yourepisodes;

import com.spotify.ubi.specification.factories.n4;
import kotlin.jvm.internal.h;

public final class b0 implements a0 {
    private final ere a;
    private final n4 b;

    public b0(ere ere, n4 n4Var) {
        h.e(ere, "ubi");
        h.e(n4Var, "eventFactory");
        this.a = ere;
        this.b = n4Var;
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void a() {
        this.a.a(this.b.c().b().b().b().a());
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void b() {
        this.a.a(this.b.b().a());
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void c() {
        this.a.a(this.b.d().a());
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void d() {
        this.a.a(this.b.c().b().b().c().a("spotify:collection:your-episodes"));
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void e() {
        this.a.a(this.b.c().b().b().e("spotify:collection:your-episodes"));
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void f() {
        this.a.a(this.b.c().b().b().f());
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void g() {
        this.a.a(this.b.c().b().b().d("spotify:collection:your-episodes"));
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void h() {
        this.a.a(this.b.c().b().c().a("spotify:collection:your-episodes"));
    }

    @Override // com.spotify.music.features.yourepisodes.a0
    public void i() {
        this.a.a(this.b.c().b().c().b("spotify:collection:your-episodes"));
    }
}
