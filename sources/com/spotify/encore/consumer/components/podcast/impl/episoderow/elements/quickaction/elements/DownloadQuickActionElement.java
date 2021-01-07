package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import android.content.Context;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButtonView;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;
import kotlin.jvm.internal.h;

public final class DownloadQuickActionElement extends EpisodeRowQuickActionElement<EpisodeRowQuickAction.Download> {
    private final DownloadButtonView downloadView;
    private LottieIconStateMachine lottieIconStateMachine;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadQuickActionElement(Context context) {
        super(context, null, 0, 6, null);
        h.e(context, "context");
        this.downloadView = new DownloadButtonView(context, null, 0, 6, null);
    }

    public final void setStateMachine(LottieIconStateMachine lottieIconStateMachine2) {
        this.lottieIconStateMachine = lottieIconStateMachine2;
    }

    public void render(EpisodeRowQuickAction.Download download) {
        h.e(download, "model");
        setQuickAction(download);
        DownloadButton.Model model = new DownloadButton.Model(download.getData(), null, 2, null);
        this.downloadView.render(model);
        setEnabled(download.isEnabled());
        LottieIconStateMachine lottieIconStateMachine2 = this.lottieIconStateMachine;
        if (lottieIconStateMachine2 != null) {
            lottieIconStateMachine2.moveToState(model, this.downloadView);
        }
        addView(this.downloadView);
    }
}
