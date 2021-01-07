package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import java.io.IOException;
import java.util.List;

public final class TopFiveStoryResponse extends GeneratedMessageLite<TopFiveStoryResponse, b> implements Object {
    private static final TopFiveStoryResponse p;
    private static volatile x<TopFiveStoryResponse> q;
    private int a;
    private String b = "";
    private String c = "";
    private o.i<TopFiveStoryStep> f = GeneratedMessageLite.emptyProtobufList();
    private ShareConfiguration n;
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<TopFiveStoryResponse, b> implements Object {
        private b() {
            super(TopFiveStoryResponse.p);
        }
    }

    static {
        TopFiveStoryResponse topFiveStoryResponse = new TopFiveStoryResponse();
        p = topFiveStoryResponse;
        topFiveStoryResponse.makeImmutable();
    }

    private TopFiveStoryResponse() {
    }

    public static TopFiveStoryResponse i() {
        return p;
    }

    public static x<TopFiveStoryResponse> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TopFiveStoryResponse topFiveStoryResponse = (TopFiveStoryResponse) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !topFiveStoryResponse.b.isEmpty(), topFiveStoryResponse.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !topFiveStoryResponse.c.isEmpty(), topFiveStoryResponse.c);
                this.f = hVar.q(this.f, topFiveStoryResponse.f);
                this.n = (ShareConfiguration) hVar.i(this.n, topFiveStoryResponse.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ topFiveStoryResponse.o.isEmpty(), topFiveStoryResponse.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= topFiveStoryResponse.a;
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
                                this.c = gVar.A();
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(TopFiveStoryStep.parser(), kVar));
                            } else if (B == 34) {
                                ShareConfiguration shareConfiguration = this.n;
                                ShareConfiguration.b bVar = shareConfiguration != null ? (ShareConfiguration.b) shareConfiguration.toBuilder() : null;
                                ShareConfiguration shareConfiguration2 = (ShareConfiguration) gVar.o(ShareConfiguration.parser(), kVar);
                                this.n = shareConfiguration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ShareConfiguration.b) shareConfiguration2);
                                    this.n = (ShareConfiguration) bVar.buildPartial();
                                }
                            } else if (B == 42) {
                                this.o = gVar.A();
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
                return new TopFiveStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (TopFiveStoryResponse.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            p2 += CodedOutputStream.n(3, this.f.get(i2));
        }
        if (this.n != null) {
            p2 += CodedOutputStream.n(4, n());
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public String h() {
        return this.c;
    }

    public String l() {
        return this.o;
    }

    public String m() {
        return this.b;
    }

    public ShareConfiguration n() {
        ShareConfiguration shareConfiguration = this.n;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public List<TopFiveStoryStep> o() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
        if (this.n != null) {
            codedOutputStream.M(4, n());
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
    }
}
