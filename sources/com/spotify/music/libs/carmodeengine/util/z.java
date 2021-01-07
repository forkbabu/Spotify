package com.spotify.music.libs.carmodeengine.util;

import com.spotify.remoteconfig.b8;
import com.spotify.remoteconfig.k5;
import com.spotify.remoteconfig.m5;
import com.spotify.remoteconfig.z7;
import io.reactivex.s;

public class z implements y {
    private final boolean a;
    private final wlf<z7> b;
    private final wlf<m5> c;
    private final wlf<b8> d;
    private final wlf<k5> e;
    private final s<Boolean> f;

    public z(boolean z, wlf<z7> wlf, wlf<m5> wlf2, wlf<b8> wlf3, wlf<k5> wlf4, s<Boolean> sVar) {
        this.a = z;
        this.b = wlf;
        this.c = wlf2;
        this.d = wlf3;
        this.e = wlf4;
        this.f = sVar;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public boolean a(boolean z) {
        if (i()) {
            if (d().d().booleanValue() || e() || z || h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public boolean b() {
        return this.f.d().booleanValue();
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public s<Boolean> c() {
        return s.B(new d(this));
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public s<Boolean> d() {
        return this.f.j0(new e(this));
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public boolean e() {
        return i() && this.d.get().a();
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public boolean f() {
        return this.c.get().a() || h();
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public boolean g() {
        return this.e.get().a();
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public boolean h() {
        return i() && (g() || this.c.get().b());
    }

    @Override // com.spotify.music.libs.carmodeengine.util.y
    public boolean i() {
        return this.b.get().a() && !this.a;
    }

    public /* synthetic */ Boolean j(Boolean bool) {
        return Boolean.valueOf(i() && this.c.get().a() && bool.booleanValue());
    }
}
