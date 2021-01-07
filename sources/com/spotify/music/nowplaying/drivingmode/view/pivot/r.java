package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import io.reactivex.h;
import io.reactivex.i;

/* access modifiers changed from: package-private */
public class r extends u implements i<View> {
    private int f = -1;
    private RecyclerView g;
    private h<View> h;

    r() {
    }

    @Override // androidx.recyclerview.widget.f0
    public void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.f0
    public View f(RecyclerView.m mVar) {
        RecyclerView recyclerView;
        View f2 = super.f(mVar);
        int X = (f2 == null || (recyclerView = this.g) == null) ? -1 : recyclerView.X(f2);
        if (!(X == -1 || this.f == X)) {
            h<View> hVar = this.h;
            if (hVar != null) {
                hVar.onNext(f2);
            }
            this.f = X;
        }
        return f2;
    }

    public /* synthetic */ void n() {
        this.h = null;
    }

    @Override // io.reactivex.i
    public void subscribe(h<View> hVar) {
        this.h = hVar;
        hVar.e(new g(this));
    }
}
