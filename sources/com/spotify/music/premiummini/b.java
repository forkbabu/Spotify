package com.spotify.music.premiummini;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import io.reactivex.functions.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class b implements a {
    private io.reactivex.disposables.b a;
    private final UserMixDataSource b;
    private final y c;
    private final SnackbarManager d;
    private final com.spotify.music.premiummini.ui.b e;
    private final t f;

    static final class a<T> implements g<UserMixDataSource.TrackState> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(UserMixDataSource.TrackState trackState) {
            b.d(this.a, trackState, true);
        }
    }

    /* renamed from: com.spotify.music.premiummini.b$b  reason: collision with other inner class name */
    static final class C0337b<T> implements g<UserMixDataSource.TrackState> {
        final /* synthetic */ b a;

        C0337b(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(UserMixDataSource.TrackState trackState) {
            b.f(this.a, trackState != UserMixDataSource.TrackState.REMOVED);
        }
    }

    static final class c<T> implements g<UserMixDataSource.TrackState> {
        final /* synthetic */ b a;

        c(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(UserMixDataSource.TrackState trackState) {
            b.d(this.a, trackState, false);
        }
    }

    public b(UserMixDataSource userMixDataSource, y yVar, SnackbarManager snackbarManager, com.spotify.music.premiummini.ui.b bVar, t tVar) {
        h.e(userMixDataSource, "userMixDataSource");
        h.e(yVar, "mainScheduler");
        h.e(snackbarManager, "snackbarManager");
        h.e(bVar, "premiumMiniDialogs");
        h.e(tVar, "navigator");
        this.b = userMixDataSource;
        this.c = yVar;
        this.d = snackbarManager;
        this.e = bVar;
        this.f = tVar;
    }

    public static final void d(b bVar, UserMixDataSource.TrackState trackState, boolean z) {
        bVar.getClass();
        if (trackState != null) {
            int ordinal = trackState.ordinal();
            if (ordinal == 0) {
                SnackbarManager snackbarManager = bVar.d;
                SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.track_added_confirmation_snackbar).actionTextRes(C0707R.string.track_added_confirmation_view_playlist_button).onClickListener(new c(bVar)).build();
                h.d(build, "SnackbarConfiguration.bu…\n                .build()");
                snackbarManager.show(build);
            } else if (ordinal == 1) {
                SnackbarManager snackbarManager2 = bVar.d;
                SnackbarConfiguration build2 = SnackbarConfiguration.builder((int) C0707R.string.track_removed_confirmation_snackbar).build();
                h.d(build2, "SnackbarConfiguration.bu…\n                .build()");
                snackbarManager2.show(build2);
            } else if (ordinal == 2) {
                bVar.e.b(new PremiumMiniOfflinePlaylistManagerImpl$showSongLimitDialog$1(bVar));
            } else if (ordinal == 3) {
                SnackbarManager snackbarManager3 = bVar.d;
                SnackbarConfiguration build3 = SnackbarConfiguration.builder(z ? C0707R.string.add_track_error_snackbar : C0707R.string.remove_track_error_snackbar).build();
                h.d(build3, "SnackbarConfiguration.bu…\n                .build()");
                snackbarManager3.show(build3);
            }
        }
    }

    public static final void e(b bVar) {
        bVar.f.e(n.a("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne").a());
    }

    public static final void f(b bVar, boolean z) {
        SnackbarManager snackbarManager = bVar.d;
        SnackbarConfiguration build = SnackbarConfiguration.builder(z ? C0707R.string.all_tracks_removed_error_snackbar : C0707R.string.all_tracks_removed_confirmation_snackbar).build();
        h.d(build, "SnackbarConfiguration.bu…\n                .build()");
        snackbarManager.show(build);
    }

    @Override // com.spotify.music.premiummini.a
    public void a(String str) {
        h.e(str, "trackUri");
        io.reactivex.disposables.b bVar = this.a;
        if (bVar != null) {
            bVar.dispose();
        }
        this.a = this.b.a(str).B(this.c).subscribe(new a(this));
    }

    @Override // com.spotify.music.premiummini.a
    public io.reactivex.disposables.b b() {
        io.reactivex.disposables.b subscribe = this.b.b().B(this.c).subscribe(new C0337b(this));
        h.d(subscribe, "userMixDataSource\n      … trackState != REMOVED) }");
        return subscribe;
    }

    @Override // com.spotify.music.premiummini.a
    public void c(String str) {
        h.e(str, "trackUri");
        io.reactivex.disposables.b bVar = this.a;
        if (bVar != null) {
            bVar.dispose();
        }
        this.a = this.b.c(str).B(this.c).subscribe(new c(this));
    }
}
