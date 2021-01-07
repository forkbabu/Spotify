package com.spotify.encore.consumer.components.yourlibrary.impl.folderrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.folderrow.FolderRowLibrary;

final class DefaultFolderRowLibrary$onEvent$2 implements View.OnLongClickListener {
    final /* synthetic */ nmf $event;

    DefaultFolderRowLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$event.invoke(FolderRowLibrary.Events.RowLongClicked);
        return true;
    }
}
