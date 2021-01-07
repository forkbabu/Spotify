package com.spotify.encore.consumer.components.error.impl.errorbanner;

import android.view.View;
import com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner;

final class DefaultErrorBanner$onEvent$2 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultErrorBanner$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(ErrorBanner.Events.CloseButtonClicked.INSTANCE);
    }
}
