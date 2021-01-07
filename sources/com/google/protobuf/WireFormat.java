package com.google.protobuf;

public final class WireFormat {

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.a),
        ENUM(null),
        MESSAGE(null);
        
        private final Object defaultDefault;

        private JavaType(Object obj) {
            this.defaultDefault = obj;
        }
    }

    enum Utf8Validation {
        LOOSE {
            /* access modifiers changed from: package-private */
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            public Object d(g gVar) {
                return gVar.z();
            }
        },
        STRICT {
            /* access modifiers changed from: package-private */
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            public Object d(g gVar) {
                return gVar.A();
            }
        },
        LAZY {
            /* access modifiers changed from: package-private */
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            public Object d(g gVar) {
                return gVar.i();
            }
        };

        Utf8Validation(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract Object d(g gVar);
    }

    static Object a(g gVar, FieldType fieldType, Utf8Validation utf8Validation) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(gVar.j());
            case 1:
                return Float.valueOf(gVar.l());
            case 2:
                return Long.valueOf(gVar.w());
            case 3:
                return Long.valueOf(gVar.w());
            case 4:
                return Integer.valueOf(gVar.u());
            case 5:
                return Long.valueOf(gVar.t());
            case 6:
                return Integer.valueOf(gVar.s());
            case 7:
                return Boolean.valueOf(gVar.h());
            case 8:
                return utf8Validation.d(gVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return gVar.i();
            case 12:
                return Integer.valueOf(gVar.u());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(gVar.s());
            case 15:
                return Long.valueOf(gVar.t());
            case 16:
                return Integer.valueOf(gVar.y());
            case 17:
                long w = gVar.w();
                return Long.valueOf((-(w & 1)) ^ (w >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

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
    public enum FieldType {
        DOUBLE(JavaType.DOUBLE, 1),
        FLOAT(JavaType.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(JavaType.BOOLEAN, 0),
        STRING(JavaType.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(JavaType.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(JavaType.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        
        private final JavaType javaType;
        private final int wireType;

        static {
            JavaType javaType2 = JavaType.LONG;
            JavaType javaType3 = JavaType.INT;
            JavaType javaType4 = JavaType.MESSAGE;
        }

        private FieldType(JavaType javaType2, int i) {
            this.javaType = javaType2;
            this.wireType = i;
        }

        public JavaType d() {
            return this.javaType;
        }

        public int g() {
            return this.wireType;
        }

        FieldType(JavaType javaType2, int i, a aVar) {
            this.javaType = javaType2;
            this.wireType = i;
        }
    }
}
