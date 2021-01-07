package defpackage;

import com.google.zxing.common.a;
import java.util.LinkedList;

/* access modifiers changed from: package-private */
/* renamed from: g30  reason: default package */
public final class g30 {
    static final g30 e = new g30(h30.b, 0, 0, 0);
    private final int a;
    private final h30 b;
    private final int c;
    private final int d;

    private g30(h30 h30, int i, int i2, int i3) {
        this.b = h30;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    /* access modifiers changed from: package-private */
    public g30 a(int i) {
        h30 h30 = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int i4 = e30.c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            h30.getClass();
            i3 += i6;
            h30 = new f30(h30, i5, i6);
            i2 = 0;
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        g30 g30 = new g30(h30, i2, i9, i3 + i8);
        return i9 == 2078 ? g30.b(i + 1) : g30;
    }

    /* access modifiers changed from: package-private */
    public g30 b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        h30 h30 = this.b;
        h30.getClass();
        return new g30(new c30(h30, i - i2, i2), this.a, 0, this.d);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public boolean f(g30 g30) {
        int i;
        int i2 = this.d + (e30.c[this.a][g30.a] >> 16);
        int i3 = g30.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= g30.d;
    }

    /* access modifiers changed from: package-private */
    public g30 g(int i, int i2) {
        int i3 = this.d;
        h30 h30 = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = e30.c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            h30.getClass();
            i3 += i7;
            h30 = new f30(h30, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        h30.getClass();
        return new g30(new f30(h30, i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: package-private */
    public g30 h(int i, int i2) {
        h30 h30 = this.b;
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = e30.e[i3][i];
        h30.getClass();
        return new g30(new f30(new f30(h30, i5, i4), i2, 5), this.a, 0, this.d + i4 + 5);
    }

    /* access modifiers changed from: package-private */
    public a i(byte[] bArr) {
        LinkedList<h30> linkedList = new LinkedList();
        for (h30 h30 = b(bArr.length).b; h30 != null; h30 = h30.b()) {
            linkedList.addFirst(h30);
        }
        a aVar = new a();
        for (h30 h302 : linkedList) {
            h302.a(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", e30.b[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
