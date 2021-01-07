package com.spotify.remoteconfig;

public abstract class NotificationSettingsProperties implements n0e {

    public enum StartingPage implements m0e {
        COMBINED("combined"),
        CHANNELS("channels");
        
        final String value;

        private StartingPage(String str) {
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

    public abstract StartingPage b();
}
