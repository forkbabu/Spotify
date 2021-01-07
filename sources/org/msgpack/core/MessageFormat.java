package org.msgpack.core;

import org.msgpack.value.ValueType;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
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
public enum MessageFormat {
    POSFIXINT(r1),
    FIXMAP(r4),
    FIXARRAY(r7),
    FIXSTR(r10),
    NIL(ValueType.NIL),
    NEVER_USED(null),
    BOOLEAN(ValueType.BOOLEAN),
    BIN8(r15),
    BIN16(r15),
    BIN32(r15),
    EXT8(r15),
    EXT16(r15),
    EXT32(r15),
    FLOAT32(r9),
    FLOAT64(r9),
    UINT8(r1),
    UINT16(r1),
    UINT32(r1),
    UINT64(r1),
    INT8(r1),
    INT16(r1),
    INT32(r1),
    INT64(r1),
    FIXEXT1(r15),
    FIXEXT2(r15),
    FIXEXT4(r15),
    FIXEXT8(r15),
    FIXEXT16(r15),
    STR8(r10),
    STR16(r10),
    STR32(r10),
    ARRAY16(r7),
    ARRAY32(r7),
    MAP16(r4),
    MAP32(r4),
    NEGFIXINT(r1);
    
    private static final MessageFormat[] T = new MessageFormat[256];
    private final ValueType valueType;

    static {
        MessageFormat messageFormat;
        ValueType valueType2 = ValueType.INTEGER;
        ValueType valueType3 = ValueType.MAP;
        ValueType valueType4 = ValueType.ARRAY;
        ValueType valueType5 = ValueType.STRING;
        ValueType valueType6 = ValueType.BINARY;
        ValueType valueType7 = ValueType.EXTENSION;
        ValueType valueType8 = ValueType.FLOAT;
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & Byte.MIN_VALUE) == 0) {
                messageFormat = POSFIXINT;
            } else {
                int i2 = b & -32;
                if (i2 == -32) {
                    messageFormat = NEGFIXINT;
                } else if (i2 == -96) {
                    messageFormat = FIXSTR;
                } else if ((b & -16) == -112) {
                    messageFormat = FIXARRAY;
                } else if (i2 == -128) {
                    messageFormat = FIXMAP;
                } else {
                    switch (b) {
                        case -64:
                            messageFormat = NIL;
                            continue;
                        case -63:
                        default:
                            messageFormat = NEVER_USED;
                            continue;
                        case -62:
                        case -61:
                            messageFormat = BOOLEAN;
                            continue;
                        case -60:
                            messageFormat = BIN8;
                            continue;
                        case -59:
                            messageFormat = BIN16;
                            continue;
                        case -58:
                            messageFormat = BIN32;
                            continue;
                        case -57:
                            messageFormat = EXT8;
                            continue;
                        case -56:
                            messageFormat = EXT16;
                            continue;
                        case -55:
                            messageFormat = EXT32;
                            continue;
                        case -54:
                            messageFormat = FLOAT32;
                            continue;
                        case -53:
                            messageFormat = FLOAT64;
                            continue;
                        case -52:
                            messageFormat = UINT8;
                            continue;
                        case -51:
                            messageFormat = UINT16;
                            continue;
                        case -50:
                            messageFormat = UINT32;
                            continue;
                        case -49:
                            messageFormat = UINT64;
                            continue;
                        case -48:
                            messageFormat = INT8;
                            continue;
                        case -47:
                            messageFormat = INT16;
                            continue;
                        case -46:
                            messageFormat = INT32;
                            continue;
                        case -45:
                            messageFormat = INT64;
                            continue;
                        case -44:
                            messageFormat = FIXEXT1;
                            continue;
                        case -43:
                            messageFormat = FIXEXT2;
                            continue;
                        case -42:
                            messageFormat = FIXEXT4;
                            continue;
                        case -41:
                            messageFormat = FIXEXT8;
                            continue;
                        case -40:
                            messageFormat = FIXEXT16;
                            continue;
                        case -39:
                            messageFormat = STR8;
                            continue;
                        case -38:
                            messageFormat = STR16;
                            continue;
                        case -37:
                            messageFormat = STR32;
                            continue;
                        case -36:
                            messageFormat = ARRAY16;
                            continue;
                        case -35:
                            messageFormat = ARRAY32;
                            continue;
                        case -34:
                            messageFormat = MAP16;
                            continue;
                        case -33:
                            messageFormat = MAP32;
                            continue;
                    }
                }
            }
            T[i] = messageFormat;
        }
    }

    private MessageFormat(ValueType valueType2) {
        this.valueType = valueType2;
    }

    public static MessageFormat g(byte b) {
        return T[b & 255];
    }

    public ValueType d() {
        if (this != NEVER_USED) {
            return this.valueType;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }
}
