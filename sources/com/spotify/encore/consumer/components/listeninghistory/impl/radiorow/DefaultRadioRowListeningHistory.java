package com.spotify.encore.consumer.components.listeninghistory.impl.radiorow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityTypeListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.radiorow.RadioRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultRadioRowListeningHistory implements RadioRowListeningHistory {
    private final DefaultEntityRowListeningHistoryViewBinder viewBinder;

    public DefaultRadioRowListeningHistory(DefaultEntityRowListeningHistoryViewBinder defaultEntityRowListeningHistoryViewBinder) {
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

    public void render(RadioRowListeningHistory.Model model) {
        String str;
        h.e(model, "model");
        String string = getView().getContext().getString(R.string.listening_history_radio);
        h.d(string, "view.context.getString(R….listening_history_radio)");
        String title = model.getTitle();
        if (model.getSubtitle().length() == 0) {
            str = "";
        } else {
            StringBuilder Z0 = je.Z0(string, " • ");
            Z0.append(model.getSubtitle());
            str = Z0.toString();
        }
        this.viewBinder.render(new EntityRowListeningHistory.Model(title, str, model.getImage(), EntityTypeListeningHistory.RADIO));
    }
}
