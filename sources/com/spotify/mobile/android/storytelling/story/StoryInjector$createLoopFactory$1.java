package com.spotify.mobile.android.storytelling.story;

import com.spotify.mobius.e0;
import defpackage.uy1;
import defpackage.vy1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StoryInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<yy1, vy1, e0<yy1, uy1>> {
    public static final StoryInjector$createLoopFactory$1 a = new StoryInjector$createLoopFactory$1();

    StoryInjector$createLoopFactory$1() {
        super(2, xy1.class, "update", "update(Lcom/spotify/mobile/android/storytelling/story/domain/StoryModel;Lcom/spotify/mobile/android/storytelling/story/domain/StoryEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<yy1, uy1> invoke(yy1 yy1, vy1 vy1) {
        yy1 yy12 = yy1;
        vy1 vy12 = vy1;
        h.e(yy12, "p1");
        h.e(vy12, "p2");
        h.e(yy12, "model");
        h.e(vy12, "event");
        if (vy12 instanceof vy1.a) {
            e0<yy1, uy1> a2 = e0.a(d.H(new uy1.a(yy12.c()), uy1.b.a));
            h.d(a2, "dispatch(setOf(LoadStory…l.storyIndex), LogRetry))");
            return a2;
        } else if (vy12 instanceof vy1.c) {
            e0<yy1, uy1> f = e0.f(yy1.a(yy12, 0, ((vy1.c) vy12).a(), null, 5));
            h.d(f, "next(model.copy(storyLoa…= event.storyLoadStatus))");
            return f;
        } else if (vy12 instanceof vy1.b) {
            e0<yy1, uy1> f2 = e0.f(yy1.a(yy12, 0, null, ((vy1.b) vy12).a(), 3));
            h.d(f2, "next(model.copy(pauseState = event.pauseState))");
            return f2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
