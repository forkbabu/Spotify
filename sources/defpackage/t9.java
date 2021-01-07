package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t9  reason: default package */
public final class t9 implements s9 {
    private final RoomDatabase a;
    private final c<r9> b;

    /* renamed from: t9$a */
    class a extends c<r9> {
        a(t9 t9Var, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, r9 r9Var) {
            r9 r9Var2 = r9Var;
            String str = r9Var2.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            String str2 = r9Var2.b;
            if (str2 == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, str2);
            }
        }
    }

    public t9(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public List<String> a(String str) {
        j d = j.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    public boolean b(String str) {
        boolean z = true;
        j d = j.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        boolean z2 = false;
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b2.close();
            d.f();
        }
    }

    public boolean c(String str) {
        boolean z = true;
        j d = j.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        boolean z2 = false;
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void d(r9 r9Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(r9Var);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
