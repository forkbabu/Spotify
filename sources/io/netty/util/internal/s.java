package io.netty.util.internal;

import com.spotify.music.features.ads.model.Ad;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.regex.Pattern;

public final class s {
    private static final b a = c.b(s.class.getName());
    private static final Pattern b = Pattern.compile("-?[0-9]+");

    /* access modifiers changed from: package-private */
    public static class a implements PrivilegedAction<String> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty(this.a);
        }
    }

    static {
        int i = c.b;
    }

    private s() {
    }

    public static String a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("key");
        } else if (!str.isEmpty()) {
            String str3 = null;
            try {
                if (System.getSecurityManager() == null) {
                    str3 = System.getProperty(str);
                } else {
                    str3 = (String) AccessController.doPrivileged(new a(str));
                }
            } catch (Exception e) {
                a.g("Unable to retrieve a system property '{}'; default values will be used.", str, e);
            }
            return str3 == null ? str2 : str3;
        } else {
            throw new IllegalArgumentException("key must not be empty.");
        }
    }

    public static boolean b(String str, boolean z) {
        String a2 = a(str, null);
        if (a2 == null) {
            return z;
        }
        String lowerCase = a2.trim().toLowerCase();
        if (lowerCase.isEmpty() || "true".equals(lowerCase) || "yes".equals(lowerCase) || "1".equals(lowerCase)) {
            return true;
        }
        if ("false".equals(lowerCase) || "no".equals(lowerCase) || Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(lowerCase)) {
            return false;
        }
        a.warn("Unable to parse the boolean system property '{}':{} - using the default value: {}", str, lowerCase, Boolean.valueOf(z));
        return z;
    }

    public static int c(String str, int i) {
        String a2 = a(str, null);
        if (a2 == null) {
            return i;
        }
        String lowerCase = a2.trim().toLowerCase();
        if (b.matcher(lowerCase).matches()) {
            try {
                return Integer.parseInt(lowerCase);
            } catch (Exception unused) {
            }
        }
        a.warn("Unable to parse the integer system property '{}':{} - using the default value: {}", str, lowerCase, Integer.valueOf(i));
        return i;
    }

    public static long d(String str, long j) {
        String a2 = a(str, null);
        if (a2 == null) {
            return j;
        }
        String lowerCase = a2.trim().toLowerCase();
        if (b.matcher(lowerCase).matches()) {
            try {
                return Long.parseLong(lowerCase);
            } catch (Exception unused) {
            }
        }
        a.warn("Unable to parse the long integer system property '{}':{} - using the default value: {}", str, lowerCase, Long.valueOf(j));
        return j;
    }
}
