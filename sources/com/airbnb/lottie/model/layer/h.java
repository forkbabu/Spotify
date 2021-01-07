package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.c;
import com.airbnb.lottie.model.content.j;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h extends b {
    private final Paint A = new a(this, 1);
    private final Paint B = new b(this, 1);
    private final Map<c, List<ta>> C = new HashMap();
    private final q1<String> D = new q1<>(10);
    private final wb E;
    private final f F;
    private final d G;
    private jb<Integer, Integer> H;
    private jb<Integer, Integer> I;
    private jb<Integer, Integer> J;
    private jb<Integer, Integer> K;
    private jb<Float, Float> L;
    private jb<Float, Float> M;
    private jb<Float, Float> N;
    private jb<Float, Float> O;
    private jb<Float, Float> P;
    private final StringBuilder x = new StringBuilder(2);
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    class a extends Paint {
        a(h hVar, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(h hVar, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    h(f fVar, Layer layer) {
        super(fVar, layer);
        cc ccVar;
        cc ccVar2;
        bc bcVar;
        bc bcVar2;
        this.F = fVar;
        this.G = layer.a();
        wb d = layer.q().d();
        this.E = d;
        d.a(this);
        i(d);
        lc r = layer.r();
        if (!(r == null || (bcVar2 = r.a) == null)) {
            jb<Integer, Integer> a2 = bcVar2.a();
            this.H = a2;
            a2.a(this);
            i(this.H);
        }
        if (!(r == null || (bcVar = r.b) == null)) {
            jb<Integer, Integer> a3 = bcVar.a();
            this.J = a3;
            a3.a(this);
            i(this.J);
        }
        if (!(r == null || (ccVar2 = r.c) == null)) {
            jb<Float, Float> a4 = ccVar2.a();
            this.L = a4;
            a4.a(this);
            i(this.L);
        }
        if (r != null && (ccVar = r.d) != null) {
            jb<Float, Float> a5 = ccVar.a();
            this.N = a5;
            a5.a(this);
            i(this.N);
        }
    }

    private void v(DocumentData.Justification justification, Canvas canvas, float f) {
        int ordinal = justification.ordinal();
        if (ordinal == 1) {
            canvas.translate(-f, 0.0f);
        } else if (ordinal == 2) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private void w(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    private void x(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private List<String> y(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        this.v.c(t, heVar);
        if (t == k.a) {
            jb<Integer, Integer> jbVar = this.I;
            if (jbVar != null) {
                p(jbVar);
            }
            if (heVar == null) {
                this.I = null;
                return;
            }
            yb ybVar = new yb(heVar, null);
            this.I = ybVar;
            ybVar.a(this);
            i(this.I);
        } else if (t == k.b) {
            jb<Integer, Integer> jbVar2 = this.K;
            if (jbVar2 != null) {
                p(jbVar2);
            }
            if (heVar == null) {
                this.K = null;
                return;
            }
            yb ybVar2 = new yb(heVar, null);
            this.K = ybVar2;
            ybVar2.a(this);
            i(this.K);
        } else if (t == k.o) {
            jb<Float, Float> jbVar3 = this.M;
            if (jbVar3 != null) {
                p(jbVar3);
            }
            if (heVar == null) {
                this.M = null;
                return;
            }
            yb ybVar3 = new yb(heVar, null);
            this.M = ybVar3;
            ybVar3.a(this);
            i(this.M);
        } else if (t == k.p) {
            jb<Float, Float> jbVar4 = this.O;
            if (jbVar4 != null) {
                p(jbVar4);
            }
            if (heVar == null) {
                this.O = null;
                return;
            }
            yb ybVar4 = new yb(heVar, null);
            this.O = ybVar4;
            ybVar4.a(this);
            i(this.O);
        } else if (t == k.B) {
            jb<Float, Float> jbVar5 = this.P;
            if (jbVar5 != null) {
                p(jbVar5);
            }
            if (heVar == null) {
                this.P = null;
                return;
            }
            yb ybVar5 = new yb(heVar, null);
            this.P = ybVar5;
            ybVar5.a(this);
            i(this.P);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, (float) this.G.b().width(), (float) this.G.b().height());
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.model.layer.b
    public void l(Canvas canvas, Matrix matrix, int i) {
        float f;
        List<String> list;
        String str;
        float f2;
        float f3;
        float f4;
        int i2;
        List<String> list2;
        List<ta> list3;
        float f5;
        String str2;
        int i3;
        canvas.save();
        if (!this.F.c0()) {
            canvas.setMatrix(matrix);
        }
        DocumentData documentData = (DocumentData) this.E.g();
        com.airbnb.lottie.model.b bVar = this.G.g().get(documentData.b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        jb<Integer, Integer> jbVar = this.I;
        if (jbVar != null) {
            this.A.setColor(jbVar.g().intValue());
        } else {
            jb<Integer, Integer> jbVar2 = this.H;
            if (jbVar2 != null) {
                this.A.setColor(jbVar2.g().intValue());
            } else {
                this.A.setColor(documentData.h);
            }
        }
        jb<Integer, Integer> jbVar3 = this.K;
        if (jbVar3 != null) {
            this.B.setColor(jbVar3.g().intValue());
        } else {
            jb<Integer, Integer> jbVar4 = this.J;
            if (jbVar4 != null) {
                this.B.setColor(jbVar4.g().intValue());
            } else {
                this.B.setColor(documentData.i);
            }
        }
        int intValue = ((this.v.h() == null ? 100 : this.v.h().g().intValue()) * BitmapRenderer.ALPHA_VISIBLE) / 100;
        this.A.setAlpha(intValue);
        this.B.setAlpha(intValue);
        jb<Float, Float> jbVar5 = this.M;
        if (jbVar5 != null) {
            this.B.setStrokeWidth(jbVar5.g().floatValue());
        } else {
            jb<Float, Float> jbVar6 = this.L;
            if (jbVar6 != null) {
                this.B.setStrokeWidth(jbVar6.g().floatValue());
            } else {
                this.B.setStrokeWidth(ee.c() * documentData.j * ee.d(matrix));
            }
        }
        if (this.F.c0()) {
            jb<Float, Float> jbVar7 = this.P;
            if (jbVar7 != null) {
                f3 = jbVar7.g().floatValue();
            } else {
                f3 = documentData.c;
            }
            float f6 = f3 / 100.0f;
            float d = ee.d(matrix);
            String str3 = documentData.a;
            float c = ee.c() * documentData.f;
            List<String> y2 = y(str3);
            int size = y2.size();
            int i4 = 0;
            while (i4 < size) {
                String str4 = y2.get(i4);
                float f7 = 0.0f;
                int i5 = 0;
                while (i5 < str4.length()) {
                    c f8 = this.G.c().f(c.c(str4.charAt(i5), bVar.a(), bVar.c()));
                    if (f8 == null) {
                        i3 = i4;
                        str2 = str4;
                    } else {
                        double d2 = (double) f7;
                        double b2 = f8.b();
                        i3 = i4;
                        str2 = str4;
                        double d3 = (double) f6;
                        Double.isNaN(d3);
                        Double.isNaN(d3);
                        Double.isNaN(d3);
                        double d4 = b2 * d3;
                        double c2 = (double) ee.c();
                        Double.isNaN(c2);
                        Double.isNaN(c2);
                        Double.isNaN(c2);
                        double d5 = d4 * c2;
                        double d6 = (double) d;
                        Double.isNaN(d6);
                        Double.isNaN(d6);
                        Double.isNaN(d6);
                        Double.isNaN(d2);
                        Double.isNaN(d2);
                        Double.isNaN(d2);
                        f7 = (float) ((d5 * d6) + d2);
                    }
                    i5++;
                    i4 = i3;
                    str4 = str2;
                }
                canvas.save();
                v(documentData.d, canvas, f7);
                canvas.translate(0.0f, (((float) i4) * c) - ((((float) (size - 1)) * c) / 2.0f));
                int i6 = 0;
                for (String str5 = str4; i6 < str5.length(); str5 = str5) {
                    c f9 = this.G.c().f(c.c(str5.charAt(i6), bVar.a(), bVar.c()));
                    if (f9 == null) {
                        list2 = y2;
                        i2 = size;
                        f4 = c;
                    } else {
                        if (this.C.containsKey(f9)) {
                            list3 = this.C.get(f9);
                            list2 = y2;
                            i2 = size;
                            f4 = c;
                        } else {
                            List<j> a2 = f9.a();
                            int size2 = a2.size();
                            ArrayList arrayList = new ArrayList(size2);
                            list2 = y2;
                            int i7 = 0;
                            while (i7 < size2) {
                                arrayList.add(new ta(this.F, this, a2.get(i7)));
                                i7++;
                                size = size;
                                a2 = a2;
                                c = c;
                            }
                            i2 = size;
                            f4 = c;
                            this.C.put(f9, arrayList);
                            list3 = arrayList;
                        }
                        int i8 = 0;
                        while (i8 < list3.size()) {
                            Path o = list3.get(i8).o();
                            o.computeBounds(this.y, false);
                            this.z.set(matrix);
                            this.z.preTranslate(0.0f, (-documentData.g) * ee.c());
                            this.z.preScale(f6, f6);
                            o.transform(this.z);
                            if (documentData.k) {
                                x(o, this.A, canvas);
                                x(o, this.B, canvas);
                            } else {
                                x(o, this.B, canvas);
                                x(o, this.A, canvas);
                            }
                            i8++;
                            list3 = list3;
                        }
                        float c3 = ee.c() * ((float) f9.b()) * f6 * d;
                        float f10 = ((float) documentData.e) / 10.0f;
                        jb<Float, Float> jbVar8 = this.O;
                        if (jbVar8 != null) {
                            f5 = jbVar8.g().floatValue();
                        } else {
                            jb<Float, Float> jbVar9 = this.N;
                            if (jbVar9 != null) {
                                f5 = jbVar9.g().floatValue();
                            }
                            canvas.translate((f10 * d) + c3, 0.0f);
                        }
                        f10 += f5;
                        canvas.translate((f10 * d) + c3, 0.0f);
                    }
                    i6++;
                    y2 = list2;
                    size = i2;
                    c = f4;
                }
                canvas.restore();
                i4++;
            }
        } else {
            float d7 = ee.d(matrix);
            Typeface x2 = this.F.x(bVar.a(), bVar.c());
            if (x2 != null) {
                String str6 = documentData.a;
                this.F.getClass();
                this.A.setTypeface(x2);
                jb<Float, Float> jbVar10 = this.P;
                if (jbVar10 != null) {
                    f = jbVar10.g().floatValue();
                } else {
                    f = documentData.c;
                }
                this.A.setTextSize(ee.c() * f);
                this.B.setTypeface(this.A.getTypeface());
                this.B.setTextSize(this.A.getTextSize());
                float c4 = ee.c() * documentData.f;
                List<String> y3 = y(str6);
                int size3 = y3.size();
                int i9 = 0;
                while (i9 < size3) {
                    String str7 = y3.get(i9);
                    v(documentData.d, canvas, this.B.measureText(str7));
                    canvas.translate(0.0f, (((float) i9) * c4) - ((((float) (size3 - 1)) * c4) / 2.0f));
                    int i10 = 0;
                    while (i10 < str7.length()) {
                        int codePointAt = str7.codePointAt(i10);
                        int charCount = Character.charCount(codePointAt) + i10;
                        while (charCount < str7.length()) {
                            int codePointAt2 = str7.codePointAt(charCount);
                            if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                                break;
                            }
                            charCount += Character.charCount(codePointAt2);
                            codePointAt = (codePointAt * 31) + codePointAt2;
                        }
                        long j = (long) codePointAt;
                        if (this.D.e(j)) {
                            str = this.D.g(j);
                            list = y3;
                        } else {
                            this.x.setLength(0);
                            int i11 = i10;
                            while (i11 < charCount) {
                                int codePointAt3 = str7.codePointAt(i11);
                                this.x.appendCodePoint(codePointAt3);
                                i11 += Character.charCount(codePointAt3);
                                y3 = y3;
                            }
                            list = y3;
                            str = this.x.toString();
                            this.D.o(j, str);
                        }
                        i10 += str.length();
                        if (documentData.k) {
                            w(str, this.A, canvas);
                            w(str, this.B, canvas);
                        } else {
                            w(str, this.B, canvas);
                            w(str, this.A, canvas);
                        }
                        float measureText = this.A.measureText(str, 0, 1);
                        float f11 = ((float) documentData.e) / 10.0f;
                        jb<Float, Float> jbVar11 = this.O;
                        if (jbVar11 != null) {
                            f2 = jbVar11.g().floatValue();
                        } else {
                            jb<Float, Float> jbVar12 = this.N;
                            if (jbVar12 != null) {
                                f2 = jbVar12.g().floatValue();
                            } else {
                                canvas.translate((f11 * d7) + measureText, 0.0f);
                                y3 = list;
                            }
                        }
                        f11 += f2;
                        canvas.translate((f11 * d7) + measureText, 0.0f);
                        y3 = list;
                    }
                    canvas.setMatrix(matrix);
                    i9++;
                    y3 = y3;
                }
            }
        }
        canvas.restore();
    }
}
