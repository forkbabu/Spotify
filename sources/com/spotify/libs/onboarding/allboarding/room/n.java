package com.spotify.libs.onboarding.allboarding.room;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import java.util.ArrayList;
import java.util.List;

public final class n implements m {
    private final RoomDatabase a;
    private final c<u> b;

    class a extends c<u> {
        a(n nVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR IGNORE INTO `RelatedPickerItemCrossRef` (`pickerUri`,`relatedPickerUri`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, u uVar) {
            u uVar2 = uVar;
            if (uVar2.a() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, uVar2.a());
            }
            if (uVar2.b() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, uVar2.b());
            }
        }
    }

    class b extends androidx.room.b<u> {
        b(n nVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `RelatedPickerItemCrossRef` WHERE `pickerUri` = ? AND `relatedPickerUri` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, u uVar) {
            u uVar2 = uVar;
            if (uVar2.a() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, uVar2.a());
            }
            if (uVar2.b() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, uVar2.b());
            }
        }
    }

    public n(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        new b(this, roomDatabase);
    }

    public List<u> a(String str) {
        j d = j.d("\n        SELECT RelatedPickerItemCrossRef.* FROM RelatedPickerItemCrossRef\n                    left join PickerSectionCrossRef\n                    on PickerSectionCrossRef.pickerUri = RelatedPickerItemCrossRef.relatedPickerUri\n                    where RelatedPickerItemCrossRef.pickerUri = ?\n                    and PickerSectionCrossRef.sectionId is null\n    ", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b2, "pickerUri");
            int d3 = h7.d(b2, "relatedPickerUri");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(new u(b2.getString(d2), b2.getString(d3)));
            }
            return arrayList;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void b(List<u> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.e(list);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
