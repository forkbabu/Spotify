package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RemoteViews;

@RemoteViews.RemoteView
public class FontFitButton extends FontFitTextView {
    public FontFitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842824);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return FontFitButton.class.getName();
    }

    public FontFitButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
