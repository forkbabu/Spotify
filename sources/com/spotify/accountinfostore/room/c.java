package com.spotify.accountinfostore.room;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.m;
import androidx.room.o;
import com.google.common.base.Optional;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class c implements b {
    private final RoomDatabase a;
    private final androidx.room.c<a> b;
    private final o c;
    private final o d;
    private final o e;

    /* access modifiers changed from: package-private */
    public class a implements Callable<Optional<a>> {
        final /* synthetic */ androidx.room.j a;

        a(androidx.room.j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Optional<a> call() {
            a aVar = null;
            Cursor b2 = l7.b(c.this.a, this.a, false, null);
            try {
                int d = h7.d(b2, "username");
                int d2 = h7.d(b2, "display_name");
                int d3 = h7.d(b2, "auth_method");
                int d4 = h7.d(b2, "image_uri");
                int d5 = h7.d(b2, "added_at");
                int d6 = h7.d(b2, "logged_out_at");
                if (b2.moveToFirst()) {
                    a aVar2 = new a(b2.getString(d));
                    aVar2.b = b2.getString(d2);
                    aVar2.c = b2.getString(d3);
                    aVar2.d = b2.getString(d4);
                    aVar2.e = b2.getLong(d5);
                    if (b2.isNull(d6)) {
                        aVar2.f = null;
                    } else {
                        aVar2.f = Long.valueOf(b2.getLong(d6));
                    }
                    aVar = aVar2;
                }
                return Optional.fromNullable(aVar);
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

    class b extends androidx.room.c<a> {
        b(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `account_info` (`username`,`display_name`,`auth_method`,`image_uri`,`added_at`,`logged_out_at`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, a aVar) {
            a aVar2 = aVar;
            String str = aVar2.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            String str2 = aVar2.b;
            if (str2 == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, str2);
            }
            String str3 = aVar2.c;
            if (str3 == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, str3);
            }
            String str4 = aVar2.d;
            if (str4 == null) {
                t7Var.O1(4);
            } else {
                t7Var.a1(4, str4);
            }
            t7Var.t1(5, aVar2.e);
            Long l = aVar2.f;
            if (l == null) {
                t7Var.O1(6);
            } else {
                t7Var.t1(6, l.longValue());
            }
        }
    }

    /* renamed from: com.spotify.accountinfostore.room.c$c  reason: collision with other inner class name */
    class C0143c extends o {
        C0143c(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE account_info set logged_out_at = ? where logged_out_at is null";
        }
    }

    class d extends o {
        d(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE from account_info where logged_out_at is not null AND logged_out_at < ?";
        }
    }

    class e extends o {
        e(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE from account_info";
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements Callable<Void> {
        final /* synthetic */ a a;

        f(a aVar) {
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

    /* access modifiers changed from: package-private */
    public class g implements Callable<Void> {
        final /* synthetic */ long a;

        g(long j) {
            this.a = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            t7 a2 = c.this.c.a();
            a2.t1(1, this.a);
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

    /* access modifiers changed from: package-private */
    public class h implements Callable<Void> {
        final /* synthetic */ long a;

        h(long j) {
            this.a = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            t7 a2 = c.this.d.a();
            a2.t1(1, this.a);
            c.this.a.c();
            try {
                a2.E();
                c.this.a.s();
                c.this.a.h();
                c.this.d.c(a2);
                return null;
            } catch (Throwable th) {
                c.this.a.h();
                c.this.d.c(a2);
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements Callable<Void> {
        i() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            t7 a2 = c.this.e.a();
            c.this.a.c();
            try {
                a2.E();
                c.this.a.s();
                c.this.a.h();
                c.this.e.c(a2);
                return null;
            } catch (Throwable th) {
                c.this.a.h();
                c.this.e.c(a2);
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements Callable<List<a>> {
        final /* synthetic */ androidx.room.j a;

        j(androidx.room.j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<a> call() {
            Cursor b2 = l7.b(c.this.a, this.a, false, null);
            try {
                int d = h7.d(b2, "username");
                int d2 = h7.d(b2, "display_name");
                int d3 = h7.d(b2, "auth_method");
                int d4 = h7.d(b2, "image_uri");
                int d5 = h7.d(b2, "added_at");
                int d6 = h7.d(b2, "logged_out_at");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    a aVar = new a(b2.getString(d));
                    aVar.b = b2.getString(d2);
                    aVar.c = b2.getString(d3);
                    aVar.d = b2.getString(d4);
                    aVar.e = b2.getLong(d5);
                    if (b2.isNull(d6)) {
                        aVar.f = null;
                    } else {
                        aVar.f = Long.valueOf(b2.getLong(d6));
                    }
                    arrayList.add(aVar);
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
        this.b = new b(this, roomDatabase);
        this.c = new C0143c(this, roomDatabase);
        this.d = new d(this, roomDatabase);
        this.e = new e(this, roomDatabase);
    }

    public io.reactivex.a f() {
        return io.reactivex.a.v(new i());
    }

    public io.reactivex.a g(long j2) {
        return io.reactivex.a.v(new h(j2));
    }

    public z<List<a>> h() {
        return m.b(new j(androidx.room.j.d("SELECT * FROM account_info ORDER BY added_at DESC", 0)));
    }

    public z<Optional<a>> i(String str) {
        androidx.room.j d2 = androidx.room.j.d("SELECT * FROM account_info where username = ?", 1);
        if (str == null) {
            d2.O1(1);
        } else {
            d2.a1(1, str);
        }
        return m.b(new a(d2));
    }

    public io.reactivex.a j(a aVar) {
        return io.reactivex.a.v(new f(aVar));
    }

    public io.reactivex.a k(long j2) {
        return io.reactivex.a.v(new g(j2));
    }
}
