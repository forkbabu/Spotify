package com.spotify.remoteconfig;

public abstract class AndroidLibsAdaptiveUiProperties implements n0e {

    public enum EnableSidebarLayout implements m0e {
        DISABLED("disabled"),
        TABLET_ONLY("tabletOnly"),
        TABLET_AND_MOBILE("tabletAndMobile");
        
        final String value;

        private EnableSidebarLayout(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract EnableSidebarLayout a();
}
