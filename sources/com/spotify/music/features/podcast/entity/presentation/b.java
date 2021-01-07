package com.spotify.music.features.podcast.entity.presentation;

import android.view.View;
import com.spotify.music.features.podcast.entity.presentation.FilteringPresenter;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ FilteringPresenter.a a;

    public /* synthetic */ b(FilteringPresenter.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.l(view);
    }
}
