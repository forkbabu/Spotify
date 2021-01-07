package com.spotify.playlist.models;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.d;
import com.spotify.playlist.models.offline.a;

public abstract class o implements g, h {

    public interface a {
        a a(boolean z);

        a b(boolean z);

        o build();

        a c(boolean z);

        a d(String str);

        a e(com.spotify.playlist.models.offline.a aVar);

        a f(String str);

        a g(a aVar);

        a h(boolean z);

        a i(String str);

        a j(PlayabilityRestriction playabilityRestriction);

        a k(int i);

        a l(int i);

        a m(boolean z);

        a n(boolean z);

        a o(String str);

        a p(String str);

        a q(boolean z);

        a r(ImmutableList<String> immutableList);

        a s(String str);

        a t(boolean z);

        a u(boolean z);

        a v(ImmutableList<b> immutableList);

        a w(boolean z);

        a x(boolean z);
    }

    public static a builder() {
        d.b bVar = (d.b) emptyBuilder();
        bVar.f("");
        d.b bVar2 = bVar;
        bVar2.d("");
        d.b bVar3 = bVar2;
        bVar3.l(0);
        d.b bVar4 = bVar3;
        bVar4.k(0);
        d.b bVar5 = bVar4;
        bVar5.i(null);
        d.b bVar6 = bVar5;
        bVar6.q(false);
        d.b bVar7 = bVar6;
        bVar7.h(false);
        d.b bVar8 = bVar7;
        bVar8.c(false);
        d.b bVar9 = bVar8;
        bVar9.o(null);
        d.b bVar10 = bVar9;
        bVar10.a(false);
        d.b bVar11 = bVar10;
        bVar11.w(false);
        d.b bVar12 = bVar11;
        bVar12.s(null);
        d.b bVar13 = bVar12;
        bVar13.x(false);
        d.b bVar14 = bVar13;
        bVar14.t(false);
        d.b bVar15 = bVar14;
        bVar15.n(false);
        d.b bVar16 = bVar15;
        bVar16.p(null);
        d.b bVar17 = bVar16;
        bVar17.b(false);
        d.b bVar18 = bVar17;
        bVar18.u(false);
        d.b bVar19 = bVar18;
        bVar19.v(ImmutableList.of());
        d.b bVar20 = bVar19;
        bVar20.g(a.a().e());
        d.b bVar21 = bVar20;
        bVar21.m(false);
        d.b bVar22 = bVar21;
        bVar22.r(ImmutableList.of());
        d.b bVar23 = bVar22;
        bVar23.e(a.f.a);
        d.b bVar24 = bVar23;
        bVar24.j(PlayabilityRestriction.UNKNOWN);
        return bVar24;
    }

    public static a emptyBuilder() {
        return new d.b();
    }

    public abstract int getAddTime();

    public abstract a getAlbum();

    public abstract ImmutableList<b> getArtists();

    public abstract boolean getCanAddToCollection();

    public abstract boolean getCanBan();

    public abstract String getGroupLabel();

    public abstract boolean getHasLyrics();

    public abstract boolean getIs19plus();

    public abstract int getLength();

    public abstract String getName();

    public abstract com.spotify.playlist.models.offline.a getOfflineState();

    public abstract PlayabilityRestriction getPlayabilityRestriction();

    public abstract String getPlayableTrackUri();

    public abstract String getPreviewId();

    public abstract ImmutableList<String> getTrackDescriptors();

    public abstract boolean isAvailableInMetadataCatalogue();

    public abstract boolean isBanned();

    public abstract boolean isCurrentlyPlayable();

    public abstract boolean isExplicit();

    public abstract boolean isInCollection();

    public abstract boolean isLocal();

    public abstract boolean isPremiumOnly();

    public abstract a toBuilder();
}
