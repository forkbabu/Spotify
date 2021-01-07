package com.spotify.mobile.android.storytelling.story;

import com.spotify.mobius.s;
import defpackage.uy1;
import defpackage.wy1;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class StoryInjector$createController$1 extends FunctionReferenceImpl implements nmf<yy1, s<yy1, uy1>> {
    public static final StoryInjector$createController$1 a = new StoryInjector$createController$1();

    StoryInjector$createController$1() {
        super(1, xy1.class, "init", "init(Lcom/spotify/mobile/android/storytelling/story/domain/StoryModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<yy1, uy1> invoke(yy1 yy1) {
        yy1 yy12 = yy1;
        h.e(yy12, "p1");
        h.e(yy12, "model");
        if (h.a(yy12.e(), wy1.c.a)) {
            s<yy1, uy1> b = s.b(yy12);
            h.d(b, "First.first(model)");
            return b;
        }
        s<yy1, uy1> c = s.c(yy1.a(yy12, 0, wy1.b.a, null, 5), d.G(new uy1.a(yy12.c())));
        h.d(c, "First.first(model.copy(s…Story(model.storyIndex)))");
        return c;
    }
}
