package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.foldercard.FolderCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.foldercard.DefaultFolderCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerFolderCardLibraryExtensions$folderCardLibraryFactory$1 implements ComponentFactory<Component<FolderCardLibrary.Model, FolderCardLibrary.Events>, FolderCardLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_folderCardLibraryFactory;

    EncoreConsumerFolderCardLibraryExtensions$folderCardLibraryFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_folderCardLibraryFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<FolderCardLibrary.Model, FolderCardLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultFolderCardLibrary make(FolderCardLibrary.Configuration configuration) {
        return new DefaultFolderCardLibrary(this.$this_folderCardLibraryFactory.getActivity(), this.$this_folderCardLibraryFactory.getPicasso());
    }
}
