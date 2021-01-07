package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import kotlin.jvm.internal.h;

public final class PressedStateListDrawable extends StateListDrawable {
    private ColorFilter pressedFilter;

    public PressedStateListDrawable(Drawable drawable, int i) {
        h.e(drawable, "drawable");
        ColorFilter colorFilter = null;
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode blendMode = BlendMode.SRC_ATOP;
            if (blendMode != null) {
                colorFilter = new BlendModeColorFilter(i, blendMode);
            }
        } else {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            if (mode != null) {
                colorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        this.pressedFilter = colorFilter;
        addState(new int[]{16842919}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        h.e(iArr, "stateSet");
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (iArr[i] == 16842919) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            setColorFilter(this.pressedFilter);
        } else {
            clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
