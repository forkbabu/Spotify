package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.music.C0707R;
import com.spotify.music.pageloader.skeleton.RoundedRectView;

/* renamed from: yg9  reason: default package */
public final class yg9 {
    private final ShimmerFrameLayout a;

    private yg9(ShimmerFrameLayout shimmerFrameLayout, View view, RoundedRectView roundedRectView) {
        this.a = shimmerFrameLayout;
    }

    public static yg9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.row_circular_skeleton_your_library_x, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.image;
        View findViewById = inflate.findViewById(C0707R.id.image);
        if (findViewById != null) {
            i = C0707R.id.title;
            RoundedRectView roundedRectView = (RoundedRectView) inflate.findViewById(C0707R.id.title);
            if (roundedRectView != null) {
                return new yg9((ShimmerFrameLayout) inflate, findViewById, roundedRectView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public ShimmerFrameLayout a() {
        return this.a;
    }
}
