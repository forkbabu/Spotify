package com.spotify.music.libs.podcast.download;

import com.spotify.music.libs.podcast.download.a0;
import com.spotify.playlist.models.offline.a;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ DownloadDialogLifecycleAwareUtil a;
    public final /* synthetic */ a b;
    public final /* synthetic */ a0.a c;
    public final /* synthetic */ a0.b f;

    public /* synthetic */ b(DownloadDialogLifecycleAwareUtil downloadDialogLifecycleAwareUtil, a aVar, a0.a aVar2, a0.b bVar) {
        this.a = downloadDialogLifecycleAwareUtil;
        this.b = aVar;
        this.c = aVar2;
        this.f = bVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, this.c, this.f, (c0) obj);
    }
}
