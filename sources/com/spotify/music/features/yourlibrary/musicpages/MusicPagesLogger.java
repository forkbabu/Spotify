package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import defpackage.xc9;
import java.util.List;

public class MusicPagesLogger implements fi9 {
    private final MusicPageId a;
    private final xc9 b;
    private final zc9 c;
    private final InteractionLogger d;

    /* access modifiers changed from: package-private */
    public enum SectionId {
        ADD_ARTISTS_BUTTON("add-artists-button"),
        ALBUMS_EMPTY_VIEW("albums-empty-view"),
        ARTISTS_EMPTY_VIEW("artists-empty-view"),
        CREATE_NEW_PLAYLIST_BUTTON("create-new-playlist-button"),
        CONTEXT_MENU("context-menu"),
        DOWNLOAD_TOGGLE("download-toggle"),
        ENTITY_SECTION_HEADER("entity-section-header"),
        FILTER_AND_SORT_VIEW("filter-and-sort-view"),
        FILTER_INDICATOR_VIEW("filter-indicator-view"),
        HIDDEN_ARTISTS_BUTTON("hidden-content"),
        HIDDEN_TRACKS_BUTTON("hidden-content"),
        LIKED_SONGS("liked-songs"),
        LIST_OF_ITEMS("list-of-items"),
        LIST_OF_RECOMMENDED_ITEMS("list-of-recommended-items"),
        PLAYLISTS_EMPTY_VIEW("playlists-empty-view"),
        RECS_INFO_DIALOG("recs-dialog"),
        RECS_SECTION_HEADER("recs-section-header"),
        SHUFFLE_PLAY_BUTTON("shuffle-play-button"),
        SORT_BOTTOM_SHEET("sort-bottom-sheet");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        ADD_ARTISTS("add-artists"),
        BACK_FROM_SORT_BOTTOM_SHEET("back-from-sort-bottom-sheet"),
        BAN("ban"),
        BROWSE("browse"),
        CANCEL_FILTER_BY_TEXT("filter-cancel"),
        CLEAR_ALL_FILTERS("clear-all-filters"),
        CLEAR_FILTER("clear-filter"),
        CLEAR_FILTER_BY_TEXT("clear-filter-by-text"),
        CREATE("create"),
        DISMISS_INFO_DIALOG("got-it"),
        DOWNLOAD("offline-enable"),
        FILTER_BY_TEXT("filter-by-text"),
        FOLLOW_ARTIST("follow-artist"),
        LIKE_ALBUM("like-album"),
        LIKE("like-enable"),
        ITEM("item"),
        OPEN("open"),
        OPEN_CONTEXT_MENU("track-context-menu-clicked"),
        OPEN_HIDDEN_ARTISTS("open-hidden-artists"),
        OPEN_HIDDEN_TRACKS("open-hidden-tracks"),
        OPEN_INFO_DIALOG(AppProtocol.LogMessage.SEVERITY_INFO),
        OPEN_LIKED_SONGS("liked-songs"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_TRACK_VIA_ROW("play-track-via-row"),
        REMOVE_DOWNLOADS("offline-disable"),
        SELECT_FILTER("filter-selected"),
        SELECT_SORT("sort-selected"),
        SHUFFLE_PLAY("shuffle-play"),
        SORT_BY_OPTION("sort-by-option"),
        UNLIKE("like-disable");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public MusicPagesLogger(p69 p69, xc9 xc9, zc9 zc9, InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.a = p69.J1();
        this.b = xc9;
        this.c = zc9;
        this.d = interactionLogger;
    }

    private void N(String str, SectionId sectionId, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        O(str, sectionId, i, interactionType, userIntent.toString());
    }

    private void O(String str, SectionId sectionId, int i, InteractionLogger.InteractionType interactionType, String str2) {
        this.d.a(str, sectionId != null ? sectionId.toString() : null, i, interactionType, str2);
    }

    private static String i(UserIntent userIntent, String str) {
        if (str.isEmpty()) {
            return userIntent.toString();
        }
        return userIntent.toString() + ',' + str;
    }

    public /* synthetic */ void A(r0.v vVar) {
        N(null, SectionId.HIDDEN_TRACKS_BUTTON, 0, InteractionLogger.InteractionType.HIT, UserIntent.OPEN_HIDDEN_TRACKS);
    }

    public void B(r0.x xVar) {
        xc9.c.e.a a2 = this.b.b().e().a();
        a2.getClass();
        f fVar = new f(a2);
        if (this.a == MusicPageId.SONGS) {
            fVar.run();
        }
        N(null, SectionId.RECS_SECTION_HEADER, 0, InteractionLogger.InteractionType.HIT, UserIntent.OPEN_INFO_DIALOG);
    }

    public void C(r0.y yVar) {
        int a2 = yVar.a();
        String c2 = yVar.c();
        v vVar = new v(this, a2, c2, !yVar.b(), yVar.d());
        if (this.a == MusicPageId.SONGS) {
            vVar.run();
        }
        N(c2, yVar.b() ? SectionId.LIST_OF_RECOMMENDED_ITEMS : SectionId.LIST_OF_ITEMS, a2, InteractionLogger.InteractionType.HIT, yVar.d() ? UserIntent.PLAY_PREVIEW_VIA_IMAGE : UserIntent.PLAY_PREVIEW_VIA_ROW);
    }

    public void D(r0.z zVar) {
        xc9.f.a.C0701a a2 = this.b.e().a().a();
        a2.getClass();
        a aVar = new a(a2);
        if (this.a == MusicPageId.SONGS) {
            aVar.run();
        }
        N(null, SectionId.CONTEXT_MENU, 0, InteractionLogger.InteractionType.HIT, UserIntent.SELECT_FILTER);
    }

    public void E(r0.a0 a0Var) {
        xc9.f.a.b b2 = this.b.e().a().b();
        b2.getClass();
        d dVar = new d(b2);
        if (this.a == MusicPageId.SONGS) {
            dVar.run();
        }
        N(null, SectionId.CONTEXT_MENU, 0, InteractionLogger.InteractionType.HIT, UserIntent.SELECT_SORT);
    }

    public /* synthetic */ String F(String str) {
        return this.b.a().b().a(str);
    }

    public void G(r0.b0 b0Var) {
        int a2 = b0Var.a();
        String b2 = b0Var.b();
        xc9.c.d.b b3 = this.b.b().d(a2, b2).b();
        b3.getClass();
        h hVar = new h(b3);
        if (this.a == MusicPageId.SONGS) {
            hVar.run();
        }
        N(b2, SectionId.LIST_OF_ITEMS, a2, InteractionLogger.InteractionType.HIT, UserIntent.UNLIKE);
    }

    public void H(int i, String str, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.b.b().d(i, str).a().a();
            } else {
                this.b.b().d(i, str).c();
            }
        } else if (z2) {
            this.b.b().f(i, str).a().a();
        } else {
            this.b.b().f(i, str).d();
        }
    }

