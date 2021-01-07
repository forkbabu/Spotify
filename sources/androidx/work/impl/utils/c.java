package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;

public class c {
    private final WorkDatabase a;

    public c(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    private int b(String str) {
        this.a.c();
        try {
            Long a2 = ((w9) this.a.v()).a(str);
            int i = 0;
            int intValue = a2 != null ? a2.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            ((w9) this.a.v()).b(new u9(str, (long) i));
            this.a.s();
            return intValue;
        } finally {
            this.a.h();
        }
    }

    public int a() {
        int b;
        synchronized (c.class) {
            b = b("next_alarm_manager_id");
        }
        return b;
    }

    public int c(int i, int i2) {
        synchronized (c.class) {
            int b = b("next_job_scheduler_id");
            if (b >= i) {
                if (b <= i2) {
                    i = b;
                }
            }
            ((w9) this.a.v()).b(new u9("next_job_scheduler_id", (long) (i + 1)));
        }
        return i;
    }
}
