package com.spotify.voice.api.model;

import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.z;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class f extends l {
    private final j a;
    private final VoiceConsumer b;
    private final z<Boolean> c;
    private final wlf<Map<String, String>> d;

    f(j jVar, VoiceConsumer voiceConsumer, z<Boolean> zVar, wlf<Map<String, String>> wlf) {
        if (jVar != null) {
            this.a = jVar;
            if (voiceConsumer != null) {
                this.b = voiceConsumer;
                if (zVar != null) {
                    this.c = zVar;
                    if (wlf != null) {
                        this.d = wlf;
                        return;
                    }
                    throw new NullPointerException("Null queryMap");
                }
                throw new NullPointerException("Null nftDisabled");
            }
            throw new NullPointerException("Null consumer");
        }
        throw new NullPointerException("Null backend");
    }

    @Override // com.spotify.voice.api.model.l
    public j a() {
        return this.a;
    }

    @Override // com.spotify.voice.api.model.l
    public VoiceConsumer b() {
        return this.b;
    }

    @Override // com.spotify.voice.api.model.l
    public z<Boolean> d() {
        return this.c;
    }

    @Override // com.spotify.voice.api.model.l
    public wlf<Map<String, String>> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.a.equals(lVar.a()) || !this.b.equals(lVar.b()) || !this.c.equals(lVar.d()) || !this.d.equals(lVar.e())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceConfiguration{backend=");
        V0.append(this.a);
        V0.append(", consumer=");
        V0.append(this.b);
        V0.append(", nftDisabled=");
        V0.append(this.c);
        V0.append(", queryMap=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
