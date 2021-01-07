package com.spotify.music.features.findfriends.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.findfriends.model.UserModel;

/* access modifiers changed from: package-private */
/* renamed from: com.spotify.music.features.findfriends.model.$AutoValue_UserModel  reason: invalid class name */
public abstract class C$AutoValue_UserModel extends UserModel {
    private final String image;
    private final boolean isFollowing;
    private final String title;
    private final String uri;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.findfriends.model.$AutoValue_UserModel$b */
    public static final class b extends UserModel.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        @Override // com.spotify.music.features.findfriends.model.UserModel.a
        public UserModel a() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " title");
            }
            if (this.c == null) {
                str = je.x0(str, " image");
            }
            if (this.d == null) {
                str = je.x0(str, " isFollowing");
            }
            if (str.isEmpty()) {
                return new AutoValue_UserModel(this.a, this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.findfriends.model.UserModel.a
        public UserModel.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.spotify.music.features.findfriends.model.UserModel.a
        public UserModel.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.findfriends.model.UserModel.a
        public UserModel.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // com.spotify.music.features.findfriends.model.UserModel.a
        public UserModel.a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        b(UserModel userModel, a aVar) {
            this.a = userModel.uri();
            this.b = userModel.title();
            this.c = userModel.image();
            this.d = Boolean.valueOf(userModel.isFollowing());
        }
    }

    C$AutoValue_UserModel(String str, String str2, String str3, boolean z) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.title = str2;
                if (str3 != null) {
                    this.image = str3;
                    this.isFollowing = z;
                    return;
                }
                throw new NullPointerException("Null image");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserModel)) {
            return false;
        }
        UserModel userModel = (UserModel) obj;
        if (!this.uri.equals(userModel.uri()) || !this.title.equals(userModel.title()) || !this.image.equals(userModel.image()) || this.isFollowing != userModel.isFollowing()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.image.hashCode()) * 1000003) ^ (this.isFollowing ? 1231 : 1237);
    }

    @Override // com.spotify.music.features.findfriends.model.UserModel
    @JsonProperty("image")
    public String image() {
        return this.image;
    }

    @Override // com.spotify.music.features.findfriends.model.UserModel
    @JsonProperty("isFollowing")
    public boolean isFollowing() {
        return this.isFollowing;
    }

    @Override // com.spotify.music.features.findfriends.model.UserModel
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    @Override // com.spotify.music.features.findfriends.model.UserModel
    public UserModel.a toBuilder() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("UserModel{uri=");
        V0.append(this.uri);
        V0.append(", title=");
        V0.append(this.title);
        V0.append(", image=");
        V0.append(this.image);
        V0.append(", isFollowing=");
        return je.P0(V0, this.isFollowing, "}");
    }

    @Override // com.spotify.music.features.findfriends.model.UserModel
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
