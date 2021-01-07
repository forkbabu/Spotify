package defpackage;

import android.text.TextUtils;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.ads.uicomponents.secondaryintent.d;
import com.spotify.ads.uicomponents.secondaryintent.e;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.bq3;
import defpackage.vp3;
import io.reactivex.disposables.a;
import io.reactivex.g;

/* renamed from: cqb  reason: default package */
public class cqb implements d.a, vp3.a, bq3.a {
    private final e a;
    private final g<Ad> b;
    private final ws3 c;
    private final vp3 d;
    private final bq3 e;
    final a f = new a();
    private Ad g;
    private d h;
    private boolean i;

    public cqb(e eVar, vp3 vp3, bq3 bq3, g<Ad> gVar, ws3 ws3) {
        this.a = eVar;
        this.d = vp3;
        this.e = bq3;
        this.b = gVar;
        this.c = ws3;
    }

    public static void d(cqb cqb, Ad ad) {
        boolean z = false;
        if (cqb.g != null && !TextUtils.equals(ad.id(), cqb.g.id())) {
            cqb.i = false;
        }
        cqb.g = ad;
        if (!cqb.i) {
            boolean z2 = cqb.c.c() && (ad.getAdType() == Ad.AdType.NORMAL || ad.isVoiceAd());
            boolean z3 = ad.getAdType() == Ad.AdType.END_CARD_AD && (cqb.c.b() || cqb.c.a());
            if ((z2 || z3) && ad.isBookmarkable()) {
                z = true;
            }
            boolean isBookmarked = cqb.g.isBookmarked();
            cqb.h.setVisible(z);
            cqb.h.setBookmarked(isBookmarked);
        }
    }

    @Override // defpackage.bq3.a
    public void a() {
        this.a.a();
        this.h.setBookmarked(false);
        this.i = true;
    }

    @Override // com.spotify.ads.uicomponents.secondaryintent.d.a
    public void b() {
        if (((BookmarkAdButton) this.h).isActivated()) {
            this.e.a(this.g.id(), ViewUris.d0.toString(), this);
        } else {
            this.d.a(this.g.id(), ViewUris.d0.toString(), this);
        }
    }

    @Override // defpackage.vp3.a
    public void c() {
        this.a.b();
        this.h.setBookmarked(true);
        this.i = true;
    }

    public void e(d dVar) {
        this.h = dVar;
        dVar.setListener(this);
        this.f.b(this.b.subscribe(new kpb(this)));
    }

    public void f() {
        this.h.setListener(null);
        this.f.f();
    }
}
