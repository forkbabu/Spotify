package com.spotify.rcs.admin.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class DynamicContext extends GeneratedMessageLite<DynamicContext, b> implements Object {
    private static final DynamicContext b;
    private static volatile x<DynamicContext> c;
    private o.i<ContextDefinition> a = GeneratedMessageLite.emptyProtobufList();

    public static final class ContextDefinition extends GeneratedMessageLite<ContextDefinition, a> implements Object {
        private static final ContextDefinition c;
        private static volatile x<ContextDefinition> f;
        private int a = 0;
        private Object b;

        public enum ContextCase implements o.c {
            KNOWN_CONTEXT(1),
            CONTEXT_NOT_SET(0);
            
            private final int value;

            private ContextCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<ContextDefinition, a> implements Object {
            private a() {
                super(ContextDefinition.c);
            }
        }

        static {
            ContextDefinition contextDefinition = new ContextDefinition();
            c = contextDefinition;
            contextDefinition.makeImmutable();
        }

        private ContextDefinition() {
        }

        public static x<ContextDefinition> parser() {
            return c.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            boolean z = true;
            boolean z2 = false;
            ContextCase contextCase = null;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return c;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    ContextDefinition contextDefinition = (ContextDefinition) obj2;
                    int i2 = contextDefinition.a;
                    if (i2 == 0) {
                        contextCase = ContextCase.CONTEXT_NOT_SET;
                    } else if (i2 == 1) {
                        contextCase = ContextCase.KNOWN_CONTEXT;
                    }
                    int ordinal = contextCase.ordinal();
                    if (ordinal == 0) {
                        if (this.a != 1) {
                            z = false;
                        }
                        this.b = hVar.k(z, this.b, contextDefinition.b);
                    } else if (ordinal == 1) {
                        if (this.a == 0) {
                            z = false;
                        }
                        hVar.b(z);
                    }
                    if (hVar == GeneratedMessageLite.g.a && (i = contextDefinition.a) != 0) {
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
                                if (B == 8) {
                                    int u = gVar.u();
                                    this.a = 1;
                                    this.b = Integer.valueOf(u);
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
                    return new ContextDefinition();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (ContextDefinition.class) {
                            if (f == null) {
                                f = new GeneratedMessageLite.c(c);
                            }
                        }
                    }
                    return f;
                default:
                    throw new UnsupportedOperationException();
            }
            return c;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.a == 1) {
                i2 = 0 + CodedOutputStream.h(1, ((Integer) this.b).intValue());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a == 1) {
                codedOutputStream.K(1, ((Integer) this.b).intValue());
            }
        }
    }

    public enum KnownContext implements o.c {
        KNOWN_CONTEXT_INVALID(0),
        KNOWN_CONTEXT_USER_ID(1),
        KNOWN_CONTEXT_INSTALLATION_ID(2),
        KNOWN_CONTEXT_VERSION(3),
        UNRECOGNIZED(-1);
        
        private final int value;

        private KnownContext(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<DynamicContext, b> implements Object {
        private b() {
            super(DynamicContext.b);
        }
    }

    static {
        DynamicContext dynamicContext = new DynamicContext();
        b = dynamicContext;
        dynamicContext.makeImmutable();
    }

    private DynamicContext() {
    }

    public static x<DynamicContext> parser() {
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
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((DynamicContext) obj2).a);
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
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(ContextDefinition.parser(), kVar));
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
                this.a.C();
                return null;
            case 4:
                return new DynamicContext();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (DynamicContext.class) {
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
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
