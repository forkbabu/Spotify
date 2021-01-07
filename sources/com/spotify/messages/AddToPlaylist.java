package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class AddToPlaylist extends GeneratedMessageLite<AddToPlaylist, b> implements Object {
    private static final AddToPlaylist p;
    private static volatile x<AddToPlaylist> q;
    private int a;
    private o.i<String> b = GeneratedMessageLite.emptyProtobufList();
    private String c = "";
    private String f = "";
    private String n = "";
    private boolean o;

    public static final class b extends GeneratedMessageLite.b<AddToPlaylist, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            AddToPlaylist.l((AddToPlaylist) this.instance, iterable);
            return this;
        }

        public b n(boolean z) {
            copyOnWrite();
            AddToPlaylist.i((AddToPlaylist) this.instance, z);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            AddToPlaylist.h((AddToPlaylist) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            AddToPlaylist.n((AddToPlaylist) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            AddToPlaylist.m((AddToPlaylist) this.instance, str);
            return this;
        }

        private b() {
            super(AddToPlaylist.p);
        }
    }

    static {
        AddToPlaylist addToPlaylist = new AddToPlaylist();
        p = addToPlaylist;
        addToPlaylist.makeImmutable();
    }

    private AddToPlaylist() {
    }

    static void h(AddToPlaylist addToPlaylist, String str) {
        addToPlaylist.getClass();
        str.getClass();
        addToPlaylist.a |= 4;
        addToPlaylist.n = str;
    }

    static void i(AddToPlaylist addToPlaylist, boolean z) {
        addToPlaylist.a |= 8;
        addToPlaylist.o = z;
    }

    static void l(AddToPlaylist addToPlaylist, Iterable iterable) {
        if (!addToPlaylist.b.R0()) {
            addToPlaylist.b = GeneratedMessageLite.mutableCopy(addToPlaylist.b);
        }
        com.google.protobuf.a.addAll(iterable, addToPlaylist.b);
    }

    static void m(AddToPlaylist addToPlaylist, String str) {
        addToPlaylist.getClass();
        str.getClass();
        addToPlaylist.a |= 1;
        addToPlaylist.c = str;
    }

    static void n(AddToPlaylist addToPlaylist, String str) {
        addToPlaylist.getClass();
        str.getClass();
        addToPlaylist.a |= 2;
        addToPlaylist.f = str;
    }

    public static b o() {
        return (b) p.toBuilder();
    }

    public static x<AddToPlaylist> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                AddToPlaylist addToPlaylist = (AddToPlaylist) obj2;
                this.b = hVar.q(this.b, addToPlaylist.b);
                this.c = hVar.n((this.a & 1) == 1, this.c, (addToPlaylist.a & 1) == 1, addToPlaylist.c);
                this.f = hVar.n((this.a & 2) == 2, this.f, (addToPlaylist.a & 2) == 2, addToPlaylist.f);
                this.n = hVar.n((this.a & 4) == 4, this.n, (addToPlaylist.a & 4) == 4, addToPlaylist.n);
                boolean z2 = (this.a & 8) == 8;
                boolean z3 = this.o;
                if ((addToPlaylist.a & 8) == 8) {
                    z = true;
                }
                this.o = hVar.f(z2, z3, z, addToPlaylist.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= addToPlaylist.a;
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
                                String z4 = gVar.z();
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(z4);
                            } else if (B == 18) {
                                String z5 = gVar.z();
                                this.a |= 1;
                                this.c = z5;
                            } else if (B == 26) {
                                String z6 = gVar.z();
                                this.a |= 2;
                                this.f = z6;
                            } else if (B == 34) {
                                String z7 = gVar.z();
                                this.a |= 4;
                                this.n = z7;
                            } else if (B == 40) {
                                this.a |= 8;
                                this.o = gVar.h();
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
                return new AddToPlaylist();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (AddToPlaylist.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
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
        if ((this.a & 4) == 4) {
            C0 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 8) == 8) {
            C0 += CodedOutputStream.d(5, this.o);
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
        if ((this.a & 4) == 4) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
