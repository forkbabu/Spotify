package com.spotify.mobile.android.video.offline.database;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class BetamaxOfflineDatabase_Impl extends BetamaxOfflineDatabase {
    private volatile a k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `OfflineLicenseInfoEntity` (`media_id` TEXT NOT NULL, `key_set_id` TEXT NOT NULL, PRIMARY KEY(`media_id`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c68c2249dd78211e654e1cab770c092a')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `OfflineLicenseInfoEntity`");
            if (((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) BetamaxOfflineDatabase_Impl.this).a = p7Var;
            BetamaxOfflineDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) BetamaxOfflineDatabase_Impl.this).h.get(i)).a(p7Var);
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
            hashMap.put("media_id", new n7.a("media_id", "TEXT", true, 1, null, 1));
            n7 n7Var = new n7("OfflineLicenseInfoEntity", hashMap, je.d1(hashMap, "key_set_id", new n7.a("key_set_id", "TEXT", true, 0, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "OfflineLicenseInfoEntity");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("OfflineLicenseInfoEntity(com.spotify.mobile.android.video.offline.database.OfflineLicenseInfoEntity).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "OfflineLicenseInfoEntity");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(1), "c68c2249dd78211e654e1cab770c092a", "966db6b5e8546a50443b734c18cd28d8");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.mobile.android.video.offline.database.BetamaxOfflineDatabase
    public a t() {
        a aVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new b(this);
            }
            aVar = this.k;
        }
        return aVar;
    }
}
