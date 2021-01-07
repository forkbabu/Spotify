package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: vma  reason: default package */
public class vma implements d<GlueHeaderViewV2> {
    private final wlf<u> a;
    private GlueHeaderViewV2 b;

    public vma(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
        View inflate = LayoutInflater.from(glueHeaderViewV2.getContext()).inflate(C0707R.layout.podcast_charts_header_view, (ViewGroup) glueHeaderViewV2, false);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.podcast_charts_title);
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.podcast_charts_subtitle);
        this.a.get().u(null);
        this.b.setScrollObserver(new rma(this.a.get(), new AccelerateInterpolator(2.0f)));
        if (!MoreObjects.isNullOrEmpty(s81.custom().string("color"))) {
            uma.c(this.b, Color.parseColor(s81.custom().string("color")), this.a.get());
        }
        textView2.setText(s81.text().subtitle());
        textView.setText(s81.text().title());
        glueHeaderViewV2.setContentViewBinder(new dna(inflate));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        GlueHeaderViewV2 a2 = uma.a(viewGroup);
        this.b = a2;
        return a2;
    }
}
