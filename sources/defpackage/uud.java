package defpackage;

import android.animation.Animator;

/* renamed from: uud  reason: default package */
public final class uud {
    public static final jvd<Float> a = jvd.b(Float.valueOf(1.0f));
    private static final float[] b = {0.0f, 1.0f};

    public static Animator a(vud vud) {
        wud wud = new wud(vud);
        wud.setFloatValues(b);
        wud.setDuration((long) (a.a().floatValue() * ((float) vud.b())));
        return wud;
    }
}
