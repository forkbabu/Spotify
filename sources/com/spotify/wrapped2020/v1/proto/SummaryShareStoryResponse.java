package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.spotify.wrapped2020.v1.proto.SummaryShareCardData;
import java.io.IOException;

public final class SummaryShareStoryResponse extends GeneratedMessageLite<SummaryShareStoryResponse, b> implements Object {
    private static final SummaryShareStoryResponse q;
    private static volatile x<SummaryShareStoryResponse> r;
    private String a = "";
    private String b = "";
    private SummaryShareCardData c;
    private String f = "";
    private String n = "";
    private ShareConfiguration o;
    private String p = "";

    public static final class b extends GeneratedMessageLite.b<SummaryShareStoryResponse, b> implements Object {
        private b() {
            super(SummaryShareStoryResponse.q);
        }
    }

    static {
        SummaryShareStoryResponse summaryShareStoryResponse = new SummaryShareStoryResponse();
        q = summaryShareStoryResponse;
        summaryShareStoryResponse.makeImmutable();
    }

    private SummaryShareStoryResponse() {
    }

    public static SummaryShareStoryResponse l() {
        return q;
    }

    public static x<SummaryShareStoryResponse> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                SummaryShareStoryResponse summaryShareStoryResponse = (SummaryShareStoryResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !summaryShareStoryResponse.a.isEmpty(), summaryShareStoryResponse.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !summaryShareStoryResponse.b.isEmpty(), summaryShareStoryResponse.b);
                this.c = (SummaryShareCardData) hVar.i(this.c, summaryShareStoryResponse.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !summaryShareStoryResponse.f.isEmpty(), summaryShareStoryResponse.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !summaryShareStoryResponse.n.isEmpty(), summaryShareStoryResponse.n);
                this.o = (ShareConfiguration) hVar.i(this.o, summaryShareStoryResponse.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, true ^ summaryShareStoryResponse.p.isEmpty(), summaryShareStoryResponse.p);
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
                                SummaryShareCardData summaryShareCardData = this.c;
                                SummaryShareCardData.b bVar = summaryShareCardData != null ? (SummaryShareCardData.b) summaryShareCardData.toBuilder() : null;
                                SummaryShareCardData summaryShareCardData2 = (SummaryShareCardData) gVar.o(SummaryShareCardData.parser(), kVar);
                                this.c = summaryShareCardData2;
                                if (bVar != null) {
                                    bVar.mergeFrom((SummaryShareCardData.b) summaryShareCardData2);
                                    this.c = (SummaryShareCardData) bVar.buildPartial();
                                }
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 42) {
                                this.n = gVar.A();
                            } else if (B == 50) {
                                ShareConfiguration shareConfiguration = this.o;
                                ShareConfiguration.b bVar2 = shareConfiguration != null ? (ShareConfiguration.b) shareConfiguration.toBuilder() : null;
                                ShareConfiguration shareConfiguration2 = (ShareConfiguration) gVar.o(ShareConfiguration.parser(), kVar);
                                this.o = shareConfiguration2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ShareConfiguration.b) shareConfiguration2);
                                    this.o = (ShareConfiguration) bVar2.buildPartial();
                                }
                            } else if (B == 58) {
                                this.p = gVar.A();
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
                return new SummaryShareStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (SummaryShareStoryResponse.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
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
        if (this.c != null) {
            i2 += CodedOutputStream.n(3, i());
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (this.o != null) {
            i2 += CodedOutputStream.n(6, o());
        }
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.b;
    }

    public SummaryShareCardData i() {
        SummaryShareCardData summaryShareCardData = this.c;
        return summaryShareCardData == null ? SummaryShareCardData.o() : summaryShareCardData;
    }

    public String m() {
        return this.n;
    }

    public String n() {
        return this.a;
    }

    public ShareConfiguration o() {
        ShareConfiguration shareConfiguration = this.o;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public String p() {
        return this.p;
    }

    public String q() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (this.c != null) {
            codedOutputStream.M(3, i());
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (this.o != null) {
            codedOutputStream.M(6, o());
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
    }
}
