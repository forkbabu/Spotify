package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.animation.AnimatorSet;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class GenrelustStory$topFiveIntroAnimation$$inlined$apply$lambda$1 extends Lambda implements cmf<f> {
    final /* synthetic */ g $this_apply$inlined;
    final /* synthetic */ AnimatorSet $this_apply$inlined$1;
    final /* synthetic */ GenrelustStory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GenrelustStory$topFiveIntroAnimation$$inlined$apply$lambda$1(g gVar, AnimatorSet animatorSet, GenrelustStory genrelustStory) {
        super(0);
        this.$this_apply$inlined = gVar;
        this.$this_apply$inlined$1 = animatorSet;
        this.this$0 = genrelustStory;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$this_apply$inlined.u().setTranslationY((((float) this.$this_apply$inlined.a().getHeight()) / 2.0f) - ((float) this.$this_apply$inlined.u().getTop()));
        return f.a;
    }
}
