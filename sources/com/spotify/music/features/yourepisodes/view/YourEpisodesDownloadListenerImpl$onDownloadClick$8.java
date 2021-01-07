package com.spotify.music.features.yourepisodes.view;

import com.spotify.playlist.models.offline.a;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class YourEpisodesDownloadListenerImpl$onDownloadClick$8 extends Lambda implements nmf<a.g, f> {
    final /* synthetic */ String $episodeUri;
    final /* synthetic */ int $index;
    final /* synthetic */ String $sectionName;
    final /* synthetic */ YourEpisodesDownloadListenerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesDownloadListenerImpl$onDownloadClick$8(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        super(1);
        this.this$0 = yourEpisodesDownloadListenerImpl;
        this.$episodeUri = str;
        this.$sectionName = str2;
        this.$index = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(a.g gVar) {
        h.e(gVar, "it");
        YourEpisodesDownloadListenerImpl.j(this.this$0, this.$episodeUri, this.$sectionName, this.$index);
        return f.a;
    }
}
