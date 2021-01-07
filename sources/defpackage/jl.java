package defpackage;

import com.google.android.exoplayer2.util.g;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: jl  reason: default package */
final class jl {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;

    public jl(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public int a() {
        return (this.c * 8) + this.d;
    }

    public boolean b() {
        boolean z = (((this.a[this.c] & 255) >> this.d) & 1) == 1;
        d(1);
        return z;
    }

    public int c(int i) {
        int i2 = this.c;
        int min = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.a[i2] & 255) >> this.d) & (BitmapRenderer.ALPHA_VISIBLE >> (8 - min));
        while (min < i) {
            i4 |= (this.a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        d(i);
        return i5;
    }

    public void d(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        int i6 = this.c;
        if (i6 < 0 || (i6 >= (i2 = this.b) && !(i6 == i2 && this.d == 0))) {
            z = false;
        }
        g.m(z);
    }
}
