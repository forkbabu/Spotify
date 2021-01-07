package com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.ExperimentOverride;
import java.io.IOException;
import java.util.List;

public final class GetAllPlaylistsResponse extends GeneratedMessageLite<GetAllPlaylistsResponse, b> implements Object {
    private static final GetAllPlaylistsResponse f;
    private static volatile x<GetAllPlaylistsResponse> n;
    private int a;
    private o.i<String> b = GeneratedMessageLite.emptyProtobufList();
    private ExperimentOverride c;

    public static final class b extends GeneratedMessageLite.b<GetAllPlaylistsResponse, b> implements Object {
        private b() {
            super(GetAllPlaylistsResponse.f);
        }
    }

    static {
        GetAllPlaylistsResponse getAllPlaylistsResponse = new GetAllPlaylistsResponse();
        f = getAllPlaylistsResponse;
        getAllPlaylistsResponse.makeImmutable();
    }

    private GetAllPlaylistsResponse() {
    }

    public static x<GetAllPlaylistsResponse> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                GetAllPlaylistsResponse getAllPlaylistsResponse = (GetAllPlaylistsResponse) obj2;
                this.b = hVar.q(this.b, getAllPlaylistsResponse.b);
                this.c = (ExperimentOverride) hVar.i(this.c, getAllPlaylistsResponse.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= getAllPlaylistsResponse.a;
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
                                String A = gVar.A();
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(A);
                            } else if (B == 18) {
                                ExperimentOverride experimentOverride = this.c;
                                ExperimentOverride.b bVar = experimentOverride != null ? (ExperimentOverride.b) experimentOverride.toBuilder() : null;
                                ExperimentOverride experimentOverride2 = (ExperimentOverride) gVar.o(ExperimentOverride.parser(), kVar);
                                this.c = experimentOverride2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ExperimentOverride.b) experimentOverride2);
                                    this.c = (ExperimentOverride) bVar.buildPartial();
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
                this.b.C();
                return null;
            case 4:
                return new GetAllPlaylistsResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (GetAllPlaylistsResponse.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.q(this.b.get(i3));
        }
        int C0 = je.C0(this.b, 1, 0 + i2);
        ExperimentOverride experimentOverride = this.c;
        if (experimentOverride != null) {
            C0 += CodedOutputStream.n(2, experimentOverride);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public List<String> h() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.P(1, this.b.get(i));
        }
        ExperimentOverride experimentOverride = this.c;
        if (experimentOverride != null) {
            codedOutputStream.M(2, experimentOverride);
        }
    }
}
