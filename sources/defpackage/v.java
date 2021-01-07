package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: v  reason: default package */
public class v extends u {
    private final Rect c = new Rect();

    private boolean w(Rect rect) {
        ComplicationData b = b();
        return (b.g() == null && b.q() == null) || !q.h(rect);
    }

    @Override // defpackage.u
    public void c(Rect rect) {
        ComplicationData b = b();
        a(rect);
        if (b.g() == null || b.q() != null || w(rect)) {
            rect.setEmpty();
        } else {
            q.e(rect, rect);
        }
    }

    @Override // defpackage.u
    public Layout.Alignment e() {
        a(this.c);
        if (w(this.c)) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // defpackage.u
    public void f(Rect rect) {
        ComplicationData b = b();
        a(rect);
        if (w(rect)) {
            if (b.k() != null) {
                q.g(rect, rect);
            }
        } else if (b.k() == null) {
            q.f(rect, rect);
        } else {
            q.f(rect, rect);
            q.g(rect, rect);
        }
    }

    @Override // defpackage.u
    public int g() {
        return b().k() == null ? 16 : 80;
    }

    @Override // defpackage.u
    public Layout.Alignment h() {
        a(this.c);
        if (w(this.c)) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // defpackage.u
    public void i(Rect rect) {
        ComplicationData b = b();
        a(rect);
        if (b.k() == null) {
            rect.setEmpty();
        } else if (w(rect)) {
            q.b(rect, rect);
        } else {
            q.f(rect, rect);
            q.b(rect, rect);
        }
    }

    @Override // defpackage.u
    public int j() {
        return 48;
    }

    @Override // defpackage.u
    public void r(Rect rect) {
        ComplicationData b = b();
        a(rect);
        if (b.q() == null || w(rect)) {
            rect.setEmpty();
        } else {
            q.e(rect, rect);
        }
    }
}
