package defpackage;

import com.comscore.util.crashreport.CrashReportManager;

/* renamed from: xq8  reason: default package */
public final class xq8 implements fjf<Integer> {

    /* access modifiers changed from: private */
    /* renamed from: xq8$a */
    public static final class a {
        private static final xq8 a = new xq8();
    }

    public static xq8 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf((int) CrashReportManager.TIME_WINDOW);
    }
}
