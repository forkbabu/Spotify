package com.spotify.encore.consumer.components.home.impl.likedsongscard;

import android.view.View;
import com.spotify.encore.consumer.components.home.api.likedsongscard.LikedSongsCardHome;

final class DefaultLikedSongsCardHome$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultLikedSongsCardHome$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(LikedSongsCardHome.Events.CardClicked);
    }
}
