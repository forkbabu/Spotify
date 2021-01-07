package com.spotify.libs.connect.sorting.data;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class DevicePickerSortingDatabase_Impl extends DevicePickerSortingDatabase {
    private volatile b k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `DeviceLastConnection` (`deviceIdentifier` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`deviceIdentifier`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '914d67f6f529727de34d02b66c756daf')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `DeviceLastConnection`");
            if (((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) DevicePickerSortingDatabase_Impl.this).a = p7Var;
            DevicePickerSortingDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) DevicePickerSortingDatabase_Impl.this).h.get(i)).a(p7Var);
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
            hashMap.put("deviceIdentifier", new n7.a("deviceIdentifier", "TEXT", true, 1, null, 1));
            n7 n7Var = new n7("DeviceLastConnection", hashMap, je.d1(hashMap, "timestamp", new n7.a("timestamp", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "DeviceLastConnection");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("DeviceLastConnection(com.spotify.libs.connect.sorting.data.DeviceLastConnection).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void d() {
        a();
        p7 writableDatabase = k().getWritableDatabase();
        try {
            c();
            writableDatabase.A("DELETE FROM `DeviceLastConnection`");
            s();
        } finally {
            h();
            writableDatabase.D1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.S1()) {
                writableDatabase.A("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "DeviceLastConnection");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(1), "914d67f6f529727de34d02b66c756daf", "35110f9adf249772dd17e1baf16948e8");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.libs.connect.sorting.data.DevicePickerSortingDatabase
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
