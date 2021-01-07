package com.spotify.remoteconfig;

public abstract class AndroidLibsYourLibraryFlagsProperties implements n0e {

    public enum PlaylistLayoutWorkshop implements m0e {
        LIST("list"),
        GRID("grid"),
        SHELF("shelf");
        
        final String value;

        private PlaylistLayoutWorkshop(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract PlaylistLayoutWorkshop a();

    public abstract boolean b();

    public abstract int c();

    public abstract boolean d();
}
