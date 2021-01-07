package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsContextPlayerState$PlaybackQuality extends GeneratedMessageLite<EsContextPlayerState$PlaybackQuality, a> implements Object {
    private static final EsContextPlayerState$PlaybackQuality b;
    private static volatile x<EsContextPlayerState$PlaybackQuality> c;
    private int a;

    public enum BitrateLevel implements o.c {
        UNKNOWN(0),
        LOW(1),
        NORMAL(2),
        HIGH(3),
        VERY_HIGH(4),
        NORMALIZED(5),
        UNRECOGNIZED(-1);
        
        private final int value;

        private BitrateLevel(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<EsContextPlayerState$PlaybackQuality, a> implements Object {
        private a() {
            super(EsContextPlayerState$PlaybackQuality.b);
        }
    }

    static {
        EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = new EsContextPlayerState$PlaybackQuality();
        b = esContextPlayerState$PlaybackQuality;
        esContextPlayerState$PlaybackQuality.makeImmutable();
    }

    private EsContextPlayerState$PlaybackQuality() {
    }

    public static EsContextPlayerState$PlaybackQuality i() {
        return b;
    }

    public static x<EsContextPlayerState$PlaybackQuality> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = (EsContextPlayerState$PlaybackQuality) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = esContextPlayerState$PlaybackQuality.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
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
                return new EsContextPlayerState$PlaybackQuality();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (EsContextPlayerState$PlaybackQuality.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a != BitrateLevel.UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public BitrateLevel h() {
        BitrateLevel bitrateLevel;
        int i = this.a;
        if (i == 0) {
            bitrateLevel = BitrateLevel.UNKNOWN;
        } else if (i == 1) {
            bitrateLevel = BitrateLevel.LOW;
        } else if (i == 2) {
            bitrateLevel = BitrateLevel.NORMAL;
        } else if (i == 3) {
            bitrateLevel = BitrateLevel.HIGH;
        } else if (i == 4) {
            bitrateLevel = BitrateLevel.VERY_HIGH;
        } else if (i != 5) {
            bitrateLevel = null;
        } else {
            bitrateLevel = BitrateLevel.NORMALIZED;
        }
        return bitrateLevel == null ? BitrateLevel.UNRECOGNIZED : bitrateLevel;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != BitrateLevel.UNKNOWN.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
    }
}
