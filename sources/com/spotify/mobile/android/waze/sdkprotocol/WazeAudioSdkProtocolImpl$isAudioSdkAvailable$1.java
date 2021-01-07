package com.spotify.mobile.android.waze.sdkprotocol;

import android.content.Context;
import com.waze.sdk.c;
import io.reactivex.a0;
import io.reactivex.c0;
import kotlin.f;
import kotlin.jvm.internal.h;

final class WazeAudioSdkProtocolImpl$isAudioSdkAvailable$1<T> implements c0<Boolean> {
    final /* synthetic */ Context a;

    WazeAudioSdkProtocolImpl$isAudioSdkAvailable$1(Context context) {
        this.a = context;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0<Boolean> a0Var) {
        h.e(a0Var, "emitter");
        c.u(this.a, new b(new nmf<Boolean, f>(a0Var) {
            /* class com.spotify.mobile.android.waze.sdkprotocol.WazeAudioSdkProtocolImpl$isAudioSdkAvailable$1.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.a0 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.nmf
            public f invoke(Boolean bool) {
                Boolean bool2 = bool;
                h.e(bool2, "p1");
                ((a0) this.receiver).onSuccess(bool2);
                return f.a;
            }
        }));
    }
}
