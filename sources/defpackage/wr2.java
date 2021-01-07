package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.shelf.CarModeCardView;
import kotlin.jvm.internal.h;

/* renamed from: wr2  reason: default package */
public final class wr2 implements ViewPager2.i {
    private float a;
    private float b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(View view, float f) {
        float f2;
        float f3;
        View view2;
        h.e(view, "page");
        if (view.findViewById(C0707R.id.item1) instanceof CarModeCardView) {
            CarModeCardView carModeCardView = (CarModeCardView) view.findViewById(C0707R.id.item1);
            if (carModeCardView != null) {
                ImageView imageView = carModeCardView.getImageView();
                h.d(imageView, "it.imageView");
                f2 = ((float) imageView.getHeight()) * 0.5f;
            } else {
                f2 = this.a;
            }
            this.a = f2;
            if (carModeCardView != null) {
                ImageView imageView2 = carModeCardView.getImageView();
                h.d(imageView2, "it.imageView");
                f3 = ((float) imageView2.getHeight()) * 0.1f;
            } else {
                f3 = this.b;
            }
            this.b = f3;
            ViewGroup viewGroup = (ViewGroup) view;
            w4 w4Var = (w4) ((v4) e4.b(viewGroup)).iterator();
            if (!w4Var.hasNext()) {
                view2 = null;
            } else {
                Object next = w4Var.next();
                if (w4Var.hasNext()) {
                    int bottom = ((View) next).getBottom();
                    do {
                        Object next2 = w4Var.next();
                        int bottom2 = ((View) next2).getBottom();
                        if (bottom < bottom2) {
                            next = next2;
                            bottom = bottom2;
                        }
                    } while (w4Var.hasNext());
                }
                view2 = next;
            }
            if (view2 != null) {
                float b2 = knf.b(((float) (viewGroup.getHeight() - view2.getBottom())) * 0.33333334f, this.b, this.a);
                if (b2 > ((float) 0)) {
                    viewGroup.setTranslationY((-b2) * f);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
