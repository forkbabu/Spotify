package com.spotify.music.features.onboarding.di;

import com.spotify.music.follow.j;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class d<T> implements g<j> {
    final /* synthetic */ AllboardingFollowManagerImpl a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;

    d(AllboardingFollowManagerImpl allboardingFollowManagerImpl, String str, boolean z) {
        this.a = allboardingFollowManagerImpl;
        this.b = str;
        this.c = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(j jVar) {
        j jVar2 = jVar;
        h.e(jVar2, "followData");
        AllboardingFollowManagerImpl.b(this.a, this.b, this.c, jVar2);
    }
}
