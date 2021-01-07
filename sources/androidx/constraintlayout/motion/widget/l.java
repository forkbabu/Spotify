package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.q;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* access modifiers changed from: package-private */
public class l implements Comparable<l> {
    private float a = 1.0f;
    int b = 0;
    int c;
    private float f = 0.0f;
    private float n = 0.0f;
    private float o = 0.0f;
    public float p = 0.0f;
    private float q = 1.0f;
    private float r = 1.0f;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private float u = 0.0f;
    private float v = 0.0f;
    private float w = 0.0f;
    private float x = Float.NaN;
    private float y = Float.NaN;
    LinkedHashMap<String, ConstraintAttribute> z = new LinkedHashMap<>();

    private boolean g(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            if (Float.isNaN(f2) != Float.isNaN(f3)) {
                return true;
            }
            return false;
        } else if (Math.abs(f2 - f3) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(l lVar) {
        lVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public void d(HashMap<String, q> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            q qVar = hashMap.get(str);
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c2 = '\r';
                        break;
                    }
                    break;
            }
            float f2 = 1.0f;
            float f3 = 0.0f;
            switch (c2) {
                case 0:
                    if (!Float.isNaN(this.o)) {
                        f3 = this.o;
                    }
                    qVar.c(i, f3);
                    break;
                case 1:
                    if (!Float.isNaN(this.p)) {
                        f3 = this.p;
                    }
                    qVar.c(i, f3);
                    break;
                case 2:
                    if (!Float.isNaN(this.u)) {
                        f3 = this.u;
                    }
                    qVar.c(i, f3);
                    break;
                case 3:
                    if (!Float.isNaN(this.v)) {
                        f3 = this.v;
                    }
                    qVar.c(i, f3);
                    break;
                case 4:
                    if (!Float.isNaN(this.w)) {
                        f3 = this.w;
                    }
                    qVar.c(i, f3);
                    break;
                case 5:
                    if (!Float.isNaN(this.y)) {
                        f3 = this.y;
                    }
                    qVar.c(i, f3);
                    break;
                case 6:
                    if (!Float.isNaN(this.q)) {
                        f2 = this.q;
                    }
                    qVar.c(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.r)) {
                        f2 = this.r;
                    }
                    qVar.c(i, f2);
                    break;
                case '\b':
                    if (!Float.isNaN(this.s)) {
                        f3 = this.s;
                    }
                    qVar.c(i, f3);
                    break;
                case '\t':
                    if (!Float.isNaN(this.t)) {
                        f3 = this.t;
                    }
                    qVar.c(i, f3);
                    break;
                case '\n':
                    if (!Float.isNaN(this.n)) {
                        f3 = this.n;
                    }
                    qVar.c(i, f3);
                    break;
                case 11:
                    if (!Float.isNaN(this.f)) {
                        f3 = this.f;
                    }
                    qVar.c(i, f3);
                    break;
                case '\f':
                    if (!Float.isNaN(this.x)) {
                        f3 = this.x;
                    }
                    qVar.c(i, f3);
                    break;
                case '\r':
                    if (!Float.isNaN(this.a)) {
                        f2 = this.a;
                    }
                    qVar.c(i, f2);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.z.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.z.get(str2);
                            if (qVar instanceof q.b) {
                                ((q.b) qVar).f.append(i, constraintAttribute);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " splineSet not a CustomSet frame = " + i + ", value" + constraintAttribute.c() + qVar);
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN customName " + str2);
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(l lVar, HashSet<String> hashSet) {
        if (g(this.a, lVar.a)) {
            hashSet.add("alpha");
        }
        if (g(this.f, lVar.f)) {
            hashSet.add("elevation");
        }
        int i = this.c;
        int i2 = lVar.c;
        if (i != i2 && this.b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (g(this.n, lVar.n)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.x) || !Float.isNaN(lVar.x)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.y) || !Float.isNaN(lVar.y)) {
            hashSet.add("progress");
        }
        if (g(this.o, lVar.o)) {
            hashSet.add("rotationX");
        }
        if (g(this.p, lVar.p)) {
            hashSet.add("rotationY");
        }
        if (g(this.s, lVar.s)) {
            hashSet.add("transformPivotX");
        }
        if (g(this.t, lVar.t)) {
            hashSet.add("transformPivotY");
        }
        if (g(this.q, lVar.q)) {
            hashSet.add("scaleX");
        }
        if (g(this.r, lVar.r)) {
            hashSet.add("scaleY");
        }
        if (g(this.u, lVar.u)) {
            hashSet.add("translationX");
        }
        if (g(this.v, lVar.v)) {
            hashSet.add("translationY");
        }
        if (g(this.w, lVar.w)) {
            hashSet.add("translationZ");
        }
    }

    public void i(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.c = view.getVisibility();
        this.a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            this.f = view.getElevation();
        }
        this.n = view.getRotation();
        this.o = view.getRotationX();
        this.p = view.getRotationY();
        this.q = view.getScaleX();
        this.r = view.getScaleY();
        this.s = view.getPivotX();
        this.t = view.getPivotY();
        this.u = view.getTranslationX();
        this.v = view.getTranslationY();
        if (i >= 21) {
            this.w = view.getTranslationZ();
        }
    }

    public void k(ConstraintWidget constraintWidget, b bVar, int i) {
        float f2;
        constraintWidget.O();
        constraintWidget.P();
        b.a u2 = bVar.u(i);
        b.d dVar = u2.b;
        int i2 = dVar.c;
        this.b = i2;
        int i3 = dVar.b;
        this.c = i3;
        if (i3 == 0 || i2 != 0) {
            f2 = dVar.d;
        } else {
            f2 = 0.0f;
        }
        this.a = f2;
        b.e eVar = u2.e;
        boolean z2 = eVar.l;
        this.f = eVar.m;
        this.n = eVar.b;
        this.o = eVar.c;
        this.p = eVar.d;
        this.q = eVar.e;
        this.r = eVar.f;
        this.s = eVar.g;
        this.t = eVar.h;
        this.u = eVar.i;
        this.v = eVar.j;
        this.w = eVar.k;
        x1.c(u2.c.c);
        this.x = u2.c.g;
        this.y = u2.b.e;
        for (String str : u2.f.keySet()) {
            ConstraintAttribute constraintAttribute = u2.f.get(str);
            if (constraintAttribute.b() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.z.put(str, constraintAttribute);
            }
        }
    }
}
