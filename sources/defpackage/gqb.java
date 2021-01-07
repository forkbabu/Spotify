package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.ads.voice.VoiceAdService;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;
import com.spotify.music.ads.voice.f;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.ads.view.VoiceAdsView;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import defpackage.pqb;
import defpackage.xp3;
import io.reactivex.g;

/* renamed from: gqb  reason: default package */
public class gqb implements ServiceConnection, xp3.a, pqb.a {
    private final t a;
    private final cqe b;
    private final gl0<u> c;
    private final g<Ad> f;
    private final g<PlayerState> n;
    final q o = new q();
    final q p = new q();
    private pqb q;
    private kqb r;
    private VoiceAdService s;
    private f t;
    private PlayPauseButton u;
    private String v;
    private boolean w;

    /* renamed from: gqb$a */
    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            if (gqb.this.w) {
                gqb.this.r.b();
                gqb.this.o.c();
                gqb.this.p.c();
            }
        }
    }

    public gqb(g<Ad> gVar, g<PlayerState> gVar2, t tVar, cqe cqe, gl0<u> gl0, k kVar) {
        this.f = gVar;
        this.n = gVar2;
        this.a = tVar;
        this.b = cqe;
        this.c = gl0;
        kVar.y0(new a());
    }

    public static void c(gqb gqb, Ad ad) {
        if (gqb.w) {
            gqb.r.b();
        }
        boolean isVoiceAd = ad.isVoiceAd();
        gqb.w = isVoiceAd;
        ((VoiceAdsView) gqb.q).setVisibility(isVoiceAd ? 0 : 4);
        if (gqb.w) {
            gqb.r.a();
            gqb.v = ad.id();
            gqb.p.c();
            gqb.p.a(gqb.n.u(vpb.a).subscribe(new mpb(gqb, ad)));
            gqb.p.a(gqb.n.C(opb.a).O(rpb.a).s().subscribe(new ppb(gqb, ad)));
        }
    }

    private void l(String str) {
        if (this.w) {
            VoiceAdLog.c q2 = VoiceAdLog.q();
            q2.p(str);
            q2.r(this.b.d());
            q2.o("");
            q2.m("ad_id", MoreObjects.nullToEmpty(this.v));
            this.c.c(q2.build());
        }
    }

    public void d(v vVar) {
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.c)) {
            w h2 = vVar.h();
            h2.getClass();
            if (!(h2 instanceof w.a)) {
                w h3 = vVar.h();
                h3.getClass();
                if (h3 instanceof w.b) {
                    ((VoiceAdsView) this.q).d(true);
                    this.u.setEnabled(false);
                    return;
                }
                return;
            }
        }
        ((VoiceAdsView) this.q).d(false);
    }

    public /* synthetic */ void e(Ad ad, PlayerState playerState) {
        String contextUri = playerState.contextUri();
        String str = ad.metadata().get(Ad.METADATA_VOICE_ACTION_URI);
        if (TextUtils.equals(contextUri, str) && str != null) {
            this.a.d(str);
        }
    }

    public /* synthetic */ void f(Ad ad, String str) {
        if (str == null || !str.equalsIgnoreCase(ad.uri())) {
            this.r.b();
        }
    }

    public void g() {
        l("mic_tapped");
    }

    public void h() {
        f fVar = this.t;
        if (fVar != null) {
            fVar.d();
        }
    }

    public void i() {
        l("settings_opened");
        ((Activity) ((VoiceAdsView) this.q).getContext()).finish();
        this.a.d("spotify:internal:preferences");
    }

    public void j(pqb pqb, PlayPauseButton playPauseButton, kqb kqb) {
        this.q = pqb;
        this.u = playPauseButton;
        this.r = kqb;
        this.o.a(this.f.subscribe(new qpb(this)));
        this.q.setMicrophoneClickListener(this);
    }

    public void k() {
        this.o.c();
        this.p.c();
    }

    public void m() {
        f fVar = this.t;
        if (fVar != null) {
            fVar.g();
            this.t = null;
        }
        this.s = null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        VoiceAdService a2 = ((VoiceAdService.a) iBinder).a();
        this.s = a2;
        this.t = a2.e();
        Logger.b("[VoiceAd] Service - connected", new Object[0]);
        this.t.e(new spb(this));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.t;
        if (fVar != null) {
            fVar.g();
            this.t = null;
        }
        this.s = null;
    }
}
