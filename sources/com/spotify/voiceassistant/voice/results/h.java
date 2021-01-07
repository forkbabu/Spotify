package com.spotify.voiceassistant.voice.results;

import com.spotify.voiceassistant.player.models.metadata.MetadataItem;

public final class h {
    private final boolean a;
    private final MetadataItem b;

    public h(boolean z, MetadataItem metadataItem) {
        kotlin.jvm.internal.h.e(metadataItem, "metadata");
        this.a = z;
        this.b = metadataItem;
    }

    public final boolean a() {
        return this.a;
    }

    public final MetadataItem b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && kotlin.jvm.internal.h.a(this.b, hVar.b);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        MetadataItem metadataItem = this.b;
        return i4 + (metadataItem != null ? metadataItem.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("MetaDataWrapper(active=");
        V0.append(this.a);
        V0.append(", metadata=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
