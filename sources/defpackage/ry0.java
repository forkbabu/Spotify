package defpackage;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.encore.consumer.components.authentication.entrypoint.EncoreConsumerAuthenticationExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

/* renamed from: ry0  reason: default package */
public final class ry0 implements fjf<ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public ry0(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> authenticationButtonFactory = EncoreConsumerAuthenticationExtensions.authenticationButtonFactory(this.a.get().getButtons());
        yif.g(authenticationButtonFactory, "Cannot return null from a non-@Nullable @Provides method");
        return authenticationButtonFactory;
    }
}
