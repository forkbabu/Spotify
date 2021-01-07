package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute {
    String a;
    private AttributeType b;
    private int c;
    private float d;
    private String e;
    boolean f;
    private int g;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj) {
        this.a = str;
        this.b = attributeType;
        i(obj);
    }

    private static int a(int i) {
        int i2 = (i & ((i >> 31) ^ -1)) - 255;
        return (i2 & (i2 >> 31)) + BitmapRenderer.ALPHA_VISIBLE;
    }

    public static void f(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        Object obj;
        AttributeType attributeType;
        AttributeType attributeType2 = AttributeType.DIMENSION_TYPE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj2 = null;
        AttributeType attributeType3 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType3 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    if (index == 7) {
                        obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        obj2 = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.FLOAT_TYPE;
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.INT_TYPE;
                        obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 8) {
                        attributeType = AttributeType.STRING_TYPE;
                        obj = obtainStyledAttributes.getString(index);
                    }
                    attributeType3 = attributeType2;
                }
                attributeType3 = attributeType;
                obj2 = obj;
            }
        }
        if (!(str == null || obj2 == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType3, obj2));
        }
        obtainStyledAttributes.recycle();
    }

    public static void g(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String x0 = je.x0("set", str);
            try {
                switch (constraintAttribute.b.ordinal()) {
                    case 0:
                        cls.getMethod(x0, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.c));
                        continue;
                    case 1:
                        cls.getMethod(x0, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.d));
                        continue;
                    case 2:
                        cls.getMethod(x0, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.g));
                        continue;
                    case 3:
                        Method method = cls.getMethod(x0, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.g);
                        method.invoke(view, colorDrawable);
                        continue;
                    case 4:
                        cls.getMethod(x0, CharSequence.class).invoke(view, constraintAttribute.e);
                        continue;
                    case 5:
                        cls.getMethod(x0, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f));
                        continue;
                    case 6:
                        cls.getMethod(x0, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.d));
                        continue;
                    default:
                        continue;
                }
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(x0);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e3) {
                StringBuilder a1 = je.a1(" Custom Attribute \"", str, "\" not found on ");
                a1.append(cls.getName());
                Log.e("TransitionLayout", a1.toString());
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                StringBuilder a12 = je.a1(" Custom Attribute \"", str, "\" not found on ");
                a12.append(cls.getName());
                Log.e("TransitionLayout", a12.toString());
                e4.printStackTrace();
            }
        }
    }

    public AttributeType b() {
        return this.b;
    }

    public float c() {
        switch (this.b.ordinal()) {
            case 0:
                return (float) this.c;
            case 1:
                return this.d;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f ? 1.0f : 0.0f;
            case 6:
                return this.d;
            default:
                return Float.NaN;
        }
    }

    public void d(float[] fArr) {
        switch (this.b.ordinal()) {
            case 0:
                fArr[0] = (float) this.c;
                return;
            case 1:
                fArr[0] = this.d;
                return;
            case 2:
            case 3:
                int i = this.g;
                int i2 = (i >> 24) & BitmapRenderer.ALPHA_VISIBLE;
                int i3 = (i >> 16) & BitmapRenderer.ALPHA_VISIBLE;
                int i4 = (i >> 8) & BitmapRenderer.ALPHA_VISIBLE;
                int i5 = i & BitmapRenderer.ALPHA_VISIBLE;
                float pow = (float) Math.pow((double) (((float) i3) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) i4) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) i5) / 255.0f), 2.2d);
                fArr[3] = ((float) i2) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.d;
                return;
            default:
                return;
        }
    }

    public int e() {
        int ordinal = this.b.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0066: APUT  
      (r7v38 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Boolean : 0x0062: INVOKE  (r8v30 java.lang.Boolean) = (r13v12 boolean) type: STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean)
     */
    public void h(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder V0 = je.V0("set");
        V0.append(this.a);
        String sb = V0.toString();
        try {
            boolean z = true;
            switch (this.b.ordinal()) {
                case 0:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(sb, Drawable.class);
                    int a2 = a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a3 = a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a2 << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a3 << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + this.a);
                case 5:
                    Method method2 = cls.getMethod(sb, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 6:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e2) {
            StringBuilder a1 = je.a1("no method ", sb, "on View \"");
            a1.append(g0.c(view));
            a1.append("\"");
            Log.e("TransitionLayout", a1.toString());
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            StringBuilder a12 = je.a1("cannot access method ", sb, "on View \"");
            a12.append(g0.c(view));
            a12.append("\"");
            Log.e("TransitionLayout", a12.toString());
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    public void i(Object obj) {
        switch (this.b.ordinal()) {
            case 0:
                this.c = ((Integer) obj).intValue();
                return;
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.a = constraintAttribute.a;
        this.b = constraintAttribute.b;
        i(obj);
    }
}
