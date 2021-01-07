package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;

public interface m {

    public static final class a {
        private final Handler a;
        private final m b;

        public a(Handler handler, m mVar) {
            if (mVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = mVar;
        }

        public void a(int i) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new c(this, i));
            }
        }

        public void b(int i, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new b(this, i, j, j2));
            }
        }

        public void c(String str, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new d(this, str, j, j2));
            }
        }

        public void d(ej ejVar) {
            synchronized (ejVar) {
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new f(this, ejVar));
            }
        }

        public void e(ej ejVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new e(this, ejVar));
            }
        }

        public void f(d0 d0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new a(this, d0Var));
            }
        }

        public void g(int i) {
            m mVar = this.b;
            int i2 = f0.a;
            mVar.b(i);
        }

        public void h(int i, long j, long j2) {
            m mVar = this.b;
            int i2 = f0.a;
            mVar.C(i, j, j2);
        }

        public void i(String str, long j, long j2) {
            m mVar = this.b;
            int i = f0.a;
            mVar.r(str, j, j2);
        }

        public void j(ej ejVar) {
            synchronized (ejVar) {
            }
            m mVar = this.b;
            int i = f0.a;
            mVar.N(ejVar);
        }

        public void k(ej ejVar) {
            m mVar = this.b;
            int i = f0.a;
            mVar.l(ejVar);
        }

        public void l(d0 d0Var) {
            m mVar = this.b;
            int i = f0.a;
            mVar.W(d0Var);
        }
    }

    void C(int i, long j, long j2);

    void N(ej ejVar);

    void W(d0 d0Var);

    void b(int i);

    void l(ej ejVar);

    void r(String str, long j, long j2);
}
