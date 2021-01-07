package com.spotify.ucs.proto.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import java.io.IOException;

public final class UcsRequest extends GeneratedMessageLite<UcsRequest, b> implements Object {
    private static final UcsRequest f;
    private static volatile x<UcsRequest> n;
    private CallerInfo a;
    private ResolveRequest b;
    private AccountAttributesRequest c;

    public static final class AccountAttributesRequest extends GeneratedMessageLite<AccountAttributesRequest, a> implements Object {
        private static final AccountAttributesRequest a;
        private static volatile x<AccountAttributesRequest> b;

        public static final class a extends GeneratedMessageLite.b<AccountAttributesRequest, a> implements Object {
            private a() {
                super(AccountAttributesRequest.a);
            }
        }

        static {
            AccountAttributesRequest accountAttributesRequest = new AccountAttributesRequest();
            a = accountAttributesRequest;
            accountAttributesRequest.makeImmutable();
        }

        private AccountAttributesRequest() {
        }

        public static a h() {
            return (a) a.toBuilder();
        }

        public static x<AccountAttributesRequest> parser() {
            return a.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return a;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    AccountAttributesRequest accountAttributesRequest = (AccountAttributesRequest) obj2;
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B == 0 || !gVar.F(B)) {
                                z = true;
                            }
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
                    return new AccountAttributesRequest();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (b == null) {
                        synchronized (AccountAttributesRequest.class) {
                            if (b == null) {
                                b = new GeneratedMessageLite.c(a);
                            }
                        }
                    }
                    return b;
                default:
                    throw new UnsupportedOperationException();
            }
            return a;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
        }
    }

    public static final class CallerInfo extends GeneratedMessageLite<CallerInfo, a> implements Object {
        private static final CallerInfo f;
        private static volatile x<CallerInfo> n;
        private String a = "";
        private String b = "";
        private String c = "";

        public static final class a extends GeneratedMessageLite.b<CallerInfo, a> implements Object {
            public a m(String str) {
                copyOnWrite();
                CallerInfo.l((CallerInfo) this.instance, str);
                return this;
            }

            public a n(String str) {
                copyOnWrite();
                CallerInfo.i((CallerInfo) this.instance, str);
                return this;
            }

            public a o(String str) {
                copyOnWrite();
                CallerInfo.h((CallerInfo) this.instance, str);
                return this;
            }

            private a() {
                super(CallerInfo.f);
            }
        }

        static {
            CallerInfo callerInfo = new CallerInfo();
            f = callerInfo;
            callerInfo.makeImmutable();
        }

        private CallerInfo() {
        }

        static void h(CallerInfo callerInfo, String str) {
            callerInfo.getClass();
            str.getClass();
            callerInfo.a = str;
        }

        static void i(CallerInfo callerInfo, String str) {
            callerInfo.getClass();
            str.getClass();
            callerInfo.b = str;
        }

        static void l(CallerInfo callerInfo, String str) {
            callerInfo.getClass();
            str.getClass();
            callerInfo.c = str;
        }

        public static a m() {
            return (a) f.toBuilder();
        }

        public static x<CallerInfo> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    CallerInfo callerInfo = (CallerInfo) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !callerInfo.a.isEmpty(), callerInfo.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, !callerInfo.b.isEmpty(), callerInfo.b);
                    this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ callerInfo.c.isEmpty(), callerInfo.c);
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
                                    this.c = gVar.A();
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
                    return new CallerInfo();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (CallerInfo.class) {
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
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.a);
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            if (!this.c.isEmpty()) {
                i2 += CodedOutputStream.p(3, this.c);
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
            if (!this.c.isEmpty()) {
                codedOutputStream.P(3, this.c);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<UcsRequest, b> implements Object {
        public b m(AccountAttributesRequest.a aVar) {
            copyOnWrite();
            UcsRequest.l((UcsRequest) this.instance, aVar);
            return this;
        }

        public b n(CallerInfo.a aVar) {
            copyOnWrite();
            UcsRequest.h((UcsRequest) this.instance, aVar);
            return this;
        }

        public b o(ResolveRequest resolveRequest) {
            copyOnWrite();
            UcsRequest.i((UcsRequest) this.instance, resolveRequest);
            return this;
        }

        private b() {
            super(UcsRequest.f);
        }
    }

    static {
        UcsRequest ucsRequest = new UcsRequest();
        f = ucsRequest;
        ucsRequest.makeImmutable();
    }

    private UcsRequest() {
    }

    static void h(UcsRequest ucsRequest, CallerInfo.a aVar) {
        ucsRequest.getClass();
        ucsRequest.a = (CallerInfo) aVar.build();
    }

    static void i(UcsRequest ucsRequest, ResolveRequest resolveRequest) {
        ucsRequest.getClass();
        resolveRequest.getClass();
        ucsRequest.b = resolveRequest;
    }

    static void l(UcsRequest ucsRequest, AccountAttributesRequest.a aVar) {
        ucsRequest.getClass();
        ucsRequest.c = (AccountAttributesRequest) aVar.build();
    }

    public static b m() {
        return (b) f.toBuilder();
    }

    public static x<UcsRequest> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                UcsRequest ucsRequest = (UcsRequest) obj2;
                this.a = (CallerInfo) hVar.i(this.a, ucsRequest.a);
                this.b = (ResolveRequest) hVar.i(this.b, ucsRequest.b);
                this.c = (AccountAttributesRequest) hVar.i(this.c, ucsRequest.c);
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
                                CallerInfo callerInfo = this.a;
                                CallerInfo.a aVar = callerInfo != null ? (CallerInfo.a) callerInfo.toBuilder() : null;
                                CallerInfo callerInfo2 = (CallerInfo) gVar.o(CallerInfo.parser(), kVar);
                                this.a = callerInfo2;
                                if (aVar != null) {
                                    aVar.mergeFrom((CallerInfo.a) callerInfo2);
                                    this.a = (CallerInfo) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                ResolveRequest resolveRequest = this.b;
                                ResolveRequest.b bVar = resolveRequest != null ? (ResolveRequest.b) resolveRequest.toBuilder() : null;
                                ResolveRequest resolveRequest2 = (ResolveRequest) gVar.o(ResolveRequest.parser(), kVar);
                                this.b = resolveRequest2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ResolveRequest.b) resolveRequest2);
                                    this.b = (ResolveRequest) bVar.buildPartial();
                                }
                            } else if (B == 26) {
                                AccountAttributesRequest accountAttributesRequest = this.c;
                                AccountAttributesRequest.a aVar2 = accountAttributesRequest != null ? (AccountAttributesRequest.a) accountAttributesRequest.toBuilder() : null;
                                AccountAttributesRequest accountAttributesRequest2 = (AccountAttributesRequest) gVar.o(AccountAttributesRequest.parser(), kVar);
                                this.c = accountAttributesRequest2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((AccountAttributesRequest.a) accountAttributesRequest2);
                                    this.c = (AccountAttributesRequest) aVar2.buildPartial();
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
                return new UcsRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (UcsRequest.class) {
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
        CallerInfo callerInfo = this.a;
        if (callerInfo != null) {
            i2 = 0 + CodedOutputStream.n(1, callerInfo);
        }
        ResolveRequest resolveRequest = this.b;
        if (resolveRequest != null) {
            i2 += CodedOutputStream.n(2, resolveRequest);
        }
        AccountAttributesRequest accountAttributesRequest = this.c;
        if (accountAttributesRequest != null) {
            i2 += CodedOutputStream.n(3, accountAttributesRequest);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        CallerInfo callerInfo = this.a;
        if (callerInfo != null) {
            codedOutputStream.M(1, callerInfo);
        }
        ResolveRequest resolveRequest = this.b;
        if (resolveRequest != null) {
            codedOutputStream.M(2, resolveRequest);
        }
        AccountAttributesRequest accountAttributesRequest = this.c;
        if (accountAttributesRequest != null) {
            codedOutputStream.M(3, accountAttributesRequest);
        }
    }
}
