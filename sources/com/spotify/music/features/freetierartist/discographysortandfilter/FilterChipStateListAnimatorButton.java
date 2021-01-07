package com.spotify.music.features.freetierartist.discographysortandfilter;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.paste.widgets.internal.StateListAnimatorToggleButton;
import kotlin.jvm.internal.h;

public final class FilterChipStateListAnimatorButton extends StateListAnimatorToggleButton {
    public FilterChipStateListAnimatorButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public final void setFilterSelected(boolean z) {
        super.setChecked(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterChipStateListAnimatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setGravity(17);
    }
}
