package com.spotify.music.builtinauth.cache;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class AuthCacheRoomDatabase_Impl extends AuthCacheRoomDatabase {
    private volatile c0 k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `cachedClientInfo` (`client_id` TEXT NOT NULL, `redirect_uri` TEXT NOT NULL, `scopes` TEXT, `timestamp` INTEGER NOT NULL, `package_name` TEXT NOT NULL, `app_signature` TEXT NOT NULL, `last_used_timestamp` INTEGER NOT NULL, PRIMARY KEY(`client_id`, `redirect_uri`, `package_name`, `app_signature`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '83638406310a4869e579f35c5989cac5')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `cachedClientInfo`");
            if (((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) AuthCacheRoomDatabase_Impl.this).a = p7Var;
            AuthCacheRoomDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) AuthCacheRoomDatabase_Impl.this).h.get(i)).a(p7Var);
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
            HashMap hashMap = new HashMap(7);
            hashMap.put("client_id", new n7.a("client_id", "TEXT", true, 1, null, 1));
            hashMap.put("redirect_uri", new n7.a("redirect_uri", "TEXT", true, 2, null, 1));
            hashMap.put("scopes", new n7.a("scopes", "TEXT", false, 0, null, 1));
            hashMap.put("timestamp", new n7.a("timestamp", "INTEGER", true, 0, null, 1));
            hashMap.put("package_name", new n7.a("package_name", "TEXT", true, 3, null, 1));
            hashMap.put("app_signature", new n7.a("app_signature", "TEXT", true, 4, null, 1));
            n7 n7Var = new n7("cachedClientInfo", hashMap, je.d1(hashMap, "last_used_timestamp", new n7.a("last_used_timestamp", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "cachedClientInfo");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("cachedClientInfo(com.spotify.music.builtinauth.cache.CachedClientInfoEntity).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "cachedClientInfo");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(1), "83638406310a4869e579f35c5989cac5", "24274ffe648c459b4b2b48953be86b10");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase
    public c0 t() {
        c0 c0Var;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new d0(this);
            }
            c0Var = this.k;
        }
        return c0Var;
    }
}
