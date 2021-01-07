package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.hubs.util.image.b;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: xqa  reason: default package */
public class xqa extends d.a<a> {
    private final b a;
    private final kra b;

    /* renamed from: xqa$a */
    static class a extends s51.c.a<View> {
        private final rra b;
        private final b c;
        private final kra f;

        protected a(rra rra, b bVar, kra kra) {
            super(((asa) rra).getView());
            this.b = rra;
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
            bra.a(this.b, this.c, this.f, s81, w51, pqa.c(s81.images().main()));
            ((sra) this.b).c(SpotifyIconV2.PLAYLIST);
        }
    }

    public xqa(b bVar, kra kra) {
        this.a = bVar;
        this.b = kra;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        View l = l70.l(viewGroup.getContext(), viewGroup, C0707R.layout.search_row_three_lines);
        sra sra = new sra(l, nud.m(l.getContext()));
        sra.getView().setTag(C0707R.id.glue_viewholder_tag, sra);
        return new a(sra, this.a, this.b);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
