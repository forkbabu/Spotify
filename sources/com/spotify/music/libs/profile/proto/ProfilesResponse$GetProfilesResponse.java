package com.spotify.music.libs.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class ProfilesResponse$GetProfilesResponse extends GeneratedMessageLite<ProfilesResponse$GetProfilesResponse, a> implements Object {
    private static final ProfilesResponse$GetProfilesResponse b;
    private static volatile x<ProfilesResponse$GetProfilesResponse> c;
    private o.i<IdentityV3$UserProfile> a = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<ProfilesResponse$GetProfilesResponse, a> implements Object {
        private a() {
            super(ProfilesResponse$GetProfilesResponse.b);
        }
    }

    static {
        ProfilesResponse$GetProfilesResponse profilesResponse$GetProfilesResponse = new ProfilesResponse$GetProfilesResponse();
        b = profilesResponse$GetProfilesResponse;
        profilesResponse$GetProfilesResponse.makeImmutable();
    }

    private ProfilesResponse$GetProfilesResponse() {
    }

    public static ProfilesResponse$GetProfilesResponse l(byte[] bArr) {
        return (ProfilesResponse$GetProfilesResponse) GeneratedMessageLite.parseFrom(b, bArr);
    }

    public static x<ProfilesResponse$GetProfilesResponse> parser() {
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
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((ProfilesResponse$GetProfilesResponse) obj2).a);
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
                                this.a.add(gVar.o(IdentityV3$UserProfile.parser(), kVar));
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
                return new ProfilesResponse$GetProfilesResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (ProfilesResponse$GetProfilesResponse.class) {
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

    public IdentityV3$UserProfile h(int i) {
        return this.a.get(i);
    }

    public int i() {
        return this.a.size();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
