package com.spotify.mobile.android.ui.contextmenu;

public enum ContextMenuEvent {
    ADD_TO_ANOTER_NFT_MIX("add-to-another-nft-mix"),
    ADD_TO_COLLECTION("add-to-collection"),
    ADD_TO_NFT_MIX("add-to-nft-mix"),
    ADD_TO_PLAYLIST("add-to-playlist"),
    ADD_TO_QUEUE("add-to-queue"),
    ADD_TO_THIS_NFT_MIX("add-to-this-nft-mix"),
    BAN("ban"),
    BROWSE_ALBUM("browse-album"),
    BROWSE_ARTIST("browse-artist"),
    BROWSE_EPISODE("browse-episode"),
    BROWSE_PLAYLIST("browse-playlist"),
    BROWSE_PROFILE("browse-profile"),
    BROWSE_QUEUE("browse-queue"),
    BROWSE_SHOW("browse-show"),
    COMPLETE_ALBUM_IN_COLLECTION("complete-album-in-collection"),
    DELETE_STATION("delete-station"),
    DONE("done"),
    DOWNLOAD("download"),
    EDIT("edit"),
    EDIT_MODE("edit-mode"),
    HIDE_FROM_RECENTLY_PLAYED("hide-from-recently-played"),
    IMAGE_RECOMMENDATION("image-recs"),
    INSTALL_SHORTCUT("install-shortcut"),
    FIND_IN_SHOW("find-in-show"),
    FOLLOW("follow"),
    FOLLOWFEED("open-followfeed"),
    LISTENING_HISTORY("open-listening-history"),
    MARK_AS_PLAYED("mark-as-played"),
    MARK_AS_UNPLAYED("mark-as-unplayed"),
    OPEN_SLEEP_TIMER_MENU("open-sleep-timer-menu"),
    REMOVE("remove"),
    REMOVE_FROM_COLLECTION("remove-from-collection"),
    RENAME("rename"),
    REPORT_ABUSE("playlist-annotation-report-abuse"),
    SET_COLLABORATIVE("set-collaborative"),
    SET_PUBLISHED("set-published"),
    SETTINGS("open-settings"),
    SHARE("share"),
    SHOW_CREDITS("credits"),
    SHOW_LYRICS("show-lyrics"),
    SHOW_PROMO_DISCLOSURE("show-promo-disclosure"),
    SHUFFLE_PLAY("shuffle-play"),
    START_RADIO("start-radio"),
    SUBSCRIBE("subscribe"),
    UNBAN("unban"),
    UNDOWNLOAD("undownload"),
    UNFOLLOW("unfollow"),
    UNFOLLOW_STATION("unfollow-station"),
    UNSET_COLLABORATIVE("unset-collaborative"),
    UNSET_PUBLISHED("unset-published");
    
    private final String mEvent;

    static {
        values();
    }

    private ContextMenuEvent(String str) {
        this.mEvent = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mEvent;
    }
}
