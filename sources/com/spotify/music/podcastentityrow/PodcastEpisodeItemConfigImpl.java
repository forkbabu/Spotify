package com.spotify.music.podcastentityrow;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;

public class PodcastEpisodeItemConfigImpl implements s, e {
    private final ExplicitContentFacade a;
    private b b = EmptyDisposable.INSTANCE;
    private boolean c;

    public PodcastEpisodeItemConfigImpl(ExplicitContentFacade explicitContentFacade, n nVar) {
        this.a = explicitContentFacade;
        nVar.A().a(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        d.d(this, nVar);
    }

    @Override // com.spotify.music.podcastentityrow.s
    public boolean a() {
        return this.c;
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        d.c(this, nVar);
    }

    @Override // com.spotify.music.podcastentityrow.s
    public void b(String str, String str2) {
        this.a.e(str, str2);
    }

    public /* synthetic */ void c(Boolean bool) {
        this.c = bool.booleanValue();
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        this.b.dispose();
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public void o0(n nVar) {
        this.b = this.a.c().subscribe(new c(this));
    }
}
