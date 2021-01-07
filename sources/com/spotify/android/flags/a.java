package com.spotify.android.flags;

import com.google.common.base.MoreObjects;

@Deprecated
public class a extends b<Boolean> {
    public a(String str, i iVar, Overridable overridable) {
        super(Boolean.class, str, iVar, overridable, "false");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Serializable] */
    @Override // com.spotify.android.flags.b
    public boolean g(Boolean bool) {
        return bool.booleanValue();
    }

    public boolean i(int i) {
        return i != 0;
    }

    /* renamed from: j */
    public Boolean h(String str) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        if (MoreObjects.isNullOrEmpty(str)) {
            return bool2;
        }
        if ("true".equals(str)) {
            return bool;
        }
        if ("false".equals(str) || str.equalsIgnoreCase("control")) {
            return bool2;
        }
        if (str.equalsIgnoreCase("enabled")) {
            return bool;
        }
        try {
            return Boolean.valueOf(i(Integer.parseInt(str)));
        } catch (NumberFormatException e) {
            throw new UnmappableValueException(this, str, e);
        }
    }
}
