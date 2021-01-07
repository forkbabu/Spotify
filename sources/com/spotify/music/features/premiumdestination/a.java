package com.spotify.music.features.premiumdestination;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.C0707R;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(((Offer) obj).adTargetingKey())) {
            return Integer.valueOf((int) C0707R.raw.premium_page_hubs_30dt);
        }
        return Integer.valueOf((int) C0707R.raw.premium_page_hubs);
    }
}
