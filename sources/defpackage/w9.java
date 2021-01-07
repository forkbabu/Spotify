package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;

/* renamed from: w9  reason: default package */
public final class w9 implements v9 {
    private final RoomDatabase a;
    private final c<u9> b;

    /* renamed from: w9$a */
    class a extends c<u9> {
        a(w9 w9Var, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, u9 u9Var) {
            u9 u9Var2 = u9Var;
            String str = u9Var2.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            Long l = u9Var2.b;
            if (l == null) {
                t7Var.O1(2);
            } else {
                t7Var.t1(2, l.longValue());
            }
        }
    }

    public w9(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public Long a(String str) {
        j d = j.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        Long l = null;
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            if (b2.moveToFirst()) {
                if (!b2.isNull(0)) {
                    l = Long.valueOf(b2.getLong(0));
                }
            }
            return l;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void b(u9 u9Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(u9Var);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
