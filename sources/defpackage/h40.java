package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;

/* renamed from: h40  reason: default package */
public class h40 {
    int a;
    int b;
    private ByteBuffer c;

    public h40(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.a = byteBuffer.position();
    }

    public int a(int i) {
        int i2;
        int i3 = this.c.get((this.b / 8) + this.a);
        if (i3 < 0) {
            i3 += 256;
        }
        int i4 = this.b;
        int i5 = 8 - (i4 % 8);
        if (i <= i5) {
            i2 = ((i3 << (i4 % 8)) & BitmapRenderer.ALPHA_VISIBLE) >> ((i5 - i) + (i4 % 8));
            this.b = i4 + i;
        } else {
            int i6 = i - i5;
            i2 = (a(i5) << i6) + a(i6);
        }
        ByteBuffer byteBuffer = this.c;
        int i7 = this.a;
        double d = (double) this.b;
        Double.isNaN(d);
        byteBuffer.position(i7 + ((int) Math.ceil(d / 8.0d)));
        return i2;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public int c() {
        return (this.c.limit() * 8) - this.b;
    }
}
