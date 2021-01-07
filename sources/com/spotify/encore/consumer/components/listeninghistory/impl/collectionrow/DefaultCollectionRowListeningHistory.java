package com.spotify.encore.consumer.components.listeninghistory.impl.collectionrow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.collectionrow.CollectionRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityTypeListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultCollectionRowListeningHistory implements CollectionRowListeningHistory {
    private final DefaultEntityRowListeningHistoryViewBinder viewBinder;

    public DefaultCollectionRowListeningHistory(DefaultEntityRowListeningHistoryViewBinder defaultEntityRowListeningHistoryViewBinder) {
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

    public void render(CollectionRowListeningHistory.Model model) {
        h.e(model, "model");
        String string = getView().getContext().getString(R.string.listening_history_collection);
        h.d(string, "view.context.getString(R…ening_history_collection)");
        this.viewBinder.render(new EntityRowListeningHistory.Model(model.getTitle(), string, model.getImage(), EntityTypeListeningHistory.COLLECTION));
    }
}
