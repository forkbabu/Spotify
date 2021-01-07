package com.spotify.encore.consumer.components.yourlibrary.impl.foldercard;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.foldercard.FolderCardLibrary;

final class DefaultFolderCardLibrary$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultFolderCardLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(FolderCardLibrary.Events.CardClicked);
    }
}
