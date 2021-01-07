package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.h;

/* renamed from: jrc  reason: default package */
public final class jrc extends krc {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jrc(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 2131951645(0x7f13001d, float:1.953971E38)
            com.airbnb.lottie.l r2 = com.airbnb.lottie.e.j(r2, r0)
            java.lang.String r0 = "LottieCompositionFactory…oadprogress_pending\n    )"
            kotlin.jvm.internal.h.d(r2, r0)
            java.lang.Object r2 = r2.b()
            kotlin.jvm.internal.h.c(r2)
            java.lang.String r0 = "LottieCompositionFactory…ng\n    )\n        .value!!"
            kotlin.jvm.internal.h.d(r2, r0)
            com.airbnb.lottie.d r2 = (com.airbnb.lottie.d) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrc.<init>(android.content.Context):void");
    }

    @Override // defpackage.krc
    public void c(LottieAnimationView lottieAnimationView, uqc uqc, uqc uqc2) {
        h.e(lottieAnimationView, "view");
        h.e(uqc, "fromState");
        h.e(uqc2, "toState");
        if (lottieAnimationView.k()) {
            lottieAnimationView.setRepeatCount(-1);
            return;
        }
        a(lottieAnimationView);
        lottieAnimationView.setRepeatCount(-1);
        b(lottieAnimationView);
    }
}
