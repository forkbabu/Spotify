package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;

/* renamed from: po9  reason: default package */
public class po9 {
    private final DisplayMetrics a;
    private final Resources b;

    public po9(DisplayMetrics displayMetrics, Resources resources) {
        this.a = displayMetrics;
        this.b = resources;
    }

    /* access modifiers changed from: package-private */
    public int a(float f, int i) {
        return Math.min((int) (((float) this.a.widthPixels) * f), nud.g((float) i, this.b));
    }

    public void b(ImageView imageView, HomeCardViewBinder.CardSize cardSize) {
        int i;
        imageView.getClass();
        cardSize.getClass();
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = a(cardSize.mPercentage, cardSize.mMaxWidth);
        if (cardSize == HomeCardViewBinder.CardSize.LARGE || cardSize == HomeCardViewBinder.CardSize.MEDIUM) {
            i = nud.g(12.0f, this.b);
        } else {
            i = nud.g(7.0f, this.b);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void c(View view, HomeCardViewBinder.CardSize cardSize) {
        view.getClass();
        int a2 = a(cardSize.mPercentage, cardSize.mMaxWidth);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(a2, -2));
        } else {
            layoutParams.width = a2;
        }
    }
}
