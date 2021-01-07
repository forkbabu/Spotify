package com.spotify.music.slate.model;

abstract class a extends m {
    private final CharSequence a;

    a(CharSequence charSequence) {
        if (charSequence != null) {
            this.a = charSequence;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.slate.model.m
    public CharSequence e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.a.equals(((m) obj).e());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("CharSequenceText{text=");
        V0.append((Object) this.a);
        V0.append("}");
        return V0.toString();
    }
}
