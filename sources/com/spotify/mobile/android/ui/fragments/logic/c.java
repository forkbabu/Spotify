package com.spotify.mobile.android.ui.fragments.logic;

import com.spotify.player.model.PlayerError;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ Boolean a;

    public /* synthetic */ c(Boolean bool) {
        this.a = bool;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Boolean bool = this.a;
        int i = PlaybackErrorDialogFragment.B0;
        return new m((PlayerError) obj, bool.booleanValue());
    }
}
