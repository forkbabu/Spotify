package com.spotify.eventsender;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.eventsender.Fragment;
import java.io.IOException;
import java.util.List;

public final class FragmentsContainer extends GeneratedMessageLite<FragmentsContainer, b> implements Object {
    private static final FragmentsContainer b;
    private static volatile x<FragmentsContainer> c;
    private o.i<Fragment> a = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<FragmentsContainer, b> implements Object {
        public b m(Iterable<? extends Fragment> iterable) {
            copyOnWrite();
            FragmentsContainer.i((FragmentsContainer) this.instance, iterable);
            return this;
        }

        public b n(Fragment.b bVar) {
            copyOnWrite();
            FragmentsContainer.h((FragmentsContainer) this.instance, bVar);
            return this;
        }

        private b() {
            super(FragmentsContainer.b);
        }
    }

    static {
        FragmentsContainer fragmentsContainer = new FragmentsContainer();
        b = fragmentsContainer;
        fragmentsContainer.makeImmutable();
    }

    private FragmentsContainer() {
    }

    static void h(FragmentsContainer fragmentsContainer, Fragment.b bVar) {
        if (!fragmentsContainer.a.R0()) {
            fragmentsContainer.a = GeneratedMessageLite.mutableCopy(fragmentsContainer.a);
        }
        fragmentsContainer.a.add(bVar.build());
    }

    static void i(FragmentsContainer fragmentsContainer, Iterable iterable) {
        if (!fragmentsContainer.a.R0()) {
            fragmentsContainer.a = GeneratedMessageLite.mutableCopy(fragmentsContainer.a);
        }
        com.google.protobuf.a.addAll(iterable, fragmentsContainer.a);
    }

    public static FragmentsContainer l() {
        return b;
    }

    public static b n() {
        return (b) b.toBuilder();
    }

    public static FragmentsContainer o(byte[] bArr) {
        return (FragmentsContainer) GeneratedMessageLite.parseFrom(b, bArr);
    }

    public static x<FragmentsContainer> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((FragmentsContainer) obj2).a);
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
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(Fragment.parser(), kVar));
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
                this.a.C();
                return null;
            case 4:
                return new FragmentsContainer();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (FragmentsContainer.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<Fragment> m() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
