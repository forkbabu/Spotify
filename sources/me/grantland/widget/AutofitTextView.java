package me.grantland.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import me.grantland.widget.a;

public class AutofitTextView extends AppCompatTextView implements a.d, zud {
    private final yud a = new yud(this);
    private a b;

    public AutofitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a e = a.e(this, attributeSet, 0);
        e.b(this);
        this.b = e;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    public a getAutofitHelper() {
        return this.b;
    }

    public float getMaxTextSize() {
        return this.b.g();
    }

    public float getMinTextSize() {
        return this.b.h();
    }

    public float getPrecision() {
        return this.b.i();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.a.b();
    }

    @Override // me.grantland.widget.a.d
    public void i(float f, float f2) {
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.c();
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        super.setLines(i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.m(i);
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.m(i);
        }
    }

    public void setMaxTextSize(float f) {
        this.b.n(f);
    }

    public void setMinTextSize(int i) {
        this.b.o(2, (float) i);
    }

    public void setPrecision(float f) {
        this.b.p(f);
    }

    public void setSizeToFit(boolean z) {
        this.b.l(z);
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.a.d(lVar);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        a aVar = this.b;
        if (aVar != null) {
            aVar.q(i, f);
        }
    }

    public AutofitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a e = a.e(this, attributeSet, i);
        e.b(this);
        this.b = e;
    }
}
