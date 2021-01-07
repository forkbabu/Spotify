package com.spotify.music.behindthelyrics.persistence.database;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.HashMap;
import java.util.HashSet;

public final class BehindTheLyricsTracksDatabase_Impl extends BehindTheLyricsTracksDatabase {
    private volatile d k;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `btl_tracks` (`uri` TEXT NOT NULL, PRIMARY KEY(`uri`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8a6ae98cfa06f377130f4517463d2a6e')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `btl_tracks`");
            if (((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).a = p7Var;
            BehindTheLyricsTracksDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) BehindTheLyricsTracksDatabase_Impl.this).h.get(i)).a(p7Var);
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
            n7 n7Var = new n7("btl_tracks", hashMap, je.d1(hashMap, "uri", new n7.a("uri", "TEXT", true, 1, null, 1), 0), new HashSet(0));
            n7 a = n7.a(p7Var, "btl_tracks");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("btl_tracks(com.spotify.music.behindthelyrics.persistence.database.BehindTheLyricsTracksEntity).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "btl_tracks");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(1), "8a6ae98cfa06f377130f4517463d2a6e", "095b461f50e69be24a240c12ed4f3c09");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.behindthelyrics.persistence.database.BehindTheLyricsTracksDatabase
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
