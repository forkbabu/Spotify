package com.spotify.mobile.android.ui.fragments.logic;

import com.spotify.android.flags.c;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ PlaybackErrorDialogFragment a;

    public /* synthetic */ f(PlaybackErrorDialogFragment playbackErrorDialogFragment) {
        this.a = playbackErrorDialogFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.N4((c) obj);
    }
}
