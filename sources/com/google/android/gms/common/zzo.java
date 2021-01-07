package com.google.android.gms.common;

/* access modifiers changed from: package-private */
public enum zzo {
    DEFAULT(0),
    UNKNOWN_CERT(1),
    TEST_KEYS_REJECTED(2),
    PACKAGE_NOT_FOUND(3),
    GENERIC_ERROR(4);
    
    final int zzb;

    private zzo(int i) {
        this.zzb = i;
    }

    static zzo d(int i) {
        zzo[] values = values();
        for (int i2 = 0; i2 < 5; i2++) {
            zzo zzo = values[i2];
            if (zzo.zzb == i) {
                return zzo;
            }
        }
        return DEFAULT;
    }
}
