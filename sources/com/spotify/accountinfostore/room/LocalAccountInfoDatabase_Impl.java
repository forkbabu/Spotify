package com.spotify.accountinfostore.room;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class LocalAccountInfoDatabase_Impl extends LocalAccountInfoDatabase {
    private volatile b k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `account_info` (`username` TEXT NOT NULL, `display_name` TEXT, `auth_method` TEXT, `image_uri` TEXT, `added_at` INTEGER NOT NULL, `logged_out_at` INTEGER, PRIMARY KEY(`username`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bad84685db181fc275502efdc49b4dc6')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `account_info`");
            if (((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) LocalAccountInfoDatabase_Impl.this).a = p7Var;
            LocalAccountInfoDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) LocalAccountInfoDatabase_Impl.this).h.get(i)).a(p7Var);
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
            HashMap hashMap = new HashMap(6);
            hashMap.put("username", new n7.a("username", "TEXT", true, 1, null, 1));
            hashMap.put("display_name", new n7.a("display_name", "TEXT", false, 0, null, 1));
            hashMap.put("auth_method", new n7.a("auth_method", "TEXT", false, 0, null, 1));
            hashMap.put("image_uri", new n7.a("image_uri", "TEXT", false, 0, null, 1));
            hashMap.put("added_at", new n7.a("added_at", "INTEGER", true, 0, null, 1));
            n7 n7Var = new n7("account_info", hashMap, je.d1(hashMap, "logged_out_at", new n7.a("logged_out_at", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "account_info");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("account_info(com.spotify.accountinfostore.room.LocalAccountInfo).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "account_info");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(3), "bad84685db181fc275502efdc49b4dc6", "7a3a2e8b9a91fec50cf456732277be59");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.accountinfostore.room.LocalAccountInfoDatabase
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
