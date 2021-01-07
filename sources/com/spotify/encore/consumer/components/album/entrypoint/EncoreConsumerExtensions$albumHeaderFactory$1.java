package com.spotify.encore.consumer.components.album.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import com.spotify.encore.consumer.components.album.impl.header.DefaultAlbumHeader;
import com.spotify.encore.consumer.components.album.impl.header.MotionAlbumHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerExtensions$albumHeaderFactory$1 implements ComponentFactory<Component<AlbumHeader.Model, AlbumHeader.Events>, AlbumHeader.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headers $this_albumHeaderFactory;

    EncoreConsumerExtensions$albumHeaderFactory$1(EncoreConsumerEntryPoint.Headers headers) {
        this.$this_albumHeaderFactory = headers;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<AlbumHeader.Model, AlbumHeader.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public AlbumHeader make(AlbumHeader.Configuration configuration) {
        if (h.a(configuration, AlbumHeader.Configuration.MotionAlbumHeaderConfiguration.INSTANCE)) {
            return new MotionAlbumHeader(this.$this_albumHeaderFactory.getActivity(), this.$this_albumHeaderFactory.getPicasso());
        }
        if (h.a(configuration, AlbumHeader.Configuration.DefaultAlbumHeaderConfiguration.INSTANCE)) {
            return new DefaultAlbumHeader(this.$this_albumHeaderFactory.getActivity(), this.$this_albumHeaderFactory.getPicasso());
        }
        return new DefaultAlbumHeader(this.$this_albumHeaderFactory.getActivity(), this.$this_albumHeaderFactory.getPicasso());
    }
}
