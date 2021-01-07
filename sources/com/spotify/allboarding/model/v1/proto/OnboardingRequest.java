package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class OnboardingRequest extends GeneratedMessageLite<OnboardingRequest, b> implements Object {
    private static final OnboardingRequest b;
    private static volatile x<OnboardingRequest> c;
    private o.i<SelectedItem> a = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<OnboardingRequest, b> implements Object {
        public b m(Iterable<? extends SelectedItem> iterable) {
            copyOnWrite();
            OnboardingRequest.h((OnboardingRequest) this.instance, iterable);
            return this;
        }

        private b() {
            super(OnboardingRequest.b);
        }
    }

    static {
        OnboardingRequest onboardingRequest = new OnboardingRequest();
        b = onboardingRequest;
        onboardingRequest.makeImmutable();
    }

    private OnboardingRequest() {
    }

    static void h(OnboardingRequest onboardingRequest, Iterable iterable) {
        if (!onboardingRequest.a.R0()) {
            onboardingRequest.a = GeneratedMessageLite.mutableCopy(onboardingRequest.a);
        }
        com.google.protobuf.a.addAll(iterable, onboardingRequest.a);
    }

    public static b i() {
        return (b) b.toBuilder();
    }

    public static x<OnboardingRequest> parser() {
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
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((OnboardingRequest) obj2).a);
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
                                this.a.add(gVar.o(SelectedItem.parser(), kVar));
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
                this.a.C();
                return null;
            case 4:
                return new OnboardingRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (OnboardingRequest.class) {
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
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
