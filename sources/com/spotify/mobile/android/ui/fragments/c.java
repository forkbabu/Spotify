package com.spotify.mobile.android.ui.fragments;

import android.os.Bundle;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ BottomNavigationFragment a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ c(BottomNavigationFragment bottomNavigationFragment, Bundle bundle) {
        this.a = bottomNavigationFragment;
        this.b = bundle;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.Q4(this.b, (Boolean) obj);
    }
}
