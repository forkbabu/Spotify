package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.n;
import com.facebook.k;
import defpackage.ef;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: we  reason: default package */
public final class we {
    private static final ef a = new ef();
    private static SensorManager b;
    private static cf c;
    private static String d;
    private static final AtomicBoolean e = new AtomicBoolean(true);
    private static Boolean f;
    private static volatile Boolean g;

    /* renamed from: we$a */
    static class a implements ef.a {
        final /* synthetic */ n a;
        final /* synthetic */ String b;

        a(n nVar, String str) {
            this.a = nVar;
            this.b = str;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f = bool;
        g = bool;
    }

    static void a(String str) {
        if (!uf.c(we.class)) {
            try {
                if (!uf.c(we.class)) {
                    try {
                        if (!g.booleanValue()) {
                            g = Boolean.TRUE;
                            k.l().execute(new xe(str));
                        }
                    } catch (Throwable th) {
                        uf.b(th, we.class);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, we.class);
            }
        }
    }

    static /* synthetic */ Boolean b() {
        if (uf.c(we.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            uf.b(th, we.class);
            return null;
        }
    }

    static /* synthetic */ Boolean c(Boolean bool) {
        if (uf.c(we.class)) {
            return null;
        }
        try {
            f = bool;
            return bool;
        } catch (Throwable th) {
            uf.b(th, we.class);
            return null;
        }
    }

    static /* synthetic */ String d(String str) {
        if (uf.c(we.class)) {
            return null;
        }
        try {
            d = null;
            return null;
        } catch (Throwable th) {
            uf.b(th, we.class);
            return null;
        }
    }

    static /* synthetic */ cf e() {
        if (uf.c(we.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            uf.b(th, we.class);
            return null;
        }
    }

    static /* synthetic */ Boolean f(Boolean bool) {
        if (uf.c(we.class)) {
            return null;
        }
        try {
            g = bool;
            return bool;
        } catch (Throwable th) {
            uf.b(th, we.class);
            return null;
        }
    }

    public static void g() {
        if (!uf.c(we.class)) {
            try {
                e.set(false);
            } catch (Throwable th) {
                uf.b(th, we.class);
            }
        }
    }

    public static void h() {
        if (!uf.c(we.class)) {
            try {
                e.set(true);
            } catch (Throwable th) {
                uf.b(th, we.class);
            }
        }
    }

    static String i() {
        if (uf.c(we.class)) {
            return null;
        }
        try {
            if (d == null) {
                d = UUID.randomUUID().toString();
            }
            return d;
        } catch (Throwable th) {
            uf.b(th, we.class);
            return null;
        }
    }

    static boolean j() {
        if (uf.c(we.class)) {
            return false;
        }
        try {
            return f.booleanValue();
        } catch (Throwable th) {
            uf.b(th, we.class);
            return false;
        }
    }

    public static void k(Activity activity) {
        if (!uf.c(we.class)) {
            try {
                ze.e().d(activity);
            } catch (Throwable th) {
                uf.b(th, we.class);
            }
        }
    }

    public static void l(Activity activity) {
        if (!uf.c(we.class)) {
            try {
                if (e.get()) {
                    ze.e().h(activity);
                    cf cfVar = c;
                    if (cfVar != null) {
                        cfVar.j();
                    }
                    SensorManager sensorManager = b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(a);
                    }
                }
            } catch (Throwable th) {
                uf.b(th, we.class);
            }
        }
    }

    public static void m(Activity activity) {
        if (!uf.c(we.class)) {
            try {
                if (e.get()) {
                    ze.e().c(activity);
                    Context applicationContext = activity.getApplicationContext();
                    String e2 = k.e();
                    n j = FetchedAppSettingsManager.j(e2);
                    if (j == null) {
                        return;
                    }
                    if (j.b()) {
                        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                        b = sensorManager;
                        if (sensorManager != null) {
                            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                            c = new cf(activity);
                            ef efVar = a;
                            efVar.a(new a(j, e2));
                            b.registerListener(efVar, defaultSensor, 2);
                            if (j.b()) {
                                c.i();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, we.class);
            }
        }
    }

    static void n(Boolean bool) {
        if (!uf.c(we.class)) {
            try {
                f = bool;
            } catch (Throwable th) {
                uf.b(th, we.class);
            }
        }
    }
}
