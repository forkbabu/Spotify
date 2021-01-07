package com.spotify.music.pageloader.skeleton;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.music.C0707R;
import com.spotify.music.pageloader.skeleton.SkeletonLayout;
import com.spotify.pageloader.w0;
import java.util.List;

public class c implements w0 {
    private final List<SkeletonLayout.b> a;
    private ShimmerFrameLayout b;
    private Runnable c;

    public c(List<SkeletonLayout.b> list) {
        this.a = list;
    }

    public /* synthetic */ void a() {
        this.b.a();
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.b;
    }

    @Override // com.spotify.pageloader.w0
    public void h(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout = this.b;
        if (shimmerFrameLayout == null) {
            return;
        }
        if (z) {
            shimmerFrameLayout.d(false);
            this.b.e();
            return;
        }
        shimmerFrameLayout.postDelayed(this.c, 500);
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        SkeletonLayout skeletonLayout = new SkeletonLayout(context);
        skeletonLayout.setComponents(this.a);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) layoutInflater.inflate(C0707R.layout.placeholder_skeleton, viewGroup, false);
        this.b = shimmerFrameLayout;
        shimmerFrameLayout.addView(skeletonLayout);
        this.c = new a(this);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        ShimmerFrameLayout shimmerFrameLayout = this.b;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.removeCallbacks(this.c);
            this.b = null;
        }
    }
}
