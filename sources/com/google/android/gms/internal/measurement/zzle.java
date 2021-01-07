package com.google.android.gms.internal.measurement;

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
public enum zzle {
    DOUBLE(zzlh.DOUBLE, 1),
    FLOAT(zzlh.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzlh.BOOLEAN, 0),
    STRING {
    },
    GROUP {
    },
    MESSAGE {
    },
    BYTES {
    },
    UINT32(r11, 0),
    ENUM(zzlh.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzlh zzs;
    private final int zzt;

    static {
        zzlh zzlh = zzlh.LONG;
        zzlh zzlh2 = zzlh.INT;
        zzlh zzlh3 = zzlh.MESSAGE;
    }

    private zzle(zzlh zzlh, int i) {
        this.zzs = zzlh;
        this.zzt = i;
    }

    public final zzlh d() {
        return this.zzs;
    }

    zzle(zzlh zzlh, int i, w6 w6Var) {
        this.zzs = zzlh;
        this.zzt = i;
    }
}
