package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.lifecycle.n;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

public class g implements Object<View>, pk9 {
    private final n a;
    private final aq9 b;
    private final HomeInlineOnboardingDoneButtonLogger c;

    public g(aq9 aq9, n nVar, HomeInlineOnboardingDoneButtonLogger homeInlineOnboardingDoneButtonLogger) {
        this.b = aq9;
        this.a = nVar;
        this.c = homeInlineOnboardingDoneButtonLogger;
    }

    public void a(j jVar, Integer num) {
        boolean z = num.intValue() >= 3;
        jVar.P1(z);
        if (z) {
            this.c.b();
        }
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        j jVar = (j) l70.o(view, j.class);
        boolean z = true;
        jVar.setTitle(jVar.getView().getContext().getResources().getQuantityString(C0707R.plurals.home_inline_onboarding_header_title, 3, 3));
        Context context = jVar.getView().getContext();
        o61 b2 = w51.b();
        Button button = (Button) jVar.Y();
        button.setOnClickListener(new d(button, context, (ProgressBar) jVar.A(), b2, n61.b("inlineOnboardingDoneClick", s81)));
        if (this.b.d() < 3) {
            z = false;
        }
        jVar.P1(z);
        if (z) {
            this.c.b();
        }
        this.b.e().h(this.a, new c(this, jVar));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_inline_onboarding_header;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        i iVar = new i(viewGroup);
        iVar.getView().setTag(C0707R.id.glue_viewholder_tag, iVar);
        return iVar.getView();
    }
}
