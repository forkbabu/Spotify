package com.spotify.mobile.android.service;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.spotlets.bixbyhomecards.e;
import com.spotify.music.alarmlauncher.h;
import com.spotify.music.autoplay.d0;
import com.spotify.music.builtinauth.cache.p0;
import com.spotify.music.features.ads.AdsPlaybackPlugin;
import com.spotify.music.features.ads.m0;
import com.spotify.music.features.ads.screensaver.l0;
import com.spotify.music.features.offlinesync.j;
import com.spotify.music.features.preloadnotification.b;
import com.spotify.music.features.pushnotifications.r0;
import com.spotify.music.features.pushnotifications.y0;
import com.spotify.music.features.voice.z;
import com.spotify.music.features.widget.g;
import com.spotify.music.libs.audio.focus.a0;
import com.spotify.music.libs.audio.focus.r;
import com.spotify.music.libs.audio.focus.t;
import com.spotify.music.libs.audio.focus.u;
import com.spotify.music.libs.carmodeengine.util.CarModeAutoActivationAlteringLogicPlugin;
import com.spotify.music.libs.carmodeengine.util.e0;
import com.spotify.music.libs.carmodeengine.util.f0;
import com.spotify.music.libs.facebook.w;
import com.spotify.music.marquee.o;
import com.spotify.music.playback.api.c;
import com.spotify.music.sleeptimer.q;
import com.spotify.music.storylines.service.k;
import java.util.Set;

public class v {
    private final Set<d> a;

    v(pn1 pn1, u uVar, fv4 fv4, hcb hcb, fs2 fs2, o oVar, e eVar, d0 d0Var, com.spotify.music.internal.receiver.d dVar, m0 m0Var, iv3 iv3, yhd yhd, j jVar, k kVar, w wVar, y0 y0Var, com.spotify.music.features.connect.plugins.e eVar2, ffd ffd, ax1 ax1, cw8 cw8, p0 p0Var, sha sha, b92 b92, k92 k92, jn1 jn1, ln1 ln1, q qVar, p8c p8c, fj5 fj5, b bVar, e62 e62, z zVar, jga jga, oi2 oi2, e4a e4a, com.spotify.music.libs.carmodeengine.settings.o oVar2, CarModeAutoActivationAlteringLogicPlugin carModeAutoActivationAlteringLogicPlugin, xu7 xu7, cr3 cr3, l0 l0Var, dr3 dr3, br3 br3, gr3 gr3, t tVar, AdsPlaybackPlugin adsPlaybackPlugin, ap3 ap3, fr3 fr3, com.spotify.music.features.widget.k kVar2, g gVar, ly5 ly5, er3 er3, ju7 ju7, utc utc, pia pia, mn1 mn1, r rVar, nwc nwc, tn1 tn1, v5a v5a, f0 f0Var, e0 e0Var, ep3 ep3, r0 r0Var, c cVar, mec mec, wv9 wv9, a0 a0Var, vu9 vu9, cld cld, ald ald, bld bld, iod iod, x08 x08, fl1 fl1, n3a n3a, xyb xyb, com.spotify.mobile.android.skiplimitpivot.e eVar3, tp1 tp1, com.spotify.music.features.ads.cmp.k kVar3, ny5 ny5, cma cma, ut9 ut9, h hVar, nha nha) {
        this.a = ImmutableSet.of((o) pn1, (o) uVar, (o) fv4, (o) hcb, (o) fs2, oVar, (o[]) new d[]{eVar, d0Var, dVar, m0Var, iv3, yhd, jVar, kVar, wVar, y0Var, eVar2, ffd, ax1, cw8, p0Var, sha, b92, k92, jn1, ln1, qVar, p8c, fj5, bVar, e62, zVar, jga, oi2, e4a, oVar2, carModeAutoActivationAlteringLogicPlugin, xu7, cr3, l0Var, dr3, br3, gr3, tVar, adsPlaybackPlugin, ap3, fr3, kVar2, gVar, ly5, er3, ju7, utc, pia, mn1, rVar, nwc, tn1, v5a, f0Var, e0Var, ep3, r0Var, cVar, mec, wv9, a0Var, vu9, cld, ald, bld, iod, x08, fl1, n3a, xyb, eVar3, kVar3, ny5, cma, ut9, hVar, nha, tp1});
    }

    public Set<d> a() {
        return this.a;
    }
}
