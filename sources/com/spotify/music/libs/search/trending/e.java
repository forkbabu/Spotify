package com.spotify.music.libs.search.trending;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.s51;
import java.util.EnumSet;

public class e extends d.a<a> {
    private final g a;

    static class a extends s51.c.a<Button> {
        private final Button b;

        protected a(Button button) {
            super(button);
            this.b = button;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.b, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.setText(s81.text().title());
            Button button = this.b;
            if (s81.events().containsKey("click")) {
                i91.b(w51.b()).e("click").d(s81).c(button).a();
            }
        }
    }

    public e(g gVar) {
        this.a = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((Button) LayoutInflater.from(viewGroup.getContext()).inflate(this.a.create(), viewGroup, false));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
