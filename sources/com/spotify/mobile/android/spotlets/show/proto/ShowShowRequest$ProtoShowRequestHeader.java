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

public final class ShowShowRequest$ProtoShowRequestHeader extends GeneratedMessageLite<ShowShowRequest$ProtoShowRequestHeader, a> implements Object {
    private static final ShowShowRequest$ProtoShowRequestHeader n;
    private static volatile x<ShowShowRequest$ProtoShowRequestHeader> o;
    private int a;
    private ShowMetadata$ProtoShowMetadata b;
    private ShowState$ProtoShowCollectionState c;
    private ShowState$ProtoShowPlayState f;

    public static final class a extends GeneratedMessageLite.b<ShowShowRequest$ProtoShowRequestHeader, a> implements Object {
        private a() {
            super(ShowShowRequest$ProtoShowRequestHeader.n);
        }
    }

    static {
        ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = new ShowShowRequest$ProtoShowRequestHeader();
        n = showShowRequest$ProtoShowRequestHeader;
        showShowRequest$ProtoShowRequestHeader.makeImmutable();
    }

    private ShowShowRequest$ProtoShowRequestHeader() {
    }

    public static ShowShowRequest$ProtoShowRequestHeader h() {
        return n;
    }

    public static x<ShowShowRequest$ProtoShowRequestHeader> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = (ShowShowRequest$ProtoShowRequestHeader) obj2;
                this.b = (ShowMetadata$ProtoShowMetadata) hVar.i(this.b, showShowRequest$ProtoShowRequestHeader.b);
                this.c = (ShowState$ProtoShowCollectionState) hVar.i(this.c, showShowRequest$ProtoShowRequestHeader.c);
                this.f = (ShowState$ProtoShowPlayState) hVar.i(this.f, showShowRequest$ProtoShowRequestHeader.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowRequest$ProtoShowRequestHeader.a;
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
                                ShowMetadata$ProtoShowMetadata.a aVar = (this.a & 1) == 1 ? (ShowMetadata$ProtoShowMetadata.a) this.b.toBuilder() : null;
                                ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = (ShowMetadata$ProtoShowMetadata) gVar.o(ShowMetadata$ProtoShowMetadata.parser(), kVar);
                                this.b = showMetadata$ProtoShowMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((ShowMetadata$ProtoShowMetadata.a) showMetadata$ProtoShowMetadata);
                                    this.b = (ShowMetadata$ProtoShowMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                ShowState$ProtoShowCollectionState.a aVar2 = (this.a & 2) == 2 ? (ShowState$ProtoShowCollectionState.a) this.c.toBuilder() : null;
                                ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = (ShowState$ProtoShowCollectionState) gVar.o(ShowState$ProtoShowCollectionState.parser(), kVar);
                                this.c = showState$ProtoShowCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ShowState$ProtoShowCollectionState.a) showState$ProtoShowCollectionState);
                                    this.c = (ShowState$ProtoShowCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                ShowState$ProtoShowPlayState.a aVar3 = (this.a & 4) == 4 ? (ShowState$ProtoShowPlayState.a) this.f.toBuilder() : null;
                                ShowState$ProtoShowPlayState showState$ProtoShowPlayState = (ShowState$ProtoShowPlayState) gVar.o(ShowState$ProtoShowPlayState.parser(), kVar);
                                this.f = showState$ProtoShowPlayState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((ShowState$ProtoShowPlayState.a) showState$ProtoShowPlayState);
                                    this.f = (ShowState$ProtoShowPlayState) aVar3.buildPartial();
                                }
                                this.a |= 4;
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
                return new ShowShowRequest$ProtoShowRequestHeader();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (ShowShowRequest$ProtoShowRequestHeader.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, l());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, i());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, m());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ShowState$ProtoShowCollectionState i() {
        ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = this.c;
        return showState$ProtoShowCollectionState == null ? ShowState$ProtoShowCollectionState.h() : showState$ProtoShowCollectionState;
    }

    public ShowMetadata$ProtoShowMetadata l() {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = this.b;
        return showMetadata$ProtoShowMetadata == null ? ShowMetadata$ProtoShowMetadata.l() : showMetadata$ProtoShowMetadata;
    }

    public ShowState$ProtoShowPlayState m() {
        ShowState$ProtoShowPlayState showState$ProtoShowPlayState = this.f;
        return showState$ProtoShowPlayState == null ? ShowState$ProtoShowPlayState.h() : showState$ProtoShowPlayState;
    }

    public boolean n() {
        return (this.a & 2) == 2;
    }

    public boolean o() {
        return (this.a & 1) == 1;
    }

    public boolean p() {
        return (this.a & 4) == 4;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, l());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, i());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, m());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
