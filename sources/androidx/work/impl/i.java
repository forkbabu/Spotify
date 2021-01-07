package androidx.work.impl;

import androidx.room.RoomDatabase;

/* access modifiers changed from: package-private */
public class i extends RoomDatabase.b {
    i() {
    }

    @Override // androidx.room.RoomDatabase.b
    public void a(p7 p7Var) {
        p7Var.t();
        try {
            p7Var.A(WorkDatabase.u());
            p7Var.Y();
        } finally {
            p7Var.i0();
        }
    }
}
