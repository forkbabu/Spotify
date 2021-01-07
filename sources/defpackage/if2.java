package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.crashreporting.model.CrashReportingAppProtocol;
import defpackage.cf2;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: if2  reason: default package */
public final class if2 implements com.spotify.music.appprotocol.api.a {
    private final hkd a;

    /* renamed from: if2$a */
    static final class a<A extends JacksonModel, R extends JacksonModel> implements cf2.c<CrashReportingAppProtocol.DeviceCrashReport, AppProtocolBase.Empty> {
        final /* synthetic */ if2 a;

        a(if2 if2) {
            this.a = if2;
        }

        /* Return type fixed from 'io.reactivex.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.mobile.android.cosmos.JacksonModel] */
        @Override // defpackage.cf2.c
        public s<AppProtocolBase.Empty> a(CrashReportingAppProtocol.DeviceCrashReport deviceCrashReport) {
            CrashReportingAppProtocol.DeviceCrashReport deviceCrashReport2 = deviceCrashReport;
            if2 if2 = this.a;
            h.d(deviceCrashReport2, "it");
            return if2.b(deviceCrashReport2);
        }
    }

    public if2(hkd hkd) {
        h.e(hkd, "crashReporter");
        this.a = hkd;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        cf2 b = cf2.b(CrashReportingAppProtocol.DeviceCrashReport.class, AppProtocolBase.Empty.class);
        b.d("com.spotify.superbird.crashes.report");
        b.c(0);
        b.e(new a(this));
        qg0.accept(b.a());
    }

    public final s<AppProtocolBase.Empty> b(CrashReportingAppProtocol.DeviceCrashReport deviceCrashReport) {
        h.e(deviceCrashReport, "report");
        s<AppProtocolBase.Empty> g = this.a.a(deviceCrashReport.getSerial(), deviceCrashReport.getVersionSoftware(), deviceCrashReport.getVersionOs(), deviceCrashReport.getMinidump()).g(s.i0(AppProtocolBase.a));
        h.d(g, "crashReporter\n          …t(AppProtocolBase.EMPTY))");
        return g;
    }
}
