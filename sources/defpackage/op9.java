package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: op9  reason: default package */
public class op9 implements Object<View>, pk9 {
    private final Context a;
    private final Picasso b;
    private final m71 c;

    public op9(Context context, Picasso picasso, m71 m71) {
        this.a = context;
        this.b = picasso;
        this.c = m71;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        Drawable drawable;
        rp9 rp9 = (rp9) l70.o(view, rp9.class);
        if (MoreObjects.isNullOrEmpty(s81.text().title()) || MoreObjects.isNullOrEmpty(s81.text().subtitle())) {
            rp9.reset();
            return;
        }
        rp9.setTitle(s81.text().title());
        rp9.setSubtitle(s81.text().subtitle());
        x81 main = s81.images().main();
        Uri parse = main != null ? Uri.parse(main.uri()) : Uri.EMPTY;
        if (main == null || TextUtils.isEmpty(main.placeholder())) {
            drawable = a.d(this.a, C0707R.color.image_placeholder_color);
        } else {
            drawable = this.c.b(main.placeholder(), HubsGlueImageConfig.THUMBNAIL);
        }
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        rp9.a(parse, drawable, str);
        i91.b(w51.b()).e("click").d(s81).c(rp9.getView()).a();
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_tappable_section_header;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.SPACED_VERTICALLY);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        qp9 qp9 = new qp9(viewGroup.getContext(), viewGroup, this.b);
        qp9.getView().setTag(C0707R.id.glue_viewholder_tag, qp9);
        return qp9.getView();
    }
}
