package com.spotify.mobile.android.ui.fragments.logic;

import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ PlaybackErrorDialogFragment a;

    public /* synthetic */ d(PlaybackErrorDialogFragment playbackErrorDialogFragment) {
        this.a = playbackErrorDialogFragment;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.o0.error().j0(new c((Boolean) obj));
    }
}
