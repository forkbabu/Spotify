package com.spotify.music.features.login.startview.cta;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.b;
import defpackage.fe0;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class AuthButtonOnClickProvider$onClickFacebook$1 extends Lambda implements nmf<AuthenticationButton.Events, f> {
    final /* synthetic */ a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AuthButtonOnClickProvider$onClickFacebook$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(AuthenticationButton.Events events) {
        h.e(events, "it");
        a.b(this.this$0, fe0.c.b);
        this.this$0.b.c(Destination.c.a, new b(null));
        return f.a;
    }
}
