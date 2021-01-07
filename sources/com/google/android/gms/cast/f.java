package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.a;
import java.util.Collection;
import java.util.Iterator;

public final class f {
    public static String a(String str) {
        if (str != null) {
            return c("com.google.android.gms.cast.CATEGORY_CAST", str, null);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String b(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else if (collection != null) {
            return c("com.google.android.gms.cast.CATEGORY_CAST", str, collection);
        } else {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection<Ljava/lang/String;>;ZZ)Ljava/lang/String; */
    private static String c(String str, String str2, Collection collection) {
        StringBuilder sb = new StringBuilder(str);
        String upperCase = str2.toUpperCase();
        if (!upperCase.matches("[A-F0-9]+")) {
            throw new IllegalArgumentException(str2.length() != 0 ? "Invalid application ID: ".concat(str2) : new String("Invalid application ID: "));
        }
        sb.append("/");
        sb.append(upperCase);
        if (collection != null) {
            if (!collection.isEmpty()) {
                sb.append("/");
                boolean z = true;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    a.c(str3);
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(a.i(str3));
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (collection == null) {
            sb.append("/");
        }
        return je.J0(sb, "/", "/", "ALLOW_IPV6");
    }
}
