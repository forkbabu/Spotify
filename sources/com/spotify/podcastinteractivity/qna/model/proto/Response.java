package com.spotify.podcastinteractivity.qna.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.podcastinteractivity.qna.model.proto.UserInfo;
import com.spotify.podcastinteractivity.qna.proto.Timestamp;
import java.io.IOException;

public final class Response extends GeneratedMessageLite<Response, b> implements Object {
    private static final Response r;
    private static volatile x<Response> s;
    private String a = "";
    private int b;
    private String c = "";
    private String f = "";
    private boolean n;
    private int o;
    private Timestamp p;
    private UserInfo q;

    public static final class b extends GeneratedMessageLite.b<Response, b> implements Object {
        private b() {
            super(Response.r);
        }
    }

    static {
        Response response = new Response();
        r = response;
        response.makeImmutable();
    }

    private Response() {
    }

    public static Response h() {
        return r;
    }

    public static x<Response> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Response response = (Response) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !response.a.isEmpty(), response.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = response.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !response.c.isEmpty(), response.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !response.f.isEmpty(), response.f);
                boolean z3 = this.n;
                boolean z4 = response.n;
                this.n = hVar.f(z3, z3, z4, z4);
                int i3 = this.o;
                boolean z5 = i3 != 0;
                int i4 = response.o;
                if (i4 != 0) {
                    z = true;
                }
                this.o = hVar.m(z5, i3, z, i4);
                this.p = (Timestamp) hVar.i(this.p, response.p);
                this.q = (UserInfo) hVar.i(this.q, response.q);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 16) {
                                this.b = gVar.u();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 40) {
                                this.n = gVar.h();
                            } else if (B == 48) {
                                this.o = gVar.u();
                            } else if (B == 58) {
                                Timestamp timestamp = this.p;
                                Timestamp.b bVar = timestamp != null ? (Timestamp.b) timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) gVar.o(Timestamp.parser(), kVar);
                                this.p = timestamp2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Timestamp.b) timestamp2);
                                    this.p = (Timestamp) bVar.buildPartial();
                                }
                            } else if (B == 66) {
                                UserInfo userInfo = this.q;
                                UserInfo.b bVar2 = userInfo != null ? (UserInfo.b) userInfo.toBuilder() : null;
                                UserInfo userInfo2 = (UserInfo) gVar.o(UserInfo.parser(), kVar);
                                this.q = userInfo2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((UserInfo.b) userInfo2);
                                    this.q = (UserInfo) bVar2.buildPartial();
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
                return new Response();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (Response.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
        int i3 = this.b;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        boolean z = this.n;
        if (z) {
            i2 += CodedOutputStream.d(5, z);
        }
        if (this.o != ResponseStatus.ACTIVE.getNumber()) {
            i2 += CodedOutputStream.h(6, this.o);
        }
        if (this.p != null) {
            i2 += CodedOutputStream.n(7, l());
        }
        if (this.q != null) {
            i2 += CodedOutputStream.n(8, n());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean i() {
        return this.n;
    }

    public Timestamp l() {
        Timestamp timestamp = this.p;
        return timestamp == null ? Timestamp.h() : timestamp;
    }

    public String m() {
        return this.f;
    }

    public UserInfo n() {
        UserInfo userInfo = this.q;
        return userInfo == null ? UserInfo.h() : userInfo;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        boolean z = this.n;
        if (z) {
            codedOutputStream.A(5, z);
        }
        if (this.o != ResponseStatus.ACTIVE.getNumber()) {
            codedOutputStream.K(6, this.o);
        }
        if (this.p != null) {
            codedOutputStream.M(7, l());
        }
        if (this.q != null) {
            codedOutputStream.M(8, n());
        }
    }
}
