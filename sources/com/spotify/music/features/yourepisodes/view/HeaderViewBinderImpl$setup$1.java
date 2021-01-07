package com.spotify.music.features.yourepisodes.view;

import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class HeaderViewBinderImpl$setup$1 extends Lambda implements nmf<YourEpisodesHeader.Events, f> {
    final /* synthetic */ cmf $onBackButtonClicked;
    final /* synthetic */ nmf $onDownloadClicked;
    final /* synthetic */ nmf $onPlayClicked;
    final /* synthetic */ HeaderViewBinderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HeaderViewBinderImpl$setup$1(HeaderViewBinderImpl headerViewBinderImpl, nmf nmf, nmf nmf2, cmf cmf) {
        super(1);
        this.this$0 = headerViewBinderImpl;
        this.$onPlayClicked = nmf;
        this.$onDownloadClicked = nmf2;
        this.$onBackButtonClicked = cmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(YourEpisodesHeader.Events events) {
        YourEpisodesHeader.Events events2 = events;
        h.e(events2, "events");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            this.$onBackButtonClicked.invoke();
        } else if (ordinal == 1) {
            this.$onPlayClicked.invoke(HeaderViewBinderImpl.e(this.this$0));
        } else if (ordinal == 2) {
            this.$onDownloadClicked.invoke(HeaderViewBinderImpl.d(this.this$0));
        }
        return f.a;
    }
}
