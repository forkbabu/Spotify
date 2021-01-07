package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class m {
    private static m e;
    private final Object a = new Object();
    private final Handler b = new Handler(Looper.getMainLooper(), new a());
    private c c;
    private c d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m.this.d((c) message.obj);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        void a();

        void b(int i);
    }

    /* access modifiers changed from: private */
    public static class c {
        final WeakReference<b> a;
        int b;
        boolean c;

        c(int i, b bVar) {
            this.a = new WeakReference<>(bVar);
            this.b = i;
        }
    }

    private m() {
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.b(i);
        return true;
    }

    static m c() {
        if (e == null) {
            e = new m();
        }
        return e;
    }

    private boolean g(b bVar) {
        c cVar = this.c;
        if (cVar == null) {
            return false;
        }
        if (bVar != null && cVar.a.get() == bVar) {
            return true;
        }
        return false;
    }

    private boolean h(b bVar) {
        c cVar = this.d;
        if (cVar == null) {
            return false;
        }
        if (bVar != null && cVar.a.get() == bVar) {
            return true;
        }
        return false;
    }

    private void m(c cVar) {
        int i = cVar.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.b.removeCallbacksAndMessages(cVar);
            Handler handler = this.b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    private void o() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = cVar.a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.c = null;
            }
        }
    }

    public void b(b bVar, int i) {
        synchronized (this.a) {
            if (g(bVar)) {
                a(this.c, i);
            } else if (h(bVar)) {
                a(this.d, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        synchronized (this.a) {
            if (this.c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(b bVar) {
        boolean g;
        synchronized (this.a) {
            g = g(bVar);
        }
        return g;
    }

    public boolean f(b bVar) {
        boolean z;
        synchronized (this.a) {
            if (!g(bVar)) {
                if (!h(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void i(b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                this.c = null;
                if (this.d != null) {
                    o();
                }
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                m(this.c);
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                c cVar = this.c;
                if (!cVar.c) {
                    cVar.c = true;
                    this.b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                c cVar = this.c;
                if (cVar.c) {
                    cVar.c = false;
                    m(cVar);
                }
            }
        }
    }

    public void n(int i, b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                c cVar = this.c;
                cVar.b = i;
                this.b.removeCallbacksAndMessages(cVar);
                m(this.c);
                return;
            }
            if (h(bVar)) {
                this.d.b = i;
            } else {
                this.d = new c(i, bVar);
            }
            c cVar2 = this.c;
            if (cVar2 == null || !a(cVar2, 4)) {
                this.c = null;
                o();
            }
        }
    }
}
