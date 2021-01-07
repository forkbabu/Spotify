package com.spotify.mobile.android.ui.fragments;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = BottomNavigationFragment.H0;
        Assertion.i("Failed to subscribe to product state", (Throwable) obj);
    }
}
