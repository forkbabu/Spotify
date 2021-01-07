package com.spotify.music.playlist.permissions;

import com.spotify.ubi.specification.factories.n2;
import kotlin.jvm.internal.h;

public final class t implements s {
    private final n2.b a;
    private final ere b;

    public t(ere ere, n2 n2Var) {
        h.e(ere, "eventLogger");
        h.e(n2Var, "eventFactory");
        this.b = ere;
        this.a = n2Var.b();
    }

    @Override // com.spotify.music.playlist.permissions.s
    public void a() {
        this.b.a(this.a.d().d().a());
    }

    @Override // com.spotify.music.playlist.permissions.s
    public void b() {
        this.b.a(this.a.d().c().a());
    }

    @Override // com.spotify.music.playlist.permissions.s
    public void c() {
        this.b.a(this.a.c());
    }

    @Override // com.spotify.music.playlist.permissions.s
    public void d() {
        this.b.a(this.a.d().b().a());
    }

    @Override // com.spotify.music.playlist.permissions.s
    public void e() {
        this.b.a(this.a.b().a());
    }
}
