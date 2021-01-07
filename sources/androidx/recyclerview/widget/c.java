package androidx.recyclerview.widget;

import androidx.recyclerview.widget.m;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class c<T> {
    private final Executor a;
    private final m.d<T> b;

    public static final class a<T> {
        private static final Object c = new Object();
        private static Executor d;
        private Executor a;
        private final m.d<T> b;

        public a(m.d<T> dVar) {
            this.b = dVar;
        }

        public c<T> a() {
            if (this.a == null) {
                synchronized (c) {
                    if (d == null) {
                        d = Executors.newFixedThreadPool(2);
                    }
                }
                this.a = d;
            }
            return new c<>(null, this.a, this.b);
        }
    }

    c(Executor executor, Executor executor2, m.d<T> dVar) {
        this.a = executor2;
        this.b = dVar;
    }

    public Executor a() {
        return this.a;
    }

    public m.d<T> b() {
        return this.b;
    }

    public Executor c() {
        return null;
    }
}
