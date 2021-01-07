package com.spotify.connect.snacks;

import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class NewDevicesTransformer$apply$1 extends FunctionReferenceImpl implements nmf<List<? extends a>, f> {
    NewDevicesTransformer$apply$1(NewDevicesTransformer newDevicesTransformer) {
        super(1, newDevicesTransformer, NewDevicesTransformer.class, "saveEmission", "saveEmission(Ljava/util/List;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(List<? extends a> list) {
        List<? extends a> list2 = list;
        h.e(list2, "p1");
        NewDevicesTransformer.a((NewDevicesTransformer) this.receiver, list2);
        return f.a;
    }
}
