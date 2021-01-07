package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.f;

/* renamed from: t1c  reason: default package */
public abstract class t1c {
    private final Interpolator a;

    /* renamed from: t1c$a */
    public static abstract class a extends t1c {

        /* renamed from: t1c$a$a  reason: collision with other inner class name */
        public static final class C0683a extends a {
            public static final C0683a b = new C0683a();

            private C0683a() {
                super(new DecelerateInterpolator(), null);
            }
        }

        public a(Interpolator interpolator, f fVar) {
            super(interpolator, null);
        }
    }

    public t1c(Interpolator interpolator, f fVar) {
        this.a = interpolator;
    }

    public final double a(double d) {
        return (double) this.a.getInterpolation((float) d);
    }
}
