package com.spotify.encore.consumer.components.yourlibrary.impl.likedsongscard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongscard.LikedSongsCardLibrary;

final class DefaultLikedSongsCardLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultLikedSongsCardLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(LikedSongsCardLibrary.Events.CardClicked);
    }
}
