package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;
import com.spotify.music.libs.search.hubs.util.image.b;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: ira  reason: default package */
public class ira extends d.a<a> {
    private final b a;
    private final kra b;

    /* renamed from: ira$a */
    static class a extends s51.c.a<View> {
        private final xra b;
        private final b c;
        private final kra f;

        protected a(xra xra, b bVar, kra kra) {
            super(((asa) xra).getView());
            this.b = xra;
            this.c = bVar;
            this.f = kra;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            xra xra = this.b;
            b bVar2 = this.c;
            kra kra = this.f;
            x81 main = s81.images().main();
            if (main == null) {
                main = z81.e().e(SpotifyIconV2.TRACK).c();
            }
            ImageConfig.a a = ImageConfig.a();
            a.c(main);
            a.b(ImageConfig.Size.SMALL);
            a.d(ImageConfig.Style.SQUARE);
            a.a(false);
            bra.a(xra, bVar2, kra, s81, w51, a.build());
        }
    }

    public ira(b bVar, kra kra) {
        this.a = bVar;
        this.b = kra;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        csa csa = new csa(l70.l(viewGroup.getContext(), viewGroup, C0707R.layout.search_row_three_lines));
        csa.getView().setTag(C0707R.id.glue_viewholder_tag, csa);
        return new a(csa, this.a, this.b);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
