package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.ok;

/* access modifiers changed from: package-private */
/* renamed from: pk  reason: default package */
public final class pk {
    private static final byte[] a = f0.z("OpusHead");
    public static final /* synthetic */ int b = 0;

    /* access modifiers changed from: private */
    /* renamed from: pk$a */
    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final v f;
        private final v g;
        private int h;
        private int i;

        public a(v vVar, v vVar2, boolean z) {
            this.g = vVar;
            this.f = vVar2;
            this.e = z;
            vVar2.K(12);
            this.a = vVar2.B();
            vVar.K(12);
            this.i = vVar.B();
            g.n(vVar.h() != 1 ? false : true, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            long j;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == this.a) {
                return false;
            }
            if (this.e) {
                j = this.f.C();
            } else {
                j = this.f.z();
            }
            this.d = j;
            if (this.b == this.h) {
                this.c = this.g.B();
                this.g.L(4);
                int i3 = this.i - 1;
                this.i = i3;
                this.h = i3 > 0 ? this.g.B() - 1 : -1;
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: pk$b */
    public interface b {
        boolean a();

        int b();

        int c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pk$c */
    public static final class c implements b {
        private final int a;
        private final int b;
        private final v c;

        public c(ok.b bVar) {
            v vVar = bVar.b;
            this.c = vVar;
            vVar.K(12);
            this.a = vVar.B();
            this.b = vVar.B();
        }

        @Override // defpackage.pk.b
        public boolean a() {
            return this.a != 0;
        }

        @Override // defpackage.pk.b
        public int b() {
            int i = this.a;
            return i == 0 ? this.c.B() : i;
        }

        @Override // defpackage.pk.b
        public int c() {
            return this.b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pk$d */
    public static final class d implements b {
        private final v a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        public d(ok.b bVar) {
            v vVar = bVar.b;
            this.a = vVar;
            vVar.K(12);
            this.c = vVar.B() & BitmapRenderer.ALPHA_VISIBLE;
            this.b = vVar.B();
        }

        @Override // defpackage.pk.b
        public boolean a() {
            return false;
        }

        @Override // defpackage.pk.b
        public int b() {
            int i = this.c;
            if (i == 8) {
                return this.a.x();
            }
            if (i == 16) {
                return this.a.D();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int x = this.a.x();
            this.e = x;
            return (x & 240) >> 4;
        }

        @Override // defpackage.pk.b
        public int c() {
            return this.b;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: pk$e */
    public static final class e {
        private final int a;
        private final long b;
        private final int c;

        public e(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private static Pair<String, byte[]> a(v vVar, int i) {
        vVar.K(i + 8 + 4);
        vVar.L(1);
        b(vVar);
        vVar.L(2);
        int x = vVar.x();
        if ((x & 128) != 0) {
            vVar.L(2);
        }
        if ((x & 64) != 0) {
            vVar.L(vVar.D());
        }
        if ((x & 32) != 0) {
            vVar.L(2);
        }
        vVar.L(1);
        b(vVar);
        String d2 = s.d(vVar.x());
        if ("audio/mpeg".equals(d2) || "audio/vnd.dts".equals(d2) || "audio/vnd.dts.hd".equals(d2)) {
            return Pair.create(d2, null);
        }
        vVar.L(12);
        vVar.L(1);
        int b2 = b(vVar);
        byte[] bArr = new byte[b2];
        vVar.g(bArr, 0, b2);
        return Pair.create(d2, bArr);
    }

    private static int b(v vVar) {
        int x = vVar.x();
        int i = x & 127;
        while ((x & 128) == 128) {
            x = vVar.x();
            i = (i << 7) | (x & 127);
        }
        return i;
    }

    private static Pair<Integer, yk> c(v vVar, int i, int i2) {
        Pair<Integer, yk> pair;
        Integer num;
        yk ykVar;
        int i3;
        int i4;
        byte[] bArr;
        int b2 = vVar.b();
        while (b2 - i < i2) {
            vVar.K(b2);
            int h = vVar.h();
            boolean z = true;
            g.b(h > 0, "childAtomSize should be positive");
            if (vVar.h() == 1936289382) {
                int i5 = b2 + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - b2 < h) {
                    vVar.K(i5);
                    int h2 = vVar.h();
                    int h3 = vVar.h();
                    if (h3 == 1718775137) {
                        num2 = Integer.valueOf(vVar.h());
                    } else if (h3 == 1935894637) {
                        vVar.L(4);
                        str = vVar.u(4);
                    } else if (h3 == 1935894633) {
                        i6 = i5;
                        i7 = h2;
                    }
                    i5 += h2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    g.b(num2 != null, "frma atom is mandatory");
                    g.b(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            ykVar = null;
                            break;
                        }
                        vVar.K(i8);
                        int h4 = vVar.h();
                        if (vVar.h() == 1952804451) {
                            int h5 = (vVar.h() >> 24) & BitmapRenderer.ALPHA_VISIBLE;
                            vVar.L(1);
                            if (h5 == 0) {
                                vVar.L(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int x = vVar.x();
                                i4 = x & 15;
                                i3 = (x & 240) >> 4;
                            }
                            boolean z2 = vVar.x() == 1;
                            int x2 = vVar.x();
                            byte[] bArr2 = new byte[16];
                            vVar.g(bArr2, 0, 16);
                            if (!z2 || x2 != 0) {
                                bArr = null;
                            } else {
                                int x3 = vVar.x();
                                byte[] bArr3 = new byte[x3];
                                vVar.g(bArr3, 0, x3);
                                bArr = bArr3;
                            }
                            num = num2;
                            ykVar = new yk(z2, str, x2, bArr2, i3, i4, bArr);
                        } else {
                            i8 += h4;
                        }
                    }
                    if (ykVar == null) {
                        z = false;
                    }
                    g.b(z, "tenc atom is mandatory");
                    pair = Pair.create(num, ykVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            b2 += h;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r12 == 0) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.xk d(defpackage.ok.a r43, defpackage.ok.b r44, long r45, com.google.android.exoplayer2.drm.l r47, boolean r48, boolean r49) {
        /*
        // Method dump skipped, instructions count: 2378
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk.d(ok$a, ok$b, long, com.google.android.exoplayer2.drm.l, boolean, boolean):xk");
    }
}
