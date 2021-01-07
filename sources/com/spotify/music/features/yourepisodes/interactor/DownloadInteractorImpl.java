package com.spotify.music.features.yourepisodes.interactor;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import io.reactivex.disposables.a;
import kotlin.jvm.internal.h;

public final class DownloadInteractorImpl implements a, m {
    private final a a = new a();
    private final ih0 b;

    public DownloadInteractorImpl(n nVar, ih0 ih0) {
        h.e(nVar, "lifecycleOwner");
        h.e(ih0, "listenLaterEndpoint");
        this.b = ih0;
        nVar.A().a(this);
    }

    @Override // com.spotify.music.features.yourepisodes.interactor.a
    public void a() {
        this.a.b(this.b.a().subscribe());
    }

    @Override // com.spotify.music.features.yourepisodes.interactor.a
    public void b() {
        this.a.b(this.b.b().subscribe());
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void disposeSubscriptions() {
        this.a.dispose();
    }
}
