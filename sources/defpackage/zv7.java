package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.PushNotificationAndroidOSChannels;
import java.util.List;

/* renamed from: zv7  reason: default package */
public final class zv7 implements bw7 {
    private final gl0<u> a;

    public zv7(gl0<u> gl0) {
        this.a = gl0;
    }

    @Override // defpackage.bw7
    public void a(List<String> list, String str) {
        gl0<u> gl0 = this.a;
        PushNotificationAndroidOSChannels.b m = PushNotificationAndroidOSChannels.m();
        m.o("CHANNELS_UNREGISTERED");
        m.m(list);
        m.n(str);
        gl0.c(m.build());
    }

    @Override // defpackage.bw7
    public void b(List<String> list, String str) {
        gl0<u> gl0 = this.a;
        PushNotificationAndroidOSChannels.b m = PushNotificationAndroidOSChannels.m();
        m.o("CHANNELS_ENABLED");
        m.m(list);
        m.n(str);
        gl0.c(m.build());
    }

    @Override // defpackage.bw7
    public void c(List<String> list, String str) {
        gl0<u> gl0 = this.a;
        PushNotificationAndroidOSChannels.b m = PushNotificationAndroidOSChannels.m();
        m.o("CHANNELS_REGISTERED");
        m.m(list);
        m.n(str);
        gl0.c(m.build());
    }

    @Override // defpackage.bw7
    public void d(List<String> list, String str) {
        gl0<u> gl0 = this.a;
        PushNotificationAndroidOSChannels.b m = PushNotificationAndroidOSChannels.m();
        m.o("CHANNELS_DISABLED");
        m.m(list);
        m.n(str);
        gl0.c(m.build());
    }
}
