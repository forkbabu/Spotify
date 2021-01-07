package com.spotify.music.features.login.startview.cta;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.loginflow.navigation.Destination;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class StartButtonProviderImpl$onEmailMethodLed$1 extends Lambda implements nmf<AuthenticationButton.Events, f> {
    final /* synthetic */ e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartButtonProviderImpl$onEmailMethodLed$1(e eVar) {
        super(1);
        this.this$0 = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(AuthenticationButton.Events events) {
        h.e(events, "it");
        this.this$0.a.a(new ce0.c(je0.o.b, fe0.a.b, ge0.k.b));
        this.this$0.b.b(new Destination.BlueprintActions(Destination.BlueprintActions.Mode.METHOD_LED));
        return f.a;
    }
}
