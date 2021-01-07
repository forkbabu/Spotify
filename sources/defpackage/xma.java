package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: xma  reason: default package */
public class xma implements d<GlueHeaderViewV2> {
    private final Picasso a;
    private final Drawable b;
    private final wlf<u> c;
    private GlueHeaderViewV2 f;

    public xma(Picasso picasso, Context context, wlf<u> wlf) {
        this.a = picasso;
        this.b = yc0.l(context, SpotifyIconV2.PODCASTS);
        this.c = wlf;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
        View inflate = LayoutInflater.from(glueHeaderViewV2.getContext()).inflate(C0707R.layout.podcast_charts_list_header_view, (ViewGroup) glueHeaderViewV2, false);
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.podcast_charts_list_header_tile_image);
        uma.c(this.f, Color.parseColor(s81.custom().string("color")), this.c.get());
        this.f.setScrollObserver(new rma(this.c.get(), new AccelerateInterpolator(2.0f)));
        ((TextView) inflate.findViewById(C0707R.id.podcast_charts_list_header_subtitle)).setText(s81.text().subtitle());
        ((TextView) inflate.findViewById(C0707R.id.podcast_charts_list_header_title)).setText(s81.text().title());
        ((TextView) inflate.findViewById(C0707R.id.podcast_charts_list_header_description)).setText(s81.text().description());
        String uri = s81.images().main().uri();
        float dimensionPixelSize = (float) imageView.getResources().getDimensionPixelSize(C0707R.dimen.podcast_charts_tile_image_corner_radius);
        if (uri != null) {
            z m = this.a.m(uri);
            m.t(this.b);
            m.g(this.b);
            m.o(rwd.g(imageView, com.spotify.paste.graphics.drawable.d.a(dimensionPixelSize), null));
        } else {
            this.a.b(imageView);
            imageView.setImageDrawable(this.b);
        }
        glueHeaderViewV2.setContentViewBinder(new dna(inflate));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        GlueHeaderViewV2 a2 = uma.a(viewGroup);
        this.f = a2;
        return a2;
    }
}
