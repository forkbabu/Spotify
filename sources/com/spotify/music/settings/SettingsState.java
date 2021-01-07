package com.spotify.music.settings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.settings.AutoValue_SettingsState;

@JsonDeserialize(using = SettingsState_Deserializer.class)
public abstract class SettingsState implements JacksonModel {

    public static abstract class a {
        public abstract a a(String str);

        public abstract a b(boolean z);

        public abstract SettingsState c();

        public abstract a d(boolean z);

        public abstract a e(int i);

        public abstract a f(boolean z);

        public abstract a g(int i);

        public abstract a h(int i);

        public abstract a i(boolean z);

        public abstract a j(boolean z);

        public abstract a k(int i);

        public abstract a l(boolean z);

        public abstract a m(boolean z);

        public abstract a n(boolean z);

        public abstract a o(int i);

        public abstract a p(boolean z);

        public abstract a q(boolean z);

        public abstract a r(int i);

        public abstract a s(int i);

        public abstract a t(String str);
    }

    @JsonCreator
    public static SettingsState create(@JsonProperty("offline_mode") boolean z, @JsonProperty("play_explicit_content") boolean z2, @JsonProperty("private_session") boolean z3, @JsonProperty("download_over_3g") boolean z4, @JsonProperty("download_quality") int i, @JsonProperty("stream_quality") int i2, @JsonProperty("stream_non_metered_quality") int i3, @JsonProperty("ap") String str, @JsonProperty("seconds_to_offline_expiry") int i4, @JsonProperty("gapless") boolean z5, @JsonProperty("automix") boolean z6, @JsonProperty("normalize") boolean z7, @JsonProperty("loudness_environment") int i5, @JsonProperty("crossfade") boolean z8, @JsonProperty("crossfade_time_seconds") int i6, @JsonProperty("show_unavailable_tracks") boolean z9, @JsonProperty("local_devices_only") boolean z10, @JsonProperty("webgate_url") String str2, @JsonProperty("download_preferred_resource_type") int i7, @JsonProperty("trim_silence") boolean z11) {
        AutoValue_SettingsState.b bVar = new AutoValue_SettingsState.b();
        bVar.u(z);
        bVar.m(z2);
        bVar.n(z3);
        bVar.f(z4);
        bVar.h(i);
        bVar.s(i2);
        bVar.r(i3);
        bVar.a(str);
        bVar.o(i4);
        bVar.i(z5);
        bVar.b(z6);
        bVar.l(z7);
        bVar.k(i5);
        bVar.d(z8);
        bVar.e(i6);
        bVar.p(z9);
        bVar.j(z10);
        bVar.t(str2);
        bVar.g(i7);
        bVar.q(z11);
        return bVar.c();
    }

    public abstract String accessPoint();

    public abstract boolean automix();

    public abstract boolean crossfade();

    public abstract int crossfadeTimeSeconds();

    public abstract boolean downloadOver3g();

    public abstract int downloadPreferredResourceType();

    public abstract int downloadQuality();

    public abstract boolean gapless();

    public abstract boolean localDevicesOnly();

    public abstract int loudnessEnvironment();

    public abstract boolean normalize();

    public abstract boolean offlineMode();

    public abstract boolean playExplicitContent();

    public abstract boolean privateSession();

    public abstract int secondsToOfflineExpiry();

    public abstract boolean showUnavailableTracks();

    public abstract boolean silenceTrimmer();

    public abstract int streamNonMeteredQuality();

    public abstract int streamQuality();

    public abstract String webgateUrl();
}
