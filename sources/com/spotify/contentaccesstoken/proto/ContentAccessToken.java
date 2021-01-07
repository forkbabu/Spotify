package com.spotify.contentaccesstoken.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.contentaccesstoken.proto.Timestamp;
import java.io.IOException;
import java.util.List;

public final class ContentAccessToken extends GeneratedMessageLite<ContentAccessToken, b> implements Object {
    private static final ContentAccessToken o;
    private static volatile x<ContentAccessToken> p;
    private int a;
    private String b = "";
    private Timestamp c;
    private Timestamp f;
    private o.i<String> n = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<ContentAccessToken, b> implements Object {
        private b() {
            super(ContentAccessToken.o);
        }
    }

    static {
        ContentAccessToken contentAccessToken = new ContentAccessToken();
        o = contentAccessToken;
        contentAccessToken.makeImmutable();
    }

    private ContentAccessToken() {
    }

    public static ContentAccessToken h() {
        return o;
    }

    public static x<ContentAccessToken> parser() {
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
                ContentAccessToken contentAccessToken = (ContentAccessToken) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ contentAccessToken.b.isEmpty(), contentAccessToken.b);
                this.c = (Timestamp) hVar.i(this.c, contentAccessToken.c);
                this.f = (Timestamp) hVar.i(this.f, contentAccessToken.f);
                this.n = hVar.q(this.n, contentAccessToken.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= contentAccessToken.a;
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
                            if (B == 10) {
                                this.b = gVar.A();
                            } else if (B == 18) {
                                Timestamp timestamp = this.c;
                                Timestamp.b bVar = timestamp != null ? (Timestamp.b) timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) gVar.o(Timestamp.parser(), kVar);
                                this.c = timestamp2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Timestamp.b) timestamp2);
                                    this.c = (Timestamp) bVar.buildPartial();
                                }
                            } else if (B == 26) {
                                Timestamp timestamp3 = this.f;
                                Timestamp.b bVar2 = timestamp3 != null ? (Timestamp.b) timestamp3.toBuilder() : null;
                                Timestamp timestamp4 = (Timestamp) gVar.o(Timestamp.parser(), kVar);
                                this.f = timestamp4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Timestamp.b) timestamp4);
                                    this.f = (Timestamp) bVar2.buildPartial();
                                }
                            } else if (B == 34) {
                                String A = gVar.A();
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(A);
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
                this.n.C();
                return null;
            case 4:
                return new ContentAccessToken();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ContentAccessToken.class) {
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
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (this.c != null) {
            p2 += CodedOutputStream.n(2, l());
        }
        if (this.f != null) {
            p2 += CodedOutputStream.n(3, m());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            i2 += CodedOutputStream.q(this.n.get(i3));
        }
        int C0 = je.C0(this.n, 1, p2 + i2);
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public List<String> i() {
        return this.n;
    }

    public Timestamp l() {
        Timestamp timestamp = this.c;
        return timestamp == null ? Timestamp.h() : timestamp;
    }

    public Timestamp m() {
        Timestamp timestamp = this.f;
        return timestamp == null ? Timestamp.h() : timestamp;
    }

    public String n() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (this.c != null) {
            codedOutputStream.M(2, l());
        }
        if (this.f != null) {
            codedOutputStream.M(3, m());
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.P(4, this.n.get(i));
        }
    }
}
