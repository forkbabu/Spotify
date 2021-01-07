package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class PlaylistContainsRequest$ContainsResponse extends GeneratedMessageLite<PlaylistContainsRequest$ContainsResponse, a> implements Object {
    private static final PlaylistContainsRequest$ContainsResponse b;
    private static volatile x<PlaylistContainsRequest$ContainsResponse> c;
    private o.a a = GeneratedMessageLite.emptyBooleanList();

    public static final class a extends GeneratedMessageLite.b<PlaylistContainsRequest$ContainsResponse, a> implements Object {
        private a() {
            super(PlaylistContainsRequest$ContainsResponse.b);
        }
    }

    static {
        PlaylistContainsRequest$ContainsResponse playlistContainsRequest$ContainsResponse = new PlaylistContainsRequest$ContainsResponse();
        b = playlistContainsRequest$ContainsResponse;
        playlistContainsRequest$ContainsResponse.makeImmutable();
    }

    private PlaylistContainsRequest$ContainsResponse() {
    }

    public static PlaylistContainsRequest$ContainsResponse h() {
        return b;
    }

    public static x<PlaylistContainsRequest$ContainsResponse> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).l(this.a, ((PlaylistContainsRequest$ContainsResponse) obj2).a);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.b0(gVar.h());
                            } else if (B == 10) {
                                int u = gVar.u();
                                int g = gVar.g(u);
                                if (!this.a.R0() && gVar.b() > 0) {
                                    this.a = this.a.p(this.a.size() + (u / 1));
                                }
                                while (gVar.b() > 0) {
                                    this.a.b0(gVar.h());
                                }
                                gVar.f(g);
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
                this.a.C();
                return null;
            case 4:
                return new PlaylistContainsRequest$ContainsResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (PlaylistContainsRequest$ContainsResponse.class) {
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
        int size = (this.a.size() * 1) + (this.a.size() * 1) + 0;
        this.memoizedSerializedSize = size;
        return size;
    }

    public int i() {
        return this.a.size();
    }

    public List<Boolean> l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.A(1, this.a.o1(i));
        }
    }
}
