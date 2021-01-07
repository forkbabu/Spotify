package com.spotify.music.features.yourepisodes.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.mobius.h;
import com.spotify.music.features.yourepisodes.domain.e;
import com.spotify.music.features.yourepisodes.domain.j;
import com.spotify.music.features.yourepisodes.domain.l;
import com.spotify.music.libs.podcast.download.g0;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.p;
import io.reactivex.y;

public final class YourEpisodesDownloadListenerImpl implements e, qsc {
    private final p a = new p();
    private DownloadState b;
    private final tsc c;
    private final g0 f;
    private final y n;
    private final t o;
    private final com.spotify.music.features.yourepisodes.interactor.a p;
    private final m8a q;
    private final com.spotify.music.libs.podcast.download.y r;

    public static final class a implements h<l> {
        final /* synthetic */ YourEpisodesDownloadListenerImpl a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl) {
            this.a = yourEpisodesDownloadListenerImpl;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            l lVar = (l) obj;
            kotlin.jvm.internal.h.e(lVar, "model");
            this.a.b = lVar.e() instanceof e.a ? ((e.a) lVar.e()).c() : DownloadState.None.INSTANCE;
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public YourEpisodesDownloadListenerImpl(n nVar, tsc tsc, g0 g0Var, y yVar, t tVar, com.spotify.music.features.yourepisodes.interactor.a aVar, m8a m8a, com.spotify.music.libs.podcast.download.y yVar2) {
        kotlin.jvm.internal.h.e(nVar, "lifecycleOwner");
        kotlin.jvm.internal.h.e(tsc, "interactionLogger");
        kotlin.jvm.internal.h.e(g0Var, "rxDownloadOverCellularState");
        kotlin.jvm.internal.h.e(yVar, "mainThreadScheduler");
        kotlin.jvm.internal.h.e(tVar, "navigator");
        kotlin.jvm.internal.h.e(aVar, "downloadAllEpisodesInteractor");
        kotlin.jvm.internal.h.e(m8a, "downloadEpisodeInteractor");
        kotlin.jvm.internal.h.e(yVar2, "downloadDialogProvider");
        this.c = tsc;
        this.f = g0Var;
        this.n = yVar;
        this.o = tVar;
        this.p = aVar;
        this.q = m8a;
        this.r = yVar2;
        nVar.A().a(this);
    }

    public static final void b(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        yourEpisodesDownloadListenerImpl.c.i(str, str2, i);
        yourEpisodesDownloadListenerImpl.q.a(str);
    }

    public static final void d(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        yourEpisodesDownloadListenerImpl.c.f(str, str2, i);
        yourEpisodesDownloadListenerImpl.q.b(str);
        yourEpisodesDownloadListenerImpl.p.b();
    }

    public static final void e(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        yourEpisodesDownloadListenerImpl.c.f(str, str2, i);
        yourEpisodesDownloadListenerImpl.q.b(str);
    }

    public static final void g(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl) {
        yourEpisodesDownloadListenerImpl.r.b(new f(yourEpisodesDownloadListenerImpl), g.a).a();
    }

    public static final void h(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        DownloadState downloadState = yourEpisodesDownloadListenerImpl.b;
        if (downloadState == null) {
            kotlin.jvm.internal.h.k("contextDownloadState");
            throw null;
        } else if (downloadState instanceof DownloadState.Downloadable) {
            yourEpisodesDownloadListenerImpl.r.c(new j(yourEpisodesDownloadListenerImpl, str, str2, i), k.a).a();
        } else if (!(downloadState instanceof DownloadState.Downloaded) && !(downloadState instanceof DownloadState.Downloading)) {
            yourEpisodesDownloadListenerImpl.c.f(str, str2, i);
            yourEpisodesDownloadListenerImpl.q.b(str);
            yourEpisodesDownloadListenerImpl.p.b();
        } else {
            yourEpisodesDownloadListenerImpl.r.e(new h(yourEpisodesDownloadListenerImpl, str, str2, i), i.a).a();
        }
    }

    public static final void i(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        yourEpisodesDownloadListenerImpl.a.b(yourEpisodesDownloadListenerImpl.f.a().o0(yourEpisodesDownloadListenerImpl.n).subscribe(new l(yourEpisodesDownloadListenerImpl, str, str2, i)));
    }

    public static final void j(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        DownloadState downloadState = yourEpisodesDownloadListenerImpl.b;
        if (downloadState == null) {
            kotlin.jvm.internal.h.k("contextDownloadState");
            throw null;
        } else if (downloadState instanceof DownloadState.Downloadable) {
            yourEpisodesDownloadListenerImpl.c.f(str, str2, i);
            yourEpisodesDownloadListenerImpl.q.b(str);
        } else if (!(downloadState instanceof DownloadState.Downloaded) && !(downloadState instanceof DownloadState.Downloading)) {
            yourEpisodesDownloadListenerImpl.c.f(str, str2, i);
            yourEpisodesDownloadListenerImpl.q.b(str);
            yourEpisodesDownloadListenerImpl.p.b();
        } else {
            yourEpisodesDownloadListenerImpl.r.e(new h(yourEpisodesDownloadListenerImpl, str, str2, i), i.a).a();
        }
    }

    @Override // defpackage.qsc
    public void a(String str, com.spotify.playlist.models.offline.a aVar, String str2, int i) {
        kotlin.jvm.internal.h.e(str, "episodeUri");
        kotlin.jvm.internal.h.e(aVar, "offlineState");
        kotlin.jvm.internal.h.e(str2, "sectionName");
        aVar.b(new YourEpisodesDownloadListenerImpl$onDownloadClick$1(this, str, str2, i), new YourEpisodesDownloadListenerImpl$onDownloadClick$2(this, str, str2, i), new YourEpisodesDownloadListenerImpl$onDownloadClick$3(this, str, str2, i), new YourEpisodesDownloadListenerImpl$onDownloadClick$4(this, str, str2, i), new YourEpisodesDownloadListenerImpl$onDownloadClick$5(this, str, str2, i), new YourEpisodesDownloadListenerImpl$onDownloadClick$6(this, str, str2, i), new YourEpisodesDownloadListenerImpl$onDownloadClick$7(this, str, str2, i), new YourEpisodesDownloadListenerImpl$onDownloadClick$8(this, str, str2, i));
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void disposeSubscriptions() {
        this.a.a();
    }

    @Override // com.spotify.mobius.g
    public h<l> t(da2<j> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a(this);
    }
}
