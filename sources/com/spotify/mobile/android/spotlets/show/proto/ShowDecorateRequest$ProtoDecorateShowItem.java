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

public final class ShowDecorateRequest$ProtoDecorateShowItem extends GeneratedMessageLite<ShowDecorateRequest$ProtoDecorateShowItem, a> implements Object {
    private static final ShowDecorateRequest$ProtoDecorateShowItem o;
    private static volatile x<ShowDecorateRequest$ProtoDecorateShowItem> p;
    private int a;
    private ShowMetadata$ProtoShowMetadata b;
    private ShowState$ProtoShowCollectionState c;
    private ShowState$ProtoShowPlayState f;
    private String n = "";

    public static final class a extends GeneratedMessageLite.b<ShowDecorateRequest$ProtoDecorateShowItem, a> implements Object {
        private a() {
            super(ShowDecorateRequest$ProtoDecorateShowItem.o);
        }
    }

    static {
        ShowDecorateRequest$ProtoDecorateShowItem showDecorateRequest$ProtoDecorateShowItem = new ShowDecorateRequest$ProtoDecorateShowItem();
        o = showDecorateRequest$ProtoDecorateShowItem;
        showDecorateRequest$ProtoDecorateShowItem.makeImmutable();
    }

    private ShowDecorateRequest$ProtoDecorateShowItem() {
    }

    public static x<ShowDecorateRequest$ProtoDecorateShowItem> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowDecorateRequest$ProtoDecorateShowItem showDecorateRequest$ProtoDecorateShowItem = (ShowDecorateRequest$ProtoDecorateShowItem) obj2;
                this.b = (ShowMetadata$ProtoShowMetadata) hVar.i(this.b, showDecorateRequest$ProtoDecorateShowItem.b);
                this.c = (ShowState$ProtoShowCollectionState) hVar.i(this.c, showDecorateRequest$ProtoDecorateShowItem.c);
                this.f = (ShowState$ProtoShowPlayState) hVar.i(this.f, showDecorateRequest$ProtoDecorateShowItem.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((showDecorateRequest$ProtoDecorateShowItem.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, showDecorateRequest$ProtoDecorateShowItem.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showDecorateRequest$ProtoDecorateShowItem.a;
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
                            } else if (B == 34) {
                                String z3 = gVar.z();
                                this.a |= 8;
                                this.n = z3;
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
                return new ShowDecorateRequest$ProtoDecorateShowItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ShowDecorateRequest$ProtoDecorateShowItem.class) {
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
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String h() {
        return this.n;
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
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
