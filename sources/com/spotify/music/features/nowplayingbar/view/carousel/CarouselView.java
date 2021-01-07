package com.spotify.music.features.nowplayingbar.view.carousel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselView extends RecyclerView {
    private c O0;
    private b P0;
    private a Q0;

    public interface a {
    }

    public interface b {
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void I0(int i) {
        super.I0(i);
        this.O0.v(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void N0(int i) {
        super.N0(i);
        this.O0.v(i);
    }

    public void V0(b bVar, a aVar) {
        this.P0 = bVar;
        this.Q0 = aVar;
    }

    public void setDisallowScrollLeft(boolean z) {
        this.O0.s(z);
    }

    public void setDisallowScrollRight(boolean z) {
        this.O0.t(z);
    }

    public CarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(0, false));
        c cVar = new c();
        this.O0 = cVar;
        cVar.a(this);
        this.O0.u(new b(this));
    }
}
