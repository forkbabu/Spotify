package com.spotify.music.carmode.navigation;

import com.spotify.music.libs.viewuri.ViewUris;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ CarModeNavigationFragment a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ e(CarModeNavigationFragment carModeNavigationFragment, boolean z) {
        this.a = carModeNavigationFragment;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CarModeNavigationFragment carModeNavigationFragment = this.a;
        boolean z = this.b;
        carModeNavigationFragment.getClass();
        vn2.a(ViewUris.d.toString(), carModeNavigationFragment.j0, carModeNavigationFragment.k0, z);
    }
}
