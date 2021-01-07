package com.spotify.music.podcastinteractivity.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class PollVoteRequest extends GeneratedMessageLite<PollVoteRequest, b> implements Object {
    private static final PollVoteRequest f;
    private static volatile x<PollVoteRequest> n;
    private int a;
    private int b;
    private o.i<PollOption> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<PollVoteRequest, b> implements Object {
        public b m(Iterable<? extends PollOption> iterable) {
            copyOnWrite();
            PollVoteRequest.i((PollVoteRequest) this.instance, iterable);
            return this;
        }

        public b n(int i) {
            copyOnWrite();
            PollVoteRequest.h((PollVoteRequest) this.instance, i);
            return this;
        }

        private b() {
            super(PollVoteRequest.f);
        }
    }

    static {
        PollVoteRequest pollVoteRequest = new PollVoteRequest();
        f = pollVoteRequest;
        pollVoteRequest.makeImmutable();
    }

    private PollVoteRequest() {
    }

    static void h(PollVoteRequest pollVoteRequest, int i) {
        pollVoteRequest.b = i;
    }

    static void i(PollVoteRequest pollVoteRequest, Iterable iterable) {
        if (!pollVoteRequest.c.R0()) {
            pollVoteRequest.c = GeneratedMessageLite.mutableCopy(pollVoteRequest.c);
        }
        com.google.protobuf.a.addAll(iterable, pollVoteRequest.c);
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<PollVoteRequest> parser() {
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
                PollVoteRequest pollVoteRequest = (PollVoteRequest) obj2;
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = pollVoteRequest.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, i2);
                this.c = hVar.q(this.c, pollVoteRequest.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pollVoteRequest.a;
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
                                this.b = gVar.u();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(PollOption.parser(), kVar));
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
                return new PollVoteRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PollVoteRequest.class) {
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
        int i2 = this.b;
        int j = i2 != 0 ? CodedOutputStream.j(1, i2) + 0 : 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            j += CodedOutputStream.n(2, this.c.get(i3));
        }
        this.memoizedSerializedSize = j;
        return j;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(1, i);
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            codedOutputStream.M(2, this.c.get(i2));
        }
    }
}
