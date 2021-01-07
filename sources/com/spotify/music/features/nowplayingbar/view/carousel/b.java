package com.spotify.music.features.nowplayingbar.view.carousel;

import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.music.features.nowplayingbar.view.carousel.c;
import com.spotify.music.features.nowplayingbar.view.h;
import com.spotify.music.features.nowplayingbar.view.i0;

class b implements c.b {
    final /* synthetic */ CarouselView a;

    b(CarouselView carouselView) {
        this.a = carouselView;
    }

    @Override // com.spotify.music.features.nowplayingbar.view.carousel.c.b
    public void a() {
        if (CarouselView.U0(this.a) != null) {
            ((h) CarouselView.U0(this.a)).a.accept(d.j.a);
        }
    }

    @Override // com.spotify.music.features.nowplayingbar.view.carousel.c.b
    public void b() {
        if (CarouselView.T0(this.a) != null) {
            ((i0) CarouselView.T0(this.a)).a.accept(d.f.a);
        }
    }
}
