package com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout;

import android.view.ViewTreeObserver;

public final /* synthetic */ class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ c a;

    public /* synthetic */ a(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        c cVar = this.a;
        cVar.a.a.setTop(cVar.a.q);
        cVar.a.b.setTop(cVar.a.r);
        cVar.a.a.setBottom(cVar.a.getHeight() + cVar.a.q);
        cVar.a.b.setBottom(cVar.a.getHeight() + cVar.a.r);
        return true;
    }
}
