package com.spotify.rcs.resolver.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.rcs.admin.grpc.v0.PropertyDefinition$Identifier;
import java.io.IOException;
import java.util.List;

public final class Configuration extends GeneratedMessageLite<Configuration, b> implements Object {
    private static final Configuration n;
    private static volatile x<Configuration> o;
    private int a;
    private String b = "";
    private long c;
    private o.i<AssignedValue> f = GeneratedMessageLite.emptyProtobufList();

    public static final class AssignedValue extends GeneratedMessageLite<AssignedValue, a> implements Object {
        private static final AssignedValue n;
        private static volatile x<AssignedValue> o;
        private int a = 0;
        private Object b;
        private PropertyDefinition$Identifier c;
        private Metadata f;

        public static final class BoolValue extends GeneratedMessageLite<BoolValue, a> implements Object {
            private static final BoolValue b;
            private static volatile x<BoolValue> c;
            private boolean a;

            public static final class a extends GeneratedMessageLite.b<BoolValue, a> implements Object {
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

            public static BoolValue h() {
                return b;
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

            public boolean i() {
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

            public static EnumValue h() {
                return b;
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

            public String i() {
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

            public static IntValue h() {
                return b;
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

            public int i() {
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

        public static final class Metadata extends GeneratedMessageLite<Metadata, a> implements Object {
            private static final Metadata f;
            private static volatile x<Metadata> n;
            private long a;
            private String b = "";
            private long c;

            public static final class a extends GeneratedMessageLite.b<Metadata, a> implements Object {
                private a() {
                    super(Metadata.f);
                }
            }

            static {
                Metadata metadata = new Metadata();
                f = metadata;
                metadata.makeImmutable();
            }

            private Metadata() {
            }

            public static Metadata h() {
                return f;
            }

            public static x<Metadata> parser() {
                return f.getParserForType();
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            /* access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return f;
                    case 1:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        Metadata metadata = (Metadata) obj2;
                        long j = this.a;
                        boolean z2 = j != 0;
                        long j2 = metadata.a;
                        this.a = hVar.s(z2, j, j2 != 0, j2);
                        this.b = hVar.n(!this.b.isEmpty(), this.b, !metadata.b.isEmpty(), metadata.b);
                        long j3 = this.c;
                        boolean z3 = j3 != 0;
                        long j4 = metadata.c;
                        this.c = hVar.s(z3, j3, j4 != 0, j4);
                        return this;
                    case 2:
                        g gVar = (g) obj;
                        k kVar = (k) obj2;
                        while (!z) {
                            try {
                                int B = gVar.B();
                                if (B != 0) {
                                    if (B == 8) {
                                        this.a = gVar.w();
                                    } else if (B == 18) {
                                        this.b = gVar.A();
                                    } else if (B == 24) {
                                        this.c = gVar.w();
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
                        return new Metadata();
                    case 5:
                        return new a();
                    case 6:
                        break;
                    case 7:
                        if (n == null) {
                            synchronized (Metadata.class) {
                                if (n == null) {
                                    n = new GeneratedMessageLite.c(f);
                                }
                            }
                        }
                        return n;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f;
            }

            @Override // com.google.protobuf.u
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                long j = this.a;
                if (j != 0) {
                    i2 = 0 + CodedOutputStream.l(1, j);
                }
                if (!this.b.isEmpty()) {
                    i2 += CodedOutputStream.p(2, this.b);
                }
                long j2 = this.c;
                if (j2 != 0) {
                    i2 += CodedOutputStream.l(3, j2);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public long i() {
                return this.c;
            }

            @Override // com.google.protobuf.u
            public void writeTo(CodedOutputStream codedOutputStream) {
                long j = this.a;
                if (j != 0) {
                    codedOutputStream.U(1, j);
                }
                if (!this.b.isEmpty()) {
                    codedOutputStream.P(2, this.b);
                }
                long j2 = this.c;
                if (j2 != 0) {
                    codedOutputStream.U(3, j2);
                }
            }
        }

        public enum StructuredValueCase implements o.c {
            BOOL_VALUE(3),
            INT_VALUE(4),
            ENUM_VALUE(5),
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

        public static final class a extends GeneratedMessageLite.b<AssignedValue, a> implements Object {
            private a() {
                super(AssignedValue.n);
            }
        }

        static {
            AssignedValue assignedValue = new AssignedValue();
            n = assignedValue;
            assignedValue.makeImmutable();
        }

        private AssignedValue() {
        }

        public static x<AssignedValue> parser() {
            return n.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            boolean z = true;
            boolean z2 = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return n;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    AssignedValue assignedValue = (AssignedValue) obj2;
                    this.c = (PropertyDefinition$Identifier) hVar.i(this.c, assignedValue.c);
                    this.f = (Metadata) hVar.i(this.f, assignedValue.f);
                    int ordinal = assignedValue.o().ordinal();
                    if (ordinal == 0) {
                        if (this.a != 3) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, assignedValue.b);
                    } else if (ordinal == 1) {
                        if (this.a != 4) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, assignedValue.b);
                    } else if (ordinal == 2) {
                        if (this.a != 5) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, assignedValue.b);
                    } else if (ordinal == 3) {
                        if (this.a == 0) {
                            z = false;
                        }
                        hVar.b(z);
                    }
                    if (hVar == GeneratedMessageLite.g.a && (i = assignedValue.a) != 0) {
                        this.a = i;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z2) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    PropertyDefinition$Identifier propertyDefinition$Identifier = this.c;
                                    PropertyDefinition$Identifier.a aVar = propertyDefinition$Identifier != null ? (PropertyDefinition$Identifier.a) propertyDefinition$Identifier.toBuilder() : null;
                                    PropertyDefinition$Identifier propertyDefinition$Identifier2 = (PropertyDefinition$Identifier) gVar.o(PropertyDefinition$Identifier.parser(), kVar);
                                    this.c = propertyDefinition$Identifier2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((PropertyDefinition$Identifier.a) propertyDefinition$Identifier2);
                                        this.c = (PropertyDefinition$Identifier) aVar.buildPartial();
                                    }
                                } else if (B == 18) {
                                    Metadata metadata = this.f;
                                    Metadata.a aVar2 = metadata != null ? (Metadata.a) metadata.toBuilder() : null;
                                    Metadata metadata2 = (Metadata) gVar.o(Metadata.parser(), kVar);
                                    this.f = metadata2;
                                    if (aVar2 != null) {
                                        aVar2.mergeFrom((Metadata.a) metadata2);
                                        this.f = (Metadata) aVar2.buildPartial();
                                    }
                                } else if (B == 26) {
                                    BoolValue.a aVar3 = this.a == 3 ? (BoolValue.a) ((BoolValue) this.b).toBuilder() : null;
                                    u o2 = gVar.o(BoolValue.parser(), kVar);
                                    this.b = o2;
                                    if (aVar3 != null) {
                                        aVar3.mergeFrom((BoolValue.a) ((BoolValue) o2));
                                        this.b = aVar3.buildPartial();
                                    }
                                    this.a = 3;
                                } else if (B == 34) {
                                    IntValue.a aVar4 = this.a == 4 ? (IntValue.a) ((IntValue) this.b).toBuilder() : null;
                                    u o3 = gVar.o(IntValue.parser(), kVar);
                                    this.b = o3;
                                    if (aVar4 != null) {
                                        aVar4.mergeFrom((IntValue.a) ((IntValue) o3));
                                        this.b = aVar4.buildPartial();
                                    }
                                    this.a = 4;
                                } else if (B == 42) {
                                    EnumValue.a aVar5 = this.a == 5 ? (EnumValue.a) ((EnumValue) this.b).toBuilder() : null;
                                    u o4 = gVar.o(EnumValue.parser(), kVar);
                                    this.b = o4;
                                    if (aVar5 != null) {
                                        aVar5.mergeFrom((EnumValue.a) ((EnumValue) o4));
                                        this.b = aVar5.buildPartial();
                                    }
                                    this.a = 5;
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z2 = true;
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
                    return new AssignedValue();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (o == null) {
                        synchronized (AssignedValue.class) {
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
            if (this.c != null) {
                i2 = 0 + CodedOutputStream.n(1, n());
            }
            if (this.f != null) {
                i2 += CodedOutputStream.n(2, m());
            }
            if (this.a == 3) {
                i2 += CodedOutputStream.n(3, (BoolValue) this.b);
            }
            if (this.a == 4) {
                i2 += CodedOutputStream.n(4, (IntValue) this.b);
            }
            if (this.a == 5) {
                i2 += CodedOutputStream.n(5, (EnumValue) this.b);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public BoolValue h() {
            if (this.a == 3) {
                return (BoolValue) this.b;
            }
            return BoolValue.h();
        }

        public EnumValue i() {
            if (this.a == 5) {
                return (EnumValue) this.b;
            }
            return EnumValue.h();
        }

        public IntValue l() {
            if (this.a == 4) {
                return (IntValue) this.b;
            }
            return IntValue.h();
        }

        public Metadata m() {
            Metadata metadata = this.f;
            return metadata == null ? Metadata.h() : metadata;
        }

        public PropertyDefinition$Identifier n() {
            PropertyDefinition$Identifier propertyDefinition$Identifier = this.c;
            return propertyDefinition$Identifier == null ? PropertyDefinition$Identifier.h() : propertyDefinition$Identifier;
        }

        public StructuredValueCase o() {
            int i = this.a;
            if (i == 0) {
                return StructuredValueCase.STRUCTUREDVALUE_NOT_SET;
            }
            if (i == 3) {
                return StructuredValueCase.BOOL_VALUE;
            }
            if (i == 4) {
                return StructuredValueCase.INT_VALUE;
            }
            if (i != 5) {
                return null;
            }
            return StructuredValueCase.ENUM_VALUE;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.c != null) {
                codedOutputStream.M(1, n());
            }
            if (this.f != null) {
                codedOutputStream.M(2, m());
            }
            if (this.a == 3) {
                codedOutputStream.M(3, (BoolValue) this.b);
            }
            if (this.a == 4) {
                codedOutputStream.M(4, (IntValue) this.b);
            }
            if (this.a == 5) {
                codedOutputStream.M(5, (EnumValue) this.b);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Configuration, b> implements Object {
        private b() {
            super(Configuration.n);
        }
    }

    static {
        Configuration configuration = new Configuration();
        n = configuration;
        configuration.makeImmutable();
    }

    private Configuration() {
    }

    public static Configuration l() {
        return n;
    }

    public static x<Configuration> parser() {
        return n.getParserForType();
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
                Configuration configuration = (Configuration) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !configuration.b.isEmpty(), configuration.b);
                long j = this.c;
                boolean z2 = j != 0;
                long j2 = configuration.c;
                this.c = hVar.s(z2, j, j2 != 0, j2);
                this.f = hVar.q(this.f, configuration.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= configuration.a;
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
                                this.b = gVar.A();
                            } else if (B == 16) {
                                this.c = gVar.w();
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(AssignedValue.parser(), kVar));
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
                this.f.C();
                return null;
            case 4:
                return new Configuration();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (Configuration.class) {
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
        int p = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        long j = this.c;
        if (j != 0) {
            p += CodedOutputStream.l(2, j);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            p += CodedOutputStream.n(3, this.f.get(i2));
        }
        this.memoizedSerializedSize = p;
        return p;
    }

    public List<AssignedValue> h() {
        return this.f;
    }

    public String i() {
        return this.b;
    }

    public long m() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        long j = this.c;
        if (j != 0) {
            codedOutputStream.U(2, j);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
    }
}
