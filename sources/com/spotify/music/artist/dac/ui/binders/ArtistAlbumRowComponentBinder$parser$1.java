package com.spotify.music.artist.dac.ui.binders;

import com.google.protobuf.Any;
import com.spotify.music.artist.dac.proto.ArtistAlbumRowComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistAlbumRowComponentBinder$parser$1 extends Lambda implements nmf<Any, ArtistAlbumRowComponent> {
    public static final ArtistAlbumRowComponentBinder$parser$1 a = new ArtistAlbumRowComponentBinder$parser$1();

    ArtistAlbumRowComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public ArtistAlbumRowComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        return ArtistAlbumRowComponent.m(any2.l());
    }
}
