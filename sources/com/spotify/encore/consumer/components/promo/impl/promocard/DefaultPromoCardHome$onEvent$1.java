package com.spotify.encore.consumer.components.promo.impl.promocard;

import android.view.View;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;

final class DefaultPromoCardHome$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultPromoCardHome$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(PromoCardHome.Events.CardClicked);
    }
}
