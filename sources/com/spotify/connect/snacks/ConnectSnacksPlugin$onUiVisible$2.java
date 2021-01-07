package com.spotify.connect.snacks;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ConnectSnacksPlugin$onUiVisible$2 extends FunctionReferenceImpl implements nmf<List<? extends a>, Boolean> {
    ConnectSnacksPlugin$onUiVisible$2(ConnectSnacksPlugin connectSnacksPlugin) {
        super(1, connectSnacksPlugin, ConnectSnacksPlugin.class, "isPlayingRemotely", "isPlayingRemotely(Ljava/util/List;)Z", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(List<? extends a> list) {
        T t;
        List<? extends a> list2 = list;
        h.e(list2, "p1");
        ((ConnectSnacksPlugin) this.receiver).getClass();
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.c()) {
                break;
            }
        }
        return Boolean.valueOf(t != null);
    }
}
