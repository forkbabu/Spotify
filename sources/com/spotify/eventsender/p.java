package com.spotify.eventsender;

import com.google.common.base.Predicate;

public final /* synthetic */ class p implements Predicate {
    public static final /* synthetic */ p a = new p();

    private /* synthetic */ p() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return !((yk0) obj).a.split("_")[0].equals("EventSenderStats");
    }
}
