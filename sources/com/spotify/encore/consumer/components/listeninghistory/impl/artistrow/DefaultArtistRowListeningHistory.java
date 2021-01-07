package com.spotify.encore.consumer.components.listeninghistory.impl.artistrow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.artistrow.ArtistRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityTypeListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultArtistRowListeningHistory implements ArtistRowListeningHistory {
    private final DefaultEntityRowListeningHistoryViewBinder viewBinder;

    public DefaultArtistRowListeningHistory(DefaultEntityRowListeningHistoryViewBinder defaultEntityRowListeningHistoryViewBinder) {
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

    public void render(ArtistRowListeningHistory.Model model) {
        h.e(model, "model");
        String string = getView().getContext().getString(R.string.listening_history_artist);
        h.d(string, "view.context.getString(R…listening_history_artist)");
        this.viewBinder.render(new EntityRowListeningHistory.Model(model.getArtistName(), string, model.getImage(), EntityTypeListeningHistory.ARTIST));
    }
}
