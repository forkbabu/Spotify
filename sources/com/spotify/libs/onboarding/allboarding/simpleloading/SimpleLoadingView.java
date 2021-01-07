package com.spotify.libs.onboarding.allboarding.simpleloading;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class SimpleLoadingView extends ConstraintLayout {
    private final TextView a;

    public SimpleLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setTitle(String str) {
        h.e(str, "title");
        this.a.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        ViewGroup.inflate(context, C0707R.layout.simple_loading_view, this);
        View G = q4.G(this, C0707R.id.loading_text);
        h.d(G, "ViewCompat.requireViewBy…(this, R.id.loading_text)");
        this.a = (TextView) G;
    }
}
