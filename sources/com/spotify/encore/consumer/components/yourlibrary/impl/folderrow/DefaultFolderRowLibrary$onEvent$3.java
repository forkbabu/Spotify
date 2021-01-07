package com.spotify.encore.consumer.components.yourlibrary.impl.folderrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.folderrow.FolderRowLibrary;

final class DefaultFolderRowLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultFolderRowLibrary$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(FolderRowLibrary.Events.DismissClicked);
    }
}
