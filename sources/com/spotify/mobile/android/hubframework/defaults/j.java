package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.music.follow.m;

@Deprecated
public class j implements a61 {
    private static final p81 b = z81.a().b("following", true).d();
    private static final p81 c = z81.a().b("following", false).d();
    private final m a;

    public j(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.a61
    public s81 a(s81 s81) {
        a91 target = s81.target();
        if (target == null || !target.actions().contains("toggle-follow")) {
            return s81;
        }
        com.spotify.music.follow.j c2 = this.a.c(target.uri());
        boolean z = c2 != null && c2.g();
        if (s81.custom().boolValue("following", false) == z) {
            return s81;
        }
        return s81.toBuilder().c(z ? b : c).l();
    }
}
