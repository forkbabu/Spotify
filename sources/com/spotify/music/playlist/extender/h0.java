package com.spotify.music.playlist.extender;

import android.animation.ObjectAnimator;
import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.extender.f0;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.i;
import io.reactivex.g;
import io.reactivex.y;

public class h0 implements f0.b {
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

    public h0(wlf<Context> wlf, wlf<String> wlf2, wlf<Integer> wlf3, wlf<SpotifyIconDrawable> wlf4, wlf<ObjectAnimator> wlf5, wlf<ObjectMapper> wlf6, wlf<f> wlf7, wlf<PlayOrigin> wlf8, wlf<g<PlayerState>> wlf9, wlf<z> wlf10, wlf<Boolean> wlf11, wlf<SpSharedPreferences<Object>> wlf12, wlf<x> wlf13, wlf<sa0> wlf14, wlf<y> wlf15, wlf<i> wlf16, wlf<ExtenderLogger> wlf17, wlf<o0> wlf18, wlf<c> wlf19, wlf<bre> wlf20) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
        b(wlf8, 8);
        this.h = wlf8;
        b(wlf9, 9);
        this.i = wlf9;
        b(wlf10, 10);
        this.j = wlf10;
        b(wlf11, 11);
        this.k = wlf11;
        b(wlf12, 12);
        this.l = wlf12;
        b(wlf13, 13);
        this.m = wlf13;
        b(wlf14, 14);
        this.n = wlf14;
        b(wlf15, 15);
        this.o = wlf15;
        b(wlf16, 16);
        this.p = wlf16;
        b(wlf17, 17);
        this.q = wlf17;
        b(wlf18, 18);
        this.r = wlf18;
        b(wlf19, 19);
        this.s = wlf19;
        b(wlf20, 20);
        this.t = wlf20;
    }

    private static <T> T b(T t2, int i2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // com.spotify.music.playlist.extender.f0.b
    public f0 a(boolean z, f0.a aVar) {
        Context context = this.a.get();
        b(context, 1);
        String str = this.b.get();
        b(str, 2);
        Integer num = this.c.get();
        b(num, 3);
        int intValue = num.intValue();
        SpotifyIconDrawable spotifyIconDrawable = this.d.get();
        b(spotifyIconDrawable, 4);
        ObjectAnimator objectAnimator = this.e.get();
        b(objectAnimator, 5);
        ObjectMapper objectMapper = this.f.get();
        b(objectMapper, 6);
        f fVar = this.g.get();
        b(fVar, 7);
        PlayOrigin playOrigin = this.h.get();
        b(playOrigin, 8);
        g<PlayerState> gVar = this.i.get();
        b(gVar, 9);
        z zVar = this.j.get();
        b(zVar, 10);
        Boolean bool = this.k.get();
        b(bool, 11);
        boolean booleanValue = bool.booleanValue();
        SpSharedPreferences<Object> spSharedPreferences = this.l.get();
        b(spSharedPreferences, 12);
        x xVar = this.m.get();
        b(xVar, 13);
        sa0 sa0 = this.n.get();
        b(sa0, 14);
        y yVar = this.o.get();
        b(yVar, 15);
        y yVar2 = yVar;
        i iVar = this.p.get();
        b(iVar, 16);
        i iVar2 = iVar;
        ExtenderLogger extenderLogger = this.q.get();
        b(extenderLogger, 17);
        ExtenderLogger extenderLogger2 = extenderLogger;
        o0 o0Var = this.r.get();
        b(o0Var, 18);
        o0 o0Var2 = o0Var;
        c cVar = this.s.get();
        b(cVar, 19);
        c cVar2 = cVar;
        bre bre = this.t.get();
        b(bre, 20);
        b(aVar, 22);
        return new g0(context, str, intValue, spotifyIconDrawable, objectAnimator, objectMapper, fVar, playOrigin, gVar, zVar, booleanValue, spSharedPreferences, xVar, sa0, yVar2, iVar2, extenderLogger2, o0Var2, cVar2, bre, z, aVar);
    }
}
