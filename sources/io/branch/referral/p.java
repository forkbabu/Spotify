package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;

class p implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ q b;

    p(q qVar, CountDownLatch countDownLatch) {
        this.b = qVar;
        this.a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = (Context) this.b.a.get();
        if (context != null) {
            this.b.getClass();
            try {
                int i = 1;
                Object invoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                String obj = invoke.getClass().getDeclaredMethod("getId", new Class[0]).invoke(invoke, new Object[0]).toString();
                Boolean bool = (Boolean) invoke.getClass().getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                l d = l.d();
                if (d == null) {
                    d = l.h(context);
                }
                g0 g = d.g();
                g.n(obj);
                if (!bool.booleanValue()) {
                    i = 0;
                }
                g.o(i);
                if (TextUtils.isEmpty(obj) || obj.equals("00000000-0000-0000-0000-000000000000") || bool.booleanValue()) {
                    g.n(null);
                }
            } catch (Throwable th) {
                String str = "failed to retrieve OAID, error = " + th;
            }
        }
        this.a.countDown();
    }
}
