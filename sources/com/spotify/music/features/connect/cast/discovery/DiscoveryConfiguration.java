package com.spotify.music.features.connect.cast.discovery;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.connect.cast.i;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscoveryConfiguration {
    private static final i b = new i("CC32E753", "Spotify Production");
    @JsonIgnore
    private final boolean a;
    @JsonProperty("ids")
    final List<i> mAppIds;
    @JsonProperty("discoverySupport")
    final List<FeatureFlagOverrideValue> mDiscoverySupport;

    public enum FeatureFlagOverrideValue {
        NONE("NONE"),
        ENABLED("ENABLED"),
        DISABLED("DISABLED");
        
        private final String mValue;

        private FeatureFlagOverrideValue(String str) {
            this.mValue = str;
        }
    }

    static {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) new i("6B7652A6", "Spotify Employee Dogfooding"));
        builder.mo53add((ImmutableList.Builder) new i("DF630089", "Spotify Google Dogfooding"));
        builder.build();
    }

    @JsonCreator
    public DiscoveryConfiguration(@JsonProperty("discoverySupport") List<FeatureFlagOverrideValue> list, @JsonProperty("ids") List<i> list2) {
        this.a = list2 == null || list == null;
        this.mAppIds = list2 == null ? new ArrayList<>(0) : list2;
        this.mDiscoverySupport = list == null ? new ArrayList<>(0) : list;
    }

    public static i b() {
        return b;
    }

    @JsonIgnore
    public i a() {
        return this.mAppIds.get(0);
    }

    /* access modifiers changed from: package-private */
    @JsonIgnore
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryConfiguration)) {
            return false;
        }
        DiscoveryConfiguration discoveryConfiguration = (DiscoveryConfiguration) obj;
        if (!this.mDiscoverySupport.equals(discoveryConfiguration.mDiscoverySupport) || !this.mAppIds.equals(discoveryConfiguration.mAppIds)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.mAppIds.hashCode() + (this.mDiscoverySupport.hashCode() * 31);
    }

    public DiscoveryConfiguration() {
        this.mDiscoverySupport = new ArrayList(10);
        this.mAppIds = new ArrayList(10);
        this.a = false;
    }
}
