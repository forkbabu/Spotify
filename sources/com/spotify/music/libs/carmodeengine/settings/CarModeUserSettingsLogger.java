package com.spotify.music.libs.carmodeengine.settings;

public interface CarModeUserSettingsLogger {

    public enum AutoActivationChangedReason {
        SETTINGS_INTERACTION,
        OPT_IN_LOGIC
    }

    void a(boolean z);

    void b(boolean z, AutoActivationChangedReason autoActivationChangedReason);

    void c(y6a y6a);
}
