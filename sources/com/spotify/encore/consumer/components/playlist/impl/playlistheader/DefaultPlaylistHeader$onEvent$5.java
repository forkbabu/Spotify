package com.spotify.encore.consumer.components.playlist.impl.playlistheader;

import com.spotify.encore.consumer.components.playlist.api.playlistheader.PlaylistHeader;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class DefaultPlaylistHeader$onEvent$5 extends Lambda implements nmf<Boolean, f> {
    final /* synthetic */ nmf $consumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultPlaylistHeader$onEvent$5(nmf nmf) {
        super(1);
        this.$consumer = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return f.a;
    }

    public final void invoke(boolean z) {
        this.$consumer.invoke(PlaylistHeader.Events.HeartButtonClicked);
    }
}
