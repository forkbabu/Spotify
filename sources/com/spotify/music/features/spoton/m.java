package com.spotify.music.features.spoton;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.z1;
import io.reactivex.a0;
import io.reactivex.c0;
import io.reactivex.z;

public class m {
    private final z1 a;
    private v1 b;

    /* access modifiers changed from: private */
    public class b implements hg0<v1>, c0<v1> {
        private a0<v1> a;

        b(a aVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.hg0
        public void l(v1 v1Var) {
            v1 v1Var2 = v1Var;
            if (!this.a.d()) {
                this.a.onSuccess(v1Var2);
            }
        }

        @Override // defpackage.hg0
        public void onDisconnected() {
            m.this.a.q(this);
        }

        @Override // io.reactivex.c0
        public void subscribe(a0<v1> a0Var) {
            this.a = a0Var;
            m.this.a.p(this);
            m.this.a.i();
        }
    }

    public m(z1 z1Var) {
        this.a = z1Var;
    }

    public z<v1> b() {
        if (d()) {
            return z.z(this.b);
        }
        return z.g(new b(null)).p(new b(this));
    }

    public void c() {
        if (d()) {
            this.a.j();
        }
    }

    public boolean d() {
        return this.a.l();
    }

    public /* synthetic */ void e(v1 v1Var) {
        this.b = v1Var;
    }
}
