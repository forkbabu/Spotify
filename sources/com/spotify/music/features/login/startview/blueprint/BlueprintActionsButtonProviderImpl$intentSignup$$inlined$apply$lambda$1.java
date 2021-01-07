package com.spotify.music.features.login.startview.blueprint;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.libs.pse.model.a;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class BlueprintActionsButtonProviderImpl$intentSignup$$inlined$apply$lambda$1 extends Lambda implements nmf<AuthenticationButton.AuthenticationType, nmf<? super AuthenticationButton.Events, ? extends f>> {
    final /* synthetic */ a.C0166a $intentLed$inlined;
    final /* synthetic */ List $this_apply$inlined;
    final /* synthetic */ BlueprintActionsButtonProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlueprintActionsButtonProviderImpl$intentSignup$$inlined$apply$lambda$1(List list, BlueprintActionsButtonProviderImpl blueprintActionsButtonProviderImpl, a.C0166a aVar) {
        super(1);
        this.$this_apply$inlined = list;
        this.this$0 = blueprintActionsButtonProviderImpl;
        this.$intentLed$inlined = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public nmf<? super AuthenticationButton.Events, ? extends f> invoke(AuthenticationButton.AuthenticationType authenticationType) {
        AuthenticationButton.AuthenticationType authenticationType2 = authenticationType;
        h.e(authenticationType2, "it");
        if (authenticationType2.ordinal() != 4) {
            return null;
        }
        BlueprintActionsButtonProviderImpl blueprintActionsButtonProviderImpl = this.this$0;
        blueprintActionsButtonProviderImpl.getClass();
        return new BlueprintActionsButtonProviderImpl$getIntentEmailEvent$1(blueprintActionsButtonProviderImpl);
    }
}
