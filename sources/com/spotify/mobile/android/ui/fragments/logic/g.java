package com.spotify.mobile.android.ui.fragments.logic;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ PlaybackErrorDialogFragment a;

    public /* synthetic */ g(PlaybackErrorDialogFragment playbackErrorDialogFragment) {
        this.a = playbackErrorDialogFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PlaybackErrorDialogFragment.M4(this.a, ((Boolean) obj).booleanValue());
    }
}
