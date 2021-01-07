package com.spotify.music.features.navigation;

import android.view.View;
import com.spotify.android.flags.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.NavigationItem;

public class g implements e {
    private final BottomNavigationView a;
    private final d b;
    private final fm9 c;
    private final boolean d;
    private final boolean e;
    private final y3<Integer> f;
    private final boolean g;
    private final boolean h;
    private final BottomNavigationLabelVisibility i;
    private BottomTab j;
    private final int k;
    private final View.OnClickListener l = new a();
    private final View.OnLongClickListener m = new b();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BottomTab bottomTab = ((BottomNavigationItemView) view).getBottomTab();
            g.this.b.b(bottomTab, bottomTab == g.this.j);
        }
    }

    class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return g.this.b.c(((BottomNavigationItemView) view).getBottomTab(), view);
        }
    }

    public g(d dVar, BottomNavigationView bottomNavigationView, fm9 fm9, boolean z, int i2, boolean z2, y3<Integer> y3Var, boolean z3, boolean z4, BottomNavigationLabelVisibility bottomNavigationLabelVisibility) {
        dVar.getClass();
        this.b = dVar;
        this.a = bottomNavigationView;
        fm9.getClass();
        this.c = fm9;
        this.d = z;
        this.j = BottomTab.UNKNOWN;
        this.k = i2;
        this.e = z2;
        this.f = y3Var;
        this.g = z3;
        this.h = z4;
        this.i = bottomNavigationLabelVisibility;
    }

    private void i(boolean z) {
        SpotifyIconV2 spotifyIconV2;
        SpotifyIconV2 spotifyIconV22;
        this.a.b(NavigationItem.NavigationGroup.HOME, SpotifyIconV2.HOME, SpotifyIconV2.HOME_ACTIVE, BottomTab.HOME, C0707R.string.start_page_title, C0707R.id.home_tab, this.k, this.g);
        BottomNavigationView bottomNavigationView = this.a;
        NavigationItem.NavigationGroup navigationGroup = NavigationItem.NavigationGroup.FIND;
        SpotifyIconV2 spotifyIconV23 = SpotifyIconV2.SEARCH;
        SpotifyIconV2 spotifyIconV24 = SpotifyIconV2.SEARCH_ACTIVE;
        BottomTab bottomTab = BottomTab.FIND;
        bottomNavigationView.b(navigationGroup, spotifyIconV23, spotifyIconV24, bottomTab, C0707R.string.search_tab_title, C0707R.id.search_tab, this.k, this.g);
        BottomNavigationLabelVisibility bottomNavigationLabelVisibility = this.i;
        if (bottomNavigationLabelVisibility == BottomNavigationLabelVisibility.INVISIBLE_WITH_STACK_ICON) {
            this.a.a(NavigationItem.NavigationGroup.COLLECTION, C0707R.drawable.ic_stack, C0707R.drawable.ic_stack_active, BottomTab.LIBRARY, C0707R.string.collection_title_your_library, C0707R.id.your_library_tab, this.k, this.g);
        } else {
            if (bottomNavigationLabelVisibility == BottomNavigationLabelVisibility.INVISIBLE_WITH_USER_ICON) {
                spotifyIconV22 = SpotifyIconV2.USER;
                spotifyIconV2 = SpotifyIconV2.USER_ACTIVE;
            } else {
                spotifyIconV22 = SpotifyIconV2.COLLECTION;
                spotifyIconV2 = SpotifyIconV2.COLLECTION_ACTIVE;
            }
            this.a.b(NavigationItem.NavigationGroup.COLLECTION, spotifyIconV22, spotifyIconV2, BottomTab.LIBRARY, C0707R.string.collection_title_your_library, C0707R.id.your_library_tab, this.k, this.g);
        }
        if (z) {
            BottomNavigationView bottomNavigationView2 = this.a;
            NavigationItem.NavigationGroup navigationGroup2 = NavigationItem.NavigationGroup.PREMIUM;
            SpotifyIconV2 spotifyIconV25 = SpotifyIconV2.SPOTIFYLOGO;
            bottomNavigationView2.b(navigationGroup2, spotifyIconV25, spotifyIconV25, BottomTab.FREE_TIER_PREMIUM, ((Integer) ((qi7) this.f).a()).intValue(), C0707R.id.premium_tab, this.k, this.h);
        }
        if (this.e) {
            this.a.j(bottomTab, this.m);
        }
    }

    @Override // com.spotify.music.features.navigation.e
    public int a(BottomTab bottomTab) {
        return this.a.d(bottomTab);
    }

    @Override // com.spotify.music.features.navigation.e
    public BottomTab b() {
        return this.j;
    }

    @Override // com.spotify.music.features.navigation.e
    public void c(BottomTab bottomTab, boolean z) {
        this.a.i(bottomTab, z);
    }

    public boolean f(BottomTab bottomTab) {
        return this.a.f(bottomTab);
    }

    public void g(BottomTab bottomTab) {
        this.j = this.a.h(bottomTab);
    }

    public void h(c cVar, BottomTab bottomTab, boolean z, boolean z2, boolean z3) {
        BottomTab bottomTab2;
        SpotifyIconV2 spotifyIconV2;
        SpotifyIconV2 spotifyIconV22;
        this.a.c();
        if (z2) {
            BottomNavigationView bottomNavigationView = this.a;
            NavigationItem.NavigationGroup navigationGroup = NavigationItem.NavigationGroup.PREMIUM;
            SpotifyIconV2 spotifyIconV23 = SpotifyIconV2.SPOTIFYLOGO;
            bottomTab2 = BottomTab.FREE_TIER_PREMIUM;
            bottomNavigationView.b(navigationGroup, spotifyIconV23, spotifyIconV23, bottomTab2, ((Integer) ((qi7) this.f).a()).intValue(), C0707R.id.premium_tab, this.k, this.h);
        } else if (this.c.a(cVar)) {
            BottomNavigationView bottomNavigationView2 = this.a;
            NavigationItem.NavigationGroup navigationGroup2 = NavigationItem.NavigationGroup.HOME;
            SpotifyIconV2 spotifyIconV24 = SpotifyIconV2.HOME;
            SpotifyIconV2 spotifyIconV25 = SpotifyIconV2.HOME_ACTIVE;
            BottomTab bottomTab3 = BottomTab.HOME;
            bottomNavigationView2.b(navigationGroup2, spotifyIconV24, spotifyIconV25, bottomTab3, C0707R.string.start_page_title, C0707R.id.home_tab, this.k, this.g);
            BottomNavigationView bottomNavigationView3 = this.a;
            NavigationItem.NavigationGroup navigationGroup3 = NavigationItem.NavigationGroup.FIND;
            SpotifyIconV2 spotifyIconV26 = SpotifyIconV2.SEARCH;
            SpotifyIconV2 spotifyIconV27 = SpotifyIconV2.SEARCH_ACTIVE;
            BottomTab bottomTab4 = BottomTab.FIND;
            bottomNavigationView3.b(navigationGroup3, spotifyIconV26, spotifyIconV27, bottomTab4, C0707R.string.search_tab_title, C0707R.id.search_tab, this.k, this.g);
            BottomNavigationLabelVisibility bottomNavigationLabelVisibility = this.i;
            if (bottomNavigationLabelVisibility == BottomNavigationLabelVisibility.INVISIBLE_WITH_STACK_ICON) {
                this.a.a(NavigationItem.NavigationGroup.COLLECTION, C0707R.drawable.ic_stack, C0707R.drawable.ic_stack_active, BottomTab.LIBRARY, C0707R.string.free_tier_your_library_label, C0707R.id.your_library_tab, this.k, this.g);
            } else {
                if (bottomNavigationLabelVisibility == BottomNavigationLabelVisibility.INVISIBLE_WITH_USER_ICON) {
                    spotifyIconV22 = SpotifyIconV2.USER;
                    spotifyIconV2 = SpotifyIconV2.USER_ACTIVE;
                } else {
                    spotifyIconV22 = SpotifyIconV2.COLLECTION;
                    spotifyIconV2 = SpotifyIconV2.COLLECTION_ACTIVE;
                }
                this.a.b(NavigationItem.NavigationGroup.COLLECTION, spotifyIconV22, spotifyIconV2, BottomTab.LIBRARY, C0707R.string.free_tier_your_library_label, C0707R.id.your_library_tab, this.k, this.g);
            }
            if (this.d) {
                BottomNavigationView bottomNavigationView4 = this.a;
                NavigationItem.NavigationGroup navigationGroup4 = NavigationItem.NavigationGroup.STATIONS_PROMO;
                SpotifyIconV2 spotifyIconV28 = SpotifyIconV2.STATIONS;
                bottomNavigationView4.b(navigationGroup4, spotifyIconV28, spotifyIconV28, BottomTab.STATIONS_PROMO, C0707R.string.stations_promo_navigation_tab_label, C0707R.id.stations_promo_tab, this.k, this.g);
            }
            BottomNavigationView bottomNavigationView5 = this.a;
            NavigationItem.NavigationGroup navigationGroup5 = NavigationItem.NavigationGroup.PREMIUM;
            SpotifyIconV2 spotifyIconV29 = SpotifyIconV2.SPOTIFYLOGO;
            bottomNavigationView5.b(navigationGroup5, spotifyIconV29, spotifyIconV29, BottomTab.FREE_TIER_PREMIUM, ((Integer) ((qi7) this.f).a()).intValue(), C0707R.id.premium_tab, this.k, this.h);
            if (this.e) {
                this.a.j(bottomTab4, this.m);
            }
            bottomTab2 = bottomTab3;
        } else if (z) {
            i(z);
            bottomTab2 = BottomTab.HOME;
        } else if (z3) {
            i(false);
            BottomNavigationView bottomNavigationView6 = this.a;
            BottomTab bottomTab5 = BottomTab.FREE_TIER_PREMIUM;
            if (!bottomNavigationView6.f(bottomTab5)) {
                BottomNavigationView bottomNavigationView7 = this.a;
                NavigationItem.NavigationGroup navigationGroup6 = NavigationItem.NavigationGroup.PREMIUM;
                SpotifyIconV2 spotifyIconV210 = SpotifyIconV2.SPOTIFYLOGO;
                bottomNavigationView7.b(navigationGroup6, spotifyIconV210, spotifyIconV210, bottomTab5, ((Integer) ((qi7) this.f).a()).intValue(), C0707R.id.premium_tab, this.k, this.h);
            }
            bottomTab2 = BottomTab.HOME;
        } else {
            i(false);
            bottomTab2 = BottomTab.HOME;
        }
        this.a.setOnClickListener(this.l);
        this.a.g();
        if (bottomTab != BottomTab.UNKNOWN) {
            bottomTab2 = bottomTab;
        }
        g(bottomTab2);
    }
}
