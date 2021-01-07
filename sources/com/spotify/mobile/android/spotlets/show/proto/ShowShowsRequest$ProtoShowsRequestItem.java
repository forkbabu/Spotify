package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata$ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowPlayState;
import java.io.IOException;

public final class ShowShowsRequest$ProtoShowsRequestItem extends GeneratedMessageLite<ShowShowsRequest$ProtoShowsRequestItem, a> implements Object {
    private static final ShowShowsRequest$ProtoShowsRequestItem s;
    private static volatile x<ShowShowsRequest$ProtoShowsRequestItem> t;
    private int a;
    private String b = "";
    private ShowMetadata$ProtoShowMetadata c;
    private ShowState$ProtoShowCollectionState f;
    private ShowState$ProtoShowPlayState n;
    private int o;
    private int p;
    private boolean q;
    private long r;

    public static final class a extends GeneratedMessageLite.b<ShowShowsRequest$ProtoShowsRequestItem, a> implements Object {
        private a() {
            super(ShowShowsRequest$ProtoShowsRequestItem.s);
        }
    }

    static {
        ShowShowsRequest$ProtoShowsRequestItem showShowsRequest$ProtoShowsRequestItem = new ShowShowsRequest$ProtoShowsRequestItem();
        s = showShowsRequest$ProtoShowsRequestItem;
        showShowsRequest$ProtoShowsRequestItem.makeImmutable();
    }

    private ShowShowsRequest$ProtoShowsRequestItem() {
    }

    public static x<ShowShowsRequest$ProtoShowsRequestItem> parser() {
        return s.getParserForType();
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
                ShowShowsRequest$ProtoShowsRequestItem showShowsRequest$ProtoShowsRequestItem = (ShowShowsRequest$ProtoShowsRequestItem) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (showShowsRequest$ProtoShowsRequestItem.a & 1) == 1, showShowsRequest$ProtoShowsRequestItem.b);
                this.c = (ShowMetadata$ProtoShowMetadata) hVar.i(this.c, showShowsRequest$ProtoShowsRequestItem.c);
                this.f = (ShowState$ProtoShowCollectionState) hVar.i(this.f, showShowsRequest$ProtoShowsRequestItem.f);
                this.n = (ShowState$ProtoShowPlayState) hVar.i(this.n, showShowsRequest$ProtoShowsRequestItem.n);
                this.o = hVar.m((this.a & 16) == 16, this.o, (showShowsRequest$ProtoShowsRequestItem.a & 16) == 16, showShowsRequest$ProtoShowsRequestItem.o);
                this.p = hVar.m((this.a & 32) == 32, this.p, (showShowsRequest$ProtoShowsRequestItem.a & 32) == 32, showShowsRequest$ProtoShowsRequestItem.p);
                this.q = hVar.f((this.a & 64) == 64, this.q, (showShowsRequest$ProtoShowsRequestItem.a & 64) == 64, showShowsRequest$ProtoShowsRequestItem.q);
                this.r = hVar.s((this.a & 128) == 128, this.r, (showShowsRequest$ProtoShowsRequestItem.a & 128) == 128, showShowsRequest$ProtoShowsRequestItem.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowsRequest$ProtoShowsRequestItem.a;
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
                                String z2 = gVar.z();
                                this.a |= 1;
                                this.b = z2;
                            } else if (B == 18) {
                                ShowMetadata$ProtoShowMetadata.a aVar = (this.a & 2) == 2 ? (ShowMetadata$ProtoShowMetadata.a) this.c.toBuilder() : null;
                                ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = (ShowMetadata$ProtoShowMetadata) gVar.o(ShowMetadata$ProtoShowMetadata.parser(), kVar);
                                this.c = showMetadata$ProtoShowMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((ShowMetadata$ProtoShowMetadata.a) showMetadata$ProtoShowMetadata);
                                    this.c = (ShowMetadata$ProtoShowMetadata) aVar.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                ShowState$ProtoShowCollectionState.a aVar2 = (this.a & 4) == 4 ? (ShowState$ProtoShowCollectionState.a) this.f.toBuilder() : null;
                                ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = (ShowState$ProtoShowCollectionState) gVar.o(ShowState$ProtoShowCollectionState.parser(), kVar);
                                this.f = showState$ProtoShowCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ShowState$ProtoShowCollectionState.a) showState$ProtoShowCollectionState);
                                    this.f = (ShowState$ProtoShowCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 34) {
                                ShowState$ProtoShowPlayState.a aVar3 = (this.a & 8) == 8 ? (ShowState$ProtoShowPlayState.a) this.n.toBuilder() : null;
                                ShowState$ProtoShowPlayState showState$ProtoShowPlayState = (ShowState$ProtoShowPlayState) gVar.o(ShowState$ProtoShowPlayState.parser(), kVar);
                                this.n = showState$ProtoShowPlayState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((ShowState$ProtoShowPlayState.a) showState$ProtoShowPlayState);
                                    this.n = (ShowState$ProtoShowPlayState) aVar3.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.u();
                            } else if (B == 48) {
                                this.a |= 32;
                                this.p = gVar.u();
                            } else if (B == 56) {
                                this.a |= 64;
                                this.q = gVar.h();
                            } else if (B == 64) {
                                this.a |= 128;
                                this.r = gVar.w();
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
                return null;
            case 4:
                return new ShowShowsRequest$ProtoShowsRequestItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (ShowShowsRequest$ProtoShowsRequestItem.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, n());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, m());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, o());
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.s(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.s(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.d(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.u(8, this.r);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.p;
    }

    public boolean i() {
        return this.q;
    }

    public long l() {
        return this.r;
    }

    public ShowState$ProtoShowCollectionState m() {
        ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = this.f;
        return showState$ProtoShowCollectionState == null ? ShowState$ProtoShowCollectionState.h() : showState$ProtoShowCollectionState;
    }

    public ShowMetadata$ProtoShowMetadata n() {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = this.c;
        return showMetadata$ProtoShowMetadata == null ? ShowMetadata$ProtoShowMetadata.l() : showMetadata$ProtoShowMetadata;
    }

    public ShowState$ProtoShowPlayState o() {
        ShowState$ProtoShowPlayState showState$ProtoShowPlayState = this.n;
        return showState$ProtoShowPlayState == null ? ShowState$ProtoShowPlayState.h() : showState$ProtoShowPlayState;
    }

    public boolean p() {
        return (this.a & 4) == 4;
    }

    public boolean q() {
        return (this.a & 2) == 2;
    }

    public boolean r() {
        return (this.a & 8) == 8;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, n());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, m());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, o());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.S(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.S(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.A(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.U(8, this.r);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
