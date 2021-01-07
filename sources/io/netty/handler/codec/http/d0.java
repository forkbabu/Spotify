package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.util.h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d0 implements Comparable<d0> {
    private static final Pattern p = Pattern.compile("(\\S+)/(\\d+)\\.(\\d+)");
    public static final d0 q = new d0("HTTP", 1, 0, false, true);
    public static final d0 r = new d0("HTTP", 1, 1, true, true);
    private final String a;
    private final int b;
    private final int c;
    private final String f;
    private final boolean n;
    private final byte[] o;

    public d0(String str, boolean z) {
        String upperCase = str.trim().toUpperCase();
        if (!upperCase.isEmpty()) {
            Matcher matcher = p.matcher(upperCase);
            if (matcher.matches()) {
                String group = matcher.group(1);
                this.a = group;
                int parseInt = Integer.parseInt(matcher.group(2));
                this.b = parseInt;
                int parseInt2 = Integer.parseInt(matcher.group(3));
                this.c = parseInt2;
                this.f = group + '/' + parseInt + '.' + parseInt2;
                this.n = z;
                this.o = null;
                return;
            }
            throw new IllegalArgumentException(je.x0("invalid version format: ", upperCase));
        }
        throw new IllegalArgumentException("empty text");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(d0 d0Var) {
        d0 d0Var2 = d0Var;
        int compareTo = this.a.compareTo(d0Var2.a);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = this.b - d0Var2.b;
        return i != 0 ? i : this.c - d0Var2.c;
    }

    /* access modifiers changed from: package-private */
    public void d(j jVar) {
        byte[] bArr = this.o;
        if (bArr == null) {
            String str = this.f;
            int i = c0.b;
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                jVar.P1(charAt > 255 ? 63 : (byte) charAt);
            }
            return;
        }
        jVar.U1(bArr);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.c == d0Var.c && this.b == d0Var.b && this.a.equals(d0Var.a)) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        return this.f;
    }

    private d0(String str, int i, int i2, boolean z, boolean z2) {
        String upperCase = str.trim().toUpperCase();
        if (!upperCase.isEmpty()) {
            for (int i3 = 0; i3 < upperCase.length(); i3++) {
                if (Character.isISOControl(upperCase.charAt(i3)) || Character.isWhitespace(upperCase.charAt(i3))) {
                    throw new IllegalArgumentException("invalid character in protocolName");
                }
            }
            if (i < 0) {
                throw new IllegalArgumentException("negative majorVersion");
            } else if (i2 >= 0) {
                this.a = upperCase;
                this.b = i;
                this.c = i2;
                String str2 = upperCase + '/' + i + '.' + i2;
                this.f = str2;
                this.n = z;
                if (z2) {
                    this.o = str2.getBytes(h.f);
                } else {
                    this.o = null;
                }
            } else {
                throw new IllegalArgumentException("negative minorVersion");
            }
        } else {
            throw new IllegalArgumentException("empty protocolName");
        }
    }
}
