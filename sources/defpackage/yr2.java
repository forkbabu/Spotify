package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.shortcuts.HomeShortcutsItemCardView;
import kotlin.jvm.internal.h;

/* renamed from: yr2  reason: default package */
public final class yr2 implements ViewPager2.i {
    private final Interpolator a = h5.a(0.0f, 1.0f, 1.0f, 0.8f);
    private final Integer[] b = {Integer.valueOf((int) C0707R.id.item1), Integer.valueOf((int) C0707R.id.item2), Integer.valueOf((int) C0707R.id.item3), Integer.valueOf((int) C0707R.id.item4)};

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(View view, float f) {
        h.e(view, "page");
        if (view.findViewById(C0707R.id.item1) instanceof HomeShortcutsItemCardView) {
            if (f <= ((float) 0)) {
                for (Integer num : this.b) {
                    HomeShortcutsItemCardView homeShortcutsItemCardView = (HomeShortcutsItemCardView) view.findViewById(num.intValue());
                    float height = ((float) view.getHeight()) / 2.0f;
                    h.d(homeShortcutsItemCardView, "row");
                    homeShortcutsItemCardView.setAlpha(((float) 1) - this.a.getInterpolation(Math.abs(knf.b(Math.min(f, (((height - ((float) homeShortcutsItemCardView.getTop())) * (f / ((float) 2))) / height) + f), -1.0f, 0.0f))));
                }
            }
        }
    }
}
