package com.spotify.music.features.profile.saveprofile.domain;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.saveprofile.domain.q;

final class l extends q {
    private final SaveProfileState b;
    private final float c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final ImmutableList<SaveProfileTask> l;
    private final ImmutableList<SaveProfileTask> m;
    private final SaveProfileTask n;

    static final class b extends q.a {
        private SaveProfileState a;
        private Float b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private ImmutableList<SaveProfileTask> k;
        private ImmutableList<SaveProfileTask> l;
        private SaveProfileTask m;

        b() {
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q a() {
            String str = this.a == null ? " state" : "";
            if (this.b == null) {
                str = je.x0(str, " progress");
            }
            if (this.c == null) {
                str = je.x0(str, " username");
            }
            if (this.d == null) {
                str = je.x0(str, " uploadToken");
            }
            if (this.e == null) {
                str = je.x0(str, " displayName");
            }
            if (this.f == null) {
                str = je.x0(str, " imageUrl");
            }
            if (this.g == null) {
                str = je.x0(str, " oldDisplayName");
            }
            if (this.h == null) {
                str = je.x0(str, " oldImageUrl");
            }
            if (this.i == null) {
                str = je.x0(str, " newDisplayName");
            }
            if (this.j == null) {
                str = je.x0(str, " newImagePath");
            }
            if (this.k == null) {
                str = je.x0(str, " tasks");
            }
            if (this.l == null) {
                str = je.x0(str, " tasksCompleted");
            }
            if (this.m == null) {
                str = je.x0(str, " currentTask");
            }
            if (str.isEmpty()) {
                return new l(this.a, this.b.floatValue(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a b(SaveProfileTask saveProfileTask) {
            this.m = saveProfileTask;
            return this;
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a c(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a d(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null imageUrl");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a e(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null newDisplayName");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a f(String str) {
            if (str != null) {
                this.j = str;
                return this;
            }
            throw new NullPointerException("Null newImagePath");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a g(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null oldDisplayName");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a h(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null oldImageUrl");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a i(float f2) {
            this.b = Float.valueOf(f2);
            return this;
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a j(SaveProfileState saveProfileState) {
            if (saveProfileState != null) {
                this.a = saveProfileState;
                return this;
            }
            throw new NullPointerException("Null state");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a k(ImmutableList<SaveProfileTask> immutableList) {
            if (immutableList != null) {
                this.k = immutableList;
                return this;
            }
            throw new NullPointerException("Null tasks");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a l(ImmutableList<SaveProfileTask> immutableList) {
            if (immutableList != null) {
                this.l = immutableList;
                return this;
            }
            throw new NullPointerException("Null tasksCompleted");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a m(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null uploadToken");
        }

        @Override // com.spotify.music.features.profile.saveprofile.domain.q.a
        public q.a n(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        b(q qVar, a aVar) {
            this.a = qVar.i();
            this.b = Float.valueOf(qVar.h());
            this.c = qVar.n();
            this.d = qVar.m();
            this.e = qVar.b();
            this.f = qVar.c();
            this.g = qVar.f();
            this.h = qVar.g();
            this.i = qVar.d();
            this.j = qVar.e();
            this.k = qVar.j();
            this.l = qVar.k();
            this.m = qVar.a();
        }
    }

    l(SaveProfileState saveProfileState, float f2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ImmutableList immutableList, ImmutableList immutableList2, SaveProfileTask saveProfileTask, a aVar) {
        this.b = saveProfileState;
        this.c = f2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = immutableList;
        this.m = immutableList2;
        this.n = saveProfileTask;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public SaveProfileTask a() {
        return this.n;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String b() {
        return this.f;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String c() {
        return this.g;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String d() {
        return this.j;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.b.equals(qVar.i()) || Float.floatToIntBits(this.c) != Float.floatToIntBits(qVar.h()) || !this.d.equals(qVar.n()) || !this.e.equals(qVar.m()) || !this.f.equals(qVar.b()) || !this.g.equals(qVar.c()) || !this.h.equals(qVar.f()) || !this.i.equals(qVar.g()) || !this.j.equals(qVar.d()) || !this.k.equals(qVar.e()) || !this.l.equals(qVar.j()) || !this.m.equals(qVar.k()) || !this.n.equals(qVar.a())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String f() {
        return this.h;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String g() {
        return this.i;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public float h() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public SaveProfileState i() {
        return this.b;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public ImmutableList<SaveProfileTask> j() {
        return this.l;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public ImmutableList<SaveProfileTask> k() {
        return this.m;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public q.a l() {
        return new b(this, null);
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String m() {
        return this.e;
    }

    @Override // com.spotify.music.features.profile.saveprofile.domain.q
    public String n() {
        return this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SaveProfileModel{state=");
        V0.append(this.b);
        V0.append(", progress=");
        V0.append(this.c);
        V0.append(", username=");
        V0.append(this.d);
        V0.append(", uploadToken=");
        V0.append(this.e);
        V0.append(", displayName=");
        V0.append(this.f);
        V0.append(", imageUrl=");
        V0.append(this.g);
        V0.append(", oldDisplayName=");
        V0.append(this.h);
        V0.append(", oldImageUrl=");
        V0.append(this.i);
        V0.append(", newDisplayName=");
        V0.append(this.j);
        V0.append(", newImagePath=");
        V0.append(this.k);
        V0.append(", tasks=");
        V0.append(this.l);
        V0.append(", tasksCompleted=");
        V0.append(this.m);
        V0.append(", currentTask=");
        V0.append(this.n);
        V0.append("}");
        return V0.toString();
    }
}
