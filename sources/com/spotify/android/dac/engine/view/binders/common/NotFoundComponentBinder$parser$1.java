package com.spotify.android.dac.engine.view.binders.common;

import com.google.protobuf.Any;
import com.spotify.dac.api.components.proto.NotFoundComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class NotFoundComponentBinder$parser$1 extends Lambda implements nmf<Any, NotFoundComponent> {
    public static final NotFoundComponentBinder$parser$1 a = new NotFoundComponentBinder$parser$1();

    NotFoundComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public NotFoundComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        NotFoundComponent.b l = NotFoundComponent.l();
        l.m(any2.i());
        return (NotFoundComponent) l.build();
    }
}
