package com.spotify.android.dac.engine.view.binders.containers.list;

import com.google.protobuf.Any;
import com.spotify.dac.api.components.proto.HorizontalListComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class HorizontalListComponentBinder$parser$1 extends Lambda implements nmf<Any, HorizontalListComponent> {
    public static final HorizontalListComponentBinder$parser$1 a = new HorizontalListComponentBinder$parser$1();

    HorizontalListComponentBinder$parser$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public HorizontalListComponent invoke(Any any) {
        Any any2 = any;
        h.e(any2, "proto");
        return HorizontalListComponent.i(any2.l());
    }
}
