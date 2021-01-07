package defpackage;

import com.spotify.pses.v1.proto.ConfigurationResponse;
import kotlin.jvm.internal.h;

/* renamed from: dy0  reason: default package */
public final class dy0 extends tx0 {
    private final ConfigurationResponse a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dy0(ConfigurationResponse configurationResponse) {
        super(null);
        h.e(configurationResponse, "response");
        this.a = configurationResponse;
    }

    @Override // defpackage.tx0
    public ConfigurationResponse a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof dy0) && h.a(this.a, ((dy0) obj).a);
        }
        return true;
    }

    public int hashCode() {
        ConfigurationResponse configurationResponse = this.a;
        if (configurationResponse != null) {
            return configurationResponse.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SourceBackend(response=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
