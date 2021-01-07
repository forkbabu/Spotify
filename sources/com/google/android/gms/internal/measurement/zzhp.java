package com.google.android.gms.internal.measurement;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum u can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum w can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* JADX WARN: Init of enum z can be incorrect */
/* JADX WARN: Init of enum A can be incorrect */
/* JADX WARN: Init of enum B can be incorrect */
/* JADX WARN: Init of enum C can be incorrect */
/* JADX WARN: Init of enum D can be incorrect */
/* JADX WARN: Init of enum E can be incorrect */
/* JADX WARN: Init of enum F can be incorrect */
/* JADX WARN: Init of enum G can be incorrect */
/* JADX WARN: Init of enum H can be incorrect */
/* JADX WARN: Init of enum I can be incorrect */
/* JADX WARN: Init of enum J can be incorrect */
/* JADX WARN: Init of enum K can be incorrect */
/* JADX WARN: Init of enum L can be incorrect */
/* JADX WARN: Init of enum M can be incorrect */
/* JADX WARN: Init of enum N can be incorrect */
/* JADX WARN: Init of enum O can be incorrect */
/* JADX WARN: Init of enum P can be incorrect */
/* JADX WARN: Init of enum Q can be incorrect */
/* JADX WARN: Init of enum R can be incorrect */
/* JADX WARN: Init of enum S can be incorrect */
/* JADX WARN: Init of enum T can be incorrect */
/* JADX WARN: Init of enum U can be incorrect */
/* JADX WARN: Init of enum V can be incorrect */
/* JADX WARN: Init of enum W can be incorrect */
/* JADX WARN: Init of enum X can be incorrect */
/* JADX WARN: Init of enum Y can be incorrect */
/* JADX WARN: Init of enum Z can be incorrect */
/* JADX WARN: Init of enum a0 can be incorrect */
/* JADX WARN: Init of enum b0 can be incorrect */
/* JADX WARN: Init of enum c0 can be incorrect */
/* JADX WARN: Init of enum d0 can be incorrect */
/* JADX WARN: Init of enum e0 can be incorrect */
/* JADX WARN: Init of enum f0 can be incorrect */
/* JADX WARN: Init of enum g0 can be incorrect */
public enum zzhp {
    DOUBLE(0, r7, r8),
    FLOAT(1, r7, r9),
    INT64(2, r7, r10),
    UINT64(3, r7, r10),
    INT32(4, r7, r11),
    FIXED64(5, r7, r10),
    FIXED32(6, r7, r11),
    BOOL(7, r7, r12),
    STRING(8, r7, r13),
    MESSAGE(9, r7, r14),
    BYTES(10, r7, r15),
    UINT32(11, r7, r11),
    ENUM(12, r7, r16),
    SFIXED32(13, r7, r11),
    SFIXED64(14, r7, r10),
    SINT32(15, r7, r11),
    SINT64(16, r7, r10),
    GROUP(17, r7, r14),
    DOUBLE_LIST(18, r7, r8),
    FLOAT_LIST(19, r7, r9),
    INT64_LIST(20, r7, r10),
    UINT64_LIST(21, r7, r10),
    INT32_LIST(22, r7, r11),
    FIXED64_LIST(23, r7, r10),
    FIXED32_LIST(24, r7, r11),
    BOOL_LIST(25, r7, r12),
    STRING_LIST(26, r7, r13),
    MESSAGE_LIST(27, r7, r14),
    BYTES_LIST(28, r7, r15),
    UINT32_LIST(29, r7, r11),
    ENUM_LIST(30, r7, r16),
    SFIXED32_LIST(31, r7, r11),
    SFIXED64_LIST(32, r7, r10),
    SINT32_LIST(33, r7, r11),
    SINT64_LIST(34, r7, r10),
    DOUBLE_LIST_PACKED(35, r13, r8),
    FLOAT_LIST_PACKED(36, r13, r9),
    INT64_LIST_PACKED(37, r13, r10),
    UINT64_LIST_PACKED(38, r13, r10),
    INT32_LIST_PACKED(39, r13, r11),
    FIXED64_LIST_PACKED(40, r13, r10),
    FIXED32_LIST_PACKED(41, r13, r11),
    BOOL_LIST_PACKED(42, r13, r12),
    UINT32_LIST_PACKED(43, r13, r11),
    ENUM_LIST_PACKED(44, r13, r16),
    SFIXED32_LIST_PACKED(45, r13, r11),
    SFIXED64_LIST_PACKED(46, r13, r8),
    SINT32_LIST_PACKED(47, r13, zzii.INT),
    SINT64_LIST_PACKED(48, r13, r8),
    GROUP_LIST(49, r7, r14),
    MAP(50, zzhr.MAP, zzii.VOID);
    
    private static final zzhp[] i0 = new zzhp[51];
    private final zzii zzaz;
    private final int zzba;
    private final zzhr zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        zzhr zzhr = zzhr.SCALAR;
        zzii zzii = zzii.DOUBLE;
        zzii zzii2 = zzii.FLOAT;
        zzii zzii3 = zzii.LONG;
        zzii zzii4 = zzii.INT;
        zzii zzii5 = zzii.BOOLEAN;
        zzii zzii6 = zzii.STRING;
        zzii zzii7 = zzii.MESSAGE;
        zzii zzii8 = zzii.BYTE_STRING;
        zzii zzii9 = zzii.ENUM;
        zzhr zzhr2 = zzhr.VECTOR;
        zzhr zzhr3 = zzhr.PACKED_VECTOR;
        zzii zzii10 = zzii.LONG;
        zzhp[] values = values();
        for (zzhp zzhp : values) {
            i0[zzhp.zzba] = zzhp;
        }
    }

    private zzhp(int i, zzhr zzhr, zzii zzii) {
        int i2;
        this.zzba = i;
        this.zzbb = zzhr;
        this.zzaz = zzii;
        int i3 = c4.a[zzhr.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzbc = zzii.d();
        } else if (i3 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = zzii.d();
        }
        this.zzbd = (zzhr != zzhr.SCALAR || (i2 = c4.b[zzii.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    public final int a() {
        return this.zzba;
    }
}
