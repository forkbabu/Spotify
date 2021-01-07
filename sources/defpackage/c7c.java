package defpackage;

import android.text.TextUtils;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.ads.uicomponents.secondaryintent.d;
import com.spotify.ads.uicomponents.secondaryintent.e;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.ContextTrack;
import defpackage.bq3;
import defpackage.vp3;
import io.reactivex.disposables.a;
import io.reactivex.g;

/* renamed from: c7c  reason: default package */
public class c7c implements d.a, vp3.a, bq3.a {
    private final g<Ad> a;
    private final g<ContextTrack> b;
    private final ws3 c;
    private final e d;
    private final vp3 e;
    private final bq3 f;
    final a g = new a();
    private Ad h;
    private d i;
    private boolean j;
    private boolean k;

    public c7c(g<ContextTrack> gVar, vp3 vp3, bq3 bq3, g<Ad> gVar2, ws3 ws3, e eVar) {
        this.b = gVar;
        this.e = vp3;
        this.f = bq3;
        this.a = gVar2;
        this.c = ws3;
        this.d = eVar;
    }

    public static void d(c7c c7c, Ad ad) {
        boolean z = false;
        if (c7c.h != null && !TextUtils.equals(ad.id(), c7c.h.id())) {
            c7c.k = false;
        }
        c7c.h = ad;
        if (!c7c.k) {
            if ((c7c.c.b() || c7c.c.a()) && !c7c.j && ad.hasAction() && ad.isBookmarkable()) {
                z = true;
            }
            boolean isBookmarked = c7c.h.isBookmarked();
            c7c.i.setVisible(z);
            c7c.i.setBookmarked(isBookmarked);
        }
    }

    public static void e(c7c c7c, ContextTrack contextTrack) {
        c7c.getClass();
        c7c.j = InterruptionUtil.isInterruptionUri(contextTrack.uri());
    }

    @Override // defpackage.bq3.a
    public void a() {
        this.d.a();
        this.i.setBookmarked(false);
        this.k = true;
    }

    @Override // com.spotify.ads.uicomponents.secondaryintent.d.a
    public void b() {
        if (((BookmarkAdButton) this.i).isActivated()) {
            this.f.a(this.h.id(), ViewUris.d0.toString(), this);
        } else {
            this.e.a(this.h.id(), ViewUris.d0.toString(), this);
        }
    }

    @Override // defpackage.vp3.a
    public void c() {
        this.d.b();
        this.i.setBookmarked(true);
        this.k = true;
    }

    public void f(d dVar) {
        this.i = dVar;
        dVar.setListener(this);
        this.g.b(this.a.subscribe(new s6c(this)));
        this.g.b(this.b.subscribe(new t6c(this)));
    }

    public void g() {
        this.g.f();
        this.i.setListener(null);
    }
}
