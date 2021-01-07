package com.spotify.nlu.voiceview.v1;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.voice.interaction.v1.InteractionResponse;
import java.io.IOException;

public final class VoiceResponse extends GeneratedMessageLite<VoiceResponse, b> implements Object {
    private static final VoiceResponse f;
    private static volatile x<VoiceResponse> n;
    private int a;
    private InteractionResponse b;
    private o.i<DecoratedResult> c = GeneratedMessageLite.emptyProtobufList();

    public static final class DecoratedResult extends GeneratedMessageLite<DecoratedResult, a> implements Object {
        private static final DecoratedResult n;
        private static volatile x<DecoratedResult> o;
        private String a = "";
        private String b = "";
        private String c = "";
        private String f = "";

        public static final class a extends GeneratedMessageLite.b<DecoratedResult, a> implements Object {
            private a() {
                super(DecoratedResult.n);
            }
        }

        static {
            DecoratedResult decoratedResult = new DecoratedResult();
            n = decoratedResult;
            decoratedResult.makeImmutable();
        }

        private DecoratedResult() {
        }

        public static x<DecoratedResult> parser() {
            return n.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return n;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    DecoratedResult decoratedResult = (DecoratedResult) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !decoratedResult.a.isEmpty(), decoratedResult.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, !decoratedResult.b.isEmpty(), decoratedResult.b);
                    this.c = hVar.n(!this.c.isEmpty(), this.c, !decoratedResult.c.isEmpty(), decoratedResult.c);
                    this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ decoratedResult.f.isEmpty(), decoratedResult.f);
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
                                    this.a = gVar.A();
                                } else if (B == 18) {
                                    this.b = gVar.A();
                                } else if (B == 26) {
                                    this.c = gVar.A();
                                } else if (B == 34) {
                                    this.f = gVar.A();
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
                    return new DecoratedResult();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (o == null) {
                        synchronized (DecoratedResult.class) {
                            if (o == null) {
                                o = new GeneratedMessageLite.c(n);
                            }
                        }
                    }
                    return o;
                default:
                    throw new UnsupportedOperationException();
            }
            return n;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.a);
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            if (!this.c.isEmpty()) {
                i2 += CodedOutputStream.p(3, this.c);
            }
            if (!this.f.isEmpty()) {
                i2 += CodedOutputStream.p(4, this.f);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.P(2, this.b);
            }
            if (!this.c.isEmpty()) {
                codedOutputStream.P(3, this.c);
            }
            if (!this.f.isEmpty()) {
                codedOutputStream.P(4, this.f);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<VoiceResponse, b> implements Object {
        private b() {
            super(VoiceResponse.f);
        }
    }

    static {
        VoiceResponse voiceResponse = new VoiceResponse();
        f = voiceResponse;
        voiceResponse.makeImmutable();
    }

    private VoiceResponse() {
    }

    public static x<VoiceResponse> parser() {
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
                VoiceResponse voiceResponse = (VoiceResponse) obj2;
                this.b = (InteractionResponse) hVar.i(this.b, voiceResponse.b);
                this.c = hVar.q(this.c, voiceResponse.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= voiceResponse.a;
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
                                InteractionResponse interactionResponse = this.b;
                                InteractionResponse.b bVar = interactionResponse != null ? (InteractionResponse.b) interactionResponse.toBuilder() : null;
                                InteractionResponse interactionResponse2 = (InteractionResponse) gVar.o(InteractionResponse.parser(), kVar);
                                this.b = interactionResponse2;
                                if (bVar != null) {
                                    bVar.mergeFrom((InteractionResponse.b) interactionResponse2);
                                    this.b = (InteractionResponse) bVar.buildPartial();
                                }
                            } else if (B == 26) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(DecoratedResult.parser(), kVar));
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
                return new VoiceResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (VoiceResponse.class) {
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
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(3, this.c.get(i2));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public InteractionResponse h() {
        InteractionResponse interactionResponse = this.b;
        return interactionResponse == null ? InteractionResponse.i() : interactionResponse;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != null) {
            codedOutputStream.M(1, h());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(3, this.c.get(i));
        }
    }
}
