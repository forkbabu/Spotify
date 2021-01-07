package com.spotify.encore.consumer.components.yourlibrary.impl.foldercard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.foldercard.FolderCardLibrary;

final class DefaultFolderCardLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultFolderCardLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(FolderCardLibrary.Events.CardLongClicked);
        return true;
    }
}
