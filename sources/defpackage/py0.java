package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import kotlin.jvm.internal.h;

/* renamed from: py0  reason: default package */
public final class py0 implements ny0 {
    @Override // defpackage.ny0
    public ConfigurationResponse a(ConfigurationResponse configurationResponse) {
        h.e(configurationResponse, "current");
        Logger.b("Applying noop NoopConfigurationResponseOverrider", new Object[0]);
        return configurationResponse;
    }
}
