package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.e;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class k extends b {
    private String e = null;
    private int f = -1;
    private String g = null;
    private String h = null;
    private int i = -1;
    private int j = -1;
    private View k = null;
    float l = 0.1f;
    private boolean m = true;
    private boolean n = true;
    private boolean o = true;
    private float p = Float.NaN;
    private Method q;
    private Method r;
    private Method s;
    private float t;
    private boolean u = false;
    RectF v = new RectF();
    RectF w = new RectF();

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 8);
            a.append(4, 4);
            a.append(5, 1);
            a.append(6, 2);
            a.append(1, 7);
            a.append(7, 6);
            a.append(9, 5);
            a.append(3, 9);
            a.append(2, 10);
            a.append(8, 11);
        }

        public static void a(k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        kVar.g = typedArray.getString(index);
                        continue;
                    case 2:
                        kVar.h = typedArray.getString(index);
                        continue;
                    case 4:
                        kVar.e = typedArray.getString(index);
                        continue;
                    case 5:
                        kVar.l = typedArray.getFloat(index, kVar.l);
                        continue;
                    case 6:
                        kVar.i = typedArray.getResourceId(index, kVar.i);
                        continue;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, kVar.b);
                            kVar.b = resourceId;
                            if (resourceId == -1) {
                                kVar.c = typedArray.getString(index);
                            } else {
                                continue;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            kVar.c = typedArray.getString(index);
                        } else {
                            kVar.b = typedArray.getResourceId(index, kVar.b);
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, kVar.a);
                        kVar.a = integer;
                        kVar.p = (((float) integer) + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        kVar.j = typedArray.getResourceId(index, kVar.j);
                        continue;
                    case 10:
                        kVar.u = typedArray.getBoolean(index, kVar.u);
                        continue;
                    case 11:
                        kVar.f = typedArray.getResourceId(index, kVar.f);
                        break;
                }
                StringBuilder V0 = je.V0("unused attribute 0x");
                V0.append(Integer.toHexString(index));
                V0.append("   ");
                V0.append(a.get(index));
                Log.e("KeyTrigger", V0.toString());
            }
        }
    }

    public k() {
        this.d = new HashMap<>();
    }

    private void r(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void a(HashMap<String, q> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void b(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, e.k));
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0118 A[SYNTHETIC, Splitter:B:73:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0189 A[SYNTHETIC, Splitter:B:86:0x0189] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(float r11, android.view.View r12) {
        /*
        // Method dump skipped, instructions count: 610
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.k.q(float, android.view.View):void");
    }
}
