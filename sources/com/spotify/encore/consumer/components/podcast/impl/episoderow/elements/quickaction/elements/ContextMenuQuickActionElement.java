package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import android.content.Context;
import android.widget.ImageView;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import kotlin.jvm.internal.h;

public final class ContextMenuQuickActionElement extends EpisodeRowQuickActionElement<EpisodeRowQuickAction.ContextMenu> {
    private final ContextMenuButton contextMenuButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuQuickActionElement(Context context) {
        super(context, null, 0, 6, null);
        h.e(context, "context");
        ContextMenuButton contextMenuButton2 = new ContextMenuButton(context, null, 0, 6, null);
        contextMenuButton2.setScaleType(ImageView.ScaleType.CENTER);
        this.contextMenuButton = contextMenuButton2;
    }

    public void render(EpisodeRowQuickAction.ContextMenu contextMenu) {
        h.e(contextMenu, "model");
        setQuickAction(contextMenu);
        this.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.EPISODE, contextMenu.getEpisodeName(), false, 4, null));
        setEnabled(contextMenu.isEnabled());
        addView(this.contextMenuButton);
    }
}
