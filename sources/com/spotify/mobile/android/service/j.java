package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.coreintegration.BackgroundFeaturesStatus;
import com.spotify.mobile.android.coreintegration.CoreIntegration;
import com.spotify.mobile.android.coreintegration.TaskRemovedStatus;
import com.spotify.mobile.android.coreintegration.k0;
import com.spotify.mobile.android.service.feature.q;
import com.spotify.mobile.android.service.media.l2;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.spotlets.bixbyhomecards.e;
import com.spotify.mobile.android.ui.activity.NotificationWebViewActivity;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.r0;
import com.spotify.music.alarmlauncher.h;
import com.spotify.music.autoplay.d0;
import com.spotify.music.builtinauth.cache.p0;
import com.spotify.music.features.ads.AdsPlaybackPlugin;
import com.spotify.music.features.preloadnotification.b;
import com.spotify.music.features.pushnotifications.y0;
import com.spotify.music.features.voice.z;
import com.spotify.music.features.widget.g;
import com.spotify.music.libs.audio.focus.a0;
import com.spotify.music.libs.audio.focus.r;
import com.spotify.music.libs.audio.focus.t;
import com.spotify.music.libs.audio.focus.u;
import com.spotify.music.libs.audio.focus.w;
import com.spotify.music.libs.carmodeengine.util.CarModeAutoActivationAlteringLogicPlugin;
import com.spotify.music.libs.carmodeengine.util.e0;
import com.spotify.music.libs.mediasession.m0;
import com.spotify.music.libs.performance.tracking.n;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.marquee.o;
import com.spotify.music.playback.api.c;
import com.spotify.music.spotlets.radio.service.f0;
import com.spotify.music.storylines.service.k;
import com.spotify.music.z0;
import com.spotify.player.controls.d;
import io.reactivex.subjects.a;
import java.util.Map;

public final class j implements fjf<i> {
    public static a0 A(ConnectManager connectManager, aw8 aw8) {
        return new a0(connectManager, aw8);
    }

    public static void B(Context context, RxWebToken rxWebToken, z0 z0Var, Uri uri, o0 o0Var) {
        Intent intent;
        if (uri != null) {
            l0 z = l0.z(uri.toString());
            if (z.q() == LinkType.PUSH_NOTIFICATION_WEBVIEW) {
                int i = NotificationWebViewActivity.G;
                intent = new Intent(context, NotificationWebViewActivity.class);
                intent.setData(z.n());
            } else if (z.q() != LinkType.DUMMY) {
                intent = z0Var.b(context, uri.toString()).a();
            } else {
                e0 a = a(uri);
                Uri uri2 = a.b;
                if (a.a) {
                    new f0(context, rxWebToken, uri2, o0Var);
                    intent = null;
                } else {
                    intent = new Intent("android.intent.action.VIEW", uri2);
                }
            }
        } else {
            intent = z0Var.a(context).a();
        }
        if (intent != null) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.spotify.mobile.android.service.e0 a(android.net.Uri r13) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.j.a(android.net.Uri):com.spotify.mobile.android.service.e0");
    }

    public static void b(SpotifyService spotifyService, Map<String, SpotifyServiceIntentProcessor> map) {
        spotifyService.t = map;
    }

    public static void c(SpotifyService spotifyService, a<BackgroundFeaturesStatus> aVar) {
        spotifyService.H = aVar;
    }

    public static void d(SpotifyService spotifyService, ColdStartTracker coldStartTracker) {
        spotifyService.z = coldStartTracker;
    }

    public static void e(SpotifyService spotifyService, CoreIntegration coreIntegration) {
        spotifyService.n = coreIntegration;
    }

    public static void f(SpotifyService spotifyService, i iVar) {
        spotifyService.u = iVar;
    }

    public static void g(SpotifyService spotifyService, zw9 zw9) {
        spotifyService.x = zw9;
    }

    public static void h(SpotifyService spotifyService, Object obj) {
        spotifyService.C = (m) obj;
    }

    public static void i(SpotifyService spotifyService, q qVar) {
        spotifyService.F = qVar;
    }

    public static void j(SpotifyService spotifyService, l2e l2e) {
        spotifyService.r = l2e;
    }

    public static void k(SpotifyService spotifyService, z zVar) {
        spotifyService.y = zVar;
    }

    public static void l(SpotifyService spotifyService, a0 a0Var) {
        spotifyService.f = a0Var;
    }

    public static void m(SpotifyService spotifyService, r rVar) {
        spotifyService.D = rVar;
    }

    public static void n(SpotifyService spotifyService, wlf<d> wlf) {
        spotifyService.s = wlf;
    }

