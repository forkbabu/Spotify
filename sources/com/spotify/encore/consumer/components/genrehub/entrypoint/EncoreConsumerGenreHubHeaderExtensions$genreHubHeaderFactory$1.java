package com.spotify.encore.consumer.components.genrehub.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.genrehub.api.genrehubheader.GenreHubHeader;
import com.spotify.encore.consumer.components.genrehub.impl.genrehubheader.DefaultGenreHubHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerGenreHubHeaderExtensions$genreHubHeaderFactory$1 implements ComponentFactory<Component<GenreHubHeader.Model, GenreHubHeader.Events>, GenreHubHeader.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headers $this_genreHubHeaderFactory;

    EncoreConsumerGenreHubHeaderExtensions$genreHubHeaderFactory$1(EncoreConsumerEntryPoint.Headers headers) {
        this.$this_genreHubHeaderFactory = headers;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<GenreHubHeader.Model, GenreHubHeader.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultGenreHubHeader make(GenreHubHeader.Configuration configuration) {
        return new DefaultGenreHubHeader(this.$this_genreHubHeaderFactory.getActivity());
    }
}
