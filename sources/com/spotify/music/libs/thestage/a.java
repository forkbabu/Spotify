package com.spotify.music.libs.thestage;

import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ TheStageFragment a;

    public /* synthetic */ a(TheStageFragment theStageFragment) {
        this.a = theStageFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        TheStageFragment.k5(this.a, (Uri) obj);
    }
}
