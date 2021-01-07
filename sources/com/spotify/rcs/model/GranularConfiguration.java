package com.spotify.rcs.model;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class GranularConfiguration extends GeneratedMessageLite<GranularConfiguration, b> implements Object {
    private static final GranularConfiguration n;
    private static volatile x<GranularConfiguration> o;
    private int a;
    private o.i<AssignedPropertyValue> b = GeneratedMessageLite.emptyProtobufList();
    private long c;
    private String f = "";

    public static final class AssignedPropertyValue extends GeneratedMessageLite<AssignedPropertyValue, a> implements Object {
        private static final AssignedPropertyValue q;
        private static volatile x<AssignedPropertyValue> r;
        private int a = 0;
        private Object b;
        private int c;
        private String f = "";
        private String n = "";
        private long o;
        private String p = "";

        public static final class BoolValue extends GeneratedMessageLite<BoolValue, a> implements Object {
            private static final BoolValue b;
            private static volatile x<BoolValue> c;
            private boolean a;

            public static final class a extends GeneratedMessageLite.b<BoolValue, a> implements Object {
                public a m(boolean z) {
                    copyOnWrite();
                    BoolValue.h((BoolValue) this.instance, z);
                    return this;
                }

                private a() {
                    super(BoolValue.b);
                }
            }

            static {
                BoolValue boolValue = new BoolValue();
                b = boolValue;
                boolValue.makeImmutable();
            }

            private BoolValue() {
            }

            static void h(BoolValue boolValue, boolean z) {
                boolValue.a = z;
            }

            public static BoolValue i() {
                return b;
            }

            public static a m() {
                return (a) b.toBuilder();
            }

            public static x<BoolValue> parser() {
                return b.getParserForType();
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            /* access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return b;
                    case 1:
                        boolean z = this.a;
                        boolean z2 = ((BoolValue) obj2).a;
                        this.a = ((GeneratedMessageLite.h) obj).f(z, z, z2, z2);
                        return this;
                    case 2:
                        g gVar = (g) obj;
                        k kVar = (k) obj2;
                        boolean z3 = false;
                        while (!z3) {
                            try {
                                int B = gVar.B();
                                if (B != 0) {
                                    if (B == 8) {
                                        this.a = gVar.h();
                                    } else if (!gVar.F(B)) {
                                    }
                                }
                                z3 = true;
                            } catch (InvalidProtocolBufferException e) {
                                e.d(this);
                                throw new RuntimeException(e);
                            } catch (IOException e2) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                                invalidProtocolBufferException.d(this);
                                throw new RuntimeException(invalidProtocolBufferException);
                            }
                        }
                        break;
                    case 3:
                        return null;
                    case 4:
                        return new BoolValue();
                    case 5:
                        return new a();
                    case 6:
                        break;
                    case 7:
                        if (c == null) {
                            synchronized (BoolValue.class) {
                                if (c == null) {
                                    c = new GeneratedMessageLite.c(b);
                                }
                            }
                        }
                        return c;
                    default:
                        throw new UnsupportedOperationException();
                }
                return b;
            }

            @Override // com.google.protobuf.u
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                boolean z = this.a;
                if (z) {
                    i2 = 0 + CodedOutputStream.d(1, z);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public boolean l() {
                return this.a;
            }

            @Override // com.google.protobuf.u
            public void writeTo(CodedOutputStream codedOutputStream) {
                boolean z = this.a;
                if (z) {
                    codedOutputStream.A(1, z);
                }
            }
        }

        public static final class EnumValue extends GeneratedMessageLite<EnumValue, a> implements Object {
            private static final EnumValue b;
            private static volatile x<EnumValue> c;
            private String a = "";

            public static final class a extends GeneratedMessageLite.b<EnumValue, a> implements Object {
                public a m(String str) {
                    copyOnWrite();
                    EnumValue.h((EnumValue) this.instance, str);
                    return this;
                }

                private a() {
                    super(EnumValue.b);
                }
            }

            static {
                EnumValue enumValue = new EnumValue();
                b = enumValue;
                enumValue.makeImmutable();
            }

            private EnumValue() {
            }

            static void h(EnumValue enumValue, String str) {
                enumValue.getClass();
                str.getClass();
                enumValue.a = str;
            }

            public static EnumValue i() {
                return b;
            }

            public static a m() {
                return (a) b.toBuilder();
            }

            public static x<EnumValue> parser() {
                return b.getParserForType();
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            /* access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return b;
                    case 1:
                        EnumValue enumValue = (EnumValue) obj2;
                        this.a = ((GeneratedMessageLite.h) obj).n(!this.a.isEmpty(), this.a, true ^ enumValue.a.isEmpty(), enumValue.a);
                        return this;
                    case 2:
                        g gVar = (g) obj;
                        k kVar = (k) obj2;
                        boolean z = false;
                        while (!z) {
                            try {
                                int B = gVar.B();
                                if (B != 0) {
                                    if (B == 10) {
                                        this.a = gVar.A();
                                    } else if (!gVar.F(B)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                e.d(this);
                                throw new RuntimeException(e);
                            } catch (IOException e2) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                                invalidProtocolBufferException.d(this);
                                throw new RuntimeException(invalidProtocolBufferException);
                            }
                        }
                        break;
                    case 3:
                        return null;
                    case 4:
                        return new EnumValue();
                    case 5:
                        return new a();
                    case 6:
                        break;
                    case 7:
                        if (c == null) {
                            synchronized (EnumValue.class) {
                                if (c == null) {
                                    c = new GeneratedMessageLite.c(b);
                                }
                            }
                        }
                        return c;
                    default:
                        throw new UnsupportedOperationException();
                }
                return b;
            }

            @Override // com.google.protobuf.u
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (!this.a.isEmpty()) {
                    i2 = 0 + CodedOutputStream.p(1, this.a);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public String l() {
                return this.a;
            }

            @Override // com.google.protobuf.u
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!this.a.isEmpty()) {
                    codedOutputStream.P(1, this.a);
                }
            }
        }

        public static final class IntValue extends GeneratedMessageLite<IntValue, a> implements Object {
            private static final IntValue b;
            private static volatile x<IntValue> c;
            private int a;

            public static final class a extends GeneratedMessageLite.b<IntValue, a> implements Object {
                public a m(int i) {
                    copyOnWrite();
                    IntValue.h((IntValue) this.instance, i);
                    return this;
                }

                private a() {
                    super(IntValue.b);
                }
            }

            static {
                IntValue intValue = new IntValue();
                b = intValue;
                intValue.makeImmutable();
            }

            private IntValue() {
            }

            static void h(IntValue intValue, int i) {
                intValue.a = i;
            }

            public static IntValue i() {
                return b;
            }

            public static a m() {
                return (a) b.toBuilder();
            }

            public static x<IntValue> parser() {
                return b.getParserForType();
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            /* access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return b;
                    case 1:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        IntValue intValue = (IntValue) obj2;
                        int i = this.a;
                        boolean z2 = i != 0;
                        int i2 = intValue.a;
                        if (i2 != 0) {
                            z = true;
                        }
                        this.a = hVar.m(z2, i, z, i2);
                        return this;
                    case 2:
                        g gVar = (g) obj;
                        k kVar = (k) obj2;
                        while (!z) {
                            try {
                                int B = gVar.B();
                                if (B != 0) {
                                    if (B == 8) {
                                        this.a = gVar.u();
                                    } else if (!gVar.F(B)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                e.d(this);
                                throw new RuntimeException(e);
                            } catch (IOException e2) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                                invalidProtocolBufferException.d(this);
                                throw new RuntimeException(invalidProtocolBufferException);
                            }
                        }
                        break;
                    case 3:
                        return null;
                    case 4:
                        return new IntValue();
                    case 5:
                        return new a();
                    case 6:
                        break;
                    case 7:
                        if (c == null) {
                            synchronized (IntValue.class) {
                                if (c == null) {
                                    c = new GeneratedMessageLite.c(b);
                                }
                            }
                        }
                        return c;
                    default:
                        throw new UnsupportedOperationException();
                }
                return b;
            }

            @Override // com.google.protobuf.u
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                int i3 = this.a;
                if (i3 != 0) {
                    i2 = 0 + CodedOutputStream.j(1, i3);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public int l() {
                return this.a;
            }

            @Override // com.google.protobuf.u
            public void writeTo(CodedOutputStream codedOutputStream) {
                int i = this.a;
                if (i != 0) {
                    codedOutputStream.K(1, i);
                }
            }
        }

        public enum StructuredValueCase implements o.c {
            BOOL_VALUE(1),
            INT_VALUE(2),
            ENUM_VALUE(3),
            STRUCTUREDVALUE_NOT_SET(0);
            
            private final int value;

            private StructuredValueCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<AssignedPropertyValue, a> implements Object {
            public a m(BoolValue.a aVar) {
                copyOnWrite();
                AssignedPropertyValue.m((AssignedPropertyValue) this.instance, aVar);
                return this;
            }

            public a n(String str) {
                copyOnWrite();
                AssignedPropertyValue.h((AssignedPropertyValue) this.instance, str);
                return this;
            }

            public a o(EnumValue.a aVar) {
                copyOnWrite();
                AssignedPropertyValue.o((AssignedPropertyValue) this.instance, aVar);
                return this;
            }

            public a p(long j) {
                copyOnWrite();
                AssignedPropertyValue.i((AssignedPropertyValue) this.instance, j);
                return this;
            }

            public a q(IntValue.a aVar) {
                copyOnWrite();
                AssignedPropertyValue.n((AssignedPropertyValue) this.instance, aVar);
                return this;
            }

            public a r(String str) {
                copyOnWrite();
                AssignedPropertyValue.l((AssignedPropertyValue) this.instance, str);
                return this;
            }

            private a() {
                super(AssignedPropertyValue.q);
            }
        }

        static {
            AssignedPropertyValue assignedPropertyValue = new AssignedPropertyValue();
            q = assignedPropertyValue;
            assignedPropertyValue.makeImmutable();
        }

        private AssignedPropertyValue() {
        }

        static void h(AssignedPropertyValue assignedPropertyValue, String str) {
            assignedPropertyValue.getClass();
            str.getClass();
            assignedPropertyValue.n = str;
        }

        static void i(AssignedPropertyValue assignedPropertyValue, long j) {
            assignedPropertyValue.o = j;
        }

        static void l(AssignedPropertyValue assignedPropertyValue, String str) {
            assignedPropertyValue.getClass();
            str.getClass();
            assignedPropertyValue.p = str;
        }

        static void m(AssignedPropertyValue assignedPropertyValue, BoolValue.a aVar) {
            assignedPropertyValue.getClass();
            assignedPropertyValue.b = aVar.build();
            assignedPropertyValue.a = 1;
        }

        static void n(AssignedPropertyValue assignedPropertyValue, IntValue.a aVar) {
            assignedPropertyValue.getClass();
            assignedPropertyValue.b = aVar.build();
            assignedPropertyValue.a = 2;
        }

        static void o(AssignedPropertyValue assignedPropertyValue, EnumValue.a aVar) {
            assignedPropertyValue.getClass();
            assignedPropertyValue.b = aVar.build();
            assignedPropertyValue.a = 3;
        }

        public static x<AssignedPropertyValue> parser() {
            return q.getParserForType();
        }

        public static a w() {
            return (a) q.toBuilder();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return q;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) obj2;
                    int i2 = this.c;
                    boolean z2 = i2 != 0;
                    int i3 = assignedPropertyValue.c;
                    this.c = hVar.m(z2, i2, i3 != 0, i3);
                    this.f = hVar.n(!this.f.isEmpty(), this.f, !assignedPropertyValue.f.isEmpty(), assignedPropertyValue.f);
                    this.n = hVar.n(!this.n.isEmpty(), this.n, !assignedPropertyValue.n.isEmpty(), assignedPropertyValue.n);
                    long j = this.o;
                    boolean z3 = j != 0;
                    long j2 = assignedPropertyValue.o;
                    this.o = hVar.s(z3, j, j2 != 0, j2);
                    this.p = hVar.n(!this.p.isEmpty(), this.p, !assignedPropertyValue.p.isEmpty(), assignedPropertyValue.p);
                    int ordinal = assignedPropertyValue.v().ordinal();
                    if (ordinal == 0) {
                        if (this.a == 1) {
                            z = true;
                        }
                        this.b = hVar.u(z, this.b, assignedPropertyValue.b);
                    } else if (ordinal == 1) {
                        if (this.a == 2) {
                            z = true;
                        }
                        this.b = hVar.u(z, this.b, assignedPropertyValue.b);
                    } else if (ordinal == 2) {
                        if (this.a == 3) {
                            z = true;
                        }
                        this.b = hVar.u(z, this.b, assignedPropertyValue.b);
                    } else if (ordinal == 3) {
                        if (this.a != 0) {
                            z = true;
                        }
                        hVar.b(z);
                    }
                    if (hVar == GeneratedMessageLite.g.a && (i = assignedPropertyValue.a) != 0) {
                        this.a = i;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    BoolValue.a aVar = this.a == 1 ? (BoolValue.a) ((BoolValue) this.b).toBuilder() : null;
                                    u o2 = gVar.o(BoolValue.parser(), kVar);
                                    this.b = o2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((BoolValue.a) ((BoolValue) o2));
                                        this.b = aVar.buildPartial();
                                    }
                                    this.a = 1;
                                } else if (B == 18) {
                                    IntValue.a aVar2 = this.a == 2 ? (IntValue.a) ((IntValue) this.b).toBuilder() : null;
                                    u o3 = gVar.o(IntValue.parser(), kVar);
                                    this.b = o3;
                                    if (aVar2 != null) {
                                        aVar2.mergeFrom((IntValue.a) ((IntValue) o3));
                                        this.b = aVar2.buildPartial();
                                    }
                                    this.a = 2;
                                } else if (B == 26) {
                                    EnumValue.a aVar3 = this.a == 3 ? (EnumValue.a) ((EnumValue) this.b).toBuilder() : null;
                                    u o4 = gVar.o(EnumValue.parser(), kVar);
                                    this.b = o4;
                                    if (aVar3 != null) {
                                        aVar3.mergeFrom((EnumValue.a) ((EnumValue) o4));
                                        this.b = aVar3.buildPartial();
                                    }
                                    this.a = 3;
                                } else if (B == 34) {
                                    this.f = gVar.A();
                                } else if (B == 42) {
                                    this.n = gVar.A();
                                } else if (B == 50) {
                                    this.p = gVar.A();
                                } else if (B == 56) {
                                    this.c = gVar.u();
                                } else if (B == 64) {
                                    this.o = gVar.w();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new AssignedPropertyValue();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (r == null) {
                        synchronized (AssignedPropertyValue.class) {
                            if (r == null) {
                                r = new GeneratedMessageLite.c(q);
                            }
                        }
                    }
                    return r;
                default:
                    throw new UnsupportedOperationException();
            }
            return q;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.a == 1) {
                i2 = 0 + CodedOutputStream.n(1, (BoolValue) this.b);
            }
            if (this.a == 2) {
                i2 += CodedOutputStream.n(2, (IntValue) this.b);
            }
            if (this.a == 3) {
                i2 += CodedOutputStream.n(3, (EnumValue) this.b);
            }
            if (!this.f.isEmpty()) {
                i2 += CodedOutputStream.p(4, this.f);
            }
            if (!this.n.isEmpty()) {
                i2 += CodedOutputStream.p(5, this.n);
            }
            if (!this.p.isEmpty()) {
                i2 += CodedOutputStream.p(6, this.p);
            }
            if (this.c != Platform.UNKNOWN.getNumber()) {
                i2 += CodedOutputStream.h(7, this.c);
            }
            long j = this.o;
            if (j != 0) {
                i2 += CodedOutputStream.l(8, j);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public BoolValue p() {
            if (this.a == 1) {
                return (BoolValue) this.b;
            }
            return BoolValue.i();
        }

        public String q() {
            return this.n;
        }

        public EnumValue r() {
            if (this.a == 3) {
                return (EnumValue) this.b;
            }
            return EnumValue.i();
        }

        public long s() {
            return this.o;
        }

        public IntValue t() {
            if (this.a == 2) {
                return (IntValue) this.b;
            }
            return IntValue.i();
        }

        public String u() {
            return this.p;
        }

        public StructuredValueCase v() {
            int i = this.a;
            if (i == 0) {
                return StructuredValueCase.STRUCTUREDVALUE_NOT_SET;
            }
            if (i == 1) {
                return StructuredValueCase.BOOL_VALUE;
            }
            if (i == 2) {
                return StructuredValueCase.INT_VALUE;
            }
            if (i != 3) {
                return null;
            }
            return StructuredValueCase.ENUM_VALUE;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a == 1) {
                codedOutputStream.M(1, (BoolValue) this.b);
            }
            if (this.a == 2) {
                codedOutputStream.M(2, (IntValue) this.b);
            }
            if (this.a == 3) {
                codedOutputStream.M(3, (EnumValue) this.b);
            }
            if (!this.f.isEmpty()) {
                codedOutputStream.P(4, this.f);
            }
            if (!this.n.isEmpty()) {
                codedOutputStream.P(5, this.n);
            }
            if (!this.p.isEmpty()) {
                codedOutputStream.P(6, this.p);
            }
            if (this.c != Platform.UNKNOWN.getNumber()) {
                codedOutputStream.K(7, this.c);
            }
            long j = this.o;
            if (j != 0) {
                codedOutputStream.U(8, j);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<GranularConfiguration, b> implements Object {
        public b m(Iterable<? extends AssignedPropertyValue> iterable) {
            copyOnWrite();
            GranularConfiguration.h((GranularConfiguration) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            GranularConfiguration.l((GranularConfiguration) this.instance, str);
            return this;
        }

        public b o(long j) {
            copyOnWrite();
            GranularConfiguration.i((GranularConfiguration) this.instance, j);
            return this;
        }

        private b() {
            super(GranularConfiguration.n);
        }
    }

    static {
        GranularConfiguration granularConfiguration = new GranularConfiguration();
        n = granularConfiguration;
        granularConfiguration.makeImmutable();
    }

    private GranularConfiguration() {
    }

    static void h(GranularConfiguration granularConfiguration, Iterable iterable) {
        if (!granularConfiguration.b.R0()) {
            granularConfiguration.b = GeneratedMessageLite.mutableCopy(granularConfiguration.b);
        }
        com.google.protobuf.a.addAll(iterable, granularConfiguration.b);
    }

    static void i(GranularConfiguration granularConfiguration, long j) {
        granularConfiguration.c = j;
    }

    static void l(GranularConfiguration granularConfiguration, String str) {
        granularConfiguration.getClass();
        str.getClass();
        granularConfiguration.f = str;
    }

    public static b p() {
        return (b) n.toBuilder();
    }

    public static x<GranularConfiguration> parser() {
        return n.getParserForType();
    }

    public static GranularConfiguration q(byte[] bArr) {
        return (GranularConfiguration) GeneratedMessageLite.parseFrom(n, bArr);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                GranularConfiguration granularConfiguration = (GranularConfiguration) obj2;
                this.b = hVar.q(this.b, granularConfiguration.b);
                long j = this.c;
                boolean z2 = j != 0;
                long j2 = granularConfiguration.c;
                this.c = hVar.s(z2, j, j2 != 0, j2);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ granularConfiguration.f.isEmpty(), granularConfiguration.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= granularConfiguration.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(AssignedPropertyValue.parser(), kVar));
                            } else if (B == 16) {
                                this.c = gVar.w();
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                this.b.C();
                return null;
            case 4:
                return new GranularConfiguration();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (GranularConfiguration.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        long j = this.c;
        if (j != 0) {
            i2 += CodedOutputStream.l(2, j);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String m() {
        return this.f;
    }

    public List<AssignedPropertyValue> n() {
        return this.b;
    }

    public long o() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        long j = this.c;
        if (j != 0) {
            codedOutputStream.U(2, j);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
    }
}
