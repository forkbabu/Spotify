package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.o;
import androidx.work.d;

/* renamed from: fa  reason: default package */
public final class fa implements ea {
    private final RoomDatabase a;
    private final o b;
    private final o c;

    /* renamed from: fa$a */
    class a extends androidx.room.c<da> {
        a(fa faVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, da daVar) {
            daVar.getClass();
            t7Var.O1(1);
            byte[] g = d.g(null);
            if (g == null) {
                t7Var.O1(2);
            } else {
                t7Var.y1(2, g);
            }
        }
    }

    /* renamed from: fa$b */
    class b extends o {
        b(fa faVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: fa$c */
    class c extends o {
        c(fa faVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public fa(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new a(this, roomDatabase);
        this.b = new b(this, roomDatabase);
        this.c = new c(this, roomDatabase);
    }

    public void a(String str) {
        this.a.b();
        t7 a2 = this.b.a();
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
            this.b.c(a2);
        }
    }

    public void b() {
        this.a.b();
        t7 a2 = this.c.a();
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
