package com.spotify.music.features.yourlibrary.musicpages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.kpd;
import defpackage.mpd;
import io.reactivex.subjects.PublishSubject;

public class k1 implements g<MusicPagesModel, s0> {
    public static final /* synthetic */ int q = 0;
    private final kpd a;
    private final c.a b;
    private final i79 c;
    private mpd f = mpd.c();
    private c n;
    private c o;
    private d p;

    class a implements h<MusicPagesModel> {
        final /* synthetic */ PublishSubject a;
        final /* synthetic */ io.reactivex.disposables.b b;

        a(PublishSubject publishSubject, io.reactivex.disposables.b bVar) {
            this.a = publishSubject;
            this.b = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            this.a.onNext((MusicPagesModel) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            k1 k1Var = k1.this;
            int i = k1.q;
            m0 m0Var = m0.a;
            k1Var.n = m0Var;
            k1.this.o = m0Var;
            k1.this.p = j0.a;
            this.b.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements d0 {

        class a implements kpd.a {
            a() {
            }

            @Override // defpackage.kpd.a
            public void a() {
                k1.this.o.a();
            }

            @Override // defpackage.kpd.a
            public void b() {
                k1.this.n.a();
            }

            @Override // defpackage.kpd.a
            public void c(mpd.b bVar) {
                k1.this.p.a(bVar);
            }
        }

        b() {
        }

        @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
        public void g(a0 a0Var) {
            kpd kpd = k1.this.a;
            mpd mpd = k1.this.f;
            a aVar = new a();
            kpd.getClass();
            UnmodifiableListIterator<mpd.b> listIterator = mpd.d().listIterator();
            while (listIterator.hasNext()) {
                mpd.b next = listIterator.next();
                Context context = a0Var.getContext();
                a0Var.b(C0707R.id.context_menu_filter, next.e(), l70.j(context, next.c(), androidx.core.content.a.b(context, next.a() ? R.color.green : R.color.gray_50))).a(new hpd(aVar, next));
            }
            if (mpd.b()) {
                CharSequence f = mpd.f();
                Context context2 = a0Var.getContext();
                a0Var.b(C0707R.id.context_menu_filter, f, l70.j(context2, SpotifyIconV2.SEARCH, androidx.core.content.a.b(context2, R.color.gray_50))).a(new fpd(aVar));
            }
            if (mpd.a()) {
                CharSequence e = mpd.e();
                Context context3 = a0Var.getContext();
                int b = androidx.core.content.a.b(context3, R.color.gray_50);
                int dimensionPixelSize = context3.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_icon_size);
                float f2 = ((float) dimensionPixelSize) / 2.0f;
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context3, SpotifyIconV2.ARROW_DOWN, f2);
                SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context3, SpotifyIconV2.ARROW_UP, f2);
                spotifyIconDrawable.r(b);
                spotifyIconDrawable2.r(b);
                int i = dimensionPixelSize / 6;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{spotifyIconDrawable, spotifyIconDrawable2});
                int i2 = i * 2;
                layerDrawable.setLayerInset(0, i, i2, i2, 0);
                layerDrawable.setLayerInset(1, i2, 0, i, i2);
                a0Var.b(C0707R.id.context_menu_sort, e, layerDrawable).a(new gpd(aVar));
            }
        }

        @Override // com.spotify.music.libs.viewuri.c.a
        public com.spotify.music.libs.viewuri.c getViewUri() {
            return k1.this.b.getViewUri();
        }
    }

    /* access modifiers changed from: private */
    public interface c {
        void a();
    }

    /* access modifiers changed from: private */
    public interface d {
        void a(mpd.b bVar);
    }

    public k1(kpd kpd, c.a aVar, i79 i79) {
        m0 m0Var = m0.a;
        this.n = m0Var;
        this.o = m0Var;
        this.p = j0.a;
        this.a = kpd;
        this.b = aVar;
        this.c = i79;
    }

    public d0 j() {
        return new b();
    }

    public /* synthetic */ void k(mpd mpd) {
        this.f = mpd;
        this.c.a1();
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        this.n = new p0(da2);
        this.o = new o0(da2);
        this.p = new l0(da2);
        PublishSubject h1 = PublishSubject.h1();
        return new a(h1, h1.j0(x0.a).E().subscribe(new n0(this), k0.a));
    }
}
