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

public final class ListenLaterCosmosResponse$ProtoListenLaterShowItem extends GeneratedMessageLite<ListenLaterCosmosResponse$ProtoListenLaterShowItem, a> implements Object {
    private static final ListenLaterCosmosResponse$ProtoListenLaterShowItem n;
    private static volatile x<ListenLaterCosmosResponse$ProtoListenLaterShowItem> o;
    private int a;
    private ShowMetadata$ProtoShowMetadata b;
    private ShowState$ProtoShowCollectionState c;
    private ShowState$ProtoShowPlayState f;

    public static final class a extends GeneratedMessageLite.b<ListenLaterCosmosResponse$ProtoListenLaterShowItem, a> implements Object {
        private a() {
            super(ListenLaterCosmosResponse$ProtoListenLaterShowItem.n);
        }
    }

    static {
        ListenLaterCosmosResponse$ProtoListenLaterShowItem listenLaterCosmosResponse$ProtoListenLaterShowItem = new ListenLaterCosmosResponse$ProtoListenLaterShowItem();
        n = listenLaterCosmosResponse$ProtoListenLaterShowItem;
        listenLaterCosmosResponse$ProtoListenLaterShowItem.makeImmutable();
    }

    private ListenLaterCosmosResponse$ProtoListenLaterShowItem() {
    }

    public static x<ListenLaterCosmosResponse$ProtoListenLaterShowItem> parser() {
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
                ListenLaterCosmosResponse$ProtoListenLaterShowItem listenLaterCosmosResponse$ProtoListenLaterShowItem = (ListenLaterCosmosResponse$ProtoListenLaterShowItem) obj2;
                this.b = (ShowMetadata$ProtoShowMetadata) hVar.i(this.b, listenLaterCosmosResponse$ProtoListenLaterShowItem.b);
                this.c = (ShowState$ProtoShowCollectionState) hVar.i(this.c, listenLaterCosmosResponse$ProtoListenLaterShowItem.c);
                this.f = (ShowState$ProtoShowPlayState) hVar.i(this.f, listenLaterCosmosResponse$ProtoListenLaterShowItem.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= listenLaterCosmosResponse$ProtoListenLaterShowItem.a;
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
                return new ListenLaterCosmosResponse$ProtoListenLaterShowItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (ListenLaterCosmosResponse$ProtoListenLaterShowItem.class) {
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
            ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = this.b;
            if (showMetadata$ProtoShowMetadata == null) {
                showMetadata$ProtoShowMetadata = ShowMetadata$ProtoShowMetadata.l();
            }
            i2 = 0 + CodedOutputStream.n(1, showMetadata$ProtoShowMetadata);
        }
        if ((this.a & 2) == 2) {
            ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = this.c;
            if (showState$ProtoShowCollectionState == null) {
                showState$ProtoShowCollectionState = ShowState$ProtoShowCollectionState.h();
            }
            i2 += CodedOutputStream.n(2, showState$ProtoShowCollectionState);
        }
        if ((this.a & 4) == 4) {
            ShowState$ProtoShowPlayState showState$ProtoShowPlayState = this.f;
            if (showState$ProtoShowPlayState == null) {
                showState$ProtoShowPlayState = ShowState$ProtoShowPlayState.h();
            }
            i2 += CodedOutputStream.n(3, showState$ProtoShowPlayState);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = this.b;
            if (showMetadata$ProtoShowMetadata == null) {
                showMetadata$ProtoShowMetadata = ShowMetadata$ProtoShowMetadata.l();
            }
            codedOutputStream.M(1, showMetadata$ProtoShowMetadata);
        }
        if ((this.a & 2) == 2) {
            ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = this.c;
            if (showState$ProtoShowCollectionState == null) {
                showState$ProtoShowCollectionState = ShowState$ProtoShowCollectionState.h();
            }
            codedOutputStream.M(2, showState$ProtoShowCollectionState);
        }
        if ((this.a & 4) == 4) {
            ShowState$ProtoShowPlayState showState$ProtoShowPlayState = this.f;
            if (showState$ProtoShowPlayState == null) {
                showState$ProtoShowPlayState = ShowState$ProtoShowPlayState.h();
            }
            codedOutputStream.M(3, showState$ProtoShowPlayState);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
