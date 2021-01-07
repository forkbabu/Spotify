package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: sma  reason: default package */
public class sma implements d<View> {
    private final Picasso a;
    private final DisplayMetrics b;

    public sma(Picasso picasso, DisplayMetrics displayMetrics) {
        this.a = picasso;
        this.b = displayMetrics;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        View findViewById = view.findViewById(C0707R.id.podcast_charts_card_root_view);
        TextView textView = (TextView) view.findViewById(C0707R.id.podcast_charts_card_title);
        ImageView imageView = (ImageView) view.findViewById(C0707R.id.podcast_charts_card_image);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = (this.b.widthPixels / 2) - (nud.g(12.0f, view.getResources()) * 2);
        imageView.setLayoutParams(layoutParams);
        int g = (this.b.widthPixels / 2) - (nud.g(12.0f, view.getResources()) * 2);
        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
        if (layoutParams2 == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(g, -2));
        } else {
            layoutParams2.width = g;
        }
        float dimensionPixelSize = (float) imageView.getResources().getDimensionPixelSize(C0707R.dimen.podcast_charts_tile_image_corner_radius);
        String uri = s81.images().main().uri();
        if (uri != null) {
            z m = this.a.m(uri);
            m.s(C0707R.drawable.cat_placeholder_podcast);
            m.f(C0707R.drawable.cat_placeholder_podcast);
            m.o(rwd.g(imageView, com.spotify.paste.graphics.drawable.d.a(dimensionPixelSize), null));
        } else {
            this.a.b(imageView);
            imageView.setImageDrawable(null);
        }
        textView.setText(s81.text().title());
        i91.b(w51.b()).e("click").d(s81).c(view).a();
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        return je.G(viewGroup, C0707R.layout.podcast_charts_card_view, viewGroup, false);
    }
}
