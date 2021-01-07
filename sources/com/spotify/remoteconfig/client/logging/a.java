package com.spotify.remoteconfig.client.logging;

import com.spotify.messages.ConfigurationApplied;
import com.spotify.messages.ConfigurationFetched;
import com.spotify.messages.DefaultConfigurationApplied;
import com.spotify.messages.ResolveConfigurationError;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.remoteconfig.client.logging.EventLogger;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import kotlin.jvm.internal.h;

public final class a implements EventLogger {
    private final hl0 a;
    private final String b;

    public a(hl0 hl0, String str) {
        h.f(hl0, "eventPublisher");
        h.f(str, "sdkVersionName");
        this.a = hl0;
        this.b = str;
    }

    private final ConfigurationFetched.b e(FetchType fetchType, long j, c0e c0e) {
        ConfigurationFetched.b x = ConfigurationFetched.x();
        x.p(fetchType.name());
        x.s(j);
        x.q(c0e.c());
        x.u("ANDROID");
        x.w(c0e.a());
        x.x(c0e.b());
        x.v(c0e.d());
        x.y(this.b);
        h.b(x, "ConfigurationFetched.new…dkVersion(sdkVersionName)");
        return x;
    }

    public void a(c0e c0e, d0e d0e) {
        h.f(c0e, "clientAttributes");
        h.f(d0e, "configuration");
        if (d0e.h()) {
            DefaultConfigurationApplied.b o = DefaultConfigurationApplied.o();
            o.n(c0e.c());
            o.p(c0e.a());
            o.q(c0e.b());
            o.o("ANDROID");
            o.m(d0e.d());
            this.a.b("DefaultConfigurationApplied", ((DefaultConfigurationApplied) o.build()).toByteArray());
            return;
        }
        ConfigurationApplied.b q = ConfigurationApplied.q();
        q.o(c0e.c());
        q.r(c0e.a());
        q.s(c0e.b());
        q.q("ANDROID");
        q.m(d0e.e());
        q.p(d0e.g());
        q.n(d0e.d());
        this.a.b("ConfigurationApplied", ((ConfigurationApplied) q.build()).toByteArray());
    }

    public void b(c0e c0e, int i, String str) {
        h.f(c0e, "clientAttributes");
        h.f(str, AppProtocol.LogMessage.SEVERITY_ERROR);
        ResolveConfigurationError.b n = ResolveConfigurationError.n();
        n.m(c0e.a());
        n.n(c0e.b());
        n.o(str);
        n.p((long) i);
        this.a.b("ResolveConfigurationError", ((ResolveConfigurationError) n.build()).toByteArray());
    }

    public void c(FetchType fetchType, long j, c0e c0e, EventLogger.FetchErrorReason fetchErrorReason, String str, int i) {
        h.f(fetchType, "fetchType");
        h.f(c0e, "clientAttributes");
        h.f(fetchErrorReason, "errorReason");
        ConfigurationFetched.b e = e(fetchType, j, c0e);
        e.z(i);
        e.o(fetchErrorReason.d());
        if (str != null) {
            e.n(str);
        }
        this.a.b("ConfigurationFetched", ((ConfigurationFetched) e.build()).toByteArray());
    }

    public void d(FetchType fetchType, long j, int i, c0e c0e, String str, Long l) {
        h.f(fetchType, "fetchType");
        h.f(c0e, "clientAttributes");
        h.f(str, "configurationAssignmentId");
        long longValue = (l == null || l.longValue() == 0) ? -1 : l.longValue();
        ConfigurationFetched.b e = e(fetchType, j, c0e);
        e.m(str);
        e.t((long) i);
        e.r(longValue);
        this.a.b("ConfigurationFetched", ((ConfigurationFetched) e.build()).toByteArray());
    }
}
