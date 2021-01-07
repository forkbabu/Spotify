package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import android.content.Context;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSectionView;
import kotlin.jvm.internal.h;

public final class EpisodeRowQuickActionElementFactory {
    public static final EpisodeRowQuickActionElementFactory INSTANCE = new EpisodeRowQuickActionElementFactory();

    private EpisodeRowQuickActionElementFactory() {
    }

    public static /* synthetic */ EpisodeRowQuickActionElement renderQuickAction$default(EpisodeRowQuickActionElementFactory episodeRowQuickActionElementFactory, EpisodeRowQuickAction episodeRowQuickAction, Context context, EpisodeRowQuickActionSectionView.ViewContext viewContext, int i, Object obj) {
        if ((i & 4) != 0) {
            viewContext = null;
        }
        return episodeRowQuickActionElementFactory.renderQuickAction(episodeRowQuickAction, context, viewContext);
    }

    public final EpisodeRowQuickActionElement<EpisodeRowQuickAction> renderQuickAction(EpisodeRowQuickAction episodeRowQuickAction, Context context, EpisodeRowQuickActionSectionView.ViewContext viewContext) {
        h.e(episodeRowQuickAction, "quickAction");
        h.e(context, "context");
        if (episodeRowQuickAction instanceof EpisodeRowQuickAction.Download) {
            DownloadQuickActionElement downloadQuickActionElement = new DownloadQuickActionElement(context);
            downloadQuickActionElement.setStateMachine(viewContext != null ? viewContext.getLottieIconStateMachine() : null);
            return downloadQuickActionElement;
        } else if (episodeRowQuickAction instanceof EpisodeRowQuickAction.MarkAsPlayed) {
            return new MarkAsPlayedQuickActionElement(context);
        } else {
            if (episodeRowQuickAction instanceof EpisodeRowQuickAction.AddToYourEpisodes) {
                return new AddToYourEpisodesQuickActionElement(context);
            }
            if (episodeRowQuickAction instanceof EpisodeRowQuickAction.ContextMenu) {
                return new ContextMenuQuickActionElement(context);
            }
            throw new UnsupportedOperationException("type not supported");
        }
    }
}
