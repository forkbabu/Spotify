package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class b implements j {
    private final Context a;
    private final ExtendedFloatingActionButton b;
    private final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();
    private final a d;
    private xw e;
    private xw f;

    b(ExtendedFloatingActionButton extendedFloatingActionButton, a aVar) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public void c() {
        this.d.a();
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public AnimatorSet e() {
        return g(h());
    }

    /* access modifiers changed from: package-private */
    public AnimatorSet g(xw xwVar) {
        ArrayList arrayList = new ArrayList();
        if (xwVar.h("opacity")) {
            arrayList.add(xwVar.d("opacity", this.b, View.ALPHA));
        }
        if (xwVar.h("scale")) {
            arrayList.add(xwVar.d("scale", this.b, View.SCALE_Y));
            arrayList.add(xwVar.d("scale", this.b, View.SCALE_X));
        }
        if (xwVar.h("width")) {
            arrayList.add(xwVar.d("width", this.b, ExtendedFloatingActionButton.F));
        }
        if (xwVar.h("height")) {
            arrayList.add(xwVar.d("height", this.b, ExtendedFloatingActionButton.G));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        rw.q(animatorSet, arrayList);
        return animatorSet;
    }

    public final xw h() {
        xw xwVar = this.f;
        if (xwVar != null) {
            return xwVar;
        }
        if (this.e == null) {
            this.e = xw.b(this.a, d());
        }
        xw xwVar2 = this.e;
        xwVar2.getClass();
        return xwVar2;
    }

    public final List<Animator.AnimatorListener> i() {
        return this.c;
    }

    public xw j() {
        return this.f;
    }

    public final void k(xw xwVar) {
        this.f = xwVar;
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public void onAnimationEnd() {
        this.d.a();
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public void onAnimationStart(Animator animator) {
        this.d.b(animator);
    }
}
