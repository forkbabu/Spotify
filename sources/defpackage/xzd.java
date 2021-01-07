package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: xzd  reason: default package */
public final class xzd implements fjf<FirebaseInstanceId> {

    /* access modifiers changed from: private */
    /* renamed from: xzd$a */
    public static final class a {
        private static final xzd a = new xzd();
    }

    public static xzd a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        FirebaseInstanceId k = FirebaseInstanceId.k();
        yif.g(k, "Cannot return null from a non-@Nullable @Provides method");
        return k;
    }
}
