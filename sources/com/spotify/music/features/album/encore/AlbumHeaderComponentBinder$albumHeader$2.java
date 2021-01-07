package com.spotify.music.features.album.encore;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import kotlin.jvm.internal.Lambda;

final class AlbumHeaderComponentBinder$albumHeader$2 extends Lambda implements cmf<Component<AlbumHeader.Model, AlbumHeader.Events>> {
    final /* synthetic */ AlbumHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlbumHeaderComponentBinder$albumHeader$2(AlbumHeaderComponentBinder albumHeaderComponentBinder) {
        super(0);
        this.this$0 = albumHeaderComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Component<AlbumHeader.Model, AlbumHeader.Events> invoke() {
        return (Component) AlbumHeaderComponentBinder.a(this.this$0).get();
    }
}
