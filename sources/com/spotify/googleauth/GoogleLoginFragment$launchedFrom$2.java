package com.spotify.googleauth;

import android.os.Bundle;
import com.spotify.loginflow.navigation.Destination;
import defpackage.je0;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;

final class GoogleLoginFragment$launchedFrom$2 extends Lambda implements cmf<je0> {
    final /* synthetic */ GoogleLoginFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GoogleLoginFragment$launchedFrom$2(GoogleLoginFragment googleLoginFragment) {
        super(0);
        this.this$0 = googleLoginFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public je0 invoke() {
        Bundle D2 = this.this$0.D2();
        Destination.Google.SupportedSourceScreen supportedSourceScreen = null;
        Serializable serializable = D2 != null ? D2.getSerializable("launched_from_screen") : null;
        if (serializable instanceof Destination.Google.SupportedSourceScreen) {
            supportedSourceScreen = serializable;
        }
        Destination.Google.SupportedSourceScreen supportedSourceScreen2 = supportedSourceScreen;
        if (supportedSourceScreen2 != null) {
            int ordinal = supportedSourceScreen2.ordinal();
            if (ordinal == 0) {
                return je0.o.b;
            }
            if (ordinal == 1) {
                return je0.b.b;
            }
        }
        return je0.o.b;
    }
}
