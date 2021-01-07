package com.spotify.libs.connect.providers;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.subjects.a;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ActiveDeviceProviderImpl$onStart$2 extends FunctionReferenceImpl implements nmf<Optional<GaiaDevice>, f> {
    ActiveDeviceProviderImpl$onStart$2(a aVar) {
        super(1, aVar, a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Optional<GaiaDevice> optional) {
        Optional<GaiaDevice> optional2 = optional;
        h.e(optional2, "p1");
        ((a) this.receiver).onNext(optional2);
        return f.a;
    }
}
