package com.spotify.superbird.pitstop.room;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class PitstopDatabase_Impl extends PitstopDatabase {
    private volatile b k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `pitstop_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serial` TEXT NOT NULL, `event` TEXT NOT NULL)");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5542ec4452a4f41fb6325587ee3d9804')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `pitstop_events`");
            if (((RoomDatabase) PitstopDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) PitstopDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) PitstopDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) PitstopDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) PitstopDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) PitstopDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) PitstopDatabase_Impl.this).a = p7Var;
            PitstopDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) PitstopDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) PitstopDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) PitstopDatabase_Impl.this).h.get(i)).a(p7Var);
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
            HashMap hashMap = new HashMap(3);
            hashMap.put("id", new n7.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("serial", new n7.a("serial", "TEXT", true, 0, null, 1));
            n7 n7Var = new n7("pitstop_events", hashMap, je.d1(hashMap, "event", new n7.a("event", "TEXT", true, 0, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "pitstop_events");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("pitstop_events(com.spotify.superbird.pitstop.model.RoomPitstopEvent).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "pitstop_events");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(2), "5542ec4452a4f41fb6325587ee3d9804", "15fae9960d23100d6e7d44e95837d17b");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.superbird.pitstop.room.PitstopDatabase
    public b t() {
        b bVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new c(this);
            }
            bVar = this.k;
        }
        return bVar;
    }
}
