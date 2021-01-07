package com.spotify.music.features.login.startview.cta;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.loginflow.navigation.Destination;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class AuthButtonOnClickProvider$onClickConsumerTrackAndNavigateForResult$1 extends Lambda implements nmf<AuthenticationButton.Events, f> {
    final /* synthetic */ fe0 $buttonInteraction;
    final /* synthetic */ Destination $destination;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AuthButtonOnClickProvider$onClickConsumerTrackAndNavigateForResult$1(a aVar, fe0 fe0, int i, Destination destination) {
        super(1);
        this.this$0 = aVar;
        this.$buttonInteraction = fe0;
        this.$requestCode = i;
        this.$destination = destination;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(AuthenticationButton.Events events) {
        h.e(events, "it");
        a.b(this.this$0, this.$buttonInteraction);
        this.this$0.b.d(this.$requestCode, this.$destination);
        return f.a;
    }
}
