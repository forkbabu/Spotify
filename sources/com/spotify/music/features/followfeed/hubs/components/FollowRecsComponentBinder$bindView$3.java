package com.spotify.music.features.followfeed.hubs.components;

import defpackage.o25;
import java.util.Set;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class FollowRecsComponentBinder$bindView$3 extends Lambda implements nmf<Set<? extends Integer>, f> {
    final /* synthetic */ g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FollowRecsComponentBinder$bindView$3(g gVar) {
        super(1);
        this.this$0 = gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Set<? extends Integer> set) {
        Set<? extends Integer> set2 = set;
        h.e(set2, "visibleIndexes");
        this.this$0.b.a(new o25.p(set2));
        return f.a;
    }
}
