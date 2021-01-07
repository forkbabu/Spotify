package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.m02;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.y;
import java.util.Iterator;

public class u extends m02 {
    static final l[] t = {new j(C0707R.drawable.ic_offline, C0707R.string.premium_feature_download_music, C0707R.string.premium_feature_download_music_details), new j(C0707R.drawable.ic_no_ads, C0707R.string.premium_feature_ad_free, C0707R.string.premium_feature_ad_free_details), new j(C0707R.drawable.ic_play_any_song, C0707R.string.premium_feature_play_any_song, C0707R.string.premium_feature_play_any_song_details), new j(C0707R.drawable.ic_unlimited_skips, C0707R.string.premium_feature_unlimited_skips, C0707R.string.premium_feature_unlimited_skips_details), new j(C0707R.drawable.ic_hd_audio, C0707R.string.premium_feature_hd_audio, C0707R.string.premium_feature_hd_audio_details)};
    static final l[] u = {new j(C0707R.drawable.ic_offline, C0707R.string.premium_feature_download_music, C0707R.string.premium_feature_download_music_details), new j(C0707R.drawable.ic_no_ads, C0707R.string.premium_feature_ad_free, C0707R.string.premium_feature_ad_free_details), new j(C0707R.drawable.ic_hd_audio, C0707R.string.premium_feature_hd_audio, C0707R.string.premium_feature_hd_audio_details)};
    static final l[] v = {new j(C0707R.drawable.ic_play_any_song, C0707R.string.premium_feature_play_any_song, C0707R.string.premium_feature_on_trial_on_demand_instructions), new j(C0707R.drawable.ic_offline, C0707R.string.premium_feature_listen_offline, C0707R.string.premium_feature_on_trial_offline_instructions), new j(C0707R.drawable.ic_hd_audio, C0707R.string.premium_feature_hi_def_sound, C0707R.string.premium_feature_on_trial_hd_audio_instructions), new j(C0707R.drawable.ic_no_ads, C0707R.string.premium_feature_no_ads, C0707R.string.premium_feature_on_trial_ad_free_description)};
    static final l[] w = {new j(C0707R.drawable.ic_offline, C0707R.string.premium_feature_listen_offline, C0707R.string.premium_feature_on_trial_offline_instructions), new j(C0707R.drawable.ic_hd_audio, C0707R.string.premium_feature_hi_def_sound, C0707R.string.premium_feature_on_trial_hd_audio_instructions), new j(C0707R.drawable.ic_no_ads, C0707R.string.premium_feature_no_ads, C0707R.string.premium_feature_on_trial_ad_free_description)};
    private t k;
    private p l;
    private t02 m;
    private mi7 n;
    private final y o;
    private final ozd p;
    private String q;
    private b r = c.a();
    private b s = c.a();

    protected class a extends m02.a {
        protected a() {
            super();
        }

        @Override // defpackage.m02.a, com.spotify.mobile.android.ui.activity.upsell.premiumdestination.p.a
        public void a(Offer offer) {
            super.a(offer);
            u uVar = u.this;
            uVar.v(uVar.l.g());
        }

        @Override // defpackage.m02.a, com.spotify.mobile.android.ui.activity.upsell.premiumdestination.p.a
        public void b(String str) {
            super.b(str);
            u uVar = u.this;
            uVar.v(uVar.l.g());
        }
    }

    public u(t tVar, p pVar, c02 c02, com.spotify.music.libs.viewuri.c cVar, t02 t02, mi7 mi7, y yVar, ozd ozd) {
        super(Reason.USER_REQUEST, AppProtocol.LogMessage.SEVERITY_INFO, ((PremiumDestinationFragment) c02).K4(), tVar, pVar, t02, cVar, ViewUris.SubView.NONE, "full-page");
        this.k = tVar;
        this.l = pVar;
        this.m = t02;
        this.n = mi7;
        this.o = yVar;
        this.p = ozd;
        this.q = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void v(boolean z) {
        String c = this.m.c(z);
        if ("IN".equals(this.l.f())) {
            if (z) {
                this.k.r1(c, w);
            } else {
                this.k.r1(c, u);
            }
        } else if (z) {
            this.k.r1(c, v);
        } else {
            this.k.r1(c, t);
        }
    }

    @Override // defpackage.m02
    public void l() {
        this.s.dispose();
        this.s = this.n.b(this.l.f(), this.p).B(this.o).subscribe(new h(this), new g(this));
    }

    public void p() {
        this.k = null;
        this.l.c();
        this.l = null;
        this.m.a();
        this.m = null;
        this.n = null;
        this.r.dispose();
        this.s.dispose();
    }

    public /* synthetic */ void q(Boolean bool) {
        if (bool.booleanValue()) {
            this.l.k(this.q);
        } else {
            super.l();
        }
    }

    public /* synthetic */ void r(Throwable th) {
        this.q = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
        this.k.w2(this.m.k());
        this.k.h2(0);
    }

    public void s(l02 l02) {
        String str;
        if (!l02.a().isEmpty()) {
            Iterator<j02> it = l02.a().get(0).a().a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j02 next = it.next();
                if ("cta_url".equals(next.a())) {
                    str = next.c();
                    break;
                }
            }
            this.q = str;
            this.k.w2(this.m.k());
            this.k.h2(0);
        }
        str = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
        this.q = str;
        this.k.w2(this.m.k());
        this.k.h2(0);
    }

    public void t(Boolean bool) {
        if (bool.booleanValue()) {
            this.k.l2(this.m.f());
            this.k.x1(this.m.h());
            this.k.K(this.m.g());
            this.k.y1(0);
            v(this.l.g());
            this.r.dispose();
            this.r = this.l.d().o0(this.o).subscribe(new f(this), new g(this));
            return;
        }
        this.l.e(new a());
    }

    public void u(SessionState sessionState) {
        this.l.l(sessionState);
        this.k.l2(this.m.d(this.l.g()));
        this.s.dispose();
        this.s = this.n.b(this.l.f(), this.p).B(this.o).subscribe(new e(this), new g(this));
    }
}
