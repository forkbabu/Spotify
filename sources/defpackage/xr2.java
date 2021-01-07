package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.shortcuts.HomeShortcutsGridItemCardView;
import kotlin.jvm.internal.h;

/* renamed from: xr2  reason: default package */
public final class xr2 implements ViewPager2.i {
    private final DecelerateInterpolator a = new DecelerateInterpolator(2.0f);
    private final DecelerateInterpolator b = new DecelerateInterpolator();

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(View view, float f) {
        h.e(view, "page");
        View findViewById = view.findViewById(C0707R.id.item1);
        if (findViewById instanceof HomeShortcutsGridItemCardView) {
            float f2 = (float) 0;
            if (f <= f2) {
                float f3 = (float) 1;
                float max = Math.max(0.0f, f3 - this.a.getInterpolation(Math.abs(f)));
                if (max >= f2) {
                    ((HomeShortcutsGridItemCardView) findViewById).setAlpha(max);
                    HomeShortcutsGridItemCardView homeShortcutsGridItemCardView = (HomeShortcutsGridItemCardView) view.findViewById(C0707R.id.item2);
                    if (homeShortcutsGridItemCardView != null) {
                        homeShortcutsGridItemCardView.setAlpha(max);
                    }
                    HomeShortcutsGridItemCardView homeShortcutsGridItemCardView2 = (HomeShortcutsGridItemCardView) view.findViewById(C0707R.id.item3);
                    if (homeShortcutsGridItemCardView2 != null) {
                        homeShortcutsGridItemCardView2.setAlpha(max);
                    }
                }
                view.setAlpha(Math.max(0.0f, f3 - this.b.getInterpolation(Math.abs(f))));
                return;
            }
            view.setAlpha(Math.max(0.5f, ((float) 1) - Math.abs(f)));
        }
    }
}
