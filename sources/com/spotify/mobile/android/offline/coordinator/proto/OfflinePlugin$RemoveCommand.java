package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class OfflinePlugin$RemoveCommand extends GeneratedMessageLite<OfflinePlugin$RemoveCommand, a> implements Object {
    private static final OfflinePlugin$RemoveCommand f;
    private static volatile x<OfflinePlugin$RemoveCommand> n;
    private int a;
    private Header b;
    private o.i<Query> c = GeneratedMessageLite.emptyProtobufList();

    public static final class Header extends GeneratedMessageLite<Header, a> implements Object {
        private static final Header a;
        private static volatile x<Header> b;

        public static final class a extends GeneratedMessageLite.b<Header, a> implements Object {
            private a() {
                super(Header.a);
            }
        }

        static {
            Header header = new Header();
            a = header;
            header.makeImmutable();
        }

        private Header() {
        }

        public static x<Header> parser() {
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
                    Header header = (Header) obj2;
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
                    return new Header();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (b == null) {
                        synchronized (Header.class) {
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

    public static final class Query extends GeneratedMessageLite<Query, a> implements Object {
        private static final Query b;
        private static volatile x<Query> c;
        private String a = "";

        public static final class a extends GeneratedMessageLite.b<Query, a> implements Object {
            private a() {
                super(Query.b);
            }
        }

        static {
            Query query = new Query();
            b = query;
            query.makeImmutable();
        }

        private Query() {
        }

        public static x<Query> parser() {
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
                    Query query = (Query) obj2;
                    this.a = ((GeneratedMessageLite.h) obj).n(!this.a.isEmpty(), this.a, true ^ query.a.isEmpty(), query.a);
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
                    return new Query();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (Query.class) {
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

        public String h() {
            return this.a;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
        }
    }

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$RemoveCommand, a> implements Object {
        private a() {
            super(OfflinePlugin$RemoveCommand.f);
        }
    }

    static {
        OfflinePlugin$RemoveCommand offlinePlugin$RemoveCommand = new OfflinePlugin$RemoveCommand();
        f = offlinePlugin$RemoveCommand;
        offlinePlugin$RemoveCommand.makeImmutable();
    }

    private OfflinePlugin$RemoveCommand() {
    }

    public static OfflinePlugin$RemoveCommand h() {
        return f;
    }

    public static x<OfflinePlugin$RemoveCommand> parser() {
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
                OfflinePlugin$RemoveCommand offlinePlugin$RemoveCommand = (OfflinePlugin$RemoveCommand) obj2;
                this.b = (Header) hVar.i(this.b, offlinePlugin$RemoveCommand.b);
                this.c = hVar.q(this.c, offlinePlugin$RemoveCommand.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= offlinePlugin$RemoveCommand.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 18) {
                                Header header = this.b;
                                Header.a aVar = header != null ? (Header.a) header.toBuilder() : null;
                                Header header2 = (Header) gVar.o(Header.parser(), kVar);
                                this.b = header2;
                                if (aVar != null) {
                                    aVar.mergeFrom((Header.a) header2);
                                    this.b = (Header) aVar.buildPartial();
                                }
                            } else if (B == 26) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Query.parser(), kVar));
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
                this.c.C();
                return null;
            case 4:
                return new OfflinePlugin$RemoveCommand();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (OfflinePlugin$RemoveCommand.class) {
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
        Header header = this.b;
        int n2 = header != null ? CodedOutputStream.n(2, header) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(3, this.c.get(i2));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public List<Query> i() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        Header header = this.b;
        if (header != null) {
            codedOutputStream.M(2, header);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(3, this.c.get(i));
        }
    }
}
