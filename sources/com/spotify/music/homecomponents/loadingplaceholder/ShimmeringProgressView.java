package com.spotify.music.homecomponents.loadingplaceholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.music.C0707R;

public class ShimmeringProgressView extends FrameLayout {
    private ShimmerFrameLayout a;

    public ShimmeringProgressView(Context context) {
        super(context);
        a();
    }

    public void a() {
        LayoutInflater.from(getContext()).inflate(C0707R.layout.home_skeleton_placeholder, (ViewGroup) this, true);
        this.a = (ShimmerFrameLayout) findViewById(C0707R.id.shimmerLayout);
    }

    public void setShimmering(boolean z) {
        if (z) {
            this.a.d(true);
        } else {
            this.a.a();
        }
    }

    public ShimmeringProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ShimmeringProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
