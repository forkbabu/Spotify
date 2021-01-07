package com.spotify.player.esperanto.proto;

import com.google.protobuf.ByteString;
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
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import java.io.IOException;
import java.util.Map;

public final class EsPreparePlayOptions$PreparePlayOptions extends GeneratedMessageLite<EsPreparePlayOptions$PreparePlayOptions, a> implements Object {
    private static final EsPreparePlayOptions$PreparePlayOptions x;
    private static volatile x<EsPreparePlayOptions$PreparePlayOptions> y;
    private int a;
    private ByteString b = ByteString.a;
    private boolean c;
    private EsSkipToTrack$SkipToTrack f;
    private EsOptional$OptionalInt64 n;
    private boolean o;
    private boolean p;
    private EsContextPlayerOptions$ContextPlayerOptionOverrides q;
    private o.i<String> r = GeneratedMessageLite.emptyProtobufList();
    private int s;
    private int t;
    private String u = "";
    private String v = "";
    private MapFieldLite<String, String> w = MapFieldLite.d();

    public enum AudioStream implements o.c {
        DEFAULT(0),
        ALARM(1),
        UNRECOGNIZED(-1);
        
        private final int value;

        private AudioStream(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public enum PrefetchLevel implements o.c {
        NONE(0),
        MEDIA(1),
        UNRECOGNIZED(-1);
        
        private final int value;

        private PrefetchLevel(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<EsPreparePlayOptions$PreparePlayOptions, a> implements Object {
        public a m(Iterable<String> iterable) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.n((EsPreparePlayOptions$PreparePlayOptions) this.instance, iterable);
            return this;
        }

        public a n(String str, String str2) {
            str.getClass();
            copyOnWrite();
            ((MapFieldLite) EsPreparePlayOptions$PreparePlayOptions.t((EsPreparePlayOptions$PreparePlayOptions) this.instance)).put(str, str2);
            return this;
        }

        public a o(boolean z) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.p((EsPreparePlayOptions$PreparePlayOptions) this.instance, z);
            return this;
        }

        public a p(AudioStream audioStream) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.q((EsPreparePlayOptions$PreparePlayOptions) this.instance, audioStream);
            return this;
        }

        public a q(boolean z) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.i((EsPreparePlayOptions$PreparePlayOptions) this.instance, z);
            return this;
        }

        public a r(String str) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.s((EsPreparePlayOptions$PreparePlayOptions) this.instance, str);
            return this;
        }

