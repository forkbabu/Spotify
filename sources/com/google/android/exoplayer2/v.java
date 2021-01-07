package com.google.android.exoplayer2;

import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.util.g;
import com.spotify.music.features.ads.model.Ad;

public class v implements f0 {
    private final n a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final boolean h;
    private final long i;
    private final boolean j;
    private int k;
    private boolean l;
    private boolean m;

    public static final class a {
        private n a;
        private int b = 15000;
        private int c = 50000;
        private int d = 50000;
        private int e = 2500;
        private int f = CrashReportManager.TIME_WINDOW;
        private boolean g;

        public v a() {
            g.m(!this.g);
            this.g = true;
            if (this.a == null) {
                this.a = new n(true, 65536);
            }
            return new v(this.a, this.b, this.c, this.d, this.e, this.f, -1, true, 0, false);
        }

        public a b(int i, int i2, int i3, int i4) {
            g.m(!this.g);
            v.b(i3, 0, "bufferForPlaybackMs", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            v.b(i4, 0, "bufferForPlaybackAfterRebufferMs", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            v.b(i, i3, "minBufferMs", "bufferForPlaybackMs");
            v.b(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            v.b(i2, i, "maxBufferMs", "minBufferMs");
            this.b = i;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            return this;
        }
    }

    public v() {
        this(new n(true, 65536), 15000, 50000, 50000, 2500, CrashReportManager.TIME_WINDOW, -1, true, 0, false);
    }

    /* access modifiers changed from: private */
    public static void b(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        g.b(z, str + " cannot be less than " + str2);
    }

    private void i(boolean z) {
        this.k = 0;
        this.l = false;
        if (z) {
            this.a.f();
        }
    }

    public n c() {
        return this.a;
    }

    public long d() {
        return this.i;
    }

    public void e() {
        i(false);
    }

    public void f() {
        i(true);
    }

    public void g() {
        i(true);
    }

    public void h(p0[] p0VarArr, f0 f0Var, hq hqVar) {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= p0VarArr.length) {
                z = false;
                break;
            }
            if (p0VarArr[i2].c() == 2 && hqVar.a(i2) != null) {
                z = true;
                break;
            }
            i2++;
        }
        this.m = z;
        int i3 = this.g;
        if (i3 == -1) {
            i3 = 0;
            for (int i4 = 0; i4 < p0VarArr.length; i4++) {
                if (hqVar.a(i4) != null) {
                    int i5 = 131072;
                    switch (p0VarArr[i4].c()) {
                        case 0:
                            i5 = 36438016;
                            break;
                        case 1:
                            i5 = 3538944;
                            break;
                        case 2:
                            i5 = 32768000;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            break;
                        case 6:
                            i5 = 0;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    i3 += i5;
                }
            }
        }
        this.k = i3;
        this.a.g(i3);
    }

    public boolean j() {
        return this.j;
    }

    public boolean k(long j2, float f2) {
        boolean z = true;
        boolean z2 = this.a.c() >= this.k;
        long j3 = this.m ? this.c : this.b;
        if (f2 > 1.0f) {
            j3 = Math.min(com.google.android.exoplayer2.util.f0.q(j3, f2), this.d);
        }
        if (j2 < j3) {
            if (!this.h && z2) {
                z = false;
            }
            this.l = z;
        } else if (j2 >= this.d || z2) {
            this.l = false;
        }
        return this.l;
    }

    public boolean l(long j2, float f2, boolean z) {
        long v = com.google.android.exoplayer2.util.f0.v(j2, f2);
        long j3 = z ? this.f : this.e;
        return j3 <= 0 || v >= j3 || (!this.h && this.a.c() >= this.k);
    }

    protected v(n nVar, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, boolean z2) {
        b(i5, 0, "bufferForPlaybackMs", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        b(i6, 0, "bufferForPlaybackAfterRebufferMs", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        b(i2, i5, "minBufferAudioMs", "bufferForPlaybackMs");
        b(i3, i5, "minBufferVideoMs", "bufferForPlaybackMs");
        b(i2, i6, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        b(i3, i6, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        b(i4, i2, "maxBufferMs", "minBufferAudioMs");
        b(i4, i3, "maxBufferMs", "minBufferVideoMs");
        b(i8, 0, "backBufferDurationMs", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        this.a = nVar;
        this.b = u.a((long) i2);
        this.c = u.a((long) i3);
        this.d = u.a((long) i4);
        this.e = u.a((long) i5);
        this.f = u.a((long) i6);
        this.g = i7;
        this.h = z;
        this.i = u.a((long) i8);
        this.j = z2;
    }
}