    public void I(boolean z) {
        e0 e0Var = new e0(this, z);
        if (this.a == MusicPageId.SONGS) {
            e0Var.run();
        }
        N(null, SectionId.DOWNLOAD_TOGGLE, 0, InteractionLogger.InteractionType.HIT, z ? UserIntent.DOWNLOAD : UserIntent.REMOVE_DOWNLOADS);
    }

    public void J(String str, int i) {
        N(str, SectionId.LIST_OF_RECOMMENDED_ITEMS, i, InteractionLogger.InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU);
    }

    public void K(String str, int i) {
        c cVar = new c(this.b.b().c(i, str, ""));
        if (this.a == MusicPageId.SONGS) {
            cVar.run();
        }
        N(str, SectionId.LIST_OF_ITEMS, i, InteractionLogger.InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU);
    }

    public String L(int i, String str, List<fb9> list, boolean z, boolean z2) {
        String a2 = dd9.a(list, z);
        String a3 = this.a == MusicPageId.SONGS ? this.b.b().c(i, str, a2).a() : "";
        O(str, z2 ? SectionId.LIST_OF_RECOMMENDED_ITEMS : SectionId.LIST_OF_ITEMS, i, InteractionLogger.InteractionType.HIT, i(UserIntent.PLAY_TRACK_VIA_ROW, a2));
        return a3;
    }

