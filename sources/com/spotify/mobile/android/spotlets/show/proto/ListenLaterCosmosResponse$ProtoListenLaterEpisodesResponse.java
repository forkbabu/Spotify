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

public final class ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse extends GeneratedMessageLite<ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse, a> implements Object {
    private static final ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse q;
    private static volatile x<ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse> r;
    private int a;
    private int b;
    private int c;
    private o.i<ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem> f = GeneratedMessageLite.emptyProtobufList();
    private o.i<ListenLaterCosmosResponse$ProtoListenLaterShowItem> n = GeneratedMessageLite.emptyProtobufList();
    private String o = "";
    private int p;

    public static final class a extends GeneratedMessageLite.b<ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse, a> implements Object {
        private a() {
            super(ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.q);
        }
    }

    static {
        ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse = new ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse();
        q = listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse;
        listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.makeImmutable();
    }

    private ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse() {
    }

    public static x<ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse = (ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse) obj2;
                this.b = hVar.m((this.a & 1) == 1, this.b, (listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.a & 1) == 1, listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.b);
                boolean z2 = (this.a & 2) == 2;
                int i = this.c;
                if ((listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.c);
                this.f = hVar.q(this.f, listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.f);
                this.n = hVar.q(this.n, listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.n);
                this.o = hVar.n(o(), this.o, listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.o(), listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.o);
                this.p = hVar.m(p(), this.p, listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.p(), listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.u();
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem.parser(), kVar));
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(ListenLaterCosmosResponse$ProtoListenLaterShowItem.parser(), kVar));
                            } else if (B == 42) {
                                String z3 = gVar.z();
                                this.a |= 4;
                                this.o = z3;
                            } else if (B == 48) {
                                this.a |= 8;
                                this.p = gVar.u();
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
                this.f.C();
                this.n.C();
                return null;
            case 4:
                return new ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse.class) {
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
        int s = (this.a & 1) == 1 ? CodedOutputStream.s(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            s += CodedOutputStream.s(2, this.c);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            s += CodedOutputStream.n(3, this.f.get(i2));
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            s += CodedOutputStream.n(4, this.n.get(i3));
        }
        if ((this.a & 4) == 4) {
            s += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 8) == 8) {
            s += CodedOutputStream.s(6, this.p);
        }
        int c2 = this.unknownFields.c() + s;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<? extends e> h() {
        return this.f;
    }

    public String i() {
        return this.o;
    }

    public int l() {
        return this.p;
    }

    public int m() {
        return this.b;
    }

    public int n() {
        return this.c;
    }

    public boolean o() {
        return (this.a & 4) == 4;
    }

    public boolean p() {
        return (this.a & 8) == 8;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.S(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(2, this.c);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            codedOutputStream.M(4, this.n.get(i2));
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(6, this.p);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
