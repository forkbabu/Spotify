package com.spotify.mobile.android.coreintegration;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.io.File;
import java.util.Locale;
import java.util.Random;

/* access modifiers changed from: package-private */
public class StateRestoreFileDeleter {
    private static final SpSharedPreferences.b<Object, Integer> c = SpSharedPreferences.b.c("service_crash_count");
    private static final SpSharedPreferences.b<Object, Integer> d = SpSharedPreferences.b.c("deletion-policy");
    private final SpSharedPreferences<Object> a;
    private final Random b;

    enum DeletionPolicy {
        BASIC {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.mobile.android.coreintegration.StateRestoreFileDeleter.DeletionPolicy
            public boolean d(String str) {
                return str.equals("state.restore");
            }
        },
        INTERMEDIATE {
            @Override // com.spotify.mobile.android.coreintegration.StateRestoreFileDeleter.DeletionPolicy
            public boolean d(String str) {
                return !str.equals("orbit.settings") && !str.equals("offline2") && !str.equals("offline_lists.bnk");
            }
        },
        EXTREME {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.mobile.android.coreintegration.StateRestoreFileDeleter.DeletionPolicy
            public boolean d(String str) {
                return true;
            }
        };
        
        public static final DeletionPolicy[] f = values();

        DeletionPolicy(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean d(String str);

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return super.toString().toLowerCase(Locale.US);
        }
    }

    StateRestoreFileDeleter(SpSharedPreferences<Object> spSharedPreferences, Random random) {
        this.a = spSharedPreferences;
        this.b = random;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        File[] listFiles;
        if (str != null) {
            SpSharedPreferences<Object> spSharedPreferences = this.a;
            SpSharedPreferences.b<Object, Integer> bVar = c;
            int f = spSharedPreferences.f(bVar, 0) + 1;
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.b(bVar, f);
            b2.j();
            Logger.g("Current startup count is %d", Integer.valueOf(f));
            if (f > 5) {
                SpSharedPreferences<Object> spSharedPreferences2 = this.a;
                SpSharedPreferences.b<Object, Integer> bVar2 = d;
                DeletionPolicy deletionPolicy = DeletionPolicy.BASIC;
                int f2 = spSharedPreferences2.f(bVar2, 0);
                if (f2 >= 0) {
                    DeletionPolicy[] deletionPolicyArr = DeletionPolicy.f;
                    if (f2 < deletionPolicyArr.length) {
                        deletionPolicy = deletionPolicyArr[f2];
                    }
                }
                SpSharedPreferences<Object> spSharedPreferences3 = this.a;
                int ordinal = deletionPolicy.ordinal() + 1;
                DeletionPolicy deletionPolicy2 = DeletionPolicy.EXTREME;
                if (ordinal > 2) {
                    ordinal = 0;
                }
                SpSharedPreferences.a<Object> b3 = spSharedPreferences3.b();
                b3.b(bVar2, ordinal);
                b3.j();
                File file = new File(str, "Users");
                if (file.exists() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            Logger.d("SpotifyService: Deleting state files", new Object[0]);
                            Logger.b("Deleting state files", new Object[0]);
                            StringBuilder sb = new StringBuilder();
                            File[] listFiles2 = file2.listFiles();
                            if (listFiles2 != null) {
                                for (File file3 : listFiles2) {
                                    if (file3.isFile() && deletionPolicy.d(file3.getName()) && file3.delete()) {
                                        sb.append("Deleted ");
                                        sb.append(file3.getName());
                                        sb.append(". ");
                                    }
                                }
                            }
                            Logger.b(sb.toString(), new Object[0]);
                            Logger.d("SpotifyService %s", sb.toString());
                        }
                    }
                }
                if (this.b.nextDouble() >= 0.99d) {
                    Assertion.g("Cleaning state restore files (Throttled 99%), policy \"" + deletionPolicy + '\"');
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        SpSharedPreferences.b<Object, Integer> bVar = d;
        DeletionPolicy deletionPolicy = DeletionPolicy.BASIC;
        b2.b(bVar, 0);
        b2.b(c, 0);
        b2.i();
    }
}
