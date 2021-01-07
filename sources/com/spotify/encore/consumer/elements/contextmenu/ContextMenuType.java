package com.spotify.encore.consumer.elements.contextmenu;

import com.spotify.encore.consumer.elements.R;

public enum ContextMenuType {
    TRACK(R.string.show_context_menu_content_description_track),
    EPISODE(R.string.show_context_menu_content_description_episode);
    
    private final int contentDescriptionResourceId;

    private ContextMenuType(int i) {
        this.contentDescriptionResourceId = i;
    }

    public final int getContentDescriptionResourceId() {
        return this.contentDescriptionResourceId;
    }
}
