package io.reactivex.plugins;

import io.reactivex.b0;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.c;
import io.reactivex.functions.g;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class a {
    static volatile g<? super Throwable> a;
    static volatile c<? super io.reactivex.g, ? super upf, ? extends upf> b;
    static volatile c<? super l, ? super n, ? extends n> c;
    static volatile c<? super s, ? super x, ? extends x> d;
    static volatile c<? super z, ? super b0, ? extends b0> e;
    static volatile c<? super io.reactivex.a, ? super io.reactivex.c, ? extends io.reactivex.c> f;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    static <T, U, R> R a(c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.a(t, u);
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    static y b(Callable<y> callable) {
        try {
            y call = callable.call();
            io.reactivex.internal.functions.a.c(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    public static y c(Callable<y> callable) {
        return b(callable);
    }

    public static y d(Callable<y> callable) {
        return b(callable);
    }

    public static y e(Callable<y> callable) {
        return b(callable);
    }

    public static y f(Callable<y> callable) {
        return b(callable);
    }

    public static void g(Throwable th) {
        g<? super Throwable> gVar = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                z = false;
            }
            if (!z) {
                th = new UndeliverableException(th);
            }
        }
        if (gVar != null) {
            try {
                gVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static io.reactivex.c h(io.reactivex.a aVar, io.reactivex.c cVar) {
        c<? super io.reactivex.a, ? super io.reactivex.c, ? extends io.reactivex.c> cVar2 = f;
        return cVar2 != null ? (io.reactivex.c) a(cVar2, aVar, cVar) : cVar;
    }

    public static <T> n<? super T> i(l<T> lVar, n<? super T> nVar) {
        c<? super l, ? super n, ? extends n> cVar = c;
        return cVar != null ? (n) a(cVar, lVar, nVar) : nVar;
    }

    public static <T> x<? super T> j(s<T> sVar, x<? super T> xVar) {
        c<? super s, ? super x, ? extends x> cVar = d;
        return cVar != null ? (x) a(cVar, sVar, xVar) : xVar;
    }

    public static <T> b0<? super T> k(z<T> zVar, b0<? super T> b0Var) {
        c<? super z, ? super b0, ? extends b0> cVar = e;
        return cVar != null ? (b0) a(cVar, zVar, b0Var) : b0Var;
    }

    public static <T> upf<? super T> l(io.reactivex.g<T> gVar, upf<? super T> upf) {
        c<? super io.reactivex.g, ? super upf, ? extends upf> cVar = b;
        return cVar != null ? (upf) a(cVar, gVar, upf) : upf;
    }

    public static void m(g<? super Throwable> gVar) {
        a = gVar;
    }

    public static void n(c<? super io.reactivex.a, ? super io.reactivex.c, ? extends io.reactivex.c> cVar) {
        f = cVar;
    }

    public static void o(c<? super io.reactivex.g, ? super upf, ? extends upf> cVar) {
        b = cVar;
    }

    public static void p(c<? super l, n, ? extends n> cVar) {
        c = cVar;
    }

    public static void q(c<? super s, ? super x, ? extends x> cVar) {
        d = cVar;
    }

    public static void r(c<? super z, ? super b0, ? extends b0> cVar) {
        e = cVar;
    }
}
