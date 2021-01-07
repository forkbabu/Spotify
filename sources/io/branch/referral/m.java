package io.branch.referral;

import android.content.Context;
import android.os.Process;
import java.util.concurrent.CountDownLatch;

class m implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ n b;

    m(n nVar, CountDownLatch countDownLatch) {
        this.b = nVar;
        this.a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Context context = (Context) this.b.a.get();
        if (context != null) {
            Process.setThreadPriority(-19);
            this.b.getClass();
            try {
                obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            } catch (Throwable unused) {
                obj = null;
            }
            l d = l.d();
            if (d == null) {
                d = l.h(context);
            }
            g0 g = d.g();
            if (g != null) {
                this.b.getClass();
                try {
                    Object invoke = obj.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(obj, new Object[0]);
                    if (invoke instanceof Boolean) {
                        g.o(((Boolean) invoke).booleanValue() ? 1 : 0);
                    }
                } catch (Exception unused2) {
                }
                if (g.e() == 1) {
                    g.n(null);
                } else {
                    this.b.getClass();
                    try {
                        g.n((String) obj.getClass().getMethod("getId", new Class[0]).invoke(obj, new Object[0]));
                    } catch (Exception unused3) {
                    }
                }
            }
        }
        this.a.countDown();
    }
}
