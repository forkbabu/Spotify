package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class u extends MediaCodecRenderer implements r {
    private final Context A0;
    private final m.a B0;
    private final AudioSink C0;
    private final long[] D0 = new long[10];
    private int E0;
    private boolean F0;
    private boolean G0;
    private boolean H0;
    private MediaFormat I0;
    private d0 J0;
    private long K0;
    private boolean L0;
    private boolean M0;
    private long N0 = -9223372036854775807L;
    private int O0;

    /* access modifiers changed from: private */
    public final class b implements AudioSink.a {
        b(a aVar) {
        }
    }

    @Deprecated
    public u(Context context, f fVar, n<s> nVar, boolean z, boolean z2, Handler handler, m mVar, AudioSink audioSink) {
        super(1, fVar, nVar, z, z2, 44100.0f);
        this.A0 = context.getApplicationContext();
        this.C0 = audioSink;
        this.B0 = new m.a(handler, mVar);
        ((DefaultAudioSink) audioSink).C(new b(null));
    }

    private int C0(e eVar, d0 d0Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(eVar.a) || (i = f0.a) >= 24 || (i == 23 && f0.D(this.A0))) {
            return d0Var.s;
        }
        return -1;
    }

    private void E0() {
        long m = ((DefaultAudioSink) this.C0).m(b());
        if (m != Long.MIN_VALUE) {
            if (!this.M0) {
                m = Math.max(this.K0, m);
            }
            this.K0 = m;
            this.M0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public int D0(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (((DefaultAudioSink) this.C0).G(-1, 18)) {
                return com.google.android.exoplayer2.util.s.b("audio/eac3-joc");
            }
            str = "audio/eac3";
        }
        int b2 = com.google.android.exoplayer2.util.s.b(str);
        if (((DefaultAudioSink) this.C0).G(i, b2)) {
            return b2;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void E() {
        try {
            this.N0 = -9223372036854775807L;
            this.O0 = 0;
            ((DefaultAudioSink) this.C0).k();
            try {
                super.E();
            } finally {
                this.B0.d(this.y0);
            }
        } catch (Throwable th) {
            super.E();
            throw th;
        } finally {
            this.B0.d(this.y0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void F(boolean z) {
        super.F(z);
        this.B0.e(this.y0);
        int i = y().a;
        if (i != 0) {
            ((DefaultAudioSink) this.C0).j(i);
        } else {
            ((DefaultAudioSink) this.C0).h();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void G(long j, boolean z) {
        super.G(j, z);
        ((DefaultAudioSink) this.C0).k();
        this.K0 = j;
        this.L0 = true;
        this.M0 = true;
        this.N0 = -9223372036854775807L;
        this.O0 = 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void H() {
        try {
            super.H();
        } finally {
            ((DefaultAudioSink) this.C0).z();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void I() {
        ((DefaultAudioSink) this.C0).v();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void J() {
        E0();
        ((DefaultAudioSink) this.C0).u();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void K(d0[] d0VarArr, long j) {
        long j2 = this.N0;
        if (j2 != -9223372036854775807L) {
            int i = this.O0;
            long[] jArr = this.D0;
            if (i == jArr.length) {
                long j3 = jArr[i - 1];
            } else {
                this.O0 = i + 1;
            }
            jArr[this.O0 - 1] = j2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int O(MediaCodec mediaCodec, e eVar, d0 d0Var, d0 d0Var2) {
        if (C0(eVar, d0Var2) <= this.E0 && d0Var.H == 0 && d0Var.I == 0 && d0Var2.H == 0 && d0Var2.I == 0) {
            if (eVar.g(d0Var, d0Var2, true)) {
                return 3;
            }
            if (f0.a(d0Var.r, d0Var2.r) && d0Var.E == d0Var2.E && d0Var.F == d0Var2.F && d0Var.G == d0Var2.G && d0Var.C(d0Var2) && !"audio/opus".equals(d0Var.r)) {
                return 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P(com.google.android.exoplayer2.mediacodec.e r9, android.media.MediaCodec r10, com.google.android.exoplayer2.d0 r11, android.media.MediaCrypto r12, float r13) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.u.P(com.google.android.exoplayer2.mediacodec.e, android.media.MediaCodec, com.google.android.exoplayer2.d0, android.media.MediaCrypto, float):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float a0(float f, d0 d0Var, d0[] d0VarArr) {
        int i = -1;
        for (d0 d0Var2 : d0VarArr) {
            int i2 = d0Var2.F;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.p0
    public boolean b() {
        return super.b() && ((DefaultAudioSink) this.C0).s();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<e> b0(f fVar, d0 d0Var, boolean z) {
        e a2;
        String str = d0Var.r;
        if (str == null) {
            return Collections.emptyList();
        }
        if ((D0(d0Var.E, str) != 0) && (a2 = fVar.a()) != null) {
            return Collections.singletonList(a2);
        }
        List<e> g = MediaCodecUtil.g(fVar.b(str, z, false), d0Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(g);
            arrayList.addAll(fVar.b("audio/eac3", z, false));
            g = arrayList;
        }
        return Collections.unmodifiableList(g);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.p0
    public boolean d() {
        return ((DefaultAudioSink) this.C0).r() || super.d();
    }

    @Override // com.google.android.exoplayer2.util.r
    public long f() {
        if (getState() == 2) {
            E0();
        }
        return this.K0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void g0(String str, long j, long j2) {
        this.B0.c(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.p0
    public r h() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void h0(e0 e0Var) {
        super.h0(e0Var);
        d0 d0Var = e0Var.c;
        this.J0 = d0Var;
        this.B0.f(d0Var);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void i0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.I0;
        if (mediaFormat2 != null) {
            i = D0(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            d0 d0Var = this.J0;
            i = "audio/raw".equals(d0Var.r) ? d0Var.G : 2;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.G0 || integer != 6 || (i2 = this.J0.E) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.J0.E; i3++) {
                iArr[i3] = i3;
            }
        }
        try {
            AudioSink audioSink = this.C0;
            d0 d0Var2 = this.J0;
            ((DefaultAudioSink) audioSink).g(i, integer, integer2, 0, iArr, d0Var2.H, d0Var2.I);
        } catch (AudioSink.ConfigurationException e) {
            throw x(e, this.J0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void j0(long j) {
        while (this.O0 != 0 && j >= this.D0[0]) {
            ((DefaultAudioSink) this.C0).q();
            int i = this.O0 - 1;
            this.O0 = i;
            long[] jArr = this.D0;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void k0(fj fjVar) {
        if (this.L0 && !fjVar.isDecodeOnly()) {
            if (Math.abs(fjVar.c - this.K0) > 500000) {
                this.K0 = fjVar.c;
            }
            this.L0 = false;
        }
        this.N0 = Math.max(fjVar.c, this.N0);
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.n0.b
    public void l(int i, Object obj) {
        if (i == 2) {
            ((DefaultAudioSink) this.C0).E(((Float) obj).floatValue());
        } else if (i == 3) {
            ((DefaultAudioSink) this.C0).A((i) obj);
        } else if (i == 5) {
            ((DefaultAudioSink) this.C0).B((p) obj);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean m0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, d0 d0Var) {
        if (this.H0 && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.N0;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
        }
        if (this.F0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.y0.f++;
            ((DefaultAudioSink) this.C0).q();
            return true;
        } else {
            try {
                if (!((DefaultAudioSink) this.C0).p(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.y0.e++;
                return true;
            } catch (AudioSink.InitializationException | AudioSink.WriteException e) {
                throw x(e, this.J0);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.r
    public k0 p() {
        return ((DefaultAudioSink) this.C0).n();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void p0() {
        try {
            ((DefaultAudioSink) this.C0).x();
        } catch (AudioSink.WriteException e) {
            throw x(e, this.J0);
        }
    }

    @Override // com.google.android.exoplayer2.util.r
    public void v(k0 k0Var) {
        ((DefaultAudioSink) this.C0).D(k0Var);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (((com.google.android.exoplayer2.audio.DefaultAudioSink) r6.C0).G(r9.E, r9.G) != false) goto L_0x0061;
     */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int w0(com.google.android.exoplayer2.mediacodec.f r7, com.google.android.exoplayer2.drm.n<com.google.android.exoplayer2.drm.s> r8, com.google.android.exoplayer2.d0 r9) {
        /*
            r6 = this;
            java.lang.String r0 = r9.r
            boolean r1 = com.google.android.exoplayer2.util.s.h(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = com.google.android.exoplayer2.util.f0.a
            r3 = 21
            if (r1 < r3) goto L_0x0013
            r1 = 32
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            com.google.android.exoplayer2.drm.l r3 = r9.u
            r4 = 1
            if (r3 == 0) goto L_0x0032
            java.lang.Class<com.google.android.exoplayer2.drm.s> r3 = com.google.android.exoplayer2.drm.s.class
            java.lang.Class<? extends com.google.android.exoplayer2.drm.q> r5 = r9.L
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0032
            java.lang.Class<? extends com.google.android.exoplayer2.drm.q> r3 = r9.L
            if (r3 != 0) goto L_0x0030
            com.google.android.exoplayer2.drm.l r3 = r9.u
            boolean r8 = com.google.android.exoplayer2.t.N(r8, r3)
            if (r8 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r8 = 0
            goto L_0x0033
        L_0x0032:
            r8 = 1
        L_0x0033:
            if (r8 == 0) goto L_0x004b
            int r3 = r9.E
            int r3 = r6.D0(r3, r0)
            if (r3 == 0) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r3 == 0) goto L_0x004b
            com.google.android.exoplayer2.mediacodec.e r3 = r7.a()
            if (r3 == 0) goto L_0x004b
            r7 = r1 | 12
            return r7
        L_0x004b:
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0061
            com.google.android.exoplayer2.audio.AudioSink r0 = r6.C0
            int r3 = r9.E
            int r5 = r9.G
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            boolean r0 = r0.G(r3, r5)
            if (r0 == 0) goto L_0x006e
        L_0x0061:
            com.google.android.exoplayer2.audio.AudioSink r0 = r6.C0
            int r3 = r9.E
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            r5 = 2
            boolean r0 = r0.G(r3, r5)
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            return r4
        L_0x006f:
            java.util.List r7 = r6.b0(r7, r9, r2)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x007a
            return r4
        L_0x007a:
            if (r8 != 0) goto L_0x007d
            return r5
        L_0x007d:
            java.lang.Object r7 = r7.get(r2)
            com.google.android.exoplayer2.mediacodec.e r7 = (com.google.android.exoplayer2.mediacodec.e) r7
            boolean r8 = r7.e(r9)
            if (r8 == 0) goto L_0x0092
            boolean r7 = r7.f(r9)
            if (r7 == 0) goto L_0x0092
            r7 = 16
            goto L_0x0094
        L_0x0092:
            r7 = 8
        L_0x0094:
            if (r8 == 0) goto L_0x0098
            r8 = 4
            goto L_0x0099
        L_0x0098:
            r8 = 3
        L_0x0099:
            r7 = r7 | r8
            r7 = r7 | r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.u.w0(com.google.android.exoplayer2.mediacodec.f, com.google.android.exoplayer2.drm.n, com.google.android.exoplayer2.d0):int");
    }
}
