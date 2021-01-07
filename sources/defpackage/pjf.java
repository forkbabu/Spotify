package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: pjf  reason: default package */
public class pjf implements Object<View>, pk9 {
    private final Picasso a;
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();

    /* renamed from: pjf$a */
    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            Logger.b("Stopping PlayerState subscription in Playable card component", new Object[0]);
            pjf.this.b.f();
        }
    }

    public pjf(Picasso picasso, k kVar) {
        this.a = picasso;
        kVar.y0(new a());
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        sjf sjf = (sjf) l70.o(view, sjf.class);
        sjf.setTitle(s81.text().title());
        String string = s81.custom().string("accentColor");
        if (!TextUtils.isEmpty(string) && wjf.a(string)) {
            sjf.X1(Color.parseColor(s81.custom().string("accentColor")));
        } else {
            sjf.V();
        }
        x81 background = s81.images().background();
        String str = null;
        sjf.B(background != null ? background.uri() : null, background != null ? background.placeholder() : null);
        sjf.setSubtitle(s81.text().subtitle());
        sjf.j(s81.custom().string("label"));
        i91.b(w51.b()).e("click").d(s81).c(sjf.getView()).a();
        i91.b(w51.b()).e("click").d(s81).c(sjf.L0()).a();
        sjf.setTitle(s81.text().title());
        x81 main = s81.images().main();
        if (main != null) {
            str = main.uri();
        }
        if (str != null) {
            sjf.s0(str, main.placeholder());
        } else {
            sjf.Y0();
        }
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.artist_fan_funding;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.TOP_ITEM);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        rjf rjf = new rjf(this.a, viewGroup);
        rjf.getView().setTag(C0707R.id.glue_viewholder_tag, rjf);
        return rjf.getView();
    }
}
