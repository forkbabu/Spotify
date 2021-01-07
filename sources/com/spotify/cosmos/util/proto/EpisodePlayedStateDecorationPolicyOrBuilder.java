package com.spotify.cosmos.util.proto;

import com.google.protobuf.u;
import com.google.protobuf.v;

public interface EpisodePlayedStateDecorationPolicyOrBuilder extends v {
    @Override // com.google.protobuf.v
    /* synthetic */ u getDefaultInstanceForType();

    boolean getIsPlayed();

    boolean getPlayabilityRestriction();

    boolean getPlayable();

    boolean getTimeLeft();

    @Override // com.google.protobuf.v
    /* synthetic */ boolean isInitialized();
}
