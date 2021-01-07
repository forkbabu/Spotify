package com.spotify.mobile.android.hubframework.defaults.fallbacks;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.libs.viewuri.c;
import defpackage.s51;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
public final class d implements com.spotify.mobile.android.hubframework.defaults.d<View> {
    private final SpotifyHubsFallbackUsageReporter a;

    public d(c.a aVar) {
        this.a = new SpotifyHubsFallbackUsageReporter(aVar);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        this.a.a("Action on ignored model", s81);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        this.a.a("Ignored model", s81);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        return new Space(viewGroup.getContext());
    }
}
