package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;
import androidx.cardview.widget.g;

/* access modifiers changed from: package-private */
public class c implements e {
    final RectF a = new RectF();

    class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                c.this.a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    c() {
    }

    private g p(d dVar) {
        return (g) ((CardView.a) dVar).a();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f) {
        p(dVar).l(f);
        k(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return p(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f) {
        p(dVar).n(f);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return p(dVar).e();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return p(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return p(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        g p = p(dVar);
        CardView.a aVar = (CardView.a) dVar;
        p.i(aVar.b());
        k(aVar);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        g gVar = new g(context.getResources(), colorStateList, f, f2, f3);
        CardView.a aVar = (CardView.a) dVar;
        gVar.i(aVar.b());
        aVar.c(gVar);
        k(aVar);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return p(dVar).h();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        Rect rect = new Rect();
        p(dVar).getPadding(rect);
        int ceil = (int) Math.ceil((double) p(dVar).g());
        int ceil2 = (int) Math.ceil((double) p(dVar).f());
        CardView.a aVar = (CardView.a) dVar;
        CardView cardView = CardView.this;
        if (ceil > cardView.c) {
            CardView.l(cardView, ceil);
        }
        CardView cardView2 = CardView.this;
        if (ceil2 > cardView2.f) {
            CardView.m(cardView2, ceil2);
        }
        ((CardView.a) dVar).d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public void l() {
        g.r = new a();
    }

    @Override // androidx.cardview.widget.e
    public float m(d dVar) {
        return p(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, ColorStateList colorStateList) {
        p(dVar).k(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f) {
        p(dVar).m(f);
        k(dVar);
    }
}
