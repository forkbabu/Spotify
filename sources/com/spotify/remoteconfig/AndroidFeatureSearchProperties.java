package com.spotify.remoteconfig;

public abstract class AndroidFeatureSearchProperties implements n0e {

    public enum LoadMoreSearchResults implements m0e {
        OFF("off"),
        SEVEN("seven"),
        TEN("ten");
        
        final String value;

        private LoadMoreSearchResults(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum MoreRecentSearchesResults implements m0e {
        TEN("ten"),
        THIRTY("thirty"),
        FIFTY("fifty");
        
        final String value;

        private MoreRecentSearchesResults(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum TrendingSearchesBehaviour implements m0e {
        NAVIGATE("navigate"),
        SEARCH("search");
        
        final String value;

        private TrendingSearchesBehaviour(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum TrendingSearchesExperience implements m0e {
        OFF("off"),
        WHITE_PILLS("white_pills"),
        BLACK_PILLS("black_pills");
        
        final String value;

        private TrendingSearchesExperience(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract LoadMoreSearchResults f();

    public abstract MoreRecentSearchesResults g();

    public abstract TrendingSearchesBehaviour h();

    public abstract TrendingSearchesExperience i();
}
