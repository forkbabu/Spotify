package com.spotify.encore.consumer.components.home.impl.recsplanationsectionheading;

import android.view.View;
import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;

final class DefaultRecsplanationSectionHeading$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultRecsplanationSectionHeading$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(RecsplanationSectionHeading.Events.Clicked);
    }
}
