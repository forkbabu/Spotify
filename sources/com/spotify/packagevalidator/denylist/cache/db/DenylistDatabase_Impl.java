package com.spotify.packagevalidator.denylist.cache.db;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class DenylistDatabase_Impl extends DenylistDatabase {
    private volatile b k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `cachedDenylist` (`package_names` TEXT, `app_signatures` TEXT, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9f989b42441583c66cc1c484b588a3d4')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `cachedDenylist`");
            if (((RoomDatabase) DenylistDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) DenylistDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) DenylistDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) DenylistDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) DenylistDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) DenylistDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) DenylistDatabase_Impl.this).a = p7Var;
            DenylistDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) DenylistDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) DenylistDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) DenylistDatabase_Impl.this).h.get(i)).a(p7Var);
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
            hashMap.put("package_names", new n7.a("package_names", "TEXT", false, 0, null, 1));
            hashMap.put("app_signatures", new n7.a("app_signatures", "TEXT", false, 0, null, 1));
            n7 n7Var = new n7("cachedDenylist", hashMap, je.d1(hashMap, "timestamp", new n7.a("timestamp", "INTEGER", true, 1, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "cachedDenylist");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("cachedDenylist(com.spotify.packagevalidator.denylist.cache.db.CachedDenylist).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "cachedDenylist");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(1), "9f989b42441583c66cc1c484b588a3d4", "2d481d46acd9c9eceec0fadc071449e6");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.packagevalidator.denylist.cache.db.DenylistDatabase
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
