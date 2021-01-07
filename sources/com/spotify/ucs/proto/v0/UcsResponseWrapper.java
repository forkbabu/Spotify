package com.spotify.ucs.proto.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.useraccount.v1.AccountAttribute;
import java.io.IOException;
import java.util.Map;

public final class UcsResponseWrapper extends GeneratedMessageLite<UcsResponseWrapper, b> implements Object {
    private static final UcsResponseWrapper c;
    private static volatile x<UcsResponseWrapper> f;
    private int a = 0;
    private Object b;

    public static final class AccountAttributesResponse extends GeneratedMessageLite<AccountAttributesResponse, b> implements Object {
        private static final AccountAttributesResponse b;
        private static volatile x<AccountAttributesResponse> c;
        private MapFieldLite<String, AccountAttribute> a = MapFieldLite.d();

        private static final class a {
            static final t<String, AccountAttribute> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, AccountAttribute.h());
        }

        public static final class b extends GeneratedMessageLite.b<AccountAttributesResponse, b> implements Object {
            private b() {
                super(AccountAttributesResponse.b);
            }
        }

        static {
            AccountAttributesResponse accountAttributesResponse = new AccountAttributesResponse();
            b = accountAttributesResponse;
            accountAttributesResponse.makeImmutable();
        }

        private AccountAttributesResponse() {
        }

