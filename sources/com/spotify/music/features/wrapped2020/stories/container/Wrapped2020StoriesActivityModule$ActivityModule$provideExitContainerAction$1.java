package com.spotify.music.features.wrapped2020.stories.container;

import android.app.Activity;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class Wrapped2020StoriesActivityModule$ActivityModule$provideExitContainerAction$1 extends Lambda implements cmf<f> {
    final /* synthetic */ Activity $activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Wrapped2020StoriesActivityModule$ActivityModule$provideExitContainerAction$1(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$activity.finish();
        return f.a;
    }
}
