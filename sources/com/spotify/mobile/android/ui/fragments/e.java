package com.spotify.mobile.android.ui.fragments;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = BottomNavigationFragment.H0;
        Assertion.i("Failed to subscribe to product state", (Throwable) obj);
    }
}
