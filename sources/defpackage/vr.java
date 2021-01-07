package defpackage;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.e;

/* renamed from: vr  reason: default package */
public class vr {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(@RecentlyNonNull Context context) {
        Boolean bool;
        synchronized (vr.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (e.c()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    b = Boolean.FALSE;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }
}
