package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.v0;

public interface t {

    public interface b {
        void b(t tVar, v0 v0Var);
    }

    void a(b bVar);

    void b(Handler handler, v vVar);

    void c(v vVar);

    void d(s sVar);

    void e(b bVar, a0 a0Var);

    s f(a aVar, n nVar, long j);

    void g();

    public static final class a {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public a(Object obj) {
            this.a = obj;
            this.b = -1;
            this.c = -1;
            this.d = -1;
            this.e = -1;
        }

        public boolean a() {
            return this.b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public a(Object obj, int i, int i2, long j) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = -1;
        }

        public a(Object obj, long j) {
            this.a = obj;
            this.b = -1;
            this.c = -1;
            this.d = j;
            this.e = -1;
        }

        public a(Object obj, long j, int i) {
            this.a = obj;
            this.b = -1;
            this.c = -1;
            this.d = j;
            this.e = i;
        }
    }
}
