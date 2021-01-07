package defpackage;

import android.util.SparseArray;
import com.adjust.sdk.Constants;
import com.comscore.streaming.AdvertisementType;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.q;
import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.xj;
import defpackage.zj;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: ek  reason: default package */
public class ek implements qj {
    private static final byte[] a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] b0 = f0.z("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] c0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID d0 = new UUID(72057594037932032L, -9223371306706625679L);
    private long A = -1;
    private long B = -9223372036854775807L;
    private q C;
    private q D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private int I;
    private int J;
    private int[] K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private byte X;
    private boolean Y;
    private rj Z;
    private final dk a;
    private final gk b;
    private final SparseArray<c> c;
    private final boolean d;
    private final v e;
    private final v f;
    private final v g;
    private final v h;
    private final v i;
    private final v j;
    private final v k;
    private final v l;
    private final v m;
    private final v n;
    private ByteBuffer o;
    private long p;
    private long q = -1;
    private long r = -9223372036854775807L;
    private long s = -9223372036854775807L;
    private long t = -9223372036854775807L;
    private c u;
    private boolean v;
    private int w;
    private long x;
    private boolean y;
    private long z = -1;

    /* access modifiers changed from: private */
    /* renamed from: ek$b */
    public final class b implements ck {
        b(a aVar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ek$d */
    public static final class d {
        private final byte[] a = new byte[10];
        private boolean b;
        private int c;
        private long d;
        private int e;
        private int f;
        private int g;

        public void a(c cVar) {
            if (this.c > 0) {
                cVar.V.d(this.d, this.e, this.f, this.g, cVar.i);
                this.c = 0;
            }
        }

        public void b() {
            this.b = false;
            this.c = 0;
        }

        public void c(c cVar, long j, int i, int i2, int i3) {
            if (this.b) {
                int i4 = this.c;
                int i5 = i4 + 1;
                this.c = i5;
                if (i4 == 0) {
                    this.d = j;
                    this.e = i;
                    this.f = 0;
                }
                this.f += i2;
                this.g = i3;
                if (i5 < 16) {
                    a(cVar);
                }
            }
        }

        public void d(nj njVar) {
            if (!this.b) {
                int i = 0;
                njVar.f(this.a, 0, 10, false);
                njVar.j();
                byte[] bArr = this.a;
                if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                    if ((bArr[7] & 255) == 187) {
                        i = 1;
                    }
                    i = 40 << ((bArr[i != 0 ? (char) '\t' : '\b'] >> 4) & 7);
                }
                if (i != 0) {
                    this.b = true;
                }
            }
        }
    }

    public ek(int i2) {
        bk bkVar = new bk();
        this.a = bkVar;
        bkVar.a(new b(null));
        this.d = (i2 & 1) != 0 ? false : true;
        this.b = new gk();
        this.c = new SparseArray<>();
        this.g = new v(4);
        this.h = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new v(4);
        this.e = new v(t.a);
        this.f = new v(4);
        this.j = new v();
        this.k = new v();
        this.l = new v(8);
        this.m = new v();
        this.n = new v();
    }

    private void i(c cVar, long j2, int i2, int i3, int i4) {
        int i5;
        byte[] bArr;
        d dVar = cVar.R;
        if (dVar != null) {
            dVar.c(cVar, j2, i2, i3, i4);
        } else {
            if (("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b)) && this.J <= 1) {
                long j3 = this.t;
                if (j3 != -9223372036854775807L) {
                    String str = cVar.b;
                    byte[] bArr2 = this.k.a;
                    str.hashCode();
                    if (str.equals("S_TEXT/ASS")) {
                        bArr = m(j3, "%01d:%02d:%02d:%02d", 10000);
                        i5 = 21;
                    } else if (str.equals("S_TEXT/UTF8")) {
                        bArr = m(j3, "%02d:%02d:%02d,%03d", 1000);
                        i5 = 19;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArr, 0, bArr2, i5, bArr.length);
                    zj zjVar = cVar.V;
                    v vVar = this.k;
                    zjVar.b(vVar, vVar.c());
                    i3 += this.k.c();
                }
            }
            if ((268435456 & i2) != 0) {
                if (this.J > 1) {
                    i2 &= -268435457;
                } else {
                    int c2 = this.n.c();
                    cVar.V.b(this.n, c2);
                    i3 += c2;
                }
            }
            cVar.V.d(j2, i2, i3, i4, cVar.i);
        }
        this.F = true;
    }

    private static int[] k(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        if (iArr.length >= i2) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i2)];
    }

    private static byte[] m(long j2, String str, long j3) {
        g.a(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i2 * 3600)) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i3 * 60)) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return f0.z(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (((long) i4) * 1000000)) / j3))));
    }

    private void o(nj njVar, int i2) {
        if (this.g.c() < i2) {
            v vVar = this.g;
            byte[] bArr = vVar.a;
            if (bArr.length < i2) {
                vVar.I(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i2)), this.g.c());
            }
            v vVar2 = this.g;
            njVar.i(vVar2.a, vVar2.c(), i2 - this.g.c(), false);
            this.g.J(i2);
        }
    }

    private void p() {
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.j.F();
    }

    private long q(long j2) {
        long j3 = this.r;
        if (j3 != -9223372036854775807L) {
            return f0.K(j2, j3, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    private int t(nj njVar, c cVar, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            u(njVar, a0, i2);
            int i4 = this.R;
            p();
            return i4;
        } else if ("S_TEXT/ASS".equals(cVar.b)) {
            u(njVar, c0, i2);
            int i5 = this.R;
            p();
            return i5;
        } else {
            zj zjVar = cVar.V;
            boolean z2 = true;
            if (!this.T) {
                if (cVar.g) {
                    this.N &= -1073741825;
                    int i6 = 128;
                    if (!this.U) {
                        njVar.i(this.g.a, 0, 1, false);
                        this.Q++;
                        byte[] bArr = this.g.a;
                        if ((bArr[0] & 128) != 128) {
                            this.X = bArr[0];
                            this.U = true;
                        } else {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = this.X;
                    if ((b2 & 1) == 1) {
                        boolean z3 = (b2 & 2) == 2;
                        this.N |= 1073741824;
                        if (!this.Y) {
                            njVar.i(this.l.a, 0, 8, false);
                            this.Q += 8;
                            this.Y = true;
                            v vVar = this.g;
                            byte[] bArr2 = vVar.a;
                            if (!z3) {
                                i6 = 0;
                            }
                            bArr2[0] = (byte) (i6 | 8);
                            vVar.K(0);
                            zjVar.b(this.g, 1);
                            this.R++;
                            this.l.K(0);
                            zjVar.b(this.l, 8);
                            this.R += 8;
                        }
                        if (z3) {
                            if (!this.V) {
                                njVar.i(this.g.a, 0, 1, false);
                                this.Q++;
                                this.g.K(0);
                                this.W = this.g.x();
                                this.V = true;
                            }
                            int i7 = this.W * 4;
                            this.g.G(i7);
                            njVar.i(this.g.a, 0, i7, false);
                            this.Q += i7;
                            short s2 = (short) ((this.W / 2) + 1);
                            int i8 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.o;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.o = ByteBuffer.allocate(i8);
                            }
                            this.o.position(0);
                            this.o.putShort(s2);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                i3 = this.W;
                                if (i9 >= i3) {
                                    break;
                                }
                                int B2 = this.g.B();
                                if (i9 % 2 == 0) {
                                    this.o.putShort((short) (B2 - i10));
                                } else {
                                    this.o.putInt(B2 - i10);
                                }
                                i9++;
                                i10 = B2;
                            }
                            int i11 = (i2 - this.Q) - i10;
                            if (i3 % 2 == 1) {
                                this.o.putInt(i11);
                            } else {
                                this.o.putShort((short) i11);
                                this.o.putInt(0);
                            }
                            this.m.I(this.o.array(), i8);
                            zjVar.b(this.m, i8);
                            this.R += i8;
                        }
                    }
                } else {
                    byte[] bArr3 = cVar.h;
                    if (bArr3 != null) {
                        this.j.I(bArr3, bArr3.length);
                    }
                }
                if (cVar.f > 0) {
                    this.N |= 268435456;
                    this.n.F();
                    this.g.G(4);
                    v vVar2 = this.g;
                    byte[] bArr4 = vVar2.a;
                    bArr4[0] = (byte) ((i2 >> 24) & BitmapRenderer.ALPHA_VISIBLE);
                    bArr4[1] = (byte) ((i2 >> 16) & BitmapRenderer.ALPHA_VISIBLE);
                    bArr4[2] = (byte) ((i2 >> 8) & BitmapRenderer.ALPHA_VISIBLE);
                    bArr4[3] = (byte) (i2 & BitmapRenderer.ALPHA_VISIBLE);
                    zjVar.b(vVar2, 4);
                    this.R += 4;
                }
                this.T = true;
            }
            int c2 = this.j.c() + i2;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
                if (cVar.R != null) {
                    if (this.j.c() != 0) {
                        z2 = false;
                    }
                    g.m(z2);
                    cVar.R.d(njVar);
                }
                while (true) {
                    int i12 = this.Q;
                    if (i12 >= c2) {
                        break;
                    }
                    int v2 = v(njVar, zjVar, c2 - i12);
                    this.Q += v2;
                    this.R += v2;
                }
            } else {
                byte[] bArr5 = this.f.a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i13 = cVar.W;
                int i14 = 4 - i13;
                while (this.Q < c2) {
                    int i15 = this.S;
                    if (i15 == 0) {
                        int min = Math.min(i13, this.j.a());
                        njVar.i(bArr5, i14 + min, i13 - min, false);
                        if (min > 0) {
                            this.j.g(bArr5, i14, min);
                        }
                        this.Q += i13;
                        this.f.K(0);
                        this.S = this.f.B();
                        this.e.K(0);
                        zjVar.b(this.e, 4);
                        this.R += 4;
                    } else {
                        int v3 = v(njVar, zjVar, i15);
                        this.Q += v3;
                        this.R += v3;
                        this.S -= v3;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.b)) {
                this.h.K(0);
                zjVar.b(this.h, 4);
                this.R += 4;
            }
            int i16 = this.R;
            p();
            return i16;
        }
    }

    private void u(nj njVar, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        v vVar = this.k;
        byte[] bArr2 = vVar.a;
        if (bArr2.length < length) {
            vVar.a = Arrays.copyOf(bArr, length + i2);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        njVar.i(this.k.a, bArr.length, i2, false);
        this.k.G(length);
    }

    private int v(nj njVar, zj zjVar, int i2) {
        int a2 = this.j.a();
        if (a2 <= 0) {
            return zjVar.a(njVar, i2, false);
        }
        int min = Math.min(i2, a2);
        zjVar.b(this.j, min);
        return min;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0005 A[SYNTHETIC] */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.nj r9, defpackage.wj r10) {
        /*
            r8 = this;
            r0 = 0
            r8.F = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003c
            boolean r3 = r8.F
            if (r3 != 0) goto L_0x003c
            dk r2 = r8.a
            bk r2 = (defpackage.bk) r2
            boolean r2 = r2.b(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.e()
            boolean r5 = r8.y
            if (r5 == 0) goto L_0x0027
            r8.A = r3
            long r3 = r8.z
            r10.a = r3
            r8.y = r0
        L_0x0025:
            r3 = 1
            goto L_0x0039
        L_0x0027:
            boolean r3 = r8.v
            if (r3 == 0) goto L_0x0038
            long r3 = r8.A
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0038
            r10.a = r3
            r8.A = r5
            goto L_0x0025
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003c:
            if (r2 != 0) goto L_0x005a
        L_0x003e:
            android.util.SparseArray<ek$c> r9 = r8.c
            int r9 = r9.size()
            if (r0 >= r9) goto L_0x0058
            android.util.SparseArray<ek$c> r9 = r8.c
            java.lang.Object r9 = r9.valueAt(r0)
            ek$c r9 = (defpackage.ek.c) r9
            ek$d r10 = r9.R
            if (r10 == 0) goto L_0x0055
            r10.a(r9)
        L_0x0055:
            int r0 = r0 + 1
            goto L_0x003e
        L_0x0058:
            r9 = -1
            return r9
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek.a(nj, wj):int");
    }

    @Override // defpackage.qj
    public final void b(rj rjVar) {
        this.Z = rjVar;
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ((bk) this.a).d();
        this.b.e();
        p();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            d dVar = this.c.valueAt(i2).R;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    @Override // defpackage.qj
    public final void d() {
    }

    @Override // defpackage.qj
    public final boolean f(nj njVar) {
        return new fk().b(njVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0211, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(int r21, int r22, defpackage.nj r23) {
        /*
        // Method dump skipped, instructions count: 705
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek.h(int, int, nj):void");
    }

    /* access modifiers changed from: protected */
    public void j(int i2) {
        xj xjVar;
        q qVar;
        q qVar2;
        int i3;
        if (i2 != 160) {
            if (i2 == 174) {
                String str = this.u.b;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    c cVar = this.u;
                    cVar.b(this.Z, cVar.c);
                    SparseArray<c> sparseArray = this.c;
                    c cVar2 = this.u;
                    sparseArray.put(cVar2.c, cVar2);
                }
                this.u = null;
            } else if (i2 == 19899) {
                int i4 = this.w;
                if (i4 != -1) {
                    long j2 = this.x;
                    if (j2 != -1) {
                        if (i4 == 475249515) {
                            this.z = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                c cVar3 = this.u;
                if (cVar3.g) {
                    zj.a aVar = cVar3.i;
                    if (aVar != null) {
                        cVar3.k = new l(new l.b(u.a, null, "video/webm", aVar.b));
                        return;
                    }
                    throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                }
            } else if (i2 == 28032) {
                c cVar4 = this.u;
                if (cVar4.g && cVar4.h != null) {
                    throw new ParserException("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.r == -9223372036854775807L) {
                    this.r = 1000000;
                }
                long j3 = this.s;
                if (j3 != -9223372036854775807L) {
                    this.t = q(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.v) {
                    rj rjVar = this.Z;
                    if (this.q == -1 || this.t == -9223372036854775807L || (qVar = this.C) == null || qVar.c() == 0 || (qVar2 = this.D) == null || qVar2.c() != this.C.c()) {
                        this.C = null;
                        this.D = null;
                        xjVar = new xj.b(this.t, 0);
                    } else {
                        int c2 = this.C.c();
                        int[] iArr = new int[c2];
                        long[] jArr = new long[c2];
                        long[] jArr2 = new long[c2];
                        long[] jArr3 = new long[c2];
                        for (int i5 = 0; i5 < c2; i5++) {
                            jArr3[i5] = this.C.b(i5);
                            jArr[i5] = this.D.b(i5) + this.q;
                        }
                        int i6 = 0;
                        while (true) {
                            i3 = c2 - 1;
                            if (i6 >= i3) {
                                break;
                            }
                            int i7 = i6 + 1;
                            iArr[i6] = (int) (jArr[i7] - jArr[i6]);
                            jArr2[i6] = jArr3[i7] - jArr3[i6];
                            i6 = i7;
                        }
                        iArr[i3] = (int) ((this.q + this.p) - jArr[i3]);
                        jArr2[i3] = this.t - jArr3[i3];
                        if (jArr2[i3] <= 0) {
                            iArr = Arrays.copyOf(iArr, i3);
                            jArr = Arrays.copyOf(jArr, i3);
                            jArr2 = Arrays.copyOf(jArr2, i3);
                            jArr3 = Arrays.copyOf(jArr3, i3);
                        }
                        this.C = null;
                        this.D = null;
                        xjVar = new lj(iArr, jArr, jArr2, jArr3);
                    }
                    rjVar.j(xjVar);
                    this.v = true;
                }
            } else if (this.c.size() != 0) {
                this.Z.q();
            } else {
                throw new ParserException("No valid tracks were found");
            }
        } else if (this.G == 2) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.J; i9++) {
                i8 += this.K[i9];
            }
            c cVar5 = this.c.get(this.L);
            int i10 = 0;
            while (i10 < this.J) {
                long j4 = ((long) ((cVar5.e * i10) / Constants.ONE_SECOND)) + this.H;
                int i11 = this.N;
                if (i10 == 0 && !this.P) {
                    i11 |= 1;
                }
                int i12 = this.K[i10];
                int i13 = i8 - i12;
                i(cVar5, j4, i11, i12, i13);
                i10++;
                i8 = i13;
            }
            this.G = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void l(int i2, double d2) {
        if (i2 == 181) {
            this.u.O = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.u.C = (float) d2;
                    return;
                case 21970:
                    this.u.D = (float) d2;
                    return;
                case 21971:
                    this.u.E = (float) d2;
                    return;
                case 21972:
                    this.u.F = (float) d2;
                    return;
                case 21973:
                    this.u.G = (float) d2;
                    return;
                case 21974:
                    this.u.H = (float) d2;
                    return;
                case 21975:
                    this.u.I = (float) d2;
                    return;
                case 21976:
                    this.u.J = (float) d2;
                    return;
                case 21977:
                    this.u.K = (float) d2;
                    return;
                case 21978:
                    this.u.L = (float) d2;
                    return;
                default:
                    switch (i2) {
                        case 30323:
                            this.u.r = (float) d2;
                            return;
                        case 30324:
                            this.u.s = (float) d2;
                            return;
                        case 30325:
                            this.u.t = (float) d2;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.s = (long) d2;
        }
    }

    /* access modifiers changed from: protected */
    public void n(int i2, long j2) {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.u.d = (int) j2;
                        return;
                    case 136:
                        c cVar = this.u;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        cVar.T = z2;
                        return;
                    case 155:
                        q(j2);
                        return;
                    case 159:
                        this.u.M = (int) j2;
                        return;
                    case 176:
                        this.u.l = (int) j2;
                        return;
                    case 179:
                        this.C.a(q(j2));
                        return;
                    case 186:
                        this.u.m = (int) j2;
                        return;
                    case 215:
                        this.u.c = (int) j2;
                        return;
                    case AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL /* 231 */:
                        this.B = q(j2);
                        return;
                    case 238:
                        this.O = (int) j2;
                        return;
                    case 241:
                        if (!this.E) {
                            this.D.a(j2);
                            this.E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.P = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            throw new ParserException("ContentCompAlgo " + j2 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            throw new ParserException("DocTypeReadVersion " + j2 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            throw new ParserException("EBMLReadVersion " + j2 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            throw new ParserException("ContentEncAlgo " + j2 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            throw new ParserException("AESSettingsCipherMode " + j2 + " not supported");
                        }
                        return;
                    case 21420:
                        this.x = j2 + this.q;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.u.v = 0;
                            return;
                        } else if (i3 == 1) {
                            this.u.v = 2;
                            return;
                        } else if (i3 == 3) {
                            this.u.v = 1;
                            return;
                        } else if (i3 == 15) {
                            this.u.v = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.u.n = (int) j2;
                        return;
                    case 21682:
                        this.u.p = (int) j2;
                        return;
                    case 21690:
                        this.u.o = (int) j2;
                        return;
                    case 21930:
                        c cVar2 = this.u;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        cVar2.S = z2;
                        return;
                    case 21998:
                        this.u.f = (int) j2;
                        return;
                    case 22186:
                        this.u.P = j2;
                        return;
                    case 22203:
                        this.u.Q = j2;
                        return;
                    case 25188:
                        this.u.N = (int) j2;
                        return;
                    case 30321:
                        int i4 = (int) j2;
                        if (i4 == 0) {
                            this.u.q = 0;
                            return;
                        } else if (i4 == 1) {
                            this.u.q = 1;
                            return;
                        } else if (i4 == 2) {
                            this.u.q = 2;
                            return;
                        } else if (i4 == 3) {
                            this.u.q = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        this.u.e = (int) j2;
                        return;
                    case 2807729:
                        this.r = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i5 = (int) j2;
                                if (i5 == 1) {
                                    this.u.z = 2;
                                    return;
                                } else if (i5 == 2) {
                                    this.u.z = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i6 = (int) j2;
                                if (i6 != 1) {
                                    if (i6 == 16) {
                                        this.u.y = 6;
                                        return;
                                    } else if (i6 == 18) {
                                        this.u.y = 7;
                                        return;
                                    } else if (!(i6 == 6 || i6 == 7)) {
                                        return;
                                    }
                                }
                                this.u.y = 3;
                                return;
                            case 21947:
                                c cVar3 = this.u;
                                cVar3.w = true;
                                int i7 = (int) j2;
                                if (i7 == 1) {
                                    cVar3.x = 1;
                                    return;
                                } else if (i7 == 9) {
                                    cVar3.x = 6;
                                    return;
                                } else if (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) {
                                    cVar3.x = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.u.A = (int) j2;
                                return;
                            case 21949:
                                this.u.B = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                throw new ParserException("ContentEncodingScope " + j2 + " not supported");
            }
        } else if (j2 != 0) {
            throw new ParserException("ContentEncodingOrder " + j2 + " not supported");
        }
    }

    /* access modifiers changed from: protected */
    public void r(int i2, long j2, long j3) {
        if (i2 == 160) {
            this.P = false;
        } else if (i2 == 174) {
            this.u = new c(null);
        } else if (i2 == 187) {
            this.E = false;
        } else if (i2 == 19899) {
            this.w = -1;
            this.x = -1;
        } else if (i2 == 20533) {
            this.u.g = true;
        } else if (i2 == 21968) {
            this.u.w = true;
        } else if (i2 == 408125543) {
            long j4 = this.q;
            if (j4 == -1 || j4 == j2) {
                this.q = j2;
                this.p = j3;
                return;
            }
            throw new ParserException("Multiple Segment elements not supported");
        } else if (i2 == 475249515) {
            this.C = new q();
            this.D = new q();
        } else if (i2 != 524531317 || this.v) {
        } else {
            if (!this.d || this.z == -1) {
                this.Z.j(new xj.b(this.t, 0));
                this.v = true;
                return;
            }
            this.y = true;
        }
    }

    /* access modifiers changed from: protected */
    public void s(int i2, String str) {
        if (i2 == 134) {
            this.u.b = str;
        } else if (i2 != 17026) {
            if (i2 == 21358) {
                this.u.a = str;
            } else if (i2 == 2274716) {
                this.u.U = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new ParserException(je.y0("DocType ", str, " not supported"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ek$c */
    public static final class c {
        public int A = Constants.ONE_SECOND;
        public int B = 200;
        public float C = -1.0f;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public int M = 1;
        public int N = -1;
        public int O = 8000;
        public long P = 0;
        public long Q = 0;
        public d R;
        public boolean S;
        public boolean T = true;
        private String U = "eng";
        public zj V;
        public int W;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public byte[] h;
        public zj.a i;
        public byte[] j;
        public l k;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = 0;
        public int q = -1;
        public float r = 0.0f;
        public float s = 0.0f;
        public float t = 0.0f;
        public byte[] u = null;
        public int v = -1;
        public boolean w = false;
        public int x = -1;
        public int y = -1;
        public int z = -1;

        private c() {
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0230, code lost:
            if (r1 == 0) goto L_0x03fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0234, code lost:
            r24 = r1;
            r1 = null;
            r4 = "audio/raw";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x03ee, code lost:
            if (r1.q() == defpackage.ek.d0.getLeastSignificantBits()) goto L_0x03f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x03fb, code lost:
            if (r1 != 0) goto L_0x0234;
         */
        /* JADX WARNING: Removed duplicated region for block: B:204:0x03f5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(defpackage.rj r41, int r42) {
            /*
            // Method dump skipped, instructions count: 1888
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ek.c.b(rj, int):void");
        }

        c(a aVar) {
        }
    }
}
