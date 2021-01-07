package com.spotify.nlu.connectstate.v1;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Restrictions extends GeneratedMessageLite<Restrictions, b> implements Object {
    private static final Restrictions G;
    private static volatile x<Restrictions> H;
    private o.i<String> A = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> B = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> C = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> D = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> E = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> F = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> a = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> b = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> f = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> n = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> o = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> p = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> q = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> r = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> s = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> t = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> u = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> v = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> w = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> x = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> y = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> z = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<Restrictions, b> implements Object {
        private b() {
            super(Restrictions.G);
        }
    }

    static {
        Restrictions restrictions = new Restrictions();
        G = restrictions;
        restrictions.makeImmutable();
    }

    private Restrictions() {
    }

    public static x<Restrictions> parser() {
        return G.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return G;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Restrictions restrictions = (Restrictions) obj2;
                this.a = hVar.q(this.a, restrictions.a);
                this.b = hVar.q(this.b, restrictions.b);
                this.c = hVar.q(this.c, restrictions.c);
                this.f = hVar.q(this.f, restrictions.f);
                this.n = hVar.q(this.n, restrictions.n);
                this.o = hVar.q(this.o, restrictions.o);
                this.p = hVar.q(this.p, restrictions.p);
                this.q = hVar.q(this.q, restrictions.q);
                this.r = hVar.q(this.r, restrictions.r);
                this.s = hVar.q(this.s, restrictions.s);
                this.t = hVar.q(this.t, restrictions.t);
                this.u = hVar.q(this.u, restrictions.u);
                this.v = hVar.q(this.v, restrictions.v);
                this.w = hVar.q(this.w, restrictions.w);
                this.x = hVar.q(this.x, restrictions.x);
                this.y = hVar.q(this.y, restrictions.y);
                this.z = hVar.q(this.z, restrictions.z);
                this.A = hVar.q(this.A, restrictions.A);
                this.B = hVar.q(this.B, restrictions.B);
                this.C = hVar.q(this.C, restrictions.C);
                this.D = hVar.q(this.D, restrictions.D);
                this.E = hVar.q(this.E, restrictions.E);
                this.F = hVar.q(this.F, restrictions.F);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int B2 = gVar.B();
                        switch (B2) {
                            case 0:
                                break;
                            case 10:
                                String A2 = gVar.A();
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(A2);
                                continue;
                            case 18:
                                String A3 = gVar.A();
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(A3);
                                continue;
                            case 26:
                                String A4 = gVar.A();
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(A4);
                                continue;
                            case 34:
                                String A5 = gVar.A();
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(A5);
                                continue;
                            case 42:
                                String A6 = gVar.A();
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(A6);
                                continue;
                            case 50:
                                String A7 = gVar.A();
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(A7);
                                continue;
                            case 58:
                                String A8 = gVar.A();
                                if (!this.p.R0()) {
                                    this.p = GeneratedMessageLite.mutableCopy(this.p);
                                }
                                this.p.add(A8);
                                continue;
                            case 66:
                                String A9 = gVar.A();
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(A9);
                                continue;
                            case 74:
                                String A10 = gVar.A();
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(A10);
                                continue;
                            case 82:
                                String A11 = gVar.A();
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(A11);
                                continue;
                            case 90:
                                String A12 = gVar.A();
                                if (!this.t.R0()) {
                                    this.t = GeneratedMessageLite.mutableCopy(this.t);
                                }
                                this.t.add(A12);
                                continue;
                            case 98:
                                String A13 = gVar.A();
                                if (!this.u.R0()) {
                                    this.u = GeneratedMessageLite.mutableCopy(this.u);
                                }
                                this.u.add(A13);
                                continue;
                            case 106:
                                String A14 = gVar.A();
                                if (!this.v.R0()) {
                                    this.v = GeneratedMessageLite.mutableCopy(this.v);
                                }
                                this.v.add(A14);
                                continue;
                            case 114:
                                String A15 = gVar.A();
                                if (!this.w.R0()) {
                                    this.w = GeneratedMessageLite.mutableCopy(this.w);
                                }
                                this.w.add(A15);
                                continue;
                            case 122:
                                String A16 = gVar.A();
                                if (!this.x.R0()) {
                                    this.x = GeneratedMessageLite.mutableCopy(this.x);
                                }
                                this.x.add(A16);
                                continue;
                            case 130:
                                String A17 = gVar.A();
                                if (!this.y.R0()) {
                                    this.y = GeneratedMessageLite.mutableCopy(this.y);
                                }
                                this.y.add(A17);
                                continue;
                            case 138:
                                String A18 = gVar.A();
                                if (!this.z.R0()) {
                                    this.z = GeneratedMessageLite.mutableCopy(this.z);
                                }
                                this.z.add(A18);
                                continue;
                            case 146:
                                String A19 = gVar.A();
                                if (!this.A.R0()) {
                                    this.A = GeneratedMessageLite.mutableCopy(this.A);
                                }
                                this.A.add(A19);
                                continue;
                            case 154:
                                String A20 = gVar.A();
                                if (!this.B.R0()) {
                                    this.B = GeneratedMessageLite.mutableCopy(this.B);
                                }
                                this.B.add(A20);
                                continue;
                            case 162:
                                String A21 = gVar.A();
                                if (!this.C.R0()) {
                                    this.C = GeneratedMessageLite.mutableCopy(this.C);
                                }
                                this.C.add(A21);
                                continue;
                            case 170:
                                String A22 = gVar.A();
                                if (!this.D.R0()) {
                                    this.D = GeneratedMessageLite.mutableCopy(this.D);
                                }
                                this.D.add(A22);
                                continue;
                            case 178:
                                String A23 = gVar.A();
                                if (!this.E.R0()) {
                                    this.E = GeneratedMessageLite.mutableCopy(this.E);
                                }
                                this.E.add(A23);
                                continue;
                            case 186:
                                String A24 = gVar.A();
                                if (!this.F.R0()) {
                                    this.F = GeneratedMessageLite.mutableCopy(this.F);
                                }
                                this.F.add(A24);
                                continue;
                            default:
                                if (gVar.F(B2)) {
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
                this.a.C();
                this.b.C();
                this.c.C();
                this.f.C();
                this.n.C();
                this.o.C();
                this.p.C();
                this.q.C();
                this.r.C();
                this.s.C();
                this.t.C();
                this.u.C();
                this.v.C();
                this.w.C();
                this.x.C();
                this.y.C();
                this.z.C();
                this.A.C();
                this.B.C();
                this.C.C();
                this.D.C();
                this.E.C();
                this.F.C();
                return null;
            case 4:
                return new Restrictions();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (H == null) {
                    synchronized (Restrictions.class) {
                        if (H == null) {
                            H = new GeneratedMessageLite.c(G);
                        }
                    }
                }
                return H;
            default:
                throw new UnsupportedOperationException();
        }
        return G;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.q(this.a.get(i3));
        }
        int C0 = je.C0(this.a, 1, i2 + 0);
        int i4 = 0;
        for (int i5 = 0; i5 < this.b.size(); i5++) {
            i4 += CodedOutputStream.q(this.b.get(i5));
        }
        int C02 = je.C0(this.b, 1, C0 + i4);
        int i6 = 0;
        for (int i7 = 0; i7 < this.c.size(); i7++) {
            i6 += CodedOutputStream.q(this.c.get(i7));
        }
        int C03 = je.C0(this.c, 1, C02 + i6);
        int i8 = 0;
        for (int i9 = 0; i9 < this.f.size(); i9++) {
            i8 += CodedOutputStream.q(this.f.get(i9));
        }
        int C04 = je.C0(this.f, 1, C03 + i8);
        int i10 = 0;
        for (int i11 = 0; i11 < this.n.size(); i11++) {
            i10 += CodedOutputStream.q(this.n.get(i11));
        }
        int C05 = je.C0(this.n, 1, C04 + i10);
        int i12 = 0;
        for (int i13 = 0; i13 < this.o.size(); i13++) {
            i12 += CodedOutputStream.q(this.o.get(i13));
        }
        int C06 = je.C0(this.o, 1, C05 + i12);
        int i14 = 0;
        for (int i15 = 0; i15 < this.p.size(); i15++) {
            i14 += CodedOutputStream.q(this.p.get(i15));
        }
        int C07 = je.C0(this.p, 1, C06 + i14);
        int i16 = 0;
        for (int i17 = 0; i17 < this.q.size(); i17++) {
            i16 += CodedOutputStream.q(this.q.get(i17));
        }
        int C08 = je.C0(this.q, 1, C07 + i16);
        int i18 = 0;
        for (int i19 = 0; i19 < this.r.size(); i19++) {
            i18 += CodedOutputStream.q(this.r.get(i19));
        }
        int C09 = je.C0(this.r, 1, C08 + i18);
        int i20 = 0;
        for (int i21 = 0; i21 < this.s.size(); i21++) {
            i20 += CodedOutputStream.q(this.s.get(i21));
        }
        int C010 = je.C0(this.s, 1, C09 + i20);
        int i22 = 0;
        for (int i23 = 0; i23 < this.t.size(); i23++) {
            i22 += CodedOutputStream.q(this.t.get(i23));
        }
        int C011 = je.C0(this.t, 1, C010 + i22);
        int i24 = 0;
        for (int i25 = 0; i25 < this.u.size(); i25++) {
            i24 += CodedOutputStream.q(this.u.get(i25));
        }
        int C012 = je.C0(this.u, 1, C011 + i24);
        int i26 = 0;
        for (int i27 = 0; i27 < this.v.size(); i27++) {
            i26 += CodedOutputStream.q(this.v.get(i27));
        }
        int C013 = je.C0(this.v, 1, C012 + i26);
        int i28 = 0;
        for (int i29 = 0; i29 < this.w.size(); i29++) {
            i28 += CodedOutputStream.q(this.w.get(i29));
        }
        int C014 = je.C0(this.w, 1, C013 + i28);
        int i30 = 0;
        for (int i31 = 0; i31 < this.x.size(); i31++) {
            i30 += CodedOutputStream.q(this.x.get(i31));
        }
        int C015 = je.C0(this.x, 1, C014 + i30);
        int i32 = 0;
        for (int i33 = 0; i33 < this.y.size(); i33++) {
            i32 += CodedOutputStream.q(this.y.get(i33));
        }
        int C016 = je.C0(this.y, 2, C015 + i32);
        int i34 = 0;
        for (int i35 = 0; i35 < this.z.size(); i35++) {
            i34 += CodedOutputStream.q(this.z.get(i35));
        }
        int C017 = je.C0(this.z, 2, C016 + i34);
        int i36 = 0;
        for (int i37 = 0; i37 < this.A.size(); i37++) {
            i36 += CodedOutputStream.q(this.A.get(i37));
        }
        int C018 = je.C0(this.A, 2, C017 + i36);
        int i38 = 0;
        for (int i39 = 0; i39 < this.B.size(); i39++) {
            i38 += CodedOutputStream.q(this.B.get(i39));
        }
        int C019 = je.C0(this.B, 2, C018 + i38);
        int i40 = 0;
        for (int i41 = 0; i41 < this.C.size(); i41++) {
            i40 += CodedOutputStream.q(this.C.get(i41));
        }
        int C020 = je.C0(this.C, 2, C019 + i40);
        int i42 = 0;
        for (int i43 = 0; i43 < this.D.size(); i43++) {
            i42 += CodedOutputStream.q(this.D.get(i43));
        }
        int C021 = je.C0(this.D, 2, C020 + i42);
        int i44 = 0;
        for (int i45 = 0; i45 < this.E.size(); i45++) {
            i44 += CodedOutputStream.q(this.E.get(i45));
        }
        int C022 = je.C0(this.E, 2, C021 + i44);
        int i46 = 0;
        for (int i47 = 0; i47 < this.F.size(); i47++) {
            i46 += CodedOutputStream.q(this.F.get(i47));
        }
        int C023 = je.C0(this.F, 2, C022 + i46);
        this.memoizedSerializedSize = C023;
        return C023;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.P(1, this.a.get(i));
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            codedOutputStream.P(2, this.b.get(i2));
        }
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            codedOutputStream.P(3, this.c.get(i3));
        }
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            codedOutputStream.P(4, this.f.get(i4));
        }
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            codedOutputStream.P(5, this.n.get(i5));
        }
        for (int i6 = 0; i6 < this.o.size(); i6++) {
            codedOutputStream.P(6, this.o.get(i6));
        }
        for (int i7 = 0; i7 < this.p.size(); i7++) {
            codedOutputStream.P(7, this.p.get(i7));
        }
        for (int i8 = 0; i8 < this.q.size(); i8++) {
            codedOutputStream.P(8, this.q.get(i8));
        }
        for (int i9 = 0; i9 < this.r.size(); i9++) {
            codedOutputStream.P(9, this.r.get(i9));
        }
        for (int i10 = 0; i10 < this.s.size(); i10++) {
            codedOutputStream.P(10, this.s.get(i10));
        }
        for (int i11 = 0; i11 < this.t.size(); i11++) {
            codedOutputStream.P(11, this.t.get(i11));
        }
        for (int i12 = 0; i12 < this.u.size(); i12++) {
            codedOutputStream.P(12, this.u.get(i12));
        }
        for (int i13 = 0; i13 < this.v.size(); i13++) {
            codedOutputStream.P(13, this.v.get(i13));
        }
        for (int i14 = 0; i14 < this.w.size(); i14++) {
            codedOutputStream.P(14, this.w.get(i14));
        }
        for (int i15 = 0; i15 < this.x.size(); i15++) {
            codedOutputStream.P(15, this.x.get(i15));
        }
        for (int i16 = 0; i16 < this.y.size(); i16++) {
            codedOutputStream.P(16, this.y.get(i16));
        }
        for (int i17 = 0; i17 < this.z.size(); i17++) {
            codedOutputStream.P(17, this.z.get(i17));
        }
        for (int i18 = 0; i18 < this.A.size(); i18++) {
            codedOutputStream.P(18, this.A.get(i18));
        }
        for (int i19 = 0; i19 < this.B.size(); i19++) {
            codedOutputStream.P(19, this.B.get(i19));
        }
        for (int i20 = 0; i20 < this.C.size(); i20++) {
            codedOutputStream.P(20, this.C.get(i20));
        }
        for (int i21 = 0; i21 < this.D.size(); i21++) {
            codedOutputStream.P(21, this.D.get(i21));
        }
        for (int i22 = 0; i22 < this.E.size(); i22++) {
            codedOutputStream.P(22, this.E.get(i22));
        }
        for (int i23 = 0; i23 < this.F.size(); i23++) {
            codedOutputStream.P(23, this.F.get(i23));
        }
    }
}
