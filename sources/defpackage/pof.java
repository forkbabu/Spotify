package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* renamed from: pof  reason: default package */
final class pof extends sof {
    final Method c;
    final Method d;

    pof(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x001a: APUT  
      (r1v1 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Object[] : 0x0016: INVOKE  (r7v3 java.lang.Object[]) = 
      (r7v2 java.util.ArrayList)
      (wrap: java.lang.String[] : 0x0014: NEW_ARRAY  (r3v1 java.lang.String[]) = 
      (wrap: int : 0x0010: INVOKE  (r3v0 int A[IMMUTABLE_TYPE]) = (r7v2 java.util.ArrayList) type: VIRTUAL call: java.util.ArrayList.size():int)
     type: java.lang.String[])
     type: VIRTUAL call: java.util.ArrayList.toArray(java.lang.Object[]):java.lang.Object[])
     */
    @Override // defpackage.sof
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = sof.b(list);
            Method method = this.c;
            Object[] objArr = new Object[1];
            ArrayList arrayList = (ArrayList) b;
            objArr[0] = arrayList.toArray(new String[arrayList.size()]);
            method.invoke(sSLParameters, objArr);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw rnf.b("unable to set ssl parameters", e);
        }
    }

    @Override // defpackage.sof
    public String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw rnf.b("unable to get selected protocols", e);
        }
    }
}
