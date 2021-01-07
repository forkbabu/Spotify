package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobius.s;
import defpackage.px1;
import defpackage.qx1;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StorytellingContainerInjector$createController$1 extends FunctionReferenceImpl implements nmf<tx1, s<tx1, qx1>> {
    public static final StorytellingContainerInjector$createController$1 a = new StorytellingContainerInjector$createController$1();

    StorytellingContainerInjector$createController$1() {
        super(1, sx1.class, "init", "init(Lcom/spotify/mobile/android/storytelling/container/domain/StorytellingContainerModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<tx1, qx1> invoke(tx1 tx1) {
        tx1 tx12 = tx1;
        h.e(tx12, "p1");
        h.e(tx12, "model");
        if (h.a(tx12.f(), px1.b.a)) {
            s<tx1, qx1> c = s.c(tx12, d.G(qx1.b.a));
            h.d(c, "first(model, setOf(LoadStories))");
            return c;
        }
        s<tx1, qx1> b = s.b(tx12);
        h.d(b, "first(model)");
        return b;
    }
}
