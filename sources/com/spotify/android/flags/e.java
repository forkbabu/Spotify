package com.spotify.android.flags;

@Deprecated
public final class e extends b<Integer> {
    public e(String str, i iVar, Overridable overridable) {
        super(Integer.class, str, iVar, overridable, Integer.toString(0));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Serializable] */
    @Override // com.spotify.android.flags.b
    public boolean g(Integer num) {
        return num.intValue() != 0;
    }

    /* Return type fixed from 'java.io.Serializable' to match base method */
    @Override // com.spotify.android.flags.b
    public Integer h(String str) {
        if ("control".equalsIgnoreCase(str)) {
            return Integer.valueOf(a());
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            throw new UnmappableValueException(this, str, e);
        }
    }
}
