package com.spotify.music.canvas.model;

/* access modifiers changed from: package-private */
public final class a extends b {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final CanvasContentType e;
    private final String f;
    private final String g;
    private final String h;

    a(String str, String str2, String str3, String str4, CanvasContentType canvasContentType, String str5, String str6, String str7) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            if (str4 != null) {
                this.d = str4;
                if (canvasContentType != null) {
                    this.e = canvasContentType;
                    this.f = str5;
                    this.g = str6;
                    this.h = str7;
                    return;
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null canvasId");
        }
        throw new NullPointerException("Null trackUri");
    }

    @Override // com.spotify.music.canvas.model.b
    public String a() {
        return this.h;
    }

    @Override // com.spotify.music.canvas.model.b
    public String b() {
        return this.f;
    }

    @Override // com.spotify.music.canvas.model.b
    public String c() {
        return this.g;
    }

    @Override // com.spotify.music.canvas.model.b
    public String d() {
        return this.c;
    }

    @Override // com.spotify.music.canvas.model.b
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a.equals(bVar.h()) && ((str = this.b) != null ? str.equals(bVar.f()) : bVar.f() == null) && ((str2 = this.c) != null ? str2.equals(bVar.d()) : bVar.d() == null) && this.d.equals(bVar.e()) && this.e.equals(bVar.i()) && ((str3 = this.f) != null ? str3.equals(bVar.b()) : bVar.b() == null) && ((str4 = this.g) != null ? str4.equals(bVar.c()) : bVar.c() == null)) {
            String str5 = this.h;
            if (str5 == null) {
                if (bVar.a() == null) {
                    return true;
                }
            } else if (str5.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.canvas.model.b
    public String f() {
        return this.b;
    }

    @Override // com.spotify.music.canvas.model.b
    public String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str3 = this.f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // com.spotify.music.canvas.model.b
    public CanvasContentType i() {
        return this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CanvasTrack{trackUri=");
        V0.append(this.a);
        V0.append(", canvasUri=");
        V0.append(this.b);
        V0.append(", canvasFileId=");
        V0.append(this.c);
        V0.append(", canvasId=");
        V0.append(this.d);
        V0.append(", type=");
        V0.append(this.e);
        V0.append(", artistName=");
        V0.append(this.f);
        V0.append(", artistUri=");
        V0.append(this.g);
        V0.append(", artistAvatarUrl=");
        return je.I0(V0, this.h, "}");
    }
}
