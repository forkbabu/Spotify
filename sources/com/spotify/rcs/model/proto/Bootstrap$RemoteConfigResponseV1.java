package com.spotify.rcs.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.rcs.model.proto.GranularConfiguration;
import java.io.IOException;

public final class Bootstrap$RemoteConfigResponseV1 extends GeneratedMessageLite<Bootstrap$RemoteConfigResponseV1, a> implements Object {
    private static final Bootstrap$RemoteConfigResponseV1 c;
    private static volatile x<Bootstrap$RemoteConfigResponseV1> f;
    private int a = 0;
    private Object b;

    public static final class RemoteConfigError extends GeneratedMessageLite<RemoteConfigError, a> implements Object {
        private static final RemoteConfigError c;
        private static volatile x<RemoteConfigError> f;
        private int a;
        private String b = "";

        public static final class a extends GeneratedMessageLite.b<RemoteConfigError, a> implements Object {
            private a() {
                super(RemoteConfigError.c);
            }
        }

        static {
            RemoteConfigError remoteConfigError = new RemoteConfigError();
            c = remoteConfigError;
            remoteConfigError.makeImmutable();
        }

        private RemoteConfigError() {
        }

        public static RemoteConfigError h() {
            return c;
        }

        public static x<RemoteConfigError> parser() {
            return c.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return c;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    RemoteConfigError remoteConfigError = (RemoteConfigError) obj2;
                    int i = this.a;
                    boolean z2 = i != 0;
                    int i2 = remoteConfigError.a;
                    if (i2 != 0) {
                        z = true;
                    }
                    this.a = hVar.m(z2, i, z, i2);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ remoteConfigError.b.isEmpty(), remoteConfigError.b);
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
                    return new RemoteConfigError();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (RemoteConfigError.class) {
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
            int i3 = this.a;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.j(1, i3);
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public int i() {
            return this.a;
        }

        public String l() {
            return this.b;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i = this.a;
            if (i != 0) {
                codedOutputStream.K(1, i);
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.P(2, this.b);
            }
        }
    }

    public static final class RemoteConfigSuccess extends GeneratedMessageLite<RemoteConfigSuccess, a> implements Object {
        private static final RemoteConfigSuccess b;
        private static volatile x<RemoteConfigSuccess> c;
        private GranularConfiguration a;

        public static final class a extends GeneratedMessageLite.b<RemoteConfigSuccess, a> implements Object {
            private a() {
                super(RemoteConfigSuccess.b);
            }
        }

        static {
            RemoteConfigSuccess remoteConfigSuccess = new RemoteConfigSuccess();
            b = remoteConfigSuccess;
            remoteConfigSuccess.makeImmutable();
        }

        private RemoteConfigSuccess() {
        }

        public static RemoteConfigSuccess i() {
            return b;
        }

        public static x<RemoteConfigSuccess> parser() {
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
                    this.a = (GranularConfiguration) ((GeneratedMessageLite.h) obj).i(this.a, ((RemoteConfigSuccess) obj2).a);
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
                                    GranularConfiguration granularConfiguration = this.a;
                                    GranularConfiguration.b bVar = granularConfiguration != null ? (GranularConfiguration.b) granularConfiguration.toBuilder() : null;
                                    GranularConfiguration granularConfiguration2 = (GranularConfiguration) gVar.o(GranularConfiguration.parser(), kVar);
                                    this.a = granularConfiguration2;
                                    if (bVar != null) {
                                        bVar.mergeFrom((GranularConfiguration.b) granularConfiguration2);
                                        this.a = (GranularConfiguration) bVar.buildPartial();
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
                    return new RemoteConfigSuccess();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (RemoteConfigSuccess.class) {
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
            if (this.a != null) {
                i2 = 0 + CodedOutputStream.n(1, h());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public GranularConfiguration h() {
            GranularConfiguration granularConfiguration = this.a;
            return granularConfiguration == null ? GranularConfiguration.h() : granularConfiguration;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a != null) {
                codedOutputStream.M(1, h());
            }
        }
    }

    public enum ResultCase implements o.c {
        SUCCESS(1),
        ERROR(2),
        RESULT_NOT_SET(0);
        
        private final int value;

        private ResultCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Bootstrap$RemoteConfigResponseV1, a> implements Object {
        private a() {
            super(Bootstrap$RemoteConfigResponseV1.c);
        }
    }

    static {
        Bootstrap$RemoteConfigResponseV1 bootstrap$RemoteConfigResponseV1 = new Bootstrap$RemoteConfigResponseV1();
        c = bootstrap$RemoteConfigResponseV1;
        bootstrap$RemoteConfigResponseV1.makeImmutable();
    }

    private Bootstrap$RemoteConfigResponseV1() {
    }

    public static Bootstrap$RemoteConfigResponseV1 h() {
        return c;
    }

    public static x<Bootstrap$RemoteConfigResponseV1> parser() {
        return c.getParserForType();
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
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Bootstrap$RemoteConfigResponseV1 bootstrap$RemoteConfigResponseV1 = (Bootstrap$RemoteConfigResponseV1) obj2;
                int ordinal = bootstrap$RemoteConfigResponseV1.l().ordinal();
                if (ordinal == 0) {
                    if (this.a != 1) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, bootstrap$RemoteConfigResponseV1.b);
                } else if (ordinal == 1) {
                    if (this.a != 2) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, bootstrap$RemoteConfigResponseV1.b);
                } else if (ordinal == 2) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = bootstrap$RemoteConfigResponseV1.a) != 0) {
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
                                RemoteConfigSuccess.a aVar = this.a == 1 ? (RemoteConfigSuccess.a) ((RemoteConfigSuccess) this.b).toBuilder() : null;
                                u o = gVar.o(RemoteConfigSuccess.parser(), kVar);
                                this.b = o;
                                if (aVar != null) {
                                    aVar.mergeFrom((RemoteConfigSuccess.a) ((RemoteConfigSuccess) o));
                                    this.b = aVar.buildPartial();
                                }
                                this.a = 1;
                            } else if (B == 18) {
                                RemoteConfigError.a aVar2 = this.a == 2 ? (RemoteConfigError.a) ((RemoteConfigError) this.b).toBuilder() : null;
                                u o2 = gVar.o(RemoteConfigError.parser(), kVar);
                                this.b = o2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((RemoteConfigError.a) ((RemoteConfigError) o2));
                                    this.b = aVar2.buildPartial();
                                }
                                this.a = 2;
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
                return new Bootstrap$RemoteConfigResponseV1();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Bootstrap$RemoteConfigResponseV1.class) {
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
            i2 = 0 + CodedOutputStream.n(1, (RemoteConfigSuccess) this.b);
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (RemoteConfigError) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public RemoteConfigError i() {
        if (this.a == 2) {
            return (RemoteConfigError) this.b;
        }
        return RemoteConfigError.h();
    }

    public ResultCase l() {
        int i = this.a;
        if (i == 0) {
            return ResultCase.RESULT_NOT_SET;
        }
        if (i == 1) {
            return ResultCase.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ResultCase.ERROR;
    }

    public RemoteConfigSuccess m() {
        if (this.a == 1) {
            return (RemoteConfigSuccess) this.b;
        }
        return RemoteConfigSuccess.i();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.M(1, (RemoteConfigSuccess) this.b);
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (RemoteConfigError) this.b);
        }
    }
}
