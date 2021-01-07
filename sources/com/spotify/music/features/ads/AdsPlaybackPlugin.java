package com.spotify.music.features.ads;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.volume.controllers.n;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.ads.api.a;
import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;

public class AdsPlaybackPlugin implements d {
    private final g<PlayerState> a;
    private final y b;
    private final fv3 c;
    private final n f;
    private final xp1 n;
    private final r0 o;
    private final a p;
    private final Lifecycle q;
    private final r1 r;
    private final ContentResolver s;
    private final q t = new q();
    private final p u = new p();
    private Optional<Boolean> v = Optional.absent();
    private final m w = new m() {
        /* class com.spotify.music.features.ads.AdsPlaybackPlugin.AnonymousClass1 */

        @w(Lifecycle.Event.ON_START)
        public void onStart() {
            AdsPlaybackPlugin.this.o.b();
        }

        @w(Lifecycle.Event.ON_STOP)
        public void onStop() {
            AdsPlaybackPlugin.this.o.a();
        }
    };

    public AdsPlaybackPlugin(r1 r1Var, ContentResolver contentResolver, g<PlayerState> gVar, y yVar, fv3 fv3, n nVar, xp1 xp1, r0 r0Var, a aVar, Lifecycle lifecycle) {
        this.r = r1Var;
        this.s = contentResolver;
        this.a = gVar;
        this.b = yVar;
        this.c = fv3;
        this.f = nVar;
        this.n = xp1;
        this.o = r0Var;
        this.p = aVar;
        this.q = lifecycle;
    }

    public static void b(AdsPlaybackPlugin adsPlaybackPlugin, double d) {
        adsPlaybackPlugin.u.b(adsPlaybackPlugin.p.a(d).subscribe(y.a, z.a));
    }

    public static void c(AdsPlaybackPlugin adsPlaybackPlugin, ContextTrack contextTrack) {
        adsPlaybackPlugin.getClass();
        contextTrack.getClass();
        String str = contextTrack.metadata().get("ad_id");
        String str2 = contextTrack.metadata().get("duration");
        Optional<Boolean> of = Optional.of(Boolean.valueOf(Boolean.parseBoolean(contextTrack.metadata().get("is_advertisement"))));
        boolean z = of.get().booleanValue() && !adsPlaybackPlugin.r.a().equals(str);
        if (!adsPlaybackPlugin.v.equals(of)) {
            adsPlaybackPlugin.v = of;
            if (of.get().booleanValue()) {
                Logger.b("Ads product ad %s is Playing", str);
                adsPlaybackPlugin.r.e(str, str2);
                adsPlaybackPlugin.s.registerContentObserver(Settings.System.CONTENT_URI, true, adsPlaybackPlugin.c);
                fv3 fv3 = adsPlaybackPlugin.c;
                fv3.d = str;
                fv3.e = str2;
                return;
            }
            Logger.b("Ads product ad is not Playing ", new Object[0]);
            adsPlaybackPlugin.r.d();
            adsPlaybackPlugin.s.unregisterContentObserver(adsPlaybackPlugin.c);
        } else if (z) {
            adsPlaybackPlugin.v = of;
            adsPlaybackPlugin.r.e(str, str2);
            fv3 fv32 = adsPlaybackPlugin.c;
            fv32.d = str;
            fv32.e = str2;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.t.a(this.a.l(PlayerStateTransformers.b()).C(a.a).O(b0.a).Q(this.b).subscribe(new a0(this)));
        this.t.a(this.f.b().subscribe(new x(this)));
        this.f.d();
        this.u.b(this.p.a((double) this.f.a().floatValue()).subscribe(y.a, z.a));
        this.n.b();
        this.q.a(this.w);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.t.c();
        this.u.a();
        this.n.c();
        this.q.c(this.w);
        this.o.c();
        this.f.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AdsPlayback";
    }
}
