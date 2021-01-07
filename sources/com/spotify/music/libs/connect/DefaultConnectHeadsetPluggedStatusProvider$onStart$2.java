package com.spotify.music.libs.connect;

import io.reactivex.subjects.a;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DefaultConnectHeadsetPluggedStatusProvider$onStart$2 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    DefaultConnectHeadsetPluggedStatusProvider$onStart$2(a aVar) {
        super(1, aVar, a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "p1");
        ((a) this.receiver).onNext(bool2);
        return f.a;
    }
}
