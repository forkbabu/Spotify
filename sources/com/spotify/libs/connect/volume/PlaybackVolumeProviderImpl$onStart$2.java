package com.spotify.libs.connect.volume;

import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class PlaybackVolumeProviderImpl$onStart$2 extends FunctionReferenceImpl implements nmf<Float, Boolean> {
    PlaybackVolumeProviderImpl$onStart$2(PlaybackVolumeProviderImpl playbackVolumeProviderImpl) {
        super(1, playbackVolumeProviderImpl, PlaybackVolumeProviderImpl.class, "filterInvalidVolume", "filterInvalidVolume(F)Z", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(Float f) {
        return Boolean.valueOf(PlaybackVolumeProviderImpl.c((PlaybackVolumeProviderImpl) this.receiver, f.floatValue()));
    }
}
