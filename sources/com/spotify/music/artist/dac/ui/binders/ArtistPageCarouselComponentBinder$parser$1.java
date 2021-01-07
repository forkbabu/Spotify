package com.spotify.music.artist.dac.ui.binders;

import com.google.protobuf.Any;
import com.spotify.music.artist.dac.proto.ArtistPageCarouselComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageCarouselComponentBinder$parser$1 extends Lambda implements nmf<Any, ArtistPageCarouselComponent> {
    public static final ArtistPageCarouselComponentBinder$parser$1 a = new ArtistPageCarouselComponentBinder$parser$1();

    ArtistPageCarouselComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public ArtistPageCarouselComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        ArtistPageCarouselComponent l = ArtistPageCarouselComponent.l(any2.l());
        h.d(l, "ArtistPageCarouselComponent.parseFrom(proto.value)");
        return l;
    }
}
