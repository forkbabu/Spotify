package com.spotify.music.features.eventsender;

import android.view.View;
import com.spotify.messages.CoreIntegrationTestEvent;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ EventSenderFragment a;
    public final /* synthetic */ CoreIntegrationTestEvent b;

    public /* synthetic */ b(EventSenderFragment eventSenderFragment, CoreIntegrationTestEvent coreIntegrationTestEvent) {
        this.a = eventSenderFragment;
        this.b = coreIntegrationTestEvent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.K4(this.b, view);
    }
}
