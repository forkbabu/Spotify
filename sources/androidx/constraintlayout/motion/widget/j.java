package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class j extends b {
    private int e = -1;
    private float f = Float.NaN;
    private float g = Float.NaN;
    private float h = Float.NaN;
    private float i = Float.NaN;
    private float j = Float.NaN;
    private float k = Float.NaN;
    private float l = Float.NaN;
    private float m = Float.NaN;
    private float n = Float.NaN;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private int r = 0;
    private float s = Float.NaN;
    private float t = 0.0f;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 1);
            a.append(9, 2);
            a.append(5, 4);
            a.append(6, 5);
            a.append(7, 6);
            a.append(3, 7);
            a.append(15, 8);
            a.append(14, 9);
            a.append(13, 10);
            a.append(11, 12);
            a.append(10, 13);
            a.append(4, 14);
            a.append(1, 15);
            a.append(2, 16);
            a.append(8, 17);
            a.append(12, 18);
            a.append(18, 20);
            a.append(17, 21);
            a.append(19, 19);
        }

        public static void a(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        jVar.f = typedArray.getFloat(index, jVar.f);
                        break;
                    case 2:
                        jVar.g = typedArray.getDimension(index, jVar.g);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder V0 = je.V0("unused attribute 0x");
                        V0.append(Integer.toHexString(index));
                        V0.append("   ");
                        V0.append(a.get(index));
                        Log.e("KeyTimeCycle", V0.toString());
                        break;
                    case 4:
                        jVar.h = typedArray.getFloat(index, jVar.h);
                        break;
                    case 5:
                        jVar.i = typedArray.getFloat(index, jVar.i);
                        break;
                    case 6:
                        jVar.j = typedArray.getFloat(index, jVar.j);
                        break;
                    case 7:
                        jVar.l = typedArray.getFloat(index, jVar.l);
                        break;
                    case 8:
                        jVar.k = typedArray.getFloat(index, jVar.k);
                        break;
                    case 9:
                        typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                jVar.c = typedArray.getString(index);
                                break;
                            } else {
                                jVar.b = typedArray.getResourceId(index, jVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, jVar.b);
                            jVar.b = resourceId;
                            if (resourceId == -1) {
                                jVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 12:
                        jVar.a = typedArray.getInt(index, jVar.a);
                        break;
                    case 13:
                        jVar.e = typedArray.getInteger(index, jVar.e);
                        break;
                    case 14:
                        jVar.m = typedArray.getFloat(index, jVar.m);
                        break;
                    case 15:
                        jVar.n = typedArray.getDimension(index, jVar.n);
                        break;
                    case 16:
                        jVar.o = typedArray.getDimension(index, jVar.o);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            jVar.p = typedArray.getDimension(index, jVar.p);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        jVar.q = typedArray.getFloat(index, jVar.q);
                        break;
                    case 19:
                        jVar.r = typedArray.getInt(index, jVar.r);
                        break;
                    case 20:
                        jVar.s = typedArray.getFloat(index, jVar.s);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            jVar.t = typedArray.getDimension(index, jVar.t);
                            break;
                        } else {
                            jVar.t = typedArray.getFloat(index, jVar.t);
                            break;
                        }
                }
            }
        }
    }

    public j() {
        this.d = new HashMap<>();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.r> r12) {
        /*
        // Method dump skipped, instructions count: 624
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.K(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void a(HashMap<String, q> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
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
        a.a(this, context.obtainStyledAttributes(attributeSet, e.j));
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void d(HashMap<String, Integer> hashMap) {
        if (this.e != -1) {
            if (!Float.isNaN(this.f)) {
                hashMap.put("alpha", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.g)) {
                hashMap.put("elevation", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.h)) {
                hashMap.put("rotation", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.i)) {
                hashMap.put("rotationX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.j)) {
                hashMap.put("rotationY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("translationX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.o)) {
                hashMap.put("translationY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.p)) {
                hashMap.put("translationZ", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("scaleX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("scaleY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("progress", Integer.valueOf(this.e));
            }
            if (this.d.size() > 0) {
                for (String str : this.d.keySet()) {
                    hashMap.put(je.x0("CUSTOM,", str), Integer.valueOf(this.e));
                }
            }
        }
    }
}
