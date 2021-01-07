package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: ora  reason: default package */
public final class ora implements g90 {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final DisplayMetrics f;

    public ora(ViewGroup viewGroup, DisplayMetrics displayMetrics) {
        h.e(viewGroup, "parent");
        h.e(displayMetrics, "displayMetrics");
        this.f = displayMetrics;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.search_card, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…arch_card, parent, false)");
        this.a = inflate;
        View findViewById = inflate.findViewById(C0707R.id.card_image);
        h.d(findViewById, "view.findViewById(R.id.card_image)");
        ImageView imageView = (ImageView) findViewById;
        this.b = imageView;
        View findViewById2 = inflate.findViewById(C0707R.id.card_title);
        h.d(findViewById2, "view.findViewById(R.id.card_title)");
        TextView textView = (TextView) findViewById2;
        this.c = textView;
        bvd b2 = dvd.b(inflate);
        b2.f(imageView);
        b2.g(textView);
        b2.a();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = Math.min((int) (((float) displayMetrics.widthPixels) * 0.3f), inflate.getResources().getDimensionPixelSize(C0707R.dimen.card_max_width));
            imageView.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public ImageView b() {
        return this.b;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    public void setTitle(CharSequence charSequence) {
        h.e(charSequence, "title");
        this.c.setText(charSequence);
    }
}
