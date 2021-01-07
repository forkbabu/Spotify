package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

public class CircleFrameLayout extends FrameLayout {

    private static class a extends ViewOutlineProvider {
        final int a;
        final int b;
        final int c;
        final int d;

        a(int i, int i2, int i3) {
            this.a = i - i3;
            this.b = i2 - i3;
            this.c = i + i3;
            this.d = i2 + i3;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(this.a, this.b, this.c, this.d);
        }
    }

    public CircleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        setOutlineProvider(new a(Math.round(((float) i) / 2.0f), Math.round(((float) i2) / 2.0f), (int) Math.floor((double) (((float) Math.min(i, i2)) / 2.0f))));
    }

    public CircleFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipToOutline(true);
    }
}
