package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

public class p<A extends a.b, L> {
    @RecentlyNonNull
    public final o<A, L> a;
    @RecentlyNonNull
    public final t<A, L> b;
    @RecentlyNonNull
    public final Runnable c;

    public static class a<A extends a.b, L> {
        private q<A, h<Void>> a;
        private q<A, h<Boolean>> b;
        private Runnable c = l0.a;
        private k<L> d;
        private c[] e;

        a(k0 k0Var) {
        }

        @RecentlyNonNull
        public p<A, L> a() {
            boolean z = false;
            g.d(this.a != null, "Must set register function");
            g.d(this.b != null, "Must set unregister function");
            if (this.d != null) {
                z = true;
            }
            g.d(z, "Must set holder");
            k.a<L> b2 = this.d.b();
            g.k(b2, "Key must not be null");
            return new p<>(new m0(this, this.d, this.e, true, 0), new o0(this, b2), l0.a, null);
        }

        @RecentlyNonNull
        public a<A, L> b(@RecentlyNonNull q<A, h<Void>> qVar) {
            this.a = qVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> c(@RecentlyNonNull c... cVarArr) {
            this.e = cVarArr;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> d(@RecentlyNonNull q<A, h<Boolean>> qVar) {
            this.b = qVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> e(@RecentlyNonNull k<L> kVar) {
            this.d = kVar;
            return this;
        }
    }

    p(o oVar, t tVar, Runnable runnable, k0 k0Var) {
        this.a = oVar;
        this.b = tVar;
        this.c = runnable;
    }

    @RecentlyNonNull
    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
