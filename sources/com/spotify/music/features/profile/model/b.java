package com.spotify.music.features.profile.model;

import com.spotify.music.features.profile.model.ProfileListItem;

abstract class b extends ProfileListItem {
    private final ProfileListItem.Type a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final ct7 o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.profile.model.b$b  reason: collision with other inner class name */
    public static final class C0251b extends ProfileListItem.a {
        private ProfileListItem.Type a;
        private String b;
        private String c;
        private String d;
        private String e;
        private ct7 f;

        C0251b() {
        }

        @Override // com.spotify.music.features.profile.model.ProfileListItem.a
        public ProfileListItem a() {
            String str = this.a == null ? " type" : "";
            if (this.b == null) {
                str = je.x0(str, " uri");
            }
            if (this.c == null) {
                str = je.x0(str, " title");
            }
            if (this.d == null) {
                str = je.x0(str, " subtitle");
            }
            if (this.f == null) {
                str = je.x0(str, " followState");
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.profile.model.ProfileListItem.a
        public ProfileListItem.a b(ct7 ct7) {
            if (ct7 != null) {
                this.f = ct7;
                return this;
            }
            throw new NullPointerException("Null followState");
        }

        @Override // com.spotify.music.features.profile.model.ProfileListItem.a
        public ProfileListItem.a c(String str) {
            this.e = str;
            return this;
        }

        @Override // com.spotify.music.features.profile.model.ProfileListItem.a
        public ProfileListItem.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        @Override // com.spotify.music.features.profile.model.ProfileListItem.a
        public ProfileListItem.a e(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // com.spotify.music.features.profile.model.ProfileListItem.a
        public ProfileListItem.a f(ProfileListItem.Type type) {
            this.a = type;
            return this;
        }

        @Override // com.spotify.music.features.profile.model.ProfileListItem.a
        public ProfileListItem.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        C0251b(ProfileListItem profileListItem, a aVar) {
            this.a = profileListItem.h();
            this.b = profileListItem.i();
            this.c = profileListItem.f();
            this.d = profileListItem.e();
            this.e = profileListItem.c();
            this.f = profileListItem.b();
        }
    }

    b(ProfileListItem.Type type, String str, String str2, String str3, String str4, ct7 ct7) {
        if (type != null) {
            this.a = type;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (str3 != null) {
                        this.f = str3;
                        this.n = str4;
                        if (ct7 != null) {
                            this.o = ct7;
                            return;
                        }
                        throw new NullPointerException("Null followState");
                    }
                    throw new NullPointerException("Null subtitle");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null type");
    }

    @Override // com.spotify.music.features.profile.model.ProfileListItem
    public ct7 b() {
        return this.o;
    }

    @Override // com.spotify.music.features.profile.model.ProfileListItem
    public String c() {
        return this.n;
    }

    @Override // com.spotify.music.features.profile.model.ProfileListItem
    public String e() {
        return this.f;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileListItem)) {
            return false;
        }
        ProfileListItem profileListItem = (ProfileListItem) obj;
        if (!this.a.equals(profileListItem.h()) || !this.b.equals(profileListItem.i()) || !this.c.equals(profileListItem.f()) || !this.f.equals(profileListItem.e()) || ((str = this.n) != null ? !str.equals(profileListItem.c()) : profileListItem.c() != null) || !this.o.equals(profileListItem.b())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.profile.model.ProfileListItem
    public String f() {
        return this.c;
    }

    @Override // com.spotify.music.features.profile.model.ProfileListItem
    public ProfileListItem.a g() {
        return new C0251b(this, null);
    }

    @Override // com.spotify.music.features.profile.model.ProfileListItem
    public ProfileListItem.Type h() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.n;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.o.hashCode();
    }

    @Override // com.spotify.music.features.profile.model.ProfileListItem
    public String i() {
        return this.b;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ProfileListItem{type=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", subtitle=");
        V0.append(this.f);
        V0.append(", imageUri=");
        V0.append(this.n);
        V0.append(", followState=");
        V0.append(this.o);
        V0.append("}");
        return V0.toString();
    }
}
