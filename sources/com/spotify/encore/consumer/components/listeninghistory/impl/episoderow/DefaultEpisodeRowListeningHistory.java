package com.spotify.encore.consumer.components.listeninghistory.impl.episoderow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultEpisodeRowListeningHistory implements EpisodeRowListeningHistory {
    private final DefaultEpisodeRowListeningHistoryViewBinder viewBinder;

    public DefaultEpisodeRowListeningHistory(DefaultEpisodeRowListeningHistoryViewBinder defaultEpisodeRowListeningHistoryViewBinder) {
        h.e(defaultEpisodeRowListeningHistoryViewBinder, "viewBinder");
        this.viewBinder = defaultEpisodeRowListeningHistoryViewBinder;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.viewBinder.getView();
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super EpisodeRowListeningHistory.Events, f> nmf) {
        h.e(nmf, "event");
        this.viewBinder.setOnEpisodeClickListener(nmf);
        this.viewBinder.setOnContextMenuClickedListener(nmf);
    }

    public void render(EpisodeRowListeningHistory.Model model) {
        String str;
        h.e(model, "model");
        String string = getView().getContext().getString(R.string.listening_history_episode);
        h.d(string, "view.context.getString(R…istening_history_episode)");
        if (model.getShowTitle().length() == 0) {
            str = "";
        } else {
            StringBuilder Z0 = je.Z0(string, " • ");
            Z0.append(model.getShowTitle());
            str = Z0.toString();
        }
        this.viewBinder.render(EpisodeRowListeningHistory.Model.copy$default(model, null, str, null, false, 0, 29, null));
    }
}
