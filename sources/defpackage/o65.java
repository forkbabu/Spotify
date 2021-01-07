package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.b;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.goldenpath.a;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: o65  reason: default package */
public class o65 implements Object<GlueHeaderViewV2>, pk9 {
    private final zvd a;
    private final wlf<u> b;
    private final g85 c;
    private final j85 f;

    public o65(zvd zvd, g85 g85, wlf<u> wlf, j85 j85) {
        this.a = zvd;
        this.c = g85;
        this.b = wlf;
        this.f = j85;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
        View inflate = LayoutInflater.from(glueHeaderViewV2.getContext()).inflate(C0707R.layout.full_bleed_header, (ViewGroup) glueHeaderViewV2, false);
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.img_picture);
        View findViewById = inflate.findViewById(C0707R.id.image_overlay);
        View findViewById2 = inflate.findViewById(C0707R.id.title_subtitle_container);
        x81 main = s81.images().main();
        String uri = main != null ? main.uri() : null;
        this.c.a(imageView);
        z e = this.a.e(uri);
        e.s(C0707R.drawable.placeholder_background);
        e.n(imageView, new n65(this, imageView));
        this.c.b(imageView);
        String a2 = this.f.a(s81.text().title());
        String subtitle = s81.text().subtitle() != null ? s81.text().subtitle() : "";
        TextView textView = (TextView) findViewById2.findViewById(C0707R.id.txt_title);
        TextView textView2 = (TextView) findViewById2.findViewById(C0707R.id.txt_subtitle);
        textView.setText(a2);
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(1);
        } else if (textView instanceof b) {
            ((b) textView).setAutoSizeTextTypeWithDefaults(1);
        }
        textView2.setText(subtitle);
        glueHeaderViewV2.setContentViewBinder(new p85(inflate, imageView, findViewById, findViewById2));
        glueHeaderViewV2.setContentBottomMargin(inflate.getResources().getDimensionPixelSize(C0707R.dimen.full_bleed_header_margin_bottom));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.header_full_bleed;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    public /* synthetic */ void f(Interpolator interpolator, float f2) {
        this.b.get().o(interpolator.getInterpolation(f2));
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        Context context = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        this.b.get().o(0.0f);
        glueHeaderViewV2.setStickyAreaSize(a.d(context) + nud.l(context, C0707R.attr.actionBarSize) + (context.getResources().getDimensionPixelSize(C0707R.dimen.solar_button_height) / 2));
        glueHeaderViewV2.setScrollObserver(new m65(this, new AccelerateInterpolator(2.0f)));
        return glueHeaderViewV2;
    }
}
