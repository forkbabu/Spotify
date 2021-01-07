package com.google.android.gms.internal.cast;

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
public enum zzph {
    DOUBLE(zzpo.DOUBLE, 1),
    FLOAT(zzpo.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzpo.BOOLEAN, 0),
    STRING {
    },
    GROUP {
    },
    MESSAGE {
    },
    BYTES {
    },
    UINT32(r11, 0),
    ENUM(zzpo.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzpo zzbwu;
    private final int zzbwv;

    static {
        zzpo zzpo = zzpo.LONG;
        zzpo zzpo2 = zzpo.INT;
        zzpo zzpo3 = zzpo.MESSAGE;
    }

    private zzph(zzpo zzpo, int i) {
        this.zzbwu = zzpo;
        this.zzbwv = i;
    }

    public final zzpo d() {
        return this.zzbwu;
    }

    zzph(zzpo zzpo, int i, n8 n8Var) {
        this.zzbwu = zzpo;
        this.zzbwv = i;
    }
}
