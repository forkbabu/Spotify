package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: hq1  reason: default package */
public class hq1 {
    private int a = AudioDriver.SPOTIFY_MAX_VOLUME;

    public byte a(byte b) {
        int i = this.a;
        int i2 = ((i << 8) | (i >>> 8)) & AudioDriver.SPOTIFY_MAX_VOLUME;
        this.a = i2;
        int i3 = i2 ^ (b & 255);
        this.a = i3;
        int i4 = i3 ^ ((i3 & BitmapRenderer.ALPHA_VISIBLE) >> 4);
        this.a = i4;
        int i5 = i4 ^ ((i4 << 12) & AudioDriver.SPOTIFY_MAX_VOLUME);
        this.a = i5;
        this.a = i5 ^ (65535 & ((i5 & BitmapRenderer.ALPHA_VISIBLE) << 5));
        return b;
    }

    public short b() {
        return (short) (this.a & AudioDriver.SPOTIFY_MAX_VOLUME);
    }
}
