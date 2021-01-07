package com.spotify.music.marquee.overlay;

import android.os.Bundle;
import com.spotify.music.C0707R;
import com.spotify.music.marquee.l;
import com.spotify.music.marquee.optout.MarqueeOptOutMenuFragment;
import com.spotify.music.navigation.t;
import com.spotify.music.productstate.c;
import com.spotify.rxjava2.p;
import io.reactivex.y;

public class j {
    private final hjb a;
    private final c b;
    private final y c;
    private final t d;
    private final dv3 e;
    private final njb f;
    private final l g;
    private final boolean h;
    private m i;
    private boolean j;
    private final p k = new p();

    public j(hjb hjb, c cVar, y yVar, t tVar, dv3 dv3, ojb ojb, l lVar, boolean z) {
        this.a = hjb;
        this.b = cVar;
        this.c = yVar;
        this.d = tVar;
        this.e = dv3;
        this.f = ojb.a(hjb.b());
        this.g = lVar;
        this.h = z;
    }

    public /* synthetic */ void a() {
        ((MarqueeOverlayFragment) this.i).z();
    }

    public /* synthetic */ void b() {
        this.d.d(this.a.e());
    }

    public /* synthetic */ void c() {
        ((MarqueeOverlayFragment) this.i).z();
    }

    public /* synthetic */ void d() {
        this.d.d(this.a.e());
    }

    public void e(Boolean bool) {
        if (bool.booleanValue()) {
            String f2 = this.a.f();
            if (f2 != null) {
                ((MarqueeOverlayFragment) this.i).W4(f2);
                return;
            }
            ((MarqueeOverlayFragment) this.i).W4(this.g.e());
            return;
        }
        String f3 = this.a.f();
        String g2 = this.a.g();
        if (f3 == null || g2 == null) {
            ((MarqueeOverlayFragment) this.i).X4(this.g.h(), this.g.g());
            return;
        }
        ((MarqueeOverlayFragment) this.i).X4(f3, g2);
    }

    public /* synthetic */ void f() {
        ((MarqueeOverlayFragment) this.i).z();
    }

    public void g() {
        this.e.a("errored", this.a.a());
        ((MarqueeOverlayFragment) this.i).P4(new b(this));
    }

    public void h() {
        if (!this.j && !this.h) {
            this.e.a("viewed", this.a.a());
            this.j = true;
        }
    }

    public void i() {
        this.e.a("clicked", this.a.a());
        ((MarqueeOverlayFragment) this.i).P4(new f(this));
    }

    public void j() {
        ((MarqueeOverlayFragment) this.i).P4(new a(this));
    }

    public void k() {
        this.e.a("clicked", this.a.a());
        ((MarqueeOverlayFragment) this.i).P4(new d(this));
    }

    public void l(m mVar) {
        this.i = mVar;
        ((MarqueeOverlayFragment) mVar).T4(this.f);
        ((MarqueeOverlayFragment) this.i).S4(this.a.l());
        ((MarqueeOverlayFragment) this.i).Q4(this.a.b());
        ((MarqueeOverlayFragment) this.i).R4(this.a.m());
        if (this.a.c() != null) {
            ((MarqueeOverlayFragment) this.i).U4(this.a.c());
        }
        if (this.a.h() != null) {
            ((MarqueeOverlayFragment) this.i).V4(this.a.h());
        }
        this.k.b(this.b.a().N0(1).o0(this.c).subscribe(new c(this)));
    }

    public void m() {
        this.e.a("dismissed", this.a.a());
        ((MarqueeOverlayFragment) this.i).P4(new e(this));
        this.k.a();
    }

    public void n() {
        this.k.a();
    }

    public void o(androidx.fragment.app.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.a.j() != null) {
            str = this.a.j().b();
        } else {
            str = this.a.k();
        }
        String i2 = this.a.i();
        if (this.a.j() != null) {
            str2 = this.a.j().e();
        } else {
            str2 = this.g.d();
        }
        if (this.a.j() != null) {
            str3 = this.a.j().f();
        } else {
            str3 = this.g.f();
        }
        if (this.a.j() != null) {
            str4 = this.a.j().a();
        } else {
            str4 = this.g.i(C0707R.string.marquee_optout_menu_optout_artist);
        }
        if (this.a.j() != null) {
            str5 = this.a.j().c();
        } else {
            str5 = this.g.i(C0707R.string.marquee_optout_menu_optout_altogether);
        }
        MarqueeOptOutMenuFragment marqueeOptOutMenuFragment = new MarqueeOptOutMenuFragment();
        Bundle F = je.F("artist_uri", str, "lineitem_id", i2);
        F.putString("disclosure_text", str2);
        F.putString("disclosure_cta_text", str3);
        F.putString("optout_artist_text", str4);
        F.putString("optout_marquee_text", str5);
        marqueeOptOutMenuFragment.r4(F);
        marqueeOptOutMenuFragment.Y4(cVar.v0(), "MarqueeOptOut");
    }
}
