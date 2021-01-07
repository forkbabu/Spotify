package defpackage;

import com.spotify.instrumentation.navigation.logger.NavigationLoggerApplicationInstaller;
import com.spotify.instrumentation.navigation.logger.m;

/* renamed from: da3  reason: default package */
public final class da3 implements fjf<NavigationLoggerApplicationInstaller> {
    private final wlf<m> a;

    public da3(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new NavigationLoggerApplicationInstaller(this.a.get());
    }
}
