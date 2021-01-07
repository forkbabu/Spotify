package com.spotify.encore.consumer.components.listeninghistory.impl.entityrow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultEntityRowListeningHistory implements EntityRowListeningHistory {
    private final DefaultEntityRowListeningHistoryViewBinder viewBinder;

    public DefaultEntityRowListeningHistory(DefaultEntityRowListeningHistoryViewBinder defaultEntityRowListeningHistoryViewBinder) {
        h.e(defaultEntityRowListeningHistoryViewBinder, "viewBinder");
        this.viewBinder = defaultEntityRowListeningHistoryViewBinder;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.viewBinder.getView();
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Events, f> nmf) {
        h.e(nmf, "event");
        this.viewBinder.setOnEntityClickListener(nmf);
        this.viewBinder.setOnContextMenuClickListener(nmf);
    }

    public void render(EntityRowListeningHistory.Model model) {
        h.e(model, "model");
        this.viewBinder.render(model);
    }
}
