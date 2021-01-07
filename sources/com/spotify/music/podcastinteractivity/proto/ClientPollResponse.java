package com.spotify.music.podcastinteractivity.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.music.podcastinteractivity.proto.Poll;
import java.io.IOException;
import java.util.List;

public final class ClientPollResponse extends GeneratedMessageLite<ClientPollResponse, b> implements Object {
    private static final ClientPollResponse f;
    private static volatile x<ClientPollResponse> n;
    private int a;
    private Poll b;
    private o.f c = GeneratedMessageLite.emptyIntList();

    public static final class b extends GeneratedMessageLite.b<ClientPollResponse, b> implements Object {
        private b() {
            super(ClientPollResponse.f);
        }
    }

    static {
        ClientPollResponse clientPollResponse = new ClientPollResponse();
        f = clientPollResponse;
        clientPollResponse.makeImmutable();
    }

    private ClientPollResponse() {
    }

    public static x<ClientPollResponse> parser() {
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
                ClientPollResponse clientPollResponse = (ClientPollResponse) obj2;
                this.b = (Poll) hVar.i(this.b, clientPollResponse.b);
                this.c = hVar.h(this.c, clientPollResponse.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= clientPollResponse.a;
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
                                Poll poll = this.b;
                                Poll.b bVar = poll != null ? (Poll.b) poll.toBuilder() : null;
                                Poll poll2 = (Poll) gVar.o(Poll.parser(), kVar);
                                this.b = poll2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Poll.b) poll2);
                                    this.b = (Poll) bVar.buildPartial();
                                }
                            } else if (B == 16) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.i1(gVar.u());
                            } else if (B == 18) {
                                int g = gVar.g(gVar.u());
                                if (!this.c.R0() && gVar.b() > 0) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                while (gVar.b() > 0) {
                                    this.c.i1(gVar.u());
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
                this.c.C();
                return null;
            case 4:
                return new ClientPollResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ClientPollResponse.class) {
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
        int n2 = this.b != null ? CodedOutputStream.n(1, h()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.k(this.c.T1(i3));
        }
        int size = (this.c.size() * 1) + n2 + i2;
        this.memoizedSerializedSize = size;
        return size;
    }

    public Poll h() {
        Poll poll = this.b;
        return poll == null ? Poll.i() : poll;
    }

    public List<Integer> i() {
        return this.c;
    }

    public boolean l() {
        return this.b != null;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        if (this.b != null) {
            codedOutputStream.M(1, h());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.K(2, this.c.T1(i));
        }
    }
}
