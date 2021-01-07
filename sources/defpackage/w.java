package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: w  reason: default package */
public class w extends u {
    private static final float f = ((float) (1.0d / Math.sqrt(2.0d)));
    private final x c = new x();
    private final Rect d = new Rect();
    private final Rect e = new Rect();

    private void w() {
        if (b() != null) {
            k(this.d);
            Rect rect = this.d;
            q.i(rect, rect, f * 0.7f);
            this.c.v(this.d.width(), this.d.height(), b());
        }
    }

    @Override // defpackage.u
    public void c(Rect rect) {
        ComplicationData b = b();
        if (b.g() == null) {
            rect.setEmpty();
            return;
        }
        a(rect);
        if (b.o() == null || q.h(rect)) {
            q.i(rect, this.d, 0.7f);
            return;
        }
        this.c.c(rect);
        Rect rect2 = this.d;
        rect.offset(rect2.left, rect2.top);
    }

    @Override // defpackage.u
    public void k(Rect rect) {
        a(rect);
        if (b().o() == null || !q.h(rect)) {
            q.c(rect, rect);
            q.i(rect, rect, 0.95f);
            return;
        }
        q.e(rect, rect);
        q.i(rect, rect, 0.95f);
    }

    @Override // defpackage.u
    public Layout.Alignment l() {
        a(this.e);
        if (q.h(this.e)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return this.c.l();
    }

    @Override // defpackage.u
    public void m(Rect rect) {
        ComplicationData b = b();
        if (b.o() == null) {
            rect.setEmpty();
            return;
        }
        a(rect);
        if (!q.h(rect)) {
            this.c.m(rect);
            Rect rect2 = this.d;
            rect.offset(rect2.left, rect2.top);
        } else if (b.p() == null || b.g() != null) {
            q.f(rect, rect);
        } else {
            q.f(rect, rect);
            q.g(rect, rect);
        }
    }

    @Override // defpackage.u
    public int n() {
        ComplicationData b = b();
        a(this.e);
        if (q.h(this.e)) {
            return b.p() != null ? 80 : 16;
        }
        return this.c.n();
    }

    @Override // defpackage.u
    public Layout.Alignment o() {
        return l();
    }

    @Override // defpackage.u
    public void p(Rect rect) {
        ComplicationData b = b();
        if (b.p() == null || b.o() == null) {
            rect.setEmpty();
            return;
        }
        a(rect);
        if (q.h(rect)) {
            q.f(rect, rect);
            q.b(rect, rect);
            return;
        }
        this.c.p(rect);
        Rect rect2 = this.d;
        rect.offset(rect2.left, rect2.top);
    }

    @Override // defpackage.u
    public int q() {
        return 48;
    }

    @Override // defpackage.u
    public void s(ComplicationData complicationData) {
        super.s(complicationData);
        w();
    }

    @Override // defpackage.u
    public void t(int i) {
        super.t(i);
        w();
    }

    @Override // defpackage.u
    public void u(int i) {
        super.u(i);
        w();
    }
}
