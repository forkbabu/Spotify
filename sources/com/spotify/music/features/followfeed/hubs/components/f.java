package com.spotify.music.features.followfeed.hubs.components;

import com.spotify.music.features.followfeed.views.FollowRecsView;
import defpackage.o25;
import defpackage.s51;
import kotlin.jvm.internal.h;

public final class f implements FollowRecsView.c {
    final /* synthetic */ g a;
    final /* synthetic */ int b;
    final /* synthetic */ s51.b c;
    final /* synthetic */ s81 d;
    final /* synthetic */ FollowRecsView e;

    f(g gVar, int i, s51.b bVar, s81 s81, FollowRecsView followRecsView) {
        this.a = gVar;
        this.b = i;
        this.c = bVar;
        this.d = s81;
        this.e = followRecsView;
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void a(String str) {
        h.e(str, "artistUri");
        g gVar = this.a;
        s51.b bVar = this.c;
        s81 s81 = this.d;
        FollowRecsView followRecsView = this.e;
        gVar.getClass();
        bVar.b(s81, followRecsView.l());
        this.a.b.a(new o25.e(str));
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void b(String str, int i) {
        h.e(str, "artistUri");
        this.a.b.a(new o25.b(this.b, i, str));
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void c(String str) {
        h.e(str, "artistUri");
        g gVar = this.a;
        s51.b bVar = this.c;
        s81 s81 = this.d;
        FollowRecsView followRecsView = this.e;
        gVar.getClass();
        bVar.b(s81, followRecsView.l());
        this.a.b.a(new o25.m(str));
    }
}
