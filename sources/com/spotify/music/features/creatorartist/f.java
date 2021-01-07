package com.spotify.music.features.creatorartist;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;

class f extends CarouselLayoutManager {
    final /* synthetic */ BiographyFragment W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(BiographyFragment biographyFragment, CarouselLayoutManager.MeasureMode measureMode) {
        super(measureMode);
        this.W = biographyFragment;
    }

    @Override // com.spotify.paste.widgets.carousel.CarouselLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        if (this.G != i) {
            this.W.x0.m(i);
        }
        super.I1(recyclerView, yVar, i);
    }
}
