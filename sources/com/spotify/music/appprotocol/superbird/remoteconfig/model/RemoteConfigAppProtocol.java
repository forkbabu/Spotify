package com.spotify.music.appprotocol.superbird.remoteconfig.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class RemoteConfigAppProtocol implements JacksonModel {

    public static final class RemoteConfigs extends RemoteConfigAppProtocol {
        private final Map<String, Object> data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RemoteConfigs(@JsonProperty("items") Map<String, ? extends Object> map) {
            super(null);
            h.e(map, "data");
            this.data = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.music.appprotocol.superbird.remoteconfig.model.RemoteConfigAppProtocol$RemoteConfigs */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RemoteConfigs copy$default(RemoteConfigs remoteConfigs, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = remoteConfigs.data;
            }
            return remoteConfigs.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.data;
        }

        public final RemoteConfigs copy(@JsonProperty("items") Map<String, ? extends Object> map) {
            h.e(map, "data");
            return new RemoteConfigs(map);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof RemoteConfigs) && h.a(this.data, ((RemoteConfigs) obj).data);
            }
            return true;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        public int hashCode() {
            Map<String, Object> map = this.data;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.M0(je.V0("RemoteConfigs(data="), this.data, ")");
        }
    }

    private RemoteConfigAppProtocol() {
    }

    public /* synthetic */ RemoteConfigAppProtocol(f fVar) {
        this();
    }
}
