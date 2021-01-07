package com.spotify.eventsender;

import androidx.room.RoomDatabase;
import androidx.room.g;
import androidx.room.i;
import defpackage.n7;
import defpackage.q7;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class EventSenderDatabase_Impl extends EventSenderDatabase {
    private volatile al0 k;
    private volatile wk0 l;
    private volatile zk0 m;

    class a extends i.a {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.i.a
        public void a(p7 p7Var) {
            p7Var.A("CREATE TABLE IF NOT EXISTS `Events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `authenticated` INTEGER, `eventName` TEXT, `sequenceId` BLOB, `sequenceNumber` INTEGER NOT NULL, `fragments` BLOB, `owner` TEXT, `deviceId` TEXT)");
            p7Var.A("CREATE INDEX IF NOT EXISTS `index_Events_eventName` ON `Events` (`eventName`)");
            p7Var.A("CREATE TABLE IF NOT EXISTS `EventSequenceNumbers` (`eventName` TEXT NOT NULL, `sequenceId` BLOB NOT NULL, `sequenceNumberNext` INTEGER NOT NULL, PRIMARY KEY(`eventName`, `sequenceId`))");
            p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bcaedc9c9ca0a3fb8a5e6c3ed3aec98b')");
        }

        @Override // androidx.room.i.a
        public void b(p7 p7Var) {
            p7Var.A("DROP TABLE IF EXISTS `Events`");
            p7Var.A("DROP TABLE IF EXISTS `EventSequenceNumbers`");
            if (((RoomDatabase) EventSenderDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) EventSenderDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) EventSenderDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.room.i.a
        public void c(p7 p7Var) {
            if (((RoomDatabase) EventSenderDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) EventSenderDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) EventSenderDatabase_Impl.this).h.get(i)).getClass();
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p7 p7Var) {
            ((RoomDatabase) EventSenderDatabase_Impl.this).a = p7Var;
            EventSenderDatabase_Impl.this.p(p7Var);
            if (((RoomDatabase) EventSenderDatabase_Impl.this).h != null) {
                int size = ((RoomDatabase) EventSenderDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.b) ((RoomDatabase) EventSenderDatabase_Impl.this).h.get(i)).a(p7Var);
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
            HashMap hashMap = new HashMap(8);
            hashMap.put("id", new n7.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("authenticated", new n7.a("authenticated", "INTEGER", false, 0, null, 1));
            hashMap.put("eventName", new n7.a("eventName", "TEXT", false, 0, null, 1));
            hashMap.put("sequenceId", new n7.a("sequenceId", "BLOB", false, 0, null, 1));
            hashMap.put("sequenceNumber", new n7.a("sequenceNumber", "INTEGER", true, 0, null, 1));
            hashMap.put("fragments", new n7.a("fragments", "BLOB", false, 0, null, 1));
            hashMap.put("owner", new n7.a("owner", "TEXT", false, 0, null, 1));
            HashSet d1 = je.d1(hashMap, "deviceId", new n7.a("deviceId", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new n7.d("index_Events_eventName", false, Arrays.asList("eventName")));
            n7 n7Var = new n7("Events", hashMap, d1, hashSet);
            n7 a = n7.a(p7Var, "Events");
            if (!n7Var.equals(a)) {
                return new i.b(false, je.v0("Events(com.spotify.eventsender.dao.EventEntity).\n Expected:\n", n7Var, "\n Found:\n", a));
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("eventName", new n7.a("eventName", "TEXT", true, 1, null, 1));
            hashMap2.put("sequenceId", new n7.a("sequenceId", "BLOB", true, 2, null, 1));
            n7 n7Var2 = new n7("EventSequenceNumbers", hashMap2, je.d1(hashMap2, "sequenceNumberNext", new n7.a("sequenceNumberNext", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            n7 a2 = n7.a(p7Var, "EventSequenceNumbers");
            if (!n7Var2.equals(a2)) {
                return new i.b(false, je.v0("EventSequenceNumbers(com.spotify.eventsender.dao.EventSequenceNumberEntity).\n Expected:\n", n7Var2, "\n Found:\n", a2));
            }
            return new i.b(true, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public g f() {
        return new g(this, new HashMap(0), new HashMap(0), "Events", "EventSequenceNumbers");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public q7 g(androidx.room.a aVar) {
        i iVar = new i(aVar, new a(10), "bcaedc9c9ca0a3fb8a5e6c3ed3aec98b", "39d038e0d2954102f2dfd12e3821e26f");
        q7.b.a a2 = q7.b.a(aVar.b);
        a2.c(aVar.c);
        a2.b(iVar);
        return aVar.a.a(a2.a());
    }

    @Override // com.spotify.eventsender.EventSenderDatabase
    public wk0 t() {
        wk0 wk0;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new xk0(this);
            }
            wk0 = this.l;
        }
        return wk0;
    }

    @Override // com.spotify.eventsender.EventSenderDatabase
    public zk0 u() {
        zk0 zk0;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new zk0(this);
            }
            zk0 = this.m;
        }
        return zk0;
    }

    @Override // com.spotify.eventsender.EventSenderDatabase
    public al0 v() {
        al0 al0;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new bl0(this);
            }
            al0 = this.k;
        }
        return al0;
    }
}
