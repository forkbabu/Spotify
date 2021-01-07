package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class ShowShowsRequest$ProtoShowsResponse extends GeneratedMessageLite<ShowShowsRequest$ProtoShowsResponse, a> implements Object {
    private static final ShowShowsRequest$ProtoShowsResponse p;
    private static volatile x<ShowShowsRequest$ProtoShowsResponse> q;
    private int a;
    private o.i<ShowShowsRequest$ProtoShowsRequestItem> b = GeneratedMessageLite.emptyProtobufList();
    private int c;
    private int f;
    private int n;
    private boolean o;

    public static final class a extends GeneratedMessageLite.b<ShowShowsRequest$ProtoShowsResponse, a> implements Object {
        private a() {
            super(ShowShowsRequest$ProtoShowsResponse.p);
        }
    }

    static {
        ShowShowsRequest$ProtoShowsResponse showShowsRequest$ProtoShowsResponse = new ShowShowsRequest$ProtoShowsResponse();
        p = showShowsRequest$ProtoShowsResponse;
        showShowsRequest$ProtoShowsResponse.makeImmutable();
    }

    private ShowShowsRequest$ProtoShowsResponse() {
    }

    public static ShowShowsRequest$ProtoShowsResponse p(byte[] bArr) {
        return (ShowShowsRequest$ProtoShowsResponse) GeneratedMessageLite.parseFrom(p, bArr);
    }

    public static x<ShowShowsRequest$ProtoShowsResponse> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowShowsRequest$ProtoShowsResponse showShowsRequest$ProtoShowsResponse = (ShowShowsRequest$ProtoShowsResponse) obj2;
                this.b = hVar.q(this.b, showShowsRequest$ProtoShowsResponse.b);
                this.c = hVar.m((this.a & 1) == 1, this.c, (showShowsRequest$ProtoShowsResponse.a & 1) == 1, showShowsRequest$ProtoShowsResponse.c);
                this.f = hVar.m((this.a & 2) == 2, this.f, (showShowsRequest$ProtoShowsResponse.a & 2) == 2, showShowsRequest$ProtoShowsResponse.f);
                this.n = hVar.m((this.a & 4) == 4, this.n, (showShowsRequest$ProtoShowsResponse.a & 4) == 4, showShowsRequest$ProtoShowsResponse.n);
                boolean z2 = (this.a & 8) == 8;
                boolean z3 = this.o;
                if ((showShowsRequest$ProtoShowsResponse.a & 8) == 8) {
                    z = true;
                }
                this.o = hVar.f(z2, z3, z, showShowsRequest$ProtoShowsResponse.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowsRequest$ProtoShowsResponse.a;
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
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(ShowShowsRequest$ProtoShowsRequestItem.parser(), kVar));
                            } else if (B == 16) {
                                this.a |= 1;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 2;
                                this.f = gVar.u();
                            } else if (B == 32) {
                                this.a |= 4;
                                this.n = gVar.u();
                            } else if (B == 40) {
                                this.a |= 8;
                                this.o = gVar.h();
                            } else if (!parseUnknownField(B, gVar)) {
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
                this.b.C();
                return null;
            case 4:
                return new ShowShowsRequest$ProtoShowsResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (ShowShowsRequest$ProtoShowsResponse.class) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if ((this.a & 1) == 1) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.d(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.b.size();
    }

    public List<ShowShowsRequest$ProtoShowsRequestItem> i() {
        return this.b;
    }

    public boolean l() {
        return this.o;
    }

    public int m() {
        return this.c;
    }

    public int n() {
        return this.f;
    }

    public int o() {
        return this.n;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.S(2, this.c);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
