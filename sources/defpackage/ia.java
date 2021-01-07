package defpackage;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.o;
import androidx.work.WorkInfo;
import defpackage.ga;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: ia  reason: default package */
public final class ia implements ha {
    private final RoomDatabase a;
    private final androidx.room.c<ga> b;
    private final o c;
    private final o d;
    private final o e;
    private final o f;
    private final o g;
    private final o h;
    private final o i;

    /* renamed from: ia$a */
    class a implements Callable<List<ga.c>> {
        final /* synthetic */ androidx.room.j a;

        a(androidx.room.j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public List<ga.c> call() {
            ia.this.a.c();
            try {
                Cursor b2 = l7.b(ia.this.a, this.a, true, null);
                try {
                    int d = h7.d(b2, "id");
                    int d2 = h7.d(b2, "state");
                    int d3 = h7.d(b2, "output");
                    int d4 = h7.d(b2, "run_attempt_count");
                    m1 m1Var = new m1();
                    m1 m1Var2 = new m1();
                    while (b2.moveToNext()) {
                        if (!b2.isNull(d)) {
                            String string = b2.getString(d);
                            if (((ArrayList) m1Var.get(string)) == null) {
                                m1Var.put(string, new ArrayList());
                            }
                        }
                        if (!b2.isNull(d)) {
                            String string2 = b2.getString(d);
                            if (((ArrayList) m1Var2.get(string2)) == null) {
                                m1Var2.put(string2, new ArrayList());
                            }
                        }
                    }
                    b2.moveToPosition(-1);
                    ia.this.b(m1Var);
                    ia.this.a(m1Var2);
                    ArrayList arrayList = new ArrayList(b2.getCount());
                    while (b2.moveToNext()) {
                        ArrayList arrayList2 = !b2.isNull(d) ? (ArrayList) m1Var.get(b2.getString(d)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !b2.isNull(d) ? (ArrayList) m1Var2.get(b2.getString(d)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        ga.c cVar = new ga.c();
                        cVar.a = b2.getString(d);
                        cVar.b = ma.d(b2.getInt(d2));
                        cVar.c = androidx.work.d.a(b2.getBlob(d3));
                        cVar.d = b2.getInt(d4);
                        cVar.e = arrayList2;
                        cVar.f = arrayList3;
                        arrayList.add(cVar);
                    }
                    ia.this.a.s();
                    b2.close();
                    return arrayList;
                } catch (Throwable th) {
                    b2.close();
                    throw th;
                }
            } finally {
                ia.this.a.h();
            }
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            this.a.f();
        }
    }

    /* renamed from: ia$b */
    class b extends androidx.room.c<ga> {
        b(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01ac  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6 A[SYNTHETIC, Splitter:B:75:0x01b6] */
        @Override // androidx.room.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(defpackage.t7 r17, defpackage.ga r18) {
            /*
            // Method dump skipped, instructions count: 486
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ia.b.d(t7, java.lang.Object):void");
        }
    }

    /* renamed from: ia$c */
    class c extends o {
        c(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: ia$d */
    class d extends o {
        d(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: ia$e */
    class e extends o {
        e(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: ia$f */
    class f extends o {
        f(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: ia$g */
    class g extends o {
        g(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: ia$h */
    class h extends o {
        h(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: ia$i */
    class i extends o {
        i(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: ia$j */
    class j extends o {
        j(ia iaVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public ia(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new b(this, roomDatabase);
        this.c = new c(this, roomDatabase);
        this.d = new d(this, roomDatabase);
        this.e = new e(this, roomDatabase);
        this.f = new f(this, roomDatabase);
        this.g = new g(this, roomDatabase);
        this.h = new h(this, roomDatabase);
        this.i = new i(this, roomDatabase);
        new j(this, roomDatabase);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(m1<String, ArrayList<androidx.work.d>> m1Var) {
        ArrayList<androidx.work.d> arrayList;
        int i2;
        Set<String> keySet = m1Var.keySet();
        if (!keySet.isEmpty()) {
            if (m1Var.size() > 999) {
                m1<String, ArrayList<androidx.work.d>> m1Var2 = new m1<>(999);
                int size = m1Var.size();
                int i3 = 0;
                loop0:
                while (true) {
                    i2 = 0;
                    while (i3 < size) {
                        m1Var2.put(m1Var.i(i3), m1Var.m(i3));
                        i3++;
                        i2++;
                        if (i2 == 999) {
                            a(m1Var2);
                            m1Var2 = new m1<>(999);
                        }
                    }
                    break loop0;
                }
                if (i2 > 0) {
                    a(m1Var2);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            m7.a(sb, size2);
            sb.append(")");
            androidx.room.j d2 = androidx.room.j.d(sb.toString(), size2 + 0);
            int i4 = 1;
            for (String str : keySet) {
                if (str == null) {
                    d2.O1(i4);
                } else {
                    d2.a1(i4, str);
                }
                i4++;
            }
            Cursor b2 = l7.b(this.a, d2, false, null);
            try {
                int c2 = h7.c(b2, "work_spec_id");
                if (c2 != -1) {
                    while (b2.moveToNext()) {
                        if (!b2.isNull(c2) && (arrayList = m1Var.get(b2.getString(c2))) != null) {
                            arrayList.add(androidx.work.d.a(b2.getBlob(0)));
                        }
                    }
                    b2.close();
                }
            } finally {
                b2.close();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(m1<String, ArrayList<String>> m1Var) {
        ArrayList<String> arrayList;
        int i2;
        Set<String> keySet = m1Var.keySet();
        if (!keySet.isEmpty()) {
            if (m1Var.size() > 999) {
                m1<String, ArrayList<String>> m1Var2 = new m1<>(999);
                int size = m1Var.size();
                int i3 = 0;
                loop0:
                while (true) {
                    i2 = 0;
                    while (i3 < size) {
                        m1Var2.put(m1Var.i(i3), m1Var.m(i3));
                        i3++;
                        i2++;
                        if (i2 == 999) {
                            b(m1Var2);
                            m1Var2 = new m1<>(999);
                        }
                    }
                    break loop0;
                }
                if (i2 > 0) {
                    b(m1Var2);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            m7.a(sb, size2);
            sb.append(")");
            androidx.room.j d2 = androidx.room.j.d(sb.toString(), size2 + 0);
            int i4 = 1;
            for (String str : keySet) {
                if (str == null) {
                    d2.O1(i4);
                } else {
                    d2.a1(i4, str);
                }
                i4++;
            }
            Cursor b2 = l7.b(this.a, d2, false, null);
            try {
                int c2 = h7.c(b2, "work_spec_id");
                if (c2 != -1) {
                    while (b2.moveToNext()) {
                        if (!b2.isNull(c2) && (arrayList = m1Var.get(b2.getString(c2))) != null) {
                            arrayList.add(b2.getString(0));
                        }
                    }
                    b2.close();
                }
            } finally {
                b2.close();
            }
        }
    }

    public void f(String str) {
        this.a.b();
        t7 a2 = this.c.a();
        if (str == null) {
            a2.O1(1);
        } else {
            a2.a1(1, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.s();
        } finally {
            this.a.h();
            this.c.c(a2);
        }
    }

    public List<ga> g() {
        androidx.room.j jVar;
        Throwable th;
        androidx.room.j d2 = androidx.room.j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time", 0);
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            int d3 = h7.d(b2, "required_network_type");
            int d4 = h7.d(b2, "requires_charging");
            int d5 = h7.d(b2, "requires_device_idle");
            int d6 = h7.d(b2, "requires_battery_not_low");
            int d7 = h7.d(b2, "requires_storage_not_low");
            int d8 = h7.d(b2, "trigger_content_update_delay");
            int d9 = h7.d(b2, "trigger_max_content_delay");
            int d10 = h7.d(b2, "content_uri_triggers");
            int d11 = h7.d(b2, "id");
            int d12 = h7.d(b2, "state");
            int d13 = h7.d(b2, "worker_class_name");
            int d14 = h7.d(b2, "input_merger_class_name");
            int d15 = h7.d(b2, "input");
            int d16 = h7.d(b2, "output");
            jVar = d2;
            try {
                int d17 = h7.d(b2, "initial_delay");
                int d18 = h7.d(b2, "interval_duration");
                int d19 = h7.d(b2, "flex_duration");
                int d20 = h7.d(b2, "run_attempt_count");
                int d21 = h7.d(b2, "backoff_policy");
                int d22 = h7.d(b2, "backoff_delay_duration");
                int d23 = h7.d(b2, "period_start_time");
                int d24 = h7.d(b2, "minimum_retention_duration");
                int d25 = h7.d(b2, "schedule_requested_at");
                int d26 = h7.d(b2, "run_in_foreground");
                int i2 = d16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(d11);
                    String string2 = b2.getString(d13);
                    androidx.work.b bVar = new androidx.work.b();
                    bVar.k(ma.c(b2.getInt(d3)));
                    bVar.m(b2.getInt(d4) != 0);
                    bVar.n(b2.getInt(d5) != 0);
                    bVar.l(b2.getInt(d6) != 0);
                    bVar.o(b2.getInt(d7) != 0);
                    bVar.p(b2.getLong(d8));
                    bVar.q(b2.getLong(d9));
                    bVar.j(ma.a(b2.getBlob(d10)));
                    ga gaVar = new ga(string, string2);
                    gaVar.b = ma.d(b2.getInt(d12));
                    gaVar.d = b2.getString(d14);
                    gaVar.e = androidx.work.d.a(b2.getBlob(d15));
                    gaVar.f = androidx.work.d.a(b2.getBlob(i2));
                    i2 = i2;
                    gaVar.g = b2.getLong(d17);
                    gaVar.h = b2.getLong(d18);
                    gaVar.i = b2.getLong(d19);
                    gaVar.k = b2.getInt(d20);
                    gaVar.l = ma.b(b2.getInt(d21));
                    d19 = d19;
                    gaVar.m = b2.getLong(d22);
                    gaVar.n = b2.getLong(d23);
                    d23 = d23;
                    gaVar.o = b2.getLong(d24);
                    gaVar.p = b2.getLong(d25);
                    gaVar.q = b2.getInt(d26) != 0;
                    gaVar.j = bVar;
                    arrayList.add(gaVar);
                    d25 = d25;
                    d26 = d26;
                    d4 = d4;
                    d15 = d15;
                    d17 = d17;
                    d18 = d18;
                    d20 = d20;
                    d11 = d11;
                    d13 = d13;
                    d3 = d3;
                    d24 = d24;
                    d5 = d5;
                    d22 = d22;
                    d6 = d6;
                    d21 = d21;
                }
                b2.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = d2;
            b2.close();
            jVar.f();
            throw th;
        }
    }

    public List<String> h() {
        androidx.room.j d2 = androidx.room.j.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public List<ga> i(int i2) {
        androidx.room.j jVar;
        Throwable th;
        androidx.room.j d2 = androidx.room.j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d2.t1(1, (long) i2);
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            int d3 = h7.d(b2, "required_network_type");
            int d4 = h7.d(b2, "requires_charging");
            int d5 = h7.d(b2, "requires_device_idle");
            int d6 = h7.d(b2, "requires_battery_not_low");
            int d7 = h7.d(b2, "requires_storage_not_low");
            int d8 = h7.d(b2, "trigger_content_update_delay");
            int d9 = h7.d(b2, "trigger_max_content_delay");
            int d10 = h7.d(b2, "content_uri_triggers");
            int d11 = h7.d(b2, "id");
            int d12 = h7.d(b2, "state");
            int d13 = h7.d(b2, "worker_class_name");
            int d14 = h7.d(b2, "input_merger_class_name");
            int d15 = h7.d(b2, "input");
            int d16 = h7.d(b2, "output");
            jVar = d2;
            try {
                int d17 = h7.d(b2, "initial_delay");
                int d18 = h7.d(b2, "interval_duration");
                int d19 = h7.d(b2, "flex_duration");
                int d20 = h7.d(b2, "run_attempt_count");
                int d21 = h7.d(b2, "backoff_policy");
                int d22 = h7.d(b2, "backoff_delay_duration");
                int d23 = h7.d(b2, "period_start_time");
                int d24 = h7.d(b2, "minimum_retention_duration");
                int d25 = h7.d(b2, "schedule_requested_at");
                int d26 = h7.d(b2, "run_in_foreground");
                int i3 = d16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(d11);
                    String string2 = b2.getString(d13);
                    androidx.work.b bVar = new androidx.work.b();
                    bVar.k(ma.c(b2.getInt(d3)));
                    bVar.m(b2.getInt(d4) != 0);
                    bVar.n(b2.getInt(d5) != 0);
                    bVar.l(b2.getInt(d6) != 0);
                    bVar.o(b2.getInt(d7) != 0);
                    bVar.p(b2.getLong(d8));
                    bVar.q(b2.getLong(d9));
                    bVar.j(ma.a(b2.getBlob(d10)));
                    ga gaVar = new ga(string, string2);
                    gaVar.b = ma.d(b2.getInt(d12));
                    gaVar.d = b2.getString(d14);
                    gaVar.e = androidx.work.d.a(b2.getBlob(d15));
                    gaVar.f = androidx.work.d.a(b2.getBlob(i3));
                    i3 = i3;
                    gaVar.g = b2.getLong(d17);
                    gaVar.h = b2.getLong(d18);
                    gaVar.i = b2.getLong(d19);
                    gaVar.k = b2.getInt(d20);
                    gaVar.l = ma.b(b2.getInt(d21));
                    d19 = d19;
                    gaVar.m = b2.getLong(d22);
                    gaVar.n = b2.getLong(d23);
                    d23 = d23;
                    gaVar.o = b2.getLong(d24);
                    gaVar.p = b2.getLong(d25);
                    gaVar.q = b2.getInt(d26) != 0;
                    gaVar.j = bVar;
                    arrayList.add(gaVar);
                    d25 = d25;
                    d26 = d26;
                    d4 = d4;
                    d14 = d14;
                    d17 = d17;
                    d18 = d18;
                    d20 = d20;
                    d11 = d11;
                    d13 = d13;
                    d3 = d3;
                    d24 = d24;
                    d5 = d5;
                    d22 = d22;
                    d6 = d6;
                    d21 = d21;
                }
                b2.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = d2;
            b2.close();
            jVar.f();
            throw th;
        }
    }

    public List<androidx.work.d> j(String str) {
        androidx.room.j d2 = androidx.room.j.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            d2.O1(1);
        } else {
            d2.a1(1, str);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(androidx.work.d.a(b2.getBlob(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public List<ga> k(long j2) {
        androidx.room.j jVar;
        Throwable th;
        androidx.room.j d2 = androidx.room.j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        d2.t1(1, j2);
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            int d3 = h7.d(b2, "required_network_type");
            int d4 = h7.d(b2, "requires_charging");
            int d5 = h7.d(b2, "requires_device_idle");
            int d6 = h7.d(b2, "requires_battery_not_low");
            int d7 = h7.d(b2, "requires_storage_not_low");
            int d8 = h7.d(b2, "trigger_content_update_delay");
            int d9 = h7.d(b2, "trigger_max_content_delay");
            int d10 = h7.d(b2, "content_uri_triggers");
            int d11 = h7.d(b2, "id");
            int d12 = h7.d(b2, "state");
            int d13 = h7.d(b2, "worker_class_name");
            int d14 = h7.d(b2, "input_merger_class_name");
            int d15 = h7.d(b2, "input");
            int d16 = h7.d(b2, "output");
            jVar = d2;
            try {
                int d17 = h7.d(b2, "initial_delay");
                int d18 = h7.d(b2, "interval_duration");
                int d19 = h7.d(b2, "flex_duration");
                int d20 = h7.d(b2, "run_attempt_count");
                int d21 = h7.d(b2, "backoff_policy");
                int d22 = h7.d(b2, "backoff_delay_duration");
                int d23 = h7.d(b2, "period_start_time");
                int d24 = h7.d(b2, "minimum_retention_duration");
                int d25 = h7.d(b2, "schedule_requested_at");
                int d26 = h7.d(b2, "run_in_foreground");
                int i2 = d16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(d11);
                    String string2 = b2.getString(d13);
                    androidx.work.b bVar = new androidx.work.b();
                    bVar.k(ma.c(b2.getInt(d3)));
                    bVar.m(b2.getInt(d4) != 0);
                    bVar.n(b2.getInt(d5) != 0);
                    bVar.l(b2.getInt(d6) != 0);
                    bVar.o(b2.getInt(d7) != 0);
                    bVar.p(b2.getLong(d8));
                    bVar.q(b2.getLong(d9));
                    bVar.j(ma.a(b2.getBlob(d10)));
                    ga gaVar = new ga(string, string2);
                    gaVar.b = ma.d(b2.getInt(d12));
                    gaVar.d = b2.getString(d14);
                    gaVar.e = androidx.work.d.a(b2.getBlob(d15));
                    gaVar.f = androidx.work.d.a(b2.getBlob(i2));
                    i2 = i2;
                    gaVar.g = b2.getLong(d17);
                    gaVar.h = b2.getLong(d18);
                    gaVar.i = b2.getLong(d19);
                    gaVar.k = b2.getInt(d20);
                    gaVar.l = ma.b(b2.getInt(d21));
                    d19 = d19;
                    gaVar.m = b2.getLong(d22);
                    gaVar.n = b2.getLong(d23);
                    d23 = d23;
                    gaVar.o = b2.getLong(d24);
                    gaVar.p = b2.getLong(d25);
                    gaVar.q = b2.getInt(d26) != 0;
                    gaVar.j = bVar;
                    arrayList.add(gaVar);
                    d4 = d4;
                    d25 = d25;
                    d26 = d26;
                    d14 = d14;
                    d17 = d17;
                    d18 = d18;
                    d20 = d20;
                    d11 = d11;
                    d13 = d13;
                    d3 = d3;
                    d24 = d24;
                    d5 = d5;
                    d22 = d22;
                    d6 = d6;
                    d21 = d21;
                }
                b2.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = d2;
            b2.close();
            jVar.f();
            throw th;
        }
    }

    public List<ga> l() {
        androidx.room.j jVar;
        Throwable th;
        androidx.room.j d2 = androidx.room.j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            int d3 = h7.d(b2, "required_network_type");
            int d4 = h7.d(b2, "requires_charging");
            int d5 = h7.d(b2, "requires_device_idle");
            int d6 = h7.d(b2, "requires_battery_not_low");
            int d7 = h7.d(b2, "requires_storage_not_low");
            int d8 = h7.d(b2, "trigger_content_update_delay");
            int d9 = h7.d(b2, "trigger_max_content_delay");
            int d10 = h7.d(b2, "content_uri_triggers");
            int d11 = h7.d(b2, "id");
            int d12 = h7.d(b2, "state");
            int d13 = h7.d(b2, "worker_class_name");
            int d14 = h7.d(b2, "input_merger_class_name");
            int d15 = h7.d(b2, "input");
            int d16 = h7.d(b2, "output");
            jVar = d2;
            try {
                int d17 = h7.d(b2, "initial_delay");
                int d18 = h7.d(b2, "interval_duration");
                int d19 = h7.d(b2, "flex_duration");
                int d20 = h7.d(b2, "run_attempt_count");
                int d21 = h7.d(b2, "backoff_policy");
                int d22 = h7.d(b2, "backoff_delay_duration");
                int d23 = h7.d(b2, "period_start_time");
                int d24 = h7.d(b2, "minimum_retention_duration");
                int d25 = h7.d(b2, "schedule_requested_at");
                int d26 = h7.d(b2, "run_in_foreground");
                int i2 = d16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(d11);
                    String string2 = b2.getString(d13);
                    androidx.work.b bVar = new androidx.work.b();
                    bVar.k(ma.c(b2.getInt(d3)));
                    bVar.m(b2.getInt(d4) != 0);
                    bVar.n(b2.getInt(d5) != 0);
                    bVar.l(b2.getInt(d6) != 0);
                    bVar.o(b2.getInt(d7) != 0);
                    bVar.p(b2.getLong(d8));
                    bVar.q(b2.getLong(d9));
                    bVar.j(ma.a(b2.getBlob(d10)));
                    ga gaVar = new ga(string, string2);
                    gaVar.b = ma.d(b2.getInt(d12));
                    gaVar.d = b2.getString(d14);
                    gaVar.e = androidx.work.d.a(b2.getBlob(d15));
                    gaVar.f = androidx.work.d.a(b2.getBlob(i2));
                    i2 = i2;
                    gaVar.g = b2.getLong(d17);
                    gaVar.h = b2.getLong(d18);
                    gaVar.i = b2.getLong(d19);
                    gaVar.k = b2.getInt(d20);
                    gaVar.l = ma.b(b2.getInt(d21));
                    d19 = d19;
                    gaVar.m = b2.getLong(d22);
                    gaVar.n = b2.getLong(d23);
                    d23 = d23;
                    gaVar.o = b2.getLong(d24);
                    gaVar.p = b2.getLong(d25);
                    gaVar.q = b2.getInt(d26) != 0;
                    gaVar.j = bVar;
                    arrayList.add(gaVar);
                    d25 = d25;
                    d26 = d26;
                    d4 = d4;
                    d15 = d15;
                    d17 = d17;
                    d18 = d18;
                    d20 = d20;
                    d11 = d11;
                    d13 = d13;
                    d3 = d3;
                    d24 = d24;
                    d5 = d5;
                    d22 = d22;
                    d6 = d6;
                    d21 = d21;
                }
                b2.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = d2;
            b2.close();
            jVar.f();
            throw th;
        }
    }

    public List<ga> m() {
        androidx.room.j jVar;
        Throwable th;
        androidx.room.j d2 = androidx.room.j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            int d3 = h7.d(b2, "required_network_type");
            int d4 = h7.d(b2, "requires_charging");
            int d5 = h7.d(b2, "requires_device_idle");
            int d6 = h7.d(b2, "requires_battery_not_low");
            int d7 = h7.d(b2, "requires_storage_not_low");
            int d8 = h7.d(b2, "trigger_content_update_delay");
            int d9 = h7.d(b2, "trigger_max_content_delay");
            int d10 = h7.d(b2, "content_uri_triggers");
            int d11 = h7.d(b2, "id");
            int d12 = h7.d(b2, "state");
            int d13 = h7.d(b2, "worker_class_name");
            int d14 = h7.d(b2, "input_merger_class_name");
            int d15 = h7.d(b2, "input");
            int d16 = h7.d(b2, "output");
            jVar = d2;
            try {
                int d17 = h7.d(b2, "initial_delay");
                int d18 = h7.d(b2, "interval_duration");
                int d19 = h7.d(b2, "flex_duration");
                int d20 = h7.d(b2, "run_attempt_count");
                int d21 = h7.d(b2, "backoff_policy");
                int d22 = h7.d(b2, "backoff_delay_duration");
                int d23 = h7.d(b2, "period_start_time");
                int d24 = h7.d(b2, "minimum_retention_duration");
                int d25 = h7.d(b2, "schedule_requested_at");
                int d26 = h7.d(b2, "run_in_foreground");
                int i2 = d16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(d11);
                    String string2 = b2.getString(d13);
                    androidx.work.b bVar = new androidx.work.b();
                    bVar.k(ma.c(b2.getInt(d3)));
                    bVar.m(b2.getInt(d4) != 0);
                    bVar.n(b2.getInt(d5) != 0);
                    bVar.l(b2.getInt(d6) != 0);
                    bVar.o(b2.getInt(d7) != 0);
                    bVar.p(b2.getLong(d8));
                    bVar.q(b2.getLong(d9));
                    bVar.j(ma.a(b2.getBlob(d10)));
                    ga gaVar = new ga(string, string2);
                    gaVar.b = ma.d(b2.getInt(d12));
                    gaVar.d = b2.getString(d14);
                    gaVar.e = androidx.work.d.a(b2.getBlob(d15));
                    gaVar.f = androidx.work.d.a(b2.getBlob(i2));
                    i2 = i2;
                    gaVar.g = b2.getLong(d17);
                    gaVar.h = b2.getLong(d18);
                    gaVar.i = b2.getLong(d19);
                    gaVar.k = b2.getInt(d20);
                    gaVar.l = ma.b(b2.getInt(d21));
                    d19 = d19;
                    gaVar.m = b2.getLong(d22);
                    gaVar.n = b2.getLong(d23);
                    d23 = d23;
                    gaVar.o = b2.getLong(d24);
                    gaVar.p = b2.getLong(d25);
                    gaVar.q = b2.getInt(d26) != 0;
                    gaVar.j = bVar;
                    arrayList.add(gaVar);
                    d25 = d25;
                    d26 = d26;
                    d4 = d4;
                    d15 = d15;
                    d17 = d17;
                    d18 = d18;
                    d20 = d20;
                    d11 = d11;
                    d13 = d13;
                    d3 = d3;
                    d24 = d24;
                    d5 = d5;
                    d22 = d22;
                    d6 = d6;
                    d21 = d21;
                }
                b2.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = d2;
            b2.close();
            jVar.f();
            throw th;
        }
    }

    public WorkInfo.State n(String str) {
        androidx.room.j d2 = androidx.room.j.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            d2.O1(1);
        } else {
            d2.a1(1, str);
        }
        this.a.b();
        WorkInfo.State state = null;
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            if (b2.moveToFirst()) {
                state = ma.d(b2.getInt(0));
            }
            return state;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public List<String> o(String str) {
        androidx.room.j d2 = androidx.room.j.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d2.O1(1);
        } else {
            d2.a1(1, str);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public ga p(String str) {
        androidx.room.j jVar;
        Throwable th;
        ga gaVar;
        androidx.room.j d2 = androidx.room.j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str == null) {
            d2.O1(1);
        } else {
            d2.a1(1, str);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            int d3 = h7.d(b2, "required_network_type");
            int d4 = h7.d(b2, "requires_charging");
            int d5 = h7.d(b2, "requires_device_idle");
            int d6 = h7.d(b2, "requires_battery_not_low");
            int d7 = h7.d(b2, "requires_storage_not_low");
            int d8 = h7.d(b2, "trigger_content_update_delay");
            int d9 = h7.d(b2, "trigger_max_content_delay");
            int d10 = h7.d(b2, "content_uri_triggers");
            int d11 = h7.d(b2, "id");
            int d12 = h7.d(b2, "state");
            int d13 = h7.d(b2, "worker_class_name");
            int d14 = h7.d(b2, "input_merger_class_name");
            int d15 = h7.d(b2, "input");
            int d16 = h7.d(b2, "output");
            jVar = d2;
            try {
                int d17 = h7.d(b2, "initial_delay");
                int d18 = h7.d(b2, "interval_duration");
                int d19 = h7.d(b2, "flex_duration");
                int d20 = h7.d(b2, "run_attempt_count");
                int d21 = h7.d(b2, "backoff_policy");
                int d22 = h7.d(b2, "backoff_delay_duration");
                int d23 = h7.d(b2, "period_start_time");
                int d24 = h7.d(b2, "minimum_retention_duration");
                int d25 = h7.d(b2, "schedule_requested_at");
                int d26 = h7.d(b2, "run_in_foreground");
                if (b2.moveToFirst()) {
                    String string = b2.getString(d11);
                    String string2 = b2.getString(d13);
                    androidx.work.b bVar = new androidx.work.b();
                    bVar.k(ma.c(b2.getInt(d3)));
                    bVar.m(b2.getInt(d4) != 0);
                    bVar.n(b2.getInt(d5) != 0);
                    bVar.l(b2.getInt(d6) != 0);
                    bVar.o(b2.getInt(d7) != 0);
                    bVar.p(b2.getLong(d8));
                    bVar.q(b2.getLong(d9));
                    bVar.j(ma.a(b2.getBlob(d10)));
                    ga gaVar2 = new ga(string, string2);
                    gaVar2.b = ma.d(b2.getInt(d12));
                    gaVar2.d = b2.getString(d14);
                    gaVar2.e = androidx.work.d.a(b2.getBlob(d15));
                    gaVar2.f = androidx.work.d.a(b2.getBlob(d16));
                    gaVar2.g = b2.getLong(d17);
                    gaVar2.h = b2.getLong(d18);
                    gaVar2.i = b2.getLong(d19);
                    gaVar2.k = b2.getInt(d20);
                    gaVar2.l = ma.b(b2.getInt(d21));
                    gaVar2.m = b2.getLong(d22);
                    gaVar2.n = b2.getLong(d23);
                    gaVar2.o = b2.getLong(d24);
                    gaVar2.p = b2.getLong(d25);
                    gaVar2.q = b2.getInt(d26) != 0;
                    gaVar2.j = bVar;
                    gaVar = gaVar2;
                } else {
                    gaVar = null;
                }
                b2.close();
                jVar.f();
                return gaVar;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = d2;
            b2.close();
            jVar.f();
            throw th;
        }
    }

    public List<ga.b> q(String str) {
        androidx.room.j d2 = androidx.room.j.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d2.O1(1);
        } else {
            d2.a1(1, str);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            int d3 = h7.d(b2, "id");
            int d4 = h7.d(b2, "state");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                ga.b bVar = new ga.b();
                bVar.a = b2.getString(d3);
                bVar.b = ma.d(b2.getInt(d4));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public LiveData<List<ga.c>> r(String str) {
        androidx.room.j d2 = androidx.room.j.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d2.O1(1);
        } else {
            d2.a1(1, str);
        }
        return this.a.j().b(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new a(d2));
    }

    public int s(String str) {
        this.a.b();
        t7 a2 = this.f.a();
        if (str == null) {
            a2.O1(1);
        } else {
            a2.a1(1, str);
        }
        this.a.c();
        try {
            int E = a2.E();
            this.a.s();
            return E;
        } finally {
            this.a.h();
            this.f.c(a2);
        }
    }

    public void t(ga gaVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(gaVar);
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    public int u(String str, long j2) {
        this.a.b();
        t7 a2 = this.h.a();
        a2.t1(1, j2);
        if (str == null) {
            a2.O1(2);
        } else {
            a2.a1(2, str);
        }
        this.a.c();
        try {
            int E = a2.E();
            this.a.s();
            return E;
        } finally {
            this.a.h();
            this.h.c(a2);
        }
    }

    public int v() {
        this.a.b();
        t7 a2 = this.i.a();
        this.a.c();
        try {
            int E = a2.E();
            this.a.s();
            return E;
        } finally {
            this.a.h();
            this.i.c(a2);
        }
    }

    public int w(String str) {
        this.a.b();
        t7 a2 = this.g.a();
        if (str == null) {
            a2.O1(1);
        } else {
            a2.a1(1, str);
        }
        this.a.c();
        try {
            int E = a2.E();
            this.a.s();
            return E;
        } finally {
            this.a.h();
            this.g.c(a2);
        }
    }

    public void x(String str, androidx.work.d dVar) {
        this.a.b();
        t7 a2 = this.d.a();
        byte[] g2 = androidx.work.d.g(dVar);
        if (g2 == null) {
            a2.O1(1);
        } else {
            a2.y1(1, g2);
        }
        if (str == null) {
            a2.O1(2);
        } else {
            a2.a1(2, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.s();
        } finally {
            this.a.h();
            this.d.c(a2);
        }
    }

    public void y(String str, long j2) {
        this.a.b();
        t7 a2 = this.e.a();
        a2.t1(1, j2);
        if (str == null) {
            a2.O1(2);
        } else {
            a2.a1(2, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.s();
        } finally {
            this.a.h();
            this.e.c(a2);
        }
    }

    public int z(WorkInfo.State state, String... strArr) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        m7.a(sb, strArr.length);
        sb.append(")");
        t7 e2 = this.a.e(sb.toString());
        e2.t1(1, (long) ma.e(state));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                e2.O1(i2);
            } else {
                e2.a1(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int E = e2.E();
            this.a.s();
            return E;
        } finally {
            this.a.h();
        }
    }
}
