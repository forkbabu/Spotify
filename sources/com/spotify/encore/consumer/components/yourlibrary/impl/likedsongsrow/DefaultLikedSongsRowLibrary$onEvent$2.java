package com.spotify.encore.consumer.components.yourlibrary.impl.likedsongsrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow.LikedSongsRowLibrary;

final class DefaultLikedSongsRowLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultLikedSongsRowLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(LikedSongsRowLibrary.Events.RowLongClicked);
        return true;
    }
}
