package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.fullscreen.views.LyricsFullscreenView;
import com.spotify.music.lyrics.vocalremoval.model.KaraokeState;
import com.spotify.music.lyrics.vocalremoval.model.KaraokeStatus;
import com.spotify.music.lyrics.vocalremoval.model.KaraokeVocalVolume;
import com.spotify.music.lyrics.vocalremoval.model.VocalRemovalStatus;
import com.spotify.music.lyrics.vocalremoval.model.VocalVolume;
import com.spotify.music.settings.SettingsState;
import com.spotify.music.settings.a;
import io.reactivex.y;

/* renamed from: qfb  reason: default package */
public class qfb implements nfb, e {
    private final rfb a;
    private final a b;
    private final y c;
    private final sfb d;
    private final jfb e;
    private final h f;
    protected ofb g;
    private mfb h;
    protected VocalRemovalStatus i = VocalRemovalStatus.DISABLED;
    public VocalVolume j = VocalVolume.OFF;
    protected final io.reactivex.disposables.a k = new io.reactivex.disposables.a();
    protected final io.reactivex.disposables.a l = new io.reactivex.disposables.a();

    qfb(rfb rfb, a aVar, y yVar, sfb sfb, jfb jfb, h hVar) {
        this.a = rfb;
        this.b = aVar;
        this.c = yVar;
        this.d = sfb;
        this.e = jfb;
        this.f = hVar;
    }

    public static void b(qfb qfb, SettingsState settingsState) {
        qfb.getClass();
        boolean z = true;
        if (!settingsState.offlineMode() && settingsState.streamQuality() != 1) {
            z = false;
        }
        if (z) {
            ofb ofb = qfb.g;
            ofb.getClass();
            ofb.p();
            return;
        }
        qfb.l(VocalRemovalStatus.DISABLED);
        qfb.g(VocalVolume.LOW);
        ofb ofb2 = qfb.g;
        ofb2.getClass();
        ofb2.q();
        qfb.d.k();
    }

    private void l(VocalRemovalStatus vocalRemovalStatus) {
        this.k.b(this.a.a(KaraokeStatus.create(vocalRemovalStatus.d())).A(this.c).subscribe(new efb(this, vocalRemovalStatus), new ffb(this)));
    }

    private void m(VocalRemovalStatus vocalRemovalStatus) {
        this.i = vocalRemovalStatus;
        ofb ofb = this.g;
        if (ofb != null) {
            ofb.v(vocalRemovalStatus.g());
            if (vocalRemovalStatus.g()) {
                this.d.c();
            }
        }
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public void a(b bVar) {
        VocalVolume vocalVolume;
        VocalVolume vocalVolume2;
        int c2 = bVar.c();
        if (c2 == C0707R.id.more_vocal) {
            VocalVolume vocalVolume3 = this.j;
            vocalVolume3.getClass();
            if (vocalVolume3 == VocalVolume.LOW) {
                vocalVolume2 = VocalVolume.HIGH;
            } else {
                vocalVolume2 = VocalVolume.OFF;
            }
            g(vocalVolume2);
            this.d.g();
        } else if (c2 == C0707R.id.less_vocal) {
            VocalVolume vocalVolume4 = this.j;
            vocalVolume4.getClass();
            if (vocalVolume4 == VocalVolume.OFF) {
                vocalVolume = VocalVolume.HIGH;
            } else {
                vocalVolume = VocalVolume.LOW;
            }
            g(vocalVolume);
            this.d.d();
        } else if (c2 == C0707R.id.report) {
            this.d.i();
            ofb ofb = this.g;
            ofb.getClass();
            ofb.A();
            this.d.j();
        }
    }

    public void c(KaraokeState karaokeState) {
        if (karaokeState.eventId().equals("karaoke_error")) {
            Logger.d("Could not download karaoke mask. Try again to enable vocal removal.", new Object[0]);
        } else if (karaokeState.eventId().equals("karaoke_mask_ready")) {
            m(VocalRemovalStatus.ENABLED);
        }
        ofb ofb = this.g;
        ofb.getClass();
        ofb.f();
    }

    public void d(VocalRemovalStatus vocalRemovalStatus) {
        if (vocalRemovalStatus == VocalRemovalStatus.DISABLED) {
            m(vocalRemovalStatus);
            ofb ofb = this.g;
            ofb.getClass();
            ofb.f();
        }
    }

    public void e() {
        this.k.f();
        this.l.f();
        ofb ofb = this.g;
        if (ofb != null && ofb.l() && this.i.g()) {
            VocalRemovalStatus vocalRemovalStatus = VocalRemovalStatus.DISABLED;
            if (vocalRemovalStatus.g()) {
                this.d.f();
            } else {
                this.d.e();
            }
            l(vocalRemovalStatus);
            g(VocalVolume.OFF);
        }
    }

    public void f() {
        ofb ofb = this.g;
        ofb.getClass();
        ofb.m();
        this.d.b();
    }

    public void g(VocalVolume vocalVolume) {
        this.k.b(this.a.b(KaraokeVocalVolume.create(vocalVolume.d())).A(this.c).subscribe(new ifb(this, vocalVolume)));
    }

    public void h() {
        this.k.f();
        this.l.f();
    }

    public void i() {
        ofb ofb = this.g;
        ofb.getClass();
        ofb.w();
        if (this.l.h() == 0) {
            this.l.b(this.a.events().o0(this.c).subscribe(new gfb(this), new hfb(this)));
        }
        if (this.i.h().g()) {
            this.d.f();
        } else {
            this.d.e();
        }
        l(this.i.h());
    }

    public void j(ofb ofb, mfb mfb, boolean z) {
        this.g = ofb;
        this.h = mfb;
        ofb.setLyricsVocalRemovalPresenter(this);
        if (z && this.e.a()) {
            GaiaDevice b2 = this.f.b();
            if (b2 == null || b2.isSelf()) {
                this.k.b(this.b.a().o0(this.c).subscribe(new cfb(this), new dfb(this)));
                return;
            }
        }
        ((LyricsFullscreenView) ofb).p();
    }

    public void k() {
        mfb mfb = this.h;
        mfb.getClass();
        mfb.H0(this.j);
        this.d.h();
    }
}
