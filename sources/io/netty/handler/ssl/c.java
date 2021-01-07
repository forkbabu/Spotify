package io.netty.handler.ssl;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.b;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

final class c {
    private static final b a = io.netty.util.internal.logging.c.b(c.class.getName());
    private static final Pattern b = Pattern.compile("^(?:TLS|SSL)_((?:(?!_WITH_).)+)_WITH_(.*)_(.*)$");
    private static final Pattern c = Pattern.compile("^(?:((?:(?:EXP-)?(?:(?:DHE|EDH|ECDH|ECDHE|SRP)-(?:DSS|RSA|ECDSA)|(?:ADH|AECDH|KRB5|PSK|SRP)))|EXP)-)?(.*)-(.*)$");
    private static final Pattern d = Pattern.compile("^(AES)_([0-9]+)_CBC$");
    private static final Pattern e = Pattern.compile("^(AES)_([0-9]+)_(.*)$");
    private static final Pattern f = Pattern.compile("^(AES)([0-9]+)$");
    private static final Pattern g = Pattern.compile("^(AES)([0-9]+)-(.*)$");
    private static final ConcurrentMap<String, String> h = PlatformDependent.P();
    private static final ConcurrentMap<String, Map<String, String>> i = PlatformDependent.P();

    static {
        int i2 = io.netty.util.internal.logging.c.b;
    }

    private c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.c.a(java.lang.String, java.lang.String):java.lang.String");
    }

    static String b(Iterable<String> iterable) {
        String next;
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            String c2 = c(next);
            if (c2 != null) {
                next = c2;
            }
            sb.append(next);
            sb.append(':');
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String c(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.c.c(java.lang.String):java.lang.String");
    }
}
