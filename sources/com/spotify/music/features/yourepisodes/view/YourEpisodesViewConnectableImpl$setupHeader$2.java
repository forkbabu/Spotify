package com.spotify.music.features.yourepisodes.view;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class YourEpisodesViewConnectableImpl$setupHeader$2 extends Lambda implements nmf<DownloadState, f> {
    final /* synthetic */ x this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesViewConnectableImpl$setupHeader$2(x xVar) {
        super(1);
        this.this$0 = xVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(DownloadState downloadState) {
        DownloadState downloadState2 = downloadState;
        h.e(downloadState2, "downloadState");
        if (downloadState2 instanceof DownloadState.Downloadable) {
            x.a(this.this$0);
        } else if (!(downloadState2 instanceof DownloadState.Downloaded) && !(downloadState2 instanceof DownloadState.Downloading)) {
            x.g(this.this$0);
        } else {
            x.f(this.this$0);
        }
        return f.a;
    }
}
