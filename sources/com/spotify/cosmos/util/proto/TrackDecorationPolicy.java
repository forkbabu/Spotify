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

public final class TrackDecorationPolicy extends GeneratedMessageLite<TrackDecorationPolicy, Builder> implements TrackDecorationPolicyOrBuilder {
    private static final TrackDecorationPolicy DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER = 9;
    public static final int HAS_LYRICS_FIELD_NUMBER = 1;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 17;
    public static final int IS_AVAILABLE_IN_METADATA_CATALOGUE_FIELD_NUMBER = 6;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 11;
    public static final int IS_LOCAL_FIELD_NUMBER = 13;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 14;
    public static final int LENGTH_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile x<TrackDecorationPolicy> PARSER = null;
    public static final int PLAYABLE_FIELD_NUMBER = 5;
    public static final int PLAYABLE_LOCAL_TRACK_FIELD_NUMBER = 8;
    public static final int PLAYABLE_TRACK_LINK_FIELD_NUMBER = 15;
    public static final int POPULARITY_FIELD_NUMBER = 16;
    public static final int PREVIEW_ID_FIELD_NUMBER = 12;
    public static final int TRACK_DESCRIPTORS_FIELD_NUMBER = 18;
    public static final int TRACK_NUMBER_FIELD_NUMBER = 10;
    private boolean discNumber_;
    private boolean hasLyrics_;
    private boolean is19PlusOnly_;
    private boolean isAvailableInMetadataCatalogue_;
    private boolean isExplicit_;
    private boolean isLocal_;
    private boolean isPremiumOnly_;
    private boolean length_;
    private boolean link_;
    private boolean locallyPlayable_;
    private boolean name_;
    private boolean playableLocalTrack_;
    private boolean playableTrackLink_;
    private boolean playable_;
    private boolean popularity_;
    private boolean previewId_;
    private boolean trackDescriptors_;
    private boolean trackNumber_;

