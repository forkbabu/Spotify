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

public class c extends b {
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
    private float r = Float.NaN;
    private float s = Float.NaN;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 1);
            a.append(11, 2);
            a.append(7, 4);
            a.append(8, 5);
            a.append(9, 6);
            a.append(1, 19);
            a.append(2, 20);
            a.append(5, 7);
            a.append(17, 8);
            a.append(16, 9);
            a.append(15, 10);
            a.append(13, 12);
            a.append(12, 13);
            a.append(6, 14);
            a.append(3, 15);
            a.append(4, 16);
            a.append(10, 17);
            a.append(14, 18);
        }

        public static void a(c cVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        cVar.f = typedArray.getFloat(index, cVar.f);
                        break;
                    case 2:
                        cVar.g = typedArray.getDimension(index, cVar.g);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder V0 = je.V0("unused attribute 0x");
                        V0.append(Integer.toHexString(index));
                        V0.append("   ");
                        V0.append(a.get(index));
                        Log.e("KeyAttribute", V0.toString());
                        break;
                    case 4:
                        cVar.h = typedArray.getFloat(index, cVar.h);
                        break;
                    case 5:
                        cVar.i = typedArray.getFloat(index, cVar.i);
                        break;
                    case 6:
                        cVar.j = typedArray.getFloat(index, cVar.j);
                        break;
                    case 7:
                        cVar.n = typedArray.getFloat(index, cVar.n);
                        break;
                    case 8:
                        cVar.m = typedArray.getFloat(index, cVar.m);
                        break;
                    case 9:
                        typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                cVar.c = typedArray.getString(index);
                                break;
                            } else {
                                cVar.b = typedArray.getResourceId(index, cVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, cVar.b);
                            cVar.b = resourceId;
                            if (resourceId == -1) {
                                cVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 12:
                        cVar.a = typedArray.getInt(index, cVar.a);
                        break;
                    case 13:
                        cVar.e = typedArray.getInteger(index, cVar.e);
                        break;
                    case 14:
                        cVar.o = typedArray.getFloat(index, cVar.o);
                        break;
                    case 15:
                        cVar.p = typedArray.getDimension(index, cVar.p);
                        break;
                    case 16:
                        cVar.q = typedArray.getDimension(index, cVar.q);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            cVar.r = typedArray.getDimension(index, cVar.r);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        cVar.s = typedArray.getFloat(index, cVar.s);
                        break;
                    case 19:
                        cVar.k = typedArray.getDimension(index, cVar.k);
                        break;
                    case 20:
                        cVar.l = typedArray.getDimension(index, cVar.l);
                        break;
                }
            }
        }
    }

    public c() {
        this.d = new HashMap<>();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r1.equals("scaleY") == false) goto L_0x00ee;
     */
    @Override // androidx.constraintlayout.motion.widget.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.q> r6) {
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.c.a(java.util.HashMap):void");
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
        if (!Float.isNaN(this.k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, e.g));
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
            if (!Float.isNaN(this.k)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.p)) {
                hashMap.put("translationX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("translationY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.r)) {
                hashMap.put("translationZ", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("scaleX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.o)) {
                hashMap.put("scaleY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.s)) {
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
