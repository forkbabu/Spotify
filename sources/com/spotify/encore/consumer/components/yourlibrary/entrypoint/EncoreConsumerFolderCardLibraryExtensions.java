package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.foldercard.FolderCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerFolderCardLibraryExtensions {
    public static final ComponentFactory<Component<FolderCardLibrary.Model, FolderCardLibrary.Events>, FolderCardLibrary.Configuration> folderCardLibraryFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$folderCardLibraryFactory");
        return new EncoreConsumerFolderCardLibraryExtensions$folderCardLibraryFactory$1(cards);
    }
}
