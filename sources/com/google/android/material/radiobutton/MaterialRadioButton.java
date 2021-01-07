package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.c;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;

public class MaterialRadioButton extends AppCompatRadioButton {
    private static final int[][] o = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList f;
    private boolean n;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f == null) {
            int m = rw.m(this, C0707R.attr.colorControlActivated);
            int m2 = rw.m(this, C0707R.attr.colorOnSurface);
            int m3 = rw.m(this, C0707R.attr.colorSurface);
            int[][] iArr = o;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = rw.o(m3, m, 1.0f);
            iArr2[1] = rw.o(m3, m2, 0.54f);
            iArr2[2] = rw.o(m3, m2, 0.38f);
            iArr2[3] = rw.o(m3, m2, 0.38f);
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

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray f2 = j.f(context2, attributeSet, pw.z, i, C0707R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            c.f(this, jx.a(context2, f2, 0));
        }
        this.n = f2.getBoolean(1, false);
        f2.recycle();
    }
}
