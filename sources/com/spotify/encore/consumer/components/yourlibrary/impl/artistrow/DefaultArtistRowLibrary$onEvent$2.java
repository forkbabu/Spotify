package com.spotify.encore.consumer.components.yourlibrary.impl.artistrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.artistrow.ArtistRowLibrary;

final class DefaultArtistRowLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultArtistRowLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(ArtistRowLibrary.Events.RowLongClicked);
        return true;
    }
}
