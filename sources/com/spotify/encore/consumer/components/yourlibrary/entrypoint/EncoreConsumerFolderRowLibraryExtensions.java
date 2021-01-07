package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.folderrow.FolderRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerFolderRowLibraryExtensions {
    public static final ComponentFactory<Component<FolderRowLibrary.Model, FolderRowLibrary.Events>, FolderRowLibrary.Configuration> folderRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$folderRowLibraryFactory");
        return new EncoreConsumerFolderRowLibraryExtensions$folderRowLibraryFactory$1(rows);
    }
}
