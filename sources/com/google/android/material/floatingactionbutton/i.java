package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.spotify.music.C0707R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class i extends f {

    static class a extends yx {
        a(dy dyVar) {
            super(dyVar);
        }

        @Override // defpackage.yx, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    i(FloatingActionButton floatingActionButton, qx qxVar) {
        super(floatingActionButton, qxVar);
    }

    private Animator Q(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(f.F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public boolean B() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void F(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ox.c(colorStateList));
        } else if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, ox.c(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public boolean I() {
        return FloatingActionButton.this.u || !K();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void M() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public yx j() {
        dy dyVar = this.a;
        dyVar.getClass();
        return new a(dyVar);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public float k() {
        return this.y.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void m(Rect rect) {
        if (FloatingActionButton.this.u) {
            super.m(rect);
        } else if (!K()) {
            int sizeDimension = (this.k - this.y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void p(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        dy dyVar = this.a;
        dyVar.getClass();
        a aVar = new a(dyVar);
        this.b = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.C(this.y.getContext());
        if (i > 0) {
            Context context = this.y.getContext();
            dy dyVar2 = this.a;
            dyVar2.getClass();
            c cVar = new c(dyVar2);
            cVar.d(androidx.core.content.a.b(context, C0707R.color.design_fab_stroke_top_outer_color), androidx.core.content.a.b(context, C0707R.color.design_fab_stroke_top_inner_color), androidx.core.content.a.b(context, C0707R.color.design_fab_stroke_end_inner_color), androidx.core.content.a.b(context, C0707R.color.design_fab_stroke_end_outer_color));
            cVar.c((float) i);
            cVar.b(colorStateList);
            this.d = cVar;
            c cVar2 = this.d;
            cVar2.getClass();
            yx yxVar = this.b;
            yxVar.getClass();
            drawable = new LayerDrawable(new Drawable[]{cVar2, yxVar});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ox.c(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void s() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void u() {
        O();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void w(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.y.isEnabled()) {
            this.y.setElevation(this.h);
            if (this.y.isPressed()) {
                this.y.setTranslationZ(this.j);
            } else if (this.y.isFocused() || this.y.isHovered()) {
                this.y.setTranslationZ(this.i);
            } else {
                this.y.setTranslationZ(0.0f);
            }
        } else {
            this.y.setElevation(0.0f);
            this.y.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.f
    public void x(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f.G, Q(f, f3));
            stateListAnimator.addState(f.H, Q(f, f2));
            stateListAnimator.addState(f.I, Q(f, f2));
            stateListAnimator.addState(f.J, Q(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f.F);
            stateListAnimator.addState(f.K, animatorSet);
            stateListAnimator.addState(f.L, Q(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (I()) {
            O();
        }
    }
}
