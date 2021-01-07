package com.spotify.playlist.endpoints.exceptions;

import com.google.protobuf.u;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.c0;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;
import java.util.ArrayList;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class a {
    public static final C0372a b = new C0372a(null);
    private final c0 a;

    /* renamed from: com.spotify.playlist.endpoints.exceptions.a$a  reason: collision with other inner class name */
    public static final class C0372a {
        public C0372a(f fVar) {
        }

        public static final Exception a(C0372a aVar, Response response, StackTraceElement[] stackTraceElementArr) {
            Exception exc;
            int status = response.getStatus();
            if (status == 400) {
                exc = new BadRequestException(response);
                aVar.c(exc, stackTraceElementArr);
            } else if (status == 507) {
                exc = new InsufficientStorageException(response);
                aVar.c(exc, stackTraceElementArr);
            } else if (status == 403) {
                exc = new ForbiddenException(response);
                aVar.c(exc, stackTraceElementArr);
            } else if (status != 404) {
                return null;
            } else {
                exc = new NotFoundException(response);
                aVar.c(exc, stackTraceElementArr);
            }
            return exc;
        }

        public static final Exception b(C0372a aVar, Response response, Response response2, StackTraceElement[] stackTraceElementArr) {
            if (response.getStatus() != 401) {
                return null;
            }
            NotLoggedInException notLoggedInException = new NotLoggedInException(response2);
            aVar.c(notLoggedInException, stackTraceElementArr);
            return notLoggedInException;
        }

        private final Exception c(Exception exc, StackTraceElement[] stackTraceElementArr) {
            ArrayList arrayList = new ArrayList();
            StackTraceElement[] stackTrace = exc.getStackTrace();
            h.d(stackTrace, "exception.stackTrace");
            kotlin.collections.d.b(arrayList, stackTrace);
            arrayList.add(new StackTraceElement(a.class.getName(), "Playlist API caller stack trace below", null, -1));
            kotlin.collections.d.b(arrayList, stackTraceElementArr);
            Object[] array = arrayList.toArray(new StackTraceElement[0]);
            if (array != null) {
                exc.setStackTrace((StackTraceElement[]) array);
                return exc;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static final class b<T, R> implements l<Response, io.reactivex.a> {
        final /* synthetic */ a a;
        final /* synthetic */ StackTraceElement[] b;

        b(a aVar, StackTraceElement[] stackTraceElementArr) {
            this.a = aVar;
            this.b = stackTraceElementArr;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public io.reactivex.a apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            C0372a aVar = a.b;
            StackTraceElement[] stackTraceElementArr = this.b;
            h.d(stackTraceElementArr, "callerStackTrace");
            Exception a2 = C0372a.a(aVar, response2, stackTraceElementArr);
            if (a2 != null) {
                return a.a(this.a, response2).t(new b(this, response2, a2));
            }
            return io.reactivex.internal.operators.completable.b.a;
        }
    }

    static final class c<Upstream, Downstream> implements w<Response, u> {
        final /* synthetic */ a a;
        final /* synthetic */ StackTraceElement[] b;
        final /* synthetic */ u c;

        /* renamed from: com.spotify.playlist.endpoints.exceptions.a$c$a  reason: collision with other inner class name */
        static final class C0373a<T, R> implements l<Response, v<? extends u>> {
            final /* synthetic */ c a;

            C0373a(c cVar) {
                this.a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public v<? extends u> apply(Response response) {
                Response response2 = response;
                h.e(response2, "response");
                C0372a aVar = a.b;
                StackTraceElement[] stackTraceElementArr = this.a.b;
                h.d(stackTraceElementArr, "callerStackTrace");
                Exception a2 = C0372a.a(aVar, response2, stackTraceElementArr);
                if (a2 != null) {
                    return a.a(this.a.a, response2).P().W(new d(this, response2, a2), false, Integer.MAX_VALUE);
                }
                return s.i0(this.a.c.getParserForType().a(response2.getBody()));
            }
        }

        c(a aVar, StackTraceElement[] stackTraceElementArr, u uVar) {
            this.a = aVar;
            this.b = stackTraceElementArr;
            this.c = uVar;
        }

        @Override // io.reactivex.w
        public final v<u> apply(s<Response> sVar) {
            h.e(sVar, "upstream");
            return sVar.J0(new C0373a(this));
        }
    }

    static final class d<Upstream, Downstream> implements e0<Response, u> {
        final /* synthetic */ a a;
        final /* synthetic */ StackTraceElement[] b;
        final /* synthetic */ u c;

        /* renamed from: com.spotify.playlist.endpoints.exceptions.a$d$a  reason: collision with other inner class name */
        static final class C0374a<T, R> implements l<Response, d0<? extends u>> {
            final /* synthetic */ d a;

            C0374a(d dVar) {
                this.a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public d0<? extends u> apply(Response response) {
                Response response2 = response;
                h.e(response2, "response");
                C0372a aVar = a.b;
                StackTraceElement[] stackTraceElementArr = this.a.b;
                h.d(stackTraceElementArr, "callerStackTrace");
                Exception a2 = C0372a.a(aVar, response2, stackTraceElementArr);
                if (a2 != null) {
                    return a.a(this.a.a, response2).s(new e(this, response2, a2));
                }
                return z.z(this.a.c.getParserForType().a(response2.getBody()));
            }
        }

        d(a aVar, StackTraceElement[] stackTraceElementArr, u uVar) {
            this.a = aVar;
            this.b = stackTraceElementArr;
            this.c = uVar;
        }

        @Override // io.reactivex.e0
        public final d0<u> a(z<Response> zVar) {
            h.e(zVar, "upstream");
            return zVar.s(new C0374a(this));
        }
    }

    public a(Cosmonaut cosmonaut) {
        c0 c0Var = (c0) je.c0(cosmonaut, "cosmonaut", c0.class, "cosmonaut.createCosmosSe…osmosService::class.java)");
        h.e(c0Var, "mSessionCosmosService");
        this.a = c0Var;
    }

    public static final z a(a aVar, Response response) {
        z<Response> E = aVar.a.a().E(new c(response));
        h.d(E, "mSessionCosmosService\n  …nErrorReturn { original }");
        return E;
    }

    public final l<Response, io.reactivex.a> b() {
        return new b(this, new Exception("unused").getStackTrace());
    }

    public final <T extends u> w<Response, ? extends u> c(T t) {
        h.e(t, "defaultInstance");
        return new c(this, new Exception("unused").getStackTrace(), t);
    }

    public final <T extends u> e0<Response, ? extends u> d(T t) {
        h.e(t, "defaultInstance");
        return new d(this, new Exception("unused").getStackTrace(), t);
    }
}
