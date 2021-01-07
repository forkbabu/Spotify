package io.netty.channel;

import io.netty.channel.e0;
import io.netty.channel.p0;
import java.util.ArrayList;

public class c extends e0 {
    private static final int[] e;
    private final int b;
    private final int c;
    private final int d;

    /* access modifiers changed from: private */
    public final class a extends e0.a {
        private final int h;
        private final int i;
        private int j;
        private int k = c.e[this.j];
        private boolean l;

        public a(c cVar, int i2, int i3, int i4) {
            super();
            this.h = i2;
            this.i = i3;
            this.j = c.f(i4);
        }

        @Override // io.netty.channel.p0.a
        public void a() {
            int j2 = j();
            if (j2 <= c.e[Math.max(0, (this.j - 1) - 1)]) {
                if (this.l) {
                    this.j = Math.max(this.j - 1, this.h);
                    this.k = c.e[this.j];
                    this.l = false;
                    return;
                }
                this.l = true;
            } else if (j2 >= this.k) {
                this.j = Math.min(this.j + 4, this.i);
                this.k = c.e[this.j];
                this.l = false;
            }
        }

        public int k() {
            return this.k;
        }
    }

    static {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 16;
        while (true) {
            if (i2 >= 512) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
            i2 += 16;
        }
        for (i = 512; i > 0; i <<= 1) {
            arrayList.add(Integer.valueOf(i));
        }
        e = new int[arrayList.size()];
        int i3 = 0;
        while (true) {
            int[] iArr = e;
            if (i3 < iArr.length) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                i3++;
            } else {
                new c();
                return;
            }
        }
    }

    public c() {
        int f = f(64);
        int[] iArr = e;
        if (iArr[f] < 64) {
            this.b = f + 1;
        } else {
            this.b = f;
        }
        int f2 = f(65536);
        if (iArr[f2] > 65536) {
            this.c = f2 - 1;
        } else {
            this.c = f2;
        }
        this.d = 1024;
    }

    /* access modifiers changed from: private */
    public static int f(int i) {
        int length = e.length - 1;
        int i2 = 0;
        while (length >= i2) {
            if (length == i2) {
                return length;
            }
            int i3 = (i2 + length) >>> 1;
            int[] iArr = e;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            if (i > iArr[i5]) {
                i2 = i5;
            } else if (i >= i4) {
                return i == i4 ? i3 : i5;
            } else {
                length = i3 - 1;
            }
        }
        return i2;
    }

    @Override // io.netty.channel.p0
    public p0.a a() {
        return new a(this, this.b, this.c, this.d);
    }
}
