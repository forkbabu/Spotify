package com.spotify.music.newplaying.scroll.container;

import android.graphics.Rect;
import android.view.View;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;

/* access modifiers changed from: package-private */
public class b0 {
    private final WidgetsContainer a;
    private final Rect b = new Rect();

    b0(WidgetsContainer widgetsContainer) {
        this.a = widgetsContainer;
    }

    /* access modifiers changed from: package-private */
    public g<a0> a() {
        return g.p(new j(this, this.a), BackpressureStrategy.LATEST);
    }

    public void b(WidgetsContainer widgetsContainer, h hVar) {
        for (int i = 0; i < widgetsContainer.getChildCount(); i++) {
            View childAt = widgetsContainer.getChildAt(i);
            hVar.onNext(new z((NowPlayingWidget.Type) childAt.getTag(), i, childAt.getGlobalVisibleRect(this.b) ? ((float) this.b.height()) / ((float) childAt.getMeasuredHeight()) : 0.0f));
        }
    }
}