        public static x<AccountAttributesResponse> parser() {
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
                    this.a = ((GeneratedMessageLite.h) obj).c(this.a, ((AccountAttributesResponse) obj2).a);
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
                                    if (!this.a.f()) {
                                        this.a = this.a.k();
                                    }
                                    a.a.d(this.a, gVar, kVar);
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
                    this.a.g();
                    return null;
                case 4:
                    return new AccountAttributesResponse();
                case 5:
                    return new b();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (AccountAttributesResponse.class) {
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
            for (Map.Entry<String, AccountAttribute> entry : this.a.entrySet()) {
                i2 = je.j1(entry, a.a, 1, entry.getKey(), i2);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (Map.Entry<String, AccountAttribute> entry : this.a.entrySet()) {
                a.a.e(codedOutputStream, 1, entry.getKey(), entry.getValue());
            }
        }
    }

    public static final class Error extends GeneratedMessageLite<Error, a> implements Object {
        private static final Error c;
        private static volatile x<Error> f;
        private int a;
        private String b = "";

        public static final class a extends GeneratedMessageLite.b<Error, a> implements Object {
            private a() {
                super(Error.c);
            }
        }

        static {
            Error error = new Error();
            c = error;
            error.makeImmutable();
        }

        private Error() {
        }

        public static Error h() {
            return c;
        }

        public static x<Error> parser() {
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
                    Error error = (Error) obj2;
                    int i = this.a;
                    boolean z2 = i != 0;
                    int i2 = error.a;
                    if (i2 != 0) {
                        z = true;
                    }
                    this.a = hVar.m(z2, i, z, i2);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ error.b.isEmpty(), error.b);
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
                    return new Error();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (Error.class) {
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

    public static final class UcsResponse extends GeneratedMessageLite<UcsResponse, a> implements Object {
        private static final UcsResponse o;
        private static volatile x<UcsResponse> p;
        private int a = 0;
        private Object b;
        private int c = 0;
        private Object f;
        private long n;

        public enum AccountAttributesResultCase implements o.c {
            ACCOUNT_ATTRIBUTES_SUCCESS(3),
            ACCOUNT_ATTRIBUTES_ERROR(4),
            ACCOUNTATTRIBUTESRESULT_NOT_SET(0);
            
            private final int value;

            private AccountAttributesResultCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public int getNumber() {
                return this.value;
            }
        }

        public enum ResolveResultCase implements o.c {
            RESOLVE_SUCCESS(1),
            RESOLVE_ERROR(2),
            RESOLVERESULT_NOT_SET(0);
            
            private final int value;

            private ResolveResultCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<UcsResponse, a> implements Object {
            private a() {
                super(UcsResponse.o);
            }
        }

        static {
            UcsResponse ucsResponse = new UcsResponse();
            o = ucsResponse;
            ucsResponse.makeImmutable();
        }

        private UcsResponse() {
        }

        public static UcsResponse h() {
            return o;
        }

        public static x<UcsResponse> parser() {
            return o.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            ResolveResultCase resolveResultCase;
            boolean z = false;
            AccountAttributesResultCase accountAttributesResultCase = null;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return o;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    UcsResponse ucsResponse = (UcsResponse) obj2;
                    long j = this.n;
                    boolean z2 = j != 0;
                    long j2 = ucsResponse.n;
                    this.n = hVar.s(z2, j, j2 != 0, j2);
                    int i = ucsResponse.a;
                    if (i == 0) {
                        resolveResultCase = ResolveResultCase.RESOLVERESULT_NOT_SET;
                    } else if (i == 1) {
                        resolveResultCase = ResolveResultCase.RESOLVE_SUCCESS;
                    } else if (i != 2) {
                        resolveResultCase = null;
                    } else {
                        resolveResultCase = ResolveResultCase.RESOLVE_ERROR;
                    }
                    int ordinal = resolveResultCase.ordinal();
                    if (ordinal == 0) {
                        this.b = hVar.u(this.a == 1, this.b, ucsResponse.b);
                    } else if (ordinal == 1) {
                        this.b = hVar.u(this.a == 2, this.b, ucsResponse.b);
                    } else if (ordinal == 2) {
                        hVar.b(this.a != 0);
                    }
                    int i2 = ucsResponse.c;
                    if (i2 == 0) {
                        accountAttributesResultCase = AccountAttributesResultCase.ACCOUNTATTRIBUTESRESULT_NOT_SET;
                    } else if (i2 == 3) {
                        accountAttributesResultCase = AccountAttributesResultCase.ACCOUNT_ATTRIBUTES_SUCCESS;
                    } else if (i2 == 4) {
                        accountAttributesResultCase = AccountAttributesResultCase.ACCOUNT_ATTRIBUTES_ERROR;
                    }
                    int ordinal2 = accountAttributesResultCase.ordinal();
                    if (ordinal2 == 0) {
                        if (this.c == 3) {
                            z = true;
                        }
                        this.f = hVar.u(z, this.f, ucsResponse.f);
                    } else if (ordinal2 == 1) {
                        if (this.c == 4) {
                            z = true;
                        }
                        this.f = hVar.u(z, this.f, ucsResponse.f);
                    } else if (ordinal2 == 2) {
                        if (this.c != 0) {
                            z = true;
                        }
                        hVar.b(z);
                    }
                    if (hVar == GeneratedMessageLite.g.a) {
                        int i3 = ucsResponse.a;
                        if (i3 != 0) {
                            this.a = i3;
                        }
                        int i4 = ucsResponse.c;
                        if (i4 != 0) {
                            this.c = i4;
                        }
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
                                    ResolveResponse.b bVar = this.a == 1 ? (ResolveResponse.b) ((ResolveResponse) this.b).toBuilder() : null;
                                    u o2 = gVar.o(ResolveResponse.parser(), kVar);
                                    this.b = o2;
                                    if (bVar != null) {
                                        bVar.mergeFrom((ResolveResponse.b) ((ResolveResponse) o2));
                                        this.b = bVar.buildPartial();
                                    }
                                    this.a = 1;
                                } else if (B == 18) {
                                    Error.a aVar = this.a == 2 ? (Error.a) ((Error) this.b).toBuilder() : null;
                                    u o3 = gVar.o(Error.parser(), kVar);
                                    this.b = o3;
                                    if (aVar != null) {
                                        aVar.mergeFrom((Error.a) ((Error) o3));
                                        this.b = aVar.buildPartial();
                                    }
                                    this.a = 2;
                                } else if (B == 26) {
                                    AccountAttributesResponse.b bVar2 = this.c == 3 ? (AccountAttributesResponse.b) ((AccountAttributesResponse) this.f).toBuilder() : null;
                                    u o4 = gVar.o(AccountAttributesResponse.parser(), kVar);
                                    this.f = o4;
                                    if (bVar2 != null) {
                                        bVar2.mergeFrom((AccountAttributesResponse.b) ((AccountAttributesResponse) o4));
                                        this.f = bVar2.buildPartial();
                                    }
                                    this.c = 3;
                                } else if (B == 34) {
                                    Error.a aVar2 = this.c == 4 ? (Error.a) ((Error) this.f).toBuilder() : null;
                                    u o5 = gVar.o(Error.parser(), kVar);
                                    this.f = o5;
                                    if (aVar2 != null) {
                                        aVar2.mergeFrom((Error.a) ((Error) o5));
                                        this.f = aVar2.buildPartial();
                                    }
                                    this.c = 4;
                                } else if (B == 40) {
                                    this.n = gVar.w();
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
                    return new UcsResponse();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (p == null) {
                        synchronized (UcsResponse.class) {
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
            if (this.a == 1) {
                i2 = 0 + CodedOutputStream.n(1, (ResolveResponse) this.b);
            }
            if (this.a == 2) {
                i2 += CodedOutputStream.n(2, (Error) this.b);
            }
            if (this.c == 3) {
                i2 += CodedOutputStream.n(3, (AccountAttributesResponse) this.f);
            }
            if (this.c == 4) {
                i2 += CodedOutputStream.n(4, (Error) this.f);
            }
            long j = this.n;
            if (j != 0) {
                i2 += CodedOutputStream.l(5, j);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public long i() {
            return this.n;
        }

        public ResolveResponse l() {
            if (this.a == 1) {
                return (ResolveResponse) this.b;
            }
            return ResolveResponse.i();
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a == 1) {
                codedOutputStream.M(1, (ResolveResponse) this.b);
            }
            if (this.a == 2) {
                codedOutputStream.M(2, (Error) this.b);
            }
            if (this.c == 3) {
                codedOutputStream.M(3, (AccountAttributesResponse) this.f);
            }
            if (this.c == 4) {
                codedOutputStream.M(4, (Error) this.f);
            }
            long j = this.n;
            if (j != 0) {
                codedOutputStream.U(5, j);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<UcsResponseWrapper, b> implements Object {
        private b() {
            super(UcsResponseWrapper.c);
        }
    }

    static {
        UcsResponseWrapper ucsResponseWrapper = new UcsResponseWrapper();
        c = ucsResponseWrapper;
        ucsResponseWrapper.makeImmutable();
    }

    private UcsResponseWrapper() {
    }

    public static x<UcsResponseWrapper> parser() {
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
                UcsResponseWrapper ucsResponseWrapper = (UcsResponseWrapper) obj2;
                int ordinal = ucsResponseWrapper.i().ordinal();
                if (ordinal == 0) {
                    if (this.a != 1) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, ucsResponseWrapper.b);
                } else if (ordinal == 1) {
                    if (this.a != 2) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, ucsResponseWrapper.b);
                } else if (ordinal == 2) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = ucsResponseWrapper.a) != 0) {
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
                                UcsResponse.a aVar = this.a == 1 ? (UcsResponse.a) ((UcsResponse) this.b).toBuilder() : null;
                                u o = gVar.o(UcsResponse.parser(), kVar);
                                this.b = o;
                                if (aVar != null) {
                                    aVar.mergeFrom((UcsResponse.a) ((UcsResponse) o));
                                    this.b = aVar.buildPartial();
                                }
                                this.a = 1;
                            } else if (B == 18) {
                                Error.a aVar2 = this.a == 2 ? (Error.a) ((Error) this.b).toBuilder() : null;
                                u o2 = gVar.o(Error.parser(), kVar);
                                this.b = o2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((Error.a) ((Error) o2));
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
                return new UcsResponseWrapper();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (UcsResponseWrapper.class) {
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
            i2 = 0 + CodedOutputStream.n(1, (UcsResponse) this.b);
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (Error) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Error h() {
        if (this.a == 2) {
            return (Error) this.b;
        }
        return Error.h();
    }

    public ResultCase i() {
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

    public UcsResponse l() {
        if (this.a == 1) {
            return (UcsResponse) this.b;
        }
        return UcsResponse.h();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.M(1, (UcsResponse) this.b);
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (Error) this.b);
        }
    }
}
