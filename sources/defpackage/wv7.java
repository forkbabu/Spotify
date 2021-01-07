package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.PushAndroidDeviceSettingsV1;
import com.spotify.messages.PushNotificationImageLoadFailedNonAuth;
import com.spotify.messages.PushNotificationPayloadErrorV1;
import com.spotify.messages.PushNotificationPayloadRejectedV1NonAuth;
import com.spotify.messages.PushNotificationReceivedV1NonAuth;
import com.spotify.messages.PushNotificationRichPushFallbackNonAuth;
import com.spotify.messages.PushTokenRegistrationErrorV1;
import com.spotify.messages.PushTokenRegistrationV1;

/* renamed from: wv7  reason: default package */
public class wv7 implements yzd {
    private final cqe a;
    private final gl0<u> b;

    public wv7(cqe cqe, gl0<u> gl0) {
        this.a = cqe;
        this.b = gl0;
    }

    @Override // defpackage.yzd
    public void a(String str, String str2, String str3) {
        PushNotificationReceivedV1NonAuth.b n = PushNotificationReceivedV1NonAuth.n();
        n.o(str);
        n.n(str2);
        n.m(str3);
        gl0<u> gl0 = this.b;
        n.p(this.a.d());
        gl0.d(n.build());
    }

    @Override // defpackage.yzd
    public void b(String str, String str2, String str3) {
        PushNotificationPayloadRejectedV1NonAuth.b n = PushNotificationPayloadRejectedV1NonAuth.n();
        if (str != null) {
            n.o(str);
        }
        if (str2 != null) {
            n.n(str2);
        }
        if (str3 != null) {
            n.m(str3);
        }
        gl0<u> gl0 = this.b;
        n.p(this.a.d());
        gl0.d(n.build());
    }

    @Override // defpackage.yzd
    public void c(String str, String str2, String str3) {
        PushNotificationRichPushFallbackNonAuth.b n = PushNotificationRichPushFallbackNonAuth.n();
        if (str != null) {
            n.o(str);
        }
        if (str2 != null) {
            n.n(str2);
        }
        if (str3 != null) {
            n.m(str3);
        }
        gl0<u> gl0 = this.b;
        n.p(this.a.d());
        gl0.d(n.build());
    }

    @Override // defpackage.yzd
    public void d(String str) {
        PushTokenRegistrationErrorV1.b l = PushTokenRegistrationErrorV1.l();
        if (str != null) {
            l.m(str);
        }
        gl0<u> gl0 = this.b;
        l.n(this.a.d());
        gl0.c(l.build());
    }

    @Override // defpackage.yzd
    public void e(String str, boolean z, boolean z2) {
        PushAndroidDeviceSettingsV1.b m = PushAndroidDeviceSettingsV1.m();
        m.m(str);
        gl0<u> gl0 = this.b;
        m.o(z);
        m.n(z2);
        gl0.c(m.build());
    }

    @Override // defpackage.yzd
    public void f() {
        PushTokenRegistrationV1.b i = PushTokenRegistrationV1.i();
        gl0<u> gl0 = this.b;
        i.m(this.a.d());
        gl0.c(i.build());
    }

    @Override // defpackage.yzd
    public void g(String str, String str2, String str3) {
        PushNotificationPayloadErrorV1.b n = PushNotificationPayloadErrorV1.n();
        if (str != null) {
            n.o(str);
        }
        if (str2 != null) {
            n.m(str2);
        }
        if (str3 != null) {
            n.n(str3);
        }
        gl0<u> gl0 = this.b;
        n.p(this.a.d());
        gl0.c(n.build());
    }

    @Override // defpackage.yzd
    public void h(String str, String str2, String str3) {
        PushNotificationImageLoadFailedNonAuth.b n = PushNotificationImageLoadFailedNonAuth.n();
        if (str != null) {
            n.o(str);
        }
        if (str2 != null) {
            n.n(str2);
        }
        if (str3 != null) {
            n.m(str3);
        }
        gl0<u> gl0 = this.b;
        n.p(this.a.d());
        gl0.d(n.build());
    }
}
