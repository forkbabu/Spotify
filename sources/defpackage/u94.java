package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.podcast.ui.topic.e;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: u94  reason: default package */
public class u94 extends d.a<a> {

    /* renamed from: u94$a */
    static class a extends s51.c.a<View> {
        private final e b;

        protected a(e eVar) {
            super(eVar.getView());
            this.b = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.b.getView(), s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.d((String) MoreObjects.firstNonNull(s81.text().title(), ""));
            View view = this.b.getView();
            if (s81.events().containsKey("click")) {
                i91.b(w51.b()).e("click").d(s81).c(view).a();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(e.b(viewGroup.getContext()));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD);
    }
}
