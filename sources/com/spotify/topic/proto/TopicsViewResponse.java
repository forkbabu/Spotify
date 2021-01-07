package com.spotify.topic.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class TopicsViewResponse extends GeneratedMessageLite<TopicsViewResponse, b> implements Object {
    private static final TopicsViewResponse p;
    private static volatile x<TopicsViewResponse> q;
    private int a;
    private String b = "";
    private o.i<Entity> c = GeneratedMessageLite.emptyProtobufList();
    private o.i<Entity> f = GeneratedMessageLite.emptyProtobufList();
    private o.i<RelatedTopic> n = GeneratedMessageLite.emptyProtobufList();
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<TopicsViewResponse, b> implements Object {
        private b() {
            super(TopicsViewResponse.p);
        }
    }

    static {
        TopicsViewResponse topicsViewResponse = new TopicsViewResponse();
        p = topicsViewResponse;
        topicsViewResponse.makeImmutable();
    }

    private TopicsViewResponse() {
    }

    public static x<TopicsViewResponse> parser() {
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
                TopicsViewResponse topicsViewResponse = (TopicsViewResponse) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !topicsViewResponse.b.isEmpty(), topicsViewResponse.b);
                this.c = hVar.q(this.c, topicsViewResponse.c);
                this.f = hVar.q(this.f, topicsViewResponse.f);
                this.n = hVar.q(this.n, topicsViewResponse.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ topicsViewResponse.o.isEmpty(), topicsViewResponse.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= topicsViewResponse.a;
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
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Entity.parser(), kVar));
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(Entity.parser(), kVar));
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(RelatedTopic.parser(), kVar));
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
                this.c.C();
                this.f.C();
                this.n.C();
                return null;
            case 4:
                return new TopicsViewResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (TopicsViewResponse.class) {
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
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            p2 += CodedOutputStream.n(3, this.f.get(i3));
        }
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            p2 += CodedOutputStream.n(4, this.n.get(i4));
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<Entity> h() {
        return this.c;
    }

    public List<Entity> i() {
        return this.f;
    }

    public List<RelatedTopic> l() {
        return this.n;
    }

    public String m() {
        return this.o;
    }

    public String n() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.M(3, this.f.get(i2));
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            codedOutputStream.M(4, this.n.get(i3));
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
    }
}
