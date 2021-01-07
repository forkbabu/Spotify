package com.spotify.music.libs.assistedcuration.model;

import com.spotify.music.libs.assistedcuration.model.i;
import java.util.List;

/* access modifiers changed from: package-private */
public final class g extends i {
    private final String a;
    private final int b;
    private final List<byte[]> c;

    /* access modifiers changed from: package-private */
    public static final class b implements i.a {
        private String a;
        private Integer b;
        private List<byte[]> c;

        b() {
        }

        @Override // com.spotify.music.libs.assistedcuration.model.i.a
        public i.a a(List<byte[]> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null cardsState");
        }

        @Override // com.spotify.music.libs.assistedcuration.model.i.a
        public i.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.libs.assistedcuration.model.i.a
        public i build() {
            String str = this.b == null ? " cardsCount" : "";
            if (this.c == null) {
                str = je.x0(str, " cardsState");
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b.intValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.assistedcuration.model.i.a
        public i.a c(String str) {
            this.a = str;
            return this;
        }
    }

    g(String str, int i, List list, a aVar) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.i
    public int b() {
        return this.b;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.i
    public List<byte[]> c() {
        return this.c;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.i
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.a;
        if (str != null ? str.equals(iVar.d()) : iVar.d() == null) {
            if (this.b == iVar.b() && this.c.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("State{currentCardId=");
        V0.append(this.a);
        V0.append(", cardsCount=");
        V0.append(this.b);
        V0.append(", cardsState=");
        return je.L0(V0, this.c, "}");
    }
}
