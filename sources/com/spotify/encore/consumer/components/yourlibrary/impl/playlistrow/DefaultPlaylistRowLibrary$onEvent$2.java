package com.spotify.encore.consumer.components.yourlibrary.impl.playlistrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistrow.PlaylistRowLibrary;

final class DefaultPlaylistRowLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultPlaylistRowLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(PlaylistRowLibrary.Events.RowLongClicked);
        return true;
    }
}
