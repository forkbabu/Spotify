package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.Assertion;
import defpackage.s51;
import java.util.EnumSet;

public class t extends i<r90> {
    public t() {
        super(EnumSet.of(GlueLayoutTraits.Trait.STACKABLE), r90.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g90, s81, w51, s51$b] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public void a(r90 r90, s81 s81, w51 w51, s51.b bVar) {
        r90 r902 = r90;
        String description = s81.text().description();
        Assertion.l(description != null, "description not set");
        r902.I(s81.custom().intValue("maxLines", Integer.MAX_VALUE));
        r902.setText(description);
    }

    /* Return type fixed from 'g90' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public r90 f(Context context, ViewGroup viewGroup, w51 w51) {
        return e90.d().b(context, viewGroup, Integer.MAX_VALUE);
    }
}
