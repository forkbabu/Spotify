package com.spotify.music.libs.carmodeengine.util;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class CarModeAutoActivationAlteringLogicPlugin$onSessionStarted$2 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    CarModeAutoActivationAlteringLogicPlugin$onSessionStarted$2(CarModeAutoActivationAlteringLogicPlugin carModeAutoActivationAlteringLogicPlugin) {
        super(1, carModeAutoActivationAlteringLogicPlugin, CarModeAutoActivationAlteringLogicPlugin.class, "onManualOptInStateChanged", "onManualOptInStateChanged(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        CarModeAutoActivationAlteringLogicPlugin.e((CarModeAutoActivationAlteringLogicPlugin) this.receiver, bool.booleanValue());
        return f.a;
    }
}
