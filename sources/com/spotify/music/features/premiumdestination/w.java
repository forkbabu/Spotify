package com.spotify.music.features.premiumdestination;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.model.Period;
import io.reactivex.s;
import io.reactivex.z;

public final class w implements fjf<s<Offer>> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final w a = new w();
    }

    public static w a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        s P = z.z(Offer.create(false, Period.create("-", 0, "day"), null, "premium")).P();
        yif.g(P, "Cannot return null from a non-@Nullable @Provides method");
        return P;
    }
}
