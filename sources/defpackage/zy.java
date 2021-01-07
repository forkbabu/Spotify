package defpackage;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: zy  reason: default package */
public class zy implements yy, xy {
    private final bz a;
    private final Object b = new Object();
    private CountDownLatch c;

    public zy(bz bzVar, int i, TimeUnit timeUnit) {
        this.a = bzVar;
    }

    @Override // defpackage.xy
    public void a(String str, Bundle bundle) {
        synchronized (this.b) {
            ty.f().b("Logging Crashlytics event to Firebase");
            this.c = new CountDownLatch(1);
            this.a.a(str, bundle);
            ty.f().b("Awaiting app exception callback from FA...");
            try {
                if (this.c.await((long) 500, TimeUnit.MILLISECONDS)) {
                    ty.f().b("App exception callback received from FA listener.");
                } else {
                    ty.f().b("Timeout exceeded while awaiting app exception callback from FA listener.");
                }
            } catch (InterruptedException unused) {
                ty.f().b("Interrupted while awaiting app exception callback from FA listener.");
            }
            this.c = null;
        }
    }

    @Override // defpackage.yy
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
