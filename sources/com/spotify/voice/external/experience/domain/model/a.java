package com.spotify.voice.external.experience.domain.model;

import com.spotify.player.model.ContextTrack;
import com.spotify.voice.external.experience.domain.model.b;

/* access modifiers changed from: package-private */
public final class a extends b {
    private final c a;
    private final String b;
    private final int c;
    private final String d;
    private final boolean e;
    private final Boolean f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Integer k;
    private final ContextTrack l;
    private final Integer m;

    /* access modifiers changed from: package-private */
    public static final class b implements b.a {
        private c a;
        private String b;
        private Integer c;
        private String d;
        private Boolean e;
        private Boolean f;
        private String g;
        private String h;
        private String i;
        private String j;
        private Integer k;
        private ContextTrack l;
        private Integer m;

        b() {
        }

        public b a() {
            String str = this.a == null ? " state" : "";
            if (this.c == null) {
                str = je.x0(str, " slimoIntent");
            }
            if (this.e == null) {
                str = je.x0(str, " ttsEnabled");
            }
            if (this.i == null) {
                str = je.x0(str, " contextUri");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c.intValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public b.a b(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        public b.a c(String str) {
            this.g = str;
            return this;
        }

        public b.a d(String str) {
            this.j = str;
            return this;
        }

        public b.a e(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        public b.a f(Integer num) {
            this.k = num;
            return this;
        }

        public b.a g(String str) {
            this.h = str;
            return this;
        }

        public b.a h(c cVar) {
            if (cVar != null) {
                this.a = cVar;
                return this;
            }
            throw new NullPointerException("Null state");
        }

        public b.a i(String str) {
            this.d = str;
            return this;
        }

        public b.a j(ContextTrack contextTrack) {
            this.l = contextTrack;
            return this;
        }

        public b.a k(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public b.a l(String str) {
            this.b = str;
            return this;
        }

        public b.a m(Integer num) {
            this.m = num;
            return this;
        }

        public b.a n(Boolean bool) {
            this.f = bool;
            return this;
        }

        b(b bVar, C0576a aVar) {
            this.a = bVar.h();
            this.b = bVar.m();
            this.c = Integer.valueOf(bVar.e());
            this.d = bVar.i();
            this.e = Boolean.valueOf(bVar.l());
            this.f = bVar.o();
            this.g = bVar.c();
            this.h = bVar.g();
            this.i = bVar.a();
            this.j = bVar.d();
            this.k = bVar.f();
            this.l = bVar.k();
            this.m = bVar.n();
        }
    }

    a(c cVar, String str, int i2, String str2, boolean z, Boolean bool, String str3, String str4, String str5, String str6, Integer num, ContextTrack contextTrack, Integer num2, C0576a aVar) {
        this.a = cVar;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = bool;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = num;
        this.l = contextTrack;
        this.m = num2;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public String a() {
        return this.i;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public String c() {
        return this.g;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public String d() {
        return this.j;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        Integer num;
        ContextTrack contextTrack;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a.equals(bVar.h()) && ((str = this.b) != null ? str.equals(bVar.m()) : bVar.m() == null) && this.c == bVar.e() && ((str2 = this.d) != null ? str2.equals(bVar.i()) : bVar.i() == null) && this.e == bVar.l() && ((bool = this.f) != null ? bool.equals(bVar.o()) : bVar.o() == null) && ((str3 = this.g) != null ? str3.equals(bVar.c()) : bVar.c() == null) && ((str4 = this.h) != null ? str4.equals(bVar.g()) : bVar.g() == null) && this.i.equals(bVar.a()) && ((str5 = this.j) != null ? str5.equals(bVar.d()) : bVar.d() == null) && ((num = this.k) != null ? num.equals(bVar.f()) : bVar.f() == null) && ((contextTrack = this.l) != null ? contextTrack.equals(bVar.k()) : bVar.k() == null)) {
            Integer num2 = this.m;
            if (num2 == null) {
                if (bVar.n() == null) {
                    return true;
                }
            } else if (num2.equals(bVar.n())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public Integer f() {
        return this.k;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public String g() {
        return this.h;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public c h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003;
        String str2 = this.d;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        Boolean bool = this.f;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str3 = this.g;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.h;
        int hashCode6 = (((hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003;
        String str5 = this.j;
        int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        Integer num = this.k;
        int hashCode8 = (hashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ContextTrack contextTrack = this.l;
        int hashCode9 = (hashCode8 ^ (contextTrack == null ? 0 : contextTrack.hashCode())) * 1000003;
        Integer num2 = this.m;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode9 ^ i2;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public String i() {
        return this.d;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public b.a j() {
        return new b(this, null);
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public ContextTrack k() {
        return this.l;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public boolean l() {
        return this.e;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public String m() {
        return this.b;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public Integer n() {
        return this.m;
    }

    @Override // com.spotify.voice.external.experience.domain.model.b
    public Boolean o() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExternalVoiceModel{state=");
        V0.append(this.a);
        V0.append(", utteranceId=");
        V0.append(this.b);
        V0.append(", slimoIntent=");
        V0.append(this.c);
        V0.append(", targetUri=");
        V0.append(this.d);
        V0.append(", ttsEnabled=");
        V0.append(this.e);
        V0.append(", wasPaused=");
        V0.append(this.f);
        V0.append(", elementId=");
        V0.append(this.g);
        V0.append(", sourceId=");
        V0.append(this.h);
        V0.append(", contextUri=");
        V0.append(this.i);
        V0.append(", requestedEntityType=");
        V0.append(this.j);
        V0.append(", slotIndex=");
        V0.append(this.k);
        V0.append(", track=");
        V0.append(this.l);
        V0.append(", volumeLevel=");
        V0.append(this.m);
        V0.append("}");
        return V0.toString();
    }
}
