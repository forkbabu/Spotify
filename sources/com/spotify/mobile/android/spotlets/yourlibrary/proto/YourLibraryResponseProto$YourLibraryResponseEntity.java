package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryAlbumExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryArtistExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryCollectionExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryFolderExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryPlaylistExtraInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryShowExtraInfo;
import java.io.IOException;

public final class YourLibraryResponseProto$YourLibraryResponseEntity extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryResponseEntity, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryResponseEntity f;
    private static volatile x<YourLibraryResponseProto$YourLibraryResponseEntity> n;
    private int a = 0;
    private Object b;
    private YourLibraryResponseProto$YourLibraryEntityInfo c;

    public enum EntityCase implements o.c {
        ALBUM(2),
        ARTIST(3),
        PLAYLIST(4),
        SHOW(5),
        FOLDER(6),
        COLLECTION(7),
        ENTITY_NOT_SET(0);
        
        private final int value;

        private EntityCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryResponseEntity, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryResponseEntity.f);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity = new YourLibraryResponseProto$YourLibraryResponseEntity();
        f = yourLibraryResponseProto$YourLibraryResponseEntity;
        yourLibraryResponseProto$YourLibraryResponseEntity.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryResponseEntity() {
    }

    public static x<YourLibraryResponseProto$YourLibraryResponseEntity> parser() {
        return f.getParserForType();
    }

    public static YourLibraryResponseProto$YourLibraryResponseEntity q(byte[] bArr) {
        return (YourLibraryResponseProto$YourLibraryResponseEntity) GeneratedMessageLite.parseFrom(f, bArr);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity = (YourLibraryResponseProto$YourLibraryResponseEntity) obj2;
                this.c = (YourLibraryResponseProto$YourLibraryEntityInfo) hVar.i(this.c, yourLibraryResponseProto$YourLibraryResponseEntity.c);
                switch (yourLibraryResponseProto$YourLibraryResponseEntity.l().ordinal()) {
                    case 0:
                        if (this.a != 2) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, yourLibraryResponseProto$YourLibraryResponseEntity.b);
                        break;
                    case 1:
                        if (this.a != 3) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, yourLibraryResponseProto$YourLibraryResponseEntity.b);
                        break;
                    case 2:
                        if (this.a != 4) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, yourLibraryResponseProto$YourLibraryResponseEntity.b);
                        break;
                    case 3:
                        if (this.a != 5) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, yourLibraryResponseProto$YourLibraryResponseEntity.b);
                        break;
                    case 4:
                        if (this.a != 6) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, yourLibraryResponseProto$YourLibraryResponseEntity.b);
                        break;
                    case 5:
                        if (this.a != 7) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, yourLibraryResponseProto$YourLibraryResponseEntity.b);
                        break;
                    case 6:
                        if (this.a == 0) {
                            z = false;
                        }
                        hVar.b(z);
                        break;
                }
                if (hVar == GeneratedMessageLite.g.a && (i = yourLibraryResponseProto$YourLibraryResponseEntity.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                YourLibraryResponseProto$YourLibraryEntityInfo yourLibraryResponseProto$YourLibraryEntityInfo = this.c;
                                YourLibraryResponseProto$YourLibraryEntityInfo.a aVar = yourLibraryResponseProto$YourLibraryEntityInfo != null ? (YourLibraryResponseProto$YourLibraryEntityInfo.a) yourLibraryResponseProto$YourLibraryEntityInfo.toBuilder() : null;
                                YourLibraryResponseProto$YourLibraryEntityInfo yourLibraryResponseProto$YourLibraryEntityInfo2 = (YourLibraryResponseProto$YourLibraryEntityInfo) gVar.o(YourLibraryResponseProto$YourLibraryEntityInfo.parser(), kVar);
                                this.c = yourLibraryResponseProto$YourLibraryEntityInfo2;
                                if (aVar != null) {
                                    aVar.mergeFrom((YourLibraryResponseProto$YourLibraryEntityInfo.a) yourLibraryResponseProto$YourLibraryEntityInfo2);
                                    this.c = (YourLibraryResponseProto$YourLibraryEntityInfo) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                YourLibraryResponseProto$YourLibraryAlbumExtraInfo.a aVar2 = this.a == 2 ? (YourLibraryResponseProto$YourLibraryAlbumExtraInfo.a) ((YourLibraryResponseProto$YourLibraryAlbumExtraInfo) this.b).toBuilder() : null;
                                u o = gVar.o(YourLibraryResponseProto$YourLibraryAlbumExtraInfo.parser(), kVar);
                                this.b = o;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((YourLibraryResponseProto$YourLibraryAlbumExtraInfo.a) ((YourLibraryResponseProto$YourLibraryAlbumExtraInfo) o));
                                    this.b = aVar2.buildPartial();
                                }
                                this.a = 2;
                            } else if (B == 26) {
                                YourLibraryResponseProto$YourLibraryArtistExtraInfo.a aVar3 = this.a == 3 ? (YourLibraryResponseProto$YourLibraryArtistExtraInfo.a) ((YourLibraryResponseProto$YourLibraryArtistExtraInfo) this.b).toBuilder() : null;
                                u o2 = gVar.o(YourLibraryResponseProto$YourLibraryArtistExtraInfo.parser(), kVar);
                                this.b = o2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((YourLibraryResponseProto$YourLibraryArtistExtraInfo.a) ((YourLibraryResponseProto$YourLibraryArtistExtraInfo) o2));
                                    this.b = aVar3.buildPartial();
                                }
                                this.a = 3;
                            } else if (B == 34) {
                                YourLibraryResponseProto$YourLibraryPlaylistExtraInfo.a aVar4 = this.a == 4 ? (YourLibraryResponseProto$YourLibraryPlaylistExtraInfo.a) ((YourLibraryResponseProto$YourLibraryPlaylistExtraInfo) this.b).toBuilder() : null;
                                u o3 = gVar.o(YourLibraryResponseProto$YourLibraryPlaylistExtraInfo.parser(), kVar);
                                this.b = o3;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((YourLibraryResponseProto$YourLibraryPlaylistExtraInfo.a) ((YourLibraryResponseProto$YourLibraryPlaylistExtraInfo) o3));
                                    this.b = aVar4.buildPartial();
                                }
                                this.a = 4;
                            } else if (B == 42) {
                                YourLibraryResponseProto$YourLibraryShowExtraInfo.a aVar5 = this.a == 5 ? (YourLibraryResponseProto$YourLibraryShowExtraInfo.a) ((YourLibraryResponseProto$YourLibraryShowExtraInfo) this.b).toBuilder() : null;
                                u o4 = gVar.o(YourLibraryResponseProto$YourLibraryShowExtraInfo.parser(), kVar);
                                this.b = o4;
                                if (aVar5 != null) {
                                    aVar5.mergeFrom((YourLibraryResponseProto$YourLibraryShowExtraInfo.a) ((YourLibraryResponseProto$YourLibraryShowExtraInfo) o4));
                                    this.b = aVar5.buildPartial();
                                }
                                this.a = 5;
                            } else if (B == 50) {
                                YourLibraryResponseProto$YourLibraryFolderExtraInfo.a aVar6 = this.a == 6 ? (YourLibraryResponseProto$YourLibraryFolderExtraInfo.a) ((YourLibraryResponseProto$YourLibraryFolderExtraInfo) this.b).toBuilder() : null;
                                u o5 = gVar.o(YourLibraryResponseProto$YourLibraryFolderExtraInfo.parser(), kVar);
                                this.b = o5;
                                if (aVar6 != null) {
                                    aVar6.mergeFrom((YourLibraryResponseProto$YourLibraryFolderExtraInfo.a) ((YourLibraryResponseProto$YourLibraryFolderExtraInfo) o5));
                                    this.b = aVar6.buildPartial();
                                }
                                this.a = 6;
                            } else if (B == 58) {
                                YourLibraryResponseProto$YourLibraryCollectionExtraInfo.a aVar7 = this.a == 7 ? (YourLibraryResponseProto$YourLibraryCollectionExtraInfo.a) ((YourLibraryResponseProto$YourLibraryCollectionExtraInfo) this.b).toBuilder() : null;
                                u o6 = gVar.o(YourLibraryResponseProto$YourLibraryCollectionExtraInfo.parser(), kVar);
                                this.b = o6;
                                if (aVar7 != null) {
                                    aVar7.mergeFrom((YourLibraryResponseProto$YourLibraryCollectionExtraInfo.a) ((YourLibraryResponseProto$YourLibraryCollectionExtraInfo) o6));
                                    this.b = aVar7.buildPartial();
                                }
                                this.a = 7;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return new YourLibraryResponseProto$YourLibraryResponseEntity();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryResponseEntity.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.c != null) {
            i2 = 0 + CodedOutputStream.n(1, m());
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (YourLibraryResponseProto$YourLibraryAlbumExtraInfo) this.b);
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.n(3, (YourLibraryResponseProto$YourLibraryArtistExtraInfo) this.b);
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.n(4, (YourLibraryResponseProto$YourLibraryPlaylistExtraInfo) this.b);
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (YourLibraryResponseProto$YourLibraryShowExtraInfo) this.b);
        }
        if (this.a == 6) {
            i2 += CodedOutputStream.n(6, (YourLibraryResponseProto$YourLibraryFolderExtraInfo) this.b);
        }
        if (this.a == 7) {
            i2 += CodedOutputStream.n(7, (YourLibraryResponseProto$YourLibraryCollectionExtraInfo) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public YourLibraryResponseProto$YourLibraryAlbumExtraInfo h() {
        if (this.a == 2) {
            return (YourLibraryResponseProto$YourLibraryAlbumExtraInfo) this.b;
        }
        return YourLibraryResponseProto$YourLibraryAlbumExtraInfo.i();
    }

    public YourLibraryResponseProto$YourLibraryCollectionExtraInfo i() {
        if (this.a == 7) {
            return (YourLibraryResponseProto$YourLibraryCollectionExtraInfo) this.b;
        }
        return YourLibraryResponseProto$YourLibraryCollectionExtraInfo.h();
    }

    public EntityCase l() {
        int i = this.a;
        if (i == 0) {
            return EntityCase.ENTITY_NOT_SET;
        }
        switch (i) {
            case 2:
                return EntityCase.ALBUM;
            case 3:
                return EntityCase.ARTIST;
            case 4:
                return EntityCase.PLAYLIST;
            case 5:
                return EntityCase.SHOW;
            case 6:
                return EntityCase.FOLDER;
            case 7:
                return EntityCase.COLLECTION;
            default:
                return null;
        }
    }

    public YourLibraryResponseProto$YourLibraryEntityInfo m() {
        YourLibraryResponseProto$YourLibraryEntityInfo yourLibraryResponseProto$YourLibraryEntityInfo = this.c;
        return yourLibraryResponseProto$YourLibraryEntityInfo == null ? YourLibraryResponseProto$YourLibraryEntityInfo.h() : yourLibraryResponseProto$YourLibraryEntityInfo;
    }

    public YourLibraryResponseProto$YourLibraryFolderExtraInfo n() {
        if (this.a == 6) {
            return (YourLibraryResponseProto$YourLibraryFolderExtraInfo) this.b;
        }
        return YourLibraryResponseProto$YourLibraryFolderExtraInfo.h();
    }

    public YourLibraryResponseProto$YourLibraryPlaylistExtraInfo o() {
        if (this.a == 4) {
            return (YourLibraryResponseProto$YourLibraryPlaylistExtraInfo) this.b;
        }
        return YourLibraryResponseProto$YourLibraryPlaylistExtraInfo.i();
    }

    public YourLibraryResponseProto$YourLibraryShowExtraInfo p() {
        if (this.a == 5) {
            return (YourLibraryResponseProto$YourLibraryShowExtraInfo) this.b;
        }
        return YourLibraryResponseProto$YourLibraryShowExtraInfo.i();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.c != null) {
            codedOutputStream.M(1, m());
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (YourLibraryResponseProto$YourLibraryAlbumExtraInfo) this.b);
        }
        if (this.a == 3) {
            codedOutputStream.M(3, (YourLibraryResponseProto$YourLibraryArtistExtraInfo) this.b);
        }
        if (this.a == 4) {
            codedOutputStream.M(4, (YourLibraryResponseProto$YourLibraryPlaylistExtraInfo) this.b);
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (YourLibraryResponseProto$YourLibraryShowExtraInfo) this.b);
        }
        if (this.a == 6) {
            codedOutputStream.M(6, (YourLibraryResponseProto$YourLibraryFolderExtraInfo) this.b);
        }
        if (this.a == 7) {
            codedOutputStream.M(7, (YourLibraryResponseProto$YourLibraryCollectionExtraInfo) this.b);
        }
    }
}
