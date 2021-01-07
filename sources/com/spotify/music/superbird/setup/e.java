package com.spotify.music.superbird.setup;

import androidx.lifecycle.v;
import com.spotify.music.superbird.setup.g;

final class e<T> implements v<g> {
    final /* synthetic */ SuperbirdSetupFragment a;

    e(SuperbirdSetupFragment superbirdSetupFragment) {
        this.a = superbirdSetupFragment;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.v
    public void a(g gVar) {
        g gVar2 = gVar;
        if (gVar2 instanceof g.c) {
            SuperbirdSetupFragment.O4(this.a).setVisibility(8);
            SuperbirdSetupFragment.L4(this.a).setVisibility(0);
            g.c cVar = (g.c) gVar2;
            SuperbirdSetupFragment.K4(this.a).setText(cVar.a());
            SuperbirdSetupFragment.N4(this.a).setText(cVar.b());
            SuperbirdSetupFragment.M4(this.a).setVisibility(8);
        } else if (gVar2 instanceof g.d) {
            SuperbirdSetupFragment.L4(this.a).setVisibility(8);
            SuperbirdSetupFragment.O4(this.a).setVisibility(0);
            SuperbirdSetupFragment.M4(this.a).setVisibility(8);
        } else if (gVar2 instanceof g.b) {
            SuperbirdSetupFragment.M4(this.a).setVisibility(0);
        } else {
            boolean z = gVar2 instanceof g.a;
        }
    }
}
