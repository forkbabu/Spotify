package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.storytelling.common.b;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class StorytellingContainerFragmentModule$StoriesLoadModule$provideStoryPreLoader$1 extends Lambda implements nmf<Integer, a> {
    final /* synthetic */ b $storiesProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StorytellingContainerFragmentModule$StoriesLoadModule$provideStoryPreLoader$1(b bVar) {
        super(1);
        this.$storiesProvider = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public a invoke(Integer num) {
        i iVar = new i(this.$storiesProvider.g(num.intValue()));
        h.d(iVar, "storiesProvider.retrieve…oryIndex).ignoreElement()");
        return iVar;
    }
}
