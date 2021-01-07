package com.spotify.music.features.yourepisodes.view;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class l<T> implements g<Boolean> {
    final /* synthetic */ YourEpisodesDownloadListenerImpl a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int f;

    l(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        this.a = yourEpisodesDownloadListenerImpl;
        this.b = str;
        this.c = str2;
        this.f = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Boolean bool) {
        Boolean bool2 = bool;
        h.d(bool2, "canDownload");
        if (bool2.booleanValue()) {
            YourEpisodesDownloadListenerImpl.b(this.a, this.b, this.c, this.f);
        } else {
            YourEpisodesDownloadListenerImpl.g(this.a);
        }
    }
}
