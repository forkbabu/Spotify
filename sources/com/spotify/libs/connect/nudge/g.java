package com.spotify.libs.connect.nudge;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import io.reactivex.functions.l;
import kotlin.Pair;
import kotlin.jvm.internal.h;

final class g<T, R> implements l<ConnectVolumeControlInstrumentation.ApplicationState, Pair<? extends Boolean, ? extends Boolean>> {
    public static final g a = new g();

    g() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Pair<? extends Boolean, ? extends Boolean> apply(ConnectVolumeControlInstrumentation.ApplicationState applicationState) {
        ConnectVolumeControlInstrumentation.ApplicationState applicationState2 = applicationState;
        h.e(applicationState2, "it");
        ConnectVolumeControlInstrumentation.ApplicationState applicationState3 = ConnectVolumeControlInstrumentation.ApplicationState.BACKGROUND_LOCKSCREEN;
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(applicationState2 == applicationState3);
        if (applicationState2 == applicationState3) {
            z = true;
        }
        return new Pair<>(valueOf, Boolean.valueOf(z));
    }
}
