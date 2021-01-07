package com.spotify.music.features.tasteonboarding.artistsearch.view;

import android.view.View;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

public final /* synthetic */ class b implements e.a {
    public final /* synthetic */ ArtistSearchFragment a;

    public /* synthetic */ b(ArtistSearchFragment artistSearchFragment) {
        this.a = artistSearchFragment;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e.a
    public final void c(int i, View view, Object obj) {
        this.a.h0.v(i, (TasteOnboardingItem) obj, null);
    }
}
