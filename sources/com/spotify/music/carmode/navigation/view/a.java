package com.spotify.music.carmode.navigation.view;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ CarModeNavigationViews a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ a(CarModeNavigationViews carModeNavigationViews, da2 da2) {
        this.a = carModeNavigationViews;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.f(this.b, view);
    }
}
