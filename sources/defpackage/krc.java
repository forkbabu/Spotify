package defpackage;

import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import kotlin.jvm.internal.h;

/* renamed from: krc  reason: default package */
public class krc {
    private final d a;

    public krc() {
        this(new d());
    }

    /* access modifiers changed from: protected */
    public final void a(LottieAnimationView lottieAnimationView) {
        h.e(lottieAnimationView, "view");
        lottieAnimationView.setComposition(this.a);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setMinProgress(0.0f);
        lottieAnimationView.setSpeed(1.0f);
        lottieAnimationView.setMaxProgress(1.0f);
    }

    /* access modifiers changed from: protected */
    public final void b(LottieAnimationView lottieAnimationView) {
        h.e(lottieAnimationView, "view");
        Drawable drawable = lottieAnimationView.getDrawable();
        if (!(drawable instanceof f)) {
            drawable = null;
        }
        f fVar = (f) drawable;
        if (fVar != null) {
            fVar.B();
        }
    }

    public void c(LottieAnimationView lottieAnimationView, uqc uqc, uqc uqc2) {
        h.e(lottieAnimationView, "view");
        h.e(uqc, "fromState");
        h.e(uqc2, "toState");
        a(lottieAnimationView);
        b(lottieAnimationView);
    }

    public krc(d dVar) {
        h.e(dVar, "lottieComposition");
        this.a = dVar;
    }
}
