package com.spotify.music.carmode.navigation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.foundation.R;

public class CarModeNavigationLayout extends ConstraintLayout {
    private a a;

    interface a {
    }

    public CarModeNavigationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.color.gray_15);
    }

    private void setClipChildrenOnParents(boolean z) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(z);
            ViewParent parent2 = parent.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).setClipChildren(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildrenOnParents(false);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setClipChildrenOnParents(true);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        a aVar;
        super.onVisibilityChanged(view, i);
        if (i == 0 && (aVar = this.a) != null) {
            ((b) aVar).a.h();
        }
    }

    public void setVisibilityListener(a aVar) {
        this.a = aVar;
    }

    public CarModeNavigationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.color.gray_15);
    }
}
