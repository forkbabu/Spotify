package com.spotify.music.podcast.entity.adapter.episoderow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.elements.addtobutton.AddToButtonState;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.music.podcast.entity.adapter.episoderow.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class EncoreEpisodeRowViewBinder implements i {
    private Component<EpisodeRow.Model, EpisodeRow.Events> a;
    private final ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> b;
    private final jhc c;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.spotify.encore.ComponentFactory<com.spotify.encore.Component<com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow$Model, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow$Events>, ? super com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow$Configuration> */
    /* JADX WARN: Multi-variable type inference failed */
    public EncoreEpisodeRowViewBinder(ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, ? super EpisodeRow.Configuration> componentFactory, jhc jhc) {
        h.e(componentFactory, "episodeRowFactory");
        h.e(jhc, "eventsHandler");
        this.b = componentFactory;
        this.c = jhc;
    }

    public static final void d(EncoreEpisodeRowViewBinder encoreEpisodeRowViewBinder, EpisodeRowQuickAction episodeRowQuickAction, j jVar) {
        encoreEpisodeRowViewBinder.getClass();
        if (episodeRowQuickAction instanceof EpisodeRowQuickAction.Download) {
            jhc jhc = encoreEpisodeRowViewBinder.c;
            h.e(jVar, "model");
            jhc.d(new ihc(jVar.e(), jVar.h(), jVar.f()));
            return;
        }
        boolean z = true;
        if (episodeRowQuickAction instanceof EpisodeRowQuickAction.ContextMenu) {
            jhc jhc2 = encoreEpisodeRowViewBinder.c;
            h.e(jVar, "model");
            jhc2.i(new dhc(jVar.o(), jVar.e(), !h.a(jVar.d(), c.e.a), jVar.f(), jVar.t()));
        } else if (episodeRowQuickAction instanceof EpisodeRowQuickAction.MarkAsPlayed) {
            jhc jhc3 = encoreEpisodeRowViewBinder.c;
            h.e(jVar, "model");
            jhc3.g(new khc(jVar.e(), jVar.f()));
        } else if (episodeRowQuickAction instanceof EpisodeRowQuickAction.AddToYourEpisodes) {
            jhc jhc4 = encoreEpisodeRowViewBinder.c;
            h.e(jVar, "model");
            String e = jVar.e();
            if (jVar.a() != AddToYourEpisodesState.ADDED) {
                z = false;
            }
            jhc4.a(new bhc(e, z, jVar.f()));
        } else {
            throw new IllegalStateException(episodeRowQuickAction + " doesn't have a supported action handling");
        }
    }

    @Override // com.spotify.music.podcast.entity.adapter.episoderow.i
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parent");
        Component<EpisodeRow.Model, EpisodeRow.Events> make = this.b.make();
        this.a = make;
        if (make != null) {
            return make.getView();
        }
        h.k("episodeRow");
        throw null;
    }

    @Override // com.spotify.music.podcast.entity.adapter.episoderow.i
    public void b(j jVar) {
        EpisodePlayState episodePlayState;
        ContentRestriction contentRestriction;
        EpisodeRowQuickAction episodeRowQuickAction;
        EpisodeRowQuickAction episodeRowQuickAction2;
        DownloadState downloadState;
        String str;
        EpisodeRowQuickAction.None none;
        h.e(jVar, "viewModel");
        Component<EpisodeRow.Model, EpisodeRow.Events> component = this.a;
        if (component != null) {
            String o = jVar.o();
            String n = jVar.n();
            String c2 = jVar.c();
            String k = jVar.k();
            long g = jVar.g();
            long j = jVar.j();
            float f = (float) g;
            float f2 = f <= 0.0f ? 0.0f : j > g ? 1.0f : ((float) j) / f;
            boolean s = jVar.s();
            boolean r = jVar.r();
            int ordinal = jVar.i().ordinal();
            if (ordinal == 0) {
                episodePlayState = EpisodePlayState.Playing;
            } else if (ordinal == 1) {
                episodePlayState = EpisodePlayState.Paused;
            } else if (ordinal == 2) {
                episodePlayState = EpisodePlayState.PlayingInActivePlayerContext;
            } else if (ordinal == 3) {
                episodePlayState = EpisodePlayState.PausedInActivePlayerContext;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String b2 = jVar.b();
            int ordinal2 = jVar.l().ordinal();
            if (ordinal2 == 0) {
                contentRestriction = ContentRestriction.Explicit;
            } else if (ordinal2 == 1) {
                contentRestriction = ContentRestriction.Over19Only;
            } else if (ordinal2 == 2) {
                contentRestriction = ContentRestriction.None;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = !jVar.q();
            if (jVar.m()) {
                episodeRowQuickAction = new EpisodeRowQuickAction.MarkAsPlayed(jVar.o(), jVar.r());
            } else {
                episodeRowQuickAction = EpisodeRowQuickAction.None.INSTANCE;
            }
            AddToYourEpisodesState a2 = jVar.a();
            boolean r2 = jVar.r();
            int ordinal3 = a2.ordinal();
            if (ordinal3 == 0) {
                episodeRowQuickAction2 = new EpisodeRowQuickAction.AddToYourEpisodes(AddToButtonState.ADD, r2);
            } else if (ordinal3 == 1) {
                episodeRowQuickAction2 = new EpisodeRowQuickAction.AddToYourEpisodes(AddToButtonState.ADDED, r2);
            } else if (ordinal3 == 2) {
                episodeRowQuickAction2 = EpisodeRowQuickAction.None.INSTANCE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            c d = jVar.d();
            if (h.a(d, c.a.a)) {
                downloadState = DownloadState.Downloadable.INSTANCE;
            } else if (d instanceof c.C0324c) {
                downloadState = new DownloadState.Downloading(Float.valueOf(((c.C0324c) d).a()));
            } else if (h.a(d, c.b.a)) {
                downloadState = DownloadState.Downloaded.INSTANCE;
            } else if (h.a(d, c.d.a)) {
                downloadState = DownloadState.Error.INSTANCE;
            } else if (h.a(d, c.f.a)) {
                downloadState = DownloadState.Pending.INSTANCE;
            } else if (h.a(d, c.e.a)) {
                downloadState = DownloadState.None.INSTANCE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (downloadState instanceof DownloadState.None) {
                str = "episodeRow";
                none = EpisodeRowQuickAction.None.INSTANCE;
            } else {
                str = "episodeRow";
                none = new EpisodeRowQuickAction.Download(downloadState, false, 2, null);
            }
            component.render(new EpisodeRow.Model(o, n, c2, k, f2, s, contentRestriction, r, episodePlayState, b2, z, episodeRowQuickAction, episodeRowQuickAction2, none));
            Component<EpisodeRow.Model, EpisodeRow.Events> component2 = this.a;
            if (component2 != null) {
                component2.onEvent(new EncoreEpisodeRowViewBinder$bind$1(this, jVar));
            } else {
                h.k(str);
                throw null;
            }
        } else {
            h.k("episodeRow");
            throw null;
        }
    }
}
