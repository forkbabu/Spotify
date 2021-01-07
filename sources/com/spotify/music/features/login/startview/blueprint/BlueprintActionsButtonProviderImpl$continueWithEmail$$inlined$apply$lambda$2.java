package com.spotify.music.features.login.startview.blueprint;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.libs.pse.model.a;
import com.spotify.loginflow.navigation.Destination;
import defpackage.fe0;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class BlueprintActionsButtonProviderImpl$continueWithEmail$$inlined$apply$lambda$2 extends Lambda implements nmf<AuthenticationButton.Events, f> {
    final /* synthetic */ a.b $methodLed$inlined;
    final /* synthetic */ BlueprintActionsButtonProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlueprintActionsButtonProviderImpl$continueWithEmail$$inlined$apply$lambda$2(BlueprintActionsButtonProviderImpl blueprintActionsButtonProviderImpl, a.b bVar) {
        super(1);
        this.this$0 = blueprintActionsButtonProviderImpl;
        this.$methodLed$inlined = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(AuthenticationButton.Events events) {
        h.e(events, "it");
        BlueprintActionsButtonProviderImpl.e(this.this$0, fe0.l.b);
        BlueprintActionsButtonProviderImpl.d(this.this$0).b(new Destination.e(null, null, 3));
        return f.a;
    }
}
