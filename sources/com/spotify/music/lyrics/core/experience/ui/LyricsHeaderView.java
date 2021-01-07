package com.spotify.music.lyrics.core.experience.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.h;

public final class LyricsHeaderView extends AppCompatTextView {
    public LyricsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int getVisibleHeight() {
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        return rect.bottom - rect.top;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LyricsHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
