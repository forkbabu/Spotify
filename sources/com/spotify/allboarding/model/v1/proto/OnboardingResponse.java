package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.NextStep;
import com.spotify.allboarding.model.v1.proto.NullableString;
import com.spotify.allboarding.model.v1.proto.SearchConfiguration;
import java.io.IOException;
import java.util.List;

public final class OnboardingResponse extends GeneratedMessageLite<OnboardingResponse, b> implements Object {
    private static final OnboardingResponse s;
    private static volatile x<OnboardingResponse> t;
    private int a;
    private String b = "";
    private int c;
    private NullableString f;
    private NextStep n;
    private int o;
    private o.i<Section> p = GeneratedMessageLite.emptyProtobufList();
    private NextStep q;
    private SearchConfiguration r;

    public static final class b extends GeneratedMessageLite.b<OnboardingResponse, b> implements Object {
        private b() {
            super(OnboardingResponse.s);
        }
    }

    static {
        OnboardingResponse onboardingResponse = new OnboardingResponse();
        s = onboardingResponse;
        onboardingResponse.makeImmutable();
    }

    private OnboardingResponse() {
    }

    public static x<OnboardingResponse> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                OnboardingResponse onboardingResponse = (OnboardingResponse) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !onboardingResponse.b.isEmpty(), onboardingResponse.b);
                int i = this.c;
                boolean z2 = i != 0;
                int i2 = onboardingResponse.c;
                this.c = hVar.m(z2, i, i2 != 0, i2);
                this.f = (NullableString) hVar.i(this.f, onboardingResponse.f);
                this.n = (NextStep) hVar.i(this.n, onboardingResponse.n);
                int i3 = this.o;
                boolean z3 = i3 != 0;
                int i4 = onboardingResponse.o;
                if (i4 != 0) {
                    z = true;
                }
                this.o = hVar.m(z3, i3, z, i4);
                this.p = hVar.q(this.p, onboardingResponse.p);
                this.q = (NextStep) hVar.i(this.q, onboardingResponse.q);
                this.r = (SearchConfiguration) hVar.i(this.r, onboardingResponse.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= onboardingResponse.a;
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
                                this.b = gVar.A();
                            } else if (B == 16) {
                                this.c = gVar.u();
                            } else if (B == 26) {
                                NullableString nullableString = this.f;
                                NullableString.b bVar = nullableString != null ? (NullableString.b) nullableString.toBuilder() : null;
                                NullableString nullableString2 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.f = nullableString2;
                                if (bVar != null) {
                                    bVar.mergeFrom((NullableString.b) nullableString2);
                                    this.f = (NullableString) bVar.buildPartial();
                                }
                            } else if (B == 34) {
                                NextStep nextStep = this.n;
                                NextStep.b bVar2 = nextStep != null ? (NextStep.b) nextStep.toBuilder() : null;
                                NextStep nextStep2 = (NextStep) gVar.o(NextStep.parser(), kVar);
                                this.n = nextStep2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((NextStep.b) nextStep2);
                                    this.n = (NextStep) bVar2.buildPartial();
                                }
                            } else if (B == 40) {
                                this.o = gVar.u();
                            } else if (B == 50) {
                                if (!this.p.R0()) {
                                    this.p = GeneratedMessageLite.mutableCopy(this.p);
                                }
                                this.p.add(gVar.o(Section.parser(), kVar));
                            } else if (B == 58) {
                                NextStep nextStep3 = this.q;
                                NextStep.b bVar3 = nextStep3 != null ? (NextStep.b) nextStep3.toBuilder() : null;
                                NextStep nextStep4 = (NextStep) gVar.o(NextStep.parser(), kVar);
                                this.q = nextStep4;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((NextStep.b) nextStep4);
                                    this.q = (NextStep) bVar3.buildPartial();
                                }
                            } else if (B == 66) {
                                SearchConfiguration searchConfiguration = this.r;
                                SearchConfiguration.b bVar4 = searchConfiguration != null ? (SearchConfiguration.b) searchConfiguration.toBuilder() : null;
                                SearchConfiguration searchConfiguration2 = (SearchConfiguration) gVar.o(SearchConfiguration.parser(), kVar);
                                this.r = searchConfiguration2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((SearchConfiguration.b) searchConfiguration2);
                                    this.r = (SearchConfiguration) bVar4.buildPartial();
                                }
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
                this.p.C();
                return null;
            case 4:
                return new OnboardingResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (OnboardingResponse.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (this.c != ScreenType.LOADING.getNumber()) {
            p2 += CodedOutputStream.h(2, this.c);
        }
        if (this.f != null) {
            p2 += CodedOutputStream.n(3, p());
        }
        if (this.n != null) {
            p2 += CodedOutputStream.n(4, i());
        }
        int i2 = this.o;
        if (i2 != 0) {
            p2 += CodedOutputStream.j(5, i2);
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            p2 += CodedOutputStream.n(6, this.p.get(i3));
        }
        if (this.q != null) {
            p2 += CodedOutputStream.n(7, l());
        }
        if (this.r != null) {
            p2 += CodedOutputStream.n(8, m());
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public int h() {
        return this.o;
    }

    public NextStep i() {
        NextStep nextStep = this.n;
        return nextStep == null ? NextStep.l() : nextStep;
    }

    public NextStep l() {
        NextStep nextStep = this.q;
        return nextStep == null ? NextStep.l() : nextStep;
    }

    public SearchConfiguration m() {
        SearchConfiguration searchConfiguration = this.r;
        return searchConfiguration == null ? SearchConfiguration.h() : searchConfiguration;
    }

    public List<Section> n() {
        return this.p;
    }

    public String o() {
        return this.b;
    }

    public NullableString p() {
        NullableString nullableString = this.f;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public ScreenType q() {
        ScreenType screenType;
        int i = this.c;
        if (i == 0) {
            screenType = ScreenType.LOADING;
        } else if (i != 1) {
            screenType = null;
        } else {
            screenType = ScreenType.PICKER;
        }
        return screenType == null ? ScreenType.UNRECOGNIZED : screenType;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (this.c != ScreenType.LOADING.getNumber()) {
            codedOutputStream.K(2, this.c);
        }
        if (this.f != null) {
            codedOutputStream.M(3, p());
        }
        if (this.n != null) {
            codedOutputStream.M(4, i());
        }
        int i = this.o;
        if (i != 0) {
            codedOutputStream.K(5, i);
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            codedOutputStream.M(6, this.p.get(i2));
        }
        if (this.q != null) {
            codedOutputStream.M(7, l());
        }
        if (this.r != null) {
            codedOutputStream.M(8, m());
        }
    }
}