    public String M(List<fb9> list, boolean z) {
        String a2 = dd9.a(list, z);
        String F = this.a == MusicPageId.SONGS ? F(a2) : "";
        O(null, SectionId.SHUFFLE_PLAY_BUTTON, 0, InteractionLogger.InteractionType.HIT, i(UserIntent.SHUFFLE_PLAY, a2));
        return F;
    }

    @Override // defpackage.fi9
    public void a() {
        xc9.b.a.c a2 = this.b.a().a().a();
        a2.getClass();
        w0 w0Var = new w0(a2);
        if (this.a == MusicPageId.SONGS) {
            w0Var.run();
        }
        N(null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.FILTER_BY_TEXT);
    }

    @Override // defpackage.fi9
    public void b() {
        xc9.b.a.C0695b c2 = this.b.a().a().c();
        c2.getClass();
        c1 c1Var = new c1(c2);
        if (this.a == MusicPageId.SONGS) {
            c1Var.run();
        }
        N(null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.CLEAR_FILTER_BY_TEXT);
    }

    @Override // defpackage.fi9
    public void c() {
        N(null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.SELECT_SORT);
    }

    @Override // defpackage.fi9
    public void d(String str, int i, boolean z) {
        O(null, SectionId.SORT_BOTTOM_SHEET, i, InteractionLogger.InteractionType.HIT, je.I0(new StringBuilder(), z ? "activate-filter/" : "deactivate-filter/", str));
        if (z) {
            this.c.b(str);
        } else {
            this.c.d(str);
        }
    }

    @Override // defpackage.fi9
    public void e() {
        xc9.e.a a2 = this.b.d().a();
        a2.getClass();
        b bVar = new b(a2);
        if (this.a == MusicPageId.SONGS) {
            bVar.run();
        }
        this.c.o();
        N(null, SectionId.SORT_BOTTOM_SHEET, 0, InteractionLogger.InteractionType.HIT, UserIntent.BACK_FROM_SORT_BOTTOM_SHEET);
    }

    @Override // defpackage.fi9
    public void f() {
        xc9.b.a.C0694a b2 = this.b.a().a().b();
        b2.getClass();
        b1 b1Var = new b1(b2);
        if (this.a == MusicPageId.SONGS) {
            b1Var.run();
        }
        N(null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.CANCEL_FILTER_BY_TEXT);
    }

    @Override // defpackage.fi9
    public void g() {
        xc9.b.a.c a2 = this.b.a().a().a();
        a2.getClass();
        e eVar = new e(a2);
        if (this.a == MusicPageId.SONGS) {
            eVar.run();
        }
        N(null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.SELECT_FILTER);
    }

    @Override // defpackage.fi9
    public void h(String str, int i) {
        g gVar = new g(this.b.d().b(str));
        if (this.a == MusicPageId.SONGS) {
            gVar.run();
        }
        this.c.k(str);
        O(null, SectionId.SORT_BOTTOM_SHEET, i, InteractionLogger.InteractionType.HIT, "sort-by-option/" + str);
    }

    public void j(boolean z) {
        if (z) {
            this.b.b().a().b();
        } else {
            this.b.b().a().a().a();
        }
    }

    public /* synthetic */ void k(r0.g gVar) {
        N(null, SectionId.ADD_ARTISTS_BUTTON, 0, InteractionLogger.InteractionType.HIT, UserIntent.ADD_ARTISTS);
    }

    public /* synthetic */ void l(r0.h hVar) {
        N(null, SectionId.ARTISTS_EMPTY_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.ADD_ARTISTS);
    }

