package com.spotify.encore.consumer.components.impl.searchintentcard;

import android.view.View;
import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;

final class DefaultSearchIntentCard$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultSearchIntentCard$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(SearchIntentCard.Events.CardClicked);
    }
}
