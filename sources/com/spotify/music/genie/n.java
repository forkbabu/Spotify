package com.spotify.music.genie;

import com.spotify.music.genie.Wish;

/* access modifiers changed from: package-private */
public final class n extends Wish {
    private final String a;
    private final String b;
    private final Wish.Action c;

    n(String str, String str2, Wish.Action action) {
        this.a = str;
        this.b = str2;
        this.c = action;
    }

    @Override // com.spotify.music.genie.Wish
    public Wish.Action a() {
        return this.c;
    }

    @Override // com.spotify.music.genie.Wish
    public String b() {
        return this.b;
    }

    @Override // com.spotify.music.genie.Wish
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Wish)) {
            return false;
        }
        Wish wish = (Wish) obj;
        String str = this.a;
        if (str != null ? str.equals(wish.c()) : wish.c() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(wish.b()) : wish.b() == null) {
                if (this.c.equals(wish.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Wish{uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", action=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
