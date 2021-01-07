package com.spotify.collection.endpoints.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class TrackListMetadata$ProtoTrackListMetadataResponse extends GeneratedMessageLite<TrackListMetadata$ProtoTrackListMetadataResponse, a> implements Object {
    private static final TrackListMetadata$ProtoTrackListMetadataResponse o;
    private static volatile x<TrackListMetadata$ProtoTrackListMetadataResponse> p;
    private int a;
    private int b;
    private int c;
    private String f = "";
    private int n;

    public static final class a extends GeneratedMessageLite.b<TrackListMetadata$ProtoTrackListMetadataResponse, a> implements Object {
        private a() {
            super(TrackListMetadata$ProtoTrackListMetadataResponse.o);
        }
    }

    static {
        TrackListMetadata$ProtoTrackListMetadataResponse trackListMetadata$ProtoTrackListMetadataResponse = new TrackListMetadata$ProtoTrackListMetadataResponse();
        o = trackListMetadata$ProtoTrackListMetadataResponse;
        trackListMetadata$ProtoTrackListMetadataResponse.makeImmutable();
    }

    private TrackListMetadata$ProtoTrackListMetadataResponse() {
    }

    public static x<TrackListMetadata$ProtoTrackListMetadataResponse> parser() {
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
                TrackListMetadata$ProtoTrackListMetadataResponse trackListMetadata$ProtoTrackListMetadataResponse = (TrackListMetadata$ProtoTrackListMetadataResponse) obj2;
                this.b = hVar.m((this.a & 1) == 1, this.b, (trackListMetadata$ProtoTrackListMetadataResponse.a & 1) == 1, trackListMetadata$ProtoTrackListMetadataResponse.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (trackListMetadata$ProtoTrackListMetadataResponse.a & 2) == 2, trackListMetadata$ProtoTrackListMetadataResponse.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (trackListMetadata$ProtoTrackListMetadataResponse.a & 4) == 4, trackListMetadata$ProtoTrackListMetadataResponse.f);
                boolean z2 = (this.a & 8) == 8;
                int i = this.n;
                if ((trackListMetadata$ProtoTrackListMetadataResponse.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.m(z2, i, z, trackListMetadata$ProtoTrackListMetadataResponse.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= trackListMetadata$ProtoTrackListMetadataResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.u();
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
                            } else if (B == 26) {
                                String z3 = gVar.z();
                                this.a |= 4;
                                this.f = z3;
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.u();
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
                return new TrackListMetadata$ProtoTrackListMetadataResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (TrackListMetadata$ProtoTrackListMetadataResponse.class) {
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
            i2 = 0 + CodedOutputStream.s(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.c;
    }

    public String i() {
        return this.f;
    }

    public int l() {
        return this.n;
    }

    public int m() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.S(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
