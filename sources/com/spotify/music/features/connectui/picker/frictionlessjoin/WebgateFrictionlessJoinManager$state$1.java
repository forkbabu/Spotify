package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.music.sociallistening.models.b;
import io.reactivex.subjects.a;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class WebgateFrictionlessJoinManager$state$1 extends FunctionReferenceImpl implements nmf<b, f> {
    WebgateFrictionlessJoinManager$state$1(a aVar) {
        super(1, aVar, a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(b bVar) {
        b bVar2 = bVar;
        h.e(bVar2, "p1");
        ((a) this.receiver).onNext(bVar2);
        return f.a;
    }
}
