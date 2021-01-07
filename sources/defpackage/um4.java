package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.LogoutRequest;
import com.spotify.libs.connect.model.Message;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.b;
import io.reactivex.functions.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: um4  reason: default package */
public final class um4 implements com.spotify.music.features.connect.cast.discovery.b {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final zm4 b;
    private final y c;

    /* renamed from: um4$a */
    /* compiled from: java-style lambda group */
    static final class a<T> implements g<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public final void accept(String str) {
            int i = this.a;
            if (i == 0) {
                String str2 = str;
                Logger.b("Cast message resolved: " + str2, new Object[0]);
                h.d(str2, "it");
                ((b.a) this.b).a(str2);
            } else if (i == 1) {
                String str3 = str;
                Logger.b("Connect resolved for: " + str3, new Object[0]);
                h.d(str3, "it");
                ((b.a) this.b).b(str3);
            } else {
                throw null;
            }
        }
    }

    /* renamed from: um4$b */
    static final class b implements io.reactivex.functions.a {
        public static final b a = new b();

        b() {
        }

        @Override // io.reactivex.functions.a
        public final void run() {
        }
    }

    /* renamed from: um4$c */
    static final class c<T> implements g<LogoutRequest> {
        final /* synthetic */ b.a a;

        c(b.a aVar) {
            this.a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(LogoutRequest logoutRequest) {
            String str = logoutRequest.deviceId;
            Logger.b(je.x0("Logout resolved for: ", str), new Object[0]);
            b.a aVar = this.a;
            h.d(str, "deviceId");
            aVar.c(str);
        }
    }

    public um4(zm4 zm4, y yVar) {
        h.e(zm4, "castDiscoveryV1Endpoint");
        h.e(yVar, "mainScheduler");
        this.b = zm4;
        this.c = yVar;
    }

    @Override // com.spotify.music.features.connect.cast.discovery.b
    public void a(Message message) {
        h.e(message, "message");
        Logger.b("Cast put message: " + message, new Object[0]);
        this.a.b(this.b.a(message).A(this.c).subscribe());
    }

    @Override // com.spotify.music.features.connect.cast.discovery.b
    public void b(String str) {
        h.e(str, "discoveryName");
        Logger.b("Cast connect: " + str, new Object[0]);
        this.a.b(this.b.b(str).A(this.c).subscribe());
    }

    @Override // com.spotify.music.features.connect.cast.discovery.b
    public void c(DiscoveredDevice discoveredDevice) {
        h.e(discoveredDevice, "device");
        Logger.b("Cast delete device: " + discoveredDevice, new Object[0]);
        io.reactivex.disposables.a aVar = this.a;
        zm4 zm4 = this.b;
        String deviceId = discoveredDevice.getDeviceId();
        h.d(deviceId, "device.deviceId");
        aVar.b(zm4.d(deviceId, discoveredDevice).A(this.c).subscribe());
    }

    @Override // com.spotify.music.features.connect.cast.discovery.b
    public void d() {
        this.a.f();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.b
    public void e(DiscoveredDevice discoveredDevice, io.reactivex.functions.a aVar) {
        h.e(discoveredDevice, "device");
        h.e(aVar, "onCompleted");
        Logger.b("Cast put device: " + discoveredDevice, new Object[0]);
        io.reactivex.disposables.a aVar2 = this.a;
        zm4 zm4 = this.b;
        String deviceId = discoveredDevice.getDeviceId();
        h.d(deviceId, "device.deviceId");
        aVar2.b(zm4.e(deviceId, discoveredDevice).A(this.c).subscribe(aVar));
    }

    @Override // com.spotify.music.features.connect.cast.discovery.b
    public void f(DiscoveredDevice discoveredDevice) {
        h.e(discoveredDevice, "device");
        e(discoveredDevice, b.a);
    }

    @Override // com.spotify.music.features.connect.cast.discovery.b
    public void g(b.a aVar) {
        h.e(aVar, "listener");
        this.a.b(this.b.c().o0(this.c).subscribe(new a(0, aVar)));
        this.a.b(this.b.logout().o0(this.c).subscribe(new c(aVar)));
        this.a.b(this.b.f().o0(this.c).subscribe(new a(1, aVar)));
    }
}
