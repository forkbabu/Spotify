package io.reactivex.schedulers;

import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.i;
import io.reactivex.y;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class a {
    static final y a = io.reactivex.plugins.a.f(new h());
    static final y b = io.reactivex.plugins.a.c(new b());
    static final y c = io.reactivex.plugins.a.d(new c());
    static final y d = i.e();

    /* renamed from: io.reactivex.schedulers.a$a  reason: collision with other inner class name */
    static final class C0622a {
        static final y a = new io.reactivex.internal.schedulers.a();
    }

    static final class b implements Callable<y> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public y call() {
            return C0622a.a;
        }
    }

    static final class c implements Callable<y> {
        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public y call() {
            return d.a;
        }
    }

    static final class d {
        static final y a = new io.reactivex.internal.schedulers.d();
    }

    static final class e {
        static final y a = new io.reactivex.internal.schedulers.e();
    }

    static final class f implements Callable<y> {
        f() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public y call() {
            return e.a;
        }
    }

    static final class g {
        static final y a = new io.reactivex.internal.schedulers.h();
    }

    static final class h implements Callable<y> {
        h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public y call() {
            return g.a;
        }
    }

    static {
        io.reactivex.plugins.a.e(new f());
    }

    public static y a() {
        return b;
    }

    public static y b(Executor executor) {
        return new ExecutorScheduler(executor, false);
    }

    public static y c() {
        return c;
    }

    public static y d() {
        return a;
    }

    public static y e() {
        return d;
    }
}
