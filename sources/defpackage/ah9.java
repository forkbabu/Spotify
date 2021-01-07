package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.music.C0707R;
import com.spotify.music.pageloader.skeleton.RoundedRectView;

/* renamed from: ah9  reason: default package */
public final class ah9 {
    private final ShimmerFrameLayout a;

    private ah9(ShimmerFrameLayout shimmerFrameLayout, View view, RoundedRectView roundedRectView, RoundedRectView roundedRectView2) {
        this.a = shimmerFrameLayout;
    }

    public static ah9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.row_skeleton_your_library_x, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.image;
        View findViewById = inflate.findViewById(C0707R.id.image);
        if (findViewById != null) {
            i = C0707R.id.subtitle;
            RoundedRectView roundedRectView = (RoundedRectView) inflate.findViewById(C0707R.id.subtitle);
            if (roundedRectView != null) {
                i = C0707R.id.title;
                RoundedRectView roundedRectView2 = (RoundedRectView) inflate.findViewById(C0707R.id.title);
                if (roundedRectView2 != null) {
                    return new ah9((ShimmerFrameLayout) inflate, findViewById, roundedRectView, roundedRectView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public ShimmerFrameLayout a() {
        return this.a;
    }
}
