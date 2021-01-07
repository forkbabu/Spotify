package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class QuizStory$quizPageAnimation$$inlined$apply$lambda$2 extends Lambda implements cmf<f> {
    final /* synthetic */ QuizStory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuizStory$quizPageAnimation$$inlined$apply$lambda$2(QuizStory quizStory) {
        super(0);
        this.this$0 = quizStory;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        i m = QuizStory.m(this.this$0);
        if (m != null) {
            for (T t : m.b()) {
                this.this$0.getClass();
                t.setClickable(true);
                t.setFocusable(true);
                t.C();
            }
        }
        return f.a;
    }
}
