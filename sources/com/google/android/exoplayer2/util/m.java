package com.google.android.exoplayer2.util;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class m<T> {
    private final CopyOnWriteArrayList<b<T>> a = new CopyOnWriteArrayList<>();

    public interface a<T> {
        void a(T t);
    }

    /* access modifiers changed from: private */
    public static final class b<T> {
        private final Handler a;
        private final T b;
        private boolean c;

        public b(Handler handler, T t) {
            this.a = handler;
            this.b = t;
        }

        public void b(a<T> aVar) {
            this.a.post(new a(this, aVar));
        }

        public /* synthetic */ void c(a aVar) {
            if (!this.c) {
                aVar.a(this.b);
            }
        }

        public void d() {
            this.c = true;
        }
    }

    public void a(Handler handler, T t) {
        g.a((handler == null || t == null) ? false : true);
        c(t);
        this.a.add(new b<>(handler, t));
    }

    public void b(a<T> aVar) {
        Iterator<b<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(aVar);
        }
    }

    public void c(T t) {
        Iterator<b<T>> it = this.a.iterator();
        while (it.hasNext()) {
            b<T> next = it.next();
            if (((b) next).b == t) {
                next.d();
                this.a.remove(next);
            }
        }
    }
}
