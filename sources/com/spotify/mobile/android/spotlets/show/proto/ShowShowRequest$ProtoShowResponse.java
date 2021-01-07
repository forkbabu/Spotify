package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$AuxiliarySections;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoOnlineData;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowRequestHeader;
import java.io.IOException;
import java.util.List;

public final class ShowShowRequest$ProtoShowResponse extends GeneratedMessageLite<ShowShowRequest$ProtoShowResponse, a> implements Object {
    private static final ShowShowRequest$ProtoShowResponse s;
    private static volatile x<ShowShowRequest$ProtoShowResponse> t;
    private int a;
    private o.i<ShowShowRequest$ProtoShowRequestItem> b = GeneratedMessageLite.emptyProtobufList();
    private ShowShowRequest$ProtoShowRequestHeader c;
    private ShowShowRequest$ProtoOnlineData f;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private ShowShowRequest$AuxiliarySections r;

    public static final class a extends GeneratedMessageLite.b<ShowShowRequest$ProtoShowResponse, a> implements Object {
        private a() {
            super(ShowShowRequest$ProtoShowResponse.s);
        }
    }

    static {
        ShowShowRequest$ProtoShowResponse showShowRequest$ProtoShowResponse = new ShowShowRequest$ProtoShowResponse();
        s = showShowRequest$ProtoShowResponse;
        showShowRequest$ProtoShowResponse.makeImmutable();
    }

    private ShowShowRequest$ProtoShowResponse() {
    }

    public static x<ShowShowRequest$ProtoShowResponse> parser() {
        return s.getParserForType();
    }

    public static ShowShowRequest$ProtoShowResponse u(byte[] bArr) {
        return (ShowShowRequest$ProtoShowResponse) GeneratedMessageLite.parseFrom(s, bArr);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowShowRequest$ProtoShowResponse showShowRequest$ProtoShowResponse = (ShowShowRequest$ProtoShowResponse) obj2;
                this.b = hVar.q(this.b, showShowRequest$ProtoShowResponse.b);
                this.c = (ShowShowRequest$ProtoShowRequestHeader) hVar.i(this.c, showShowRequest$ProtoShowResponse.c);
                this.f = (ShowShowRequest$ProtoOnlineData) hVar.i(this.f, showShowRequest$ProtoShowResponse.f);
                this.n = hVar.m((this.a & 4) == 4, this.n, (showShowRequest$ProtoShowResponse.a & 4) == 4, showShowRequest$ProtoShowResponse.n);
                this.o = hVar.m((this.a & 8) == 8, this.o, (showShowRequest$ProtoShowResponse.a & 8) == 8, showShowRequest$ProtoShowResponse.o);
                this.p = hVar.f((this.a & 16) == 16, this.p, (showShowRequest$ProtoShowResponse.a & 16) == 16, showShowRequest$ProtoShowResponse.p);
                boolean z2 = (this.a & 32) == 32;
                int i = this.q;
                if ((showShowRequest$ProtoShowResponse.a & 32) == 32) {
                    z = true;
                }
                this.q = hVar.m(z2, i, z, showShowRequest$ProtoShowResponse.q);
                this.r = (ShowShowRequest$AuxiliarySections) hVar.i(this.r, showShowRequest$ProtoShowResponse.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowRequest$ProtoShowResponse.a;
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
                                this.b.add(gVar.o(ShowShowRequest$ProtoShowRequestItem.parser(), kVar));
                            } else if (B == 18) {
                                ShowShowRequest$ProtoShowRequestHeader.a aVar = (this.a & 1) == 1 ? (ShowShowRequest$ProtoShowRequestHeader.a) this.c.toBuilder() : null;
                                ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = (ShowShowRequest$ProtoShowRequestHeader) gVar.o(ShowShowRequest$ProtoShowRequestHeader.parser(), kVar);
                                this.c = showShowRequest$ProtoShowRequestHeader;
                                if (aVar != null) {
                                    aVar.mergeFrom((ShowShowRequest$ProtoShowRequestHeader.a) showShowRequest$ProtoShowRequestHeader);
                                    this.c = (ShowShowRequest$ProtoShowRequestHeader) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 26) {
                                ShowShowRequest$ProtoOnlineData.a aVar2 = (this.a & 2) == 2 ? (ShowShowRequest$ProtoOnlineData.a) this.f.toBuilder() : null;
                                ShowShowRequest$ProtoOnlineData showShowRequest$ProtoOnlineData = (ShowShowRequest$ProtoOnlineData) gVar.o(ShowShowRequest$ProtoOnlineData.parser(), kVar);
                                this.f = showShowRequest$ProtoOnlineData;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ShowShowRequest$ProtoOnlineData.a) showShowRequest$ProtoOnlineData);
                                    this.f = (ShowShowRequest$ProtoOnlineData) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 32) {
                                this.a |= 4;
                                this.n = gVar.u();
                            } else if (B == 40) {
                                this.a |= 8;
                                this.o = gVar.u();
                            } else if (B == 48) {
                                this.a |= 16;
                                this.p = gVar.h();
                            } else if (B == 56) {
                                this.a |= 32;
                                this.q = gVar.u();
                            } else if (B == 66) {
                                ShowShowRequest$AuxiliarySections.a aVar3 = (this.a & 64) == 64 ? (ShowShowRequest$AuxiliarySections.a) this.r.toBuilder() : null;
                                ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = (ShowShowRequest$AuxiliarySections) gVar.o(ShowShowRequest$AuxiliarySections.parser(), kVar);
                                this.r = showShowRequest$AuxiliarySections;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((ShowShowRequest$AuxiliarySections.a) showShowRequest$AuxiliarySections);
                                    this.r = (ShowShowRequest$AuxiliarySections) aVar3.buildPartial();
                                }
                                this.a |= 64;
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
                return new ShowShowRequest$ProtoShowResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (ShowShowRequest$ProtoShowResponse.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
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
            i2 += CodedOutputStream.n(2, i());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(3, o());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.s(5, this.o);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.d(6, this.p);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.s(7, this.q);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.n(8, h());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ShowShowRequest$AuxiliarySections h() {
        ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = this.r;
        return showShowRequest$AuxiliarySections == null ? ShowShowRequest$AuxiliarySections.i() : showShowRequest$AuxiliarySections;
    }

    public ShowShowRequest$ProtoShowRequestHeader i() {
        ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = this.c;
        return showShowRequest$ProtoShowRequestHeader == null ? ShowShowRequest$ProtoShowRequestHeader.h() : showShowRequest$ProtoShowRequestHeader;
    }

    public int l() {
        return this.b.size();
    }

    public List<ShowShowRequest$ProtoShowRequestItem> m() {
        return this.b;
    }

    public boolean n() {
        return this.p;
    }

    public ShowShowRequest$ProtoOnlineData o() {
        ShowShowRequest$ProtoOnlineData showShowRequest$ProtoOnlineData = this.f;
        return showShowRequest$ProtoOnlineData == null ? ShowShowRequest$ProtoOnlineData.h() : showShowRequest$ProtoOnlineData;
    }

    public int p() {
        return this.n;
    }

    public int q() {
        return this.q;
    }

    public boolean r() {
        return (this.a & 64) == 64;
    }

    public boolean s() {
        return (this.a & 1) == 1;
    }

    public boolean t() {
        return (this.a & 2) == 2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.M(2, i());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(3, o());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(5, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(6, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.S(7, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.M(8, h());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
