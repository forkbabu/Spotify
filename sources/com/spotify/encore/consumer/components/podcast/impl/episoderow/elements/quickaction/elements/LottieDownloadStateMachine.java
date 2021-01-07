package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButtonView;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.encore.consumer.elements.downloadbutton.DrawableHandler;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class LottieDownloadStateMachine implements LottieIconStateMachine {
    private String currentId;
    private DownloadState currentState = DownloadState.None.INSTANCE;
    private final DrawableHandler drawableHandler;

    public LottieDownloadStateMachine(DrawableHandler drawableHandler2) {
        h.e(drawableHandler2, "drawableHandler");
        this.drawableHandler = drawableHandler2;
    }

    private final boolean stateClassChanged(DownloadState downloadState, DownloadState downloadState2) {
        return !h.a(j.b(downloadState.getClass()), j.b(downloadState2.getClass()));
    }

    @Override // com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine
    public void moveToState(DownloadButton.Model model, DownloadButtonView downloadButtonView) {
        h.e(model, "model");
        h.e(downloadButtonView, "view");
        String id = model.getId();
        DownloadState downloadState = model.getDownloadState();
        boolean hasTransition = this.drawableHandler.hasTransition(this.currentState, downloadState);
        if ((!h.a(id, this.currentId)) || (!hasTransition && stateClassChanged(this.currentState, downloadState))) {
            this.currentState = DownloadState.None.INSTANCE;
        }
        downloadButtonView.renderInLists(this.currentState, model.getDownloadState());
        this.currentState = downloadState;
        this.currentId = id;
    }
}
