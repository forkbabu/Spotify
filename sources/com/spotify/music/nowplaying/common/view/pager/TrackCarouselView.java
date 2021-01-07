package com.spotify.music.nowplaying.common.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.nowplaying.common.view.pager.h;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.spotify.paste.widgets.carousel.c;
import com.spotify.player.model.ContextTrack;
import defpackage.uqb;
import java.util.List;

public class TrackCarouselView extends CarouselView implements h {
    private CarouselLayoutManager S0;
    private uqb T0;
    private h.a U0;
    private final uqb.a V0 = new a();

    class a implements uqb.a {
        a() {
        }

        @Override // defpackage.uqb.a
        public void a() {
            if (TrackCarouselView.this.U0 != null) {
                TrackCarouselView.this.U0.a();
            }
        }

        @Override // defpackage.uqb.a
        public void b() {
            if (TrackCarouselView.this.U0 != null) {
                TrackCarouselView.this.U0.b();
            }
        }
    }

    public TrackCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ void W0(boolean z) {
        this.S0.b2(z);
    }

    public /* synthetic */ void X0(boolean z) {
        this.S0.c2(z);
    }

    public /* synthetic */ void Y0(List list, ContextTrack contextTrack, List list2) {
        this.T0.i(list, contextTrack, list2);
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h
    public void d(List<ContextTrack> list, ContextTrack contextTrack, List<ContextTrack> list2) {
        post(new d(this, list, contextTrack, list2));
    }

    public void setAdapter(drb<e<ContextTrack>> drb) {
        super.setAdapter((RecyclerView.e) drb);
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(CarouselLayoutManager.MeasureMode.FILL);
        this.S0 = carouselLayoutManager;
        setLayoutManager(carouselLayoutManager);
        setItemAnimator(new c());
        this.T0 = new uqb(this, this.V0);
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h
    public void setDisallowPeekLeft(boolean z) {
        this.T0.g(z);
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h
    public void setDisallowPeekRight(boolean z) {
        this.T0.h(z);
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h
    public void setDisallowScrollLeft(boolean z) {
        post(new b(this, z));
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h
    public void setDisallowScrollRight(boolean z) {
        post(new c(this, z));
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h
    public void setListener(h.a aVar) {
        this.U0 = aVar;
    }
}
