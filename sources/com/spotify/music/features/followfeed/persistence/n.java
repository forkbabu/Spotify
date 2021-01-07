package com.spotify.music.features.followfeed.persistence;

import com.google.common.base.Optional;
import io.reactivex.z;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

public final class n implements f {
    private final m a;

    static final class a<V> implements Callable<Optional<Boolean>> {
        final /* synthetic */ n a;

        a(n nVar) {
            this.a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Optional<Boolean> call() {
            return Optional.fromNullable(this.a.a.b());
        }
    }

    static final class b<V> implements Callable<Optional<String>> {
        final /* synthetic */ n a;

        b(n nVar) {
            this.a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Optional<String> call() {
            return Optional.fromNullable(this.a.a.a());
        }
    }

    static final class c implements io.reactivex.functions.a {
        final /* synthetic */ n a;
        final /* synthetic */ boolean b;

        c(n nVar, boolean z) {
            this.a = nVar;
            this.b = z;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.a.d(this.b);
        }
    }

    static final class d implements io.reactivex.functions.a {
        final /* synthetic */ n a;
        final /* synthetic */ String b;

        d(n nVar, String str) {
            this.a = nVar;
            this.b = str;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.a.c(this.b);
        }
    }

    public n(m mVar) {
        h.e(mVar, "cacheOperations");
        this.a = mVar;
    }

    @Override // com.spotify.music.features.followfeed.persistence.f
    public z<Optional<String>> a() {
        z<Optional<String>> y = z.y(new b(this));
        h.d(y, "Single.fromCallable { Op…etNewestItemViewedId()) }");
        return y;
    }

    @Override // com.spotify.music.features.followfeed.persistence.f
    public z<Optional<Boolean>> b() {
        z<Optional<Boolean>> y = z.y(new a(this));
        h.d(y, "Single.fromCallable { Op….getHasNewItemsState()) }");
        return y;
    }

    @Override // com.spotify.music.features.followfeed.persistence.f
    public io.reactivex.a c(String str) {
        h.e(str, "newestItemViewedId");
        io.reactivex.a u = io.reactivex.a.u(new d(this, str));
        h.d(u, "Completable.fromAction {…dId(newestItemViewedId) }");
        return u;
    }

    @Override // com.spotify.music.features.followfeed.persistence.f
    public io.reactivex.a d(boolean z) {
        io.reactivex.a u = io.reactivex.a.u(new c(this, z));
        h.d(u, "Completable.fromAction {…asNewItems(hasNewItems) }");
        return u;
    }
}
