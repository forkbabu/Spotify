package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$TargetFormat;
import java.io.IOException;
import java.util.List;

public final class OfflinePlugin$IdentifyCommand extends GeneratedMessageLite<OfflinePlugin$IdentifyCommand, a> implements Object {
    private static final OfflinePlugin$IdentifyCommand f;
    private static volatile x<OfflinePlugin$IdentifyCommand> n;
    private int a;
    private Header b;
    private o.i<Query> c = GeneratedMessageLite.emptyProtobufList();

    public static final class Header extends GeneratedMessageLite<Header, a> implements Object {
        private static final Header b;
        private static volatile x<Header> c;
        private OfflinePlugin$TargetFormat a;

        public static final class a extends GeneratedMessageLite.b<Header, a> implements Object {
            private a() {
                super(Header.b);
            }
        }

        static {
            Header header = new Header();
            b = header;
            header.makeImmutable();
        }

        private Header() {
        }

        public static x<Header> parser() {
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
                    this.a = (OfflinePlugin$TargetFormat) ((GeneratedMessageLite.h) obj).i(this.a, ((Header) obj2).a);
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
                                    OfflinePlugin$TargetFormat offlinePlugin$TargetFormat = this.a;
                                    OfflinePlugin$TargetFormat.a aVar = offlinePlugin$TargetFormat != null ? (OfflinePlugin$TargetFormat.a) offlinePlugin$TargetFormat.toBuilder() : null;
                                    OfflinePlugin$TargetFormat offlinePlugin$TargetFormat2 = (OfflinePlugin$TargetFormat) gVar.o(OfflinePlugin$TargetFormat.parser(), kVar);
                                    this.a = offlinePlugin$TargetFormat2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((OfflinePlugin$TargetFormat.a) offlinePlugin$TargetFormat2);
                                        this.a = (OfflinePlugin$TargetFormat) aVar.buildPartial();
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
                    return new Header();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (Header.class) {
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
            OfflinePlugin$TargetFormat offlinePlugin$TargetFormat = this.a;
            if (offlinePlugin$TargetFormat != null) {
                i2 = 0 + CodedOutputStream.n(1, offlinePlugin$TargetFormat);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            OfflinePlugin$TargetFormat offlinePlugin$TargetFormat = this.a;
            if (offlinePlugin$TargetFormat != null) {
                codedOutputStream.M(1, offlinePlugin$TargetFormat);
            }
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

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$IdentifyCommand, a> implements Object {
        private a() {
            super(OfflinePlugin$IdentifyCommand.f);
        }
    }

    static {
        OfflinePlugin$IdentifyCommand offlinePlugin$IdentifyCommand = new OfflinePlugin$IdentifyCommand();
        f = offlinePlugin$IdentifyCommand;
        offlinePlugin$IdentifyCommand.makeImmutable();
    }

    private OfflinePlugin$IdentifyCommand() {
    }

    public static OfflinePlugin$IdentifyCommand h() {
        return f;
    }

    public static x<OfflinePlugin$IdentifyCommand> parser() {
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
                OfflinePlugin$IdentifyCommand offlinePlugin$IdentifyCommand = (OfflinePlugin$IdentifyCommand) obj2;
                this.b = (Header) hVar.i(this.b, offlinePlugin$IdentifyCommand.b);
                this.c = hVar.q(this.c, offlinePlugin$IdentifyCommand.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= offlinePlugin$IdentifyCommand.a;
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
                            if (B == 26) {
                                Header header = this.b;
                                Header.a aVar = header != null ? (Header.a) header.toBuilder() : null;
                                Header header2 = (Header) gVar.o(Header.parser(), kVar);
                                this.b = header2;
                                if (aVar != null) {
                                    aVar.mergeFrom((Header.a) header2);
                                    this.b = (Header) aVar.buildPartial();
                                }
                            } else if (B == 34) {
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
                return new OfflinePlugin$IdentifyCommand();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (OfflinePlugin$IdentifyCommand.class) {
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
        int n2 = header != null ? CodedOutputStream.n(3, header) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(4, this.c.get(i2));
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
            codedOutputStream.M(3, header);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(4, this.c.get(i));
        }
    }
}
