package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.widget.TextView;
import com.spotify.music.features.wrapped2020.stories.views.blobs.BlobView;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class GenrelustStory$blobLabelIntro$$inlined$apply$lambda$1 extends Lambda implements cmf<f> {
    final /* synthetic */ BlobView $blobView$inlined;
    final /* synthetic */ TextView $bottomLabel$inlined;
    final /* synthetic */ long $delay$inlined;
    final /* synthetic */ TextView $topLabel$inlined;
    final /* synthetic */ GenrelustStory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GenrelustStory$blobLabelIntro$$inlined$apply$lambda$1(GenrelustStory genrelustStory, long j, TextView textView, BlobView blobView, TextView textView2) {
        super(0);
        this.this$0 = genrelustStory;
        this.$delay$inlined = j;
        this.$bottomLabel$inlined = textView;
        this.$blobView$inlined = blobView;
        this.$topLabel$inlined = textView2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        GenrelustStory.k(this.this$0, this.$bottomLabel$inlined, (int) this.$blobView$inlined.getLabelMarginStart());
        GenrelustStory.k(this.this$0, this.$topLabel$inlined, (int) this.$blobView$inlined.getLabelMarginStart());
        return f.a;
    }
}
