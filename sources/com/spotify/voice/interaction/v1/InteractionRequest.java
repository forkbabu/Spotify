package com.spotify.voice.interaction.v1;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.x;
import com.spotify.nlu.connectstate.v1.PlayerState;
import com.spotify.voice.v1.VoiceFeatureName;
import com.spotify.voice.v1.VoiceInteractionManagerFeature;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class InteractionRequest extends GeneratedMessageLite<InteractionRequest, b> implements Object {
    private static volatile x<InteractionRequest> A;
    private static final InteractionRequest z;
    private int a;
    private int b;
    private String c = "";
    private String f = "";
    private String n = "";
    private PlayerState o;
    private String p = "";
    private int q;
    private int r;
    private boolean s;
    private String t = "";
    private MapFieldLite<String, String> u = MapFieldLite.d();
    private String v = "";
    private boolean w;
    private boolean x;
    private o.f y = GeneratedMessageLite.emptyIntList();

    public enum InteractionEvent implements o.c {
        UNKNOWN(0),
        UTTERANCE(1),
        NO_SPEECH(2),
        GENERIC_ACTION(3),
        ENTER_DIALOG(4),
        UNRECOGNIZED(-1);
        
        private final int value;

        private InteractionEvent(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    static class a implements o.g.a<Integer, VoiceInteractionManagerFeature> {
    }

    public static final class b extends GeneratedMessageLite.b<InteractionRequest, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b m(Iterable<Integer> iterable) {
            copyOnWrite();
            InteractionRequest.o((InteractionRequest) this.instance, iterable);
            return this;
        }

        public b n(String str, String str2) {
            str2.getClass();
            copyOnWrite();
            ((MapFieldLite) InteractionRequest.l((InteractionRequest) this.instance)).put(str, str2);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            InteractionRequest.m((InteractionRequest) this.instance, str);
            return this;
        }

        public b p(boolean z) {
            copyOnWrite();
            InteractionRequest.n((InteractionRequest) this.instance, z);
            return this;
        }

        public b q(InteractionEvent interactionEvent) {
            copyOnWrite();
            InteractionRequest.i((InteractionRequest) this.instance, interactionEvent);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            InteractionRequest.h((InteractionRequest) this.instance, str);
            return this;
        }

        private b() {
            super(InteractionRequest.z);
        }
    }

    /* access modifiers changed from: private */
    public static final class c {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        InteractionRequest interactionRequest = new InteractionRequest();
        z = interactionRequest;
        interactionRequest.makeImmutable();
    }

    private InteractionRequest() {
    }

    static void h(InteractionRequest interactionRequest, String str) {
        interactionRequest.getClass();
        str.getClass();
        interactionRequest.n = str;
    }

    static void i(InteractionRequest interactionRequest, InteractionEvent interactionEvent) {
        interactionRequest.getClass();
        interactionEvent.getClass();
        interactionRequest.b = interactionEvent.getNumber();
    }

    static Map l(InteractionRequest interactionRequest) {
        if (!interactionRequest.u.f()) {
            interactionRequest.u = interactionRequest.u.k();
        }
        return interactionRequest.u;
    }

    static void m(InteractionRequest interactionRequest, String str) {
        interactionRequest.getClass();
        str.getClass();
        interactionRequest.v = str;
    }

    static void n(InteractionRequest interactionRequest, boolean z2) {
        interactionRequest.x = z2;
    }

    static void o(InteractionRequest interactionRequest, Iterable iterable) {
        if (!interactionRequest.y.R0()) {
            interactionRequest.y = GeneratedMessageLite.mutableCopy(interactionRequest.y);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            interactionRequest.y.i1(((Integer) it.next()).intValue());
        }
    }

    public static b p() {
        return (b) z.toBuilder();
    }

    public static x<InteractionRequest> parser() {
        return z.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return z;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                InteractionRequest interactionRequest = (InteractionRequest) obj2;
                int i = this.b;
                boolean z3 = i != 0;
                int i2 = interactionRequest.b;
                this.b = hVar.m(z3, i, i2 != 0, i2);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !interactionRequest.c.isEmpty(), interactionRequest.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !interactionRequest.f.isEmpty(), interactionRequest.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !interactionRequest.n.isEmpty(), interactionRequest.n);
                this.o = (PlayerState) hVar.i(this.o, interactionRequest.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !interactionRequest.p.isEmpty(), interactionRequest.p);
                int i3 = this.q;
                boolean z4 = i3 != 0;
                int i4 = interactionRequest.q;
                this.q = hVar.m(z4, i3, i4 != 0, i4);
                int i5 = this.r;
                boolean z5 = i5 != 0;
                int i6 = interactionRequest.r;
                if (i6 != 0) {
                    z2 = true;
                }
                this.r = hVar.m(z5, i5, z2, i6);
                boolean z6 = this.s;
                boolean z7 = interactionRequest.s;
                this.s = hVar.f(z6, z6, z7, z7);
                this.t = hVar.n(!this.t.isEmpty(), this.t, !interactionRequest.t.isEmpty(), interactionRequest.t);
                this.u = hVar.c(this.u, interactionRequest.u);
                this.v = hVar.n(!this.v.isEmpty(), this.v, !interactionRequest.v.isEmpty(), interactionRequest.v);
                boolean z8 = this.w;
                boolean z9 = interactionRequest.w;
                this.w = hVar.f(z8, z8, z9, z9);
                boolean z10 = this.x;
                boolean z11 = interactionRequest.x;
                this.x = hVar.f(z10, z10, z11, z11);
                this.y = hVar.h(this.y, interactionRequest.y);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= interactionRequest.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 8:
                                this.b = gVar.u();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 34:
                                this.f = gVar.A();
                                continue;
                            case 42:
                                this.n = gVar.A();
                                continue;
                            case 50:
                                PlayerState playerState = this.o;
                                PlayerState.b bVar = playerState != null ? (PlayerState.b) playerState.toBuilder() : null;
                                PlayerState playerState2 = (PlayerState) gVar.o(PlayerState.parser(), kVar);
                                this.o = playerState2;
                                if (bVar != null) {
                                    bVar.mergeFrom((PlayerState.b) playerState2);
                                    this.o = (PlayerState) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                this.p = gVar.A();
                                continue;
                            case 64:
                                this.q = gVar.u();
                                continue;
                            case 72:
                                this.r = gVar.u();
                                continue;
                            case 80:
                                this.s = gVar.h();
                                continue;
                            case 90:
                                this.t = gVar.A();
                                continue;
                            case 98:
                                if (!this.u.f()) {
                                    this.u = this.u.k();
                                }
                                c.a.d(this.u, gVar, kVar);
                                continue;
                            case 106:
                                this.v = gVar.A();
                                continue;
                            case 112:
                                this.w = gVar.h();
                                continue;
                            case 120:
                                this.x = gVar.h();
                                continue;
                            case 128:
                                if (!this.y.R0()) {
                                    this.y = GeneratedMessageLite.mutableCopy(this.y);
                                }
                                this.y.i1(gVar.u());
                                continue;
                            case 130:
                                if (!this.y.R0()) {
                                    this.y = GeneratedMessageLite.mutableCopy(this.y);
                                }
                                int g = gVar.g(gVar.u());
                                while (gVar.b() > 0) {
                                    this.y.i1(gVar.u());
                                }
                                gVar.f(g);
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
                        }
                        z2 = true;
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
                this.u.g();
                this.y.C();
                return null;
            case 4:
                return new InteractionRequest();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (A == null) {
                    synchronized (InteractionRequest.class) {
                        if (A == null) {
                            A = new GeneratedMessageLite.c(z);
                        }
                    }
                }
                return A;
            default:
                throw new UnsupportedOperationException();
        }
        return z;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int h = this.b != InteractionEvent.UNKNOWN.getNumber() ? CodedOutputStream.h(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            h += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            h += CodedOutputStream.p(4, this.f);
        }
        if (!this.n.isEmpty()) {
            h += CodedOutputStream.p(5, this.n);
        }
        PlayerState playerState = this.o;
        if (playerState != null) {
            h += CodedOutputStream.n(6, playerState);
        }
        if (!this.p.isEmpty()) {
            h += CodedOutputStream.p(7, this.p);
        }
        int i2 = this.q;
        if (i2 != 0) {
            h += CodedOutputStream.j(8, i2);
        }
        if (this.r != VoiceFeatureName.UNKNOWN.getNumber()) {
            h += CodedOutputStream.h(9, this.r);
        }
        boolean z2 = this.s;
        if (z2) {
            h += CodedOutputStream.d(10, z2);
        }
        if (!this.t.isEmpty()) {
            h += CodedOutputStream.p(11, this.t);
        }
        for (Map.Entry<String, String> entry : this.u.entrySet()) {
            h = je.j1(entry, c.a, 12, entry.getKey(), h);
        }
        if (!this.v.isEmpty()) {
            h += CodedOutputStream.p(13, this.v);
        }
        boolean z3 = this.w;
        if (z3) {
            h += CodedOutputStream.d(14, z3);
        }
        boolean z4 = this.x;
        if (z4) {
            h += CodedOutputStream.d(15, z4);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.y.size(); i4++) {
            i3 += CodedOutputStream.k(this.y.T1(i4));
        }
        int size = (this.y.size() * 2) + h + i3;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        if (this.b != InteractionEvent.UNKNOWN.getNumber()) {
            codedOutputStream.K(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        PlayerState playerState = this.o;
        if (playerState != null) {
            codedOutputStream.M(6, playerState);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
        int i = this.q;
        if (i != 0) {
            codedOutputStream.K(8, i);
        }
        if (this.r != VoiceFeatureName.UNKNOWN.getNumber()) {
            codedOutputStream.K(9, this.r);
        }
        boolean z2 = this.s;
        if (z2) {
            codedOutputStream.A(10, z2);
        }
        if (!this.t.isEmpty()) {
            codedOutputStream.P(11, this.t);
        }
        for (Map.Entry<String, String> entry : this.u.entrySet()) {
            c.a.e(codedOutputStream, 12, entry.getKey(), entry.getValue());
        }
        if (!this.v.isEmpty()) {
            codedOutputStream.P(13, this.v);
        }
        boolean z3 = this.w;
        if (z3) {
            codedOutputStream.A(14, z3);
        }
        boolean z4 = this.x;
        if (z4) {
            codedOutputStream.A(15, z4);
        }
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            codedOutputStream.K(16, this.y.T1(i2));
        }
    }
}
