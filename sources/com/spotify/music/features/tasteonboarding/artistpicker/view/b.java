package com.spotify.music.features.tasteonboarding.artistpicker.view;

import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class b implements AppBarLayout.c {
    public final /* synthetic */ TastePickerFragment a;

    public /* synthetic */ b(TastePickerFragment tastePickerFragment) {
        this.a = tastePickerFragment;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.O4(appBarLayout, i);
    }
}
