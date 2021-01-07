package com.spotify.cosmos.util.proto;

import com.google.protobuf.u;
import com.google.protobuf.v;

public interface AlbumDecorationPolicyOrBuilder extends v {
    boolean getCopyrights();

    boolean getCovers();

    @Override // com.google.protobuf.v
    /* synthetic */ u getDefaultInstanceForType();

    boolean getIsPremiumOnly();

    boolean getLink();

    boolean getName();

    boolean getNumDiscs();

    boolean getNumTracks();

    boolean getPlayability();

    boolean getYear();

    @Override // com.google.protobuf.v
    /* synthetic */ boolean isInitialized();
}
