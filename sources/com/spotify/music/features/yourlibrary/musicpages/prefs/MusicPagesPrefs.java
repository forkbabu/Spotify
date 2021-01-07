package com.spotify.music.features.yourlibrary.musicpages.prefs;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.mobius.rx2.o;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.j;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;
import com.spotify.music.json.d;
import com.spotify.music.json.g;
import com.spotify.rxjava2.p;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.io.IOException;

public class MusicPagesPrefs implements m {
    private static final SpSharedPreferences.b<Object, String> t = SpSharedPreferences.b.e("music_pages_prefs");
    public static final /* synthetic */ int u = 0;
    private final cqe a;
    private final d b;
    private final a c;
    private final s<String> f;
    private final y n;
    private final y o;
    private final PublishSubject<k> p = PublishSubject.h1();
    private final p q = new p();
    private com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m r;
    private s<com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m> s;

    interface a {
    }

    public MusicPagesPrefs(Context context, i iVar, cqe cqe, g gVar, io.reactivex.g<SessionState> gVar2, y yVar, y yVar2, n nVar) {
        t tVar = new t(iVar, context);
        v vVar = new v(gVar2.O(r.a).C(c.a));
        this.c = tVar;
        this.a = cqe;
        this.b = new s(this, gVar);
        this.f = vVar;
        this.n = yVar;
        this.o = yVar2;
        Lifecycle A = nVar.A();
        if (A.b() == Lifecycle.State.RESUMED) {
            k();
        }
        A.a(this);
    }

    private s<com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m> j() {
        if (this.s == null) {
            this.s = s.B(new a(this)).o0(this.o).v0(1).h1();
        }
        return this.s;
    }

    private void k() {
        this.q.b(j().o0(this.o).subscribe(new b(this), e.a));
    }

    public /* synthetic */ ia2 b() {
        return new o(this.n);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.n);
    }

    public /* synthetic */ io.reactivex.v d(j.b bVar) {
        return this.f.N0(1).j0(p.a);
    }

    public k e(j.a aVar) {
        String a2 = aVar.a();
        t tVar = (t) this.c;
        PrefsModel prefsModel = null;
        String m = tVar.a.b(tVar.b, a2).m(t, null);
        if (!MoreObjects.isNullOrEmpty(m)) {
            try {
                prefsModel = (PrefsModel) this.b.a().readValue(m, PrefsModel.class);
            } catch (IOException e) {
                Assertion.i("Failed reading music pages prefs.", e);
            }
        }
        if (prefsModel == null) {
            prefsModel = PrefsModel.DEFAULT;
        }
        return k.c(prefsModel);
    }

    public io.reactivex.v f() {
        com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m mVar = this.r;
        if (mVar == null) {
            m.a a2 = com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m.a();
            a2.b(100);
            mVar = a2.a();
        }
        s<Object> sVar = e0.a;
        q qVar = q.a;
        com.spotify.mobius.rx2.m f2 = com.spotify.mobius.rx2.i.f();
        f2.h(j.b.class, new f(this));
        f2.h(j.a.class, new l(this));
        return sVar.q(com.spotify.mobius.rx2.i.d(com.spotify.mobius.rx2.i.c(qVar, f2.i()).e(o.a).b(new h(this)).d(new k(this)).h(com.spotify.mobius.rx2.i.a(this.p)), mVar));
    }

    public /* synthetic */ void g(com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m mVar) {
        this.r = mVar;
    }

    public s<PagePrefs> h(String str) {
        s<com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m> j = j();
        long d = this.a.d();
        this.p.onNext(k.b(str, Long.valueOf(d)));
        return j.Q(d.a).j0(new j(str, d)).o0(this.o).F(g.a);
    }

    public void i(String str, String str2, Optional<String> optional) {
        this.p.onNext(k.d(str, str2, optional, Long.valueOf(this.a.d())));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.q.a();
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        k();
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        String str;
        com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m mVar = this.r;
        if (mVar != null && mVar.f().isPresent() && mVar.d().isPresent()) {
            String str2 = mVar.f().get();
            try {
                str = this.b.a().writeValueAsString(mVar.d().get());
            } catch (JsonProcessingException e) {
                Assertion.i("Failed writing your library prefs.", e);
                str = null;
            }
            if (str != null) {
                t tVar = (t) this.c;
                SpSharedPreferences.a<Object> b2 = tVar.a.b(tVar.b, str2).b();
                b2.f(t, str);
                b2.i();
            }
        }
    }
}
