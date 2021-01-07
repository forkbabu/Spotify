package com.spotify.music.features.login.startview.cta;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class StartButtonProviderImpl$methodLed$$inlined$apply$lambda$1 extends Lambda implements nmf<AuthenticationButton.AuthenticationType, nmf<? super AuthenticationButton.Events, ? extends f>> {
    final /* synthetic */ List $authMethods$inlined;
    final /* synthetic */ List $this_apply$inlined;
    final /* synthetic */ e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartButtonProviderImpl$methodLed$$inlined$apply$lambda$1(List list, e eVar, List list2) {
        super(1);
        this.$this_apply$inlined = list;
        this.this$0 = eVar;
        this.$authMethods$inlined = list2;
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
        e eVar = this.this$0;
        eVar.getClass();
        return new StartButtonProviderImpl$onEmailMethodLed$1(eVar);
    }
}
