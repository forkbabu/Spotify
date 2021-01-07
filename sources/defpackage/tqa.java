package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;
import com.spotify.music.libs.search.hubs.util.image.b;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: tqa  reason: default package */
public class tqa extends d.a<a> {
    public static final String c = HubsGlue2Card.REGULAR.id();
    private final DisplayMetrics a;
    private final b b;

    /* renamed from: tqa$a */
    static class a extends s51.c.a<View> {
        private final ora b;
        private final b c;

        protected a(ora ora, b bVar) {
            super(ora.getView());
            this.b = ora;
            this.c = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.setTitle((String) MoreObjects.firstNonNull(s81.text().title(), ""));
            x81 main = s81.images().main();
            ImageView b2 = this.b.b();
            this.c.a(b2);
            if (main == null) {
                main = z81.e().e(SpotifyIconV2.PLAYLIST).c();
            }
            ImageConfig.a a = ImageConfig.a();
            a.c(main);
            a.b(ImageConfig.Size.LARGE);
            p81 custom = main.custom();
            ImageConfig.Style style = ImageConfig.Style.SQUARE;
            String string = custom.string("style", style.name());
            ImageConfig.Style style2 = ImageConfig.Style.ROUNDED_SQUARE;
            if (style2.name().equalsIgnoreCase(string)) {
                style = style2;
            }
            a.d(style);
            a.a(true);
            this.c.b(b2, a.build());
            i91.b(w51.b()).e("click").d(s81).c(this.b.getView()).a();
        }
    }

    protected tqa(DisplayMetrics displayMetrics, b bVar) {
        this.a = displayMetrics;
        this.b = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        ora ora = new ora(viewGroup, this.a);
        ora.getView().setTag(C0707R.id.glue_viewholder_tag, ora);
        return new a(ora, this.b);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
    }
}
