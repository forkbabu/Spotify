package com.spotify.libs.onboarding.allboarding.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.j;
import androidx.room.o;
import com.spotify.libs.onboarding.allboarding.room.PickerStepData;
import java.util.concurrent.Callable;

public final class s implements r {
    private final RoomDatabase a;
    private final androidx.room.c<PickerStepData> b;
    private final a c = new a();
    private final androidx.room.b<PickerStepData> d;

    class a extends androidx.room.c<PickerStepData> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "INSERT OR ABORT INTO `PickerStepData` (`id`,`onBoardingSessionId`,`step`,`type`,`title`,`minimumSelectedItems`,`skippable`,`parentPickerStepId`,`loadingText`,`search_url`,`search_placeholder`,`search_initialText`,`nextStepPrimary_buttonLabel`,`nextStepPrimary_nextAction_type`,`nextStepPrimary_nextAction_link`,`nextStepPrimary_nextScreen_type`,`nextStepPrimary_nextScreen_loadingText`,`nextStepSecondary_buttonLabel`,`nextStepSecondary_nextAction_type`,`nextStepSecondary_nextAction_link`,`nextStepSecondary_nextScreen_type`,`nextStepSecondary_nextScreen_loadingText`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.c
        public void d(t7 t7Var, PickerStepData pickerStepData) {
            PickerStepData pickerStepData2 = pickerStepData;
            t7Var.t1(1, pickerStepData2.b());
            if (pickerStepData2.g() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, pickerStepData2.g());
            }
            if (pickerStepData2.k() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, pickerStepData2.k());
            }
            String a = s.this.c.a(pickerStepData2.m());
            if (a == null) {
                t7Var.O1(4);
            } else {
                t7Var.a1(4, a);
            }
            if (pickerStepData2.l() == null) {
                t7Var.O1(5);
            } else {
                t7Var.a1(5, pickerStepData2.l());
            }
            if (pickerStepData2.d() == null) {
                t7Var.O1(6);
            } else {
                t7Var.t1(6, (long) pickerStepData2.d().intValue());
            }
            t7Var.t1(7, pickerStepData2.j() ? 1 : 0);
            t7Var.t1(8, pickerStepData2.h());
            if (pickerStepData2.c() == null) {
                t7Var.O1(9);
            } else {
                t7Var.a1(9, pickerStepData2.c());
            }
            AllboardingSearch i = pickerStepData2.i();
            if (i != null) {
                if (i.getUrl() == null) {
                    t7Var.O1(10);
                } else {
                    t7Var.a1(10, i.getUrl());
                }
                if (i.getPlaceholder() == null) {
                    t7Var.O1(11);
                } else {
                    t7Var.a1(11, i.getPlaceholder());
                }
                if (i.getInitialText() == null) {
                    t7Var.O1(12);
                } else {
                    t7Var.a1(12, i.getInitialText());
                }
            } else {
                t7Var.O1(10);
                t7Var.O1(11);
                t7Var.O1(12);
            }
            PickerStepData.b e = pickerStepData2.e();
            if (e != null) {
                if (e.a() == null) {
                    t7Var.O1(13);
                } else {
                    t7Var.a1(13, e.a());
                }
                PickerStepData.NextAction b = e.b();
                if (b != null) {
                    String b2 = s.this.c.b(b.b());
                    if (b2 == null) {
                        t7Var.O1(14);
                    } else {
                        t7Var.a1(14, b2);
                    }
                    if (b.a() == null) {
                        t7Var.O1(15);
                    } else {
                        t7Var.a1(15, b.a());
                    }
                } else {
                    t7Var.O1(14);
                    t7Var.O1(15);
                }
                PickerStepData.a c = e.c();
                if (c != null) {
                    String a2 = s.this.c.a(c.b());
                    if (a2 == null) {
                        t7Var.O1(16);
                    } else {
                        t7Var.a1(16, a2);
                    }
                    if (c.a() == null) {
                        t7Var.O1(17);
                    } else {
                        t7Var.a1(17, c.a());
                    }
                } else {
                    t7Var.O1(16);
                    t7Var.O1(17);
                }
            } else {
                t7Var.O1(13);
                t7Var.O1(14);
                t7Var.O1(15);
                t7Var.O1(16);
                t7Var.O1(17);
            }
            PickerStepData.b f = pickerStepData2.f();
            if (f != null) {
                if (f.a() == null) {
                    t7Var.O1(18);
                } else {
                    t7Var.a1(18, f.a());
                }
                PickerStepData.NextAction b3 = f.b();
                if (b3 != null) {
                    String b4 = s.this.c.b(b3.b());
                    if (b4 == null) {
                        t7Var.O1(19);
                    } else {
                        t7Var.a1(19, b4);
                    }
                    if (b3.a() == null) {
                        t7Var.O1(20);
                    } else {
                        t7Var.a1(20, b3.a());
                    }
                } else {
                    t7Var.O1(19);
                    t7Var.O1(20);
                }
                PickerStepData.a c2 = f.c();
                if (c2 != null) {
                    String a3 = s.this.c.a(c2.b());
                    if (a3 == null) {
                        t7Var.O1(21);
                    } else {
                        t7Var.a1(21, a3);
                    }
                    if (c2.a() == null) {
                        t7Var.O1(22);
                    } else {
                        t7Var.a1(22, c2.a());
                    }
                } else {
                    t7Var.O1(21);
                    t7Var.O1(22);
                }
            } else {
                t7Var.O1(18);
                t7Var.O1(19);
                t7Var.O1(20);
                t7Var.O1(21);
                t7Var.O1(22);
            }
        }
    }

    class b extends androidx.room.b<PickerStepData> {
        b(s sVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM `PickerStepData` WHERE `id` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, PickerStepData pickerStepData) {
            t7Var.t1(1, pickerStepData.b());
        }
    }

    class c extends androidx.room.b<PickerStepData> {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "UPDATE OR ABORT `PickerStepData` SET `id` = ?,`onBoardingSessionId` = ?,`step` = ?,`type` = ?,`title` = ?,`minimumSelectedItems` = ?,`skippable` = ?,`parentPickerStepId` = ?,`loadingText` = ?,`search_url` = ?,`search_placeholder` = ?,`search_initialText` = ?,`nextStepPrimary_buttonLabel` = ?,`nextStepPrimary_nextAction_type` = ?,`nextStepPrimary_nextAction_link` = ?,`nextStepPrimary_nextScreen_type` = ?,`nextStepPrimary_nextScreen_loadingText` = ?,`nextStepSecondary_buttonLabel` = ?,`nextStepSecondary_nextAction_type` = ?,`nextStepSecondary_nextAction_link` = ?,`nextStepSecondary_nextScreen_type` = ?,`nextStepSecondary_nextScreen_loadingText` = ? WHERE `id` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [t7, java.lang.Object] */
        @Override // androidx.room.b
        public void d(t7 t7Var, PickerStepData pickerStepData) {
            PickerStepData pickerStepData2 = pickerStepData;
            t7Var.t1(1, pickerStepData2.b());
            if (pickerStepData2.g() == null) {
                t7Var.O1(2);
            } else {
                t7Var.a1(2, pickerStepData2.g());
            }
            if (pickerStepData2.k() == null) {
                t7Var.O1(3);
            } else {
                t7Var.a1(3, pickerStepData2.k());
            }
            String a = s.this.c.a(pickerStepData2.m());
            if (a == null) {
                t7Var.O1(4);
            } else {
                t7Var.a1(4, a);
            }
            if (pickerStepData2.l() == null) {
                t7Var.O1(5);
            } else {
                t7Var.a1(5, pickerStepData2.l());
            }
            if (pickerStepData2.d() == null) {
                t7Var.O1(6);
            } else {
                t7Var.t1(6, (long) pickerStepData2.d().intValue());
            }
            t7Var.t1(7, pickerStepData2.j() ? 1 : 0);
            t7Var.t1(8, pickerStepData2.h());
            if (pickerStepData2.c() == null) {
                t7Var.O1(9);
            } else {
                t7Var.a1(9, pickerStepData2.c());
            }
            AllboardingSearch i = pickerStepData2.i();
            if (i != null) {
                if (i.getUrl() == null) {
                    t7Var.O1(10);
                } else {
                    t7Var.a1(10, i.getUrl());
                }
                if (i.getPlaceholder() == null) {
                    t7Var.O1(11);
                } else {
                    t7Var.a1(11, i.getPlaceholder());
                }
                if (i.getInitialText() == null) {
                    t7Var.O1(12);
                } else {
                    t7Var.a1(12, i.getInitialText());
                }
            } else {
                t7Var.O1(10);
                t7Var.O1(11);
                t7Var.O1(12);
            }
            PickerStepData.b e = pickerStepData2.e();
            if (e != null) {
                if (e.a() == null) {
                    t7Var.O1(13);
                } else {
                    t7Var.a1(13, e.a());
                }
                PickerStepData.NextAction b = e.b();
                if (b != null) {
                    String b2 = s.this.c.b(b.b());
                    if (b2 == null) {
                        t7Var.O1(14);
                    } else {
                        t7Var.a1(14, b2);
                    }
                    if (b.a() == null) {
                        t7Var.O1(15);
                    } else {
                        t7Var.a1(15, b.a());
                    }
                } else {
                    t7Var.O1(14);
                    t7Var.O1(15);
                }
                PickerStepData.a c = e.c();
                if (c != null) {
                    String a2 = s.this.c.a(c.b());
                    if (a2 == null) {
                        t7Var.O1(16);
                    } else {
                        t7Var.a1(16, a2);
                    }
                    if (c.a() == null) {
                        t7Var.O1(17);
                    } else {
                        t7Var.a1(17, c.a());
                    }
                } else {
                    t7Var.O1(16);
                    t7Var.O1(17);
                }
            } else {
                t7Var.O1(13);
                t7Var.O1(14);
                t7Var.O1(15);
                t7Var.O1(16);
                t7Var.O1(17);
            }
            PickerStepData.b f = pickerStepData2.f();
            if (f != null) {
                if (f.a() == null) {
                    t7Var.O1(18);
                } else {
                    t7Var.a1(18, f.a());
                }
                PickerStepData.NextAction b3 = f.b();
                if (b3 != null) {
                    String b4 = s.this.c.b(b3.b());
                    if (b4 == null) {
                        t7Var.O1(19);
                    } else {
                        t7Var.a1(19, b4);
                    }
                    if (b3.a() == null) {
                        t7Var.O1(20);
                    } else {
                        t7Var.a1(20, b3.a());
                    }
                } else {
                    t7Var.O1(19);
                    t7Var.O1(20);
                }
                PickerStepData.a c2 = f.c();
                if (c2 != null) {
                    String a3 = s.this.c.a(c2.b());
                    if (a3 == null) {
                        t7Var.O1(21);
                    } else {
                        t7Var.a1(21, a3);
                    }
                    if (c2.a() == null) {
                        t7Var.O1(22);
                    } else {
                        t7Var.a1(22, c2.a());
                    }
                } else {
                    t7Var.O1(21);
                    t7Var.O1(22);
                }
            } else {
                t7Var.O1(18);
                t7Var.O1(19);
                t7Var.O1(20);
                t7Var.O1(21);
                t7Var.O1(22);
            }
            t7Var.t1(23, pickerStepData2.b());
        }
    }

    class d extends o {
        d(s sVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.o
        public String b() {
            return "DELETE FROM PickerStepData";
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Callable<PickerStepData> {
        final /* synthetic */ j a;

        e(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x011e A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0144 A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0156 A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x017c A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x01ab A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01cd A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01dd A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0203 A[Catch:{ all -> 0x0238 }] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.spotify.libs.onboarding.allboarding.room.PickerStepData call() {
            /*
            // Method dump skipped, instructions count: 573
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.s.e.call():java.lang.Object");
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            this.a.f();
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements Callable<PickerStepData> {
        final /* synthetic */ j a;

        f(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x011e A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0144 A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0156 A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x017c A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x01ab A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01cd A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01dd A[Catch:{ all -> 0x0238 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0203 A[Catch:{ all -> 0x0238 }] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.spotify.libs.onboarding.allboarding.room.PickerStepData call() {
            /*
            // Method dump skipped, instructions count: 573
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.s.f.call():java.lang.Object");
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            this.a.f();
        }
    }

    public s(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        new b(this, roomDatabase);
        this.d = new c(roomDatabase);
        new d(this, roomDatabase);
    }

    public long c() {
        j d2 = j.d("SELECT Count(*) FROM PickerStepData", 0);
        this.a.b();
        Cursor b2 = l7.b(this.a, d2, false, null);
        try {
            return b2.moveToFirst() ? b2.getLong(0) : 0;
        } finally {
            b2.close();
            d2.f();
        }
    }

    public LiveData<PickerStepData> d(String str) {
        j d2 = j.d("SELECT PickerStepData.* FROM PickerStepData\n        INNER JOIN OnboardingSession ON OnboardingSession.currentStepId = PickerStepData.id\n        WHERE OnboardingSession.sessionId = ?\n        ", 1);
        d2.a1(1, str);
        return this.a.j().b(new String[]{"PickerStepData", "OnboardingSession"}, false, new f(d2));
    }

    public LiveData<PickerStepData> e(long j) {
        j d2 = j.d("SELECT * FROM PickerStepData WHERE id = ?", 1);
        d2.t1(1, j);
        return this.a.j().b(new String[]{"PickerStepData"}, false, new e(d2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0126 A[Catch:{ all -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014c A[Catch:{ all -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015e A[Catch:{ all -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0180 A[Catch:{ all -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ab A[Catch:{ all -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01cd A[Catch:{ all -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01dd A[Catch:{ all -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ff A[Catch:{ all -> 0x0232 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.libs.onboarding.allboarding.room.PickerStepData f(long r42) {
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.s.f(long):com.spotify.libs.onboarding.allboarding.room.PickerStepData");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x012c A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0152 A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0164 A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0186 A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b1 A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d3 A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e3 A[Catch:{ all -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0205 A[Catch:{ all -> 0x0238 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.libs.onboarding.allboarding.room.PickerStepData g(java.lang.String r42) {
        /*
        // Method dump skipped, instructions count: 580
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.room.s.g(java.lang.String):com.spotify.libs.onboarding.allboarding.room.PickerStepData");
    }

    public long h(PickerStepData pickerStepData) {
        this.a.b();
        this.a.c();
        try {
            long h = this.b.h(pickerStepData);
            this.a.s();
            return h;
        } finally {
            this.a.h();
        }
    }

    public int i(PickerStepData pickerStepData) {
        this.a.b();
        this.a.c();
        try {
            int e2 = this.d.e(pickerStepData) + 0;
            this.a.s();
            return e2;
        } finally {
            this.a.h();
        }
    }
}
