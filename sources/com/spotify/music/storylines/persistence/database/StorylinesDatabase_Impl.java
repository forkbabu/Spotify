package com.spotify.music.storylines.persistence.database;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class StorylinesDatabase_Impl extends StorylinesDatabase {
    private volatile d k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `storylines_entities` (`uri` TEXT NOT NULL, PRIMARY KEY(`uri`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4eb939fa2fed2065d565b1f9c02b140b')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `storylines_entities`");
            if (((RoomDatabase) StorylinesDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) StorylinesDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) StorylinesDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) StorylinesDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) StorylinesDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) StorylinesDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) StorylinesDatabase_Impl.this).a = p7Var;
            StorylinesDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) StorylinesDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) StorylinesDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) StorylinesDatabase_Impl.this).h.get(i)).a(p7Var);
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
            HashMap hashMap = new HashMap(1);
            n7 n7Var = new n7("storylines_entities", hashMap, je.d1(hashMap, "uri", new n7.a("uri", "TEXT", true, 1, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "storylines_entities");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("storylines_entities(com.spotify.music.storylines.persistence.database.StorylinesEntity).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "storylines_entities");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(1), "4eb939fa2fed2065d565b1f9c02b140b", "b15d3544e0114ad9a2530b6c0b78c6a3");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.storylines.persistence.database.StorylinesDatabase
    public d t() {
        d dVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new e(this);
            }
            dVar = this.k;
        }
        return dVar;
    }
}
