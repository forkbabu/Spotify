package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: la  reason: default package */
public final class la implements ka {
    private final RoomDatabase a;
    private final c<ja> b;

    /* renamed from: la$a */
    class a extends c<ja> {
        a(la laVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, ja jaVar) {
            ja jaVar2 = jaVar;
            String str = jaVar2.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            String str2 = jaVar2.b;
            if (str2 == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, str2);
            }
        }
    }

    public la(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public List<String> a(String str) {
        j d = j.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    public void b(ja jaVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(jaVar);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
