package com.spotify.music.podcast.entity.adapter.description;

import com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel;

/* access modifiers changed from: package-private */
public final class e extends DescriptionViewBinderModel {
    private final DescriptionViewBinderModel.DescriptionType a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;

    static final class b implements DescriptionViewBinderModel.a {
        private DescriptionViewBinderModel.DescriptionType a;
        private String b;
        private String c;
        private Boolean d;
        private Boolean e;

        b() {
        }

        public DescriptionViewBinderModel a() {
            String str = this.a == null ? " descriptionType" : "";
            if (this.b == null) {
                str = je.x0(str, " description");
            }
            if (this.c == null) {
                str = je.x0(str, " publisher");
            }
            if (this.d == null) {
                str = je.x0(str, " isExpanded");
            }
            if (this.e == null) {
                str = je.x0(str, " isAccessibilityEnabled");
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public DescriptionViewBinderModel.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        public DescriptionViewBinderModel.a c(DescriptionViewBinderModel.DescriptionType descriptionType) {
            this.a = descriptionType;
            return this;
        }

        public DescriptionViewBinderModel.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public DescriptionViewBinderModel.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public DescriptionViewBinderModel.a f(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null publisher");
        }
    }

    e(DescriptionViewBinderModel.DescriptionType descriptionType, String str, String str2, boolean z, boolean z2, a aVar) {
        this.a = descriptionType;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    @Override // com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel
    public String a() {
        return this.b;
    }

    @Override // com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel
    public DescriptionViewBinderModel.DescriptionType b() {
        return this.a;
    }

    @Override // com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel
    public boolean c() {
        return this.e;
    }

    @Override // com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptionViewBinderModel)) {
            return false;
        }
        DescriptionViewBinderModel descriptionViewBinderModel = (DescriptionViewBinderModel) obj;
        if (!this.a.equals(descriptionViewBinderModel.b()) || !this.b.equals(descriptionViewBinderModel.a()) || !this.c.equals(descriptionViewBinderModel.e()) || this.d != descriptionViewBinderModel.d() || this.e != descriptionViewBinderModel.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DescriptionViewBinderModel{descriptionType=");
        V0.append(this.a);
        V0.append(", description=");
        V0.append(this.b);
        V0.append(", publisher=");
        V0.append(this.c);
        V0.append(", isExpanded=");
        V0.append(this.d);
        V0.append(", isAccessibilityEnabled=");
        return je.P0(V0, this.e, "}");
    }
}
