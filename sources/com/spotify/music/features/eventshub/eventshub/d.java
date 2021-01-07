package com.spotify.music.features.eventshub.eventshub;

import com.google.common.base.Predicate;
import com.spotify.music.features.eventshub.model.EventResult;
import com.spotify.music.features.eventshub.model.SourceType;

public final /* synthetic */ class d implements Predicate {
    public final /* synthetic */ SourceType a;

    public /* synthetic */ d(SourceType sourceType) {
        this.a = sourceType;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        EventResult eventResult = (EventResult) obj;
        return eventResult != null && eventResult.getSourceType() == this.a;
    }
}
