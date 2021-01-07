package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class e extends b {
    private int e = 0;
    private int f = -1;
    private float g = Float.NaN;
    private float h = 0.0f;
    private float i = Float.NaN;
    private int j = -1;
    private float k = Float.NaN;
    private float l = Float.NaN;
    private float m = Float.NaN;
    private float n = Float.NaN;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private float u = Float.NaN;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(13, 1);
            a.append(11, 2);
            a.append(14, 3);
            a.append(10, 4);
            a.append(18, 5);
            a.append(17, 6);
            a.append(16, 7);
            a.append(19, 8);
            a.append(0, 9);
            a.append(9, 10);
            a.append(5, 11);
            a.append(6, 12);
            a.append(7, 13);
            a.append(15, 14);
            a.append(3, 15);
            a.append(4, 16);
            a.append(1, 17);
            a.append(2, 18);
            a.append(8, 19);
            a.append(12, 20);
        }

        static void a(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                eVar.c = typedArray.getString(index);
                                break;
                            } else {
                                eVar.b = typedArray.getResourceId(index, eVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, eVar.b);
                            eVar.b = resourceId;
                            if (resourceId == -1) {
                                eVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 2:
                        eVar.a = typedArray.getInt(index, eVar.a);
                        break;
                    case 3:
                        typedArray.getString(index);
                        break;
                    case 4:
                        eVar.e = typedArray.getInteger(index, eVar.e);
                        break;
                    case 5:
                        eVar.f = typedArray.getInt(index, eVar.f);
                        break;
                    case 6:
                        eVar.g = typedArray.getFloat(index, eVar.g);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            eVar.h = typedArray.getDimension(index, eVar.h);
                            break;
                        } else {
                            eVar.h = typedArray.getFloat(index, eVar.h);
                            break;
                        }
                    case 8:
                        eVar.j = typedArray.getInt(index, eVar.j);
                        break;
                    case 9:
                        eVar.k = typedArray.getFloat(index, eVar.k);
                        break;
                    case 10:
                        eVar.l = typedArray.getDimension(index, eVar.l);
                        break;
                    case 11:
                        eVar.m = typedArray.getFloat(index, eVar.m);
                        break;
                    case 12:
                        eVar.o = typedArray.getFloat(index, eVar.o);
                        break;
                    case 13:
                        eVar.p = typedArray.getFloat(index, eVar.p);
                        break;
                    case 14:
                        eVar.n = typedArray.getFloat(index, eVar.n);
                        break;
                    case 15:
                        eVar.q = typedArray.getFloat(index, eVar.q);
                        break;
                    case 16:
                        eVar.r = typedArray.getFloat(index, eVar.r);
                        break;
                    case 17:
                        eVar.s = typedArray.getDimension(index, eVar.s);
                        break;
                    case 18:
                        eVar.t = typedArray.getDimension(index, eVar.t);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT >= 21) {
                            eVar.u = typedArray.getDimension(index, eVar.u);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        eVar.i = typedArray.getFloat(index, eVar.i);
                        break;
                    default:
                        StringBuilder V0 = je.V0("unused attribute 0x");
                        V0.append(Integer.toHexString(index));
                        V0.append("   ");
                        V0.append(a.get(index));
                        Log.e("KeyCycle", V0.toString());
                        break;
                }
            }
        }
    }

    public e() {
        this.d = new HashMap<>();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.f> r12) {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.e.M(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void a(HashMap<String, q> hashMap) {
        hashMap.size();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            stackTrace[i2].getFileName();
            stackTrace[i2].getLineNumber();
            stackTrace[i2].getMethodName();
            str = str + " ";
        }
        for (String str2 : hashMap.keySet()) {
            q qVar = hashMap.get(str2);
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case -1249320806:
                    if (str2.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str2.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str2.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str2.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str2.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str2.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str2.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str2.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (str2.equals("rotation")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -4379043:
                    if (str2.equals("elevation")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 37232917:
                    if (str2.equals("transitionPathRotate")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str2.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 156108012:
                    if (str2.equals("waveOffset")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    qVar.c(this.a, this.o);
                    break;
                case 1:
                    qVar.c(this.a, this.p);
                    break;
                case 2:
                    qVar.c(this.a, this.s);
                    break;
                case 3:
                    qVar.c(this.a, this.t);
                    break;
                case 4:
                    qVar.c(this.a, this.u);
                    break;
                case 5:
                    qVar.c(this.a, this.i);
                    break;
                case 6:
                    qVar.c(this.a, this.q);
                    break;
                case 7:
                    qVar.c(this.a, this.r);
                    break;
                case '\b':
                    qVar.c(this.a, this.m);
                    break;
                case '\t':
                    qVar.c(this.a, this.l);
                    break;
                case '\n':
                    qVar.c(this.a, this.n);
                    break;
                case 11:
                    qVar.c(this.a, this.k);
                    break;
                case '\f':
                    qVar.c(this.a, this.h);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.k)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationZ");
        }
        if (this.d.size() > 0) {
            Iterator<String> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.e.h));
    }
}
