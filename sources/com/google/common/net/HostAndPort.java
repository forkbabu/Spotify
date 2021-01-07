package com.google.common.net;

import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.util.Arrays;

public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String str, int i, boolean z) {
        this.host = str;
        this.port = i;
        this.hasBracketlessColons = z;
    }

    public static HostAndPort fromParts(String str, int i) {
        MoreObjects.checkArgument(i >= 0 && i <= 65535, "Port out of range: %s", i);
        HostAndPort fromString = fromString(str);
        MoreObjects.checkArgument(true ^ fromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(fromString.host, i, fromString.hasBracketlessColons);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.net.HostAndPort fromString(java.lang.String r9) {
        /*
            r9.getClass()
            java.lang.String r0 = "["
            boolean r0 = r9.startsWith(r0)
            r1 = 0
            r2 = 1
            r3 = -1
            r4 = 58
            if (r0 == 0) goto L_0x0081
            char r0 = r9.charAt(r1)
            r5 = 91
            if (r0 != r5) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            java.lang.String r5 = "Bracketed host-port string must start with a bracket: %s"
            com.google.common.base.MoreObjects.checkArgument(r0, r5, r9)
            int r0 = r9.indexOf(r4)
            r5 = 93
            int r5 = r9.lastIndexOf(r5)
            if (r0 <= r3) goto L_0x0030
            if (r5 <= r0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.lang.String r6 = "Invalid bracketed host/port: %s"
            com.google.common.base.MoreObjects.checkArgument(r0, r6, r9)
            java.lang.String r0 = r9.substring(r2, r5)
            int r6 = r5 + 1
            int r7 = r9.length()
            r8 = 2
            if (r6 != r7) goto L_0x004c
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r1] = r0
            java.lang.String r0 = ""
            r4[r2] = r0
            goto L_0x007c
        L_0x004c:
            char r6 = r9.charAt(r6)
            if (r6 != r4) goto L_0x0054
            r4 = 1
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            java.lang.String r6 = "Only a colon may follow a close bracket: %s"
            com.google.common.base.MoreObjects.checkArgument(r4, r6, r9)
            int r5 = r5 + r8
            r4 = r5
        L_0x005c:
            int r6 = r9.length()
            if (r4 >= r6) goto L_0x0072
            char r6 = r9.charAt(r4)
            boolean r6 = java.lang.Character.isDigit(r6)
            java.lang.String r7 = "Port must be numeric: %s"
            com.google.common.base.MoreObjects.checkArgument(r6, r7, r9)
            int r4 = r4 + 1
            goto L_0x005c
        L_0x0072:
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r1] = r0
            java.lang.String r0 = r9.substring(r5)
            r4[r2] = r0
        L_0x007c:
            r0 = r4[r1]
            r4 = r4[r2]
            goto L_0x0097
        L_0x0081:
            int r0 = r9.indexOf(r4)
            if (r0 < 0) goto L_0x0099
            int r5 = r0 + 1
            int r4 = r9.indexOf(r4, r5)
            if (r4 != r3) goto L_0x0099
            java.lang.String r0 = r9.substring(r1, r0)
            java.lang.String r4 = r9.substring(r5)
        L_0x0097:
            r5 = 0
            goto L_0x00a2
        L_0x0099:
            if (r0 < 0) goto L_0x009e
            r0 = 1
            r5 = 1
            goto L_0x00a0
        L_0x009e:
            r0 = 0
            r5 = 0
        L_0x00a0:
            r4 = 0
            r0 = r9
        L_0x00a2:
            boolean r6 = com.google.common.base.MoreObjects.isNullOrEmpty(r4)
            if (r6 != 0) goto L_0x00d2
            java.lang.String r3 = "+"
            boolean r3 = r4.startsWith(r3)
            r2 = r2 ^ r3
            java.lang.String r3 = "Unparseable port number: %s"
            com.google.common.base.MoreObjects.checkArgument(r2, r3, r9)
            int r3 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00c6 }
            if (r3 < 0) goto L_0x00c0
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r2) goto L_0x00c0
            r1 = 1
        L_0x00c0:
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.MoreObjects.checkArgument(r1, r2, r9)
            goto L_0x00d2
        L_0x00c6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unparseable port number: "
            java.lang.String r9 = defpackage.je.x0(r1, r9)
            r0.<init>(r9)
            throw r0
        L_0x00d2:
            com.google.common.net.HostAndPort r9 = new com.google.common.net.HostAndPort
            r9.<init>(r0, r3, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.HostAndPort.fromString(java.lang.String):com.google.common.net.HostAndPort");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        if (!rw.equal(this.host, hostAndPort.host) || this.port != hostAndPort.port) {
            return false;
        }
        return true;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        MoreObjects.checkState(hasPort());
        return this.port;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.host, Integer.valueOf(this.port)});
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }
}
