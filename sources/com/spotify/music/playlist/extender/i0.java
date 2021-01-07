package com.spotify.music.playlist.extender;

import android.animation.ObjectAnimator;
import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.i;
import io.reactivex.g;
import io.reactivex.y;

public final class i0 implements fjf<h0> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<Integer> c;
    private final wlf<SpotifyIconDrawable> d;
    private final wlf<ObjectAnimator> e;
    private final wlf<ObjectMapper> f;
    private final wlf<f> g;
    private final wlf<PlayOrigin> h;
    private final wlf<g<PlayerState>> i;
    private final wlf<z> j;
    private final wlf<Boolean> k;
    private final wlf<SpSharedPreferences<Object>> l;
    private final wlf<x> m;
    private final wlf<sa0> n;
    private final wlf<y> o;
    private final wlf<i> p;
    private final wlf<ExtenderLogger> q;
    private final wlf<o0> r;
    private final wlf<c> s;
    private final wlf<bre> t;

    public i0(wlf<Context> wlf, wlf<String> wlf2, wlf<Integer> wlf3, wlf<SpotifyIconDrawable> wlf4, wlf<ObjectAnimator> wlf5, wlf<ObjectMapper> wlf6, wlf<f> wlf7, wlf<PlayOrigin> wlf8, wlf<g<PlayerState>> wlf9, wlf<z> wlf10, wlf<Boolean> wlf11, wlf<SpSharedPreferences<Object>> wlf12, wlf<x> wlf13, wlf<sa0> wlf14, wlf<y> wlf15, wlf<i> wlf16, wlf<ExtenderLogger> wlf17, wlf<o0> wlf18, wlf<c> wlf19, wlf<bre> wlf20) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
        this.s = wlf19;
        this.t = wlf20;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }
}
