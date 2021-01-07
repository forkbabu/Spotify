package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;

public class SwitchMaterial extends SwitchCompat {
    private static final int[][] f0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private final ex b0;
    private ColorStateList c0;
    private ColorStateList d0;
    private boolean e0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.switchStyle);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.c0 == null) {
            int m = rw.m(this, C0707R.attr.colorSurface);
            int m2 = rw.m(this, C0707R.attr.colorControlActivated);
            float dimension = getResources().getDimension(C0707R.dimen.mtrl_switch_thumb_elevation);
            if (this.b0.b()) {
                dimension += o.f(this);
            }
            int a = this.b0.a(m, dimension);
            int[][] iArr = f0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = rw.o(m, m2, 1.0f);
            iArr2[1] = a;
            iArr2[2] = rw.o(m, m2, 0.38f);
            iArr2[3] = a;
            this.c0 = new ColorStateList(iArr, iArr2);
        }
        return this.c0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.d0 == null) {
            int[][] iArr = f0;
            int[] iArr2 = new int[iArr.length];
            int m = rw.m(this, C0707R.attr.colorSurface);
            int m2 = rw.m(this, C0707R.attr.colorControlActivated);
            int m3 = rw.m(this, C0707R.attr.colorOnSurface);
            iArr2[0] = rw.o(m, m2, 0.54f);
            iArr2[1] = rw.o(m, m3, 0.32f);
            iArr2[2] = rw.o(m, m2, 0.12f);
            iArr2[3] = rw.o(m, m3, 0.12f);
            this.d0 = new ColorStateList(iArr, iArr2);
        }
        return this.d0;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.e0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.e0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i);
        Context context2 = getContext();
        this.b0 = new ex(context2);
        TypedArray f = j.f(context2, attributeSet, pw.K, i, C0707R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        this.e0 = f.getBoolean(0, false);
        f.recycle();
    }
}
