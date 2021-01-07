package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class LanguageSelection extends GeneratedMessageLite<LanguageSelection, b> implements Object {
    private static final LanguageSelection n;
    private static volatile x<LanguageSelection> o;
    private int a;
    private o.i<String> b = GeneratedMessageLite.emptyProtobufList();
    private String c = "";
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<LanguageSelection, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            LanguageSelection.h((LanguageSelection) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            LanguageSelection.i((LanguageSelection) this.instance, str);
            return this;
        }

        private b() {
            super(LanguageSelection.n);
        }
    }

    static {
        LanguageSelection languageSelection = new LanguageSelection();
        n = languageSelection;
        languageSelection.makeImmutable();
    }

    private LanguageSelection() {
    }

    static void h(LanguageSelection languageSelection, Iterable iterable) {
        if (!languageSelection.b.R0()) {
            languageSelection.b = GeneratedMessageLite.mutableCopy(languageSelection.b);
        }
        com.google.protobuf.a.addAll(iterable, languageSelection.b);
    }

    static void i(LanguageSelection languageSelection, String str) {
        languageSelection.getClass();
        str.getClass();
        languageSelection.a |= 2;
        languageSelection.f = str;
    }

    public static b l() {
        return (b) n.toBuilder();
    }

    public static x<LanguageSelection> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                LanguageSelection languageSelection = (LanguageSelection) obj2;
                this.b = hVar.q(this.b, languageSelection.b);
                this.c = hVar.n((this.a & 1) == 1, this.c, (languageSelection.a & 1) == 1, languageSelection.c);
                boolean z2 = (this.a & 2) == 2;
                String str = this.f;
                if ((languageSelection.a & 2) == 2) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, languageSelection.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= languageSelection.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z3 = gVar.z();
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(z3);
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.f = z5;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new LanguageSelection();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (LanguageSelection.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.q(this.b.get(i3));
        }
        int C0 = je.C0(this.b, 1, 0 + i2);
        if ((this.a & 1) == 1) {
            C0 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 2) == 2) {
            C0 += CodedOutputStream.p(3, this.f);
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.P(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
