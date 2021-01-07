package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestShowExtraInfo;
import java.io.IOException;

public final class YourLibraryRequestProto$YourLibraryRequestEntity extends GeneratedMessageLite<YourLibraryRequestProto$YourLibraryRequestEntity, a> implements Object {
    private static final YourLibraryRequestProto$YourLibraryRequestEntity q;
    private static volatile x<YourLibraryRequestProto$YourLibraryRequestEntity> r;
    private YourLibraryRequestProto$YourLibraryRequestEntityInfo a;
    private YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo b;
    private YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo c;
    private YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo f;
    private YourLibraryRequestProto$YourLibraryRequestShowExtraInfo n;
    private YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo o;
    private YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo p;

    public static final class a extends GeneratedMessageLite.b<YourLibraryRequestProto$YourLibraryRequestEntity, a> implements Object {
        public a m(YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) {
            copyOnWrite();
            YourLibraryRequestProto$YourLibraryRequestEntity.i((YourLibraryRequestProto$YourLibraryRequestEntity) this.instance, yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo);
            return this;
        }

        public a n(YourLibraryRequestProto$YourLibraryRequestShowExtraInfo yourLibraryRequestProto$YourLibraryRequestShowExtraInfo) {
            copyOnWrite();
            YourLibraryRequestProto$YourLibraryRequestEntity.h((YourLibraryRequestProto$YourLibraryRequestEntity) this.instance, yourLibraryRequestProto$YourLibraryRequestShowExtraInfo);
            return this;
        }

        private a() {
            super(YourLibraryRequestProto$YourLibraryRequestEntity.q);
        }
    }

    static {
        YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity = new YourLibraryRequestProto$YourLibraryRequestEntity();
        q = yourLibraryRequestProto$YourLibraryRequestEntity;
        yourLibraryRequestProto$YourLibraryRequestEntity.makeImmutable();
    }

    private YourLibraryRequestProto$YourLibraryRequestEntity() {
    }

    static void h(YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity, YourLibraryRequestProto$YourLibraryRequestShowExtraInfo yourLibraryRequestProto$YourLibraryRequestShowExtraInfo) {
        yourLibraryRequestProto$YourLibraryRequestEntity.getClass();
        yourLibraryRequestProto$YourLibraryRequestShowExtraInfo.getClass();
        yourLibraryRequestProto$YourLibraryRequestEntity.n = yourLibraryRequestProto$YourLibraryRequestShowExtraInfo;
    }

    static void i(YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity, YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) {
        yourLibraryRequestProto$YourLibraryRequestEntity.getClass();
        yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.getClass();
        yourLibraryRequestProto$YourLibraryRequestEntity.p = yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo;
    }

    public static a l() {
        return (a) q.toBuilder();
    }

