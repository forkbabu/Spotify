package com.spotify.music.marquee.feedback;

abstract class a extends h {
    private final String a;
    private final String b;

    a(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null reasonType");
    }

    @Override // com.spotify.music.marquee.feedback.h
    public String a() {
        return this.a;
    }

    @Override // com.spotify.music.marquee.feedback.h
    public String b() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.a.equals(hVar.a()) || !this.b.equals(hVar.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FeedbackReason{reasonType=");
        V0.append(this.a);
        V0.append(", text=");
        return je.I0(V0, this.b, "}");
    }
}
