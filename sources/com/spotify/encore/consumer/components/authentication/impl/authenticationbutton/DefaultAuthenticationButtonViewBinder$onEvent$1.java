package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import android.view.View;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;

/* access modifiers changed from: package-private */
public final class DefaultAuthenticationButtonViewBinder$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultAuthenticationButtonViewBinder$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(AuthenticationButton.Events.Clicked.INSTANCE);
    }
}
