package com.spotify.metadata.voice.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Metadata$AudioFile extends GeneratedMessageLite<Metadata$AudioFile, a> implements Object {
    private static final Metadata$AudioFile f;
    private static volatile x<Metadata$AudioFile> n;
    private int a;
    private ByteString b = ByteString.a;
    private int c;

    public enum Format implements o.c {
        OGG_VORBIS_96(0),
        OGG_VORBIS_160(1),
        OGG_VORBIS_320(2),
        MP3_256(3),
        MP3_320(4),
        MP3_160(5),
        MP3_96(6),
        MP3_160_ENC(7),
        AAC_24(8),
        AAC_48(9),
        MP4_128(10),
        MP4_256(11),
        MP4_128_DUAL(12),
        MP4_256_DUAL(13),
        MP4_128_CBCS(14),
        MP4_256_CBCS(15),
        FLAC_FLAC(16),
        MP4_FLAC(17);
        
        private final int value;

        private Format(int i) {
            this.value = i;
        }

        public static Format d(int i) {
            switch (i) {
                case 0:
                    return OGG_VORBIS_96;
                case 1:
                    return OGG_VORBIS_160;
                case 2:
                    return OGG_VORBIS_320;
                case 3:
                    return MP3_256;
                case 4:
                    return MP3_320;
                case 5:
                    return MP3_160;
                case 6:
                    return MP3_96;
                case 7:
                    return MP3_160_ENC;
                case 8:
                    return AAC_24;
                case 9:
                    return AAC_48;
                case 10:
                    return MP4_128;
                case 11:
                    return MP4_256;
                case 12:
                    return MP4_128_DUAL;
                case 13:
                    return MP4_256_DUAL;
                case 14:
                    return MP4_128_CBCS;
                case 15:
                    return MP4_256_CBCS;
                case 16:
                    return FLAC_FLAC;
                case 17:
                    return MP4_FLAC;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Metadata$AudioFile, a> implements Object {
        private a() {
            super(Metadata$AudioFile.f);
        }
    }

    static {
        Metadata$AudioFile metadata$AudioFile = new Metadata$AudioFile();
        f = metadata$AudioFile;
        metadata$AudioFile.makeImmutable();
    }

    private Metadata$AudioFile() {
    }

    public static x<Metadata$AudioFile> parser() {
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
                Metadata$AudioFile metadata$AudioFile = (Metadata$AudioFile) obj2;
                this.b = hVar.r((this.a & 1) == 1, this.b, (metadata$AudioFile.a & 1) == 1, metadata$AudioFile.b);
                boolean z2 = (this.a & 2) == 2;
                int i = this.c;
                if ((metadata$AudioFile.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, metadata$AudioFile.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$AudioFile.a;
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
                                this.a |= 1;
                                this.b = gVar.i();
                            } else if (B == 16) {
                                int u = gVar.u();
                                if (Format.d(u) == null) {
                                    super.mergeVarintField(2, u);
                                } else {
                                    this.a |= 2;
                                    this.c = u;
                                }
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
                return new Metadata$AudioFile();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Metadata$AudioFile.class) {
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
            i2 = 0 + CodedOutputStream.e(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.h(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ByteString h() {
        return this.b;
    }

    public Format i() {
        Format d = Format.d(this.c);
        return d == null ? Format.OGG_VORBIS_96 : d;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.C(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.K(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
