package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.nio.ByteBuffer;

/* renamed from: pe  reason: default package */
public final class pe {
    public static void a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) ((-16777216 & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & BitmapRenderer.ALPHA_VISIBLE));
    }

    public static void b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) ((-16777216 & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & BitmapRenderer.ALPHA_VISIBLE));
    }

    public static void c(ByteBuffer byteBuffer, double d) {
        short s = (short) ((int) (d * 256.0d));
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    public static void d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length == 3) {
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
            }
            e(byteBuffer, i);
            return;
        }
        throw new IllegalArgumentException("\"" + str + "\" language string isn't exactly 3 characters long!");
    }

    public static void e(ByteBuffer byteBuffer, int i) {
        int i2 = i & AudioDriver.SPOTIFY_MAX_VOLUME;
        byteBuffer.put((byte) ((i2 >> 8) & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (i2 & BitmapRenderer.ALPHA_VISIBLE & BitmapRenderer.ALPHA_VISIBLE));
    }

    public static void f(ByteBuffer byteBuffer, int i) {
        int i2 = i & 16777215;
        e(byteBuffer, i2 >> 8);
        byteBuffer.put((byte) (i2 & BitmapRenderer.ALPHA_VISIBLE));
    }

    public static void g(ByteBuffer byteBuffer, long j) {
        long j2 = j & 281474976710655L;
        e(byteBuffer, (int) (j2 >> 32));
        byteBuffer.putInt((int) (j2 & 4294967295L));
    }

    public static void h(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) (i & BitmapRenderer.ALPHA_VISIBLE));
    }

    public static void i(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(h7.b(str));
        byteBuffer.put((byte) 0);
    }

    public static void j(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(h7.b(str));
        byteBuffer.put((byte) 0);
    }
}
