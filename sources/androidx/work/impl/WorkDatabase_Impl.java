package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile ha m;
    private volatile s9 n;
    private volatile ka o;
    private volatile y9 p;
    private volatile ba q;
    private volatile ea r;
    private volatile v9 s;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            p7Var.A("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            p7Var.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `Dependency`");
            p7Var.A("DROP TABLE IF EXISTS `WorkSpec`");
            p7Var.A("DROP TABLE IF EXISTS `WorkTag`");
            p7Var.A("DROP TABLE IF EXISTS `SystemIdInfo`");
            p7Var.A("DROP TABLE IF EXISTS `WorkName`");
            p7Var.A("DROP TABLE IF EXISTS `WorkProgress`");
            p7Var.A("DROP TABLE IF EXISTS `Preference`");
            if (((RoomDatabase) WorkDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) WorkDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) WorkDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) WorkDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) WorkDatabase_Impl.this).a = p7Var;
            p7Var.A("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) WorkDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) WorkDatabase_Impl.this).h.get(i)).a(p7Var);
                }
            }
        }

        @Override // androidx.room.i.a
        public void e(p7 p7Var) {
        }

        @Override // androidx.room.i.a
        public void f(p7 p7Var) {
            l7.a(p7Var);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public i.b g(p7 p7Var) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new n7.a("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet d1 = je.d1(hashMap, "prerequisite_id", new n7.a("prerequisite_id", "TEXT", true, 2, null, 1), 2);
            d1.add(new n7.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            d1.add(new n7.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new n7.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet.add(new n7.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            n7 n7Var = new n7("Dependency", hashMap, d1, hashSet);
            n7 a = n7.a(p7Var, "Dependency");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            HashMap hashMap2 = new HashMap(24);
            hashMap2.put("id", new n7.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new n7.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new n7.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new n7.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new n7.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new n7.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new n7.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new n7.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new n7.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new n7.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new n7.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new n7.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new n7.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new n7.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new n7.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new n7.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new n7.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new n7.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new n7.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new n7.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new n7.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new n7.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new n7.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            HashSet d12 = je.d1(hashMap2, "content_uri_triggers", new n7.a("content_uri_triggers", "BLOB", false, 0, null, 1), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new n7.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet2.add(new n7.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            n7 n7Var2 = new n7("WorkSpec", hashMap2, d12, hashSet2);
            n7 a2 = n7.a(p7Var, "WorkSpec");
            if (!n7Var2.equals(a2)) {
                return new i.b(false, je.v0("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", n7Var2, "\n Found:\n", a2));
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new n7.a("tag", "TEXT", true, 1, null, 1));
            HashSet d13 = je.d1(hashMap3, "work_spec_id", new n7.a("work_spec_id", "TEXT", true, 2, null, 1), 1);
            d13.add(new n7.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new n7.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            n7 n7Var3 = new n7("WorkTag", hashMap3, d13, hashSet3);
            n7 a3 = n7.a(p7Var, "WorkTag");
            if (!n7Var3.equals(a3)) {
                return new i.b(false, je.v0("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", n7Var3, "\n Found:\n", a3));
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new n7.a("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet d14 = je.d1(hashMap4, "system_id", new n7.a("system_id", "INTEGER", true, 0, null, 1), 1);
            d14.add(new n7.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            n7 n7Var4 = new n7("SystemIdInfo", hashMap4, d14, new HashSet(0));
            n7 a4 = n7.a(p7Var, "SystemIdInfo");
            if (!n7Var4.equals(a4)) {
                return new i.b(false, je.v0("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", n7Var4, "\n Found:\n", a4));
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new n7.a("name", "TEXT", true, 1, null, 1));
            HashSet d15 = je.d1(hashMap5, "work_spec_id", new n7.a("work_spec_id", "TEXT", true, 2, null, 1), 1);
            d15.add(new n7.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new n7.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            n7 n7Var5 = new n7("WorkName", hashMap5, d15, hashSet4);
            n7 a5 = n7.a(p7Var, "WorkName");
            if (!n7Var5.equals(a5)) {
                return new i.b(false, je.v0("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", n7Var5, "\n Found:\n", a5));
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new n7.a("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet d16 = je.d1(hashMap6, "progress", new n7.a("progress", "BLOB", true, 0, null, 1), 1);
            d16.add(new n7.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            n7 n7Var6 = new n7("WorkProgress", hashMap6, d16, new HashSet(0));
            n7 a6 = n7.a(p7Var, "WorkProgress");
            if (!n7Var6.equals(a6)) {
                return new i.b(false, je.v0("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", n7Var6, "\n Found:\n", a6));
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new n7.a("key", "TEXT", true, 1, null, 1));
            n7 n7Var7 = new n7("Preference", hashMap7, je.d1(hashMap7, "long_value", new n7.a("long_value", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
            n7 a7 = n7.a(p7Var, "Preference");
            if (!n7Var7.equals(a7)) {
                return new i.b(false, je.v0("Preference(androidx.work.impl.model.Preference).\n Expected:\n", n7Var7, "\n Found:\n", a7));
            }
            return new i.b(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public ka A() {
        ka kaVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new la(this);
            }
            kaVar = this.o;
        }
        return kaVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(11), "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public s9 t() {
        s9 s9Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new t9(this);
            }
            s9Var = this.n;
        }
        return s9Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public v9 v() {
        v9 v9Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new w9(this);
            }
            v9Var = this.s;
        }
        return v9Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public y9 w() {
        y9 y9Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new z9(this);
            }
            y9Var = this.p;
        }
        return y9Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ba x() {
        ba baVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new ca(this);
            }
            baVar = this.q;
        }
        return baVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ea y() {
        ea eaVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new fa(this);
            }
            eaVar = this.r;
        }
        return eaVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ha z() {
        ha haVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ia(this);
            }
            haVar = this.m;
        }
        return haVar;
    }
}
