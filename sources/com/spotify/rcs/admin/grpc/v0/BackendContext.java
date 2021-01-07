package com.spotify.rcs.admin.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.rcs.admin.grpc.v0.DynamicContext;
import java.io.IOException;

public final class BackendContext extends GeneratedMessageLite<BackendContext, b> implements Object {
    private static final BackendContext o;
    private static volatile x<BackendContext> p;
    private String a = "";
    private String b = "";
    private StaticContext c;
    private DynamicContext f;
    private SurfaceMetadata n;

    public static final class StaticContext extends GeneratedMessageLite<StaticContext, a> implements Object {
        private static final StaticContext c;
        private static volatile x<StaticContext> f;
        private String a = "";
        private String b = "";

        public static final class a extends GeneratedMessageLite.b<StaticContext, a> implements Object {
            private a() {
                super(StaticContext.c);
            }
        }

        static {
            StaticContext staticContext = new StaticContext();
            c = staticContext;
            staticContext.makeImmutable();
        }

        private StaticContext() {
        }

        public static x<StaticContext> parser() {
            return c.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return c;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    StaticContext staticContext = (StaticContext) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !staticContext.a.isEmpty(), staticContext.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ staticContext.b.isEmpty(), staticContext.b);
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
                                } else if (B == 18) {
                                    this.b = gVar.A();
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
                    return new StaticContext();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (StaticContext.class) {
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
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.a);
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.P(2, this.b);
            }
        }
    }

    public static final class SurfaceMetadata extends GeneratedMessageLite<SurfaceMetadata, a> implements Object {
        private static final SurfaceMetadata b;
        private static volatile x<SurfaceMetadata> c;
        private String a = "";

        public static final class a extends GeneratedMessageLite.b<SurfaceMetadata, a> implements Object {
            private a() {
                super(SurfaceMetadata.b);
            }
        }

        static {
            SurfaceMetadata surfaceMetadata = new SurfaceMetadata();
            b = surfaceMetadata;
            surfaceMetadata.makeImmutable();
        }

        private SurfaceMetadata() {
        }

        public static x<SurfaceMetadata> parser() {
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
                    SurfaceMetadata surfaceMetadata = (SurfaceMetadata) obj2;
                    this.a = ((GeneratedMessageLite.h) obj).n(!this.a.isEmpty(), this.a, true ^ surfaceMetadata.a.isEmpty(), surfaceMetadata.a);
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
                    return new SurfaceMetadata();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (SurfaceMetadata.class) {
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

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<BackendContext, b> implements Object {
        private b() {
            super(BackendContext.o);
        }
    }

    static {
        BackendContext backendContext = new BackendContext();
        o = backendContext;
        backendContext.makeImmutable();
    }

    private BackendContext() {
    }

    public static x<BackendContext> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                BackendContext backendContext = (BackendContext) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !backendContext.a.isEmpty(), backendContext.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ backendContext.b.isEmpty(), backendContext.b);
                this.c = (StaticContext) hVar.i(this.c, backendContext.c);
                this.f = (DynamicContext) hVar.i(this.f, backendContext.f);
                this.n = (SurfaceMetadata) hVar.i(this.n, backendContext.n);
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
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                StaticContext staticContext = this.c;
                                StaticContext.a aVar = staticContext != null ? (StaticContext.a) staticContext.toBuilder() : null;
                                StaticContext staticContext2 = (StaticContext) gVar.o(StaticContext.parser(), kVar);
                                this.c = staticContext2;
                                if (aVar != null) {
                                    aVar.mergeFrom((StaticContext.a) staticContext2);
                                    this.c = (StaticContext) aVar.buildPartial();
                                }
                            } else if (B == 34) {
                                DynamicContext dynamicContext = this.f;
                                DynamicContext.b bVar = dynamicContext != null ? (DynamicContext.b) dynamicContext.toBuilder() : null;
                                DynamicContext dynamicContext2 = (DynamicContext) gVar.o(DynamicContext.parser(), kVar);
                                this.f = dynamicContext2;
                                if (bVar != null) {
                                    bVar.mergeFrom((DynamicContext.b) dynamicContext2);
                                    this.f = (DynamicContext) bVar.buildPartial();
                                }
                            } else if (B == 82) {
                                SurfaceMetadata surfaceMetadata = this.n;
                                SurfaceMetadata.a aVar2 = surfaceMetadata != null ? (SurfaceMetadata.a) surfaceMetadata.toBuilder() : null;
                                SurfaceMetadata surfaceMetadata2 = (SurfaceMetadata) gVar.o(SurfaceMetadata.parser(), kVar);
                                this.n = surfaceMetadata2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((SurfaceMetadata.a) surfaceMetadata2);
                                    this.n = (SurfaceMetadata) aVar2.buildPartial();
                                }
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
                return new BackendContext();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (BackendContext.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
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
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        StaticContext staticContext = this.c;
        if (staticContext != null) {
            i2 += CodedOutputStream.n(3, staticContext);
        }
        DynamicContext dynamicContext = this.f;
        if (dynamicContext != null) {
            i2 += CodedOutputStream.n(4, dynamicContext);
        }
        SurfaceMetadata surfaceMetadata = this.n;
        if (surfaceMetadata != null) {
            i2 += CodedOutputStream.n(10, surfaceMetadata);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        StaticContext staticContext = this.c;
        if (staticContext != null) {
            codedOutputStream.M(3, staticContext);
        }
        DynamicContext dynamicContext = this.f;
        if (dynamicContext != null) {
            codedOutputStream.M(4, dynamicContext);
        }
        SurfaceMetadata surfaceMetadata = this.n;
        if (surfaceMetadata != null) {
            codedOutputStream.M(10, surfaceMetadata);
        }
    }
}
