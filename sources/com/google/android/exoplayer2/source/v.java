package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.g;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public interface v {

    public static final class b {
        public final Map<String, List<String>> a;

        public b(m mVar, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.a = map;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final d0 c;
        public final Object d;
        public final long e;

        public c(int i, int i2, d0 d0Var, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = d0Var;
            this.d = obj;
            this.e = j;
        }
    }

    void B(int i, t.a aVar, c cVar);

    void D(int i, t.a aVar, b bVar, c cVar);

    void E(int i, t.a aVar);

    void J(int i, t.a aVar, b bVar, c cVar);

    void K(int i, t.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void L(int i, t.a aVar);

    void s(int i, t.a aVar, c cVar);

    void t(int i, t.a aVar, b bVar, c cVar);

    void u(int i, t.a aVar);

    public static final class a {
        public final int a;
        public final t.a b;
        private final CopyOnWriteArrayList<C0089a> c;
        private final long d;

        /* access modifiers changed from: private */
        /* renamed from: com.google.android.exoplayer2.source.v$a$a  reason: collision with other inner class name */
        public static final class C0089a {
            public final Handler a;
            public final v b;

            public C0089a(Handler handler, v vVar) {
                this.a = handler;
                this.b = vVar;
            }
        }

        public a() {
            this.c = new CopyOnWriteArrayList<>();
            this.a = 0;
            this.b = null;
            this.d = 0;
        }

        private long b(long j) {
            long b2 = u.b(j);
            if (b2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + b2;
        }

        private void n(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public void a(Handler handler, v vVar) {
            g.a((handler == null || vVar == null) ? false : true);
            this.c.add(new C0089a(handler, vVar));
        }

        public void c(int i, d0 d0Var, int i2, Object obj, long j) {
            c cVar = new c(1, i, d0Var, i2, obj, b(j), -9223372036854775807L);
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new d(this, next.b, cVar));
            }
        }

        public void d(m mVar, Uri uri, Map<String, List<String>> map, int i, int i2, d0 d0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(mVar, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, d0Var, i3, obj, b(j), b(j2));
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new e(this, next.b, bVar, cVar));
            }
        }

        public void e(m mVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            d(mVar, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public void f(m mVar, Uri uri, Map<String, List<String>> map, int i, int i2, d0 d0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(mVar, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, d0Var, i3, obj, b(j), b(j2));
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new g(this, next.b, bVar, cVar));
            }
        }

        public void g(m mVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            f(mVar, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public void h(m mVar, Uri uri, Map<String, List<String>> map, int i, int i2, d0 d0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            b bVar = new b(mVar, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, d0Var, i3, obj, b(j), b(j2));
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new c(this, next.b, bVar, cVar, iOException, z));
            }
        }

        public void i(m mVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            h(mVar, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        public void j(m mVar, int i, int i2, d0 d0Var, int i3, Object obj, long j, long j2, long j3) {
            b bVar = new b(mVar, mVar.a, Collections.emptyMap(), j3, 0, 0);
            c cVar = new c(i, i2, d0Var, i3, obj, b(j), b(j2));
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new a(this, next.b, bVar, cVar));
            }
        }

        public void k(m mVar, int i, long j) {
            j(mVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j);
        }

        public void l() {
            t.a aVar = this.b;
            aVar.getClass();
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new i(this, next.b, aVar));
            }
        }

        public void m() {
            t.a aVar = this.b;
            aVar.getClass();
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new f(this, next.b, aVar));
            }
        }

        public void o() {
            t.a aVar = this.b;
            aVar.getClass();
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new h(this, next.b, aVar));
            }
        }

        public void p(v vVar) {
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                if (next.b == vVar) {
                    this.c.remove(next);
                }
            }
        }

        public void q(int i, long j, long j2) {
            c cVar = new c(1, i, null, 3, null, b(j), b(j2));
            t.a aVar = this.b;
            aVar.getClass();
            Iterator<C0089a> it = this.c.iterator();
            while (it.hasNext()) {
                C0089a next = it.next();
                n(next.a, new b(this, next.b, aVar, cVar));
            }
        }

        public a r(int i, t.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }

        private a(CopyOnWriteArrayList<C0089a> copyOnWriteArrayList, int i, t.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = aVar;
            this.d = j;
        }
    }
}
