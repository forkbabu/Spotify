package com.spotify.cosmos.session.model;

import java.util.Arrays;

public abstract class LoginCredentials {

    public static final class Autologin extends LoginCredentials {
        Autologin() {
        }

        public boolean equals(Object obj) {
            return obj instanceof Autologin;
        }

        public int hashCode() {
            return 0;
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti08.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si08.accept(this);
        }

        public String toString() {
            return "Autologin{}";
        }
    }

    public static final class Facebook extends LoginCredentials {
        private final String blob;
        private final String username;

        Facebook(String str, String str2) {
            str.getClass();
            this.username = str;
            str2.getClass();
            this.blob = str2;
        }

        public final String blob() {
            return this.blob;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Facebook)) {
                return false;
            }
            Facebook facebook = (Facebook) obj;
            if (!facebook.username.equals(this.username) || !facebook.blob.equals(this.blob)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.blob.hashCode() + je.Y0(this.username, 0, 31);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti02.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si02.accept(this);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Facebook{username=");
            V0.append(this.username);
            V0.append(", blob=");
            return je.H0(V0, this.blob, '}');
        }

        public final String username() {
            return this.username;
        }
    }

    public static final class GoogleSignIn extends LoginCredentials {
        private final String authCode;
        private final String redirectUri;

        GoogleSignIn(String str, String str2) {
            str.getClass();
            this.authCode = str;
            this.redirectUri = str2;
        }

