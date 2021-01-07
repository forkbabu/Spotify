package com.spotify.cosmos.util.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;
import java.io.InputStream;

public final class ShowDecorationPolicy extends GeneratedMessageLite<ShowDecorationPolicy, Builder> implements ShowDecorationPolicyOrBuilder {
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 10;
    public static final int COPYRIGHTS_FIELD_NUMBER = 12;
    public static final int COVERS_FIELD_NUMBER = 8;
    private static final ShowDecorationPolicy DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 7;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 11;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_EPISODES_FIELD_NUMBER = 9;
    private static volatile x<ShowDecorationPolicy> PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 4;
    public static final int PUBLISHER_FIELD_NUMBER = 5;
    public static final int TRAILER_URI_FIELD_NUMBER = 13;
    private boolean consumptionOrder_;
    private boolean copyrights_;
    private boolean covers_;
    private boolean description_;
    private boolean isExplicit_;
    private boolean language_;
    private boolean link_;
    private boolean mediaTypeEnum_;
    private boolean name_;
    private boolean numEpisodes_;
    private boolean popularity_;
    private boolean publisher_;
    private boolean trailerUri_;

    /* renamed from: com.spotify.cosmos.util.proto.ShowDecorationPolicy$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            GeneratedMessageLite.MethodToInvoke.values();
            int[] iArr = new int[8];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.b<ShowDecorationPolicy, Builder> implements ShowDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearConsumptionOrder() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearConsumptionOrder();
            return this;
        }

        public Builder clearCopyrights() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearCopyrights();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearDescription();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearNumEpisodes() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearNumEpisodes();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearPopularity();
            return this;
        }

        public Builder clearPublisher() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearPublisher();
            return this;
        }

        public Builder clearTrailerUri() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearTrailerUri();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getConsumptionOrder() {
            return ((ShowDecorationPolicy) this.instance).getConsumptionOrder();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getCopyrights() {
            return ((ShowDecorationPolicy) this.instance).getCopyrights();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((ShowDecorationPolicy) this.instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getDescription() {
            return ((ShowDecorationPolicy) this.instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((ShowDecorationPolicy) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getLanguage() {
            return ((ShowDecorationPolicy) this.instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((ShowDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getMediaTypeEnum() {
            return ((ShowDecorationPolicy) this.instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getName() {
            return ((ShowDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getNumEpisodes() {
            return ((ShowDecorationPolicy) this.instance).getNumEpisodes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getPopularity() {
            return ((ShowDecorationPolicy) this.instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getPublisher() {
            return ((ShowDecorationPolicy) this.instance).getPublisher();
        }

        @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
        public boolean getTrailerUri() {
            return ((ShowDecorationPolicy) this.instance).getTrailerUri();
        }

        public Builder setConsumptionOrder(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setConsumptionOrder(z);
            return this;
        }

        public Builder setCopyrights(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setCopyrights(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setCovers(z);
            return this;
        }

        public Builder setDescription(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setDescription(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setLanguage(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setLanguage(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setMediaTypeEnum(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setMediaTypeEnum(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setNumEpisodes(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setNumEpisodes(z);
            return this;
        }

        public Builder setPopularity(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setPopularity(z);
            return this;
        }

        public Builder setPublisher(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setPublisher(z);
            return this;
        }

        public Builder setTrailerUri(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setTrailerUri(z);
            return this;
        }

        private Builder() {
            super(ShowDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        ShowDecorationPolicy showDecorationPolicy = new ShowDecorationPolicy();
        DEFAULT_INSTANCE = showDecorationPolicy;
        showDecorationPolicy.makeImmutable();
    }

    private ShowDecorationPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearConsumptionOrder() {
        this.consumptionOrder_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearCopyrights() {
        this.copyrights_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearCovers() {
        this.covers_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearDescription() {
        this.description_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLanguage() {
        this.language_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLink() {
        this.link_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearMediaTypeEnum() {
        this.mediaTypeEnum_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearName() {
        this.name_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearNumEpisodes() {
        this.numEpisodes_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPopularity() {
        this.popularity_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPublisher() {
        this.publisher_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearTrailerUri() {
        this.trailerUri_ = false;
    }

    public static ShowDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static ShowDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowDecorationPolicy parseFrom(ByteString byteString) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<ShowDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setConsumptionOrder(boolean z) {
        this.consumptionOrder_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCopyrights(boolean z) {
        this.copyrights_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCovers(boolean z) {
        this.covers_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDescription(boolean z) {
        this.description_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLanguage(boolean z) {
        this.language_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLink(boolean z) {
        this.link_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMediaTypeEnum(boolean z) {
        this.mediaTypeEnum_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setName(boolean z) {
        this.name_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setNumEpisodes(boolean z) {
        this.numEpisodes_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPopularity(boolean z) {
        this.popularity_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPublisher(boolean z) {
        this.publisher_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTrailerUri(boolean z) {
        this.trailerUri_ = z;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return DEFAULT_INSTANCE;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowDecorationPolicy showDecorationPolicy = (ShowDecorationPolicy) obj2;
                boolean z = this.link_;
                boolean z2 = showDecorationPolicy.link_;
                this.link_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.name_;
                boolean z4 = showDecorationPolicy.name_;
                this.name_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.description_;
                boolean z6 = showDecorationPolicy.description_;
                this.description_ = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.popularity_;
                boolean z8 = showDecorationPolicy.popularity_;
                this.popularity_ = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.publisher_;
                boolean z10 = showDecorationPolicy.publisher_;
                this.publisher_ = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.language_;
                boolean z12 = showDecorationPolicy.language_;
                this.language_ = hVar.f(z11, z11, z12, z12);
                boolean z13 = this.isExplicit_;
                boolean z14 = showDecorationPolicy.isExplicit_;
                this.isExplicit_ = hVar.f(z13, z13, z14, z14);
                boolean z15 = this.covers_;
                boolean z16 = showDecorationPolicy.covers_;
                this.covers_ = hVar.f(z15, z15, z16, z16);
                boolean z17 = this.numEpisodes_;
                boolean z18 = showDecorationPolicy.numEpisodes_;
                this.numEpisodes_ = hVar.f(z17, z17, z18, z18);
                boolean z19 = this.consumptionOrder_;
                boolean z20 = showDecorationPolicy.consumptionOrder_;
                this.consumptionOrder_ = hVar.f(z19, z19, z20, z20);
                boolean z21 = this.mediaTypeEnum_;
                boolean z22 = showDecorationPolicy.mediaTypeEnum_;
                this.mediaTypeEnum_ = hVar.f(z21, z21, z22, z22);
                boolean z23 = this.copyrights_;
                boolean z24 = showDecorationPolicy.copyrights_;
                this.copyrights_ = hVar.f(z23, z23, z24, z24);
                boolean z25 = this.trailerUri_;
                boolean z26 = showDecorationPolicy.trailerUri_;
                this.trailerUri_ = hVar.f(z25, z25, z26, z26);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z27 = false;
                while (!z27) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 8:
                                this.link_ = gVar.h();
                                continue;
                            case 16:
                                this.name_ = gVar.h();
                                continue;
                            case 24:
                                this.description_ = gVar.h();
                                continue;
                            case 32:
                                this.popularity_ = gVar.h();
                                continue;
                            case 40:
                                this.publisher_ = gVar.h();
                                continue;
                            case 48:
                                this.language_ = gVar.h();
                                continue;
                            case 56:
                                this.isExplicit_ = gVar.h();
                                continue;
                            case 64:
                                this.covers_ = gVar.h();
                                continue;
                            case 72:
                                this.numEpisodes_ = gVar.h();
                                continue;
                            case 80:
                                this.consumptionOrder_ = gVar.h();
                                continue;
                            case 88:
                                this.mediaTypeEnum_ = gVar.h();
                                continue;
                            case 96:
                                this.copyrights_ = gVar.h();
                                continue;
                            case 104:
                                this.trailerUri_ = gVar.h();
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
                        }
                        z27 = true;
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
                return new ShowDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (ShowDecorationPolicy.class) {
                        if (PARSER == null) {
                            PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            default:
                throw new UnsupportedOperationException();
        }
        return DEFAULT_INSTANCE;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getConsumptionOrder() {
        return this.consumptionOrder_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getCopyrights() {
        return this.copyrights_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getNumEpisodes() {
        return this.numEpisodes_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getPublisher() {
        return this.publisher_;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.link_;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.name_;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.description_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.popularity_;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        boolean z5 = this.publisher_;
        if (z5) {
            i2 += CodedOutputStream.d(5, z5);
        }
        boolean z6 = this.language_;
        if (z6) {
            i2 += CodedOutputStream.d(6, z6);
        }
        boolean z7 = this.isExplicit_;
        if (z7) {
            i2 += CodedOutputStream.d(7, z7);
        }
        boolean z8 = this.covers_;
        if (z8) {
            i2 += CodedOutputStream.d(8, z8);
        }
        boolean z9 = this.numEpisodes_;
        if (z9) {
            i2 += CodedOutputStream.d(9, z9);
        }
        boolean z10 = this.consumptionOrder_;
        if (z10) {
            i2 += CodedOutputStream.d(10, z10);
        }
        boolean z11 = this.mediaTypeEnum_;
        if (z11) {
            i2 += CodedOutputStream.d(11, z11);
        }
        boolean z12 = this.copyrights_;
        if (z12) {
            i2 += CodedOutputStream.d(12, z12);
        }
        boolean z13 = this.trailerUri_;
        if (z13) {
            i2 += CodedOutputStream.d(13, z13);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.spotify.cosmos.util.proto.ShowDecorationPolicyOrBuilder
    public boolean getTrailerUri() {
        return this.trailerUri_;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.link_;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.name_;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.description_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.popularity_;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
        boolean z5 = this.publisher_;
        if (z5) {
            codedOutputStream.A(5, z5);
        }
        boolean z6 = this.language_;
        if (z6) {
            codedOutputStream.A(6, z6);
        }
        boolean z7 = this.isExplicit_;
        if (z7) {
            codedOutputStream.A(7, z7);
        }
        boolean z8 = this.covers_;
        if (z8) {
            codedOutputStream.A(8, z8);
        }
        boolean z9 = this.numEpisodes_;
        if (z9) {
            codedOutputStream.A(9, z9);
        }
        boolean z10 = this.consumptionOrder_;
        if (z10) {
            codedOutputStream.A(10, z10);
        }
        boolean z11 = this.mediaTypeEnum_;
        if (z11) {
            codedOutputStream.A(11, z11);
        }
        boolean z12 = this.copyrights_;
        if (z12) {
            codedOutputStream.A(12, z12);
        }
        boolean z13 = this.trailerUri_;
        if (z13) {
            codedOutputStream.A(13, z13);
        }
    }

    public static Builder newBuilder(ShowDecorationPolicy showDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) showDecorationPolicy);
    }

    public static ShowDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static ShowDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static ShowDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static ShowDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static ShowDecorationPolicy parseFrom(g gVar) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static ShowDecorationPolicy parseFrom(g gVar, k kVar) {
        return (ShowDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