    /* renamed from: com.spotify.cosmos.util.proto.TrackDecorationPolicy$1  reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.b<TrackDecorationPolicy, Builder> implements TrackDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearDiscNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearDiscNumber();
            return this;
        }

        public Builder clearHasLyrics() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearHasLyrics();
            return this;
        }

        public Builder clearIs19PlusOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIs19PlusOnly();
            return this;
        }

        public Builder clearIsAvailableInMetadataCatalogue() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsAvailableInMetadataCatalogue();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsLocal() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsLocal();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearLocallyPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLocallyPlayable();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayable();
            return this;
        }

        public Builder clearPlayableLocalTrack() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayableLocalTrack();
            return this;
        }

        public Builder clearPlayableTrackLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayableTrackLink();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPopularity();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPreviewId();
            return this;
        }

        public Builder clearTrackDescriptors() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearTrackDescriptors();
            return this;
        }

        public Builder clearTrackNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearTrackNumber();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getDiscNumber() {
            return ((TrackDecorationPolicy) this.instance).getDiscNumber();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getHasLyrics() {
            return ((TrackDecorationPolicy) this.instance).getHasLyrics();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getIs19PlusOnly() {
            return ((TrackDecorationPolicy) this.instance).getIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsAvailableInMetadataCatalogue() {
            return ((TrackDecorationPolicy) this.instance).getIsAvailableInMetadataCatalogue();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((TrackDecorationPolicy) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsLocal() {
            return ((TrackDecorationPolicy) this.instance).getIsLocal();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsPremiumOnly() {
            return ((TrackDecorationPolicy) this.instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getLength() {
            return ((TrackDecorationPolicy) this.instance).getLength();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((TrackDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getLocallyPlayable() {
            return ((TrackDecorationPolicy) this.instance).getLocallyPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getName() {
            return ((TrackDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayable() {
            return ((TrackDecorationPolicy) this.instance).getPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableLocalTrack() {
            return ((TrackDecorationPolicy) this.instance).getPlayableLocalTrack();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableTrackLink() {
            return ((TrackDecorationPolicy) this.instance).getPlayableTrackLink();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getPopularity() {
            return ((TrackDecorationPolicy) this.instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getPreviewId() {
            return ((TrackDecorationPolicy) this.instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackDescriptors() {
            return ((TrackDecorationPolicy) this.instance).getTrackDescriptors();
        }

        @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackNumber() {
            return ((TrackDecorationPolicy) this.instance).getTrackNumber();
        }

        public Builder setDiscNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setDiscNumber(z);
            return this;
        }

        public Builder setHasLyrics(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setHasLyrics(z);
            return this;
        }

        public Builder setIs19PlusOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIs19PlusOnly(z);
            return this;
        }

        public Builder setIsAvailableInMetadataCatalogue(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsAvailableInMetadataCatalogue(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsLocal(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsLocal(z);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLength(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLength(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setLocallyPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLocallyPlayable(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayable(z);
            return this;
        }

        public Builder setPlayableLocalTrack(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayableLocalTrack(z);
            return this;
        }

        public Builder setPlayableTrackLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayableTrackLink(z);
            return this;
        }

        public Builder setPopularity(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPopularity(z);
            return this;
        }

        public Builder setPreviewId(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPreviewId(z);
            return this;
        }

        public Builder setTrackDescriptors(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setTrackDescriptors(z);
            return this;
        }

        public Builder setTrackNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setTrackNumber(z);
            return this;
        }

        private Builder() {
            super(TrackDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        TrackDecorationPolicy trackDecorationPolicy = new TrackDecorationPolicy();
        DEFAULT_INSTANCE = trackDecorationPolicy;
        trackDecorationPolicy.makeImmutable();
    }

    private TrackDecorationPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearDiscNumber() {
        this.discNumber_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearHasLyrics() {
        this.hasLyrics_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIs19PlusOnly() {
        this.is19PlusOnly_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsAvailableInMetadataCatalogue() {
        this.isAvailableInMetadataCatalogue_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsLocal() {
        this.isLocal_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsPremiumOnly() {
        this.isPremiumOnly_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLength() {
        this.length_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLink() {
        this.link_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearLocallyPlayable() {
        this.locallyPlayable_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearName() {
        this.name_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPlayable() {
        this.playable_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPlayableLocalTrack() {
        this.playableLocalTrack_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPlayableTrackLink() {
        this.playableTrackLink_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPopularity() {
        this.popularity_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPreviewId() {
        this.previewId_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearTrackDescriptors() {
        this.trackDescriptors_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearTrackNumber() {
        this.trackNumber_ = false;
    }

    public static TrackDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static TrackDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDecorationPolicy parseFrom(ByteString byteString) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<TrackDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDiscNumber(boolean z) {
        this.discNumber_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setHasLyrics(boolean z) {
        this.hasLyrics_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIs19PlusOnly(boolean z) {
        this.is19PlusOnly_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsAvailableInMetadataCatalogue(boolean z) {
        this.isAvailableInMetadataCatalogue_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsLocal(boolean z) {
        this.isLocal_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsPremiumOnly(boolean z) {
        this.isPremiumOnly_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLength(boolean z) {
        this.length_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLink(boolean z) {
        this.link_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLocallyPlayable(boolean z) {
        this.locallyPlayable_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setName(boolean z) {
        this.name_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPlayable(boolean z) {
        this.playable_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPlayableLocalTrack(boolean z) {
        this.playableLocalTrack_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPlayableTrackLink(boolean z) {
        this.playableTrackLink_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPopularity(boolean z) {
        this.popularity_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPreviewId(boolean z) {
        this.previewId_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTrackDescriptors(boolean z) {
        this.trackDescriptors_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTrackNumber(boolean z) {
        this.trackNumber_ = z;
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
                TrackDecorationPolicy trackDecorationPolicy = (TrackDecorationPolicy) obj2;
                boolean z = this.hasLyrics_;
                boolean z2 = trackDecorationPolicy.hasLyrics_;
                this.hasLyrics_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.link_;
                boolean z4 = trackDecorationPolicy.link_;
                this.link_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.name_;
                boolean z6 = trackDecorationPolicy.name_;
                this.name_ = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.length_;
                boolean z8 = trackDecorationPolicy.length_;
                this.length_ = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.playable_;
                boolean z10 = trackDecorationPolicy.playable_;
                this.playable_ = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.isAvailableInMetadataCatalogue_;
                boolean z12 = trackDecorationPolicy.isAvailableInMetadataCatalogue_;
                this.isAvailableInMetadataCatalogue_ = hVar.f(z11, z11, z12, z12);
                boolean z13 = this.locallyPlayable_;
                boolean z14 = trackDecorationPolicy.locallyPlayable_;
                this.locallyPlayable_ = hVar.f(z13, z13, z14, z14);
                boolean z15 = this.playableLocalTrack_;
                boolean z16 = trackDecorationPolicy.playableLocalTrack_;
                this.playableLocalTrack_ = hVar.f(z15, z15, z16, z16);
                boolean z17 = this.discNumber_;
                boolean z18 = trackDecorationPolicy.discNumber_;
                this.discNumber_ = hVar.f(z17, z17, z18, z18);
                boolean z19 = this.trackNumber_;
                boolean z20 = trackDecorationPolicy.trackNumber_;
                this.trackNumber_ = hVar.f(z19, z19, z20, z20);
                boolean z21 = this.isExplicit_;
                boolean z22 = trackDecorationPolicy.isExplicit_;
                this.isExplicit_ = hVar.f(z21, z21, z22, z22);
                boolean z23 = this.previewId_;
                boolean z24 = trackDecorationPolicy.previewId_;
                this.previewId_ = hVar.f(z23, z23, z24, z24);
                boolean z25 = this.isLocal_;
                boolean z26 = trackDecorationPolicy.isLocal_;
                this.isLocal_ = hVar.f(z25, z25, z26, z26);
                boolean z27 = this.isPremiumOnly_;
                boolean z28 = trackDecorationPolicy.isPremiumOnly_;
                this.isPremiumOnly_ = hVar.f(z27, z27, z28, z28);
                boolean z29 = this.playableTrackLink_;
                boolean z30 = trackDecorationPolicy.playableTrackLink_;
                this.playableTrackLink_ = hVar.f(z29, z29, z30, z30);
                boolean z31 = this.popularity_;
                boolean z32 = trackDecorationPolicy.popularity_;
                this.popularity_ = hVar.f(z31, z31, z32, z32);
                boolean z33 = this.is19PlusOnly_;
                boolean z34 = trackDecorationPolicy.is19PlusOnly_;
                this.is19PlusOnly_ = hVar.f(z33, z33, z34, z34);
                boolean z35 = this.trackDescriptors_;
                boolean z36 = trackDecorationPolicy.trackDescriptors_;
                this.trackDescriptors_ = hVar.f(z35, z35, z36, z36);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z37 = false;
                while (!z37) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 8:
                                this.hasLyrics_ = gVar.h();
                                continue;
                            case 16:
                                this.link_ = gVar.h();
                                continue;
                            case 24:
                                this.name_ = gVar.h();
                                continue;
                            case 32:
                                this.length_ = gVar.h();
                                continue;
                            case 40:
                                this.playable_ = gVar.h();
                                continue;
                            case 48:
                                this.isAvailableInMetadataCatalogue_ = gVar.h();
                                continue;
                            case 56:
                                this.locallyPlayable_ = gVar.h();
                                continue;
                            case 64:
                                this.playableLocalTrack_ = gVar.h();
                                continue;
                            case 72:
                                this.discNumber_ = gVar.h();
                                continue;
                            case 80:
                                this.trackNumber_ = gVar.h();
                                continue;
                            case 88:
                                this.isExplicit_ = gVar.h();
                                continue;
                            case 96:
                                this.previewId_ = gVar.h();
                                continue;
                            case 104:
                                this.isLocal_ = gVar.h();
                                continue;
                            case 112:
                                this.isPremiumOnly_ = gVar.h();
                                continue;
                            case 120:
                                this.playableTrackLink_ = gVar.h();
                                continue;
                            case 128:
                                this.popularity_ = gVar.h();
                                continue;
                            case 136:
                                this.is19PlusOnly_ = gVar.h();
                                continue;
                            case 144:
                                this.trackDescriptors_ = gVar.h();
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
                        }
                        z37 = true;
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
                return new TrackDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (TrackDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getDiscNumber() {
        return this.discNumber_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getHasLyrics() {
        return this.hasLyrics_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsAvailableInMetadataCatalogue() {
        return this.isAvailableInMetadataCatalogue_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsLocal() {
        return this.isLocal_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableLocalTrack() {
        return this.playableLocalTrack_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableTrackLink() {
        return this.playableTrackLink_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getPreviewId() {
        return this.previewId_;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.hasLyrics_;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.link_;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.name_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.length_;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        boolean z5 = this.playable_;
        if (z5) {
            i2 += CodedOutputStream.d(5, z5);
        }
        boolean z6 = this.isAvailableInMetadataCatalogue_;
        if (z6) {
            i2 += CodedOutputStream.d(6, z6);
        }
        boolean z7 = this.locallyPlayable_;
        if (z7) {
            i2 += CodedOutputStream.d(7, z7);
        }
        boolean z8 = this.playableLocalTrack_;
        if (z8) {
            i2 += CodedOutputStream.d(8, z8);
        }
        boolean z9 = this.discNumber_;
        if (z9) {
            i2 += CodedOutputStream.d(9, z9);
        }
        boolean z10 = this.trackNumber_;
        if (z10) {
            i2 += CodedOutputStream.d(10, z10);
        }
        boolean z11 = this.isExplicit_;
        if (z11) {
            i2 += CodedOutputStream.d(11, z11);
        }
        boolean z12 = this.previewId_;
        if (z12) {
            i2 += CodedOutputStream.d(12, z12);
        }
        boolean z13 = this.isLocal_;
        if (z13) {
            i2 += CodedOutputStream.d(13, z13);
        }
        boolean z14 = this.isPremiumOnly_;
        if (z14) {
            i2 += CodedOutputStream.d(14, z14);
        }
        boolean z15 = this.playableTrackLink_;
        if (z15) {
            i2 += CodedOutputStream.d(15, z15);
        }
        boolean z16 = this.popularity_;
        if (z16) {
            i2 += CodedOutputStream.d(16, z16);
        }
        boolean z17 = this.is19PlusOnly_;
        if (z17) {
            i2 += CodedOutputStream.d(17, z17);
        }
        boolean z18 = this.trackDescriptors_;
        if (z18) {
            i2 += CodedOutputStream.d(18, z18);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackDescriptors() {
        return this.trackDescriptors_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackNumber() {
        return this.trackNumber_;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.hasLyrics_;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.link_;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.name_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.length_;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
        boolean z5 = this.playable_;
        if (z5) {
            codedOutputStream.A(5, z5);
        }
        boolean z6 = this.isAvailableInMetadataCatalogue_;
        if (z6) {
            codedOutputStream.A(6, z6);
        }
        boolean z7 = this.locallyPlayable_;
        if (z7) {
            codedOutputStream.A(7, z7);
        }
        boolean z8 = this.playableLocalTrack_;
        if (z8) {
            codedOutputStream.A(8, z8);
        }
        boolean z9 = this.discNumber_;
        if (z9) {
            codedOutputStream.A(9, z9);
        }
        boolean z10 = this.trackNumber_;
        if (z10) {
            codedOutputStream.A(10, z10);
        }
        boolean z11 = this.isExplicit_;
        if (z11) {
            codedOutputStream.A(11, z11);
        }
        boolean z12 = this.previewId_;
        if (z12) {
            codedOutputStream.A(12, z12);
        }
        boolean z13 = this.isLocal_;
        if (z13) {
            codedOutputStream.A(13, z13);
        }
        boolean z14 = this.isPremiumOnly_;
        if (z14) {
            codedOutputStream.A(14, z14);
        }
        boolean z15 = this.playableTrackLink_;
        if (z15) {
            codedOutputStream.A(15, z15);
        }
        boolean z16 = this.popularity_;
        if (z16) {
            codedOutputStream.A(16, z16);
        }
        boolean z17 = this.is19PlusOnly_;
        if (z17) {
            codedOutputStream.A(17, z17);
        }
        boolean z18 = this.trackDescriptors_;
        if (z18) {
            codedOutputStream.A(18, z18);
        }
    }

    public static Builder newBuilder(TrackDecorationPolicy trackDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) trackDecorationPolicy);
    }

    public static TrackDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static TrackDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static TrackDecorationPolicy parseFrom(byte[] bArr) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static TrackDecorationPolicy parseFrom(InputStream inputStream) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static TrackDecorationPolicy parseFrom(g gVar) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static TrackDecorationPolicy parseFrom(g gVar, k kVar) {
        return (TrackDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
