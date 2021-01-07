package defpackage;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: e8  reason: default package */
public class e8 {
    /* JADX DEBUG: Multi-variable search result rejected for r15v12, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x032b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28, float r29) {
        /*
        // Method dump skipped, instructions count: 893
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Interpolator b(Context context, XmlPullParser xmlPullParser) {
        Interpolator h8Var;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            h8Var = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            h8Var = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            h8Var = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            h8Var = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            h8Var = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            h8Var = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            h8Var = new h8(context, asAttributeSet, xmlPullParser);
                        } else {
                            StringBuilder V0 = je.V0("Unknown interpolator name: ");
                            V0.append(xmlPullParser.getName());
                            throw new RuntimeException(V0.toString());
                        }
                        interpolator = h8Var;
                    }
                }
            }
        }
        return interpolator;
    }

    private static Keyframe c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static PropertyValuesHolder d(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolder;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !e(i7)) && (!z2 || !e(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            u2[] e = r2.e(string);
            u2[] e2 = r2.e(string2);
            if (e == null && e2 == null) {
                return null;
            }
            if (e != null) {
                f8 f8Var = new f8();
                if (e2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, f8Var, e);
                } else if (r2.a(e, e2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, f8Var, e, e2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (e2 != null) {
                return PropertyValuesHolder.ofObject(str, new f8(), e2);
            } else {
                return null;
            }
        } else {
            g8 a = i == 3 ? g8.a() : null;
            if (z3) {
                if (z) {
                    if (i7 == 5) {
                        f2 = typedArray.getDimension(i2, 0.0f);
                    } else {
                        f2 = typedArray.getFloat(i2, 0.0f);
                    }
                    if (z2) {
                        if (i8 == 5) {
                            f3 = typedArray.getDimension(i3, 0.0f);
                        } else {
                            f3 = typedArray.getFloat(i3, 0.0f);
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                    }
                } else {
                    if (i8 == 5) {
                        f = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
                }
            } else if (z) {
                if (i7 == 5) {
                    i5 = (int) typedArray.getDimension(i2, 0.0f);
                } else if (e(i7)) {
                    i5 = typedArray.getColor(i2, 0);
                } else {
                    i5 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i8 == 5) {
                        i6 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (e(i8)) {
                        i6 = typedArray.getColor(i3, 0);
                    } else {
                        i6 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
                }
            } else {
                if (z2) {
                    if (i8 == 5) {
                        i4 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (e(i8)) {
                        i4 = typedArray.getColor(i3, 0);
                    } else {
                        i4 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
                }
                if (propertyValuesHolder3 == null && a != null) {
                    propertyValuesHolder3.setEvaluator(a);
                    return propertyValuesHolder3;
                }
            }
            propertyValuesHolder3 = propertyValuesHolder;
            return propertyValuesHolder3 == null ? propertyValuesHolder3 : propertyValuesHolder3;
        }
    }

    private static boolean e(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator f(android.content.Context r10, int r11) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x000b
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r10, r11)
            goto L_0x002b
        L_0x000b:
            android.content.res.Resources r1 = r10.getResources()
            android.content.res.Resources$Theme r2 = r10.getTheme()
            java.lang.String r8 = "Can't load animation resource ID #0x"
            r0 = 0
            android.content.res.XmlResourceParser r9 = r1.getAnimation(r11)     // Catch:{ XmlPullParserException -> 0x0054, IOException -> 0x0037 }
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r9)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f, all -> 0x002c }
            r5 = 0
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r0 = r10
            r3 = r9
            android.animation.Animator r10 = a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f, all -> 0x002c }
            r9.close()
        L_0x002b:
            return r10
        L_0x002c:
            r10 = move-exception
            r0 = r9
            goto L_0x0071
        L_0x002f:
            r10 = move-exception
            r0 = r9
            goto L_0x0038
        L_0x0032:
            r10 = move-exception
            r0 = r9
            goto L_0x0055
        L_0x0035:
            r10 = move-exception
            goto L_0x0071
        L_0x0037:
            r10 = move-exception
        L_0x0038:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0035 }
            r2.<init>()     // Catch:{ all -> 0x0035 }
            r2.append(r8)     // Catch:{ all -> 0x0035 }
            java.lang.String r11 = java.lang.Integer.toHexString(r11)     // Catch:{ all -> 0x0035 }
            r2.append(r11)     // Catch:{ all -> 0x0035 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0035 }
            r1.<init>(r11)     // Catch:{ all -> 0x0035 }
            r1.initCause(r10)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0054:
            r10 = move-exception
        L_0x0055:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0035 }
            r2.<init>()     // Catch:{ all -> 0x0035 }
            r2.append(r8)     // Catch:{ all -> 0x0035 }
            java.lang.String r11 = java.lang.Integer.toHexString(r11)     // Catch:{ all -> 0x0035 }
            r2.append(r11)     // Catch:{ all -> 0x0035 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0035 }
            r1.<init>(r11)     // Catch:{ all -> 0x0035 }
            r1.initCause(r10)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8.f(android.content.Context, int):android.animation.Animator");
    }

    private static ValueAnimator g(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        int i;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        TypedArray p = i2.p(resources, theme, attributeSet, z7.g);
        TypedArray p2 = i2.p(resources, theme, attributeSet, z7.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        int i5 = 300;
        if (i2.n(xmlPullParser, "duration")) {
            i5 = p.getInt(1, 300);
        }
        long j = (long) i5;
        int i6 = 0;
        if (!i2.n(xmlPullParser, "startOffset")) {
            i = 0;
        } else {
            i = p.getInt(2, 0);
        }
        long j2 = (long) i;
        if (!i2.n(xmlPullParser, "valueType")) {
            i2 = 4;
        } else {
            i2 = p.getInt(7, 4);
        }
        if (i2.n(xmlPullParser, "valueFrom") && i2.n(xmlPullParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue peekValue = p.peekValue(5);
                boolean z = peekValue != null;
                int i7 = z ? peekValue.type : 0;
                TypedValue peekValue2 = p.peekValue(6);
                boolean z2 = peekValue2 != null;
                i2 = ((!z || !e(i7)) && (!z2 || !e(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder d = d(p, i2, 5, 6, "");
            if (d != null) {
                valueAnimator4.setValues(d);
            }
        }
        valueAnimator4.setDuration(j);
        valueAnimator4.setStartDelay(j2);
        if (!i2.n(xmlPullParser, "repeatCount")) {
            i3 = 0;
        } else {
            i3 = p.getInt(3, 0);
        }
        valueAnimator4.setRepeatCount(i3);
        if (!i2.n(xmlPullParser, "repeatMode")) {
            i4 = 1;
        } else {
            i4 = p.getInt(4, 1);
        }
        valueAnimator4.setRepeatMode(i4);
        if (p2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String m = i2.m(p2, xmlPullParser, "pathData", 1);
            if (m != null) {
                String m2 = i2.m(p2, xmlPullParser, "propertyXName", 2);
                String m3 = i2.m(p2, xmlPullParser, "propertyYName", 3);
                if (m2 == null && m3 == null) {
                    throw new InflateException(p2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path f2 = r2.f(m);
                float f3 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(f2, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(f2, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / ((float) (min - 1));
                valueAnimator2 = valueAnimator4;
                typedArray = p;
                int i8 = 0;
                float f6 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i6 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i8)).floatValue(), fArr3, null);
                    fArr[i6] = fArr3[0];
                    fArr2[i6] = fArr3[1];
                    f6 += f5;
                    int i9 = i8 + 1;
                    if (i9 < arrayList.size() && f6 > ((Float) arrayList.get(i9)).floatValue()) {
                        pathMeasure2.nextContour();
                        i8 = i9;
                    }
                    i6++;
                    min = min;
                }
                PropertyValuesHolder ofFloat = m2 != null ? PropertyValuesHolder.ofFloat(m2, fArr) : null;
                if (m3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(m3, fArr2);
                }
                if (ofFloat == null) {
                    i6 = 0;
                    objectAnimator.setValues(propertyValuesHolder);
                } else {
                    i6 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = p;
                objectAnimator.setPropertyName(i2.m(p2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = p;
        }
        if (!i2.n(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i6 = typedArray2.getResourceId(i6, i6);
        }
        if (i6 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(h(context, i6));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (p2 != null) {
            p2.recycle();
        }
        return valueAnimator3;
    }

    public static Interpolator h(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i == 17563663) {
            try {
                return new x5();
            } catch (XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            } catch (Throwable th) {
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i == 17563661) {
            return new y5();
        } else {
            if (i == 17563662) {
                return new z5();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            context.getResources();
            context.getTheme();
            Interpolator b = b(context, animation);
            animation.close();
            return b;
        }
    }
}
