package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ah8  reason: default package */
class ah8 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ int a;
    final /* synthetic */ yg8 b;

    ah8(yg8 yg8, int i) {
        this.b = yg8;
        this.a = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.b.h.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.k.h(this.a, nud.h(this.b.b, 16842836));
        yg8 yg8 = this.b;
        yg8.N(yg8, yg8.h, this.b.k);
        return true;
    }
}
