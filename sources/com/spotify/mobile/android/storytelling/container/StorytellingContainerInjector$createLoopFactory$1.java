package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobius.e0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StorytellingContainerInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<tx1, rx1, e0<tx1, qx1>> {
    public static final StorytellingContainerInjector$createLoopFactory$1 a = new StorytellingContainerInjector$createLoopFactory$1();

    StorytellingContainerInjector$createLoopFactory$1() {
        super(2, sx1.class, "update", "update(Lcom/spotify/mobile/android/storytelling/container/domain/StorytellingContainerModel;Lcom/spotify/mobile/android/storytelling/container/domain/StorytellingContainerEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<tx1, qx1> invoke(tx1 tx1, rx1 rx1) {
        tx1 tx12 = tx1;
        rx1 rx12 = rx1;
        h.e(tx12, "p1");
        h.e(rx12, "p2");
        return sx1.b(tx12, rx12);
    }
}
