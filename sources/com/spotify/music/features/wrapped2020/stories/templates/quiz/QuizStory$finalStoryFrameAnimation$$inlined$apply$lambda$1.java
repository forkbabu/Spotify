package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.animation.AnimatorSet;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class QuizStory$finalStoryFrameAnimation$$inlined$apply$lambda$1 extends Lambda implements cmf<f> {
    final /* synthetic */ long $delay$inlined;
    final /* synthetic */ AnimatorSet $this_apply$inlined;
    final /* synthetic */ QuizStory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuizStory$finalStoryFrameAnimation$$inlined$apply$lambda$1(AnimatorSet animatorSet, QuizStory quizStory, long j) {
        super(0);
        this.$this_apply$inlined = animatorSet;
        this.this$0 = quizStory;
        this.$delay$inlined = j;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        QuizStory.n(this.this$0);
        return f.a;
    }
}
