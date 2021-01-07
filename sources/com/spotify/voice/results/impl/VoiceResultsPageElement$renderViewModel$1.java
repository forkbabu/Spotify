package com.spotify.voice.results.impl;

import com.spotify.voice.results.impl.h;
import com.spotify.voice.results.model.e;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class VoiceResultsPageElement$renderViewModel$1 extends FunctionReferenceImpl implements rmf<e.a, Integer, f> {
    VoiceResultsPageElement$renderViewModel$1(h.a aVar) {
        super(2, aVar, h.a.class, "onResultClicked", "onResultClicked(Lcom/spotify/voice/results/model/ResultsPageModel$Result;I)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(e.a aVar, Integer num) {
        e.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.h.e(aVar2, "p1");
        ((h.a) this.receiver).a(aVar2, intValue);
        return f.a;
    }
}
