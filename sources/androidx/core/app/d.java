package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        if (!b) {
            try {
                Method method = Bundle.class.getMethod("getIBinder", String.class);
                a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method2 = a;
        if (method2 == null) {
            return null;
        }
        try {
            return (IBinder) method2.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            a = null;
            return null;
        }
    }

    public static Bundle b(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        return p.c(notification);
    }

    public static void c(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
            return;
        }
        if (!d) {
            try {
                Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method2 = c;
        if (method2 != null) {
            try {
                method2.invoke(bundle, str, iBinder);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                c = null;
            }
        }
    }
}
