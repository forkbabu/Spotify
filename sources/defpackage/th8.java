package defpackage;

import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.ads.uicomponents.secondaryintent.e;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import defpackage.bq3;
import defpackage.vp3;

/* renamed from: th8  reason: default package */
public class th8 implements vp3.a, bq3.a {
    private final vp3 a;
    private final bq3 b;
    private final t c;
    private final mh8 d;
    private final e e;
    private final dv3 f;

    public th8(vp3 vp3, bq3 bq3, t tVar, mh8 mh8, dv3 dv3, e eVar) {
        this.a = vp3;
        this.b = bq3;
        this.c = tVar;
        this.d = mh8;
        this.f = dv3;
        this.e = eVar;
    }

    @Override // defpackage.bq3.a
    public void a() {
        this.e.a();
    }

    public void b(Ad ad, int i) {
        this.c.d(ad.clickUrl());
        this.f.a("clicked", ad.id());
        this.d.a(i, ad.id(), ad.clickUrl());
    }

    @Override // defpackage.vp3.a
    public void c() {
        this.e.b();
    }

    public void d(Ad ad, int i) {
        this.c.d(ad.clickUrl());
        this.f.a("clicked", ad.id());
        this.d.b(i, ad.id(), ad.clickUrl());
    }

    public void e(Ad ad, String str, int i) {
        this.c.d(ad.clickUrl());
        this.f.a("clicked", ad.id());
        this.d.c(i, ad.id(), str, ad.clickUrl());
    }

    public void f(Ad ad, int i) {
        this.c.d(ad.clickUrl());
        this.f.a("clicked", ad.id());
        this.d.d(i, ad.id(), ad.clickUrl());
    }

    public void g(Ad ad, BookmarkAdButton bookmarkAdButton) {
        if (bookmarkAdButton.isActivated()) {
            this.b.a(ad.id(), ViewUris.i1.toString(), this);
            bookmarkAdButton.setBookmarked(false);
            return;
        }
        this.a.a(ad.id(), ViewUris.i1.toString(), this);
        bookmarkAdButton.setBookmarked(true);
    }
}
