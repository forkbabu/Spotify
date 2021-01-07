package com.spotify.libs.connect.sorting.data;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.j;
import androidx.room.m;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class c implements b {
    private final RoomDatabase a;
    private final androidx.room.c<a> b;

    class a extends androidx.room.c<a> {
        a(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `DeviceLastConnection` (`deviceIdentifier`,`timestamp`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, a aVar) {
            a aVar2 = aVar;
            if (aVar2.a() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, aVar2.a());
            }
            t7Var.t1(2, aVar2.b());
        }
    }

    class b extends androidx.room.b<a> {
        b(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `DeviceLastConnection` WHERE `deviceIdentifier` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, a aVar) {
            a aVar2 = aVar;
            if (aVar2.a() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, aVar2.a());
            }
        }
    }

    /* renamed from: com.spotify.libs.connect.sorting.data.c$c  reason: collision with other inner class name */
    class CallableC0162c implements Callable<Void> {
        final /* synthetic */ a a;

        CallableC0162c(a aVar) {
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

    class d implements Callable<List<a>> {
        final /* synthetic */ j a;

        d(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<a> call() {
            Cursor b2 = l7.b(c.this.a, this.a, false, null);
            try {
                int d = h7.d(b2, "deviceIdentifier");
                int d2 = h7.d(b2, "timestamp");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    arrayList.add(new a(b2.getString(d), b2.getLong(d2)));
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
        this.b = new a(this, roomDatabase);
        new b(this, roomDatabase);
    }

    @Override // com.spotify.libs.connect.sorting.data.b
    public s<List<a>> a() {
        return m.a(this.a, false, new String[]{"DeviceLastConnection"}, new d(j.d("SELECT * FROM DeviceLastConnection ORDER BY timestamp DESC", 0)));
    }

    @Override // com.spotify.libs.connect.sorting.data.b
    public io.reactivex.a b(a aVar) {
        return io.reactivex.a.v(new CallableC0162c(aVar));
    }
}
