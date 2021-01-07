package com.spotify.remoteconfig;

public abstract class AndroidLibsPlaylistEntityConfigurationProperties implements n0e {

    public enum ChunkyRowsAndPreviews implements m0e {
        TRACK_CLOUD("track_cloud"),
        TRACK_LIST_WITH_EXPLICIT_PREVIEWS("track_list_with_explicit_previews"),
        TRACK_LIST_WITH_SUBTLE_PREVIEWS("track_list_with_subtle_previews");
        
        final String value;

        private ChunkyRowsAndPreviews(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum EditPlaylistOptionInToolbarMenuNftBehaviour implements m0e {
        NO_SHOW("no_show"),
        SHOW_FOR_SELF_OWNED("show_for_self_owned"),
        SHOW_FOR_CAN_MODIFY_CONTENT("show_for_can_modify_content");
        
        final String value;

        private EditPlaylistOptionInToolbarMenuNftBehaviour(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum RecommendationEducationOptionInToolbarMenuBehavior implements m0e {
        NO_SHOW("no_show"),
        SHOW_FOR_FORMAT_LISTS("show_for_format_lists"),
        SHOW_FOR_ALL("show_for_all");
        
        final String value;

        private RecommendationEducationOptionInToolbarMenuBehavior(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum ShowToastAboutPremiumOnPreviewPlayback implements m0e {
        NO_SHOW("no_show"),
        SHOW_ONCE_PER_PLAYLIST_SESSION("show_once_per_playlist_session"),
        SHOW_ON_EVERY_PLAYBACK_ATTEMPT("show_on_every_playback_attempt");
        
        final String value;

        private ShowToastAboutPremiumOnPreviewPlayback(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract boolean a();

    public abstract ChunkyRowsAndPreviews b();

    public abstract boolean c();

    public abstract EditPlaylistOptionInToolbarMenuNftBehaviour d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract RecommendationEducationOptionInToolbarMenuBehavior h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract ShowToastAboutPremiumOnPreviewPlayback l();
}
