package com.spotify.signup.splitflow.agreements;

import android.widget.CompoundButton;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class KoreanAgreementsView$setupToggles$listener$1 extends Lambda implements rmf<CompoundButton, Boolean, f> {
    final /* synthetic */ KoreanAgreementsView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KoreanAgreementsView$setupToggles$listener$1(KoreanAgreementsView koreanAgreementsView) {
        super(2);
        this.this$0 = koreanAgreementsView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(CompoundButton compoundButton, Boolean bool) {
        bool.booleanValue();
        h.e(compoundButton, "<anonymous parameter 0>");
        KoreanAgreementsView.a(this.this$0);
        return f.a;
    }
}
