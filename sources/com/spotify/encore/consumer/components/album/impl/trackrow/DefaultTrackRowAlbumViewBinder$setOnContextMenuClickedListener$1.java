package com.spotify.encore.consumer.components.album.impl.trackrow;

import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class DefaultTrackRowAlbumViewBinder$setOnContextMenuClickedListener$1 extends Lambda implements nmf<f, f> {
    final /* synthetic */ nmf $consumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultTrackRowAlbumViewBinder$setOnContextMenuClickedListener$1(nmf nmf) {
        super(1);
        this.$consumer = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(f fVar) {
        invoke(fVar);
        return f.a;
    }

    public final void invoke(f fVar) {
        h.e(fVar, "it");
        this.$consumer.invoke(TrackRowAlbum.Events.ContextMenuClicked.INSTANCE);
    }
}