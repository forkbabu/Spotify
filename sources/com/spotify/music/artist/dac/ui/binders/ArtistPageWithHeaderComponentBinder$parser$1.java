package com.spotify.music.artist.dac.ui.binders;

import com.google.protobuf.Any;
import com.spotify.music.artist.dac.proto.ArtistPageWithHeaderComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageWithHeaderComponentBinder$parser$1 extends Lambda implements nmf<Any, ArtistPageWithHeaderComponent> {
    public static final ArtistPageWithHeaderComponentBinder$parser$1 a = new ArtistPageWithHeaderComponentBinder$parser$1();

    ArtistPageWithHeaderComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public ArtistPageWithHeaderComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        ArtistPageWithHeaderComponent l = ArtistPageWithHeaderComponent.l(any2.l());
        h.d(l, "ArtistPageWithHeaderComp…nt.parseFrom(proto.value)");
        return l;
    }
}
