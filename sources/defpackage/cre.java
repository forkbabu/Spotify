package defpackage;

import com.spotify.messages.UbiExpr5ImpressionNonAuth;
import com.spotify.messages.UbiExpr6InteractionNonAuth;
import com.spotify.messages.UbiProd1Impression;
import com.spotify.messages.UbiProd1Interaction;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cre  reason: default package */
final class cre {
    private static String a(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }

    private static List<String> b(List<String> list, String str) {
        if (str == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        return arrayList;
    }

    static UbiProd1Impression c(String str, String str2, String str3) {
        try {
            ArrayList arrayList = new ArrayList(0);
            JSONObject jSONObject = new JSONObject(str);
            UbiProd1Impression.b R = UbiProd1Impression.R();
            R.P(jSONObject.optString("impression_id", UUID.randomUUID().toString()));
            if (j(jSONObject, "app", arrayList)) {
                R.N(jSONObject.getString("app"));
            }
            if (j(jSONObject, "specification_version", arrayList)) {
                R.T(jSONObject.getString("specification_version"));
            }
            if (j(jSONObject, "element_path_names", arrayList)) {
                R.n(i(jSONObject.getJSONArray("element_path_names")));
            } else {
                arrayList.add("specification id does not exist in event json string");
            }
            if (j(jSONObject, "element_path_ids", arrayList)) {
                R.m(i(jSONObject.getJSONArray("element_path_ids")));
            }
            if (j(jSONObject, "element_path_uris", arrayList)) {
                R.q(i(jSONObject.getJSONArray("element_path_uris")));
            }
            if (j(jSONObject, "element_path_reasons", arrayList)) {
                R.p(i(jSONObject.getJSONArray("element_path_reasons")));
            }
            if (j(jSONObject, "element_path_pos", arrayList)) {
                R.o(i(jSONObject.getJSONArray("element_path_pos")));
            }
            R.O(jSONObject.optString("generator_version", ""));
            R.S(jSONObject.optString("specification_mode", "default"));
            R.M(jSONObject.optString("annotator_version", ""));
            R.L(jSONObject.optString("annotator_configuration_version", ""));
            R.R(str3);
            R.Q(str2);
            if (jSONObject.has("parent_path_names")) {
                R.u(i(jSONObject.getJSONArray("parent_path_names")));
            }
            if (jSONObject.has("parent_path_ids")) {
                R.t(i(jSONObject.getJSONArray("parent_path_ids")));
            }
            if (jSONObject.has("parent_path_uris")) {
                R.x(i(jSONObject.getJSONArray("parent_path_uris")));
            }
            if (jSONObject.has("parent_path_reasons")) {
                R.w(i(jSONObject.getJSONArray("parent_path_reasons")));
            }
            if (jSONObject.has("parent_path_pos")) {
                R.v(i(jSONObject.getJSONArray("parent_path_pos")));
            }
            if (jSONObject.has("parent_specification_versions")) {
                R.y(i(jSONObject.getJSONArray("parent_specification_versions")));
            }
            if (jSONObject.has("parent_modes")) {
                R.s(i(jSONObject.getJSONArray("parent_modes")));
            }
            if (jSONObject.has("errors")) {
                arrayList.addAll(i(jSONObject.getJSONArray("errors")));
            }
            R.r(arrayList);
            return (UbiProd1Impression) R.build();
        } catch (JSONException unused) {
            return null;
        }
    }

    static UbiExpr5ImpressionNonAuth d(mqe mqe, String str, String str2, String str3) {
        UbiExpr5ImpressionNonAuth.b F = UbiExpr5ImpressionNonAuth.F();
        F.D(mqe.b());
        F.E(str);
        F.H(mqe.c().o());
        F.C(mqe.c().f());
        F.B(mqe.c().d());
        F.F(str2);
        F.m(b(mqe.a(), str3));
        mqe.c().getClass();
        F.G("default");
        F.A(mqe.c().c());
        F.z(mqe.c().b());
        for (sqe sqe : mqe.c().m()) {
            F.o(sqe.e());
            F.n(a(sqe.d()));
            F.r(a(sqe.h()));
            F.q(a(sqe.g()));
            F.p(a(sqe.f()));
        }
        for (rqe rqe : mqe.d().b()) {
            List<sqe> m = rqe.m();
            for (int i = 0; i < m.size(); i++) {
                sqe sqe2 = m.get(i);
                F.u(sqe2.e());
                F.t(a(sqe2.d()));
                F.x(a(sqe2.h()));
                F.w(a(sqe2.g()));
                F.v(a(sqe2.f()));
                if (i == 0) {
                    F.y(rqe.o());
                    F.s("default");
                } else {
                    F.y("");
                    F.s("");
                }
            }
        }
        return (UbiExpr5ImpressionNonAuth) F.build();
    }

    static UbiProd1Impression e(mqe mqe, String str, String str2, String str3) {
        UbiProd1Impression.b R = UbiProd1Impression.R();
        R.P(mqe.b());
        R.Q(str);
        R.T(mqe.c().o());
        R.O(mqe.c().f());
        R.N(mqe.c().d());
        R.R(str2);
        R.r(b(mqe.a(), str3));
        mqe.c().getClass();
        R.S("default");
        R.M(mqe.c().c());
        R.L(mqe.c().b());
        for (sqe sqe : mqe.c().m()) {
            R.A(sqe.e());
            R.z(a(sqe.d()));
            R.D(a(sqe.h()));
            R.C(a(sqe.g()));
            R.B(a(sqe.f()));
        }
        for (rqe rqe : mqe.d().b()) {
            List<sqe> m = rqe.m();
            for (int i = 0; i < m.size(); i++) {
                sqe sqe2 = m.get(i);
                R.G(sqe2.e());
                R.F(a(sqe2.d()));
                R.J(a(sqe2.h()));
                R.I(a(sqe2.g()));
                R.H(a(sqe2.f()));
                if (i == 0) {
                    R.K(rqe.o());
                    R.E("default");
                } else {
                    R.K("");
                    R.E("");
                }
            }
        }
        return (UbiProd1Impression) R.build();
    }

    static UbiProd1Interaction f(String str, String str2, String str3) {
        try {
            ArrayList arrayList = new ArrayList(0);
            JSONObject jSONObject = new JSONObject(str);
            UbiProd1Interaction.b l0 = UbiProd1Interaction.l0();
            l0.V(jSONObject.optString(ContextTrack.Metadata.KEY_INTERACTION_ID, UUID.randomUUID().toString()));
            if (j(jSONObject, "app", arrayList)) {
                l0.T(jSONObject.getString("app"));
            }
            if (j(jSONObject, "specification_version", arrayList)) {
                l0.a0(jSONObject.getString("specification_version"));
            }
            if (j(jSONObject, "interaction_type", arrayList)) {
                l0.W(jSONObject.getString("interaction_type"));
            }
            if (j(jSONObject, "action_name", arrayList)) {
                l0.P(jSONObject.getString("action_name"));
            }
            if (j(jSONObject, "action_version", arrayList)) {
                l0.Q(jSONObject.getInt("action_version"));
            }
            if (j(jSONObject, "element_path_names", arrayList)) {
                l0.r(i(jSONObject.getJSONArray("element_path_names")));
            } else {
                arrayList.add("specification id does not exist in event json string");
            }
            if (j(jSONObject, "element_path_ids", arrayList)) {
                l0.q(i(jSONObject.getJSONArray("element_path_ids")));
            }
            if (j(jSONObject, "element_path_uris", arrayList)) {
                l0.u(i(jSONObject.getJSONArray("element_path_uris")));
            }
            if (j(jSONObject, "element_path_reasons", arrayList)) {
                l0.t(i(jSONObject.getJSONArray("element_path_reasons")));
            }
            if (j(jSONObject, "element_path_pos", arrayList)) {
                l0.s(i(jSONObject.getJSONArray("element_path_pos")));
            }
            l0.U(jSONObject.optString("generator_version", ""));
            l0.Z(jSONObject.optString("specification_mode", "default"));
            l0.S(jSONObject.optString("annotator_version", ""));
            l0.R(jSONObject.optString("annotator_configuration_version", ""));
            l0.Y(str3);
            l0.X(str2);
            if (jSONObject.has("action_parameter_names")) {
                l0.o(i(jSONObject.getJSONArray("action_parameter_names")));
            }
            if (jSONObject.has("action_parameter_values")) {
                l0.p(i(jSONObject.getJSONArray("action_parameter_values")));
            }
            if (jSONObject.has("parent_path_names")) {
                l0.y(i(jSONObject.getJSONArray("parent_path_names")));
            }
            if (jSONObject.has("parent_path_ids")) {
                l0.x(i(jSONObject.getJSONArray("parent_path_ids")));
            }
            if (jSONObject.has("parent_path_uris")) {
                l0.B(i(jSONObject.getJSONArray("parent_path_uris")));
            }
            if (jSONObject.has("parent_path_reasons")) {
                l0.A(i(jSONObject.getJSONArray("parent_path_reasons")));
            }
            if (jSONObject.has("parent_path_pos")) {
                l0.z(i(jSONObject.getJSONArray("parent_path_pos")));
            }
            if (jSONObject.has("parent_specification_versions")) {
                l0.C(i(jSONObject.getJSONArray("parent_specification_versions")));
            }
            if (jSONObject.has("parent_modes")) {
                l0.w(i(jSONObject.getJSONArray("parent_modes")));
            }
            if (jSONObject.has("errors")) {
                arrayList.addAll(i(jSONObject.getJSONArray("errors")));
            }
            l0.v(arrayList);
            return (UbiProd1Interaction) l0.build();
        } catch (JSONException unused) {
            return null;
        }
    }

    static UbiExpr6InteractionNonAuth g(nqe nqe, String str, String str2, String str3) {
        UbiExpr6InteractionNonAuth.b X = UbiExpr6InteractionNonAuth.X();
        X.H(nqe.b());
        X.J(str);
        X.G(nqe.c().f());
        X.M(nqe.c().o());
        X.F(nqe.c().d());
        X.o(b(nqe.a(), str3));
        X.I(nqe.e().c());
        X.B(nqe.e().d());
        X.C(nqe.e().f());
        X.K(str2);
        nqe.c().getClass();
        X.L("default");
        X.E(nqe.c().c());
        X.D(nqe.c().b());
        for (sqe sqe : nqe.c().m()) {
            X.q(sqe.e());
            X.p(a(sqe.d()));
            X.t(a(sqe.h()));
            X.s(a(sqe.g()));
            X.r(a(sqe.f()));
        }
        for (Map.Entry<String, String> entry : nqe.e().e().entrySet()) {
            X.m(a(entry.getKey()));
            X.n(a(entry.getValue()));
        }
        for (rqe rqe : nqe.d().b()) {
            List<sqe> m = rqe.m();
            for (int i = 0; i < m.size(); i++) {
                sqe sqe2 = m.get(i);
                X.w(sqe2.e());
                X.v(a(sqe2.d()));
                X.z(a(sqe2.h()));
                X.y(a(sqe2.g()));
                X.x(a(sqe2.f()));
                if (i == 0) {
                    X.A(rqe.o());
                    X.u("default");
                } else {
                    X.A("");
                    X.u("");
                }
            }
        }
        return (UbiExpr6InteractionNonAuth) X.build();
    }

    static UbiProd1Interaction h(nqe nqe, String str, String str2, String str3) {
        UbiProd1Interaction.b l0 = UbiProd1Interaction.l0();
        l0.V(nqe.b());
        l0.X(str);
        l0.a0(nqe.c().o());
        l0.U(nqe.c().f());
        l0.T(nqe.c().d());
        l0.v(b(nqe.a(), str3));
        l0.W(nqe.e().c());
        l0.P(nqe.e().d());
        l0.Q(nqe.e().f());
        l0.Y(str2);
        nqe.c().getClass();
        l0.Z("default");
        l0.S(nqe.c().c());
        l0.R(nqe.c().b());
        for (sqe sqe : nqe.c().m()) {
            l0.E(sqe.e());
            l0.D(a(sqe.d()));
            l0.H(a(sqe.h()));
            l0.G(a(sqe.g()));
            l0.F(a(sqe.f()));
        }
        for (Map.Entry<String, String> entry : nqe.e().e().entrySet()) {
            l0.m(a(entry.getKey()));
            l0.n(a(entry.getValue()));
        }
        for (rqe rqe : nqe.d().b()) {
            List<sqe> m = rqe.m();
            for (int i = 0; i < m.size(); i++) {
                sqe sqe2 = m.get(i);
                l0.K(sqe2.e());
                l0.J(a(sqe2.d()));
                l0.N(a(sqe2.h()));
                l0.M(a(sqe2.g()));
                l0.L(a(sqe2.f()));
                if (i == 0) {
                    l0.O(rqe.o());
                    l0.I("default");
                } else {
                    l0.O("");
                    l0.I("");
                }
            }
        }
        return (UbiProd1Interaction) l0.build();
    }

    private static List<String> i(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    private static boolean j(JSONObject jSONObject, String str, List<String> list) {
        if (jSONObject.has(str)) {
            return true;
        }
        list.add(String.format("null not expected: %s", str));
        return false;
    }
}
