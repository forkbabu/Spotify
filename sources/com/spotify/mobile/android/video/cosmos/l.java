package com.spotify.mobile.android.video.cosmos;

import com.spotify.mobile.android.video.exo.f;
import com.spotify.mobile.android.video.exo.v;
import com.spotify.mobile.android.video.f0;

public class l {
    private final k a;
    private Long b;
    private f0 c;
    private v d;

    /* access modifiers changed from: package-private */
    public class a implements f0.a {
        a() {
        }

        @Override // com.spotify.mobile.android.video.f0.a
        public void a(long j) {
            l.this.a.b(k.d);
        }
    }

    public l(k kVar) {
        this.a = kVar;
    }

    private boolean b() {
        Long l = this.b;
        return (l == null || l.longValue() < 0 || this.c == null) ? false : true;
    }

    private void e() {
        ((f) this.c).e(this.d);
        this.d = ((f) this.c).a(new long[]{this.b.longValue()}, new a());
    }

    public Long c() {
        return this.b;
    }

    public void d(Long l) {
        Long l2 = this.b;
        if (l2 == null || l == null || !l2.equals(l)) {
            this.b = l;
            if (b()) {
                e();
            }
        }
    }

    public void f(f0 f0Var) {
        f0 f0Var2 = this.c;
        if (f0Var2 != f0Var) {
            if (f0Var2 != null) {
                ((f) f0Var2).e(this.d);
            }
            this.c = f0Var;
            if (b()) {
                e();
            }
        }
    }

    public void g() {
        f0 f0Var = this.c;
        if (f0Var != null) {
            ((f) f0Var).e(this.d);
        }
        this.b = null;
    }
}
