package com.spotify.encore.consumer.components.listeninghistory.impl.podcastrow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.podcastrow.PodcastRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultPodcastRowListeningHistory implements PodcastRowListeningHistory {
    private final DefaultPodcastRowListeningHistoryViewBinder viewBinder;

    public DefaultPodcastRowListeningHistory(DefaultPodcastRowListeningHistoryViewBinder defaultPodcastRowListeningHistoryViewBinder) {
        h.e(defaultPodcastRowListeningHistoryViewBinder, "viewBinder");
        this.viewBinder = defaultPodcastRowListeningHistoryViewBinder;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.viewBinder.getView();
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Events, f> nmf) {
        h.e(nmf, "event");
        this.viewBinder.setOnShowClickListener(nmf);
        this.viewBinder.setOnContextMenuClickListener(nmf);
    }

    public void render(PodcastRowListeningHistory.Model model) {
        String str;
        h.e(model, "model");
        String string = getView().getContext().getString(R.string.listening_history_podcast);
        h.d(string, "view.context.getString(R…istening_history_podcast)");
        if (model.getPodcastOwnerTitle().length() == 0) {
            str = "";
        } else {
            StringBuilder Z0 = je.Z0(string, " • ");
            Z0.append(model.getPodcastOwnerTitle());
            str = Z0.toString();
        }
        this.viewBinder.render(PodcastRowListeningHistory.Model.copy$default(model, null, str, null, 5, null));
    }
}
