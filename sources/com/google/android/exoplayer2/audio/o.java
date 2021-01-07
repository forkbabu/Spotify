package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.f0;
import java.lang.reflect.Method;

final class o {
    private final a a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private n f;
    private int g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private Method l;
    private long m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private int t;
    private int u;
    private long v;
    private long w;
    private long x;
    private long y;

    public interface a {
        void a(int i, long j);

        void b(long j);

        void c(long j, long j2, long j3, long j4);

        void d(long j, long j2, long j3, long j4);
    }

    public o(a aVar) {
        this.a = aVar;
        if (f0.a >= 18) {
            try {
                this.l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    private long a(long j2) {
        return (j2 * 1000000) / ((long) this.g);
    }

    private long d() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (f0.a <= 29) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }

    public int b(long j2) {
        return this.e - ((int) (j2 - (d() * ((long) this.d))));
    }

    public long c(boolean z) {
        long j2;
        int i2;
        Method method;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long a2 = a(d());
            if (a2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.k >= 30000) {
                    long[] jArr = this.b;
                    int i3 = this.t;
                    jArr[i3] = a2 - nanoTime;
                    this.t = (i3 + 1) % 10;
                    int i4 = this.u;
                    if (i4 < 10) {
                        this.u = i4 + 1;
                    }
                    this.k = nanoTime;
                    this.j = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = this.u;
                        if (i5 >= i6) {
                            break;
                        }
                        this.j = (this.b[i5] / ((long) i6)) + this.j;
                        i5++;
                    }
                }
                if (!this.h) {
                    n nVar = this.f;
                    nVar.getClass();
                    if (!nVar.f(nanoTime)) {
                        i2 = 0;
                    } else {
                        long c2 = nVar.c();
                        long b2 = nVar.b();
                        if (Math.abs(c2 - nanoTime) > 5000000) {
                            i2 = 0;
                            this.a.d(b2, c2, nanoTime, a2);
                            nVar.g();
                        } else {
                            i2 = 0;
                            if (Math.abs(a(b2) - a2) > 5000000) {
                                this.a.c(b2, c2, nanoTime, a2);
                                nVar.g();
                            } else {
                                nVar.a();
                            }
                        }
                    }
                    if (this.o && (method = this.l) != null && nanoTime - this.p >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.c;
                            audioTrack2.getClass();
                            int i7 = f0.a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[i2])).intValue()) * 1000) - this.i;
                            this.m = intValue;
                            long max = Math.max(intValue, 0L);
                            this.m = max;
                            if (max > 5000000) {
                                this.a.b(max);
                                this.m = 0;
                            }
                        } catch (Exception unused) {
                            this.l = null;
                        }
                        this.p = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        n nVar2 = this.f;
        nVar2.getClass();
        if (nVar2.d()) {
            long a3 = a(nVar2.b());
            if (!nVar2.e()) {
                return a3;
            }
            return (nanoTime2 - nVar2.c()) + a3;
        }
        if (this.u == 0) {
            j2 = a(d());
        } else {
            j2 = nanoTime2 + this.j;
        }
        return !z ? j2 - this.m : j2;
    }

    public void e(long j2) {
        this.x = d();
        this.v = SystemClock.elapsedRealtime() * 1000;
        this.y = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(long r6) {
        /*
            r5 = this;
            long r0 = r5.d()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0029
            boolean r6 = r5.h
            if (r6 == 0) goto L_0x0026
            android.media.AudioTrack r6 = r5.c
            r6.getClass()
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L_0x0026
            long r6 = r5.d()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 == 0) goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.o.f(long):boolean");
    }

    public boolean g() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public boolean h(long j2) {
        return this.w != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.w >= 200;
    }

    public boolean i(long j2) {
        a aVar;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.n = false;
                return false;
            } else if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z = this.n;
        boolean f2 = f(j2);
        this.n = f2;
        if (z && !f2 && playState != 1 && (aVar = this.a) != null) {
            aVar.a(this.e, u.b(this.i));
        }
        return true;
    }

    public boolean j() {
        this.j = 0;
        this.u = 0;
        this.t = 0;
        this.k = 0;
        if (this.v != -9223372036854775807L) {
            return false;
        }
        n nVar = this.f;
        nVar.getClass();
        nVar.h();
        return true;
    }

    public void k() {
        this.j = 0;
        this.u = 0;
        this.t = 0;
        this.k = 0;
        this.c = null;
        this.f = null;
    }

    public void l(AudioTrack audioTrack, int i2, int i3, int i4) {
        this.c = audioTrack;
        this.d = i3;
        this.e = i4;
        this.f = new n(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = f0.a < 23 && (i2 == 5 || i2 == 6);
        boolean B = f0.B(i2);
        this.o = B;
        this.i = B ? a((long) (i4 / i3)) : -9223372036854775807L;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.n = false;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.m = 0;
    }

    public void m() {
        n nVar = this.f;
        nVar.getClass();
        nVar.h();
    }
}
