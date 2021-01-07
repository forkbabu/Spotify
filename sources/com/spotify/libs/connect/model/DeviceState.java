package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.Locale;

public interface DeviceState {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public enum GaiaDeviceState implements JacksonModel, DeviceState {
        CONNECTING,
        INCOMPATIBLE,
        UNAVAILABLE,
        LOGGED_IN,
        NOT_LOGGED_IN,
        PREMIUM_REQUIRED,
        NOT_INSTALLED,
        UNSUPPORTED_URI,
        SLEEPING,
        NOT_AUTHORIZED;
        
        static final EnumSet<GaiaDeviceState> GAIA_DISABLED_STATES;
        public static final DeviceState[] VALUES = values();

        static {
            GaiaDeviceState gaiaDeviceState;
            GaiaDeviceState gaiaDeviceState2;
            GaiaDeviceState gaiaDeviceState3;
            GaiaDeviceState gaiaDeviceState4;
            GaiaDeviceState gaiaDeviceState5;
            GaiaDeviceState gaiaDeviceState6;
            GAIA_DISABLED_STATES = EnumSet.of(gaiaDeviceState6, gaiaDeviceState2, gaiaDeviceState3, gaiaDeviceState, gaiaDeviceState4, gaiaDeviceState5);
        }

        @JsonCreator
        public static GaiaDeviceState fromValue(String str) {
            try {
                return (GaiaDeviceState) Enum.valueOf(GaiaDeviceState.class, str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                Logger.b("Unable to parse DeviceState '%s', returning UNAVAILABLE", str);
                return UNAVAILABLE;
            }
        }

        @JsonValue
        public String toJson() {
            return name().toLowerCase(Locale.US);
        }
    }

    String name();
}
