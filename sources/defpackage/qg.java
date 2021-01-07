package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: qg  reason: default package */
public final class qg implements fjf<Executor> {
    private static final qg a = new qg();

    public static qg a() {
        return a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rg(Executors.newSingleThreadExecutor());
    }
}
