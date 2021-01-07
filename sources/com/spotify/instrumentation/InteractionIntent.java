package com.spotify.instrumentation;

import com.spotify.player.model.ContextTrack;

public enum InteractionIntent {
    ADD("add"),
    ADD_TO_QUEUE("add-to-queue"),
    CLOSE("close"),
    CONNECT("connect"),
    CONTINUE("continue"),
    DEFAULT_CAST("default-cast"),
    DEFAULT_CONNECT("default-connect"),
    DELETE("delete"),
    DELETE_PLAYLIST("delete-playlist"),
    DOWNLOAD("download"),
    EDIT_PLAYLIST_FILTER("edit-playlist-filter"),
    FILTER("filter"),
    FOLLOW("follow"),
    FOLLOW_PLAYLIST("follow-playlist"),
    FORGET_DEVICE("forget-device"),
    GO_BACK("go-back"),
    GROUP_ROOMS("group-rooms"),
    INSTALL_APP("install-app"),
    LATER("later"),
    LISTEN_NOW("listen-now"),
    LISTEN_ON_THIS_DEVICE("listen-on-this-device"),
    NAVIGATE("navigate"),
    NEXT("next"),
    PAUSE(ContextTrack.TrackAction.PAUSE),
    PLAY("play"),
    PREVIOUS("previous"),
    REMOVE_FROM_DOWNLOAD("remove-from-download"),
    REPEAT("repeat"),
    SAVE("save"),
    SHARE("share"),
    SHOW_CONTEXTMENU_TRACK("show-contextmenu-track"),
    SHOW_OPTIONS("show-options"),
    SHUFFLE("shuffle"),
    UNFOLLOW_PLAYLIST("unfollow-playlist"),
    UNKNOWN("unknown"),
    VALIDATE("validate");
    
    private final String mInteractionIntent;

    private InteractionIntent(String str) {
        this.mInteractionIntent = str;
    }

    public String d() {
        return this.mInteractionIntent;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return je.I0(je.V0("{interactionIntent='"), this.mInteractionIntent, "'}");
    }
}
