package com.spotify.nlu.voiceview.v1;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.nlu.ttsresolve.v1.ResolveRequest$AudioFormat;
import com.spotify.voice.interaction.v1.InteractionRequest;
import java.io.IOException;

public final class VoiceRequest extends GeneratedMessageLite<VoiceRequest, b> implements Object {
    private static final VoiceRequest f;
    private static volatile x<VoiceRequest> n;
    private InteractionRequest a;
    private int b;
    private boolean c;

    public static final class b extends GeneratedMessageLite.b<VoiceRequest, b> implements Object {
        public b m(InteractionRequest interactionRequest) {
            copyOnWrite();
            VoiceRequest.h((VoiceRequest) this.instance, interactionRequest);
            return this;
        }

        public b n(ResolveRequest$AudioFormat resolveRequest$AudioFormat) {
            copyOnWrite();
            VoiceRequest.i((VoiceRequest) this.instance, resolveRequest$AudioFormat);
            return this;
        }

        private b() {
            super(VoiceRequest.f);
        }
    }

    static {
        VoiceRequest voiceRequest = new VoiceRequest();
        f = voiceRequest;
        voiceRequest.makeImmutable();
    }

    private VoiceRequest() {
    }

    static void h(VoiceRequest voiceRequest, InteractionRequest interactionRequest) {
        voiceRequest.getClass();
        interactionRequest.getClass();
        voiceRequest.a = interactionRequest;
    }

    static void i(VoiceRequest voiceRequest, ResolveRequest$AudioFormat resolveRequest$AudioFormat) {
        voiceRequest.getClass();
        resolveRequest$AudioFormat.getClass();
        voiceRequest.b = resolveRequest$AudioFormat.getNumber();
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<VoiceRequest> parser() {
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
                VoiceRequest voiceRequest = (VoiceRequest) obj2;
                this.a = (InteractionRequest) hVar.i(this.a, voiceRequest.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = voiceRequest.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, i2);
                boolean z3 = this.c;
                boolean z4 = voiceRequest.c;
                this.c = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                InteractionRequest interactionRequest = this.a;
                                InteractionRequest.b bVar = interactionRequest != null ? (InteractionRequest.b) interactionRequest.toBuilder() : null;
                                InteractionRequest interactionRequest2 = (InteractionRequest) gVar.o(InteractionRequest.parser(), kVar);
                                this.a = interactionRequest2;
                                if (bVar != null) {
                                    bVar.mergeFrom((InteractionRequest.b) interactionRequest2);
                                    this.a = (InteractionRequest) bVar.buildPartial();
                                }
                            } else if (B == 64) {
                                this.b = gVar.u();
                            } else if (B == 72) {
                                this.c = gVar.h();
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
                return new VoiceRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (VoiceRequest.class) {
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
        InteractionRequest interactionRequest = this.a;
        if (interactionRequest != null) {
            i2 = 0 + CodedOutputStream.n(1, interactionRequest);
        }
        if (this.b != ResolveRequest$AudioFormat.UNSPECIFIED.getNumber()) {
            i2 += CodedOutputStream.h(8, this.b);
        }
        boolean z = this.c;
        if (z) {
            i2 += CodedOutputStream.d(9, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        InteractionRequest interactionRequest = this.a;
        if (interactionRequest != null) {
            codedOutputStream.M(1, interactionRequest);
        }
        if (this.b != ResolveRequest$AudioFormat.UNSPECIFIED.getNumber()) {
            codedOutputStream.K(8, this.b);
        }
        boolean z = this.c;
        if (z) {
            codedOutputStream.A(9, z);
        }
    }
}
