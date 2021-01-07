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

public final class ArtistDecorationPolicy extends GeneratedMessageLite<ArtistDecorationPolicy, Builder> implements ArtistDecorationPolicyOrBuilder {
    private static final ArtistDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_VARIOUS_ARTISTS_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile x<ArtistDecorationPolicy> PARSER = null;
    public static final int PORTRAITS_FIELD_NUMBER = 4;
    private boolean isVariousArtists_;
    private boolean link_;
    private boolean name_;
    private boolean portraits_;

    /* renamed from: com.spotify.cosmos.util.proto.ArtistDecorationPolicy$1  reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.b<ArtistDecorationPolicy, Builder> implements ArtistDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearIsVariousArtists() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearIsVariousArtists();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearPortraits() {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).clearPortraits();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
        public boolean getIsVariousArtists() {
            return ((ArtistDecorationPolicy) this.instance).getIsVariousArtists();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((ArtistDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
        public boolean getName() {
            return ((ArtistDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
        public boolean getPortraits() {
            return ((ArtistDecorationPolicy) this.instance).getPortraits();
        }

        public Builder setIsVariousArtists(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setIsVariousArtists(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setPortraits(boolean z) {
            copyOnWrite();
            ((ArtistDecorationPolicy) this.instance).setPortraits(z);
            return this;
        }

        private Builder() {
            super(ArtistDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        ArtistDecorationPolicy artistDecorationPolicy = new ArtistDecorationPolicy();
        DEFAULT_INSTANCE = artistDecorationPolicy;
        artistDecorationPolicy.makeImmutable();
    }

    private ArtistDecorationPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsVariousArtists() {
        this.isVariousArtists_ = false;
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
    private void clearPortraits() {
        this.portraits_ = false;
    }

    public static ArtistDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static ArtistDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistDecorationPolicy parseFrom(ByteString byteString) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<ArtistDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsVariousArtists(boolean z) {
        this.isVariousArtists_ = z;
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
    private void setPortraits(boolean z) {
        this.portraits_ = z;
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
                ArtistDecorationPolicy artistDecorationPolicy = (ArtistDecorationPolicy) obj2;
                boolean z = this.link_;
                boolean z2 = artistDecorationPolicy.link_;
                this.link_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.name_;
                boolean z4 = artistDecorationPolicy.name_;
                this.name_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.isVariousArtists_;
                boolean z6 = artistDecorationPolicy.isVariousArtists_;
                this.isVariousArtists_ = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.portraits_;
                boolean z8 = artistDecorationPolicy.portraits_;
                this.portraits_ = hVar.f(z7, z7, z8, z8);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z9 = false;
                while (!z9) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.link_ = gVar.h();
                            } else if (B == 16) {
                                this.name_ = gVar.h();
                            } else if (B == 24) {
                                this.isVariousArtists_ = gVar.h();
                            } else if (B == 32) {
                                this.portraits_ = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z9 = true;
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
                return new ArtistDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (ArtistDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
    public boolean getIsVariousArtists() {
        return this.isVariousArtists_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistDecorationPolicyOrBuilder
    public boolean getPortraits() {
        return this.portraits_;
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
        boolean z3 = this.isVariousArtists_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.portraits_;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
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
        boolean z3 = this.isVariousArtists_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.portraits_;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
    }

    public static Builder newBuilder(ArtistDecorationPolicy artistDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) artistDecorationPolicy);
    }

    public static ArtistDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static ArtistDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static ArtistDecorationPolicy parseFrom(byte[] bArr) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static ArtistDecorationPolicy parseFrom(InputStream inputStream) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static ArtistDecorationPolicy parseFrom(g gVar) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static ArtistDecorationPolicy parseFrom(g gVar, k kVar) {
        return (ArtistDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
