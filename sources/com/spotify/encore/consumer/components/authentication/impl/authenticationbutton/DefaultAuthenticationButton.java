package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import android.app.Activity;
import android.view.View;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultAuthenticationButton implements AuthenticationButton {
    private final DefaultAuthenticationButtonViewBinder viewBinder;

    public static final class ViewContext {
        private final Activity context;

        public ViewContext(Activity activity) {
            h.e(activity, "context");
            this.context = activity;
        }

        public final Activity getContext() {
            return this.context;
        }
    }

    public DefaultAuthenticationButton(DefaultAuthenticationButtonViewBinder defaultAuthenticationButtonViewBinder) {
        h.e(defaultAuthenticationButtonViewBinder, "viewBinder");
        this.viewBinder = defaultAuthenticationButtonViewBinder;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.viewBinder.getView();
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super AuthenticationButton.Events, f> nmf) {
        h.e(nmf, "event");
        this.viewBinder.onEvent(nmf);
    }

    public void render(AuthenticationButton.Model model) {
        h.e(model, "model");
        this.viewBinder.render(model);
    }
}