    public void m(r0.i iVar) {
        xc9.c.f.C0700c c2 = this.b.b().f(iVar.a(), iVar.b()).c();
        c2.getClass();
        a1 a1Var = new a1(c2);
        if (this.a == MusicPageId.SONGS) {
            a1Var.run();
        }
        N(iVar.b(), SectionId.LIST_OF_RECOMMENDED_ITEMS, iVar.a(), InteractionLogger.InteractionType.HIT, UserIntent.BAN);
    }

    public /* synthetic */ void n(r0.e eVar) {
        N(null, SectionId.LIST_OF_ITEMS, 0, InteractionLogger.InteractionType.HIT, UserIntent.CLEAR_ALL_FILTERS);
    }

    public /* synthetic */ void o(r0.f fVar) {
        StringBuilder V0 = je.V0("clear-filter/");
        V0.append(fVar.a());
        O(null, SectionId.FILTER_INDICATOR_VIEW, 0, InteractionLogger.InteractionType.HIT, V0.toString());
    }

    public /* synthetic */ void p(r0.k kVar) {
        N(null, SectionId.CREATE_NEW_PLAYLIST_BUTTON, 0, InteractionLogger.InteractionType.HIT, UserIntent.CREATE);
    }

    public /* synthetic */ void q(r0.l lVar) {
        N(null, SectionId.PLAYLISTS_EMPTY_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.CREATE);
    }

    public void r(r0.m mVar) {
        xc9.c.e.a.C0699a b2 = this.b.b().e().a().b();
        b2.getClass();
        t0 t0Var = new t0(b2);
        if (this.a == MusicPageId.SONGS) {
            t0Var.run();
        }
        N(null, SectionId.RECS_INFO_DIALOG, 0, InteractionLogger.InteractionType.HIT, UserIntent.DISMISS_INFO_DIALOG);
    }

    public /* synthetic */ void s(r0.o oVar) {
        O(null, SectionId.CONTEXT_MENU, 0, InteractionLogger.InteractionType.HIT, je.I0(new StringBuilder(), oVar.b() ? "activate-filter/" : "deactivate-filter/", oVar.a()));
    }

    public /* synthetic */ void t(r0.p pVar) {
        N(null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionLogger.InteractionType.HIT, UserIntent.SELECT_FILTER);
    }

    public /* synthetic */ void u(r0.q qVar) {
        N(qVar.a(), SectionId.LIST_OF_RECOMMENDED_ITEMS, 0, InteractionLogger.InteractionType.HIT, UserIntent.FOLLOW_ARTIST);
    }

    public /* synthetic */ void v(r0.r rVar) {
        N(rVar.b(), SectionId.LIST_OF_RECOMMENDED_ITEMS, rVar.a(), InteractionLogger.InteractionType.HIT, UserIntent.LIKE_ALBUM);
    }

    public void w(r0.s sVar) {
        int a2 = sVar.a();
        String b2 = sVar.b();
        xc9.c.f.b b3 = this.b.b().f(a2, b2).b();
        b3.getClass();
        u0 u0Var = new u0(b3);
        if (this.a == MusicPageId.SONGS) {
            u0Var.run();
        }
        N(b2, SectionId.LIST_OF_RECOMMENDED_ITEMS, a2, InteractionLogger.InteractionType.HIT, UserIntent.LIKE);
    }

    public /* synthetic */ void x(r0.t tVar) {
        N(tVar.b(), SectionId.LIST_OF_ITEMS, tVar.a(), InteractionLogger.InteractionType.HIT, UserIntent.ITEM);
    }

    public /* synthetic */ void y(r0.w wVar) {
        N(null, SectionId.LIKED_SONGS, 0, InteractionLogger.InteractionType.HIT, UserIntent.OPEN_LIKED_SONGS);
    }

    public /* synthetic */ void z(r0.u uVar) {
        N(null, SectionId.HIDDEN_ARTISTS_BUTTON, 0, InteractionLogger.InteractionType.HIT, UserIntent.OPEN_HIDDEN_ARTISTS);
    }
}
