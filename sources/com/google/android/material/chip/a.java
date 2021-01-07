package com.google.android.material.chip;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class a extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    a(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (Chip.b(this.a) != null) {
            Chip.b(this.a).getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
