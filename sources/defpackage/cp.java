package defpackage;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: cp  reason: default package */
public final class cp extends b {
    private final v n = new v();
    private final v o = new v();
    private final a p = new a();
    private Inflater q;

    /* renamed from: cp$a */
    private static final class a {
        private final v a = new v();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        static void a(a aVar, v vVar, int i2) {
            aVar.getClass();
            if (i2 % 5 == 2) {
                vVar.L(2);
                Arrays.fill(aVar.b, 0);
                int i3 = i2 / 5;
                for (int i4 = 0; i4 < i3; i4++) {
                    int x = vVar.x();
                    int x2 = vVar.x();
                    int x3 = vVar.x();
                    int x4 = vVar.x();
                    int x5 = vVar.x();
                    double d2 = (double) x2;
                    double d3 = (double) (x3 - 128);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    double d4 = (double) (x4 - 128);
                    Double.isNaN(d4);
                    Double.isNaN(d4);
                    Double.isNaN(d4);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    Double.isNaN(d4);
                    Double.isNaN(d4);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    int[] iArr = aVar.b;
                    int h2 = f0.h((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, BitmapRenderer.ALPHA_VISIBLE) << 8;
                    iArr[x] = f0.h((int) ((d4 * 1.772d) + d2), 0, BitmapRenderer.ALPHA_VISIBLE) | h2 | (x5 << 24) | (f0.h((int) ((1.402d * d3) + d2), 0, BitmapRenderer.ALPHA_VISIBLE) << 16);
                }
                aVar.c = true;
            }
        }

        static void b(a aVar, v vVar, int i2) {
            int A;
            aVar.getClass();
            if (i2 >= 4) {
                vVar.L(3);
                int i3 = i2 - 4;
                if ((vVar.x() & 128) != 0) {
                    if (i3 >= 7 && (A = vVar.A()) >= 4) {
                        aVar.h = vVar.D();
                        aVar.i = vVar.D();
                        aVar.a.G(A - 4);
                        i3 -= 7;
                    } else {
                        return;
                    }
                }
                int b2 = aVar.a.b();
                int c2 = aVar.a.c();
                if (b2 < c2 && i3 > 0) {
                    int min = Math.min(i3, c2 - b2);
                    vVar.g(aVar.a.a, b2, min);
                    aVar.a.K(b2 + min);
                }
            }
        }

        static void c(a aVar, v vVar, int i2) {
            aVar.getClass();
            if (i2 >= 19) {
                aVar.d = vVar.D();
                aVar.e = vVar.D();
                vVar.L(11);
                aVar.f = vVar.D();
                aVar.g = vVar.D();
            }
        }

        public com.google.android.exoplayer2.text.a d() {
            int i2;
            int i3;
            int i4;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.c() == 0 || this.a.b() != this.a.c() || !this.c) {
                return null;
            }
            this.a.K(0);
            int i5 = this.h * this.i;
            int[] iArr = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int x = this.a.x();
                if (x != 0) {
                    i4 = i6 + 1;
                    iArr[i6] = this.b[x];
                } else {
                    int x2 = this.a.x();
                    if (x2 != 0) {
                        if ((x2 & 64) == 0) {
                            i2 = x2 & 63;
                        } else {
                            i2 = ((x2 & 63) << 8) | this.a.x();
                        }
                        if ((x2 & 128) == 0) {
                            i3 = 0;
                        } else {
                            i3 = this.b[this.a.x()];
                        }
                        i4 = i2 + i6;
                        Arrays.fill(iArr, i6, i4, i3);
                    }
                }
                i6 = i4;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888);
            int i7 = this.d;
            float f2 = ((float) this.f) / ((float) i7);
            int i8 = this.e;
            return new com.google.android.exoplayer2.text.a(createBitmap, f2, 0, ((float) this.g) / ((float) i8), 0, ((float) this.h) / ((float) i7), ((float) this.i) / ((float) i8));
        }

        public void e() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.G(0);
            this.c = false;
        }
    }

    public cp() {
        super("PgsDecoder");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.b
    public d o(byte[] bArr, int i, boolean z) {
        this.n.I(bArr, i);
        v vVar = this.n;
        if (vVar.a() > 0 && vVar.e() == 120) {
            if (this.q == null) {
                this.q = new Inflater();
            }
            v vVar2 = this.o;
            Inflater inflater = this.q;
            int i2 = f0.a;
            boolean z2 = false;
            if (vVar.a() > 0) {
                byte[] bArr2 = vVar2.a;
                if (bArr2.length < vVar.a()) {
                    bArr2 = new byte[(vVar.a() * 2)];
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(vVar.a, vVar.b(), vVar.a());
                int i3 = 0;
                while (true) {
                    try {
                        i3 += inflater.inflate(bArr2, i3, bArr2.length - i3);
                        if (inflater.finished()) {
                            vVar2.I(bArr2, i3);
                            z2 = true;
                            break;
                        } else if (inflater.needsDictionary()) {
                            break;
                        } else if (inflater.needsInput()) {
                            break;
                        } else if (i3 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length * 2);
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
                inflater.reset();
            }
            if (z2) {
                v vVar3 = this.o;
                vVar.I(vVar3.a, vVar3.c());
            }
        }
        this.p.e();
        ArrayList arrayList = new ArrayList();
        while (this.n.a() >= 3) {
            v vVar4 = this.n;
            a aVar = this.p;
            int c = vVar4.c();
            int x = vVar4.x();
            int D = vVar4.D();
            int b = vVar4.b() + D;
            com.google.android.exoplayer2.text.a aVar2 = null;
            if (b > c) {
                vVar4.K(c);
            } else {
                if (x != 128) {
                    switch (x) {
                        case 20:
                            a.a(aVar, vVar4, D);
                            break;
                        case 21:
                            a.b(aVar, vVar4, D);
                            break;
                        case 22:
                            a.c(aVar, vVar4, D);
                            break;
                    }
                } else {
                    aVar2 = aVar.d();
                    aVar.e();
                }
                vVar4.K(b);
            }
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        return new dp(Collections.unmodifiableList(arrayList));
    }
}
