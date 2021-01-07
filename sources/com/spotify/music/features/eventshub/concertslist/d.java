package com.spotify.music.features.eventshub.concertslist;

import android.os.Bundle;
import com.spotify.music.features.eventshub.model.EventResult;

public final class d implements fjf<EventResult> {
    private final wlf<Bundle> a;

    public d(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Bundle bundle = this.a.get();
        EventResult eventResult = bundle.containsKey("event-result-arg") ? (EventResult) bundle.getParcelable("event-result-arg") : EventResult.EMPTY;
        yif.g(eventResult, "Cannot return null from a non-@Nullable @Provides method");
        return eventResult;
    }
}
