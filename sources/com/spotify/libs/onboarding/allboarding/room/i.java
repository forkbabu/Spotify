package com.spotify.libs.onboarding.allboarding.room;

import androidx.room.RoomDatabase;
import androidx.room.o;

public final class i implements h {
    private final RoomDatabase a;
    private final androidx.room.c<g> b;
    private final o c;

    class a extends androidx.room.c<g> {
        a(i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR REPLACE INTO `OnboardingSession` (`sessionId`,`currentStepId`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, g gVar) {
            g gVar2 = gVar;
            if (gVar2.b() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, gVar2.b());
            }
            if (gVar2.a() == null) {
                t7Var.O1(2);
            } else {
                t7Var.t1(2, gVar2.a().longValue());
            }
        }
    }

    class b extends androidx.room.b<g> {
        b(i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `OnboardingSession` WHERE `sessionId` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, g gVar) {
            g gVar2 = gVar;
            if (gVar2.b() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, gVar2.b());
            }
        }
    }

    class c extends o {
        c(i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE OnboardingSession SET currentStepId = ? WHERE sessionId = ?";
        }
    }

    public i(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        new b(this, roomDatabase);
        this.c = new c(this, roomDatabase);
    }

    public long a(g gVar) {
        this.a.b();
        this.a.c();
        try {
            long h = this.b.h(gVar);
            this.a.s();
            return h;
        } finally {
            this.a.h();
        }
    }

    public void b(String str, long j) {
        this.a.b();
        t7 a2 = this.c.a();
        a2.t1(1, j);
        if (str == null) {
            a2.O1(2);
        } else {
            a2.a1(2, str);
        }
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
