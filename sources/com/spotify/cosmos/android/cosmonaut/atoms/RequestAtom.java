package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Request;
import java.lang.reflect.Method;
import java.util.Map;

final class RequestAtom {
    private final String mAction;
    private final BodyAtom mBodyAtom;
    private final HeadersAtom mHeadersAtom;
    private final PathAtom mPathAtom;
    private final QueryAtom mQueryAtom;

    RequestAtom(Method method, RequestTransformers requestTransformers) {
        this.mAction = ReflectionUtil.findAction(method);
        this.mPathAtom = new PathAtom(method);
        this.mQueryAtom = new QueryAtom(method);
        this.mHeadersAtom = new HeadersAtom(method);
        this.mBodyAtom = new BodyAtom(method, requestTransformers);
    }

    /* access modifiers changed from: package-private */
    public Request call(Object[] objArr) {
        return new Request(this.mAction, pathAndQuery(this.mPathAtom.call(objArr), this.mQueryAtom.call(objArr)), this.mHeadersAtom.call(objArr), this.mBodyAtom.call(objArr));
    }

    /* access modifiers changed from: package-private */
    public String pathAndQuery(String str, Map<String, String> map) {
        if (map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            sb.append('?');
        } else if (indexOf < sb.length() - 1) {
            sb.append('&');
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            sb.append('&');
        }
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }
}
