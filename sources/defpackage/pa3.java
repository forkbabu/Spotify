package defpackage;

import android.app.Service;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: pa3  reason: default package */
public final class pa3 implements fjf<Class<? extends Service>> {

    /* access modifiers changed from: private */
    /* renamed from: pa3$a */
    public static final class a {
        private static final pa3 a = new pa3();
    }

    public static pa3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return SpotifyService.class;
    }
}
