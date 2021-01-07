package com.spotify.music.features.followfeed;

import com.spotify.music.follow.j;
import com.spotify.music.follow.l;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class a implements m, f {
    private final m a;
    private final f b;

    public a(m mVar, f fVar) {
        h.e(mVar, "followManager");
        h.e(fVar, "rxArtistFollowDataResolver");
        this.a = mVar;
        this.b = fVar;
    }

    @Override // com.spotify.music.follow.resolver.f
    public s<j> a(String str) {
        return this.b.a(str);
    }

    @Override // com.spotify.music.follow.m
    public boolean b(String str, l lVar) {
        return this.a.b(str, lVar);
    }

    @Override // com.spotify.music.follow.m
    public j c(String str) {
        return this.a.c(str);
    }

    @Override // com.spotify.music.follow.m
    public boolean d(String str, l lVar) {
        return this.a.d(str, lVar);
    }

    @Override // com.spotify.music.follow.m
    public void e(String str, boolean z) {
        this.a.e(str, z);
    }

    @Override // com.spotify.music.follow.m
    public void f(String str, boolean z) {
        this.a.f(str, z);
    }

    @Override // com.spotify.music.follow.m
    public void g(j jVar) {
        this.a.g(jVar);
    }
}
