package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    private static final String[] R = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<d, float[]> S = new a(float[].class, "nonTranslations");
    private static final Property<d, PointF> T = new b(PointF.class, "translations");
    private static final boolean U;
    boolean O = true;
    private boolean P = true;
    private Matrix Q = new Matrix();

    static class a extends Property<d, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ float[] get(d dVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(d dVar, float[] fArr) {
            dVar.d(fArr);
        }
    }

    static class b extends Property<d, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(d dVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(d dVar, PointF pointF) {
            dVar.c(pointF);
        }
    }

    private static class c extends t {
        private View a;
        private f b;

        c(View view, f fVar) {
            this.a = view;
            this.b = fVar;
        }

        @Override // androidx.transition.t, androidx.transition.Transition.d
        public void a(Transition transition) {
            this.b.setVisibility(0);
        }

        @Override // androidx.transition.t, androidx.transition.Transition.d
        public void c(Transition transition) {
            this.b.setVisibility(4);
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            transition.P(this);
            View view = this.a;
            if (Build.VERSION.SDK_INT == 28) {
                h.c(view);
            } else {
                int i = i.p;
                i iVar = (i) view.getTag(C0707R.id.ghost_view);
                if (iVar != null) {
                    int i2 = iVar.f - 1;
                    iVar.f = i2;
                    if (i2 <= 0) {
                        ((g) iVar.getParent()).removeView(iVar);
                    }
                }
            }
            this.a.setTag(C0707R.id.transition_transform, null);
            this.a.setTag(C0707R.id.parent_matrix, null);
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        private final Matrix a = new Matrix();
        private final View b;
        private final float[] c;
        private float d;
        private float e;

        d(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.a.setValues(fArr);
            g0.e(this.b, this.a);
        }

        /* access modifiers changed from: package-private */
        public Matrix a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        /* access modifiers changed from: package-private */
        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
            b();
        }
    }

    /* access modifiers changed from: private */
    public static class e {
        final float a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        final float g;
        final float h;

        e(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            int i = q4.g;
            this.c = Build.VERSION.SDK_INT >= 21 ? view.getTranslationZ() : 0.0f;
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.f0(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.a == this.a && eVar.b == this.b && eVar.c == this.c && eVar.d == this.d && eVar.e == this.e && eVar.f == this.f && eVar.g == this.g && eVar.h == this.h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            float f2 = this.a;
            int i = 0;
            int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.h;
            if (f9 != 0.0f) {
                i = Float.floatToIntBits(f9);
            }
            return floatToIntBits7 + i;
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        U = z;
    }

    public ChangeTransform() {
    }

    private void c0(x xVar) {
        View view = xVar.b;
        if (view.getVisibility() != 8) {
            xVar.a.put("android:changeTransform:parent", view.getParent());
            xVar.a.put("android:changeTransform:transforms", new e(view));
            Matrix matrix = view.getMatrix();
            xVar.a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.P) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                g0.i(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                xVar.a.put("android:changeTransform:parentMatrix", matrix2);
                xVar.a.put("android:changeTransform:intermediateMatrix", view.getTag(C0707R.id.transition_transform));
                xVar.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C0707R.id.parent_matrix));
            }
        }
    }

    static void e0(View view) {
        f0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    static void f0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        int i = q4.g;
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f3);
        }
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // androidx.transition.Transition
    public String[] I() {
        return R;
    }

    @Override // androidx.transition.Transition
    public void j(x xVar) {
        c0(xVar);
    }

    @Override // androidx.transition.Transition
    public void n(x xVar) {
        c0(xVar);
        if (!U) {
            ((ViewGroup) xVar.b.getParent()).startViewTransition(xVar.b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01bc  */
    @Override // androidx.transition.Transition
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator r(android.view.ViewGroup r22, androidx.transition.x r23, androidx.transition.x r24) {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.r(android.view.ViewGroup, androidx.transition.x, androidx.transition.x):android.animation.Animator");
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.O = i2.h(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.P = i2.h(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
