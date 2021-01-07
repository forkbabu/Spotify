package com.spotify.music.utterancesuggestions;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentIdentifier;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentText;
import defpackage.s81;
import defpackage.w81;
import kotlin.collections.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class RxUtteranceSuggetionSearch$appendUtteranceTo$1 extends Lambda implements nmf<f, b91> {
    final /* synthetic */ b91 $original;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RxUtteranceSuggetionSearch$appendUtteranceTo$1(b91 b91) {
        super(1);
        this.$original = b91;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public b91 invoke(f fVar) {
        f fVar2 = fVar;
        h.e(fVar2, "utterance");
        s81.a a = HubsImmutableComponentModel.Companion.a();
        HubsImmutableComponentIdentifier.b bVar = HubsImmutableComponentIdentifier.Companion;
        String d = HubsComponentCategory.CARD.d();
        h.d(d, "HubsComponentCategory.CARD.id");
        s81.a n = a.n(bVar.a("utteranceSuggestion:utteranceSuggestionComponent", d));
        w81.a a2 = HubsImmutableComponentText.Companion.a();
        StringBuilder S0 = je.S0('\"');
        S0.append(fVar2.a());
        S0.append('\"');
        return this.$original.toBuilder().e(d.C(d.t(n.y(a2.a(S0.toString())).l()), this.$original.body())).g();
    }
}
