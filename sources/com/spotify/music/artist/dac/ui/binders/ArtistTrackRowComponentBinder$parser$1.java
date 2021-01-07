package com.spotify.music.artist.dac.ui.binders;

import com.google.protobuf.Any;
import com.spotify.music.artist.dac.proto.ArtistTrackRowComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistTrackRowComponentBinder$parser$1 extends Lambda implements nmf<Any, ArtistTrackRowComponent> {
    public static final ArtistTrackRowComponentBinder$parser$1 a = new ArtistTrackRowComponentBinder$parser$1();

    ArtistTrackRowComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public ArtistTrackRowComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        return ArtistTrackRowComponent.p(any2.l());
    }
}
