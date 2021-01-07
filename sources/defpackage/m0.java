package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import defpackage.k0;

/* access modifiers changed from: package-private */
/* renamed from: m0  reason: default package */
public class m0 extends k0 {
    private a w;
    private boolean x;

    /* access modifiers changed from: package-private */
    /* renamed from: m0$a */
    public static class a extends k0.c {
        int[][] J;

        a(a aVar, m0 m0Var, Resources resources) {
            super(aVar, m0Var, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.g.length][];
            }
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.k0.c
        public void i() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        /* access modifiers changed from: package-private */
        public int k(int[] iArr) {
            int[][] iArr2 = this.J;
            int i = this.h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new m0(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new m0(this, resources);
        }
    }

    m0(a aVar, Resources resources) {
        f(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // defpackage.k0, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.k0
    public void f(k0.c cVar) {
        super.f(cVar);
        if (cVar instanceof a) {
            this.w = (a) cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public a b() {
        return new a(this.w, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.k0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.x) {
            super.mutate();
            if (this == this) {
                this.w.i();
                this.x = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.k0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int k = this.w.k(iArr);
        if (k < 0) {
            k = this.w.k(StateSet.WILD_CARD);
        }
        return e(k) || onStateChange;
    }

    m0(a aVar) {
    }
}
