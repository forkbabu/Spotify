package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fy  reason: default package */
public class fy {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();

    /* renamed from: fy$a */
    class a extends g {
        final /* synthetic */ List b;
        final /* synthetic */ Matrix c;

        a(fy fyVar, List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        @Override // defpackage.fy.g
        public void a(Matrix matrix, px pxVar, int i, Canvas canvas) {
            for (g gVar : this.b) {
                gVar.a(this.c, pxVar, i, canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fy$b */
    public static class b extends g {
        private final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // defpackage.fy.g
        public void a(Matrix matrix, px pxVar, int i, Canvas canvas) {
            d dVar = this.b;
            float f = dVar.f;
            float f2 = dVar.g;
            d dVar2 = this.b;
            pxVar.a(canvas, matrix, new RectF(dVar2.b, dVar2.c, dVar2.d, dVar2.e), i, f, f2);
        }
    }

    /* renamed from: fy$c */
    static class c extends g {
        private final e b;
        private final float c;
        private final float d;

        public c(e eVar, float f, float f2) {
            this.b = eVar;
            this.c = f;
            this.d = f2;
        }

        @Override // defpackage.fy.g
        public void a(Matrix matrix, px pxVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.b.c - this.d), (double) (this.b.b - this.c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(b());
            pxVar.b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        public float b() {
            return (float) Math.toDegrees(Math.atan((double) ((this.b.c - this.d) / (this.b.b - this.c))));
        }
    }

    /* renamed from: fy$d */
    public static class d extends f {
        private static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f2, float f3, float f4, float f5) {
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
        }

        @Override // defpackage.fy.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(this.b, this.c, this.d, this.e);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: fy$e */
    public static class e extends f {
        private float b;
        private float c;

        @Override // defpackage.fy.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* renamed from: fy$f */
    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fy$g */
    public static abstract class g {
        static final Matrix a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, px pxVar, int i, Canvas canvas);
    }

    public fy() {
        f(0.0f, 0.0f);
    }

    private void b(float f2) {
        float f3 = this.e;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.c;
                float f6 = this.d;
                d dVar = new d(f5, f6, f5, f6);
                dVar.f = this.e;
                dVar.g = f4;
                this.h.add(new b(dVar));
                this.e = f2;
            }
        }
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.f = f6;
        dVar.g = f7;
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        b(f6);
        this.h.add(bVar);
        this.e = f9;
        double d2 = (double) f8;
        this.c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    public void c(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public g d(Matrix matrix) {
        b(this.f);
        return new a(this, new ArrayList(this.h), matrix);
    }

    public void e(float f2, float f3) {
        e eVar = new e();
        eVar.b = f2;
        eVar.c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, this.c, this.d);
        b(cVar.b() + 270.0f);
        this.h.add(cVar);
        this.e = cVar.b() + 270.0f;
        this.c = f2;
        this.d = f3;
    }

    public void f(float f2, float f3) {
        g(f2, f3, 270.0f, 0.0f);
    }

    public void g(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = (f4 + f5) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
