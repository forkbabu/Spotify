package com.spotify.music.features.hiddencontent.presenter;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.fullscreen.story.r;
import com.spotify.music.features.hiddencontent.HiddenContentFragment;
import com.spotify.music.features.hiddencontent.HiddenContentLogger;
import com.spotify.music.features.hiddencontent.model.BansResponse;
import com.spotify.music.features.hiddencontent.model.d;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.preview.v;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import defpackage.d42;
import defpackage.w22;
import io.reactivex.y;

public class HiddenContentFragmentPresenter {
    private final lf5 a;
    private final HiddenContentLogger b;
    private final t c;
    private final jf5 d;
    private final y e;
    private final v f;
    private final c g;
    private final ExplicitContentFacade h;
    private final AgeRestrictedContentFacade i;
    private io.reactivex.disposables.a j;
    private Tab k = Tab.ARTISTS;

    public enum Tab {
        SONGS,
        ARTISTS
    }

    /* access modifiers changed from: package-private */
    public static abstract class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public abstract int b();

        /* access modifiers changed from: package-private */
        public abstract o c();
    }

    public HiddenContentFragmentPresenter(lf5 lf5, HiddenContentLogger hiddenContentLogger, t tVar, jf5 jf5, y yVar, v vVar, c cVar, ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade) {
        this.a = lf5;
        this.b = hiddenContentLogger;
        this.c = tVar;
        this.d = jf5;
        this.e = yVar;
        this.f = vVar;
        this.g = cVar;
        this.h = explicitContentFacade;
        this.i = ageRestrictedContentFacade;
    }

    private void a(a aVar) {
        o c2 = aVar.c();
        if (c2.getPlayabilityRestriction() == PlayabilityRestriction.EXPLICIT_CONTENT) {
            this.h.e(c2.getUri(), null);
            d(aVar);
        } else if (c2.getPlayabilityRestriction() == PlayabilityRestriction.AGE_RESTRICTED) {
            this.i.d(c2.getUri(), q.e(c2, Covers.Size.LARGE));
            d(aVar);
        } else {
            o c3 = aVar.c();
            String previewId = c3.getPreviewId();
            String a2 = r.a(c3);
            if (previewId == null) {
                Logger.d("missing preview id for track %s", c3.getUri());
            } else if (this.f.a(a2)) {
                this.f.e(a2);
                if (aVar.a()) {
                    this.b.f(aVar.c().getUri(), aVar.b());
                } else {
                    this.b.g(aVar.c().getUri(), aVar.b());
                }
            } else {
                this.f.i(previewId, a2);
                d(aVar);
            }
        }
    }

    private void d(a aVar) {
        if (aVar.a()) {
            this.b.h(aVar.c().getUri(), aVar.b());
        } else {
            this.b.i(aVar.c().getUri(), aVar.b());
        }
    }

    private void m(Tab tab) {
        if (tab == Tab.SONGS) {
            ((HiddenContentFragment) this.a).L4();
            this.b.k();
            return;
        }
        ((HiddenContentFragment) this.a).K4();
        this.b.d();
    }

    public /* synthetic */ void b(String str, ContextMenuEvent contextMenuEvent) {
        if (contextMenuEvent == ContextMenuEvent.BAN) {
            this.b.m(str);
        }
    }

    public /* synthetic */ void c(BansResponse bansResponse) {
        ((HiddenContentFragment) this.a).S4(bansResponse);
        ((HiddenContentFragment) this.a).O4();
    }

    public void e(String str, int i2) {
        this.b.a(str, i2);
        this.c.d(str);
    }

    public r3 f(com.spotify.music.features.hiddencontent.model.c cVar, u22 u22) {
        b b2 = cVar.b();
        String uri = b2.getUri();
        this.b.b(uri, cVar.c());
        w22.d d2 = u22.a(uri, b2.f()).a(this.g).d(false);
        d2.f(true);
        d2.i(true);
        d2.c(true);
        d2.h(true);
        d2.g(new a(this, uri));
        return d2.b();
    }

    public r3 g(d dVar, b42 b42) {
        o c2 = dVar.c();
        String uri = c2.getUri();
        this.b.l(uri, dVar.b());
        d42.f w = b42.a(uri, c2.getName(), "").a(this.g).t(false).g(true).r(true).w(false);
        w.l(true);
        w.f(true);
        w.c(true);
        w.h(true);
        return w.b();
    }

    public void h(Bundle bundle) {
        bundle.putString("active_tab", this.k.name());
    }

    public void i(Tab tab) {
        if (tab != this.k) {
            if (tab == Tab.SONGS) {
                this.b.j();
            } else {
                this.b.c();
            }
            this.k = tab;
            m(tab);
        }
    }

    public void j(o oVar, int i2) {
        a(new c(oVar, i2, false));
    }

    public void k(o oVar, int i2) {
        a(new c(oVar, i2, true));
    }

    public void l(Bundle bundle) {
        if (bundle != null) {
            this.k = Tab.valueOf(bundle.getString("active_tab", Tab.ARTISTS.name()));
        }
        m(this.k);
    }

    public void n() {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        this.j = aVar;
        aVar.b(this.d.a().o0(this.e).subscribe(new b(this)));
    }

    public void o() {
        io.reactivex.disposables.a aVar = this.j;
        if (aVar != null) {
            aVar.dispose();
            this.j.f();
            this.j = null;
        }
    }
}
