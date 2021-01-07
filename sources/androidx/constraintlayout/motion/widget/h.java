package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;

public class h extends i {
    String f = null;
    int g = -1;
    int h = 0;
    float i = Float.NaN;
    float j = Float.NaN;
    float k = Float.NaN;
    float l = Float.NaN;
    int m = 0;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(4, 1);
            a.append(2, 2);
            a.append(11, 3);
            a.append(0, 4);
            a.append(1, 5);
            a.append(8, 6);
            a.append(9, 7);
            a.append(3, 9);
            a.append(10, 8);
            a.append(7, 11);
            a.append(6, 12);
            a.append(5, 10);
        }

        static void a(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                hVar.c = typedArray.getString(index);
                                break;
                            } else {
                                hVar.b = typedArray.getResourceId(index, hVar.b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, hVar.b);
                            hVar.b = resourceId;
                            if (resourceId == -1) {
                                hVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 2:
                        hVar.a = typedArray.getInt(index, hVar.a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            hVar.f = typedArray.getString(index);
                            break;
                        } else {
                            hVar.f = x1.c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        hVar.e = typedArray.getInteger(index, hVar.e);
                        break;
                    case 5:
                        hVar.h = typedArray.getInt(index, hVar.h);
                        break;
                    case 6:
                        hVar.k = typedArray.getFloat(index, hVar.k);
                        break;
                    case 7:
                        hVar.l = typedArray.getFloat(index, hVar.l);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, hVar.j);
                        hVar.i = f;
                        hVar.j = f;
                        break;
                    case 9:
                        hVar.m = typedArray.getInt(index, hVar.m);
                        break;
                    case 10:
                        hVar.g = typedArray.getInt(index, hVar.g);
                        break;
                    case 11:
                        hVar.i = typedArray.getFloat(index, hVar.i);
                        break;
                    case 12:
                        hVar.j = typedArray.getFloat(index, hVar.j);
                        break;
                    default:
                        StringBuilder V0 = je.V0("unused attribute 0x");
                        V0.append(Integer.toHexString(index));
                        V0.append("   ");
                        V0.append(a.get(index));
                        Log.e("KeyPosition", V0.toString());
                        break;
                }
            }
            if (hVar.a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void a(HashMap<String, q> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.b
    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, e.i));
    }
}
