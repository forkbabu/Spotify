package com.spotify.libs.onboarding.allboarding.room;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.o;
import java.util.List;
import java.util.concurrent.Callable;

public final class l implements k {
    private final RoomDatabase a;
    private final androidx.room.c<j> b;
    private final androidx.room.b<j> c;
    private final o d;
    private final o e;
    private final o f;

    /* access modifiers changed from: package-private */
    public class a implements Callable<List<j>> {
        final /* synthetic */ androidx.room.j a;

        a(androidx.room.j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x0290 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x00fe A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0129 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x012a A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01af A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01b2 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01ba A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01bd A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01c5 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01c8 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01df A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01f1 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01ff A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x020f A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x021b A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x023e A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0254 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0256 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x026c A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x027a A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0284 A[Catch:{ all -> 0x02b8 }] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.spotify.libs.onboarding.allboarding.room.j> call() {
            /*
            // Method dump skipped, instructions count: 703
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.l.a.call():java.lang.Object");
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            this.a.f();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Callable<List<j>> {
        final /* synthetic */ androidx.room.j a;

        b(androidx.room.j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x0290 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x00fe A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0129 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x012a A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01af A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01b2 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01ba A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01bd A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01c5 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01c8 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01df A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01f1 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01ff A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x020f A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x021b A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x023e A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0254 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0256 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x026c A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x027a A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0284 A[Catch:{ all -> 0x02b8 }] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.spotify.libs.onboarding.allboarding.room.j> call() {
            /*
            // Method dump skipped, instructions count: 703
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.l.b.call():java.lang.Object");
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            this.a.f();
        }
    }

    class c extends androidx.room.c<j> {
        c(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR IGNORE INTO `Picker` (`pickerUri`,`pickerTitle`,`sectionId`,`sectionTitle_title`,`sectionTitle_subtitle`,`logging_section`,`logging_contentSource`,`selectable_isSelected`,`selectable_shouldFollowOnSelection`,`selectable_timestamp`,`expandable_moreUri`,`expandable_expansionLimit`,`expandable_expansionOffset`,`expandable_canExpandMultipleTimes`,`expandable_removeItemOnExpansion`,`expandable_prependsItemsOnExpansion`,`expandable_numberOfTimesExpanded`,`banner_imageUrl`,`show_imageUrl`,`showMore_color`,`showMore_canExpandMultipleTimes`,`showMore_expansionOffset`,`artist_imageUrl`,`artistMore_color`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, j jVar) {
            j jVar2 = jVar;
            if (jVar2.i() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, jVar2.i());
            }
            if (jVar2.h() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, jVar2.h());
            }
            if (jVar2.j() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, jVar2.j());
            }
            y k = jVar2.k();
            if (k != null) {
                if (k.b() == null) {
                    t7Var.O1(4);
                } else {
                    t7Var.a1(4, k.b());
                }
                if (k.a() == null) {
                    t7Var.O1(5);
                } else {
                    t7Var.a1(5, k.a());
                }
            } else {
                t7Var.O1(4);
                t7Var.O1(5);
            }
            f g = jVar2.g();
            if (g != null) {
                if (g.b() == null) {
                    t7Var.O1(6);
                } else {
                    t7Var.a1(6, g.b());
                }
                if (g.a() == null) {
                    t7Var.O1(7);
                } else {
                    t7Var.a1(7, g.a());
                }
            } else {
                t7Var.O1(6);
                t7Var.O1(7);
            }
            z l = jVar2.l();
            if (l != null) {
                t7Var.t1(8, l.e() ? 1 : 0);
                t7Var.t1(9, l.b() ? 1 : 0);
                t7Var.t1(10, l.c());
            } else {
                t7Var.O1(8);
                t7Var.O1(9);
                t7Var.O1(10);
            }
            e f = jVar2.f();
            if (f != null) {
                if (f.e() == null) {
                    t7Var.O1(11);
                } else {
                    t7Var.a1(11, f.e());
                }
                t7Var.t1(12, (long) f.b());
                t7Var.t1(13, (long) f.c());
                t7Var.t1(14, f.a() ? 1 : 0);
                t7Var.t1(15, f.h() ? 1 : 0);
                t7Var.t1(16, f.g() ? 1 : 0);
                t7Var.t1(17, (long) f.f());
            } else {
                t7Var.O1(11);
                t7Var.O1(12);
                t7Var.O1(13);
                t7Var.O1(14);
                t7Var.O1(15);
                t7Var.O1(16);
                t7Var.O1(17);
            }
            d e = jVar2.e();
            if (e == null) {
                t7Var.O1(18);
            } else if (e.a() == null) {
                t7Var.O1(18);
            } else {
                t7Var.a1(18, e.a());
            }
            a0 m = jVar2.m();
            if (m == null) {
                t7Var.O1(19);
            } else if (m.a() == null) {
                t7Var.O1(19);
            } else {
                t7Var.a1(19, m.a());
            }
            b0 n = jVar2.n();
            if (n != null) {
                if (n.b() == null) {
                    t7Var.O1(20);
                } else {
                    t7Var.a1(20, n.b());
                }
                t7Var.t1(21, n.a() ? 1 : 0);
                t7Var.t1(22, (long) n.c());
            } else {
                t7Var.O1(20);
                t7Var.O1(21);
                t7Var.O1(22);
            }
            b b = jVar2.b();
            if (b == null) {
                t7Var.O1(23);
            } else if (b.a() == null) {
                t7Var.O1(23);
            } else {
                t7Var.a1(23, b.a());
            }
            c c = jVar2.c();
            if (c == null) {
                t7Var.O1(24);
            } else if (c.a() == null) {
                t7Var.O1(24);
            } else {
                t7Var.a1(24, c.a());
            }
        }
    }

    class d extends androidx.room.b<j> {
        d(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `Picker` WHERE `pickerUri` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, j jVar) {
            j jVar2 = jVar;
            if (jVar2.i() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, jVar2.i());
            }
        }
    }

    class e extends androidx.room.b<j> {
        e(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE OR ABORT `Picker` SET `pickerUri` = ?,`pickerTitle` = ?,`sectionId` = ?,`sectionTitle_title` = ?,`sectionTitle_subtitle` = ?,`logging_section` = ?,`logging_contentSource` = ?,`selectable_isSelected` = ?,`selectable_shouldFollowOnSelection` = ?,`selectable_timestamp` = ?,`expandable_moreUri` = ?,`expandable_expansionLimit` = ?,`expandable_expansionOffset` = ?,`expandable_canExpandMultipleTimes` = ?,`expandable_removeItemOnExpansion` = ?,`expandable_prependsItemsOnExpansion` = ?,`expandable_numberOfTimesExpanded` = ?,`banner_imageUrl` = ?,`show_imageUrl` = ?,`showMore_color` = ?,`showMore_canExpandMultipleTimes` = ?,`showMore_expansionOffset` = ?,`artist_imageUrl` = ?,`artistMore_color` = ? WHERE `pickerUri` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, j jVar) {
            j jVar2 = jVar;
            if (jVar2.i() == null) {
                t7Var.O1(1);
            } else {
                t7Var.a1(1, jVar2.i());
            }
            if (jVar2.h() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, jVar2.h());
            }
            if (jVar2.j() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, jVar2.j());
            }
            y k = jVar2.k();
            if (k != null) {
                if (k.b() == null) {
                    t7Var.O1(4);
                } else {
                    t7Var.a1(4, k.b());
                }
                if (k.a() == null) {
                    t7Var.O1(5);
                } else {
                    t7Var.a1(5, k.a());
                }
            } else {
                t7Var.O1(4);
                t7Var.O1(5);
            }
            f g = jVar2.g();
            if (g != null) {
                if (g.b() == null) {
                    t7Var.O1(6);
                } else {
                    t7Var.a1(6, g.b());
                }
                if (g.a() == null) {
                    t7Var.O1(7);
                } else {
                    t7Var.a1(7, g.a());
                }
            } else {
                t7Var.O1(6);
                t7Var.O1(7);
            }
            z l = jVar2.l();
            if (l != null) {
                t7Var.t1(8, l.e() ? 1 : 0);
                t7Var.t1(9, l.b() ? 1 : 0);
                t7Var.t1(10, l.c());
            } else {
                t7Var.O1(8);
                t7Var.O1(9);
                t7Var.O1(10);
            }
            e f = jVar2.f();
            if (f != null) {
                if (f.e() == null) {
                    t7Var.O1(11);
                } else {
                    t7Var.a1(11, f.e());
                }
                t7Var.t1(12, (long) f.b());
                t7Var.t1(13, (long) f.c());
                t7Var.t1(14, f.a() ? 1 : 0);
                t7Var.t1(15, f.h() ? 1 : 0);
                t7Var.t1(16, f.g() ? 1 : 0);
                t7Var.t1(17, (long) f.f());
            } else {
                t7Var.O1(11);
                t7Var.O1(12);
                t7Var.O1(13);
                t7Var.O1(14);
                t7Var.O1(15);
                t7Var.O1(16);
                t7Var.O1(17);
            }
            d e = jVar2.e();
            if (e == null) {
                t7Var.O1(18);
            } else if (e.a() == null) {
                t7Var.O1(18);
            } else {
                t7Var.a1(18, e.a());
            }
            a0 m = jVar2.m();
            if (m == null) {
                t7Var.O1(19);
            } else if (m.a() == null) {
                t7Var.O1(19);
            } else {
                t7Var.a1(19, m.a());
            }
            b0 n = jVar2.n();
            if (n != null) {
                if (n.b() == null) {
                    t7Var.O1(20);
                } else {
                    t7Var.a1(20, n.b());
                }
                t7Var.t1(21, n.a() ? 1 : 0);
                t7Var.t1(22, (long) n.c());
            } else {
                t7Var.O1(20);
                t7Var.O1(21);
                t7Var.O1(22);
            }
            b b = jVar2.b();
            if (b == null) {
                t7Var.O1(23);
            } else if (b.a() == null) {
                t7Var.O1(23);
            } else {
                t7Var.a1(23, b.a());
            }
            c c = jVar2.c();
            if (c == null) {
                t7Var.O1(24);
            } else if (c.a() == null) {
                t7Var.O1(24);
            } else {
                t7Var.a1(24, c.a());
            }
            if (jVar2.i() == null) {
                t7Var.O1(25);
            } else {
                t7Var.a1(25, jVar2.i());
            }
        }
    }

    class f extends o {
        f(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM picker WHERE pickerUri = ?";
        }
    }

    class g extends o {
        g(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "\n        UPDATE Picker\n        SET selectable_isSelected = ?, selectable_timestamp = ?\n        WHERE pickerUri = ? AND selectable_isSelected IS NOT null\n        ";
        }
    }

    class h extends o {
        h(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "\n        UPDATE Picker\n        SET expandable_numberOfTimesExpanded = expandable_numberOfTimesExpanded + 1\n        WHERE pickerUri = ?\n        ";
        }
    }

    class i extends o {
        i(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM picker";
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements Callable<List<j>> {
        final /* synthetic */ androidx.room.j a;

        j(androidx.room.j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x0290 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x00fe A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0129 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x012a A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01af A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01b2 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01ba A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01bd A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01c5 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01c8 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01df A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01f1 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01ff A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x020f A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x021b A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x023e A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0254 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0256 A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x026c A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x027a A[Catch:{ all -> 0x02b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0284 A[Catch:{ all -> 0x02b8 }] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.spotify.libs.onboarding.allboarding.room.j> call() {
            /*
            // Method dump skipped, instructions count: 703
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.l.j.call():java.lang.Object");
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            this.a.f();
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new c(this, roomDatabase);
        new d(this, roomDatabase);
        this.c = new e(this, roomDatabase);
        this.d = new f(this, roomDatabase);
        this.e = new g(this, roomDatabase);
        this.f = new h(this, roomDatabase);
        new i(this, roomDatabase);
    }

    public void b(String str) {
        this.a.b();
        t7 a2 = this.d.a();
        if (str == null) {
            a2.O1(1);
        } else {
            a2.a1(1, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.s();
        } finally {
            this.a.h();
            this.d.c(a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x023c A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0244 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0250 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fc A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0127 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0128 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0196 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0199 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a1 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a4 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ac A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01af A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c6 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01de A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ec A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f6 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020c A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x021a A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x021c A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0230 A[Catch:{ all -> 0x0262 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.libs.onboarding.allboarding.room.j c(java.lang.String r43) {
        /*
        // Method dump skipped, instructions count: 622
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.l.c(java.lang.String):com.spotify.libs.onboarding.allboarding.room.j");
    }

    public LiveData<List<j>> d(String str) {
        androidx.room.j d2 = androidx.room.j.d("\n        SELECT Picker.* FROM picker\n        INNER JOIN pickersectioncrossref ON picker.pickeruri = pickersectioncrossref.pickerUri\n        where pickersectioncrossref.sectionId = ? order by pickersectioncrossref.sortOrder\n        ", 1);
        d2.a1(1, str);
        return this.a.j().b(new String[]{"picker", "pickersectioncrossref"}, false, new j(d2));
    }

    public LiveData<List<j>> e(String str) {
        androidx.room.j d2 = androidx.room.j.d("\n        SELECT Picker.* FROM picker\n        INNER JOIN PickerSectionCrossRef ON Picker.pickerUri = pickersectioncrossref.pickerUri\n        INNER JOIN Section ON pickersectioncrossref.sectionId = section.sectionId\n        INNER JOIN PickerStepData ON section.pickerStepDataId = pickerStepData.id\n        WHERE picker.selectable_isSelected = 1 AND PickerStepData.onBoardingSessionId = ?\n        ", 1);
        d2.a1(1, str);
        return this.a.j().b(new String[]{"picker", "PickerSectionCrossRef", "Section", "PickerStepData"}, false, new b(d2));
    }

    public LiveData<List<j>> f(long j2) {
        androidx.room.j d2 = androidx.room.j.d("\n        SELECT Picker.* FROM picker\n        INNER JOIN pickersectioncrossref ON picker.pickeruri = pickersectioncrossref.pickerUri\n        INNER JOIN section ON pickersectioncrossref.sectionId = section.sectionId\n        where picker.selectable_isSelected = 1 AND section.pickerStepDataId = ?\n        order by pickersectioncrossref.sortOrder\n        ", 1);
        d2.t1(1, j2);
        return this.a.j().b(new String[]{"picker", "pickersectioncrossref", "section"}, false, new a(d2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x028d A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0299 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x010b A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0136 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0137 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b8 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bb A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c3 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c6 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ce A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d1 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e8 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01fa A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0208 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0218 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0224 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0247 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025d A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025f A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0275 A[Catch:{ all -> 0x02c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0283 A[Catch:{ all -> 0x02c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.spotify.libs.onboarding.allboarding.room.j> g(long r54) {
        /*
        // Method dump skipped, instructions count: 722
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.l.g(long):java.util.List");
    }

    public void h(String str) {
        this.a.b();
        t7 a2 = this.f.a();
        if (str == null) {
            a2.O1(1);
        } else {
            a2.a1(1, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.s();
        } finally {
            this.a.h();
            this.f.c(a2);
        }
    }

    public long i(j jVar) {
        this.a.b();
        this.a.c();
        try {
            long h2 = this.b.h(jVar);
            this.a.s();
            return h2;
        } finally {
            this.a.h();
        }
    }

    public List<Long> j(List<j> list) {
        this.a.b();
        this.a.c();
        try {
            List<Long> i2 = this.b.i(list);
            this.a.s();
            return i2;
        } finally {
            this.a.h();
        }
    }

    public void k(String str, boolean z, long j2) {
        this.a.b();
        t7 a2 = this.e.a();
        a2.t1(1, z ? 1 : 0);
        a2.t1(2, j2);
        if (str == null) {
            a2.O1(3);
        } else {
            a2.a1(3, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.s();
        } finally {
            this.a.h();
            this.e.c(a2);
        }
    }

    public void l(j jVar) {
        this.a.b();
        this.a.c();
        try {
            this.c.e(jVar);
            this.a.s();
        } finally {
            this.a.h();
        }
    }
}
