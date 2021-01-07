package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: h8  reason: default package */
public class h8 implements Interpolator {
    private float[] a;
    private float[] b;

    public h8(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        float f;
        float f2;
        float f3;
        float f4;
        TypedArray p = i2.p(context.getResources(), context.getTheme(), attributeSet, z7.l);
        if (i2.n(xmlPullParser, "pathData")) {
            String m = i2.m(p, xmlPullParser, "pathData", 4);
            Path f5 = r2.f(m);
            if (f5 != null) {
                a(f5);
            } else {
                throw new InflateException(je.x0("The path is null, which is created from ", m));
            }
        } else if (!i2.n(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (i2.n(xmlPullParser, "controlY1")) {
            if (!i2.n(xmlPullParser, "controlX1")) {
                f = 0.0f;
            } else {
                f = p.getFloat(0, 0.0f);
            }
            if (!i2.n(xmlPullParser, "controlY1")) {
                f2 = 0.0f;
            } else {
                f2 = p.getFloat(1, 0.0f);
            }
            boolean n = i2.n(xmlPullParser, "controlX2");
            if (n != i2.n(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!n) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(f, f2, 1.0f, 1.0f);
                a(path);
            } else {
                if (!i2.n(xmlPullParser, "controlX2")) {
                    f3 = 0.0f;
                } else {
                    f3 = p.getFloat(2, 0.0f);
                }
                if (!i2.n(xmlPullParser, "controlY2")) {
                    f4 = 0.0f;
                } else {
                    f4 = p.getFloat(3, 0.0f);
                }
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                a(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        p.recycle();
    }

    private void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min((int) SnackbarUtilsKt.SNACKBAR_BASELINE_DURATION, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.a[i2] = fArr[0];
                this.b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.a[0])) <= 1.0E-5d && ((double) Math.abs(this.b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder V0 = je.V0("The Path must start at (0,0) and end at (1,1) start: ");
            V0.append(this.a[0]);
            V0.append(",");
            V0.append(this.b[0]);
            V0.append(" end:");
            int i6 = min - 1;
            V0.append(this.a[i6]);
            V0.append(",");
            V0.append(this.b[i6]);
            throw new IllegalArgumentException(V0.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float[] fArr2 = this.b;
        float f3 = fArr2[i];
        return je.a(fArr2[length], f3, (f - fArr[i]) / f2, f3);
    }
}
