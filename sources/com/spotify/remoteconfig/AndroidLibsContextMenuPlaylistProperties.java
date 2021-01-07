package com.spotify.remoteconfig;

public abstract class AndroidLibsContextMenuPlaylistProperties implements n0e {

    public enum EditPlaylistOptionNftBehaviour implements m0e {
        NO_SHOW("no_show"),
        SHOW_FOR_SELF_OWNED("show_for_self_owned"),
        SHOW_FOR_CAN_MODIFY_CONTENT("show_for_can_modify_content");
        
        final String value;

        private EditPlaylistOptionNftBehaviour(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract EditPlaylistOptionNftBehaviour a();
}
