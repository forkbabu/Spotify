package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: dd3  reason: default package */
public final class dd3 implements fjf<Random> {

    /* access modifiers changed from: private */
    /* renamed from: dd3$a */
    public static final class a {
        private static final dd3 a = new dd3();
    }

    public static dd3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new Random(new SecureRandom().nextLong());
    }
}
