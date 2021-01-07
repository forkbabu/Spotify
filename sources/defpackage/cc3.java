package defpackage;

import com.google.common.base.Optional;
import java.util.concurrent.ExecutorService;

/* renamed from: cc3  reason: default package */
public final class cc3 implements fjf<Optional<ExecutorService>> {

    /* access modifiers changed from: private */
    /* renamed from: cc3$a */
    public static final class a {
        private static final cc3 a = new cc3();
    }

    public static cc3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Optional.absent();
    }
}
