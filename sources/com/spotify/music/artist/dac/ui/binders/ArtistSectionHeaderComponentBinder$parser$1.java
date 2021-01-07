package com.spotify.music.artist.dac.ui.binders;

import com.google.protobuf.Any;
import com.spotify.music.artist.dac.proto.ArtistSectionHeaderComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistSectionHeaderComponentBinder$parser$1 extends Lambda implements nmf<Any, ArtistSectionHeaderComponent> {
    public static final ArtistSectionHeaderComponentBinder$parser$1 a = new ArtistSectionHeaderComponentBinder$parser$1();

    ArtistSectionHeaderComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public ArtistSectionHeaderComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        return ArtistSectionHeaderComponent.i(any2.l());
    }
}
