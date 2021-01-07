package defpackage;

import com.spotify.voice.api.model.j;

/* renamed from: fub  reason: default package */
public final class fub implements fjf<j> {

    /* access modifiers changed from: private */
    /* renamed from: fub$a */
    public static final class a {
        private static final fub a = new fub();
    }

    public static fub a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        j.a a2 = j.a();
        a2.a("/v2/android-car-view/");
        return a2.build();
    }
}
