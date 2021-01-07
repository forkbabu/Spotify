package com.spotify.encore.consumer.components.yourlibrary.impl.albumrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.albumrow.AlbumRowLibrary;

final class DefaultAlbumRowLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultAlbumRowLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(AlbumRowLibrary.Events.RowLongClicked);
        return true;
    }
}
