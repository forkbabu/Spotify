package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.c;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;

public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int[][] o = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList f;
    private boolean n;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f == null) {
            int[][] iArr = o;
            int[] iArr2 = new int[iArr.length];
            int m = rw.m(this, C0707R.attr.colorControlActivated);
            int m2 = rw.m(this, C0707R.attr.colorSurface);
            int m3 = rw.m(this, C0707R.attr.colorOnSurface);
            iArr2[0] = rw.o(m2, m, 1.0f);
            iArr2[1] = rw.o(m2, m3, 0.54f);
            iArr2[2] = rw.o(m2, m3, 0.38f);
            iArr2[3] = rw.o(m2, m3, 0.38f);
            this.f = new ColorStateList(iArr, iArr2);
        }
        return this.f;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.n = z;
        if (z) {
            c.f(this, getMaterialThemeColorsTintList());
        } else {
            c.f(this, null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i);
        Context context2 = getContext();
        TypedArray f2 = j.f(context2, attributeSet, pw.y, i, C0707R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (f2.hasValue(0)) {
            c.f(this, jx.a(context2, f2, 0));
        }
        this.n = f2.getBoolean(1, false);
        f2.recycle();
    }
}
