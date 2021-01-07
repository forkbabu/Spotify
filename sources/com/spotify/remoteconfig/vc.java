package com.spotify.remoteconfig;

public final class vc implements fjf<AndroidMusicLibsVoiceAssistantFlagsProperties> {
    private final wlf<l0e> a;

    public vc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidMusicLibsVoiceAssistantFlagsProperties androidMusicLibsVoiceAssistantFlagsProperties = (AndroidMusicLibsVoiceAssistantFlagsProperties) this.a.get().a(v.a);
        yif.g(androidMusicLibsVoiceAssistantFlagsProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidMusicLibsVoiceAssistantFlagsProperties;
    }
}
