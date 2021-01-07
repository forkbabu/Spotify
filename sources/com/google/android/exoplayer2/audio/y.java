package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class y implements AudioProcessor {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private AudioProcessor.a e;
    private AudioProcessor.a f;
    private AudioProcessor.a g;
    private AudioProcessor.a h;
    private boolean i;
    private x j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public y() {
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.m;
        this.m = AudioProcessor.a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        x xVar;
        return this.p && ((xVar = this.j) == null || xVar.g() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        x xVar = this.j;
        xVar.getClass();
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += (long) remaining;
            xVar.k(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int g2 = xVar.g();
        if (g2 > 0) {
            if (this.k.capacity() < g2) {
                ByteBuffer order = ByteBuffer.allocateDirect(g2).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            xVar.f(this.l);
            this.o += (long) g2;
            this.k.limit(g2);
            this.m = this.k;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a d(AudioProcessor.a aVar) {
        if (aVar.c == 2) {
            int i2 = this.b;
            if (i2 == -1) {
                i2 = aVar.a;
            }
            this.e = aVar;
            AudioProcessor.a aVar2 = new AudioProcessor.a(i2, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void e() {
        x xVar = this.j;
        if (xVar != null) {
            xVar.j();
        }
        this.p = true;
    }

    public long f(long j2) {
        long j3 = this.o;
        if (j3 >= 1024) {
            int i2 = this.h.a;
            int i3 = this.g.a;
            if (i2 == i3) {
                return f0.K(j2, this.n, j3);
            }
            return f0.K(j2, this.n * ((long) i2), j3 * ((long) i3));
        }
        double d2 = (double) this.c;
        double d3 = (double) j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (long) (d2 * d3);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.e;
            this.g = aVar;
            AudioProcessor.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new x(aVar.a, aVar.b, this.c, this.d, aVar2.a);
            } else {
                x xVar = this.j;
                if (xVar != null) {
                    xVar.e();
                }
            }
        }
        this.m = AudioProcessor.a;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }

    public float g(float f2) {
        float g2 = f0.g(f2, 0.1f, 8.0f);
        if (this.d != g2) {
            this.d = g2;
            this.i = true;
        }
        return g2;
    }

    public float h(float f2) {
        float g2 = f0.g(f2, 0.1f, 8.0f);
        if (this.c != g2) {
            this.c = g2;
            this.i = true;
        }
        return g2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 0.01f || Math.abs(this.d - 1.0f) >= 0.01f || this.f.a != this.e.a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }
}
