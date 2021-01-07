package com.spotify.music.features.yourlibraryx.domain;

import kotlin.jvm.internal.f;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class YourLibraryXViewMode extends Enum<YourLibraryXViewMode> {
    public static final YourLibraryXViewMode a;
    public static final YourLibraryXViewMode b;
    private static final /* synthetic */ YourLibraryXViewMode[] c;
    private final String id;

    static final class GRID extends YourLibraryXViewMode {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        GRID(String str, int i) {
            super(str, i, "grid", null);
        }

        @Override // com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode
        public YourLibraryXViewMode g() {
            return YourLibraryXViewMode.a;
        }
    }

    static final class LIST extends YourLibraryXViewMode {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        LIST(String str, int i) {
            super(str, i, "list", null);
        }

        @Override // com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode
        public YourLibraryXViewMode g() {
            return YourLibraryXViewMode.b;
        }
    }

    static {
        LIST list = new LIST("LIST", 0);
        a = list;
        GRID grid = new GRID("GRID", 1);
        b = grid;
        c = new YourLibraryXViewMode[]{list, grid};
    }

    public YourLibraryXViewMode(String str, int i, String str2, f fVar) {
        this.id = str2;
    }

    public static YourLibraryXViewMode valueOf(String str) {
        return (YourLibraryXViewMode) Enum.valueOf(YourLibraryXViewMode.class, str);
    }

    public static YourLibraryXViewMode[] values() {
        return (YourLibraryXViewMode[]) c.clone();
    }

    public final String d() {
        return this.id;
    }

    public abstract YourLibraryXViewMode g();
}
