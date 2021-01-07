package com.spotify.mobile.android.ui.fragments.logic;

import com.spotify.android.flags.c;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.offlinetrials.capped.k;
import io.reactivex.g;
import io.reactivex.y;

public final class l {
    public static void a(PlaybackErrorDialogFragment playbackErrorDialogFragment, AgeRestrictedContentFacade ageRestrictedContentFacade) {
        playbackErrorDialogFragment.m0 = ageRestrictedContentFacade;
    }

    public static void b(PlaybackErrorDialogFragment playbackErrorDialogFragment, k kVar) {
        playbackErrorDialogFragment.q0 = kVar;
    }

    public static void c(PlaybackErrorDialogFragment playbackErrorDialogFragment, l6a l6a) {
        playbackErrorDialogFragment.k0 = l6a;
    }

    public static void d(PlaybackErrorDialogFragment playbackErrorDialogFragment, ExplicitContentFacade explicitContentFacade) {
        playbackErrorDialogFragment.l0 = explicitContentFacade;
    }

    public static void e(PlaybackErrorDialogFragment playbackErrorDialogFragment, g<c> gVar) {
        playbackErrorDialogFragment.r0 = gVar;
    }

    public static void f(PlaybackErrorDialogFragment playbackErrorDialogFragment, y yVar) {
        playbackErrorDialogFragment.s0 = yVar;
    }

    public static void g(OfflineSyncErrorFragment offlineSyncErrorFragment, m8c m8c) {
        offlineSyncErrorFragment.j0 = m8c;
    }

    public static void h(PlaybackErrorDialogFragment playbackErrorDialogFragment, n nVar) {
        playbackErrorDialogFragment.n0 = nVar;
    }

    public static void i(PlaybackErrorDialogFragment playbackErrorDialogFragment, com.spotify.player.sub.l lVar) {
        playbackErrorDialogFragment.o0 = lVar;
    }

    public static void j(PlaybackErrorDialogFragment playbackErrorDialogFragment, w wVar) {
        playbackErrorDialogFragment.p0 = wVar;
    }

    public static void k(OfflineSyncErrorFragment offlineSyncErrorFragment, SnackbarManager snackbarManager) {
        offlineSyncErrorFragment.k0 = snackbarManager;
    }

    public static void l(MarketingOptInDialogFragment marketingOptInDialogFragment, i iVar) {
        marketingOptInDialogFragment.l0 = iVar;
    }

    public static void m(PlaybackErrorDialogFragment playbackErrorDialogFragment, o0 o0Var) {
        playbackErrorDialogFragment.j0 = o0Var;
    }
}
