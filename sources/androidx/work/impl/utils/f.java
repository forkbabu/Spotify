package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;

public class f {
    private final WorkDatabase a;

    public f(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public boolean a() {
        Long a2 = ((w9) this.a.v()).a("reschedule_needed");
        return a2 != null && a2.longValue() == 1;
    }

    public void b(boolean z) {
        ((w9) this.a.v()).b(new u9("reschedule_needed", z));
    }
}
