package defpackage;

import android.content.Context;
import com.spotify.music.internal.util.process.ProcessType;

/* renamed from: qu2  reason: default package */
public final class qu2 implements fjf<ProcessType> {
    private final wlf<Context> a;

    public qu2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        if (ig0.b()) {
            return ProcessType.UNKNOWN;
        }
        String a2 = new cd0(context).a("com.spotify.music");
        if (a2.contains("robolectric.ui")) {
            throw new AssertionError("this should not be necessary, please use TestingHelper instead");
        } else if (a2.contains(".gdbprocess")) {
            return ProcessType.GDBPROCESS;
        } else {
            if (a2.contains("com.spotify.music")) {
                return ProcessType.MAIN;
            }
            throw new AssertionError(je.y0("The process name ", a2, " is not allowed to start"));
        }
    }
}
