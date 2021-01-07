package com.spotify.music.features.ads.cmp;

import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ CMPWebFragment a;

    public /* synthetic */ c(CMPWebFragment cMPWebFragment) {
        this.a = cMPWebFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        CMPWebFragment.l5(this.a, (Uri) obj);
    }
}
