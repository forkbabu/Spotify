package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class f {

    private static final class a<R extends i> extends BasePendingResult<R> {
        private final R n;

        public a(c cVar, R r) {
            super(cVar);
            this.n = r;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final R f(Status status) {
            return this.n;
        }
    }

    @RecentlyNonNull
    public static <R extends i> e<R> a(@RecentlyNonNull R r, @RecentlyNonNull c cVar) {
        g.k(r, "Result must not be null");
        g.d(!((Status) r).r2(), "Status code must not be SUCCESS");
        a aVar = new a(null, r);
        aVar.a(r);
        return aVar;
    }
}
