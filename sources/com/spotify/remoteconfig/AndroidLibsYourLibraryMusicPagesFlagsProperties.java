package com.spotify.remoteconfig;

public abstract class AndroidLibsYourLibraryMusicPagesFlagsProperties implements n0e {

    public enum ArtistRecommendationsSource implements m0e {
        CORE("core"),
        COLLECTION("collection");
        
        final String value;

        private ArtistRecommendationsSource(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum LikedSongsFilterChipsSource implements m0e {
        NONE("none"),
        OBJECTIVE("objective"),
        SUBJECTIVE("subjective");
        
        final String value;

        private LikedSongsFilterChipsSource(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum LikedSongsScrollerType implements m0e {
        DEFAULT("default"),
        QUICKSCROLL_WITHOUT_HANDLER("quickscroll_without_handler"),
        QUICKSCROLL_WITH_HANDLER("quickscroll_with_handler");
        
        final String value;

        private LikedSongsScrollerType(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum QuickscrollMechanismInYourLibrary implements m0e {
        DEFAULT("default"),
        QUICKSCROLL_WITHOUT_HANDLER("quickscroll_without_handler"),
        QUICKSCROLL_WITH_HANDLER("quickscroll_with_handler");
        
        final String value;

        private QuickscrollMechanismInYourLibrary(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract ArtistRecommendationsSource a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract LikedSongsFilterChipsSource e();

    public abstract LikedSongsScrollerType f();

    public abstract QuickscrollMechanismInYourLibrary g();

    public abstract int h();

    public abstract int i();
}
