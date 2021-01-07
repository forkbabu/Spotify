package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.d;
import kotlin.jvm.internal.h;

/* renamed from: erc  reason: default package */
public abstract class erc extends krc {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public erc(d dVar) {
        super(dVar);
        h.e(dVar, "lottieComposition");
    }

    @Override // defpackage.krc
    public void c(LottieAnimationView lottieAnimationView, uqc uqc, uqc uqc2) {
        h.e(lottieAnimationView, "view");
        h.e(uqc, "fromState");
        h.e(uqc2, "toState");
        a(lottieAnimationView);
        lottieAnimationView.l();
        lottieAnimationView.setFrame(0);
        lottieAnimationView.setProgress(1.0f);
    }
}
