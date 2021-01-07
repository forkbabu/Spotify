package com.spotify.encore.consumer.components.promo.impl.promocard;

import android.widget.FrameLayout;
import com.spotify.encore.consumer.components.promo.impl.databinding.PromoCardHomeLayoutBinding;
import kotlin.jvm.internal.h;

public final class PromoCardHomeViewBindingsKt {
    public static final void init(PromoCardHomeLayoutBinding promoCardHomeLayoutBinding) {
        h.e(promoCardHomeLayoutBinding, "$this$init");
        FrameLayout root = promoCardHomeLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        bvd b = dvd.b(promoCardHomeLayoutBinding.rootView);
        b.f(promoCardHomeLayoutBinding.title, promoCardHomeLayoutBinding.subtitle, promoCardHomeLayoutBinding.label, promoCardHomeLayoutBinding.backgroundImage);
        b.g(promoCardHomeLayoutBinding.cardRoot);
        b.a();
        q4.J(promoCardHomeLayoutBinding.cardRoot, true);
    }
}
