package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* access modifiers changed from: package-private */
public class m implements n {
    private final ViewOverlay a;

    m(View view) {
        this.a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.n
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.google.android.material.internal.n
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }
}
