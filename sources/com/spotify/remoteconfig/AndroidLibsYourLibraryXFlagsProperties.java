package com.spotify.remoteconfig;

public abstract class AndroidLibsYourLibraryXFlagsProperties implements n0e {

    public enum DefaultSortOption implements m0e {
        MOST_RELEVANT("most_relevant"),
        RECENTLY_PLAYED("recently_played"),
        RECENTLY_ADDED("recently_added"),
        ALPHABETICAL("alphabetical"),
        CREATOR("creator");
        
        final String value;

        private DefaultSortOption(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum DefaultViewDensity implements m0e {
        LIST("list"),
        GRID("grid");
        
        final String value;

        private DefaultViewDensity(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract DefaultSortOption a();

    public abstract DefaultViewDensity b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f();

    public abstract boolean g();
}
