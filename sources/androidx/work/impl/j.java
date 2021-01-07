package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

public class j {
    public static j7 a = new a(1, 2);
    public static j7 b = new b(3, 4);
    public static j7 c = new c(4, 5);
    public static j7 d = new d(6, 7);
    public static j7 e = new e(7, 8);
    public static j7 f = new f(8, 9);

    class a extends j7 {
        a(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            p7Var.A("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            p7Var.A("DROP TABLE IF EXISTS alarmInfo");
            p7Var.A("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    class b extends j7 {
        b(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            if (Build.VERSION.SDK_INT >= 23) {
                p7Var.A("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    class c extends j7 {
        c(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            p7Var.A("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            p7Var.A("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    class d extends j7 {
        d(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    class e extends j7 {
        e(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    class f extends j7 {
        f(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            p7Var.A("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class g extends j7 {
        final Context c;

        public g(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            if (this.b >= 10) {
                p7Var.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class h extends j7 {
        final Context c;

        public h(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // defpackage.j7
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                p7Var.t();
                try {
                    p7Var.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    p7Var.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    p7Var.Y();
                } finally {
                    p7Var.i0();
                }
            }
            SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                p7Var.t();
                try {
                    p7Var.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    p7Var.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    p7Var.Y();
                } finally {
                    p7Var.i0();
                }
            }
        }
    }
}
