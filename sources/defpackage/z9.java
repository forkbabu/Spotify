package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import androidx.room.o;

/* renamed from: z9  reason: default package */
public final class z9 implements y9 {
    private final RoomDatabase a;
    private final c<x9> b;
    private final o c;

    /* renamed from: z9$a */
    class a extends c<x9> {
        a(z9 z9Var, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, x9 x9Var) {
            x9 x9Var2 = x9Var;
            String str = x9Var2.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            t7Var.t1(2, (long) x9Var2.b);
        }
    }

    /* renamed from: z9$b */
    class b extends o {
        b(z9 z9Var, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public z9(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    public x9 a(String str) {
        j d = j.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        x9 x9Var = null;
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b2, "work_spec_id");
            int d3 = h7.d(b2, "system_id");
            if (b2.moveToFirst()) {
                x9Var = new x9(b2.getString(d2), b2.getInt(d3));
            }
            return x9Var;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void b(x9 x9Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(x9Var);
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    public void c(String str) {
        this.a.b();
        t7 a2 = this.c.a();
        if (str == null) {
            a2.O1(1);
        } else {
            a2.a1(1, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.s();
        } finally {
            this.a.h();
            this.c.c(a2);
        }
    }
}
