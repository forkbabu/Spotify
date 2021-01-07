package com.spotify.packagevalidator.denylist.cache.db;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.RoomDatabase;
import androidx.room.j;
import androidx.room.m;
import androidx.room.o;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class c implements b {
    private final RoomDatabase a;
    private final androidx.room.c<a> b;
    private final o c;

    class a extends androidx.room.c<a> {
        a(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `cachedDenylist` (`package_names`,`app_signatures`,`timestamp`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, a aVar) {
            a aVar2 = aVar;
            String a = d.a(aVar2.b());
            if (a == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, a);
            }
            String a2 = d.a(aVar2.a());
            if (a2 == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, a2);
            }
            t7Var.t1(3, aVar2.c());
        }
    }

    class b extends o {
        b(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM cachedDenylist";
        }
    }

    /* renamed from: com.spotify.packagevalidator.denylist.cache.db.c$c  reason: collision with other inner class name */
    class CallableC0357c implements Callable<Void> {
        final /* synthetic */ a a;

        CallableC0357c(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            c.this.a.c();
            try {
                c.this.b.f(this.a);
                c.this.a.s();
                c.this.a.h();
                return null;
            } catch (Throwable th) {
                c.this.a.h();
                throw th;
            }
        }
    }

    class d implements Callable<Void> {
        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            t7 a2 = c.this.c.a();
            c.this.a.c();
            try {
                a2.E();
                c.this.a.s();
                c.this.a.h();
                c.this.c.c(a2);
                return null;
            } catch (Throwable th) {
                c.this.a.h();
                c.this.c.c(a2);
                throw th;
            }
        }
    }

    class e implements Callable<a> {
        final /* synthetic */ j a;

        e(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public a call() {
            a aVar = null;
            Cursor b2 = l7.b(c.this.a, this.a, false, null);
            try {
                int d = h7.d(b2, "package_names");
                int d2 = h7.d(b2, "app_signatures");
                int d3 = h7.d(b2, "timestamp");
                if (b2.moveToFirst()) {
                    aVar = new a(d.b(b2.getString(d)), d.b(b2.getString(d2)), b2.getLong(d3));
                }
                if (aVar != null) {
                    return aVar;
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.a.a());
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            this.a.f();
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    @Override // com.spotify.packagevalidator.denylist.cache.db.b
    public z<a> a() {
        return m.b(new e(j.d("SELECT * FROM cachedDenylist", 0)));
    }

    @Override // com.spotify.packagevalidator.denylist.cache.db.b
    public io.reactivex.a b(a aVar) {
        return io.reactivex.a.v(new CallableC0357c(aVar));
    }

    @Override // com.spotify.packagevalidator.denylist.cache.db.b
    public io.reactivex.a c() {
        return io.reactivex.a.v(new d());
    }
}
