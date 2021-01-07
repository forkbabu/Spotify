package com.spotify.nowplaying.ui.components.controls.seekbar.live;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.C0707R;

public class LiveIndicatorView extends AppCompatTextView implements e {
    public LiveIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteTextAppearanceSecondary);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.live.e
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public LiveIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rud.a(this, context);
    }
}
