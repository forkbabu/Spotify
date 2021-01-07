package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.a;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.model.d;
import java.util.List;

/* renamed from: de  reason: default package */
public class de {
    private static PointF a = new PointF();
    public static final /* synthetic */ int b = 0;

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(h hVar, Path path) {
        path.reset();
        PointF b2 = hVar.b();
        path.moveTo(b2.x, b2.y);
        a.set(b2.x, b2.y);
        for (int i = 0; i < hVar.a().size(); i++) {
            a aVar = hVar.a().get(i);
            PointF a2 = aVar.a();
            PointF b3 = aVar.b();
            PointF c = aVar.c();
            if (!a2.equals(a) || !b3.equals(c)) {
                path.cubicTo(a2.x, a2.y, b3.x, b3.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            a.set(c.x, c.y);
        }
        if (hVar.d()) {
            path.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return je.a(f2, f, f3, f);
    }

    public static void g(d dVar, int i, List<d> list, d dVar2, ab abVar) {
        if (dVar.c(abVar.getName(), i)) {
            list.add(dVar2.a(abVar.getName()).h(abVar));
        }
    }
}
