package com.spotify.encore.consumer.components.yourlibrary.impl.likedsongsrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow.LikedSongsRowLibrary;

final class DefaultLikedSongsRowLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultLikedSongsRowLibrary$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(LikedSongsRowLibrary.Events.DismissClicked);
    }
}
