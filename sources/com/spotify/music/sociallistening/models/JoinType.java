package com.spotify.music.sociallistening.models;

import kotlin.jvm.internal.f;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class JoinType extends Enum<JoinType> {
    public static final JoinType a;
    public static final JoinType b;
    public static final JoinType c;
    public static final JoinType f;
    public static final JoinType n;
    private static final /* synthetic */ JoinType[] o;
    public static final a p = new a(null);
    private final String joinType;

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        JoinType joinType2 = new JoinType("SCANNING", 0, "scanning");
        a = joinType2;
        JoinType joinType3 = new JoinType("DEEPLINKING", 1, "deeplinking");
        b = joinType3;
        JoinType joinType4 = new JoinType("FRICTIONLESS", 2, "frictionless");
        c = joinType4;
        JoinType joinType5 = new JoinType("NEARBY_WIFI", 4, "nearby_wifi");
        f = joinType5;
        JoinType joinType6 = new JoinType("NOT_SPECIFIED", 5, "not_specified");
        n = joinType6;
        o = new JoinType[]{joinType2, joinType3, joinType4, new JoinType("DISCOVERED_DEVICE", 3, "discovered_device"), joinType5, joinType6};
    }

    private JoinType(String str, int i, String str2) {
        this.joinType = str2;
    }

    public static JoinType valueOf(String str) {
        return (JoinType) Enum.valueOf(JoinType.class, str);
    }

    public static JoinType[] values() {
        return (JoinType[]) o.clone();
    }

    public final String d() {
        return this.joinType;
    }
}
