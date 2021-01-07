package com.spotify.music.features.yourlibraryx.contextmenu;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class ContextItemType extends Enum<ContextItemType> {
    public static final ContextItemType a;
    public static final ContextItemType b;
    public static final ContextItemType c;
    public static final ContextItemType f;
    public static final ContextItemType n;
    private static final /* synthetic */ ContextItemType[] o;

    static {
        ContextItemType contextItemType = new ContextItemType("ALBUM", 0);
        a = contextItemType;
        ContextItemType contextItemType2 = new ContextItemType("ARTIST", 1);
        b = contextItemType2;
        ContextItemType contextItemType3 = new ContextItemType("PLAYLIST", 3);
        c = contextItemType3;
        ContextItemType contextItemType4 = new ContextItemType("PODCAST", 4);
        f = contextItemType4;
        ContextItemType contextItemType5 = new ContextItemType("UNKNOWN", 5);
        n = contextItemType5;
        o = new ContextItemType[]{contextItemType, contextItemType2, new ContextItemType("FOLDER", 2), contextItemType3, contextItemType4, contextItemType5};
    }

    private ContextItemType(String str, int i) {
    }

    public static ContextItemType valueOf(String str) {
        return (ContextItemType) Enum.valueOf(ContextItemType.class, str);
    }

    public static ContextItemType[] values() {
        return (ContextItemType[]) o.clone();
    }
}
