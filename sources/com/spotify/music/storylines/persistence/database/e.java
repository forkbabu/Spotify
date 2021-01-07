package com.spotify.music.storylines.persistence.database;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;
import androidx.room.o;
import java.util.ArrayList;
import java.util.List;

public final class e implements d {
    private final RoomDatabase a;
    private final c<f> b;
    private final o c;

    class a extends c<f> {
        a(e eVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR ABORT INTO `storylines_entities` (`uri`) VALUES (?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, f fVar) {
            String str = fVar.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
        }
    }

    class b extends o {
        b(e eVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM storylines_entities";
        }
    }

    public e(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    public boolean a(String str) {
        boolean z = true;
        j d = j.d("SELECT EXISTS(SELECT * FROM storylines_entities WHERE uri = ?)", 1);
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

    public List<String> c() {
        j d = j.d("SELECT uri FROM storylines_entities", 0);
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

    public void d(List<f> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.e(list);
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    public void e(List<f> list) {
        this.a.c();
        try {
            b();
            d(list);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
