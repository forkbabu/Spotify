package com.google.android.gms.internal.recaptcha;

/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* JADX WARN: Init of enum z can be incorrect */
/* JADX WARN: Init of enum A can be incorrect */
public enum zzhk {
    DOUBLE(zzhr.DOUBLE, 1),
    FLOAT(zzhr.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzhr.BOOLEAN, 0),
    STRING {
    },
    GROUP {
    },
    MESSAGE {
    },
    BYTES {
    },
    UINT32(r11, 0),
    ENUM(zzhr.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzhr zzs;
    private final int zzt;

    static {
        zzhr zzhr = zzhr.LONG;
        zzhr zzhr2 = zzhr.INT;
        zzhr zzhr3 = zzhr.MESSAGE;
    }

    private zzhk(zzhr zzhr, int i) {
        this.zzs = zzhr;
        this.zzt = i;
    }

    public final zzhr d() {
        return this.zzs;
    }

    zzhk(zzhr zzhr, int i, p2 p2Var) {
        this.zzs = zzhr;
        this.zzt = i;
    }
}
