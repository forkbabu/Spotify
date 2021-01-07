package defpackage;

import android.os.SystemClock;
import java.util.Iterator;

/* renamed from: tf0  reason: default package */
public final class tf0 {
    private final rf0 a;
    private final Object b = new Object();

    public tf0(rf0 rf0) {
        this.a = rf0;
    }

    private void a(char c, String str, String str2, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.b) {
            this.a.c(elapsedRealtime).a(c, str, str2, th, currentTimeMillis);
        }
    }

    public void b(String str, String str2) {
        a('D', str, str2, null);
    }

    public void c(String str, String str2, Throwable th) {
        a('D', str, str2, th);
    }

    public void d(String str, String str2) {
        a('E', str, str2, null);
    }

    public void e(String str, String str2, Throwable th) {
        a('E', str, str2, th);
    }

    public void f(qg0<String> qg0) {
        synchronized (this.b) {
            Iterator<wf0> it = this.a.iterator();
            while (it.hasNext()) {
                qg0.accept(it.next().toString());
            }
        }
    }

    public void g(String str, String str2) {
        a('I', str, str2, null);
    }

    public void h(String str, String str2, Throwable th) {
        a('I', str, str2, th);
    }

    public void i(String str, String str2) {
        a('V', str, str2, null);
    }

    public void j(String str, String str2, Throwable th) {
        a('V', str, str2, th);
    }

    public void k(String str, String str2) {
        a('W', str, str2, null);
    }

    public void l(String str, String str2, Throwable th) {
        a('W', str, str2, th);
    }
}
