package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ca  reason: default package */
public final class ca implements ba {
    private final RoomDatabase a;
    private final c<aa> b;

    /* renamed from: ca$a */
    class a extends c<aa> {
        a(ca caVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, aa aaVar) {
            aa aaVar2 = aaVar;
            String str = aaVar2.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            String str2 = aaVar2.b;
            if (str2 == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, str2);
            }
        }
    }

    public ca(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public List<String> a(String str) {
        j d = j.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void b(aa aaVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(aaVar);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
