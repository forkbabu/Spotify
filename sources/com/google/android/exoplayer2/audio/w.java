package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.f0;
import java.nio.ByteBuffer;

public final class w extends q {
    private int i;
    private boolean j;
    private byte[] k;
    private byte[] l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;

    public w() {
        byte[] bArr = f0.f;
        this.k = bArr;
        this.l = bArr;
    }

    private int l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i2 = this.i;
                return (position / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    private void n(byte[] bArr, int i2) {
        k(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.p = true;
        }
    }

    private void p(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.o);
        int i3 = this.o - min;
        System.arraycopy(bArr, i2 - i3, this.l, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.l, i3, min);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !f()) {
            int i2 = this.m;
            if (i2 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.k.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                        int i3 = this.i;
                        position = ((limit2 / i3) * i3) + i3;
                        break;
                    } else {
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    k(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i2 == 1) {
                int limit3 = byteBuffer.limit();
                int l2 = l(byteBuffer);
                int position2 = l2 - byteBuffer.position();
                byte[] bArr = this.k;
                int length = bArr.length;
                int i4 = this.n;
                int i5 = length - i4;
                if (l2 >= limit3 || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.k, this.n, min);
                    int i6 = this.n + min;
                    this.n = i6;
                    byte[] bArr2 = this.k;
                    if (i6 == bArr2.length) {
                        if (this.p) {
                            n(bArr2, this.o);
                            this.q += (long) ((this.n - (this.o * 2)) / this.i);
                        } else {
                            this.q += (long) ((i6 - this.o) / this.i);
                        }
                        p(byteBuffer, this.k, this.n);
                        this.n = 0;
                        this.m = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    n(bArr, i4);
                    this.n = 0;
                    this.m = 0;
                }
            } else if (i2 == 2) {
                int limit4 = byteBuffer.limit();
                int l3 = l(byteBuffer);
                byteBuffer.limit(l3);
                this.q += (long) (byteBuffer.remaining() / this.i);
                p(byteBuffer, this.l, this.o);
                if (l3 < limit4) {
                    n(this.l, this.o);
                    this.m = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.q
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        if (aVar.c == 2) {
            return this.j ? aVar : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void h() {
        if (this.j) {
            AudioProcessor.a aVar = this.b;
            int i2 = aVar.d;
            this.i = i2;
            long j2 = (long) aVar.a;
            int i3 = ((int) ((150000 * j2) / 1000000)) * i2;
            if (this.k.length != i3) {
                this.k = new byte[i3];
            }
            int i4 = ((int) ((j2 * 20000) / 1000000)) * i2;
            this.o = i4;
            if (this.l.length != i4) {
                this.l = new byte[i4];
            }
        }
        this.m = 0;
        this.q = 0;
        this.n = 0;
        this.p = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void i() {
        int i2 = this.n;
        if (i2 > 0) {
            n(this.k, i2);
        }
        if (!this.p) {
            this.q += (long) (this.o / this.i);
        }
    }

    @Override // com.google.android.exoplayer2.audio.q, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void j() {
        this.j = false;
        this.o = 0;
        byte[] bArr = f0.f;
        this.k = bArr;
        this.l = bArr;
    }

    public long m() {
        return this.q;
    }

    public void o(boolean z) {
        this.j = z;
    }
}
