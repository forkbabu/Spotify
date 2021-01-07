package androidx.work.impl;

import androidx.room.RoomDatabase;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends RoomDatabase {
    private static final long k = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int l = 0;

    static String u() {
        StringBuilder V0 = je.V0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        V0.append(System.currentTimeMillis() - k);
        V0.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return V0.toString();
    }

    public abstract ka A();

    public abstract s9 t();

    public abstract v9 v();

    public abstract y9 w();

    public abstract ba x();

    public abstract ea y();

    public abstract ha z();
}
