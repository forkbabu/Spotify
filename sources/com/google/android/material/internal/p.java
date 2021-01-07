package com.google.android.material.internal;

import android.view.View;

/* access modifiers changed from: package-private */
public final class p implements View.OnAttachStateChangeListener {
    p() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        q4.F(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
