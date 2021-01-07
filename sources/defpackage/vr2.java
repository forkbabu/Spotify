package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.shelf.CarModeCardView;
import kotlin.jvm.internal.h;

/* renamed from: vr2  reason: default package */
public final class vr2 implements ViewPager2.i {
    private final DecelerateInterpolator a = new DecelerateInterpolator(2.0f);
    private final DecelerateInterpolator b = new DecelerateInterpolator();

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(View view, float f) {
        h.e(view, "page");
        View findViewById = view.findViewById(C0707R.id.item1);
        if (findViewById instanceof CarModeCardView) {
            float f2 = (float) 0;
            if (f <= f2) {
                float f3 = (float) 1;
                float max = Math.max(0.0f, f3 - this.a.getInterpolation(Math.abs(f)));
                if (max >= f2) {
                    ((CarModeCardView) findViewById).setAlpha(max);
                    CarModeCardView carModeCardView = (CarModeCardView) view.findViewById(C0707R.id.item2);
                    if (carModeCardView != null) {
                        carModeCardView.setAlpha(max);
                    }
                }
                view.setAlpha(Math.max(0.0f, f3 - this.b.getInterpolation(Math.abs(f))));
                return;
            }
            view.setAlpha(Math.max(0.5f, ((float) 1) - Math.abs(f)));
        }
    }
}
