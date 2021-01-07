package com.spotify.music.artist.dac.ui.binders;

import com.google.protobuf.Any;
import com.spotify.music.artist.dac.proto.ArtistHeaderComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistHeaderComponentBinder$parser$1 extends Lambda implements nmf<Any, ArtistHeaderComponent> {
    public static final ArtistHeaderComponentBinder$parser$1 a = new ArtistHeaderComponentBinder$parser$1();

    ArtistHeaderComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public ArtistHeaderComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        ArtistHeaderComponent n = ArtistHeaderComponent.n(any2.l());
        h.d(n, "ArtistHeaderComponent.parseFrom(proto.value)");
        return n;
    }
}
