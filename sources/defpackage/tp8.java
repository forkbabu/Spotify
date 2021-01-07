package defpackage;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.connection.g;
import com.spotify.music.connection.l;
import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import com.spotify.music.features.tasteonboarding.i;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: tp8  reason: default package */
public class tp8 implements gp8 {
    private final vp8 a;
    private final i b;
    private final y c;
    private final lp8 d;
    private final l e;
    private b f = EmptyDisposable.INSTANCE;
    private b g = c.a();
    private hp8 h;
    private ArtistSearchResponse i;
    private boolean j;

    /* renamed from: tp8$a */
    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            bundle.putParcelable("key_response", tp8.this.i);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
            if (bundle != null) {
                tp8.this.i = (ArtistSearchResponse) bundle.getParcelable("key_response");
            }
        }
    }

    public tp8(vp8 vp8, i iVar, y yVar, lp8 lp8, k kVar, l lVar) {
        this.a = vp8;
        this.b = iVar;
        this.c = yVar;
        this.d = lp8;
        this.e = lVar;
        kVar.y0(new a());
    }

    private void e(String str) {
        this.f.dispose();
        if (!this.j) {
            hp8 hp8 = this.h;
            hp8.getClass();
            hp8.s2();
        } else if (MoreObjects.isNullOrEmpty(str)) {
            hp8 hp82 = this.h;
            hp82.getClass();
            hp82.t0();
            this.i = null;
        } else {
            this.f = this.a.b(str).q(new m1e()).o0(this.c).subscribe(new op8(this, str), new sp8(this));
        }
    }

    @Override // defpackage.gp8
    public void a() {
        this.f.dispose();
        this.g.dispose();
        hp8 hp8 = this.h;
        hp8.getClass();
        hp8.O();
        this.h = null;
    }

    @Override // defpackage.gp8
    public void b() {
        this.d.c();
        this.b.f();
    }

    @Override // defpackage.gp8
    public void f(String str) {
        e(str);
    }

    public void g(String str, ArtistSearchResponse artistSearchResponse) {
        this.i = artistSearchResponse;
        if (artistSearchResponse.results().isEmpty()) {
            hp8 hp8 = this.h;
            hp8.getClass();
            hp8.G0(str);
            return;
        }
        hp8 hp82 = this.h;
        hp82.getClass();
        hp82.i1(artistSearchResponse.results(), false);
        this.h.m1();
    }

    public void h(Throwable th) {
        Logger.e(th, "Failed to get a search result", new Object[0]);
        hp8 hp8 = this.h;
        hp8.getClass();
        hp8.E();
    }

    public void i(ArtistSearchResponse artistSearchResponse) {
        this.i = artistSearchResponse;
        hp8 hp8 = this.h;
        hp8.getClass();
        hp8.i1(artistSearchResponse.results(), true);
    }

    public void j(g gVar) {
        gVar.getClass();
        boolean z = gVar instanceof g.c;
        this.j = z;
        if (!z) {
            hp8 hp8 = this.h;
            hp8.getClass();
            hp8.s2();
            return;
        }
        ArtistSearchResponse artistSearchResponse = this.i;
        if (artistSearchResponse == null || artistSearchResponse.results().isEmpty()) {
            hp8 hp82 = this.h;
            hp82.getClass();
            hp82.t0();
            return;
        }
        hp8 hp83 = this.h;
        hp83.getClass();
        hp83.i1(this.i.results(), false);
        hp8 hp84 = this.h;
        hp84.getClass();
        hp84.m1();
    }

    @Override // defpackage.gp8
    public void r(String str) {
        e(str);
    }

    @Override // defpackage.gp8
    public void s(int i2, int i3) {
        String str;
        ArtistSearchResponse artistSearchResponse = this.i;
        if ((artistSearchResponse == null || artistSearchResponse.nextPage() == null) ? false : true) {
            ArtistSearchResponse artistSearchResponse2 = this.i;
            artistSearchResponse2.getClass();
            str = artistSearchResponse2.nextPage();
        } else {
            str = null;
        }
        if (str != null) {
            this.f.dispose();
            this.f = this.a.a(str).q(new m1e()).o0(this.c).subscribe(new qp8(this), rp8.a);
        }
    }

    @Override // defpackage.gp8
    public void t(hp8 hp8) {
        this.h = hp8;
        this.g = this.e.a().E().o0(this.c).subscribe(new pp8(this));
    }

    @Override // defpackage.gp8
    public void u(String str) {
        this.d.d(null);
    }

    @Override // defpackage.gp8
    public void v(int i2, TasteOnboardingItem tasteOnboardingItem, String str) {
        lp8 lp8 = this.d;
        ArtistSearchResponse artistSearchResponse = this.i;
        artistSearchResponse.getClass();
        lp8.b(i2, artistSearchResponse.results().size() - 1, null, tasteOnboardingItem.id(), tasteOnboardingItem.logging().b(), tasteOnboardingItem.logging().c(), tasteOnboardingItem.logging().e());
        this.b.g(tasteOnboardingItem);
    }

    @Override // defpackage.gp8
    public boolean w() {
        ArtistSearchResponse artistSearchResponse = this.i;
        return (artistSearchResponse == null || artistSearchResponse.nextPage() == null) ? false : true;
    }

    @Override // defpackage.gp8
    public boolean x(String str) {
        this.d.e(null);
        this.b.f();
        return true;
    }
}
