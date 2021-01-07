package com.spotify.music.appprotocol.superbird.presets.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class PresetsAppProtocol implements JacksonModel {

    public static final class DevicePresetUpdateRequest extends PresetsAppProtocol {
        private final JsonNode presets;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @JsonCreator
        public DevicePresetUpdateRequest(@JsonProperty("presets") JsonNode jsonNode) {
            super(null);
            h.e(jsonNode, "presets");
            this.presets = jsonNode;
        }

        public final JsonNode getPresets() {
            return this.presets;
        }
    }

    public static final class DevicePresets extends PresetsAppProtocol {
        private final JsonNode result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DevicePresets(@JsonProperty("result") JsonNode jsonNode) {
            super(null);
            h.e(jsonNode, "result");
            this.result = jsonNode;
        }

        public static /* synthetic */ DevicePresets copy$default(DevicePresets devicePresets, JsonNode jsonNode, int i, Object obj) {
            if ((i & 1) != 0) {
                jsonNode = devicePresets.result;
            }
            return devicePresets.copy(jsonNode);
        }

        public final JsonNode component1() {
            return this.result;
        }

        public final DevicePresets copy(@JsonProperty("result") JsonNode jsonNode) {
            h.e(jsonNode, "result");
            return new DevicePresets(jsonNode);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof DevicePresets) && h.a(this.result, ((DevicePresets) obj).result);
            }
            return true;
        }

        public final JsonNode getResult() {
            return this.result;
        }

        public int hashCode() {
            JsonNode jsonNode = this.result;
            if (jsonNode != null) {
                return jsonNode.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DevicePresets(result=");
            V0.append(this.result);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class DevicePresetsRequest extends PresetsAppProtocol {
        private final String serial;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DevicePresetsRequest(@JsonProperty("serial") String str) {
            super(null);
            h.e(str, "serial");
            this.serial = str;
        }

        public static /* synthetic */ DevicePresetsRequest copy$default(DevicePresetsRequest devicePresetsRequest, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = devicePresetsRequest.serial;
            }
            return devicePresetsRequest.copy(str);
        }

        public final String component1() {
            return this.serial;
        }

        public final DevicePresetsRequest copy(@JsonProperty("serial") String str) {
            h.e(str, "serial");
            return new DevicePresetsRequest(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof DevicePresetsRequest) && h.a(this.serial, ((DevicePresetsRequest) obj).serial);
            }
            return true;
        }

        public final String getSerial() {
            return this.serial;
        }

        public int hashCode() {
            String str = this.serial;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("DevicePresetsRequest(serial="), this.serial, ")");
        }
    }

    private PresetsAppProtocol() {
    }

    public /* synthetic */ PresetsAppProtocol(f fVar) {
        this();
    }
}
