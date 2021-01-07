package com.spotify.mobile.android.service.media.browser;

import com.spotify.mobile.android.service.media.browser.l;

public abstract class BrowserParams {

    public enum Protocol {
        PROTOCOL_INTER_APP("protocol_inter_app"),
        PROTOCOL_MEDIA_SESSION("protocol_media_session"),
        PROTOCOL_MEDIA_BUTTON("protocol_media_button");
        
        private final String mName;

        private Protocol(String str) {
            this.mName = str;
        }

        public String d() {
            return this.mName;
        }
    }

    public enum TransportType {
        MEDIA_BROWSER_SERVICE("media_browser_service"),
        INTER_APP_PROTOCOL("inter_app_protocol"),
        GENIE("genie"),
        UNKNOWN("unknown");
        
        private final String mName;

        private TransportType(String str) {
            this.mName = str;
        }

        public String d() {
            return this.mName;
        }
    }

    public interface a {
        a a(boolean z);

        a b(String str);

        BrowserParams build();

        a c(String str);

        a d(String str);

        a e(boolean z);

        a f(boolean z);

        a g(String str);

        a h(boolean z);

        a i(String str);

        a j(boolean z);
    }

    private static a a(String str, boolean z, TransportType transportType, Protocol protocol) {
        l.b bVar = new l.b();
        bVar.i(str);
        bVar.f(z);
        bVar.h(true);
        bVar.e(false);
        bVar.j(false);
        bVar.l(transportType);
        bVar.k(protocol);
        bVar.a(false);
        return bVar;
    }

    public static a b(String str, boolean z) {
        return a(str, z, TransportType.GENIE, Protocol.PROTOCOL_MEDIA_BUTTON);
    }

    public static a c(String str, boolean z) {
        return a(str, z, TransportType.INTER_APP_PROTOCOL, Protocol.PROTOCOL_INTER_APP);
    }

    public static a d(String str, boolean z) {
        return a(str, z, TransportType.MEDIA_BROWSER_SERVICE, Protocol.PROTOCOL_MEDIA_SESSION);
    }

    public static boolean q(String str) {
        return "automotive".equals(str) || "default-cars".equals(str);
    }

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract Protocol i();

    public abstract String j();

    public abstract TransportType k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract a r();
}
