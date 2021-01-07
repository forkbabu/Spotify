package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.foundation.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: vo  reason: default package */
public final class vo extends wo {
    private final v g = new v();
    private final u h = new u();
    private final int i;
    private final a[] j;
    private a k;
    private List<com.google.android.exoplayer2.text.a> l;
    private List<com.google.android.exoplayer2.text.a> m;
    private b n;
    private int o;

    /* access modifiers changed from: private */
    /* renamed from: vo$a */
    public static final class a {
        private static final int[] A = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] B = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] C = {false, false, false, true, true, true, false};
        private static final int[] D;
        private static final int[] E = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] F = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] G;
        public static final int w = g(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        private static final int[] z = {0, 0, 0, 0, 0, 2, 0};
        private final List<SpannableString> a = new ArrayList();
        private final SpannableStringBuilder b = new SpannableStringBuilder();
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;

        static {
            int g2 = g(0, 0, 0, 0);
            x = g2;
            int g3 = g(0, 0, 0, 3);
            y = g3;
            D = new int[]{g2, g3, g2, g2, g3, g2, g2};
            G = new int[]{g2, g2, g2, g2, g2, g3, g3};
        }

        public a() {
            k();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int g(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.google.android.exoplayer2.util.g.f(r4, r0, r1)
                com.google.android.exoplayer2.util.g.f(r5, r0, r1)
                com.google.android.exoplayer2.util.g.f(r6, r0, r1)
                com.google.android.exoplayer2.util.g.f(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vo.a.g(int, int, int, int):int");
        }

        public void a(char c2) {
            if (c2 == '\n') {
                this.a.add(d());
                this.b.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while (true) {
                    if ((this.k && this.a.size() >= this.j) || this.a.size() >= 15) {
                        this.a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.b.append(c2);
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.uo c() {
            /*
            // Method dump skipped, instructions count: 193
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vo.a.c():uo");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.c = true;
            this.d = z2;
            this.k = z3;
            this.e = i2;
            this.f = z4;
            this.g = i3;
            this.h = i4;
            this.i = i6;
            int i9 = i5 + 1;
            if (this.j != i9) {
                this.j = i9;
                while (true) {
                    if ((!z3 || this.a.size() < this.j) && this.a.size() < 15) {
                        break;
                    }
                    this.a.remove(0);
                }
            }
            if (!(i7 == 0 || this.m == i7)) {
                this.m = i7;
                int i10 = i7 - 1;
                int i11 = D[i10];
                boolean z5 = C[i10];
                int i12 = A[i10];
                int i13 = B[i10];
                int i14 = z[i10];
                this.o = i11;
                this.l = i14;
            }
            if (i8 != 0 && this.n != i8) {
                this.n = i8;
                int i15 = i8 - 1;
                int i16 = F[i15];
                int i17 = E[i15];
                l(false, false);
                m(w, G[i15]);
            }
        }

        public boolean h() {
            return this.c;
        }

        public boolean i() {
            return !this.c || (this.a.isEmpty() && this.b.length() == 0);
        }

        public boolean j() {
            return this.d;
        }

        public void k() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i2 = x;
            this.o = i2;
            this.s = w;
            this.u = i2;
        }

        public void l(boolean z2, boolean z3) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q != -1) {
                if (!z3) {
                    this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                    this.q = -1;
                }
            } else if (z3) {
                this.q = this.b.length();
            }
        }

        public void m(int i2, int i3) {
            if (!(this.r == -1 || this.s == i2)) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i2 != w) {
                this.r = this.b.length();
                this.s = i2;
            }
            if (!(this.t == -1 || this.u == i3)) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i3 != x) {
                this.t = this.b.length();
                this.u = i3;
            }
        }

        public void n(int i2) {
            if (this.v != i2) {
                a('\n');
            }
            this.v = i2;
        }

        public void o(boolean z2) {
            this.d = z2;
        }

        public void p(int i2, int i3) {
            this.o = i2;
            this.l = i3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: vo$b */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[((i2 * 2) - 1)];
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<[B>;)V */
    public vo(int i2) {
        this.i = i2 == -1 ? 1 : i2;
        this.j = new a[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.j[i3] = new a();
        }
        this.k = this.j[0];
        p();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private void n() {
        b bVar = this.n;
        if (bVar != null) {
            int i2 = bVar.d;
            if (i2 == (bVar.b * 2) - 1) {
                this.h.l(bVar.c, i2);
                int i3 = 3;
                int h2 = this.h.h(3);
                int h3 = this.h.h(5);
                if (h2 == 7) {
                    this.h.o(2);
                    h2 = this.h.h(6);
                }
                if (h3 != 0 && h2 == this.i) {
                    boolean z = false;
                    while (this.h.b() > 0) {
                        int h4 = this.h.h(8);
                        if (h4 == 16) {
                            int h5 = this.h.h(8);
                            if (h5 > 31) {
                                if (h5 <= 127) {
                                    if (h5 == 32) {
                                        this.k.a(' ');
                                    } else if (h5 == 33) {
                                        this.k.a(160);
                                    } else if (h5 == 37) {
                                        this.k.a(8230);
                                    } else if (h5 == 42) {
                                        this.k.a(352);
                                    } else if (h5 == 44) {
                                        this.k.a(338);
                                    } else if (h5 == 63) {
                                        this.k.a(376);
                                    } else if (h5 == 57) {
                                        this.k.a(8482);
                                    } else if (h5 == 58) {
                                        this.k.a(353);
                                    } else if (h5 == 60) {
                                        this.k.a(339);
                                    } else if (h5 != 61) {
                                        switch (h5) {
                                            case 48:
                                                this.k.a(9608);
                                                break;
                                            case 49:
                                                this.k.a(8216);
                                                break;
                                            case 50:
                                                this.k.a(8217);
                                                break;
                                            case 51:
                                                this.k.a(8220);
                                                break;
                                            case 52:
                                                this.k.a(8221);
                                                break;
                                            case 53:
                                                this.k.a(8226);
                                                break;
                                            default:
                                                switch (h5) {
                                                    case 118:
                                                        this.k.a(8539);
                                                        break;
                                                    case 119:
                                                        this.k.a(8540);
                                                        break;
                                                    case 120:
                                                        this.k.a(8541);
                                                        break;
                                                    case 121:
                                                        this.k.a(8542);
                                                        break;
                                                    case 122:
                                                        this.k.a(9474);
                                                        break;
                                                    case 123:
                                                        this.k.a(9488);
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowNoTitle /* 124 */:
                                                        this.k.a(9492);
                                                        break;
                                                    case 125:
                                                        this.k.a(9472);
                                                        break;
                                                    case 126:
                                                        this.k.a(9496);
                                                        break;
                                                    case 127:
                                                        this.k.a(9484);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.k.a(8480);
                                    }
                                } else if (h5 <= 159) {
                                    if (h5 <= 135) {
                                        this.h.o(32);
                                    } else if (h5 <= 143) {
                                        this.h.o(40);
                                    } else if (h5 <= 159) {
                                        this.h.o(2);
                                        this.h.o(this.h.h(6) * 8);
                                    }
                                } else if (h5 <= 255) {
                                    if (h5 == 160) {
                                        this.k.a(13252);
                                    } else {
                                        this.k.a('_');
                                    }
                                }
                                z = true;
                            } else if (h5 > 7) {
                                if (h5 <= 15) {
                                    this.h.o(8);
                                } else if (h5 <= 23) {
                                    this.h.o(16);
                                } else if (h5 <= 31) {
                                    this.h.o(24);
                                }
                            }
                        } else if (h4 > 31) {
                            if (h4 > 127) {
                                if (h4 <= 159) {
                                    switch (h4) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i4 = h4 - 128;
                                            if (this.o != i4) {
                                                this.o = i4;
                                                this.k = this.j[i4];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            for (int i5 = 1; i5 <= 8; i5++) {
                                                if (this.h.g()) {
                                                    this.j[8 - i5].e();
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (this.h.g()) {
                                                    this.j[8 - i6].o(true);
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (this.h.g()) {
                                                    this.j[8 - i7].o(false);
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (this.h.g()) {
                                                    a aVar = this.j[8 - i8];
                                                    aVar.o(!aVar.j());
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (this.h.g()) {
                                                    this.j[8 - i9].k();
                                                }
                                            }
                                            break;
                                        case 141:
                                            this.h.o(8);
                                            break;
                                        case 143:
                                            p();
                                            break;
                                        case 144:
                                            if (!this.k.h()) {
                                                this.h.o(16);
                                                break;
                                            } else {
                                                this.h.h(4);
                                                this.h.h(2);
                                                this.h.h(2);
                                                boolean g2 = this.h.g();
                                                boolean g3 = this.h.g();
                                                this.h.h(i3);
                                                this.h.h(i3);
                                                this.k.l(g2, g3);
                                                break;
                                            }
                                        case 145:
                                            if (!this.k.h()) {
                                                this.h.o(24);
                                                break;
                                            } else {
                                                int g4 = a.g(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
                                                int g5 = a.g(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
                                                this.h.o(2);
                                                a.g(this.h.h(2), this.h.h(2), this.h.h(2), 0);
                                                this.k.m(g4, g5);
                                                break;
                                            }
                                        case 146:
                                            if (!this.k.h()) {
                                                this.h.o(16);
                                                break;
                                            } else {
                                                this.h.o(4);
                                                int h6 = this.h.h(4);
                                                this.h.o(2);
                                                this.h.h(6);
                                                this.k.n(h6);
                                                break;
                                            }
                                        case 151:
                                            if (!this.k.h()) {
                                                this.h.o(32);
                                                break;
                                            } else {
                                                int g6 = a.g(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
                                                this.h.h(2);
                                                a.g(this.h.h(2), this.h.h(2), this.h.h(2), 0);
                                                this.h.g();
                                                this.h.g();
                                                this.h.h(2);
                                                this.h.h(2);
                                                int h7 = this.h.h(2);
                                                this.h.o(8);
                                                this.k.p(g6, h7);
                                                break;
                                            }
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i10 = h4 - 152;
                                            a aVar2 = this.j[i10];
                                            this.h.o(2);
                                            boolean g7 = this.h.g();
                                            boolean g8 = this.h.g();
                                            this.h.g();
                                            int h8 = this.h.h(i3);
                                            boolean g9 = this.h.g();
                                            int h9 = this.h.h(7);
                                            int h10 = this.h.h(8);
                                            int h11 = this.h.h(4);
                                            int h12 = this.h.h(4);
                                            this.h.o(2);
                                            this.h.h(6);
                                            this.h.o(2);
                                            aVar2.f(g7, g8, h8, g9, h9, h10, h12, h11, this.h.h(i3), this.h.h(i3));
                                            if (this.o != i10) {
                                                this.o = i10;
                                                this.k = this.j[i10];
                                                break;
                                            }
                                            break;
                                    }
                                } else if (h4 <= 255) {
                                    this.k.a((char) (h4 & BitmapRenderer.ALPHA_VISIBLE));
                                }
                                z = true;
                            } else if (h4 == 127) {
                                this.k.a(9835);
                            } else {
                                this.k.a((char) (h4 & BitmapRenderer.ALPHA_VISIBLE));
                            }
                            z = true;
                        } else if (h4 != 0) {
                            if (h4 == i3) {
                                this.l = o();
                            } else if (h4 != 8) {
                                switch (h4) {
                                    case 12:
                                        p();
                                        break;
                                    case 13:
                                        this.k.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (h4 < 17 || h4 > 23) {
                                            if (h4 >= 24 && h4 <= 31) {
                                                this.h.o(16);
                                                break;
                                            }
                                        } else {
                                            this.h.o(8);
                                            break;
                                        }
                                }
                            } else {
                                this.k.b();
                            }
                        }
                        i3 = 3;
                    }
                    if (z) {
                        this.l = o();
                    }
                }
            }
            this.n = null;
        }
    }

    private List<com.google.android.exoplayer2.text.a> o() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.j[i2].i() && this.j[i2].j()) {
                arrayList.add(this.j[i2].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void p() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2].k();
        }
    }

    @Override // defpackage.dj
    public void d() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.wo
    public d f() {
        List<com.google.android.exoplayer2.text.a> list = this.l;
        this.m = list;
        return new xo(list);
    }

    @Override // defpackage.wo, defpackage.dj
    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        this.o = 0;
        this.k = this.j[0];
        p();
        this.n = null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.wo
    public void g(g gVar) {
        this.g.I(gVar.b.array(), gVar.b.limit());
        while (this.g.a() >= 3) {
            int x = this.g.x() & 7;
            int i2 = x & 3;
            boolean z = false;
            boolean z2 = (x & 4) == 4;
            byte x2 = (byte) this.g.x();
            byte x3 = (byte) this.g.x();
            if ((i2 == 2 || i2 == 3) && z2) {
                if (i2 == 3) {
                    n();
                    int i3 = (x2 & 192) >> 6;
                    int i4 = x2 & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    b bVar = new b(i3, i4);
                    this.n = bVar;
                    byte[] bArr = bVar.c;
                    int i5 = bVar.d;
                    bVar.d = i5 + 1;
                    bArr[i5] = x3;
                } else {
                    if (i2 == 2) {
                        z = true;
                    }
                    com.google.android.exoplayer2.util.g.a(z);
                    b bVar2 = this.n;
                    if (bVar2 == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.c;
                        int i6 = bVar2.d;
                        int i7 = i6 + 1;
                        bVar2.d = i7;
                        bArr2[i6] = x2;
                        bVar2.d = i7 + 1;
                        bArr2[i7] = x3;
                    }
                }
                b bVar3 = this.n;
                if (bVar3.d == (bVar3.b * 2) - 1) {
                    n();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.wo
    public boolean j() {
        return this.l != this.m;
    }
}
