package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: x  reason: default package */
public class x extends u {
    private final Rect c = new Rect();

    @Override // defpackage.u
    public void c(Rect rect) {
        if (b().g() == null) {
            rect.setEmpty();
            return;
        }
        a(rect);
        if (q.h(rect)) {
            q.e(rect, rect);
            return;
        }
        q.c(rect, rect);
        q.g(rect, rect);
        q.c(rect, rect);
    }

    @Override // defpackage.u
    public Layout.Alignment l() {
        ComplicationData b = b();
        a(this.c);
        if (!q.h(this.c) || b.g() == null) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // defpackage.u
    public void m(Rect rect) {
        ComplicationData b = b();
        a(rect);
        if (b.g() != null) {
            if (q.h(rect)) {
                q.f(rect, rect);
                return;
            }
            q.c(rect, rect);
            q.b(rect, rect);
        } else if (b.p() != null) {
            q.g(rect, rect);
        }
    }

    @Override // defpackage.u
    public int n() {
        ComplicationData b = b();
        return (b.p() == null || b.g() != null) ? 16 : 80;
    }

    @Override // defpackage.u
    public Layout.Alignment o() {
        return l();
    }

    @Override // defpackage.u
    public void p(Rect rect) {
        ComplicationData b = b();
        if (b.g() != null || b.p() == null) {
            rect.setEmpty();
            return;
        }
        a(rect);
        q.b(rect, rect);
    }

    @Override // defpackage.u
    public int q() {
        return 48;
    }
}
