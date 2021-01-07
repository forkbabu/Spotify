package com.spotify.music.yourlibrary.quickscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.C0707R;
import com.spotify.music.yourlibrary.quickscroll.h;
import com.spotify.music.yourlibrary.quickscroll.k;
import java.util.Locale;

public class QuickScrollView extends FrameLayout {
    k a;
    m b;
    n c;

    public QuickScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q qVar = new q(getLayoutOrientation(), context, attributeSet, 0, 0);
        LayoutInflater.from(context).inflate(C0707R.layout.quickscroll, this);
        qVar.a(this);
        ((t) this.b).a(this.c);
    }

    private void c(k.a aVar) {
        k b2 = ((h.b) aVar).b();
        this.a = b2;
        ((c0) this.c).A(b2);
        ((t) this.b).q(this.a);
    }

    private static int getLayoutOrientation() {
        return p3.a(new Locale(SpotifyLocale.c()));
    }

    public void a(x xVar) {
        w wVar = new w(xVar);
        Integer c2 = xVar.c();
        if (c2 != null) {
            ((t) this.b).c(wVar, c2.intValue());
            return;
        }
        ((t) this.b).b(wVar);
    }

    public void b(int i) {
        ((t) this.b).j(i);
    }

    public void setAlphaAnimationDuration(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.a(i);
        c(bVar);
    }

    public void setHandlerArrowsColor(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.c(i);
        c(bVar);
    }

    public void setHandlerBackgroundColor(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.d(i);
        c(bVar);
    }

    public void setInactivityDuration(long j) {
        h.b bVar = (h.b) this.a.n();
        bVar.e(j);
        c(bVar);
    }

    public void setIndicatorBackgroundColor(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.f(i);
        c(bVar);
    }

    public void setIndicatorTextColor(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.g(i);
        c(bVar);
    }

    public void setInitialIndicatorPadding(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.h(i);
        c(bVar);
    }

    public void setInitiallyVisible(boolean z) {
        h.b bVar = (h.b) this.a.n();
        bVar.i(z);
        c(bVar);
    }

    public void setListener(u uVar) {
        ((t) this.b).m(uVar);
    }

    public void setOffsetIndicatorPadding(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.k(i);
        c(bVar);
    }

    public void setPaddingAnimationDuration(int i) {
        h.b bVar = (h.b) this.a.n();
        bVar.l(i);
        c(bVar);
    }

    public void setShouldDisappearOnBottom(boolean z) {
        h.b bVar = (h.b) this.a.n();
        bVar.m(z);
        c(bVar);
    }

    public void setShouldDisappearOnTop(boolean z) {
        h.b bVar = (h.b) this.a.n();
        bVar.n(z);
        c(bVar);
    }

    public void setWithHandler(boolean z) {
        h.b bVar = (h.b) this.a.n();
        bVar.o(z);
        c(bVar);
    }

    public QuickScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q qVar = new q(getLayoutOrientation(), context, attributeSet, i, 0);
        LayoutInflater.from(context).inflate(C0707R.layout.quickscroll, this);
        qVar.a(this);
        ((t) this.b).a(this.c);
    }
}
