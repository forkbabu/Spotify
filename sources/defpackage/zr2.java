package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.shelf.CarModeCardView;
import com.spotify.music.carmodehome.view.title.HomeTitleView;
import kotlin.jvm.internal.h;

/* renamed from: zr2  reason: default package */
public final class zr2 {

    /* renamed from: zr2$a */
    private static final class a {
        private final boolean a;
        private final int b;

        public a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        public final boolean a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return (i * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FittingParams(singleLineText=");
            V0.append(this.a);
            V0.append(", viewPagerPaddingRight=");
            return je.B0(V0, this.b, ")");
        }

        public a(boolean z, int i, int i2) {
            i = (i2 & 2) != 0 ? 0 : i;
            this.a = z;
            this.b = i;
        }
    }

    public static final void a(LayoutInflater layoutInflater, HomeTitleView homeTitleView, ViewPager2 viewPager2) {
        a aVar;
        h.e(layoutInflater, "inflater");
        h.e(homeTitleView, "titleView");
        h.e(viewPager2, "container");
        View inflate = layoutInflater.inflate(C0707R.layout.home_shelf_page, (ViewGroup) viewPager2, false);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(viewPager2.getWidth(), 1073741824), 0);
        h.d(inflate, "shelfPage");
        int measuredHeight = inflate.getMeasuredHeight();
        View findViewById = inflate.findViewById(C0707R.id.item1);
        h.d(findViewById, "shelfView.findViewById<C…ModeCardView>(R.id.item1)");
        ImageView imageView = ((CarModeCardView) findViewById).getImageView();
        h.d(imageView, "shelfView.findViewById<C…ew>(R.id.item1).imageView");
        float measuredHeight2 = (((float) measuredHeight) + (((float) imageView.getMeasuredHeight()) * 0.1f)) / ((float) viewPager2.getWidth());
        if (measuredHeight2 > ((float) (viewPager2.getHeight() - viewPager2.getPaddingTop())) / ((float) viewPager2.getWidth())) {
            float height = ((float) viewPager2.getHeight()) - (((float) homeTitleView.getTop()) + ((((float) (homeTitleView.getHeight() - homeTitleView.getPaddingTop())) / 2.0f) + ((float) homeTitleView.getPaddingTop())));
            if (measuredHeight2 > height / ((float) viewPager2.getWidth())) {
                aVar = new a(true, (int) ((float) Math.ceil((double) (((((float) viewPager2.getWidth()) * measuredHeight2) - height) / measuredHeight2))));
            } else {
                aVar = new a(true, 0, 2);
            }
        } else {
            aVar = new a(false, 0, 2);
        }
        if (homeTitleView.isSingleLine() != aVar.a()) {
            homeTitleView.setSingleLine(aVar.a());
        }
        if (viewPager2.getPaddingRight() != aVar.b()) {
            viewPager2.setPadding(viewPager2.getPaddingLeft(), viewPager2.getPaddingTop(), aVar.b(), viewPager2.getPaddingBottom());
        }
    }
}
