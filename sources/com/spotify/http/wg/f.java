package com.spotify.http.wg;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.w;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class f implements WebgateTokenProvider {
    public static final a c = new a(null);
    private final a.C0156a a;
    private final a.b b;

    public static final class a {

        /* renamed from: com.spotify.http.wg.f$a$a  reason: collision with other inner class name */
        private static final class C0156a {
            private TokenResponse a;
            private final b b;

            public C0156a(b bVar) {
                h.e(bVar, "tokenRequester");
                this.b = bVar;
            }

            public final TokenResponse a() {
                return this.a;
            }

            public final synchronized TokenResponse b(int i) {
                TokenResponse c;
                c = this.b.c(i, true);
                this.a = c;
                return c;
            }

            public final synchronized void c() {
                this.a = null;
            }

            public final synchronized TokenResponse d(int i) {
                TokenResponse tokenResponse = this.a;
                if ((tokenResponse != null ? tokenResponse.accessToken : null) == null) {
                    this.a = this.b.c(i, false);
                }
                return this.a;
            }
        }

        public static final class b {
            private final PublishSubject<ng0> a;
            private final e b;
            private final y c;
            private final w<Response, TokenResponse> d;

            /* access modifiers changed from: package-private */
            /* renamed from: com.spotify.http.wg.f$a$b$a  reason: collision with other inner class name */
            public static final class C0157a<T, R> implements l<TokenResponse, Optional<TokenResponse>> {
                public static final C0157a a = new C0157a();

                C0157a() {
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // io.reactivex.functions.l
                public Optional<TokenResponse> apply(TokenResponse tokenResponse) {
                    TokenResponse tokenResponse2 = tokenResponse;
                    h.e(tokenResponse2, "it");
                    return Optional.of(tokenResponse2);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.spotify.http.wg.f$a$b$b  reason: collision with other inner class name */
            public static final class C0158b<T, R> implements l<Throwable, Optional<TokenResponse>> {
                public static final C0158b a = new C0158b();

                C0158b() {
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // io.reactivex.functions.l
                public Optional<TokenResponse> apply(Throwable th) {
                    h.e(th, "it");
                    return Optional.absent();
                }
            }

            /* access modifiers changed from: package-private */
            public static final class c<T> implements g<Throwable> {
                public static final c a = new c();

                c() {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // io.reactivex.functions.g
                public void accept(Throwable th) {
                    Logger.e(th, "Could not obtain access token", new Object[0]);
                }
            }

            public b(e eVar, y yVar, w<Response, TokenResponse> wVar) {
                h.e(eVar, "endpoint");
                h.e(yVar, "scheduler");
                h.e(wVar, "parser");
                this.b = eVar;
                this.c = yVar;
                this.d = wVar;
                PublishSubject<ng0> h1 = PublishSubject.h1();
                h.d(h1, "PublishSubject.create()");
                this.a = h1;
            }

            public final void a() {
                this.a.onNext(ng0.a());
            }

            public final s<Optional<TokenResponse>> b(int i, boolean z) {
                s<R> P = this.b.a(z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY).P().q(this.d).j0(C0157a.a).O0(this.a).T().E(C0158b.a).m(c.a).K((long) i, TimeUnit.MILLISECONDS, this.c, z.z(Optional.absent())).P();
                h.d(P, "endpoint\n               …          .toObservable()");
                return P;
            }

            public final TokenResponse c(int i, boolean z) {
                try {
                    Optional<TokenResponse> d2 = b(i, z).d();
                    h.d(d2, "token");
                    if (d2.isPresent()) {
                        return d2.get();
                    }
                    return null;
                } catch (RuntimeException e) {
                    if (e.getCause() != null) {
                        Throwable cause = e.getCause();
                        h.c(cause);
                        if (cause.getClass().equals(InterruptedException.class)) {
                            a();
                            Thread.currentThread().interrupt();
                            return null;
                        }
                    }
                    throw e;
                }
            }
        }

        public a(kotlin.jvm.internal.f fVar) {
        }

        public static final String a(a aVar, TokenResponse tokenResponse) {
            int i;
            String str = null;
            if ((tokenResponse != null ? Integer.valueOf(tokenResponse.errorCode) : null) == null || (i = tokenResponse.errorCode) <= 0) {
                if (tokenResponse != null) {
                    str = tokenResponse.accessToken;
                }
                if (str != null) {
                    String str2 = tokenResponse.accessToken;
                    h.d(str2, "tokenResponse.accessToken");
                    return str2;
                }
            } else {
                Logger.d("sp://auth/v2/token responded with an error: %d, %s", Integer.valueOf(i), tokenResponse.errorDescription);
            }
            throw new WebgateTokenProvider.WebgateTokenException();
        }
    }

    public f(a.b bVar) {
        h.e(bVar, "tokenRequester");
        this.b = bVar;
        this.a = new a.C0156a(bVar);
    }

    @Override // com.spotify.http.wg.WebgateTokenProvider
    public String a(int i) {
        return a.a(c, this.a.d(i));
    }

    @Override // com.spotify.http.wg.WebgateTokenProvider
    public String b(int i, boolean z) {
        a aVar = c;
        if (z) {
            return a.a(aVar, this.a.b(i));
        }
        return a.a(aVar, this.a.d(i));
    }

    @Override // com.spotify.http.wg.WebgateTokenProvider
    public void onStop() {
        this.b.a();
    }

    @Override // com.spotify.http.wg.WebgateTokenProvider
    public void reset() {
        if (this.a.a() != null) {
            this.b.a();
            this.a.c();
        }
    }
}
