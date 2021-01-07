package com.spotify.mobile.android.video.offline.database;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.j;

public final class b implements a {
    private final RoomDatabase a;
    private final c<c> b;
    private final androidx.room.b<c> c;

    class a extends c<c> {
        a(b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `OfflineLicenseInfoEntity` (`media_id`,`key_set_id`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, c cVar) {
            c cVar2 = cVar;
            String str = cVar2.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
            String str2 = cVar2.b;
            if (str2 == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, str2);
            }
        }
    }

    /* renamed from: com.spotify.mobile.android.video.offline.database.b$b  reason: collision with other inner class name */
    class C0201b extends androidx.room.b<c> {
        C0201b(b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `OfflineLicenseInfoEntity` WHERE `media_id` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, c cVar) {
            String str = cVar.a;
            if (str == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, str);
            }
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new C0201b(this, roomDatabase);
    }

    public void a(c cVar) {
        this.a.b();
        this.a.c();
        try {
            this.c.e(cVar);
            this.a.s();
        } finally {
            this.a.h();
        }
    }

    public c b(String str) {
        j d = j.d("SELECT * FROM OfflineLicenseInfoEntity WHERE media_id = ?", 1);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        this.a.b();
        c cVar = null;
        Cursor b2 = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b2, "media_id");
            int d3 = h7.d(b2, "key_set_id");
            if (b2.moveToFirst()) {
                cVar = new c(b2.getString(d2), b2.getString(d3));
            }
            return cVar;
        } finally {
            b2.close();
            d.f();
        }
    }

    public void c(c... cVarArr) {
        this.a.b();
        this.a.c();
        try {
            this.b.g(cVarArr);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
