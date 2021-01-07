package com.spotify.music.appprotocol.superbird.tipsandtricks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class TipsAndTricksAppProtocol implements JacksonModel {

    public static final class DeviceTipsAndTricks extends TipsAndTricksAppProtocol {
        private final JsonNode result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeviceTipsAndTricks(@JsonProperty("result") JsonNode jsonNode) {
            super(null);
            h.e(jsonNode, "result");
            this.result = jsonNode;
        }

        public static /* synthetic */ DeviceTipsAndTricks copy$default(DeviceTipsAndTricks deviceTipsAndTricks, JsonNode jsonNode, int i, Object obj) {
            if ((i & 1) != 0) {
                jsonNode = deviceTipsAndTricks.result;
            }
            return deviceTipsAndTricks.copy(jsonNode);
        }

        public final JsonNode component1() {
            return this.result;
        }

        public final DeviceTipsAndTricks copy(@JsonProperty("result") JsonNode jsonNode) {
            h.e(jsonNode, "result");
            return new DeviceTipsAndTricks(jsonNode);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof DeviceTipsAndTricks) && h.a(this.result, ((DeviceTipsAndTricks) obj).result);
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
            StringBuilder V0 = je.V0("DeviceTipsAndTricks(result=");
            V0.append(this.result);
            V0.append(")");
            return V0.toString();
        }
    }

    private TipsAndTricksAppProtocol() {
    }

    public /* synthetic */ TipsAndTricksAppProtocol(f fVar) {
        this();
    }
}