    public static x<YourLibraryRequestProto$YourLibraryRequestEntity> parser() {
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
                YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity = (YourLibraryRequestProto$YourLibraryRequestEntity) obj2;
                this.a = (YourLibraryRequestProto$YourLibraryRequestEntityInfo) hVar.i(this.a, yourLibraryRequestProto$YourLibraryRequestEntity.a);
                this.b = (YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo) hVar.i(this.b, yourLibraryRequestProto$YourLibraryRequestEntity.b);
                this.c = (YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo) hVar.i(this.c, yourLibraryRequestProto$YourLibraryRequestEntity.c);
                this.f = (YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo) hVar.i(this.f, yourLibraryRequestProto$YourLibraryRequestEntity.f);
                this.n = (YourLibraryRequestProto$YourLibraryRequestShowExtraInfo) hVar.i(this.n, yourLibraryRequestProto$YourLibraryRequestEntity.n);
                this.o = (YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo) hVar.i(this.o, yourLibraryRequestProto$YourLibraryRequestEntity.o);
                this.p = (YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) hVar.i(this.p, yourLibraryRequestProto$YourLibraryRequestEntity.p);
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
                                YourLibraryRequestProto$YourLibraryRequestEntityInfo yourLibraryRequestProto$YourLibraryRequestEntityInfo = this.a;
                                YourLibraryRequestProto$YourLibraryRequestEntityInfo.a aVar = yourLibraryRequestProto$YourLibraryRequestEntityInfo != null ? (YourLibraryRequestProto$YourLibraryRequestEntityInfo.a) yourLibraryRequestProto$YourLibraryRequestEntityInfo.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestEntityInfo yourLibraryRequestProto$YourLibraryRequestEntityInfo2 = (YourLibraryRequestProto$YourLibraryRequestEntityInfo) gVar.o(YourLibraryRequestProto$YourLibraryRequestEntityInfo.parser(), kVar);
                                this.a = yourLibraryRequestProto$YourLibraryRequestEntityInfo2;
                                if (aVar != null) {
                                    aVar.mergeFrom((YourLibraryRequestProto$YourLibraryRequestEntityInfo.a) yourLibraryRequestProto$YourLibraryRequestEntityInfo2);
                                    this.a = (YourLibraryRequestProto$YourLibraryRequestEntityInfo) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo = this.b;
                                YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo.a aVar2 = yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo != null ? (YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo2 = (YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo) gVar.o(YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo.parser(), kVar);
                                this.b = yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo2);
                                    this.b = (YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo = this.c;
                                YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo.a aVar3 = yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo != null ? (YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo2 = (YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo) gVar.o(YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo.parser(), kVar);
                                this.c = yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo2);
                                    this.c = (YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo) aVar3.buildPartial();
                                }
                            } else if (B == 34) {
                                YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo = this.f;
                                YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo.a aVar4 = yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo != null ? (YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo2 = (YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo) gVar.o(YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo.parser(), kVar);
                                this.f = yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo2;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo2);
                                    this.f = (YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo) aVar4.buildPartial();
                                }
                            } else if (B == 42) {
                                YourLibraryRequestProto$YourLibraryRequestShowExtraInfo yourLibraryRequestProto$YourLibraryRequestShowExtraInfo = this.n;
                                YourLibraryRequestProto$YourLibraryRequestShowExtraInfo.a aVar5 = yourLibraryRequestProto$YourLibraryRequestShowExtraInfo != null ? (YourLibraryRequestProto$YourLibraryRequestShowExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestShowExtraInfo.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestShowExtraInfo yourLibraryRequestProto$YourLibraryRequestShowExtraInfo2 = (YourLibraryRequestProto$YourLibraryRequestShowExtraInfo) gVar.o(YourLibraryRequestProto$YourLibraryRequestShowExtraInfo.parser(), kVar);
                                this.n = yourLibraryRequestProto$YourLibraryRequestShowExtraInfo2;
                                if (aVar5 != null) {
                                    aVar5.mergeFrom((YourLibraryRequestProto$YourLibraryRequestShowExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestShowExtraInfo2);
                                    this.n = (YourLibraryRequestProto$YourLibraryRequestShowExtraInfo) aVar5.buildPartial();
                                }
                            } else if (B == 50) {
                                YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo = this.o;
                                YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo.a aVar6 = yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo != null ? (YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo2 = (YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo) gVar.o(YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo.parser(), kVar);
                                this.o = yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo2;
                                if (aVar6 != null) {
                                    aVar6.mergeFrom((YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo2);
                                    this.o = (YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo) aVar6.buildPartial();
                                }
                            } else if (B == 58) {
                                YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo = this.p;
                                YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.a aVar7 = yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo != null ? (YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo2 = (YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) gVar.o(YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.parser(), kVar);
                                this.p = yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo2;
                                if (aVar7 != null) {
                                    aVar7.mergeFrom((YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.a) yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo2);
                                    this.p = (YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) aVar7.buildPartial();
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
                return new YourLibraryRequestProto$YourLibraryRequestEntity();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (YourLibraryRequestProto$YourLibraryRequestEntity.class) {
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
        YourLibraryRequestProto$YourLibraryRequestEntityInfo yourLibraryRequestProto$YourLibraryRequestEntityInfo = this.a;
        if (yourLibraryRequestProto$YourLibraryRequestEntityInfo != null) {
            i2 = 0 + CodedOutputStream.n(1, yourLibraryRequestProto$YourLibraryRequestEntityInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo = this.b;
        if (yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo != null) {
            i2 += CodedOutputStream.n(2, yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo = this.c;
        if (yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo != null) {
            i2 += CodedOutputStream.n(3, yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo = this.f;
        if (yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo != null) {
            i2 += CodedOutputStream.n(4, yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestShowExtraInfo yourLibraryRequestProto$YourLibraryRequestShowExtraInfo = this.n;
        if (yourLibraryRequestProto$YourLibraryRequestShowExtraInfo != null) {
            i2 += CodedOutputStream.n(5, yourLibraryRequestProto$YourLibraryRequestShowExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo = this.o;
        if (yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo != null) {
            i2 += CodedOutputStream.n(6, yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo = this.p;
        if (yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo != null) {
            i2 += CodedOutputStream.n(7, yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        YourLibraryRequestProto$YourLibraryRequestEntityInfo yourLibraryRequestProto$YourLibraryRequestEntityInfo = this.a;
        if (yourLibraryRequestProto$YourLibraryRequestEntityInfo != null) {
            codedOutputStream.M(1, yourLibraryRequestProto$YourLibraryRequestEntityInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo = this.b;
        if (yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo != null) {
            codedOutputStream.M(2, yourLibraryRequestProto$YourLibraryRequestAlbumExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestArtistExtraInfo yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo = this.c;
        if (yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo != null) {
            codedOutputStream.M(3, yourLibraryRequestProto$YourLibraryRequestArtistExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo = this.f;
        if (yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo != null) {
            codedOutputStream.M(4, yourLibraryRequestProto$YourLibraryRequestPlaylistExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestShowExtraInfo yourLibraryRequestProto$YourLibraryRequestShowExtraInfo = this.n;
        if (yourLibraryRequestProto$YourLibraryRequestShowExtraInfo != null) {
            codedOutputStream.M(5, yourLibraryRequestProto$YourLibraryRequestShowExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestFolderExtraInfo yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo = this.o;
        if (yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo != null) {
            codedOutputStream.M(6, yourLibraryRequestProto$YourLibraryRequestFolderExtraInfo);
        }
        YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo = this.p;
        if (yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo != null) {
            codedOutputStream.M(7, yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo);
        }
    }
}
