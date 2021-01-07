package com.spotify.cosmos.util.proto;

import com.google.protobuf.u;
import com.google.protobuf.v;

public interface PodcastSegmentsPolicyOrBuilder extends v {
    boolean getAlbumMosaicUri();

    boolean getArtists();

    boolean getCanUpsell();

    @Override // com.google.protobuf.v
    /* synthetic */ u getDefaultInstanceForType();

    boolean getEmbeddedSegments();

    boolean getPlaybackSegments();

    @Override // com.google.protobuf.v
    /* synthetic */ boolean isInitialized();
}
