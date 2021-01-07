package com.spotify.encore.consumer.components.home.impl.homecard;

import android.view.View;
import com.spotify.encore.consumer.components.home.api.homecard.HomeCard;

final class DefaultHomeCard$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultHomeCard$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(HomeCard.Events.CardClicked);
    }
}
