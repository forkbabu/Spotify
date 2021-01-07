package com.spotify.superbird.pitstop.room;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.j;
import androidx.room.m;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class c implements b {
    private final RoomDatabase a;
    private final androidx.room.c<mpe> b;
    private final a c = new a();
    private final androidx.room.b<mpe> d;

    class a extends androidx.room.c<mpe> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `pitstop_events` (`id`,`serial`,`event`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, mpe mpe) {
            mpe mpe2 = mpe;
            t7Var.t1(1, mpe2.b());
            if (mpe2.c() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, mpe2.c());
            }
            a aVar = c.this.c;
            lpe a = mpe2.a();
            aVar.getClass();
            String a2 = c.this.c.a(a != null ? a.a() : null);
            if (a2 == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, a2);
            }
        }
    }

    class b extends androidx.room.b<mpe> {
        b(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `pitstop_events` WHERE `id` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, mpe mpe) {
            t7Var.t1(1, mpe.b());
        }
    }

    /* renamed from: com.spotify.superbird.pitstop.room.c$c  reason: collision with other inner class name */
    class CallableC0392c implements Callable<Void> {
        final /* synthetic */ List a;

        CallableC0392c(List list) {
            this.a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            c.this.a.c();
            try {
                c.this.b.e(this.a);
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
        final /* synthetic */ List a;

        d(List list) {
            this.a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            c.this.a.c();
            try {
                c.this.d.f(this.a);
                c.this.a.s();
                c.this.a.h();
                return null;
            } catch (Throwable th) {
                c.this.a.h();
                throw th;
            }
        }
    }

    class e implements Callable<List<mpe>> {
        final /* synthetic */ j a;

        e(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<mpe> call() {
            Cursor b2 = l7.b(c.this.a, this.a, false, null);
            try {
                int d = h7.d(b2, "id");
                int d2 = h7.d(b2, "serial");
                int d3 = h7.d(b2, "event");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(d2);
                    Map<Object, Object> b3 = c.this.c.b(b2.getString(d3));
                    c.this.c.getClass();
                    mpe mpe = new mpe(string, b3 != null ? new lpe(b3) : null);
                    mpe.d(b2.getLong(d));
                    arrayList.add(mpe);
                }
                return arrayList;
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
        this.b = new a(roomDatabase);
        this.d = new b(this, roomDatabase);
    }

    @Override // com.spotify.superbird.pitstop.room.b
    public z<List<mpe>> a() {
        return m.b(new e(j.d("SELECT * from pitstop_events", 0)));
    }

    @Override // com.spotify.superbird.pitstop.room.b
    public io.reactivex.a b(List<mpe> list) {
        return io.reactivex.a.v(new d(list));
    }

    @Override // com.spotify.superbird.pitstop.room.b
    public io.reactivex.a c(List<mpe> list) {
        return io.reactivex.a.v(new CallableC0392c(list));
    }
}
