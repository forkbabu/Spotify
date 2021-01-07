package defpackage;

import com.spotify.voice.api.model.j;

/* renamed from: n9f  reason: default package */
public final class n9f implements fjf<j> {

    /* access modifiers changed from: private */
    /* renamed from: n9f$a */
    public static final class a {
        private static final n9f a = new n9f();
    }

    public static n9f a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        j.a a2 = j.a();
        a2.a("/v1/superbird/");
        return a2.build();
    }
}
