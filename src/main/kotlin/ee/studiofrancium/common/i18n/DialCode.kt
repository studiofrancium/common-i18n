package ee.studiofrancium.common.i18n

import java.util.*
import java.util.stream.Collectors

/**
 * International subscriber dialing (DialCode) codes
 */
enum class DialCode(
    val prefix: String,
    val countryCode: CountryCode
) {

    AF("93", CountryCode.AF),
    AL("355", CountryCode.AL),
    DZ("213", CountryCode.DZ),
    AD("376", CountryCode.AD),
    AO("244", CountryCode.AO),
    AR("54", CountryCode.AR),
    AM("374", CountryCode.AM),
    AU("61", CountryCode.AU),
    AT("43", CountryCode.AT),
    AZ("994", CountryCode.AZ),
    BH("973", CountryCode.BH),
    BD("880", CountryCode.BD),
    BY("375", CountryCode.BY),
    BE("32", CountryCode.BE),
    BZ("501", CountryCode.BZ),
    BJ("229", CountryCode.BJ),
    BT("975", CountryCode.BT),
    BO("591", CountryCode.BO),
    BA("387", CountryCode.BA),
    BW("267", CountryCode.BW),
    BR("55", CountryCode.BR),
    BN("673", CountryCode.BN),
    BG("359", CountryCode.BG),
    BF("226", CountryCode.BF),
    BI("257", CountryCode.BI),
    KH("855", CountryCode.KH),
    CM("237", CountryCode.CM),
    CA("1", CountryCode.CA),
    CV("238", CountryCode.CV),
    CF("236", CountryCode.CF),
    TD("235", CountryCode.TD),
    CL("56", CountryCode.CL),
    CN("86", CountryCode.CN),
    CO("57", CountryCode.CO),
    KM("269", CountryCode.KM),
    CR("506", CountryCode.CR),
    HR("385", CountryCode.HR),
    CU("53", CountryCode.CU),
    CY("357", CountryCode.CY),
    CZ("420", CountryCode.CZ),
    CD("243", CountryCode.CD),
    DK("45", CountryCode.DK),
    DJ("253", CountryCode.DJ),
    TL("670", CountryCode.TL),
    EC("593", CountryCode.EC),
    EG("20", CountryCode.EG),
    SV("503", CountryCode.SV),
    GQ("240", CountryCode.GQ),
    ER("291", CountryCode.ER),
    EE("372", CountryCode.EE),
    ET("251", CountryCode.ET),
    FJ("679", CountryCode.FJ),
    FI("358", CountryCode.FI),
    FR("33", CountryCode.FR),
    GA("241", CountryCode.GA),
    GM("220", CountryCode.GM),
    GE("995", CountryCode.GE),
    DE("49", CountryCode.DE),
    GH("233", CountryCode.GH),
    GR("30", CountryCode.GR),
    GN("224", CountryCode.GN),
    GW("245", CountryCode.GW),
    GY("592", CountryCode.GY),
    HT("509", CountryCode.HT),
    HN("504", CountryCode.HN),
    HU("36", CountryCode.HU),
    IS("354", CountryCode.IS),
    IN("91", CountryCode.IN),
    ID("62", CountryCode.ID),
    IR("98", CountryCode.IR),
    IQ("964", CountryCode.IQ),
    IE("353", CountryCode.IE),
    IL("972", CountryCode.IL),
    IT("39", CountryCode.IT),
    CI("225", CountryCode.CI),
    JP("81", CountryCode.JP),
    JO("962", CountryCode.JO),
    KZ("7", CountryCode.KZ),
    KE("254", CountryCode.KE),
    KI("686", CountryCode.KI),
    KW("965", CountryCode.KW),
    KG("996", CountryCode.KG),
    LA("856", CountryCode.LA),
    LV("371", CountryCode.LV),
    LB("961", CountryCode.LB),
    LS("266", CountryCode.LS),
    LR("231", CountryCode.LR),
    LY("218", CountryCode.LY),
    LI("423", CountryCode.LI),
    LT("370", CountryCode.LT),
    LU("352", CountryCode.LU),
    MK("389", CountryCode.MK),
    MG("261", CountryCode.MG),
    MW("265", CountryCode.MW),
    MY("60", CountryCode.MY),
    MV("960", CountryCode.MV),
    ML("223", CountryCode.ML),
    MT("356", CountryCode.MT),
    MH("692", CountryCode.MH),
    MR("222", CountryCode.MR),
    MU("230", CountryCode.MU),
    MX("52", CountryCode.MX),
    FM("691", CountryCode.FM),
    MD("373", CountryCode.MD),
    MC("377", CountryCode.MC),
    MN("976", CountryCode.MN),
    ME("382", CountryCode.ME),
    MA("212", CountryCode.MA),
    MZ("258", CountryCode.MZ),
    MM("95", CountryCode.MM),
    NA("264", CountryCode.NA),
    NR("674", CountryCode.NR),
    NP("977", CountryCode.NP),
    NL("31", CountryCode.NL),
    NZ("64", CountryCode.NZ),
    NI("505", CountryCode.NI),
    NE("227", CountryCode.NE),
    NG("234", CountryCode.NG),
    KP("850", CountryCode.KP),
    NO("47", CountryCode.NO),
    OM("968", CountryCode.OM),
    PK("92", CountryCode.PK),
    PW("680", CountryCode.PW),
    PA("507", CountryCode.PA),
    PG("675", CountryCode.PG),
    PY("595", CountryCode.PY),
    PE("51", CountryCode.PE),
    PH("63", CountryCode.PH),
    PL("48", CountryCode.PL),
    PT("351", CountryCode.PT),
    QA("974", CountryCode.QA),
    CG("242", CountryCode.CG),
    RO("40", CountryCode.RO),
    RU("7", CountryCode.RU),
    RW("250", CountryCode.RW),
    WS("685", CountryCode.WS),
    SM("378", CountryCode.SM),
    ST("239", CountryCode.ST),
    SA("966", CountryCode.SA),
    SN("221", CountryCode.SN),
    RS("381", CountryCode.RS),
    SC("248", CountryCode.SC),
    SL("232", CountryCode.SL),
    SG("65", CountryCode.SG),
    SK("421", CountryCode.SK),
    SI("386", CountryCode.SI),
    SB("677", CountryCode.SB),
    SO("252", CountryCode.SO),
    ZA("27", CountryCode.ZA),
    KR("82", CountryCode.KR),
    SS("211", CountryCode.SS),
    ES("34", CountryCode.ES),
    LK("94", CountryCode.LK),
    SD("249", CountryCode.SD),
    SR("597", CountryCode.SR),
    SZ("268", CountryCode.SZ),
    SE("46", CountryCode.SE),
    CH("41", CountryCode.CH),
    SY("963", CountryCode.SY),
    TJ("992", CountryCode.TJ),
    TZ("255", CountryCode.TZ),
    TH("66", CountryCode.TH),
    TG("228", CountryCode.TG),
    TO("676", CountryCode.TO),
    TN("216", CountryCode.TN),
    TR("90", CountryCode.TR),
    TM("993", CountryCode.TM),
    TV("688", CountryCode.TV),
    UG("256", CountryCode.UG),
    UA("380", CountryCode.UA),
    AE("971", CountryCode.AE),
    GB("44", CountryCode.GB),
    US("1", CountryCode.US),
    UY("598", CountryCode.UY),
    UZ("998", CountryCode.UZ),
    VU("678", CountryCode.VU),
    VA("379", CountryCode.VA),
    VE("58", CountryCode.VE),
    VN("84", CountryCode.VN),
    YE("967", CountryCode.YE),
    ZM("260", CountryCode.ZM),
    ZW("263", CountryCode.ZW);

    companion object {
        fun getByPrefix(prefix: String): DialCode? {
            return Arrays.stream(values())
                .filter { it.prefix == prefix }
                .findFirst()
                .orElse(null)
        }

        val allPrefixes: List<String>
            get() = Arrays.stream(values())
                .map { o: DialCode -> o.prefix }
                .collect(Collectors.toList())

        fun getByPhone(phone: String?): DialCode? {
            return Optional.ofNullable(phone)
                .map { obj: String -> obj.trim { it <= ' ' } }
                .filter { it.startsWith("+") }
                .map { it.substring(1) }
                .flatMap { o ->
                    allPrefixes.stream()
                        .filter { o.startsWith(it) }
                        .findFirst()
                }
                .map { getByPrefix(it) }
                .orElse(null)
        }

        fun removePrefix(phone: String): String {
            return Optional.ofNullable(getByPhone(phone))
                .map { o: DialCode -> phone.substring(o.prefix.length + 1) }
                .map { obj: String -> obj.trim { it <= ' ' } }
                .orElse(phone)
        }

        fun getCountryCodeByPhone(phone: String?): CountryCode? {
            return Optional.ofNullable(getByPhone(phone))
                .map { o: DialCode -> o.countryCode }
                .orElse(null)
        }

        fun getPrefixByPhone(phone: String?, withPlus: Boolean): String? {
            return Optional.ofNullable(getByPhone(phone))
                .map { o: DialCode -> o.prefix }
                .map { o: String? -> if (withPlus) "+$o" else o }
                .orElse(null)
        }
    }
}
