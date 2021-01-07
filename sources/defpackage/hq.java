package defpackage;

import java.util.Arrays;

/* renamed from: hq  reason: default package */
public final class hq {
    public final int a;
    private final gq[] b;
    private int c;

    public hq(gq... gqVarArr) {
        this.b = gqVarArr;
        this.a = gqVarArr.length;
    }

    public gq a(int i) {
        return this.b[i];
    }

    public gq[] b() {
        return (gq[]) this.b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hq.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((hq) obj).b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
