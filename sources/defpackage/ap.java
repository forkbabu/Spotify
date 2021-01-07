package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.u;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ap  reason: default package */
final class ap {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;
    private final Paint b;
    private final Canvas c = new Canvas();
    private final b d = new b(719, 575, 0, 719, 0, 575);
    private final a e = new a(0, new int[]{0, -1, -16777216, -8421505}, c(), d());
    private final h f;
    private Bitmap g;

    /* access modifiers changed from: private */
    /* renamed from: ap$a */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* renamed from: ap$b */
    private static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ap$c */
    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* renamed from: ap$d */
    private static final class d {
        public final int a;
        public final int b;
        public final SparseArray<e> c;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.a = i2;
            this.b = i3;
            this.c = sparseArray;
        }
    }

    /* renamed from: ap$e */
    private static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: ap$f */
    private static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = i4;
            this.e = i6;
            this.f = i7;
            this.g = i8;
            this.h = i9;
            this.i = i10;
            this.j = sparseArray;
        }
    }

    /* renamed from: ap$g */
    private static final class g {
        public final int a;
        public final int b;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i3;
            this.b = i4;
        }
    }

    /* renamed from: ap$h */
    private static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    public ap(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new h(i2, i3);
    }

    private static byte[] a(int i2, int i3, u uVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) uVar.h(i3);
        }
        return bArr;
    }

    private static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = e(BitmapRenderer.ALPHA_VISIBLE, (i2 & 1) != 0 ? BitmapRenderer.ALPHA_VISIBLE : 0, (i2 & 2) != 0 ? BitmapRenderer.ALPHA_VISIBLE : 0, (i2 & 4) != 0 ? BitmapRenderer.ALPHA_VISIBLE : 0);
            } else {
                int i3 = 127;
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = e(BitmapRenderer.ALPHA_VISIBLE, i4, i5, i3);
            }
        }
        return iArr;
    }

    private static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = BitmapRenderer.ALPHA_VISIBLE;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? BitmapRenderer.ALPHA_VISIBLE : 0;
                int i5 = (i2 & 2) != 0 ? BitmapRenderer.ALPHA_VISIBLE : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = e(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = e(BitmapRenderer.ALPHA_VISIBLE, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = e(BitmapRenderer.ALPHA_VISIBLE, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = e(BitmapRenderer.ALPHA_VISIBLE, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = e(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    private static int e(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0114 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x01d3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x020b A[LOOP:3: B:83:0x0163->B:113:0x020b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x013b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0205 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0141 A[LOOP:2: B:38:0x00ab->B:70:0x0141, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
        // Method dump skipped, instructions count: 554
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static a g(u uVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int h2 = uVar.h(8);
        uVar.o(8);
        int i8 = i2 - 2;
        int i9 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] c2 = c();
        int[] d2 = d();
        while (i8 > 0) {
            int h3 = uVar.h(i7);
            int h4 = uVar.h(i7);
            int i10 = i8 - 2;
            int[] iArr2 = (h4 & 128) != 0 ? iArr : (h4 & 64) != 0 ? c2 : d2;
            if ((h4 & 1) != 0) {
                i6 = uVar.h(i7);
                i5 = uVar.h(i7);
                i4 = uVar.h(i7);
                i3 = uVar.h(i7);
                i8 = i10 - 4;
            } else {
                i8 = i10 - 2;
                i5 = uVar.h(i9) << i9;
                i3 = uVar.h(2) << 6;
                i6 = uVar.h(6) << 2;
                i4 = uVar.h(i9) << i9;
            }
            if (i6 == 0) {
                i5 = 0;
                i4 = 0;
                i3 = BitmapRenderer.ALPHA_VISIBLE;
            }
            double d3 = (double) i6;
            double d4 = (double) (i5 - 128);
            Double.isNaN(d4);
            Double.isNaN(d4);
            Double.isNaN(d3);
            Double.isNaN(d3);
            double d5 = (double) (i4 - 128);
            Double.isNaN(d5);
            Double.isNaN(d5);
            Double.isNaN(d3);
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d5);
            Double.isNaN(d3);
            Double.isNaN(d3);
            iArr2[h3] = e((byte) (255 - (i3 & BitmapRenderer.ALPHA_VISIBLE)), f0.h((int) ((1.402d * d4) + d3), 0, BitmapRenderer.ALPHA_VISIBLE), f0.h((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, BitmapRenderer.ALPHA_VISIBLE), f0.h((int) ((d5 * 1.772d) + d3), 0, BitmapRenderer.ALPHA_VISIBLE));
            iArr = iArr;
            h2 = h2;
            i7 = 8;
            i9 = 4;
        }
        return new a(h2, iArr, c2, d2);
    }

    private static c h(u uVar) {
        byte[] bArr;
        int h2 = uVar.h(16);
        uVar.o(4);
        int h3 = uVar.h(2);
        boolean g2 = uVar.g();
        uVar.o(1);
        byte[] bArr2 = null;
        if (h3 == 1) {
            uVar.o(uVar.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = uVar.h(16);
            int h5 = uVar.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                uVar.j(bArr2, 0, h4);
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                uVar.j(bArr, 0, h5);
                return new c(h2, g2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h2, g2, bArr2, bArr);
    }

    public List<com.google.android.exoplayer2.text.a> b(byte[] bArr, int i2) {
        int i3;
        int i4;
        SparseArray<g> sparseArray;
        SparseArray<e> sparseArray2;
        int[] iArr;
        f fVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        u uVar = new u(bArr, i2);
        while (uVar.b() >= 48 && uVar.h(8) == 15) {
            h hVar = this.f;
            int h2 = uVar.h(8);
            int h3 = uVar.h(16);
            int h4 = uVar.h(16);
            int d2 = uVar.d() + h4;
            if (h4 * 8 > uVar.b()) {
                uVar.o(uVar.b());
            } else {
                switch (h2) {
                    case 16:
                        if (h3 == hVar.a) {
                            d dVar = hVar.i;
                            int h5 = uVar.h(8);
                            int h6 = uVar.h(4);
                            int h7 = uVar.h(2);
                            uVar.o(2);
                            int i11 = h4 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i11 > 0) {
                                int h8 = uVar.h(8);
                                uVar.o(8);
                                i11 -= 6;
                                sparseArray3.put(h8, new e(uVar.h(16), uVar.h(16)));
                            }
                            d dVar2 = new d(h5, h6, h7, sparseArray3);
                            if (h7 == 0) {
                                if (!(dVar == null || dVar.a == h6)) {
                                    hVar.i = dVar2;
                                    break;
                                }
                            } else {
                                hVar.i = dVar2;
                                hVar.c.clear();
                                hVar.d.clear();
                                hVar.e.clear();
                                break;
                            }
                        }
                        break;
                    case 17:
                        d dVar3 = hVar.i;
                        if (h3 == hVar.a && dVar3 != null) {
                            int h9 = uVar.h(8);
                            uVar.o(4);
                            boolean g2 = uVar.g();
                            uVar.o(3);
                            int h10 = uVar.h(16);
                            int h11 = uVar.h(16);
                            int h12 = uVar.h(3);
                            int h13 = uVar.h(3);
                            uVar.o(2);
                            int h14 = uVar.h(8);
                            int h15 = uVar.h(8);
                            int h16 = uVar.h(4);
                            int h17 = uVar.h(2);
                            uVar.o(2);
                            int i12 = h4 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i12 > 0) {
                                int h18 = uVar.h(16);
                                int h19 = uVar.h(2);
                                int h20 = uVar.h(2);
                                int h21 = uVar.h(12);
                                uVar.o(4);
                                int h22 = uVar.h(12);
                                i12 -= 6;
                                if (h19 == 1 || h19 == 2) {
                                    i12 -= 2;
                                    i6 = uVar.h(8);
                                    i5 = uVar.h(8);
                                } else {
                                    i6 = 0;
                                    i5 = 0;
                                }
                                sparseArray4.put(h18, new g(h19, h20, h21, h22, i6, i5));
                            }
                            f fVar2 = new f(h9, g2, h10, h11, h12, h13, h14, h15, h16, h17, sparseArray4);
                            if (dVar3.b == 0 && (fVar = hVar.c.get(h9)) != null) {
                                SparseArray<g> sparseArray5 = fVar.j;
                                for (int i13 = 0; i13 < sparseArray5.size(); i13++) {
                                    fVar2.j.put(sparseArray5.keyAt(i13), sparseArray5.valueAt(i13));
                                }
                            }
                            hVar.c.put(fVar2.a, fVar2);
                            break;
                        }
                    case 18:
                        if (h3 != hVar.a) {
                            if (h3 == hVar.b) {
                                a g3 = g(uVar, h4);
                                hVar.f.put(g3.a, g3);
                                break;
                            }
                        } else {
                            a g4 = g(uVar, h4);
                            hVar.d.put(g4.a, g4);
                            break;
                        }
                        break;
                    case 19:
                        if (h3 != hVar.a) {
                            if (h3 == hVar.b) {
                                c h23 = h(uVar);
                                hVar.g.put(h23.a, h23);
                                break;
                            }
                        } else {
                            c h24 = h(uVar);
                            hVar.e.put(h24.a, h24);
                            break;
                        }
                        break;
                    case 20:
                        if (h3 == hVar.a) {
                            uVar.o(4);
                            boolean g5 = uVar.g();
                            uVar.o(3);
                            int h25 = uVar.h(16);
                            int h26 = uVar.h(16);
                            if (g5) {
                                int h27 = uVar.h(16);
                                i9 = uVar.h(16);
                                i8 = uVar.h(16);
                                i7 = uVar.h(16);
                                i10 = h27;
                            } else {
                                i9 = h25;
                                i7 = h26;
                                i10 = 0;
                                i8 = 0;
                            }
                            hVar.h = new b(h25, h26, i10, i9, i8, i7);
                            break;
                        }
                        break;
                }
                uVar.p(d2 - uVar.d());
            }
        }
        h hVar2 = this.f;
        d dVar4 = hVar2.i;
        if (dVar4 == null) {
            return Collections.emptyList();
        }
        b bVar = hVar2.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (!(bitmap != null && bVar.a + 1 == bitmap.getWidth() && bVar.b + 1 == this.g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray6 = dVar4.c;
        int i14 = 0;
        while (i14 < sparseArray6.size()) {
            this.c.save();
            e valueAt = sparseArray6.valueAt(i14);
            f fVar3 = this.f.c.get(sparseArray6.keyAt(i14));
            int i15 = valueAt.a + bVar.c;
            int i16 = valueAt.b + bVar.e;
            this.c.clipRect(i15, i16, Math.min(fVar3.c + i15, bVar.d), Math.min(fVar3.d + i16, bVar.f));
            a aVar = this.f.d.get(fVar3.f);
            if (aVar == null && (aVar = this.f.f.get(fVar3.f)) == null) {
                aVar = this.e;
            }
            SparseArray<g> sparseArray7 = fVar3.j;
            int i17 = 0;
            while (i17 < sparseArray7.size()) {
                int keyAt = sparseArray7.keyAt(i17);
                g valueAt2 = sparseArray7.valueAt(i17);
                c cVar = this.f.e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f.g.get(keyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.b ? null : this.a;
                    int i18 = fVar3.e;
                    int i19 = valueAt2.a + i15;
                    int i20 = valueAt2.b + i16;
                    sparseArray2 = sparseArray6;
                    Canvas canvas = this.c;
                    sparseArray = sparseArray7;
                    if (i18 == 3) {
                        iArr = aVar.d;
                    } else if (i18 == 2) {
                        iArr = aVar.c;
                    } else {
                        iArr = aVar.b;
                    }
                    i4 = i14;
                    f(cVar.c, iArr, i18, i19, i20, paint, canvas);
                    f(cVar.d, iArr, i18, i19, i20 + 1, paint, canvas);
                } else {
                    sparseArray2 = sparseArray6;
                    i4 = i14;
                    sparseArray = sparseArray7;
                }
                i17++;
                sparseArray6 = sparseArray2;
                sparseArray7 = sparseArray;
                i14 = i4;
            }
            if (fVar3.b) {
                int i21 = fVar3.e;
                if (i21 == 3) {
                    i3 = aVar.d[fVar3.g];
                } else if (i21 == 2) {
                    i3 = aVar.c[fVar3.h];
                } else {
                    i3 = aVar.b[fVar3.i];
                }
                this.b.setColor(i3);
                this.c.drawRect((float) i15, (float) i16, (float) (fVar3.c + i15), (float) (fVar3.d + i16), this.b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.g, i15, i16, fVar3.c, fVar3.d);
            float f2 = (float) i15;
            int i22 = bVar.a;
            float f3 = f2 / ((float) i22);
            float f4 = (float) i16;
            int i23 = bVar.b;
            arrayList.add(new com.google.android.exoplayer2.text.a(createBitmap2, f3, 0, f4 / ((float) i23), 0, ((float) fVar3.c) / ((float) i22), ((float) fVar3.d) / ((float) i23)));
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
            i14++;
            sparseArray6 = sparseArray6;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void i() {
        h hVar = this.f;
        hVar.c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f.clear();
        hVar.g.clear();
        hVar.h = null;
        hVar.i = null;
    }
}
