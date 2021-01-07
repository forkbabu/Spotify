package androidx.room;

import io.reactivex.a0;
import io.reactivex.c0;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.p;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class m {
    public static final Object a = new Object();

    static class a implements l<Object, p<T>> {
        final /* synthetic */ io.reactivex.l a;

        a(io.reactivex.l lVar) {
            this.a = lVar;
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            return this.a;
        }
    }

    static class b implements c0<T> {
        final /* synthetic */ Callable a;

        b(Callable callable) {
            this.a = callable;
        }

        @Override // io.reactivex.c0
        public void subscribe(a0<T> a0Var) {
            try {
                a0Var.onSuccess((T) this.a.call());
            } catch (EmptyResultSetException e) {
                a0Var.f(e);
            }
        }
    }

    public static <T> s<T> a(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<T> callable) {
        Executor executor;
        if (z) {
            executor = roomDatabase.m();
        } else {
            executor = roomDatabase.l();
        }
        y b2 = io.reactivex.schedulers.a.b(executor);
        return new ObservableFlatMapMaybe(new ObservableUnsubscribeOn(s.y(new l(strArr, roomDatabase)).I0(b2), b2).o0(b2), new a(io.reactivex.l.j(callable)), false);
    }

    public static <T> z<T> b(Callable<T> callable) {
        return z.g(new b(callable));
    }
}
