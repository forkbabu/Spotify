package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: xl9  reason: default package */
public class xl9 extends qk9<a> {
    private final zvd a;

    /* renamed from: xl9$a */
    static class a extends s51.c.a<View> {
        final Context b;
        final Rows.f c;
        final zvd f;

        public a(ViewGroup viewGroup, Rows.f fVar, zvd zvd) {
            super(fVar.getView());
            this.b = viewGroup.getContext();
            this.f = zvd;
            this.c = fVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            x81 main = s81.images().main();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            Drawable d = yc0.d(this.b, n71.a(str).or((Optional<SpotifyIconV2>) SpotifyIconV2.PLAYLIST), (float) nud.g(64.0f, this.b.getResources()));
            z d2 = this.f.d(!TextUtils.isEmpty(uri) ? Uri.parse(uri) : Uri.EMPTY);
            d2.t(d);
            d2.g(d);
            d2.m(this.c.getImageView());
            String str2 = "";
            String title = s81.text().title() != null ? s81.text().title() : str2;
            if (s81.text().subtitle() != null) {
                str2 = s81.text().subtitle();
            }
            this.c.getTitleView().setText(title);
            this.c.getSubtitleView().setText(str2);
            t51.a(w51, this.c.getView(), s81);
        }
    }

    public xl9(zvd zvd) {
        this.a = zvd;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(viewGroup, Rows.d(viewGroup.getContext(), viewGroup, 80, 8), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.free_tier_larger_row;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
