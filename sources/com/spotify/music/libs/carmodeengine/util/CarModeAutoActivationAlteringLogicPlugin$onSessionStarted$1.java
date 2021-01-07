package com.spotify.music.libs.carmodeengine.util;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class CarModeAutoActivationAlteringLogicPlugin$onSessionStarted$1 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    CarModeAutoActivationAlteringLogicPlugin$onSessionStarted$1(CarModeAutoActivationAlteringLogicPlugin carModeAutoActivationAlteringLogicPlugin) {
        super(1, carModeAutoActivationAlteringLogicPlugin, CarModeAutoActivationAlteringLogicPlugin.class, "onCarDetectionStateChanged", "onCarDetectionStateChanged(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        CarModeAutoActivationAlteringLogicPlugin.c((CarModeAutoActivationAlteringLogicPlugin) this.receiver, bool.booleanValue());
        return f.a;
    }
}
