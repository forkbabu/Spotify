package com.spotify.music.builtinauth.cache;

import androidx.room.RoomDatabase;
import androidx.room.o;

public final class d0 implements c0 {
    private final RoomDatabase a;
    private final androidx.room.c<b0> b;
    private final androidx.room.b<b0> c;
    private final o d;

    class a extends androidx.room.c<b0> {
        a(d0 d0Var, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `cachedClientInfo` (`client_id`,`redirect_uri`,`scopes`,`timestamp`,`package_name`,`app_signature`,`last_used_timestamp`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, b0 b0Var) {
            b0 b0Var2 = b0Var;
            if (b0Var2.c() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, b0Var2.c());
            }
            if (b0Var2.f() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, b0Var2.f());
            }
            if (b0Var2.g() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, b0Var2.g());
            }
            t7Var.t1(4, b0Var2.h());
            if (b0Var2.e() == null) {
                t7Var.O1(5);
            } else {
                t7Var.a1(5, b0Var2.e());
            }
            if (b0Var2.b() == null) {
                t7Var.O1(6);
            } else {
                t7Var.a1(6, b0Var2.b());
            }
            t7Var.t1(7, b0Var2.d());
        }
    }

    class b extends androidx.room.b<b0> {
        b(d0 d0Var, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `cachedClientInfo` WHERE `client_id` = ? AND `redirect_uri` = ? AND `package_name` = ? AND `app_signature` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, b0 b0Var) {
            b0 b0Var2 = b0Var;
            if (b0Var2.c() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, b0Var2.c());
            }
            if (b0Var2.f() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, b0Var2.f());
            }
            if (b0Var2.e() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, b0Var2.e());
            }
            if (b0Var2.b() == null) {
                t7Var.O1(4);
            } else {
                t7Var.a1(4, b0Var2.b());
            }
        }
    }

    class c extends o {
        c(d0 d0Var, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM cachedClientInfo";
        }
    }

    public d0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
        this.d = new c(this, roomDatabase);
    }
}
