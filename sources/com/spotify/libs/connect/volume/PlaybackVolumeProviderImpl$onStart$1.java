package com.spotify.libs.connect.volume;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlaybackVolumeProviderImpl$onStart$1 extends FunctionReferenceImpl implements nmf<VolumeState, Float> {
    PlaybackVolumeProviderImpl$onStart$1(PlaybackVolumeProviderImpl playbackVolumeProviderImpl) {
        super(1, playbackVolumeProviderImpl, PlaybackVolumeProviderImpl.class, "overwriteVolumeWhenNotRemoteDevice", "overwriteVolumeWhenNotRemoteDevice(Lcom/spotify/libs/connect/volume/VolumeState;)F", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Float invoke(VolumeState volumeState) {
        VolumeState volumeState2 = volumeState;
        h.e(volumeState2, "p1");
        return Float.valueOf(PlaybackVolumeProviderImpl.f((PlaybackVolumeProviderImpl) this.receiver, volumeState2));
    }
}
