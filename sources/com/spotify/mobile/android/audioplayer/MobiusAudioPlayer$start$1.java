package com.spotify.mobile.android.audioplayer;

import com.spotify.mobile.android.audioplayer.domain.c;
import com.spotify.mobile.android.audioplayer.domain.d;
import com.spotify.mobile.android.audioplayer.domain.e;
import com.spotify.mobile.android.audioplayer.domain.f;
import com.spotify.mobius.e0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class MobiusAudioPlayer$start$1 extends FunctionReferenceImpl implements rmf<f, d, e0<f, c>> {
    public static final MobiusAudioPlayer$start$1 a = new MobiusAudioPlayer$start$1();

    MobiusAudioPlayer$start$1() {
        super(2, e.class, "update", "update(Lcom/spotify/mobile/android/audioplayer/domain/AudioPlayerModel;Lcom/spotify/mobile/android/audioplayer/domain/AudioPlayerEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<f, c> invoke(f fVar, d dVar) {
        f fVar2 = fVar;
        d dVar2 = dVar;
        h.e(fVar2, "p1");
        h.e(dVar2, "p2");
        return e.d(fVar2, dVar2);
    }
}
