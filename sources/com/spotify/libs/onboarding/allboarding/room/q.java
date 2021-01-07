package com.spotify.libs.onboarding.allboarding.room;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.j;
import androidx.room.o;
import java.util.List;

public final class q implements p {
    private final RoomDatabase a;
    private final androidx.room.c<o> b;
    private final o c;

    class a extends androidx.room.c<o> {
        a(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR IGNORE INTO `PickerSectionCrossRef` (`sortOrder`,`pickerUri`,`sectionId`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, o oVar) {
            o oVar2 = oVar;
            t7Var.t1(1, (long) oVar2.c());
            if (oVar2.a() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, oVar2.a());
            }
            if (oVar2.b() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, oVar2.b());
            }
        }
    }

    class b extends androidx.room.b<o> {
        b(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `PickerSectionCrossRef` WHERE `sectionId` = ? AND `pickerUri` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, o oVar) {
            o oVar2 = oVar;
            if (oVar2.b() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, oVar2.b());
            }
            if (oVar2.a() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, oVar2.a());
            }
        }
    }

    class c extends o {
        c(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "\n        UPDATE PickerSectionCrossRef\n        SET sortOrder = (sortOrder + ?)\n        WHERE sectionId = ? and sortOrder > ?\n        ";
        }
    }

    public q(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        new b(this, roomDatabase);
        this.c = new c(this, roomDatabase);
    }

    public o a(String str, String str2) {
        j d = j.d("\n        SELECT * FROM PickerSectionCrossRef where pickerUri = ? and sectionId = ?\n    ", 2);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        if (str2 == null) {
            d.O1(2);
        } else {
            d.a1(2, str2);
        }
        this.a.b();
        o oVar = null;
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b2, "sortOrder");
            int d3 = h7.d(b2, "pickerUri");
            int d4 = h7.d(b2, "sectionId");
            if (b2.moveToFirst()) {
                oVar = new o(b2.getInt(d2), b2.getString(d3), b2.getString(d4));
            }
            return oVar;
        } finally {
            b2.close();
            d.f();
        }
    }

    public int b(String str, String str2) {
        j d = j.d("\n            SELECT COUNT(pickerUri)\n            FROM PickerSectionCrossRef\n            WHERE sectionId = ?\n            AND sortOrder < (SELECT sortOrder\n                    FROM PickerSectionCrossRef\n                    WHERE pickerUri = ? AND sectionId = ?\n            )\n        ", 3);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        if (str2 == null) {
            d.O1(2);
        } else {
            d.a1(2, str2);
        }
        if (str == null) {
            d.O1(3);
        } else {
            d.a1(3, str);
        }
        this.a.b();
        int i = 0;
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            if (b2.moveToFirst()) {
                i = b2.getInt(0);
            }
            return i;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void c(List<o> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.e(list);
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    public void d(String str, int i, int i2) {
        this.a.b();
        t7 a2 = this.c.a();
        a2.t1(1, (long) i2);
        if (str == null) {
            a2.O1(2);
        } else {
            a2.a1(2, str);
        }
        a2.t1(3, (long) i);
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
