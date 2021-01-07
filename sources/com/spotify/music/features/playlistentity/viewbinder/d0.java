package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.configuration.b;
import com.spotify.music.features.playlistentity.configuration.e;
import com.spotify.music.features.playlistentity.configuration.f;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.configuration.h;
import com.spotify.music.features.playlistentity.configuration.i;
import java.util.Map;

public class d0 {
    private final l46 a;
    private final p46 b;
    private final f46 c;
    private final j46 d;
    private final k46 e;
    private final g46 f;
    private final q46 g;
    private final o46 h;
    private final n46 i;
    private final i46 j;
    private final m46 k;

    public d0(l46 l46, p46 p46, f46 f46, j46 j46, k46 k46, g46 g46, q46 q46, o46 o46, n46 n46, i46 i46, m46 m46) {
        this.a = l46;
        this.b = p46;
        this.c = f46;
        this.d = j46;
        this.e = k46;
        this.f = g46;
        this.g = q46;
        this.h = o46;
        this.i = n46;
        this.j = i46;
        this.k = m46;
    }

    public c a(LicenseLayout licenseLayout, Map<String, String> map) {
        return this.c.a(licenseLayout, map).a();
    }

    public b b(LicenseLayout licenseLayout, Map<String, String> map) {
        return this.f.a(licenseLayout, map).a();
    }

    public com.spotify.music.features.playlistentity.configuration.c c() {
        return this.j.create().a();
    }

    public ItemListConfiguration d(LicenseLayout licenseLayout, Map<String, String> map) {
        return this.d.a(licenseLayout, map).a();
    }

    public e e(LicenseLayout licenseLayout) {
        return this.e.a(licenseLayout).a();
    }

    public f f(LicenseLayout licenseLayout) {
        return this.a.a(licenseLayout).a();
    }

    public PlaylistDataSourceConfiguration g(LicenseLayout licenseLayout, Map<String, String> map) {
        return this.k.a(licenseLayout, map).a();
    }

    public g h(LicenseLayout licenseLayout, boolean z) {
        return this.i.a(licenseLayout, z).a();
    }

    public h i(LicenseLayout licenseLayout) {
        return this.h.a(licenseLayout).a();
    }

    public ToolbarConfiguration j(LicenseLayout licenseLayout, Map<String, String> map) {
        return this.b.a(licenseLayout, map).a();
    }

    public i k(LicenseLayout licenseLayout) {
        return this.g.a(licenseLayout).a();
    }
}
