package com.spotify.libs.onboarding.allboarding.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.j;
import androidx.room.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class x implements w {
    private final RoomDatabase a;
    private final androidx.room.c<v> b;
    private final o c;

    class a extends androidx.room.c<v> {
        a(x xVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR ABORT INTO `Section` (`sectionId`,`pickerStepDataId`,`adapterType`,`sectionTitle`,`sectionSubtitle`,`sectionOrder`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, v vVar) {
            v vVar2 = vVar;
            if (vVar2.c() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, vVar2.c());
            }
            t7Var.t1(2, vVar2.b());
            if (vVar2.a() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, vVar2.a());
            }
            if (vVar2.f() == null) {
                t7Var.O1(4);
            } else {
                t7Var.a1(4, vVar2.f());
            }
            if (vVar2.e() == null) {
                t7Var.O1(5);
            } else {
                t7Var.a1(5, vVar2.e());
            }
            t7Var.t1(6, (long) vVar2.d());
        }
    }

    class b extends androidx.room.b<v> {
        b(x xVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `Section` WHERE `sectionId` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, v vVar) {
            v vVar2 = vVar;
            if (vVar2.c() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, vVar2.c());
            }
        }
    }

    class c extends o {
        c(x xVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM section";
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Callable<List<v>> {
        final /* synthetic */ j a;

        d(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<v> call() {
            Cursor b2 = l7.b(x.this.a, this.a, false, null);
            try {
                int d = h7.d(b2, "sectionId");
                int d2 = h7.d(b2, "pickerStepDataId");
                int d3 = h7.d(b2, "adapterType");
                int d4 = h7.d(b2, "sectionTitle");
                int d5 = h7.d(b2, "sectionSubtitle");
                int d6 = h7.d(b2, "sectionOrder");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    arrayList.add(new v(b2.getString(d), b2.getLong(d2), b2.getString(d3), b2.getString(d4), b2.getString(d5), b2.getInt(d6)));
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

    public x(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        new b(this, roomDatabase);
        this.c = new c(this, roomDatabase);
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

    public LiveData<List<v>> c(long j) {
        j d2 = j.d("SELECT * FROM section WHERE pickerStepDataId = ? ORDER BY Section.sectionOrder", 1);
        d2.t1(1, j);
        return this.a.j().b(new String[]{"section"}, false, new d(d2));
    }

    public int d(long j) {
        j d2 = j.d("\n        SELECT Section.sectionOrder FROM Section WHERE pickerStepDataId = ? ORDER BY sectionOrder LIMIT 1\n    ", 1);
        d2.t1(1, j);
        this.a.b();
        int i = 0;
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            if (b2.moveToFirst()) {
                i = b2.getInt(0);
            }
            return i;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public String e(String str) {
        j d2 = j.d("\n        SELECT Section.sectionId FROM Section\n        WHERE Section.sectionId = ?\n        ", 1);
        d2.a1(1, str);
        this.a.b();
        String str2 = null;
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            if (b2.moveToFirst()) {
                str2 = b2.getString(0);
            }
            return str2;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public long f(v vVar) {
        this.a.b();
        this.a.c();
        try {
            long h = this.b.h(vVar);
            this.a.s();
            return h;
        } finally {
            this.a.h();
        }
    }
}
