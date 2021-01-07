package com.spotify.libs.connect.providers;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.subjects.a;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DevicesListProviderImpl$onStart$1 extends FunctionReferenceImpl implements nmf<List<? extends GaiaDevice>, f> {
    DevicesListProviderImpl$onStart$1(a aVar) {
        super(1, aVar, a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(List<? extends GaiaDevice> list) {
        List<? extends GaiaDevice> list2 = list;
        h.e(list2, "p1");
        ((a) this.receiver).onNext(list2);
        return f.a;
    }
}
