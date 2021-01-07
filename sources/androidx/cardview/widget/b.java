package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

class b implements e {
    b() {
    }

    private f p(d dVar) {
        return (f) ((CardView.a) dVar).a();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f) {
        p(dVar).h(f);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return p(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f) {
        CardView.this.setElevation(f);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return p(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return p(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return p(dVar).d() * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        o(dVar, p(dVar).c());
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        CardView.a aVar = (CardView.a) dVar;
        aVar.c(new f(colorStateList, f));
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        o(aVar, f3);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return CardView.this.getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
        o(dVar, p(dVar).c());
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        CardView.a aVar = (CardView.a) dVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.d(0, 0, 0, 0);
            return;
        }
        float c = p(dVar).c();
        float d = p(dVar).d();
        int ceil = (int) Math.ceil((double) g.a(c, d, aVar.b()));
        int ceil2 = (int) Math.ceil((double) g.b(c, d, aVar.b()));
        aVar.d(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public void l() {
    }

    @Override // androidx.cardview.widget.e
    public float m(d dVar) {
        return p(dVar).d() * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f) {
        CardView.a aVar = (CardView.a) dVar;
        p(dVar).g(f, CardView.this.getUseCompatPadding(), aVar.b());
        k(dVar);
    }
}
