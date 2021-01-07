package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute extends GeneratedMessageLite<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute, a> implements Object {
    private static final PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute f;
    private static volatile x<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> n;
    private int a;
    private String b = "";
    private String c = "";

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute, a> implements Object {
        private a() {
            super(PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute.f);
        }
    }

    static {
        PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute = new PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute();
        f = playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute;
        playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.makeImmutable();
    }

    private PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute() {
    }

    public static x<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute = (PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.a & 1) == 1, playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
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
                return new PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
