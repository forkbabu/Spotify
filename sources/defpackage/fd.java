package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: fd  reason: default package */
public class fd {
    private static final Interpolator a = new LinearInterpolator();
    private static u1<WeakReference<Interpolator>> b;
    static JsonReader.a c = JsonReader.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    fd() {
    }

    static <T> fe<T> a(JsonReader jsonReader, d dVar, float f, wd<T> wdVar, boolean z) {
        T t;
        WeakReference<Interpolator> g;
        Interpolator interpolator;
        if (!z) {
            return new fe<>(wdVar.a(jsonReader, f));
        }
        jsonReader.d();
        Interpolator interpolator2 = null;
        int i = 1;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z2 = false;
        float f2 = 0.0f;
        while (jsonReader.h()) {
            switch (jsonReader.w(c)) {
                case 0:
                    f2 = (float) jsonReader.l();
                    break;
                case 1:
                    t3 = wdVar.a(jsonReader, f);
                    continue;
                case 2:
                    t2 = wdVar.a(jsonReader, f);
                    continue;
                case 3:
                    pointF = ed.b(jsonReader, f);
                    continue;
                case 4:
                    pointF2 = ed.b(jsonReader, f);
                    continue;
                case 5:
                    if (jsonReader.m() == i) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                    }
                case 6:
                    pointF4 = ed.b(jsonReader, f);
                    continue;
                case 7:
                    pointF3 = ed.b(jsonReader, f);
                    continue;
                default:
                    jsonReader.C();
                    break;
            }
            i = 1;
        }
        jsonReader.g();
        if (z2) {
            interpolator2 = a;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator2 = a;
            } else {
                float f3 = -f;
                pointF.x = de.b(pointF.x, f3, f);
                pointF.y = de.b(pointF.y, -100.0f, 100.0f);
                pointF2.x = de.b(pointF2.x, f3, f);
                float b2 = de.b(pointF2.y, -100.0f, 100.0f);
                pointF2.y = b2;
                float f4 = pointF.x;
                float f5 = pointF.y;
                float f6 = pointF2.x;
                int i2 = ee.g;
                int i3 = f4 != 0.0f ? (int) (((float) 527) * f4) : 17;
                if (f5 != 0.0f) {
                    i3 = (int) (((float) (i3 * 31)) * f5);
                }
                if (f6 != 0.0f) {
                    i3 = (int) (((float) (i3 * 31)) * f6);
                }
                if (b2 != 0.0f) {
                    i3 = (int) (((float) (i3 * 31)) * b2);
                }
                synchronized (fd.class) {
                    if (b == null) {
                        b = new u1<>(10);
                    }
                    g = b.g(i3, null);
                }
                if (g != null) {
                    interpolator2 = g.get();
                }
                if (g == null || interpolator2 == null) {
                    pointF.x /= f;
                    pointF.y /= f;
                    float f7 = pointF2.x / f;
                    pointF2.x = f7;
                    float f8 = pointF2.y / f;
                    pointF2.y = f8;
                    try {
                        interpolator = h5.a(pointF.x, pointF.y, f7, f8);
                    } catch (IllegalArgumentException e) {
                        if (e.getMessage().equals("The Path cannot loop back on itself.")) {
                            interpolator = h5.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                        } else {
                            interpolator = new LinearInterpolator();
                        }
                    }
                    interpolator2 = interpolator;
                    try {
                        WeakReference<Interpolator> weakReference = new WeakReference<>(interpolator2);
                        synchronized (fd.class) {
                            b.n(i3, weakReference);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
            }
            t = t2;
        }
        fe<T> feVar = new fe<>(dVar, t3, t, interpolator2, f2, null);
        feVar.m = pointF4;
        feVar.n = pointF3;
        return feVar;
    }
}
