package com.spotify.music.libs.connect.applicationstate;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import io.reactivex.subjects.a;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DefaultApplicationStateProvider$onStart$2 extends FunctionReferenceImpl implements nmf<ConnectVolumeControlInstrumentation.ApplicationState, f> {
    DefaultApplicationStateProvider$onStart$2(a aVar) {
        super(1, aVar, a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ConnectVolumeControlInstrumentation.ApplicationState applicationState) {
        ConnectVolumeControlInstrumentation.ApplicationState applicationState2 = applicationState;
        h.e(applicationState2, "p1");
        ((a) this.receiver).onNext(applicationState2);
        return f.a;
    }
}