        public a s(ByteString byteString) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.h((EsPreparePlayOptions$PreparePlayOptions) this.instance, byteString);
            return this;
        }

        public a t(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.m((EsPreparePlayOptions$PreparePlayOptions) this.instance, esContextPlayerOptions$ContextPlayerOptionOverrides);
            return this;
        }

        public a u(PrefetchLevel prefetchLevel) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.o((EsPreparePlayOptions$PreparePlayOptions) this.instance, prefetchLevel);
            return this;
        }

        public a v(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.v((EsPreparePlayOptions$PreparePlayOptions) this.instance, esOptional$OptionalInt64);
            return this;
        }

        public a w(String str) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.r((EsPreparePlayOptions$PreparePlayOptions) this.instance, str);
            return this;
        }

        public a x(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.u((EsPreparePlayOptions$PreparePlayOptions) this.instance, esSkipToTrack$SkipToTrack);
            return this;
        }

        public a y(boolean z) {
            copyOnWrite();
            EsPreparePlayOptions$PreparePlayOptions.l((EsPreparePlayOptions$PreparePlayOptions) this.instance, z);
            return this;
        }

        private a() {
            super(EsPreparePlayOptions$PreparePlayOptions.x);
        }
    }

    private static final class b {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = new EsPreparePlayOptions$PreparePlayOptions();
        x = esPreparePlayOptions$PreparePlayOptions;
        esPreparePlayOptions$PreparePlayOptions.makeImmutable();
    }

    private EsPreparePlayOptions$PreparePlayOptions() {
    }

    static void h(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, ByteString byteString) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        byteString.getClass();
        esPreparePlayOptions$PreparePlayOptions.b = byteString;
    }

    static void i(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, boolean z) {
        esPreparePlayOptions$PreparePlayOptions.o = z;
    }

    static void l(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, boolean z) {
        esPreparePlayOptions$PreparePlayOptions.p = z;
    }

    static void m(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esPreparePlayOptions$PreparePlayOptions.q = esContextPlayerOptions$ContextPlayerOptionOverrides;
    }

    static void n(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, Iterable iterable) {
        if (!esPreparePlayOptions$PreparePlayOptions.r.R0()) {
            esPreparePlayOptions$PreparePlayOptions.r = GeneratedMessageLite.mutableCopy(esPreparePlayOptions$PreparePlayOptions.r);
        }
        com.google.protobuf.a.addAll(iterable, esPreparePlayOptions$PreparePlayOptions.r);
    }

    static void o(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, PrefetchLevel prefetchLevel) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        prefetchLevel.getClass();
        esPreparePlayOptions$PreparePlayOptions.s = prefetchLevel.getNumber();
    }

    static void p(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, boolean z) {
        esPreparePlayOptions$PreparePlayOptions.c = z;
    }

    public static x<EsPreparePlayOptions$PreparePlayOptions> parser() {
        return x.getParserForType();
    }

    static void q(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, AudioStream audioStream) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        audioStream.getClass();
        esPreparePlayOptions$PreparePlayOptions.t = audioStream.getNumber();
    }

    static void r(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, String str) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        str.getClass();
        esPreparePlayOptions$PreparePlayOptions.u = str;
    }

    static void s(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, String str) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        str.getClass();
        esPreparePlayOptions$PreparePlayOptions.v = str;
    }

    static Map t(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
        if (!esPreparePlayOptions$PreparePlayOptions.w.f()) {
            esPreparePlayOptions$PreparePlayOptions.w = esPreparePlayOptions$PreparePlayOptions.w.k();
        }
        return esPreparePlayOptions$PreparePlayOptions.w;
    }

    static void u(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esSkipToTrack$SkipToTrack.getClass();
        esPreparePlayOptions$PreparePlayOptions.f = esSkipToTrack$SkipToTrack;
    }

    static void v(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esOptional$OptionalInt64.getClass();
        esPreparePlayOptions$PreparePlayOptions.n = esOptional$OptionalInt64;
    }

    public static a w() {
        return (a) x.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return x;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) obj2;
                ByteString byteString = this.b;
                ByteString byteString2 = ByteString.a;
                boolean z2 = byteString != byteString2;
                ByteString byteString3 = esPreparePlayOptions$PreparePlayOptions.b;
                this.b = hVar.r(z2, byteString, byteString3 != byteString2, byteString3);
                boolean z3 = this.c;
                boolean z4 = esPreparePlayOptions$PreparePlayOptions.c;
                this.c = hVar.f(z3, z3, z4, z4);
                this.f = (EsSkipToTrack$SkipToTrack) hVar.i(this.f, esPreparePlayOptions$PreparePlayOptions.f);
                this.n = (EsOptional$OptionalInt64) hVar.i(this.n, esPreparePlayOptions$PreparePlayOptions.n);
                boolean z5 = this.o;
                boolean z6 = esPreparePlayOptions$PreparePlayOptions.o;
                this.o = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.p;
                boolean z8 = esPreparePlayOptions$PreparePlayOptions.p;
                this.p = hVar.f(z7, z7, z8, z8);
                this.q = (EsContextPlayerOptions$ContextPlayerOptionOverrides) hVar.i(this.q, esPreparePlayOptions$PreparePlayOptions.q);
                this.r = hVar.q(this.r, esPreparePlayOptions$PreparePlayOptions.r);
                int i = this.s;
                boolean z9 = i != 0;
                int i2 = esPreparePlayOptions$PreparePlayOptions.s;
                this.s = hVar.m(z9, i, i2 != 0, i2);
                int i3 = this.t;
                boolean z10 = i3 != 0;
                int i4 = esPreparePlayOptions$PreparePlayOptions.t;
                if (i4 != 0) {
                    z = true;
                }
                this.t = hVar.m(z10, i3, z, i4);
                this.u = hVar.n(!this.u.isEmpty(), this.u, !esPreparePlayOptions$PreparePlayOptions.u.isEmpty(), esPreparePlayOptions$PreparePlayOptions.u);
                this.v = hVar.n(!this.v.isEmpty(), this.v, !esPreparePlayOptions$PreparePlayOptions.v.isEmpty(), esPreparePlayOptions$PreparePlayOptions.v);
                this.w = hVar.c(this.w, esPreparePlayOptions$PreparePlayOptions.w);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esPreparePlayOptions$PreparePlayOptions.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.b = gVar.i();
                                continue;
                            case 16:
                                this.c = gVar.h();
                                continue;
                            case 26:
                                EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = this.f;
                                EsSkipToTrack$SkipToTrack.a aVar = esSkipToTrack$SkipToTrack != null ? (EsSkipToTrack$SkipToTrack.a) esSkipToTrack$SkipToTrack.toBuilder() : null;
                                EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack2 = (EsSkipToTrack$SkipToTrack) gVar.o(EsSkipToTrack$SkipToTrack.parser(), kVar);
                                this.f = esSkipToTrack$SkipToTrack2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsSkipToTrack$SkipToTrack.a) esSkipToTrack$SkipToTrack2);
                                    this.f = (EsSkipToTrack$SkipToTrack) aVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 34:
                                EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.n;
                                EsOptional$OptionalInt64.a aVar2 = esOptional$OptionalInt64 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt64.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt642 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.n = esOptional$OptionalInt642;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt642);
                                    this.n = (EsOptional$OptionalInt64) aVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 40:
                                this.o = gVar.h();
                                continue;
                            case 48:
                                this.p = gVar.h();
                                continue;
                            case 58:
                                EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides = this.q;
                                EsContextPlayerOptions$ContextPlayerOptionOverrides.a aVar3 = esContextPlayerOptions$ContextPlayerOptionOverrides != null ? (EsContextPlayerOptions$ContextPlayerOptionOverrides.a) esContextPlayerOptions$ContextPlayerOptionOverrides.toBuilder() : null;
                                EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides2 = (EsContextPlayerOptions$ContextPlayerOptionOverrides) gVar.o(EsContextPlayerOptions$ContextPlayerOptionOverrides.parser(), kVar);
                                this.q = esContextPlayerOptions$ContextPlayerOptionOverrides2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsContextPlayerOptions$ContextPlayerOptionOverrides.a) esContextPlayerOptions$ContextPlayerOptionOverrides2);
                                    this.q = (EsContextPlayerOptions$ContextPlayerOptionOverrides) aVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                String A = gVar.A();
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(A);
                                continue;
                            case 72:
                                this.s = gVar.u();
                                continue;
                            case 80:
                                this.t = gVar.u();
                                continue;
                            case 90:
                                this.u = gVar.A();
                                continue;
                            case 98:
                                this.v = gVar.A();
                                continue;
                            case 106:
                                if (!this.w.f()) {
                                    this.w = this.w.k();
                                }
                                b.a.d(this.w, gVar, kVar);
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                this.r.C();
                this.w.g();
                return null;
            case 4:
                return new EsPreparePlayOptions$PreparePlayOptions();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (y == null) {
                    synchronized (EsPreparePlayOptions$PreparePlayOptions.class) {
                        if (y == null) {
                            y = new GeneratedMessageLite.c(x);
                        }
                    }
                }
                return y;
            default:
                throw new UnsupportedOperationException();
        }
        return x;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int e = !this.b.isEmpty() ? CodedOutputStream.e(1, this.b) + 0 : 0;
        boolean z = this.c;
        if (z) {
            e += CodedOutputStream.d(2, z);
        }
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = this.f;
        if (esSkipToTrack$SkipToTrack != null) {
            e += CodedOutputStream.n(3, esSkipToTrack$SkipToTrack);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.n;
        if (esOptional$OptionalInt64 != null) {
            e += CodedOutputStream.n(4, esOptional$OptionalInt64);
        }
        boolean z2 = this.o;
        if (z2) {
            e += CodedOutputStream.d(5, z2);
        }
        boolean z3 = this.p;
        if (z3) {
            e += CodedOutputStream.d(6, z3);
        }
        EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides = this.q;
        if (esContextPlayerOptions$ContextPlayerOptionOverrides != null) {
            e += CodedOutputStream.n(7, esContextPlayerOptions$ContextPlayerOptionOverrides);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            i2 += CodedOutputStream.q(this.r.get(i3));
        }
        int C0 = je.C0(this.r, 1, e + i2);
        if (this.s != PrefetchLevel.NONE.getNumber()) {
            C0 += CodedOutputStream.h(9, this.s);
        }
        if (this.t != AudioStream.DEFAULT.getNumber()) {
            C0 += CodedOutputStream.h(10, this.t);
        }
        if (!this.u.isEmpty()) {
            C0 += CodedOutputStream.p(11, this.u);
        }
        if (!this.v.isEmpty()) {
            C0 += CodedOutputStream.p(12, this.v);
        }
        for (Map.Entry<String, String> entry : this.w.entrySet()) {
            C0 = je.j1(entry, b.a, 13, entry.getKey(), C0);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.C(1, this.b);
        }
        boolean z = this.c;
        if (z) {
            codedOutputStream.A(2, z);
        }
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = this.f;
        if (esSkipToTrack$SkipToTrack != null) {
            codedOutputStream.M(3, esSkipToTrack$SkipToTrack);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.n;
        if (esOptional$OptionalInt64 != null) {
            codedOutputStream.M(4, esOptional$OptionalInt64);
        }
        boolean z2 = this.o;
        if (z2) {
            codedOutputStream.A(5, z2);
        }
        boolean z3 = this.p;
        if (z3) {
            codedOutputStream.A(6, z3);
        }
        EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides = this.q;
        if (esContextPlayerOptions$ContextPlayerOptionOverrides != null) {
            codedOutputStream.M(7, esContextPlayerOptions$ContextPlayerOptionOverrides);
        }
        for (int i = 0; i < this.r.size(); i++) {
            codedOutputStream.P(8, this.r.get(i));
        }
        if (this.s != PrefetchLevel.NONE.getNumber()) {
            codedOutputStream.K(9, this.s);
        }
        if (this.t != AudioStream.DEFAULT.getNumber()) {
            codedOutputStream.K(10, this.t);
        }
        if (!this.u.isEmpty()) {
            codedOutputStream.P(11, this.u);
        }
        if (!this.v.isEmpty()) {
            codedOutputStream.P(12, this.v);
        }
        for (Map.Entry<String, String> entry : this.w.entrySet()) {
            b.a.e(codedOutputStream, 13, entry.getKey(), entry.getValue());
        }
    }
}
