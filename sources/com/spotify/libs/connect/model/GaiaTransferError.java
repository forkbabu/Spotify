package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaTransferError implements JacksonModel {
    private final String mDeviceId;
    private final DeviceTransferError mErrorCode;

    public enum DeviceTransferError {
        UNKNOWN(204),
        SUCCESS(0),
        CANNOT_PLAY_ON_DEVICE(1),
        CONTENT_NOT_SUPPORTED_BY_DEVICE(2),
        TRANSFER_TIMEOUT(3),
        TRANSFER_WRONG_STATE(4),
        ZEROCONF_NOT_LOADED(106),
        ZEROCONF_DEVICE_NOT_AUTHORIZED(107),
        ZEROCONF_CANNOT_LOAD(108),
        ZEROCONF_SYSTEM_UPDATE_REQUIRED(109),
        ZEROCONF_SPOTIFY_UPDATE_REQUIRED(110),
        ZEROCONF_LOGIN_FAILED(202),
        ZEROCONF_INVALID_PUBLIC_KEY(203);
        
        private static final DeviceTransferError[] w = values();
        private final int mCode;

        private DeviceTransferError(int i) {
            this.mCode = i;
        }

        public static DeviceTransferError d(int i) {
            DeviceTransferError[] deviceTransferErrorArr = w;
            for (DeviceTransferError deviceTransferError : deviceTransferErrorArr) {
                if (i == deviceTransferError.mCode) {
                    return deviceTransferError;
                }
            }
            return UNKNOWN;
        }

        public int g() {
            return this.mCode;
        }
    }

    @JsonCreator
    public GaiaTransferError(@JsonProperty("code") int i, @JsonProperty("device") String str) {
        this.mErrorCode = DeviceTransferError.d(i);
        this.mDeviceId = str;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public DeviceTransferError getErrorCode() {
        return this.mErrorCode;
    }

    public String toString() {
        StringBuilder V0 = je.V0("GaiaTransferError{mDeviceId='");
        je.A(V0, this.mDeviceId, '\'', ", mErrorCode=");
        V0.append(this.mErrorCode);
        V0.append('}');
        return V0.toString();
    }
}
