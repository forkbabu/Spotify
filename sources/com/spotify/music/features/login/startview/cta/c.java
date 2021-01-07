package com.spotify.music.features.login.startview.cta;

import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class c {
    private final AuthenticationButton.AuthenticationType a;
    private final nmf<AuthenticationButton.Events, f> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nmf<? super com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton$Events, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(AuthenticationButton.AuthenticationType authenticationType, nmf<? super AuthenticationButton.Events, f> nmf) {
        h.e(authenticationType, "authButtonType");
        h.e(nmf, "event");
        this.a = authenticationType;
        this.b = nmf;
    }

    public final AuthenticationButton.AuthenticationType a() {
        return this.a;
    }

    public final nmf<AuthenticationButton.Events, f> b() {
        return this.b;
    }
}
