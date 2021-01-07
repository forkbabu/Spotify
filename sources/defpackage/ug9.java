package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.music.C0707R;
import com.spotify.music.pageloader.skeleton.RoundedRectView;

/* renamed from: ug9  reason: default package */
public final class ug9 {
    private final ShimmerFrameLayout a;

    private ug9(ShimmerFrameLayout shimmerFrameLayout, View view, RoundedRectView roundedRectView, RoundedRectView roundedRectView2) {
        this.a = shimmerFrameLayout;
    }

    public static ug9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.card_skeleton_your_library_x, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = 16908294;
        View findViewById = inflate.findViewById(16908294);
        if (findViewById != null) {
            i = C0707R.id.subtitle;
            RoundedRectView roundedRectView = (RoundedRectView) inflate.findViewById(C0707R.id.subtitle);
            if (roundedRectView != null) {
                i = C0707R.id.title;
                RoundedRectView roundedRectView2 = (RoundedRectView) inflate.findViewById(C0707R.id.title);
                if (roundedRectView2 != null) {
                    return new ug9((ShimmerFrameLayout) inflate, findViewById, roundedRectView, roundedRectView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public ShimmerFrameLayout a() {
        return this.a;
    }
}