    public static void o(SpotifyService spotifyService, Lifecycle lifecycle) {
        spotifyService.A = lifecycle;
    }

    public static void p(SpotifyService spotifyService, yn1 yn1) {
        spotifyService.p = yn1;
    }

    public static void q(SpotifyService spotifyService, h2e h2e) {
        spotifyService.w = h2e;
    }

    public static void r(SpotifyService spotifyService, k0 k0Var) {
        spotifyService.B = k0Var;
    }

    public static void s(SpotifyService spotifyService, v vVar) {
        spotifyService.v = vVar;
    }

    public static void t(SpotifyService spotifyService, boolean z) {
        spotifyService.E = z;
    }

    public static void u(SpotifyService spotifyService, m0 m0Var) {
        spotifyService.o = m0Var;
    }

    public static void v(SpotifyService spotifyService, a<TaskRemovedStatus> aVar) {
        spotifyService.I = aVar;
    }

    public static void w(SpotifyService spotifyService, Looper looper) {
        spotifyService.G = looper;
    }

    public static void x(SpotifyService spotifyService, aw8 aw8) {
        spotifyService.q = aw8;
    }

    public static i y(pn1 pn1, n nVar, cw8 cw8, sha sha, w wVar, z zVar, l2 l2Var, f0 f0Var, ut9 ut9, ke5 ke5, r0 r0Var, wv9 wv9, hn1 hn1, aia aia, a51 a51, d4a d4a, ja1 ja1, bx9 bx9) {
        return new i(pn1, nVar, cw8, sha, wVar, zVar, l2Var, f0Var, ut9, ke5, r0Var, wv9, hn1, aia, a51, d4a, ja1, bx9);
    }

    public static v z(pn1 pn1, u uVar, fv4 fv4, hcb hcb, fs2 fs2, o oVar, e eVar, d0 d0Var, com.spotify.music.internal.receiver.d dVar, com.spotify.music.features.ads.m0 m0Var, iv3 iv3, yhd yhd, com.spotify.music.features.offlinesync.j jVar, k kVar, com.spotify.music.libs.facebook.w wVar, y0 y0Var, com.spotify.music.features.connect.plugins.e eVar2, ffd ffd, ax1 ax1, cw8 cw8, p0 p0Var, sha sha, b92 b92, k92 k92, jn1 jn1, ln1 ln1, com.spotify.music.sleeptimer.q qVar, p8c p8c, fj5 fj5, b bVar, e62 e62, z zVar, jga jga, oi2 oi2, e4a e4a, com.spotify.music.libs.carmodeengine.settings.o oVar2, CarModeAutoActivationAlteringLogicPlugin carModeAutoActivationAlteringLogicPlugin, xu7 xu7, cr3 cr3, com.spotify.music.features.ads.screensaver.l0 l0Var, dr3 dr3, br3 br3, gr3 gr3, t tVar, AdsPlaybackPlugin adsPlaybackPlugin, ap3 ap3, fr3 fr3, com.spotify.music.features.widget.k kVar2, g gVar, ly5 ly5, er3 er3, ju7 ju7, utc utc, pia pia, mn1 mn1, r rVar, nwc nwc, tn1 tn1, v5a v5a, com.spotify.music.libs.carmodeengine.util.f0 f0Var, e0 e0Var, ep3 ep3, com.spotify.music.features.pushnotifications.r0 r0Var, c cVar, mec mec, wv9 wv9, a0 a0Var, vu9 vu9, cld cld, ald ald, bld bld, iod iod, x08 x08, fl1 fl1, n3a n3a, xyb xyb, com.spotify.mobile.android.skiplimitpivot.e eVar3, tp1 tp1, com.spotify.music.features.ads.cmp.k kVar3, ny5 ny5, cma cma, ut9 ut9, h hVar, nha nha) {
        return new v(pn1, uVar, fv4, hcb, fs2, oVar, eVar, d0Var, dVar, m0Var, iv3, yhd, jVar, kVar, wVar, y0Var, eVar2, ffd, ax1, cw8, p0Var, sha, b92, k92, jn1, ln1, qVar, p8c, fj5, bVar, e62, zVar, jga, oi2, e4a, oVar2, carModeAutoActivationAlteringLogicPlugin, xu7, cr3, l0Var, dr3, br3, gr3, tVar, adsPlaybackPlugin, ap3, fr3, kVar2, gVar, ly5, er3, ju7, utc, pia, mn1, rVar, nwc, tn1, v5a, f0Var, e0Var, ep3, r0Var, cVar, mec, wv9, a0Var, vu9, cld, ald, bld, iod, x08, fl1, n3a, xyb, eVar3, tp1, kVar3, ny5, cma, ut9, hVar, nha);
    }
}
