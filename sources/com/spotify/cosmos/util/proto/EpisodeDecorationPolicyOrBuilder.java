package com.spotify.cosmos.util.proto;

import com.google.protobuf.u;
import com.google.protobuf.v;

public interface EpisodeDecorationPolicyOrBuilder extends v {
    boolean getAvailable();

    boolean getBackgroundable();

    boolean getCovers();

    @Override // com.google.protobuf.v
    /* synthetic */ u getDefaultInstanceForType();

    boolean getDescription();

    boolean getFreezeFrames();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    boolean getLanguage();

    boolean getLength();

    boolean getLink();

    boolean getManifestId();

    boolean getMediaTypeEnum();

    boolean getName();

    boolean getNumber();

    PodcastSegmentsPolicy getPodcastSegments();

    boolean getPreviewId();

    boolean getPreviewManifestId();

    boolean getPublishDate();

    boolean getType();

    boolean hasPodcastSegments();

    @Override // com.google.protobuf.v
    /* synthetic */ boolean isInitialized();
}
