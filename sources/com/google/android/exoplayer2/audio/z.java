package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.f0;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class z extends q {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = f0.f;
    private int n;
    private long o;

    @Override // com.google.android.exoplayer2.audio.q, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer a() {
        int i2;
        if (super.b() && (i2 = this.n) > 0) {
            k(i2).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // com.google.android.exoplayer2.audio.q, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        return super.b() && this.n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            int min = Math.min(i2, this.l);
            this.o += (long) (min / this.b.d);
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l <= 0) {
                int i3 = i2 - min;
                int length = (this.n + i3) - this.m.length;
                ByteBuffer k2 = k(length);
                int h = f0.h(length, 0, this.n);
                k2.put(this.m, 0, h);
                int h2 = f0.h(length - h, 0, i3);
                byteBuffer.limit(byteBuffer.position() + h2);
                k2.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - h2;
                int i5 = this.n - h;
                this.n = i5;
                byte[] bArr = this.m;
                System.arraycopy(bArr, h, bArr, 0, i5);
                byteBuffer.get(this.m, this.n, i4);
                this.n += i4;
                k2.flip();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.q
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        if (aVar.c == 2) {
            this.k = true;
            return (this.i == 0 && this.j == 0) ? AudioProcessor.a.e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void h() {
        if (this.k) {
            this.k = false;
            int i2 = this.j;
            int i3 = this.b.d;
            this.m = new byte[(i2 * i3)];
            this.l = this.i * i3;
        } else {
            this.l = 0;
        }
        this.n = 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void i() {
        if (this.k) {
            int i2 = this.n;
            if (i2 > 0) {
                this.o += (long) (i2 / this.b.d);
            }
            this.n = 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void j() {
        this.m = f0.f;
    }

    public long l() {
        return this.o;
    }

    public void m() {
        this.o = 0;
    }

    public void n(int i2, int i3) {
        this.i = i2;
        this.j = i3;
    }
}
