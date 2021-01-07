package com.spotify.music.premiummini;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class PremiumMiniPlugin$onUiVisible$2 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    PremiumMiniPlugin$onUiVisible$2(PremiumMiniPlugin premiumMiniPlugin) {
        super(1, premiumMiniPlugin, PremiumMiniPlugin.class, "updatePremiumMiniEnabled", "updatePremiumMiniEnabled(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        PremiumMiniPlugin.h((PremiumMiniPlugin) this.receiver, bool.booleanValue());
        return f.a;
    }
}
