package com.spotify.nlu.connectstate.v1;

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
import com.spotify.nlu.connectstate.v1.Restrictions;
import java.io.IOException;
import java.util.Map;

public final class ProvidedTrack extends GeneratedMessageLite<ProvidedTrack, b> implements Object {
    private static final ProvidedTrack v;
    private static volatile x<ProvidedTrack> w;
    private int a;
    private String b = "";
    private String c = "";
    private MapFieldLite<String, String> f = MapFieldLite.d();
    private o.i<String> n = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> o = GeneratedMessageLite.emptyProtobufList();
    private String p = "";
    private Restrictions q;
    private String r = "";
    private o.i<String> s = GeneratedMessageLite.emptyProtobufList();
    private String t = "";
    private o.i<String> u = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<ProvidedTrack, b> implements Object {
        private b() {
            super(ProvidedTrack.v);
        }
    }

    private static final class c {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        ProvidedTrack providedTrack = new ProvidedTrack();
        v = providedTrack;
        providedTrack.makeImmutable();
    }

    private ProvidedTrack() {
    }

    public static x<ProvidedTrack> parser() {
        return v.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return v;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ProvidedTrack providedTrack = (ProvidedTrack) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !providedTrack.b.isEmpty(), providedTrack.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !providedTrack.c.isEmpty(), providedTrack.c);
                this.f = hVar.c(this.f, providedTrack.f);
                this.n = hVar.q(this.n, providedTrack.n);
                this.o = hVar.q(this.o, providedTrack.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !providedTrack.p.isEmpty(), providedTrack.p);
                this.q = (Restrictions) hVar.i(this.q, providedTrack.q);
                this.r = hVar.n(!this.r.isEmpty(), this.r, !providedTrack.r.isEmpty(), providedTrack.r);
                this.s = hVar.q(this.s, providedTrack.s);
                this.t = hVar.n(!this.t.isEmpty(), this.t, true ^ providedTrack.t.isEmpty(), providedTrack.t);
                this.u = hVar.q(this.u, providedTrack.u);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= providedTrack.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.b = gVar.A();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                c.a.d(this.f, gVar, kVar);
                                continue;
                            case 34:
                                String A = gVar.A();
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(A);
                                continue;
                            case 42:
                                String A2 = gVar.A();
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(A2);
                                continue;
                            case 50:
                                this.p = gVar.A();
                                continue;
                            case 58:
                                Restrictions restrictions = this.q;
                                Restrictions.b bVar = restrictions != null ? (Restrictions.b) restrictions.toBuilder() : null;
                                Restrictions restrictions2 = (Restrictions) gVar.o(Restrictions.parser(), kVar);
                                this.q = restrictions2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Restrictions.b) restrictions2);
                                    this.q = (Restrictions) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                this.r = gVar.A();
                                continue;
                            case 74:
                                String A3 = gVar.A();
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(A3);
                                continue;
                            case 82:
                                this.t = gVar.A();
                                continue;
                            case 90:
                                String A4 = gVar.A();
                                if (!this.u.R0()) {
                                    this.u = GeneratedMessageLite.mutableCopy(this.u);
                                }
                                this.u.add(A4);
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
                this.f.g();
                this.n.C();
                this.o.C();
                this.s.C();
                this.u.C();
                return null;
            case 4:
                return new ProvidedTrack();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (w == null) {
                    synchronized (ProvidedTrack.class) {
                        if (w == null) {
                            w = new GeneratedMessageLite.c(v);
                        }
                    }
                }
                return w;
            default:
                throw new UnsupportedOperationException();
        }
        return v;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            p2 = je.j1(entry, c.a, 3, entry.getKey(), p2);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            i2 += CodedOutputStream.q(this.n.get(i3));
        }
        int C0 = je.C0(this.n, 1, p2 + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < this.o.size(); i5++) {
            i4 += CodedOutputStream.q(this.o.get(i5));
        }
        int C02 = je.C0(this.o, 1, C0 + i4);
        if (!this.p.isEmpty()) {
            C02 += CodedOutputStream.p(6, this.p);
        }
        Restrictions restrictions = this.q;
        if (restrictions != null) {
            C02 += CodedOutputStream.n(7, restrictions);
        }
        if (!this.r.isEmpty()) {
            C02 += CodedOutputStream.p(8, this.r);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.s.size(); i7++) {
            i6 += CodedOutputStream.q(this.s.get(i7));
        }
        int C03 = je.C0(this.s, 1, C02 + i6);
        if (!this.t.isEmpty()) {
            C03 += CodedOutputStream.p(10, this.t);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.u.size(); i9++) {
            i8 += CodedOutputStream.q(this.u.get(i9));
        }
        int C04 = je.C0(this.u, 1, C03 + i8);
        this.memoizedSerializedSize = C04;
        return C04;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            c.a.e(codedOutputStream, 3, entry.getKey(), entry.getValue());
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.P(4, this.n.get(i));
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            codedOutputStream.P(5, this.o.get(i2));
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(6, this.p);
        }
        Restrictions restrictions = this.q;
        if (restrictions != null) {
            codedOutputStream.M(7, restrictions);
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.P(8, this.r);
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            codedOutputStream.P(9, this.s.get(i3));
        }
        if (!this.t.isEmpty()) {
            codedOutputStream.P(10, this.t);
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            codedOutputStream.P(11, this.u.get(i4));
        }
    }
}
