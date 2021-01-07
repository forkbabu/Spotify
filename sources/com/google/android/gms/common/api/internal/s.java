package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

public abstract class s<A extends a.b, ResultT> {
    private final c[] a;
    private final boolean b;
    private final int c;

    public static class a<A extends a.b, ResultT> {
        private q<A, h<ResultT>> a;
        private boolean b = true;
        private c[] c;
        private int d = 0;

        a(t0 t0Var) {
        }

        @RecentlyNonNull
        public s<A, ResultT> a() {
            g.d(this.a != null, "execute parameter required");
            return new u0(this, this.c, this.b, this.d);
        }

        @RecentlyNonNull
        public a<A, ResultT> b(@RecentlyNonNull q<A, h<ResultT>> qVar) {
            this.a = qVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> c(boolean z) {
            this.b = z;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> d(@RecentlyNonNull c... cVarArr) {
            this.c = cVarArr;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> e(int i) {
            this.d = i;
            return this;
        }
    }

    protected s(@RecentlyNonNull c[] cVarArr, boolean z, int i) {
        this.a = cVarArr;
        this.b = cVarArr != null && z;
        this.c = i;
    }

    @RecentlyNonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(@RecentlyNonNull A a2, @RecentlyNonNull h<ResultT> hVar);

    public boolean c() {
        return this.b;
    }

    @RecentlyNullable
    public final c[] d() {
        return this.a;
    }

    public final int e() {
        return this.c;
    }
}
