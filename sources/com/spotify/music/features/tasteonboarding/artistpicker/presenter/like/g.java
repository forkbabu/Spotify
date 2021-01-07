package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.tasteonboarding.c;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import io.reactivex.s;
import io.reactivex.y;

public class g implements i {
    private final m a;
    private final f b;
    private final c c;
    private final y d;
    private final fq8 e;
    private final boolean f;
    private final io.reactivex.disposables.a g = new io.reactivex.disposables.a();

    class a extends com.spotify.mobile.android.util.ui.m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            g.this.g.f();
        }
    }

    public g(m mVar, f fVar, c cVar, y yVar, fq8 fq8, boolean z, k kVar) {
        this.a = mVar;
        this.b = fVar;
        this.c = cVar;
        this.d = yVar;
        this.e = fq8;
        this.f = z;
        kVar.y0(new a());
    }

    private void e(String str, boolean z) {
        s<j> N0 = this.b.a(str).N0(1);
        this.g.b(s.n(this.e.a(), N0, d.a).N0(1).o0(this.d).subscribe(new b(this, str, z), c.a));
    }

    @Override // com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.i
    public void a(String str) {
        this.c.a(str);
        e(str, true);
    }

    @Override // com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.i
    public void b(String str) {
        this.c.f(str);
        e(str, false);
    }

    public void d(String str, boolean z, u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        boolean booleanValue = f2.booleanValue();
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        if (this.f || !booleanValue) {
            this.a.g(s2);
            if (s2.g() != z) {
                this.a.e(str, z);
            }
        }
    }
}
