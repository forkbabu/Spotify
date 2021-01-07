package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.e;

public abstract class zzp {

    public static abstract class a {
        public abstract a a(a aVar);

        public abstract a b(zzb zzb);

        public abstract zzp c();
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class zzb extends Enum<zzb> {
        public static final zzb a = new zzb("UNKNOWN", 0);
        public static final zzb b = new zzb("ANDROID_FIREBASE", 1);

        private zzb(String str, int i) {
        }
    }

    public static a a() {
        return new e.a();
    }

    public abstract a b();

    public abstract zzb c();
}
