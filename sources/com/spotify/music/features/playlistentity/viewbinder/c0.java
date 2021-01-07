package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.viewbinder.j0;
import java.util.List;

/* access modifiers changed from: package-private */
public final class c0 extends j0.c {
    private final String a;
    private final LicenseLayout b;
    private final String c;
    private final List<String> d;

    c0(String str, LicenseLayout licenseLayout, String str2, List<String> list) {
        if (str != null) {
            this.a = str;
            if (licenseLayout != null) {
                this.b = licenseLayout;
                if (str2 != null) {
                    this.c = str2;
                    if (list != null) {
                        this.d = list;
                        return;
                    }
                    throw new NullPointerException("Null allModesSimpleClassNames");
                }
                throw new NullPointerException("Null activeModeSimpleClassName");
            }
            throw new NullPointerException("Null licenseLayout");
        }
        throw new NullPointerException("Null playlistUri");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.playlistentity.viewbinder.j0.c
    public String a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.playlistentity.viewbinder.j0.c
    public List<String> b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.playlistentity.viewbinder.j0.c
    public LicenseLayout c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.playlistentity.viewbinder.j0.c
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0.c)) {
            return false;
        }
        j0.c cVar = (j0.c) obj;
        if (!this.a.equals(cVar.d()) || !this.b.equals(cVar.c()) || !this.c.equals(cVar.a()) || !this.d.equals(cVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Result{playlistUri=");
        V0.append(this.a);
        V0.append(", licenseLayout=");
        V0.append(this.b);
        V0.append(", activeModeSimpleClassName=");
        V0.append(this.c);
        V0.append(", allModesSimpleClassNames=");
        return je.L0(V0, this.d, "}");
    }
}
