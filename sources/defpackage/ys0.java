package defpackage;

import com.google.protobuf.u;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.instrumentation.a;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.messages.ConnectVolumeControl;

/* renamed from: ys0  reason: default package */
public final class ys0 implements ConnectVolumeControlInstrumentation {
    private final gl0<u> a;
    private final h b;
    private final a c;

    public ys0(gl0<u> gl0, h hVar, a aVar) {
        kotlin.jvm.internal.h.e(gl0, "eventPublisher");
        kotlin.jvm.internal.h.e(hVar, "activeDeviceProvider");
        kotlin.jvm.internal.h.e(aVar, "applicationStateProvider");
        this.a = gl0;
        this.b = hVar;
        this.c = aVar;
    }

    private final void e(ConnectVolumeControlInstrumentation.Action action, String str, float f, Float f2) {
        GaiaDevice b2 = this.b.b();
        if (b2 != null && !b2.isSelf()) {
            String loggingIdentifier = b2.getLoggingIdentifier();
            ConnectVolumeControlInstrumentation.ApplicationState b3 = this.c.b();
            ConnectVolumeControl.b p = ConnectVolumeControl.p();
            p.o(loggingIdentifier);
            p.r(f);
            p.m(action.d());
            p.n(str);
            p.p(b3.d());
            if (f2 != null) {
                kotlin.jvm.internal.h.d(p, "eventBuilder");
                p.q(f2.floatValue());
            }
            this.a.c((ConnectVolumeControl) p.build());
        }
    }

    @Override // com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation
    public void a(ConnectVolumeControlInstrumentation.SetSystemVolume setSystemVolume, float f, Float f2) {
        kotlin.jvm.internal.h.e(setSystemVolume, "reason");
        e(ConnectVolumeControlInstrumentation.Action.SET_SYSTEM_VOLUME, setSystemVolume.d(), f, f2);
    }

    @Override // com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation
    public void b(ConnectVolumeControlInstrumentation.SendVolumeCommand sendVolumeCommand, float f, Float f2) {
        kotlin.jvm.internal.h.e(sendVolumeCommand, "command");
        e(ConnectVolumeControlInstrumentation.Action.SEND_VOLUME_COMMAND, sendVolumeCommand.d(), f, f2);
    }

    @Override // com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation
    public void c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated systemVolumeUpdated, float f, Float f2) {
        kotlin.jvm.internal.h.e(systemVolumeUpdated, "reason");
        e(ConnectVolumeControlInstrumentation.Action.SYSTEM_VOLUME_UPDATED, systemVolumeUpdated.d(), f, f2);
    }

    @Override // com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation
    public void d(ConnectVolumeControlInstrumentation.RemoteVolumeReceived remoteVolumeReceived, float f, Float f2) {
        kotlin.jvm.internal.h.e(remoteVolumeReceived, "origin");
        e(ConnectVolumeControlInstrumentation.Action.REMOTE_VOLUME_RECEIVED, remoteVolumeReceived.d(), f, f2);
    }
}
