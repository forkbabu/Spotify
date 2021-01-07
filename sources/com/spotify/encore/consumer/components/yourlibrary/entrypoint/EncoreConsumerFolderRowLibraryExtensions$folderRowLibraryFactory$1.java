package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.folderrow.FolderRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.folderrow.DefaultFolderRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerFolderRowLibraryExtensions$folderRowLibraryFactory$1 implements ComponentFactory<Component<FolderRowLibrary.Model, FolderRowLibrary.Events>, FolderRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_folderRowLibraryFactory;

    EncoreConsumerFolderRowLibraryExtensions$folderRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_folderRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<FolderRowLibrary.Model, FolderRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultFolderRowLibrary make(FolderRowLibrary.Configuration configuration) {
        return new DefaultFolderRowLibrary(this.$this_folderRowLibraryFactory.getActivity(), this.$this_folderRowLibraryFactory.getPicasso());
    }
}
