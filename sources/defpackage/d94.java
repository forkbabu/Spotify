package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: d94  reason: default package */
public class d94 extends d.a<a> {
    private final Picasso a;
    private final Context b;

    /* renamed from: d94$a */
    static class a extends s51.c.a<View> {
        private final f94 b;
        private final Picasso c;
        private final Context f;

        public a(f94 f94, Picasso picasso, Context context) {
            super(f94.getView());
            this.b = f94;
            this.c = picasso;
            this.f = context;
        }

        private void C(String str, String str2, f0 f0Var) {
            Optional<V> transform = n71.a(str2).transform(new c94(this));
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            z m = this.c.m(str);
            if (transform.isPresent()) {
                m.t(transform.get());
                m.g(transform.get());
            }
            m.o(f0Var);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        public Drawable B(SpotifyIconV2 spotifyIconV2) {
            return yc0.d(this.f, spotifyIconV2, (float) nud.g((float) 64, this.f.getResources()));
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            i91.b(w51.b()).e("click").d(s81).c(this.b.getView()).a();
            this.b.g().a(s81.text().accessory(), s81.text().title(), s81.text().subtitle(), s81.text().description());
            x81 background = s81.images().background();
            String str = null;
            C(background != null ? background.uri() : null, background != null ? background.placeholder() : null, this.b.b());
            x81 x81 = (x81) s81.images().custom().get("logo");
            C(x81 != null ? x81.uri() : null, null, this.b.c());
            x81 main = s81.images().main();
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            C(uri, str, this.b.d());
        }
    }

    public d94(Picasso picasso, Context context) {
        this.a = picasso;
        this.b = context;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(new f94(viewGroup), this.a, this.b);
    }

    @Override // defpackage.s51.c, defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD);
    }
}
