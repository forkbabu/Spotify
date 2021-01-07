package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;

public interface s {

    public static final class a {
        private final Handler a;
        private final s b;

        public a(Handler handler, s sVar) {
            if (sVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = sVar;
        }

        public void a(String str, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new d(this, str, j, j2));
            }
        }

        public void b(ej ejVar) {
            synchronized (ejVar) {
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new f(this, ejVar));
            }
        }

        public void c(int i, long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new c(this, i, j));
            }
        }

        public void d(ej ejVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new b(this, ejVar));
            }
        }

        public void e(d0 d0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new a(this, d0Var));
            }
        }

        public void f(String str, long j, long j2) {
            s sVar = this.b;
            int i = f0.a;
            sVar.m(str, j, j2);
        }

        public void g(ej ejVar) {
            synchronized (ejVar) {
            }
            s sVar = this.b;
            int i = f0.a;
            sVar.H(ejVar);
        }

        public void h(int i, long j) {
            s sVar = this.b;
            int i2 = f0.a;
            sVar.Q(i, j);
        }

        public void i(ej ejVar) {
            s sVar = this.b;
            int i = f0.a;
            sVar.V(ejVar);
        }

        public void j(d0 d0Var) {
            s sVar = this.b;
            int i = f0.a;
            sVar.z(d0Var);
        }

        public void k(Surface surface) {
            s sVar = this.b;
            int i = f0.a;
            sVar.p(surface);
        }

        public void l(int i, int i2, int i3, float f) {
            s sVar = this.b;
            int i4 = f0.a;
            sVar.h(i, i2, i3, f);
        }

        public void m(Surface surface) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new e(this, surface));
            }
        }

        public void n(int i, int i2, int i3, float f) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new g(this, i, i2, i3, f));
            }
        }
    }

    void H(ej ejVar);

    void Q(int i, long j);

    void V(ej ejVar);

    void h(int i, int i2, int i3, float f);

    void m(String str, long j, long j2);

    void p(Surface surface);

    void z(d0 d0Var);
}
