package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.o;
import com.google.android.exoplayer2.audio.u;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public final class DefaultAudioSink implements AudioSink {
    private long A;
    private float B;
    private AudioProcessor[] C;
    private ByteBuffer[] D;
    private ByteBuffer E;
    private ByteBuffer F;
    private byte[] G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private p N;
    private boolean O;
    private long P;
    private final j a;
    private final b b;
    private final r c;
    private final z d;
    private final AudioProcessor[] e;
    private final AudioProcessor[] f;
    private final ConditionVariable g = new ConditionVariable(true);
    private final o h = new o(new f(null));
    private final ArrayDeque<e> i;
    private AudioSink.a j;
    private c k;
    private c l;
    private AudioTrack m;
    private i n;
    private k0 o;
    private k0 p;
    private long q;
    private long r;
    private ByteBuffer s;
    private int t;
    private long u;
    private long v;
    private long w;
    private long x;
    private int y;
    private int z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    /* access modifiers changed from: package-private */
    public class a extends Thread {
        final /* synthetic */ AudioTrack a;

        a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.a.flush();
                this.a.release();
            } finally {
                DefaultAudioSink.this.g.open();
            }
        }
    }

    public interface b {
        long a(long j);

        k0 b(k0 k0Var);

        long c();
    }

    /* access modifiers changed from: private */
    public static final class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final boolean j;
        public final AudioProcessor[] k;

        public c(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, boolean z3, AudioProcessor[] audioProcessorArr) {
            int i9;
            int i10;
            this.a = z;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            if (i8 == 0) {
                if (z) {
                    int minBufferSize = AudioTrack.getMinBufferSize(i5, i6, i7);
                    g.m(minBufferSize != -2);
                    long j2 = (long) i5;
                    i10 = f0.h(minBufferSize * 4, ((int) ((250000 * j2) / 1000000)) * i4, (int) Math.max((long) minBufferSize, ((j2 * 750000) / 1000000) * ((long) i4)));
                } else {
                    if (i7 != 5) {
                        if (i7 != 6) {
                            if (i7 == 7) {
                                i9 = 192000;
                            } else if (i7 == 8) {
                                i9 = 2250000;
                            } else if (i7 == 14) {
                                i9 = 3062500;
                            } else if (i7 == 17) {
                                i9 = 336000;
                            } else if (i7 != 18) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i9 = 768000;
                    } else {
                        i9 = 80000;
                    }
                    i10 = (int) ((((long) (i7 == 5 ? i9 * 2 : i9)) * 250000) / 1000000);
                }
                i8 = i10;
            }
            this.h = i8;
            this.i = z2;
            this.j = z3;
            this.k = audioProcessorArr;
        }

        public long a(long j2) {
            return (j2 * 1000000) / ((long) this.e);
        }
    }

    public static class d implements b {
        private final AudioProcessor[] a;
        private final w b;
        private final y c;

        public d(AudioProcessor... audioProcessorArr) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[(audioProcessorArr.length + 2)];
            this.a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            w wVar = new w();
            this.b = wVar;
            y yVar = new y();
            this.c = yVar;
            audioProcessorArr2[audioProcessorArr.length] = wVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = yVar;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long a(long j) {
            return this.c.f(j);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public k0 b(k0 k0Var) {
            this.b.o(k0Var.c);
            return new k0(this.c.h(k0Var.a), this.c.g(k0Var.b), k0Var.c);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long c() {
            return this.b.m();
        }

        public AudioProcessor[] d() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public static final class e {
        private final k0 a;
        private final long b;
        private final long c;

        e(k0 k0Var, long j, long j2, a aVar) {
            this.a = k0Var;
            this.b = j;
            this.c = j2;
        }
    }

    private final class f implements o.a {
        f(a aVar) {
        }

        @Override // com.google.android.exoplayer2.audio.o.a
        public void a(int i, long j) {
            if (DefaultAudioSink.this.j != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - DefaultAudioSink.this.P;
                u.b bVar = (u.b) DefaultAudioSink.this.j;
                u.this.B0.b(i, j, elapsedRealtime);
                u.this.getClass();
            }
        }

        @Override // com.google.android.exoplayer2.audio.o.a
        public void b(long j) {
        }

        @Override // com.google.android.exoplayer2.audio.o.a
        public void c(long j, long j2, long j3, long j4) {
            DefaultAudioSink.c(DefaultAudioSink.this);
            DefaultAudioSink.this.o();
        }

        @Override // com.google.android.exoplayer2.audio.o.a
        public void d(long j, long j2, long j3, long j4) {
            DefaultAudioSink.c(DefaultAudioSink.this);
            DefaultAudioSink.this.o();
        }
    }

    public DefaultAudioSink(j jVar, AudioProcessor[] audioProcessorArr) {
        d dVar = new d(audioProcessorArr);
        this.a = jVar;
        this.b = dVar;
        r rVar = new r();
        this.c = rVar;
        z zVar = new z();
        this.d = zVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new v(), rVar, zVar);
        Collections.addAll(arrayList, dVar.d());
        this.e = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f = new AudioProcessor[]{new t()};
        this.B = 1.0f;
        this.z = 0;
        this.n = i.f;
        this.M = 0;
        this.N = new p(0, 0.0f);
        this.p = k0.e;
        this.I = -1;
        this.C = new AudioProcessor[0];
        this.D = new ByteBuffer[0];
        this.i = new ArrayDeque<>();
    }

    private void F() {
        if (t()) {
            if (f0.a >= 21) {
                this.m.setVolume(this.B);
                return;
            }
            AudioTrack audioTrack = this.m;
            float f2 = this.B;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r15 < r14) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void H(java.nio.ByteBuffer r13, long r14) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.H(java.nio.ByteBuffer, long):void");
    }

    static long c(DefaultAudioSink defaultAudioSink) {
        c cVar = defaultAudioSink.l;
        return cVar.a ? defaultAudioSink.u / ((long) cVar.b) : defaultAudioSink.v;
    }

    private void f(k0 k0Var, long j2) {
        this.i.add(new e(this.l.j ? this.b.b(k0Var) : k0.e, Math.max(0L, j2), this.l.a(o()), null));
        AudioProcessor[] audioProcessorArr = this.l.k;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.C = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.D = new ByteBuffer[size];
        l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean i() {
        /*
            r9 = this;
            int r0 = r9.I
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0016
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r0 = r9.l
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0012
        L_0x000f:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r9.C
            int r0 = r0.length
        L_0x0012:
            r9.I = r0
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r4 = r9.I
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.C
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x003a
            r4 = r5[r4]
            if (r0 == 0) goto L_0x002a
            r4.e()
        L_0x002a:
            r9.y(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x0034
            return r3
        L_0x0034:
            int r0 = r9.I
            int r0 = r0 + r2
            r9.I = r0
            goto L_0x0014
        L_0x003a:
            java.nio.ByteBuffer r0 = r9.F
            if (r0 == 0) goto L_0x0046
            r9.H(r0, r7)
            java.nio.ByteBuffer r0 = r9.F
            if (r0 == 0) goto L_0x0046
            return r3
        L_0x0046:
            r9.I = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.i():boolean");
    }

    private void l() {
        int i2 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.C;
            if (i2 < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i2];
                audioProcessor.flush();
                this.D[i2] = audioProcessor.a();
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private long o() {
        c cVar = this.l;
        return cVar.a ? this.w / ((long) cVar.d) : this.x;
    }

    private boolean t() {
        return this.m != null;
    }

    private void w() {
        if (!this.K) {
            this.K = true;
            this.h.e(o());
            this.m.stop();
            this.t = 0;
        }
    }

    private void y(long j2) {
        ByteBuffer byteBuffer;
        int length = this.C.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.D[i2 - 1];
            } else {
                byteBuffer = this.E;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.a;
                }
            }
            if (i2 == length) {
                H(byteBuffer, j2);
            } else {
                AudioProcessor audioProcessor = this.C[i2];
                audioProcessor.c(byteBuffer);
                ByteBuffer a2 = audioProcessor.a();
                this.D[i2] = a2;
                if (a2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    public void A(i iVar) {
        if (!this.n.equals(iVar)) {
            this.n = iVar;
            if (!this.O) {
                k();
                this.M = 0;
            }
        }
    }

    public void B(p pVar) {
        if (!this.N.equals(pVar)) {
            int i2 = pVar.a;
            float f2 = pVar.b;
            AudioTrack audioTrack = this.m;
            if (audioTrack != null) {
                if (this.N.a != i2) {
                    audioTrack.attachAuxEffect(i2);
                }
                if (i2 != 0) {
                    this.m.setAuxEffectSendLevel(f2);
                }
            }
            this.N = pVar;
        }
    }

    public void C(AudioSink.a aVar) {
        this.j = aVar;
    }

    public void D(k0 k0Var) {
        c cVar = this.l;
        if (cVar != null && !cVar.j) {
            this.p = k0.e;
        } else if (k0Var.equals(n())) {
        } else {
            if (t()) {
                this.o = k0Var;
            } else {
                this.p = k0Var;
            }
        }
    }

    public void E(float f2) {
        if (this.B != f2) {
            this.B = f2;
            F();
        }
    }

    public boolean G(int i2, int i3) {
        if (!f0.B(i3)) {
            j jVar = this.a;
            if (jVar == null || !jVar.c(i3) || (i2 != -1 && i2 > this.a.b())) {
                return false;
            }
            return true;
        } else if (i3 != 4 || f0.a >= 21) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(int r20, int r21, int r22, int r23, int[] r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.g(int, int, int, int, int[], int, int):void");
    }

    public void h() {
        if (this.O) {
            this.O = false;
            this.M = 0;
            k();
        }
    }

    public void j(int i2) {
        g.m(f0.a >= 21);
        if (!this.O || this.M != i2) {
            this.O = true;
            this.M = i2;
            k();
        }
    }

    public void k() {
        if (t()) {
            this.u = 0;
            this.v = 0;
            this.w = 0;
            this.x = 0;
            this.y = 0;
            k0 k0Var = this.o;
            if (k0Var != null) {
                this.p = k0Var;
                this.o = null;
            } else if (!this.i.isEmpty()) {
                this.p = this.i.getLast().a;
            }
            this.i.clear();
            this.q = 0;
            this.r = 0;
            this.d.m();
            l();
            this.E = null;
            this.F = null;
            this.K = false;
            this.J = false;
            this.I = -1;
            this.s = null;
            this.t = 0;
            this.z = 0;
            if (this.h.g()) {
                this.m.pause();
            }
            AudioTrack audioTrack = this.m;
            this.m = null;
            c cVar = this.k;
            if (cVar != null) {
                this.l = cVar;
                this.k = null;
            }
            this.h.k();
            this.g.close();
            new a(audioTrack).start();
        }
    }

    public long m(boolean z2) {
        long j2;
        long j3;
        long j4;
        if (!t() || this.z == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.h.c(z2), this.l.a(o()));
        long j5 = this.A;
        e eVar = null;
        while (!this.i.isEmpty() && min >= this.i.getFirst().c) {
            eVar = this.i.remove();
        }
        if (eVar != null) {
            this.p = eVar.a;
            this.r = eVar.c;
            this.q = eVar.b - this.A;
        }
        if (this.p.a == 1.0f) {
            j2 = (min + this.q) - this.r;
        } else {
            if (this.i.isEmpty()) {
                j3 = this.q;
                j4 = this.b.a(min - this.r);
            } else {
                j3 = this.q;
                j4 = f0.q(min - this.r, this.p.a);
            }
            j2 = j4 + j3;
        }
        return j5 + j2 + this.l.a(this.b.c());
    }

    public k0 n() {
        k0 k0Var = this.o;
        if (k0Var != null) {
            return k0Var;
        }
        return !this.i.isEmpty() ? this.i.getLast().a : this.p;
    }

    public boolean p(ByteBuffer byteBuffer, long j2) {
        int i2;
        int i3;
        int i4;
        byte b2;
        byte b3;
        int i5;
        AudioTrack audioTrack;
        AudioAttributes audioAttributes;
        ByteBuffer byteBuffer2 = this.E;
        g.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.k != null) {
            if (!i()) {
                return false;
            }
            c cVar = this.k;
            c cVar2 = this.l;
            cVar.getClass();
            if (!(cVar2.g == cVar.g && cVar2.e == cVar.e && cVar2.f == cVar.f)) {
                w();
                if (r()) {
                    return false;
                }
                k();
            } else {
                this.l = this.k;
                this.k = null;
            }
            f(this.p, j2);
        }
        if (!t()) {
            this.g.block();
            c cVar3 = this.l;
            cVar3.getClass();
            boolean z2 = this.O;
            i iVar = this.n;
            int i6 = this.M;
            if (f0.a >= 21) {
                if (z2) {
                    audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
                } else {
                    audioAttributes = iVar.a();
                }
                audioTrack = new AudioTrack(audioAttributes, new AudioFormat.Builder().setChannelMask(cVar3.f).setEncoding(cVar3.g).setSampleRate(cVar3.e).build(), cVar3.h, 1, i6 != 0 ? i6 : 0);
            } else {
                int x2 = f0.x(iVar.c);
                if (i6 == 0) {
                    audioTrack = new AudioTrack(x2, cVar3.e, cVar3.f, cVar3.g, cVar3.h, 1);
                } else {
                    audioTrack = new AudioTrack(x2, cVar3.e, cVar3.f, cVar3.g, cVar3.h, 1, i6);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                this.m = audioTrack;
                int audioSessionId = audioTrack.getAudioSessionId();
                if (this.M != audioSessionId) {
                    this.M = audioSessionId;
                    AudioSink.a aVar = this.j;
                    if (aVar != null) {
                        u.b bVar = (u.b) aVar;
                        u.this.B0.a(audioSessionId);
                        u.this.getClass();
                    }
                }
                f(this.p, j2);
                o oVar = this.h;
                AudioTrack audioTrack2 = this.m;
                c cVar4 = this.l;
                oVar.l(audioTrack2, cVar4.g, cVar4.d, cVar4.h);
                F();
                int i7 = this.N.a;
                if (i7 != 0) {
                    this.m.attachAuxEffect(i7);
                    this.m.setAuxEffectSendLevel(this.N.b);
                }
                if (this.L) {
                    this.L = true;
                    if (t()) {
                        this.h.m();
                        this.m.play();
                    }
                }
            } else {
                try {
                    audioTrack.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, cVar3.e, cVar3.f, cVar3.h);
            }
        }
        if (!this.h.i(o())) {
            return false;
        }
        if (this.E == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar5 = this.l;
            if (!cVar5.a && this.y == 0) {
                int i8 = cVar5.g;
                if (i8 == 7 || i8 == 8) {
                    int position = byteBuffer.position();
                    byte b4 = byteBuffer.get(position);
                    if (b4 != -2) {
                        if (b4 == -1) {
                            i3 = (byteBuffer.get(position + 4) & 7) << 4;
                            b3 = byteBuffer.get(position + 7);
                        } else if (b4 != 31) {
                            i3 = (byteBuffer.get(position + 4) & 1) << 6;
                            b2 = byteBuffer.get(position + 5);
                        } else {
                            i3 = (byteBuffer.get(position + 5) & 7) << 4;
                            b3 = byteBuffer.get(position + 6);
                        }
                        i4 = b3 & 60;
                        i2 = (((i4 >> 2) | i3) + 1) * 32;
                    } else {
                        i3 = (byteBuffer.get(position + 5) & 1) << 6;
                        b2 = byteBuffer.get(position + 4);
                    }
                    i4 = b2 & 252;
                    i2 = (((i4 >> 2) | i3) + 1) * 32;
                } else if (i8 == 5) {
                    i2 = 1536;
                } else if (i8 == 6 || i8 == 18) {
                    i2 = g.f(byteBuffer);
                } else if (i8 == 17) {
                    byte[] bArr = new byte[16];
                    int position2 = byteBuffer.position();
                    byteBuffer.get(bArr);
                    byteBuffer.position(position2);
                    i2 = h.b(new com.google.android.exoplayer2.util.u(bArr)).c;
                } else if (i8 == 14) {
                    int position3 = byteBuffer.position();
                    int limit = byteBuffer.limit() - 10;
                    int i9 = position3;
                    while (true) {
                        if (i9 > limit) {
                            i5 = -1;
                            break;
                        } else if ((byteBuffer.getInt(i9 + 4) & -16777217) == -1167101192) {
                            i5 = i9 - position3;
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (i5 == -1) {
                        i2 = 0;
                    } else {
                        i2 = (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                    }
                } else {
                    throw new IllegalStateException(je.p0("Unexpected audio encoding: ", i8));
                }
                this.y = i2;
                if (i2 == 0) {
                    return true;
                }
            }
            if (this.o != null) {
                if (!i()) {
                    return false;
                }
                k0 k0Var = this.o;
                this.o = null;
                f(k0Var, j2);
            }
            if (this.z == 0) {
                this.A = Math.max(0L, j2);
                this.z = 1;
            } else {
                long j3 = this.A;
                c cVar6 = this.l;
                long l2 = ((((cVar6.a ? this.u / ((long) cVar6.b) : this.v) - this.d.l()) * 1000000) / ((long) cVar6.c)) + j3;
                if (this.z == 1 && Math.abs(l2 - j2) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + l2 + ", got " + j2 + "]");
                    this.z = 2;
                }
                if (this.z == 2) {
                    long j4 = j2 - l2;
                    this.A += j4;
                    this.z = 1;
                    AudioSink.a aVar2 = this.j;
                    if (!(aVar2 == null || j4 == 0)) {
                        u.b bVar2 = (u.b) aVar2;
                        u.this.getClass();
                        u.this.M0 = true;
                    }
                }
            }
            if (this.l.a) {
                this.u += (long) byteBuffer.remaining();
            } else {
                this.v += (long) this.y;
            }
            this.E = byteBuffer;
        }
        if (this.l.i) {
            y(j2);
        } else {
            H(this.E, j2);
        }
        if (!this.E.hasRemaining()) {
            this.E = null;
            return true;
        } else if (!this.h.h(o())) {
            return false;
        } else {
            k();
            return true;
        }
    }

    public void q() {
        if (this.z == 1) {
            this.z = 2;
        }
    }

    public boolean r() {
        return t() && this.h.f(o());
    }

    public boolean s() {
        return !t() || (this.J && !r());
    }

    public void u() {
        this.L = false;
        if (t() && this.h.j()) {
            this.m.pause();
        }
    }

    public void v() {
        this.L = true;
        if (t()) {
            this.h.m();
            this.m.play();
        }
    }

    public void x() {
        if (!this.J && t() && i()) {
            w();
            this.J = true;
        }
    }

    public void z() {
        k();
        for (AudioProcessor audioProcessor : this.e) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f) {
            audioProcessor2.reset();
        }
        this.M = 0;
        this.L = false;
    }
}
