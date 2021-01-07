package com.spotify.superbird.presets.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PresetRequest implements JacksonModel {
    private final String contextUri;
    private final long modifiedTimestamp;
    private final int slotIndex;
    private final String source;
    private final int version;

    public PresetRequest(int i, String str, long j, String str2, int i2) {
        h.e(str, "contextUri");
        h.e(str2, "source");
        this.slotIndex = i;
        this.contextUri = str;
        this.modifiedTimestamp = j;
        this.source = str2;
        this.version = i2;
    }

    public static /* synthetic */ PresetRequest copy$default(PresetRequest presetRequest, int i, String str, long j, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = presetRequest.slotIndex;
        }
        if ((i3 & 2) != 0) {
            str = presetRequest.contextUri;
        }
        if ((i3 & 4) != 0) {
            j = presetRequest.modifiedTimestamp;
        }
        if ((i3 & 8) != 0) {
            str2 = presetRequest.source;
        }
        if ((i3 & 16) != 0) {
            i2 = presetRequest.version;
        }
        return presetRequest.copy(i, str, j, str2, i2);
    }

    public final int component1() {
        return this.slotIndex;
    }

    public final String component2() {
        return this.contextUri;
    }

    public final long component3() {
        return this.modifiedTimestamp;
    }

    public final String component4() {
        return this.source;
    }

    public final int component5() {
        return this.version;
    }

    public final PresetRequest copy(int i, String str, long j, String str2, int i2) {
        h.e(str, "contextUri");
        h.e(str2, "source");
        return new PresetRequest(i, str, j, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresetRequest)) {
            return false;
        }
        PresetRequest presetRequest = (PresetRequest) obj;
        return this.slotIndex == presetRequest.slotIndex && h.a(this.contextUri, presetRequest.contextUri) && this.modifiedTimestamp == presetRequest.modifiedTimestamp && h.a(this.source, presetRequest.source) && this.version == presetRequest.version;
    }

    @JsonProperty("context_uri")
    public final String getContextUri() {
        return this.contextUri;
    }

    @JsonProperty("modified_timestamp")
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @JsonProperty("slot_index")
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    @JsonProperty("source")
    public final String getSource() {
        return this.source;
    }

    @JsonProperty("version")
    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i = this.slotIndex * 31;
        String str = this.contextUri;
        int i2 = 0;
        int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + e.a(this.modifiedTimestamp)) * 31;
        String str2 = this.source;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + this.version;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PresetRequest(slotIndex=");
        V0.append(this.slotIndex);
        V0.append(", contextUri=");
        V0.append(this.contextUri);
        V0.append(", modifiedTimestamp=");
        V0.append(this.modifiedTimestamp);
        V0.append(", source=");
        V0.append(this.source);
        V0.append(", version=");
        return je.B0(V0, this.version, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PresetRequest(int i, String str, long j, String str2, int i2, int i3, f fVar) {
        this(i, str, j, (i3 & 8) != 0 ? "voice" : str2, (i3 & 16) != 0 ? 1 : i2);
    }
}
