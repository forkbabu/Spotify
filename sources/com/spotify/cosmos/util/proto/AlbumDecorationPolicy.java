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

public final class AlbumDecorationPolicy extends GeneratedMessageLite<AlbumDecorationPolicy, Builder> implements AlbumDecorationPolicyOrBuilder {
    public static final int COPYRIGHTS_FIELD_NUMBER = 3;
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final AlbumDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 9;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_DISCS_FIELD_NUMBER = 6;
    public static final int NUM_TRACKS_FIELD_NUMBER = 7;
    private static volatile x<AlbumDecorationPolicy> PARSER = null;
    public static final int PLAYABILITY_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 5;
    private boolean copyrights_;
    private boolean covers_;
    private boolean isPremiumOnly_;
    private boolean link_;
    private boolean name_;
    private boolean numDiscs_;
    private boolean numTracks_;
    private boolean playability_;
    private boolean year_;

    /* renamed from: com.spotify.cosmos.util.proto.AlbumDecorationPolicy$1  reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.b<AlbumDecorationPolicy, Builder> implements AlbumDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearCopyrights() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearCopyrights();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearCovers();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearNumDiscs() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearNumDiscs();
            return this;
        }

        public Builder clearNumTracks() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearNumTracks();
            return this;
        }

        public Builder clearPlayability() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearPlayability();
            return this;
        }

        public Builder clearYear() {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).clearYear();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getCopyrights() {
            return ((AlbumDecorationPolicy) this.instance).getCopyrights();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((AlbumDecorationPolicy) this.instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getIsPremiumOnly() {
            return ((AlbumDecorationPolicy) this.instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((AlbumDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getName() {
            return ((AlbumDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getNumDiscs() {
            return ((AlbumDecorationPolicy) this.instance).getNumDiscs();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getNumTracks() {
            return ((AlbumDecorationPolicy) this.instance).getNumTracks();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getPlayability() {
            return ((AlbumDecorationPolicy) this.instance).getPlayability();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
        public boolean getYear() {
            return ((AlbumDecorationPolicy) this.instance).getYear();
        }

        public Builder setCopyrights(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setCopyrights(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setCovers(z);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setNumDiscs(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setNumDiscs(z);
            return this;
        }

        public Builder setNumTracks(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setNumTracks(z);
            return this;
        }

        public Builder setPlayability(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setPlayability(z);
            return this;
        }

        public Builder setYear(boolean z) {
            copyOnWrite();
            ((AlbumDecorationPolicy) this.instance).setYear(z);
            return this;
        }

        private Builder() {
            super(AlbumDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        AlbumDecorationPolicy albumDecorationPolicy = new AlbumDecorationPolicy();
        DEFAULT_INSTANCE = albumDecorationPolicy;
        albumDecorationPolicy.makeImmutable();
    }

    private AlbumDecorationPolicy() {
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
    private void clearIsPremiumOnly() {
        this.isPremiumOnly_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLink() {
        this.link_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearName() {
        this.name_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearNumDiscs() {
        this.numDiscs_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearNumTracks() {
        this.numTracks_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPlayability() {
        this.playability_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearYear() {
        this.year_ = false;
    }

    public static AlbumDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static AlbumDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumDecorationPolicy parseFrom(ByteString byteString) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<AlbumDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    private void setIsPremiumOnly(boolean z) {
        this.isPremiumOnly_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLink(boolean z) {
        this.link_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setName(boolean z) {
        this.name_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setNumDiscs(boolean z) {
        this.numDiscs_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setNumTracks(boolean z) {
        this.numTracks_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPlayability(boolean z) {
        this.playability_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setYear(boolean z) {
        this.year_ = z;
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
                AlbumDecorationPolicy albumDecorationPolicy = (AlbumDecorationPolicy) obj2;
                boolean z = this.link_;
                boolean z2 = albumDecorationPolicy.link_;
                this.link_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.name_;
                boolean z4 = albumDecorationPolicy.name_;
                this.name_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.copyrights_;
                boolean z6 = albumDecorationPolicy.copyrights_;
                this.copyrights_ = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.covers_;
                boolean z8 = albumDecorationPolicy.covers_;
                this.covers_ = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.year_;
                boolean z10 = albumDecorationPolicy.year_;
                this.year_ = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.numDiscs_;
                boolean z12 = albumDecorationPolicy.numDiscs_;
                this.numDiscs_ = hVar.f(z11, z11, z12, z12);
                boolean z13 = this.numTracks_;
                boolean z14 = albumDecorationPolicy.numTracks_;
                this.numTracks_ = hVar.f(z13, z13, z14, z14);
                boolean z15 = this.playability_;
                boolean z16 = albumDecorationPolicy.playability_;
                this.playability_ = hVar.f(z15, z15, z16, z16);
                boolean z17 = this.isPremiumOnly_;
                boolean z18 = albumDecorationPolicy.isPremiumOnly_;
                this.isPremiumOnly_ = hVar.f(z17, z17, z18, z18);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z19 = false;
                while (!z19) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.link_ = gVar.h();
                            } else if (B == 16) {
                                this.name_ = gVar.h();
                            } else if (B == 24) {
                                this.copyrights_ = gVar.h();
                            } else if (B == 32) {
                                this.covers_ = gVar.h();
                            } else if (B == 40) {
                                this.year_ = gVar.h();
                            } else if (B == 48) {
                                this.numDiscs_ = gVar.h();
                            } else if (B == 56) {
                                this.numTracks_ = gVar.h();
                            } else if (B == 64) {
                                this.playability_ = gVar.h();
                            } else if (B == 72) {
                                this.isPremiumOnly_ = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z19 = true;
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
                return new AlbumDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (AlbumDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getCopyrights() {
        return this.copyrights_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getNumDiscs() {
        return this.numDiscs_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getNumTracks() {
        return this.numTracks_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getPlayability() {
        return this.playability_;
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
        boolean z3 = this.copyrights_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.covers_;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        boolean z5 = this.year_;
        if (z5) {
            i2 += CodedOutputStream.d(5, z5);
        }
        boolean z6 = this.numDiscs_;
        if (z6) {
            i2 += CodedOutputStream.d(6, z6);
        }
        boolean z7 = this.numTracks_;
        if (z7) {
            i2 += CodedOutputStream.d(7, z7);
        }
        boolean z8 = this.playability_;
        if (z8) {
            i2 += CodedOutputStream.d(8, z8);
        }
        boolean z9 = this.isPremiumOnly_;
        if (z9) {
            i2 += CodedOutputStream.d(9, z9);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumDecorationPolicyOrBuilder
    public boolean getYear() {
        return this.year_;
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
        boolean z3 = this.copyrights_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.covers_;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
        boolean z5 = this.year_;
        if (z5) {
            codedOutputStream.A(5, z5);
        }
        boolean z6 = this.numDiscs_;
        if (z6) {
            codedOutputStream.A(6, z6);
        }
        boolean z7 = this.numTracks_;
        if (z7) {
            codedOutputStream.A(7, z7);
        }
        boolean z8 = this.playability_;
        if (z8) {
            codedOutputStream.A(8, z8);
        }
        boolean z9 = this.isPremiumOnly_;
        if (z9) {
            codedOutputStream.A(9, z9);
        }
    }

    public static Builder newBuilder(AlbumDecorationPolicy albumDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) albumDecorationPolicy);
    }

    public static AlbumDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static AlbumDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static AlbumDecorationPolicy parseFrom(byte[] bArr) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlbumDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static AlbumDecorationPolicy parseFrom(InputStream inputStream) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static AlbumDecorationPolicy parseFrom(g gVar) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static AlbumDecorationPolicy parseFrom(g gVar, k kVar) {
        return (AlbumDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
