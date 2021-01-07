package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.spotify.music.C0707R;

public class MaterialToolbar extends Toolbar {
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.toolbarStyle);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof yx) {
            zx.b(this, (yx) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof yx) {
            ((yx) background).G(f);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            yx yxVar = new yx();
            yxVar.H(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            yxVar.C(context2);
            yxVar.G(q4.k(this));
            int i2 = Build.VERSION.SDK_INT;
            setBackground(yxVar);
        }
    }
}
