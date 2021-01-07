package com.spotify.android.dac.engine.view.binders.containers.list;

import com.google.protobuf.Any;
import com.spotify.dac.api.components.proto.VerticalListComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class VerticalListComponentBinder$parser$1 extends Lambda implements nmf<Any, VerticalListComponent> {
    public static final VerticalListComponentBinder$parser$1 a = new VerticalListComponentBinder$parser$1();

    VerticalListComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public VerticalListComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        return VerticalListComponent.i(any2.l());
    }
}
