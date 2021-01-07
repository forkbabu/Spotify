package com.spotify.remoteconfig;

public abstract class AndroidFeatureNavigationProperties implements n0e {

    public enum EnableLabelRemoval implements m0e {
        DISABLED("disabled"),
        ENABLED("enabled"),
        ENABLED_WITH_USER_ICON("enabledWithUserIcon"),
        ENABLED_WITH_STACK_ICON("enabledWithStackIcon");
        
        final String value;

        private EnableLabelRemoval(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract EnableLabelRemoval a();

    public abstract boolean b();
}
