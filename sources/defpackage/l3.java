package defpackage;

import android.icu.util.ULocale;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: l3  reason: default package */
public final class l3 {
    private static Method a;
    private static Method b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                a = cls.getMethod("getScript", String.class);
                b = cls.getMethod("addLikelySubtags", String.class);
            } catch (Exception unused) {
                a = null;
                b = null;
            }
        } else if (i < 24) {
            try {
                b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String locale2 = locale.toString();
            try {
                Method method = b;
                if (method != null) {
                    locale2 = (String) method.invoke(null, locale2);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            if (locale2 == null) {
                return null;
            }
            try {
                Method method2 = a;
                if (method2 != null) {
                    return (String) method2.invoke(null, locale2);
                }
                return null;
            } catch (IllegalAccessException | InvocationTargetException unused3) {
                return null;
            }
        }
    }
}
