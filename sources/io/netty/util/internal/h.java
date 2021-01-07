package io.netty.util.internal;

import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.net.InetAddress;

public final class h {
    private static final byte[] a = {-1};
    private static final b b = c.b(h.class.getName());

    static {
        int i = c.b;
    }

    private h() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if ((r8[0] & 2) == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if ((r8[0] & 2) == 0) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a() {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.h.a():byte[]");
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(24);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x:", Integer.valueOf(bArr[i] & 255)));
        }
        return sb.substring(0, sb.length() - 1);
    }

    private static int c(InetAddress inetAddress) {
        if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress()) {
            return 0;
        }
        if (inetAddress.isMulticastAddress()) {
            return 1;
        }
        if (inetAddress.isLinkLocalAddress()) {
            return 2;
        }
        return inetAddress.isSiteLocalAddress() ? 3 : 4;
    }
}
