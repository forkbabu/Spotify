package com.spotify.android.glue.patterns.contextmenu.glue.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.TextView;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;

public class CheckableTextView extends StateListAnimatorTextView implements Checkable {
    private static final int[] b = {16842912};
    private boolean a;

    public CheckableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            TextView.mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.a);
    }

    public CheckableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rud.a(this, context);
    }
}