        public final String authCode() {
            return this.authCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GoogleSignIn)) {
                return false;
            }
            GoogleSignIn googleSignIn = (GoogleSignIn) obj;
            if (!googleSignIn.authCode.equals(this.authCode) || !gf0.e(googleSignIn.redirectUri, this.redirectUri)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.authCode, 0, 31);
            String str = this.redirectUri;
            if (str != null) {
                i = str.hashCode();
            }
            return Y0 + i;
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti011.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si011.accept(this);
        }

        public final String redirectUri() {
            return this.redirectUri;
        }

        public String toString() {
            return je.H0(je.a1("GoogleSignIn{authCode=", "***", ", redirectUri="), this.redirectUri, '}');
        }
    }

    public static final class OneTimeToken extends LoginCredentials {
        private final String token;

        OneTimeToken(String str) {
            str.getClass();
            this.token = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneTimeToken)) {
                return false;
            }
            return ((OneTimeToken) obj).token.equals(this.token);
        }

        public int hashCode() {
            return this.token.hashCode() + 0;
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti05.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si05.accept(this);
        }

        public String toString() {
            return "OneTimeToken{token=***}";
        }

        public final String token() {
            return this.token;
        }
    }

    public static final class ParentChild extends LoginCredentials {
        private final String childId;
        private final byte[] parentBlob;
        private final String parentUsername;

        ParentChild(String str, String str2, byte[] bArr) {
            str.getClass();
            this.childId = str;
            str2.getClass();
            this.parentUsername = str2;
            bArr.getClass();
            this.parentBlob = bArr;
        }

        public final String childId() {
            return this.childId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParentChild)) {
                return false;
            }
            ParentChild parentChild = (ParentChild) obj;
            if (!Arrays.equals(parentChild.parentBlob, this.parentBlob) || !parentChild.childId.equals(this.childId) || !parentChild.parentUsername.equals(this.parentUsername)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(this.parentBlob) + je.Y0(this.parentUsername, je.Y0(this.childId, 0, 31), 31);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti07.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si07.accept(this);
        }

        public final byte[] parentBlob() {
            return this.parentBlob;
        }

        public final String parentUsername() {
            return this.parentUsername;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ParentChild{childId=");
            V0.append(this.childId);
            V0.append(", parentUsername=");
            V0.append(this.parentUsername);
            V0.append(", parentBlob=");
            V0.append(Arrays.toString(this.parentBlob));
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class Password extends LoginCredentials {
        private final String password;
        private final String username;

        Password(String str, String str2) {
            str.getClass();
            this.username = str;
            str2.getClass();
            this.password = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Password)) {
                return false;
            }
            Password password2 = (Password) obj;
            if (!password2.username.equals(this.username) || !password2.password.equals(this.password)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.password.hashCode() + je.Y0(this.username, 0, 31);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti0.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si0.accept(this);
        }

        public final String password() {
            return this.password;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Password{username=");
            V0.append(this.username);
            V0.append(", password=");
            V0.append("***");
            V0.append('}');
            return V0.toString();
        }

        public final String username() {
            return this.username;
        }
    }

    public static final class PhoneNumber extends LoginCredentials {
        private final String number;

        PhoneNumber(String str) {
            str.getClass();
            this.number = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PhoneNumber)) {
                return false;
            }
            return ((PhoneNumber) obj).number.equals(this.number);
        }

        public int hashCode() {
            return this.number.hashCode() + 0;
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti04.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si04.accept(this);
        }

        public final String number() {
            return this.number;
        }

        public String toString() {
            return je.H0(je.V0("PhoneNumber{number="), this.number, '}');
        }
    }

    public static final class RefreshToken extends LoginCredentials {
        private final String obfuscatedSecret;
        private final String refreshToken;

        RefreshToken(String str, String str2) {
            str.getClass();
            this.refreshToken = str;
            this.obfuscatedSecret = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RefreshToken)) {
                return false;
            }
            RefreshToken refreshToken2 = (RefreshToken) obj;
            if (!refreshToken2.refreshToken.equals(this.refreshToken) || !gf0.e(refreshToken2.obfuscatedSecret, this.obfuscatedSecret)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.refreshToken, 0, 31);
            String str = this.obfuscatedSecret;
            if (str != null) {
                i = str.hashCode();
            }
            return Y0 + i;
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti09.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si09.accept(this);
        }

        public final String obfuscatedSecret() {
            return this.obfuscatedSecret;
        }

        public final String refreshToken() {
            return this.refreshToken;
        }

        public String toString() {
            return je.H0(je.a1("RefreshToken{refreshToken=", "***", ", obfuscatedSecret="), this.obfuscatedSecret, '}');
        }
    }

    public static final class SamsungSignIn extends LoginCredentials {
        private final String authCode;
        private final String redirectUri;
        private final String tokenEndpointUrl;

        SamsungSignIn(String str, String str2, String str3) {
            str.getClass();
            this.authCode = str;
            str2.getClass();
            this.redirectUri = str2;
            str3.getClass();
            this.tokenEndpointUrl = str3;
        }

        public final String authCode() {
            return this.authCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SamsungSignIn)) {
                return false;
            }
            SamsungSignIn samsungSignIn = (SamsungSignIn) obj;
            if (!samsungSignIn.authCode.equals(this.authCode) || !samsungSignIn.redirectUri.equals(this.redirectUri) || !samsungSignIn.tokenEndpointUrl.equals(this.tokenEndpointUrl)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.tokenEndpointUrl.hashCode() + je.Y0(this.redirectUri, je.Y0(this.authCode, 0, 31), 31);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti010.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si010.accept(this);
        }

        public final String redirectUri() {
            return this.redirectUri;
        }

        public String toString() {
            StringBuilder a1 = je.a1("SamsungSignIn{authCode=", "***", ", redirectUri=");
            a1.append(this.redirectUri);
            a1.append(", tokenEndpointUrl=");
            return je.H0(a1, this.tokenEndpointUrl, '}');
        }

        public final String tokenEndpointUrl() {
            return this.tokenEndpointUrl;
        }
    }

    public static final class SpotifyToken extends LoginCredentials {
        private final byte[] blob;
        private final String username;

        SpotifyToken(String str, byte[] bArr) {
            str.getClass();
            this.username = str;
            bArr.getClass();
            this.blob = bArr;
        }

        public final byte[] blob() {
            return this.blob;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpotifyToken)) {
                return false;
            }
            SpotifyToken spotifyToken = (SpotifyToken) obj;
            if (!Arrays.equals(spotifyToken.blob, this.blob) || !spotifyToken.username.equals(this.username)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(this.blob) + je.Y0(this.username, 0, 31);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti06.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si06.accept(this);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SpotifyToken{username=");
            V0.append(this.username);
            V0.append(", blob=");
            V0.append(Arrays.toString(this.blob));
            V0.append('}');
            return V0.toString();
        }

        public final String username() {
            return this.username;
        }
    }

    public static final class StoredCredentials extends LoginCredentials {
        private final byte[] blob;
        private final String username;

        StoredCredentials(String str, byte[] bArr) {
            str.getClass();
            this.username = str;
            bArr.getClass();
            this.blob = bArr;
        }

        public final byte[] blob() {
            return this.blob;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoredCredentials)) {
                return false;
            }
            StoredCredentials storedCredentials = (StoredCredentials) obj;
            if (!Arrays.equals(storedCredentials.blob, this.blob) || !storedCredentials.username.equals(this.username)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(this.blob) + je.Y0(this.username, 0, 31);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011) {
            return ti03.apply(this);
        }

        @Override // com.spotify.cosmos.session.model.LoginCredentials
        public final void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011) {
            si03.accept(this);
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoredCredentials{username=");
            V0.append(this.username);
            V0.append(", blob=");
            V0.append(Arrays.toString(this.blob));
            V0.append('}');
            return V0.toString();
        }

        public final String username() {
            return this.username;
        }
    }

    LoginCredentials() {
    }

    public static LoginCredentials autologin() {
        return new Autologin();
    }

    public static LoginCredentials facebook(String str, String str2) {
        return new Facebook(str, str2);
    }

    public static LoginCredentials googleSignIn(String str, String str2) {
        return new GoogleSignIn(str, str2);
    }

    public static LoginCredentials oneTimeToken(String str) {
        return new OneTimeToken(str);
    }

    public static LoginCredentials parentChild(String str, String str2, byte[] bArr) {
        return new ParentChild(str, str2, bArr);
    }

    public static LoginCredentials password(String str, String str2) {
        return new Password(str, str2);
    }

    public static LoginCredentials phoneNumber(String str) {
        return new PhoneNumber(str);
    }

    public static LoginCredentials refreshToken(String str, String str2) {
        return new RefreshToken(str, str2);
    }

    public static LoginCredentials samsungSignIn(String str, String str2, String str3) {
        return new SamsungSignIn(str, str2, str3);
    }

    public static LoginCredentials spotifyToken(String str, byte[] bArr) {
        return new SpotifyToken(str, bArr);
    }

    public static LoginCredentials storedCredentials(String str, byte[] bArr) {
        return new StoredCredentials(str, bArr);
    }

    public final Autologin asAutologin() {
        return (Autologin) this;
    }

    public final Facebook asFacebook() {
        return (Facebook) this;
    }

    public final GoogleSignIn asGoogleSignIn() {
        return (GoogleSignIn) this;
    }

    public final OneTimeToken asOneTimeToken() {
        return (OneTimeToken) this;
    }

    public final ParentChild asParentChild() {
        return (ParentChild) this;
    }

    public final Password asPassword() {
        return (Password) this;
    }

    public final PhoneNumber asPhoneNumber() {
        return (PhoneNumber) this;
    }

    public final RefreshToken asRefreshToken() {
        return (RefreshToken) this;
    }

    public final SamsungSignIn asSamsungSignIn() {
        return (SamsungSignIn) this;
    }

    public final SpotifyToken asSpotifyToken() {
        return (SpotifyToken) this;
    }

    public final StoredCredentials asStoredCredentials() {
        return (StoredCredentials) this;
    }

    public final boolean isAutologin() {
        return this instanceof Autologin;
    }

    public final boolean isFacebook() {
        return this instanceof Facebook;
    }

    public final boolean isGoogleSignIn() {
        return this instanceof GoogleSignIn;
    }

    public final boolean isOneTimeToken() {
        return this instanceof OneTimeToken;
    }

    public final boolean isParentChild() {
        return this instanceof ParentChild;
    }

    public final boolean isPassword() {
        return this instanceof Password;
    }

    public final boolean isPhoneNumber() {
        return this instanceof PhoneNumber;
    }

    public final boolean isRefreshToken() {
        return this instanceof RefreshToken;
    }

    public final boolean isSamsungSignIn() {
        return this instanceof SamsungSignIn;
    }

    public final boolean isSpotifyToken() {
        return this instanceof SpotifyToken;
    }

    public final boolean isStoredCredentials() {
        return this instanceof StoredCredentials;
    }

    public abstract <R_> R_ map(ti0<Password, R_> ti0, ti0<Facebook, R_> ti02, ti0<StoredCredentials, R_> ti03, ti0<PhoneNumber, R_> ti04, ti0<OneTimeToken, R_> ti05, ti0<SpotifyToken, R_> ti06, ti0<ParentChild, R_> ti07, ti0<Autologin, R_> ti08, ti0<RefreshToken, R_> ti09, ti0<SamsungSignIn, R_> ti010, ti0<GoogleSignIn, R_> ti011);

    public abstract void match(si0<Password> si0, si0<Facebook> si02, si0<StoredCredentials> si03, si0<PhoneNumber> si04, si0<OneTimeToken> si05, si0<SpotifyToken> si06, si0<ParentChild> si07, si0<Autologin> si08, si0<RefreshToken> si09, si0<SamsungSignIn> si010, si0<GoogleSignIn> si011);
}
