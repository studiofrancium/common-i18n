/*
 * Copyright (C) 2012-2017 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ee.studiofrancium.common.i18n

import java.util.*

/**
 * Locale code.
 *
 *
 *
 * The list of the enum entries was generated based on the output from
 * [ Locale.getAvailableLocales()][java.util.Locale.getAvailableLocales] of Java SE 7, but locales whose
 * format do not match either 'xx' or 'xx-XX' were excluded.
 *
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
 * <span style="color: darkgreen;">// List all the locale codes.</span>
 * for (LocaleCode code : LocaleCode.values())
 * {
 * String language = code.[.getLanguage].[getName()][LanguageCode.name];
 * String country  = code.[.getCountry] != null
 * ? code.[.getCountry].[getName()][CountryCode.name] : null;
 *
 * <span style="color: darkgreen;">// For example, "[de-DE] German, Germany" is printed.</span>
 * System.out.format(<span style="color: darkred;">"[%s] %s, %s\n"</span>, code, language, country);
 * }
 *
 * <span style="color: darkgreen;">// Get a LocaleCode instance in various ways.</span>
 * LocaleCode code;
 * code = LocaleCode.[getByCode][.getByCode](<span style="color: darkred;">"en-GB"</span>);
 * code = LocaleCode.[getByCode][.getByCode](<span style="color: darkred;">"es"</span>, <span style="color: darkred;">"ES"</span>);
 * code = LocaleCode.[getByLocale][.getByLocale](new Locale(<span style="color: darkred;">"pt"</span>, <span style="color: darkred;">"BR"</span>));
 *
 * <span style="color: darkgreen;">// Convert to a Locale instance.</span>
 * Locale locale = LocaleCode.[.en].[.toLocale];
 *
 * <span style="color: darkgreen;">// toLocale() of some LocaleCode instances does not create</span>
 * <span style="color: darkgreen;">// a new Locale instance but returns a static variable of</span>
 * <span style="color: darkgreen;">// Locale class instead. See [.toLocale] for details.</span>
 * if (locale == Locale.ENGLISH)
 * {
 * System.out.println(<span style="color: darkred;">"Locale.en.toLocale() returned Locale.ENGLISH"</span>);
 * }
 *
 * <span style="color: darkgreen;">// Get a list of LocaleCode instances whose language is Arabic.</span>
 * List&lt;LocaleCode&gt; list = LocaleCode.[getByLanguage][.getByLanguage]([LanguageCode.ar]);
 *
 * <span style="color: darkgreen;">// Get a list of LocaleCode instances whose country is Switzerland.</span>
 * list = LocaleCode.[getByCountry][.getByCountry]([CountryCode.CH]);
</pre> *
 *
 * @author Takahiko Kawasaki
 */
enum class LocaleCode(
    /**
     * Get the language code.
     *
     * @return The language code. This method always returns a non-null value.
     */
    val language: LanguageCode,
    /**
     * Get the country code.
     *
     * @return The country code. This method may return null.
     * For example, [LocaleCode.en][.en].getCountry() returns null.
     */
    val country: CountryCode?
) {
    /**
     * [Undefined][LanguageCode.undefined], [Undefined][CountryCode.UNDEFINED]
     *
     * @since 1.14
     */
    undefined(LanguageCode.undefined, CountryCode.UNDEFINED) {
        override fun toLocale(): Locale {
            return undefinedLocale
        }
    },

    /**
     * [Arabic][LanguageCode.ar]
     */
    ar(LanguageCode.ar, null),

    /**
     * [Arabic][LanguageCode.ar], [United Arab Emirates][CountryCode.AE]
     */
    ar_AE(LanguageCode.ar, CountryCode.AE),

    /**
     * [Arabic][LanguageCode.ar], [Bahrain][CountryCode.BH]
     */
    ar_BH(LanguageCode.ar, CountryCode.BH),

    /**
     * [Arabic][LanguageCode.ar], [Algeria][CountryCode.DZ]
     */
    ar_DZ(LanguageCode.ar, CountryCode.DZ),

    /**
     * [Arabic][LanguageCode.ar], [Egypt][CountryCode.EG]
     */
    ar_EG(LanguageCode.ar, CountryCode.EG),

    /**
     * [Arabic][LanguageCode.ar], [Iraq][CountryCode.IQ]
     */
    ar_IQ(LanguageCode.ar, CountryCode.IQ),

    /**
     * [Arabic][LanguageCode.ar], [Jordan][CountryCode.JO]
     */
    ar_JO(LanguageCode.ar, CountryCode.JO),

    /**
     * [Arabic][LanguageCode.ar], [Kuwait][CountryCode.KW]
     */
    ar_KW(LanguageCode.ar, CountryCode.KW),

    /**
     * [Arabic][LanguageCode.ar], [Lebanon][CountryCode.LB]
     */
    ar_LB(LanguageCode.ar, CountryCode.LB),

    /**
     * [Arabic][LanguageCode.ar], [Libya][CountryCode.LY]
     */
    ar_LY(LanguageCode.ar, CountryCode.LY),

    /**
     * [Arabic][LanguageCode.ar], [Morocco][CountryCode.MA]
     */
    ar_MA(LanguageCode.ar, CountryCode.MA),

    /**
     * [Arabic][LanguageCode.ar], [Oman][CountryCode.OM]
     */
    ar_OM(LanguageCode.ar, CountryCode.OM),

    /**
     * [Arabic][LanguageCode.ar], [Qatar][CountryCode.QA]
     */
    ar_QA(LanguageCode.ar, CountryCode.QA),

    /**
     * [Arabic][LanguageCode.ar], [Saudi Arabia][CountryCode.SA]
     */
    ar_SA(LanguageCode.ar, CountryCode.SA),

    /**
     * [Arabic][LanguageCode.ar], [Sudan][CountryCode.SD]
     */
    ar_SD(LanguageCode.ar, CountryCode.SD),

    /**
     * [Arabic][LanguageCode.ar], [Syrian Arab Republic][CountryCode.SY]
     */
    ar_SY(LanguageCode.ar, CountryCode.SY),

    /**
     * [Arabic][LanguageCode.ar], [Tunisia][CountryCode.TN]
     */
    ar_TN(LanguageCode.ar, CountryCode.TN),

    /**
     * [Arabic][LanguageCode.ar], [Yemen][CountryCode.YE]
     */
    ar_YE(LanguageCode.ar, CountryCode.YE),

    /**
     * [Belarusian][LanguageCode.be]
     */
    be(LanguageCode.be, null),

    /**
     * [Belarusian][LanguageCode.be], [Belarus][CountryCode.BY]
     */
    be_BY(LanguageCode.be, CountryCode.BY),

    /**
     * [Bulgarian][LanguageCode.bg]
     */
    bg(LanguageCode.bg, null),

    /**
     * [Bulgarian][LanguageCode.bg], [Bulgaria][CountryCode.BG]
     */
    bg_BG(LanguageCode.bg, CountryCode.BG),

    /**
     * [Catalan][LanguageCode.ca]
     */
    ca(LanguageCode.ca, null),

    /**
     * [Catalan][LanguageCode.ca], [Spain][CountryCode.ES]
     */
    ca_ES(LanguageCode.ca, CountryCode.ES),

    /**
     * [Czech][LanguageCode.cs]
     */
    cs(LanguageCode.cs, null),

    /**
     * [Czech][LanguageCode.cs], [Czech Republic][CountryCode.CZ]
     */
    cs_CZ(LanguageCode.cs, CountryCode.CZ),

    /**
     * [Danish][LanguageCode.da]
     */
    da(LanguageCode.da, null),

    /**
     * [Danish][LanguageCode.da], [Denmark][CountryCode.DK]
     */
    da_DK(LanguageCode.da, CountryCode.DK),

    /**
     * [German][LanguageCode.de]
     */
    de(LanguageCode.de, null) {
        override fun toLocale(): Locale {
            return Locale.GERMAN
        }
    },

    /**
     * [German][LanguageCode.de], [Austria][CountryCode.AT]
     */
    de_AT(LanguageCode.de, CountryCode.AT),

    /**
     * [German][LanguageCode.de], [Switzerland][CountryCode.CH]
     */
    de_CH(LanguageCode.de, CountryCode.CH),

    /**
     * [German][LanguageCode.de], [Germany][CountryCode.DE]
     */
    de_DE(LanguageCode.de, CountryCode.DE),

    /**
     * [German][LanguageCode.de], [Luxembourg][CountryCode.LU]
     */
    de_LU(LanguageCode.de, CountryCode.LU),

    /**
     * [Greek][LanguageCode.el]
     */
    el(LanguageCode.el, null),

    /**
     * [Greek][LanguageCode.el], [Cyprus][CountryCode.CY]
     */
    el_CY(LanguageCode.el, CountryCode.CY),

    /**
     * [Greek][LanguageCode.el], [Greece][CountryCode.GR]
     */
    el_GR(LanguageCode.el, CountryCode.GR),

    /**
     * [English][LanguageCode.en]
     */
    en(LanguageCode.en, null) {
        override fun toLocale(): Locale {
            return Locale.ENGLISH
        }
    },

    /**
     * [English][LanguageCode.en], [Australia][CountryCode.AU]
     */
    en_AU(LanguageCode.en, CountryCode.AU),

    /**
     * [English][LanguageCode.en], [Canada][CountryCode.CA]
     */
    en_CA(LanguageCode.en, CountryCode.CA),

    /**
     * [English][LanguageCode.en], [United Kingdom][CountryCode.GB]
     */
    en_GB(LanguageCode.en, CountryCode.GB),

    /**
     * [English][LanguageCode.en], [Hong Kong][CountryCode.HK]
     *
     * @since 1.22
     */
    en_HK(LanguageCode.en, CountryCode.HK),

    /**
     * [English][LanguageCode.en], [Ireland][CountryCode.IE]
     */
    en_IE(LanguageCode.en, CountryCode.IE),

    /**
     * [English][LanguageCode.en], [India][CountryCode.IN]
     */
    en_IN(LanguageCode.en, CountryCode.IN),

    /**
     * [English][LanguageCode.en], [Malta][CountryCode.MT]
     */
    en_MT(LanguageCode.en, CountryCode.MT),

    /**
     * [English][LanguageCode.en], [New Zealand][CountryCode.NZ]
     */
    en_NZ(LanguageCode.en, CountryCode.NZ),

    /**
     * [English][LanguageCode.en], [Philippines][CountryCode.PH]
     */
    en_PH(LanguageCode.en, CountryCode.PH),

    /**
     * [English][LanguageCode.en], [Singapore][CountryCode.SG]
     */
    en_SG(LanguageCode.en, CountryCode.SG),

    /**
     * [English][LanguageCode.en], [United States][CountryCode.US]
     */
    en_US(LanguageCode.en, CountryCode.US),

    /**
     * [English][LanguageCode.en], [South Africa][CountryCode.ZA]
     */
    en_ZA(LanguageCode.en, CountryCode.ZA),

    /**
     * [Spanish][LanguageCode.es]
     */
    es(LanguageCode.es, null),

    /**
     * [Spanish][LanguageCode.es], [Argentina][CountryCode.AR]
     */
    es_AR(LanguageCode.es, CountryCode.AR),

    /**
     * [Spanish][LanguageCode.es], [Bolivia, Plurinational State of][CountryCode.BO]
     */
    es_BO(LanguageCode.es, CountryCode.BO),

    /**
     * [Spanish][LanguageCode.es], [Chile][CountryCode.CL]
     */
    es_CL(LanguageCode.es, CountryCode.CL),

    /**
     * [Spanish][LanguageCode.es], [Colombia][CountryCode.CO]
     */
    es_CO(LanguageCode.es, CountryCode.CO),

    /**
     * [Spanish][LanguageCode.es], [Costa Rica][CountryCode.CR]
     */
    es_CR(LanguageCode.es, CountryCode.CR),

    /**
     * [Spanish][LanguageCode.es], [Dominican Republic][CountryCode.DO]
     */
    es_DO(LanguageCode.es, CountryCode.DO),

    /**
     * [Spanish][LanguageCode.es], [Ecuador][CountryCode.EC]
     */
    es_EC(LanguageCode.es, CountryCode.EC),

    /**
     * [Spanish][LanguageCode.es], [Spain][CountryCode.ES]
     */
    es_ES(LanguageCode.es, CountryCode.ES),

    /**
     * [Spanish][LanguageCode.es], [Guatemala][CountryCode.GT]
     */
    es_GT(LanguageCode.es, CountryCode.GT),

    /**
     * [Spanish][LanguageCode.es], [Honduras][CountryCode.HN]
     */
    es_HN(LanguageCode.es, CountryCode.HN),

    /**
     * [Spanish][LanguageCode.es], [Mexico][CountryCode.MX]
     */
    es_MX(LanguageCode.es, CountryCode.MX),

    /**
     * [Spanish][LanguageCode.es], [Nicaragua][CountryCode.NI]
     */
    es_NI(LanguageCode.es, CountryCode.NI),

    /**
     * [Spanish][LanguageCode.es], [Panama][CountryCode.PA]
     */
    es_PA(LanguageCode.es, CountryCode.PA),

    /**
     * [Spanish][LanguageCode.es], [Peru][CountryCode.PE]
     */
    es_PE(LanguageCode.es, CountryCode.PE),

    /**
     * [Spanish][LanguageCode.es], [Puerto Rico][CountryCode.PR]
     */
    es_PR(LanguageCode.es, CountryCode.PR),

    /**
     * [Spanish][LanguageCode.es], [Paraguay][CountryCode.PY]
     */
    es_PY(LanguageCode.es, CountryCode.PY),

    /**
     * [Spanish][LanguageCode.es], [El Salvador][CountryCode.SV]
     */
    es_SV(LanguageCode.es, CountryCode.SV),

    /**
     * [Spanish][LanguageCode.es], [United States][CountryCode.US]
     */
    es_US(LanguageCode.es, CountryCode.US),

    /**
     * [Spanish][LanguageCode.es], [Uruguay][CountryCode.UY]
     */
    es_UY(LanguageCode.es, CountryCode.UY),

    /**
     * [Spanish][LanguageCode.es], [Venezuela, Bolivarian Republic of][CountryCode.VE]
     */
    es_VE(LanguageCode.es, CountryCode.VE),

    /**
     * [Estonian][LanguageCode.et]
     */
    et(LanguageCode.et, null),

    /**
     * [Estonian][LanguageCode.et], [Estonia][CountryCode.EE]
     */
    et_EE(LanguageCode.et, CountryCode.EE),

    /**
     * [Farsi][LanguageCode.fa]
     *
     * @since 1.21
     */
    fa(LanguageCode.fa, null),

    /**
     * [Farsi][LanguageCode.fa], [Iran][CountryCode.IR]
     *
     * @since 1.21
     */
    fa_IR(LanguageCode.fa, CountryCode.IR),

    /**
     * [Finnish][LanguageCode.fi]
     */
    fi(LanguageCode.fi, null),

    /**
     * [Finnish][LanguageCode.fi], [Finland][CountryCode.FI]
     */
    fi_FI(LanguageCode.fi, CountryCode.FI),

    /**
     * [French][LanguageCode.fr]
     */
    fr(LanguageCode.fr, null) {
        override fun toLocale(): Locale {
            return Locale.FRENCH
        }
    },

    /**
     * [French][LanguageCode.fr], [Belgium][CountryCode.BE]
     */
    fr_BE(LanguageCode.fr, CountryCode.BE),

    /**
     * [French][LanguageCode.fr], [Canada][CountryCode.CA]
     */
    fr_CA(LanguageCode.fr, CountryCode.CA) {
        override fun toLocale(): Locale {
            return Locale.CANADA_FRENCH
        }
    },

    /**
     * [French][LanguageCode.fr], [Switzerland][CountryCode.CH]
     */
    fr_CH(LanguageCode.fr, CountryCode.CH),

    /**
     * [French][LanguageCode.fr], [France][CountryCode.FR]
     */
    fr_FR(LanguageCode.fr, CountryCode.FR),

    /**
     * [French][LanguageCode.fr], [Luxembourg][CountryCode.LU]
     */
    fr_LU(LanguageCode.fr, CountryCode.LU),

    /**
     * [Irish][LanguageCode.ga]
     */
    ga(LanguageCode.ga, null),

    /**
     * [Irish][LanguageCode.ga], [Ireland][CountryCode.IE]
     */
    ga_IE(LanguageCode.ga, CountryCode.IE),

    /**
     * [Hebrew][LanguageCode.he]
     */
    he(LanguageCode.he, null),

    /**
     * [Hebrew][LanguageCode.he], [Israel][CountryCode.IL]
     */
    he_IL(LanguageCode.he, CountryCode.IL),

    /**
     * [Hindi][LanguageCode.hi], [India][CountryCode.IN]
     */
    hi_IN(LanguageCode.hi, CountryCode.IN),

    /**
     * [Croatian][LanguageCode.hr]
     */
    hr(LanguageCode.hr, null),

    /**
     * [Croatian][LanguageCode.hr], [Croatia][CountryCode.HR]
     */
    hr_HR(LanguageCode.hr, CountryCode.HR),

    /**
     * [Hungarian][LanguageCode.hu]
     */
    hu(LanguageCode.hu, null),

    /**
     * [Hungarian][LanguageCode.hu], [Hungary][CountryCode.HU]
     */
    hu_HU(LanguageCode.hu, CountryCode.HU),

    /**
     * [Indonesian][LanguageCode.id]
     */
    id(LanguageCode.id, null),

    /**
     * [Indonesian][LanguageCode.id], [Indonesia][CountryCode.ID]
     */
    id_ID(LanguageCode.id, CountryCode.ID),

    /**
     * [Icelandic][LanguageCode. is]
     */
    `is`(LanguageCode.`is`, null),

    /**
     * [Icelandic][LanguageCode. is], [Iceland][CountryCode.IS]
     */
    is_IS(LanguageCode.`is`, CountryCode.IS),

    /**
     * [Italian][LanguageCode.it]
     */
    it(LanguageCode.it, null) {
        override fun toLocale(): Locale {
            return Locale.ITALIAN
        }
    },

    /**
     * [Italian][LanguageCode.it], [Switzerland][CountryCode.CH]
     */
    it_CH(LanguageCode.it, CountryCode.CH),

    /**
     * [Italian][LanguageCode.it], [Italy][CountryCode.IT]
     */
    it_IT(LanguageCode.it, CountryCode.IT),

    /**
     * [Japanese][LanguageCode.ja]
     */
    ja(LanguageCode.ja, null) {
        override fun toLocale(): Locale {
            return Locale.JAPANESE
        }
    },

    /**
     * [Japanese][LanguageCode.ja], [Japan][CountryCode.JP]
     */
    ja_JP(LanguageCode.ja, CountryCode.JP),

    /**
     * [Kazakh][LanguageCode.kk], [Kazakhstan][CountryCode.KZ]
     *
     * @since 1.22
     */
    kk_KZ(LanguageCode.kk, CountryCode.KZ),

    /**
     * [Korean][LanguageCode.ko]
     */
    ko(LanguageCode.ko, null) {
        override fun toLocale(): Locale {
            return Locale.KOREAN
        }
    },

    /**
     * [Korean][LanguageCode.ko], [Korea, Republic of][CountryCode.KR]
     */
    ko_KR(LanguageCode.ko, CountryCode.KR),

    /**
     * [Lithuanian][LanguageCode.lt]
     */
    lt(LanguageCode.lt, null),

    /**
     * [Lithuanian][LanguageCode.lt], [Lithuania][CountryCode.LT]
     */
    lt_LT(LanguageCode.lt, CountryCode.LT),

    /**
     * [Latvian][LanguageCode.lv]
     */
    lv(LanguageCode.lv, null),

    /**
     * [Latvian][LanguageCode.lv], [Latvia][CountryCode.LV]
     */
    lv_LV(LanguageCode.lv, CountryCode.LV),

    /**
     * [Macedonian][LanguageCode.mk]
     */
    mk(LanguageCode.mk, null),

    /**
     * [Macedonian][LanguageCode.mk], [Macedonia, the former Yugoslav Republic of][CountryCode.MK]
     */
    mk_MK(LanguageCode.mk, CountryCode.MK),

    /**
     * [Malay][LanguageCode.ms]
     */
    ms(LanguageCode.ms, null),

    /**
     * [Malay][LanguageCode.ms], [Malaysia][CountryCode.MY]
     */
    ms_MY(LanguageCode.ms, CountryCode.MY),

    /**
     * [Maltese][LanguageCode.mt]
     */
    mt(LanguageCode.mt, null),

    /**
     * [Maltese][LanguageCode.mt], [Malta][CountryCode.MT]
     */
    mt_MT(LanguageCode.mt, CountryCode.MT),

    /**
     * [Norwegian Bokm&amp;aring;l][LanguageCode.nb]
     *
     * @since 1.8
     */
    nb(LanguageCode.nb, null),

    /**
     * [Norwegian Bokm&amp;aring;l][LanguageCode.nb], [Norway][CountryCode.NO]
     *
     * @since 1.8
     */
    nb_NO(LanguageCode.nb, CountryCode.NO),

    /**
     * [Dutch][LanguageCode.nl]
     */
    nl(LanguageCode.nl, null),

    /**
     * [Dutch][LanguageCode.nl], [Belgium][CountryCode.BE]
     */
    nl_BE(LanguageCode.nl, CountryCode.BE),

    /**
     * [Dutch][LanguageCode.nl], [Netherlands][CountryCode.NL]
     */
    nl_NL(LanguageCode.nl, CountryCode.NL),

    /**
     * [Norwegian Nynorsk][LanguageCode.nn], [Norway][CountryCode.NO]
     */
    nn_NO(LanguageCode.nn, CountryCode.NO),

    /**
     * [Norwegian][LanguageCode.no]
     *
     * @see [Sprkkoder for POSIX locale i Norge](http://i18n.skolelinux.no/localekoder.txt)
     *
     * @see [Red Hat Bugzilla – Bug 532487 Legacy Norwegian locale
     ](https://bugzilla.redhat.com/show_bug.cgi?id=532487) */
    no(LanguageCode.no, null),

    /**
     * [Norwegian][LanguageCode.no], [Norway][CountryCode.NO]
     *
     * @see [Sprkkoder for POSIX locale i Norge](http://i18n.skolelinux.no/localekoder.txt)
     *
     * @see [Red Hat Bugzilla – Bug 532487 Legacy Norwegian locale
     ](https://bugzilla.redhat.com/show_bug.cgi?id=532487) */
    no_NO(LanguageCode.no, CountryCode.NO),

    /**
     * [Polish][LanguageCode.pl]
     */
    pl(LanguageCode.pl, null),

    /**
     * [Polish][LanguageCode.pl], [Poland][CountryCode.PL]
     */
    pl_PL(LanguageCode.pl, CountryCode.PL),

    /**
     * [Portuguese][LanguageCode.pt]
     */
    pt(LanguageCode.pt, null),

    /**
     * [Portuguese][LanguageCode.pt], [Brazil][CountryCode.BR]
     */
    pt_BR(LanguageCode.pt, CountryCode.BR),

    /**
     * [Portuguese][LanguageCode.pt], [Portugal][CountryCode.PT]
     */
    pt_PT(LanguageCode.pt, CountryCode.PT),

    /**
     * [Romanian][LanguageCode.ro]
     */
    ro(LanguageCode.ro, null),

    /**
     * [Romanian][LanguageCode.ro], [Moldova, Republic of][CountryCode.MD]
     */
    ro_MD(LanguageCode.ro, CountryCode.MD),

    /**
     * [Romanian][LanguageCode.ro], [Romania][CountryCode.RO]
     */
    ro_RO(LanguageCode.ro, CountryCode.RO),

    /**
     * [Russian][LanguageCode.ru]
     */
    ru(LanguageCode.ru, null),

    /**
     * [Russian][LanguageCode.ru], [Kazakhstan][CountryCode.KZ]
     *
     * @since 1.22
     */
    ru_KZ(LanguageCode.ru, CountryCode.KZ),

    /**
     * [Russian][LanguageCode.ru], [Russian Federation][CountryCode.RU]
     */
    ru_RU(LanguageCode.ru, CountryCode.RU),

    /**
     * [Northern Sami][LanguageCode.se]
     *
     * @since 1.8
     */
    se(LanguageCode.se, null),

    /**
     * [Northern Sami][LanguageCode.se], [Norway][CountryCode.NO]
     *
     * @since 1.8
     */
    se_NO(LanguageCode.se, CountryCode.NO),

    /**
     * [Slovak][LanguageCode.sk]
     */
    sk(LanguageCode.sk, null),

    /**
     * [Slovak][LanguageCode.sk], [Slovakia][CountryCode.SK]
     */
    sk_SK(LanguageCode.sk, CountryCode.SK),

    /**
     * [Slovene][LanguageCode.sl]
     */
    sl(LanguageCode.sl, null),

    /**
     * [Slovene][LanguageCode.sl], [Slovenia][CountryCode.SI]
     */
    sl_SI(LanguageCode.sl, CountryCode.SI),

    /**
     * [Albanian][LanguageCode.sq]
     */
    sq(LanguageCode.sq, null),

    /**
     * [Albanian][LanguageCode.sq], [Albania][CountryCode.AL]
     */
    sq_AL(LanguageCode.sq, CountryCode.AL),

    /**
     * [Serbian][LanguageCode.sr]
     */
    sr(LanguageCode.sr, null),

    /**
     * [Serbian][LanguageCode.sr], [Bosnia and Herzegovina][CountryCode.BA]
     */
    sr_BA(LanguageCode.sr, CountryCode.BA),

    /**
     * [Serbian][LanguageCode.sr], [Serbia and Montenegro][CountryCode.CS]
     */
    sr_CS(LanguageCode.sr, CountryCode.CS),

    /**
     * [Serbian][LanguageCode.sr], [Montenegro][CountryCode.ME]
     */
    sr_ME(LanguageCode.sr, CountryCode.ME),

    /**
     * [Serbian][LanguageCode.sr], [Serbia][CountryCode.RS]
     */
    sr_RS(LanguageCode.sr, CountryCode.RS),

    /**
     * [Swedish][LanguageCode.sv]
     */
    sv(LanguageCode.sv, null),

    /**
     * [Swedish][LanguageCode.sv], [Sweden][CountryCode.SE]
     */
    sv_SE(LanguageCode.sv, CountryCode.SE),

    /**
     * [Thai][LanguageCode.th]
     */
    th(LanguageCode.th, null),

    /**
     * [Thai][LanguageCode.th], [Thailand][CountryCode.TH]
     */
    th_TH(LanguageCode.th, CountryCode.TH),

    /**
     * [Turkish][LanguageCode.tr]
     */
    tr(LanguageCode.tr, null),

    /**
     * [Turkish][LanguageCode.tr], [Turkey][CountryCode.TR]
     */
    tr_TR(LanguageCode.tr, CountryCode.TR),

    /**
     * [Ukrainian][LanguageCode.uk]
     */
    uk(LanguageCode.uk, null),

    /**
     * [Ukrainian][LanguageCode.uk], [Ukraine][CountryCode.UA]
     */
    uk_UA(LanguageCode.uk, CountryCode.UA),

    /**
     * [Vietnamese][LanguageCode.vi]
     */
    vi(LanguageCode.vi, null),

    /**
     * [Vietnamese][LanguageCode.vi], [Viet Nam][CountryCode.VN]
     */
    vi_VN(LanguageCode.vi, CountryCode.VN),

    /**
     * [Chinese][LanguageCode.zh]
     */
    zh(LanguageCode.zh, null) {
        override fun toLocale(): Locale {
            return Locale.CHINESE
        }
    },

    /**
     * [Chinese][LanguageCode.zh], [China][CountryCode.CN]
     */
    zh_CN(LanguageCode.zh, CountryCode.CN) {
        override fun toLocale(): Locale {
            return Locale.SIMPLIFIED_CHINESE
        }
    },

    /**
     * [Chinese][LanguageCode.zh], [Hong Kong][CountryCode.HK]
     */
    zh_HK(LanguageCode.zh, CountryCode.HK),

    /**
     * [Chinese][LanguageCode.zh], [Singapore][CountryCode.SG]
     */
    zh_SG(LanguageCode.zh, CountryCode.SG),

    /**
     * [Chinese][LanguageCode.zh], [Taiwan, Province of China][CountryCode.TW]
     */
    zh_TW(LanguageCode.zh, CountryCode.TW) {
        override fun toLocale(): Locale {
            return Locale.TRADITIONAL_CHINESE
        }
    };

    private var string: String? = null

    /**
     * Get the string representation of this locale code. Its format is
     * either of the following:
     *
     *
     *  * *language*
     *  * *language*`-`*country*
     *
     *
     *
     *
     * where *language* is an [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) code
     * and *country* is an [ISO 3166-1
 * alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
     *
     *
     * @return The string representation of this locale code.
     */
    override fun toString(): String {
        return string!!
    }

    /**
     * Convert this `LocaleCode` instance to a [Locale] instance.
     *
     *
     *
     * In most cases, this method creates a new `Locale` instance
     * every time it is called, but some `LocaleCode` instances
     * return their corresponding entries in `Locale` class.
     * For example, [LocaleCode.it][.it] always returns
     * [Locale.ITALIAN].
     *
     *
     *
     *
     * The table below lists `LocaleCode` entries whose `toLocale()`
     * does not create a new `Locale` instance but returns an entry in
     * `Locale` class.
     *
     *
     * <table border="1" style="border-collapse: collapse;" cellpadding="5">
     * <tr bgcolor="#FF8C00">
     * <th>LocaleCode</th>
     * <th>Locale</th>
     </tr> *
     * <tr>
     * <td>[LocaleCode.de]</td>
     * <td>[Locale.GERMAN]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.en]</td>
     * <td>[Locale.ENGLISH]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.fr]</td>
     * <td>[Locale.FRENCH]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.fr_CA]</td>
     * <td>[Locale.CANADA_FRENCH]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.it]</td>
     * <td>[Locale.ITALIAN]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.ja]</td>
     * <td>[Locale.JAPANESE]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.ko]</td>
     * <td>[Locale.KOREAN]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.zh]</td>
     * <td>[Locale.CHINESE]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.zh_CN]</td>
     * <td>[Locale.SIMPLIFIED_CHINESE]</td>
     </tr> *
     * <tr>
     * <td>[LocaleCode.zh_TW]</td>
     * <td>[Locale.TRADITIONAL_CHINESE]</td>
     </tr> *
     </table> *
     *
     *
     *
     * In addition, `toLocale()` of [ LocaleCode.undefined][LocaleCode.undefined] behaves a bit differently. It returns
     * [Locale.ROOT] when it is available (i.e. when
     * the version of Java SE is 1.6 or higher). Otherwise, it returns
     * a `Locale` instance whose language and country are empty
     * strings. Even in the latter case, the same instance is returned
     * on every call.
     *
     *
     * @return A `Locale` instance that matches this `LocaleCode`.
     */
    open fun toLocale(): Locale {
        return if (country != null) {
            Locale(language.name, country.name)
        } else {
            Locale(language.name)
        }
    }

    companion object {
        private val undefinedLocale = getUndefinedLocale()

        /**
         * Get a `LocaleCode` instance that corresponds to the given code.
         *
         *
         *
         * This method just calls [getByCode][.getByCode]`(code, true)`.
         * Note that the behavior has changed since the version 1.13. In the older versions,
         * this method was an alias of `getByCode(code, false)`.
         *
         *
         * @param code A locale code.
         * @return A `LocaleCode` instance, or `null` if not found.
         * @see .getByCode
         */
        fun getByCode(code: String?): LocaleCode? {
            return getByCode(code, true)
        }

        /**
         * Get a `LocaleCode` instance that corresponds to the given code.
         *
         *
         *
         * This method just calls [getByCode][.getByCode]`(code, false)`.
         *
         *
         * @param code A locale code.
         * @return A `LocaleCode` instance, or `null` if not found.
         * @see .getByCode
         * @since 1.13
         */
        fun getByCodeIgnoreCase(code: String?): LocaleCode? {
            return getByCode(code, false)
        }

        /**
         * Get a `LocaleCode` instance that corresponds to the given code.
         *
         *
         *
         * The format of the code should be either of the following:
         *
         *
         *
         *  * *language*
         *  * *language*`-`*country*
         *
         *
         *
         *
         * where *language* is an [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) code
         * and *country* is an [ISO 3166-1
 * alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. The separator between *language* and
         * *country* should be a hyphen (`-`) or an underscore
         * (`_`).
         *
         *
         *
         *
         * Note that if the language part of the given code is one of legacy
         * ones { "iw", "ji" and "in" }, it is regarded as its newer official
         * counterpart { "he", "yi" and "id" }, respectively.
         *
         *
         * @param code          A locale code.
         * @param caseSensitive If `true`, the *language* part of the given code must be
         * lower-case and the *country* part, if not `null`, must be
         * upper-case. If false, this method internally canonicalizes
         * the given code and then performs search.
         * @return A `LocaleCode` instance, or `null` if not found.
         */
        fun getByCode(code: String?, caseSensitive: Boolean): LocaleCode? {
            return if (code == null) {
                null
            } else when (code.length) {
                2, 9 -> // The given code is regarded as a language code.
                    getByCode(code, null, caseSensitive)
                5 -> getByCombinedCode(code, caseSensitive, 2)
                19 -> getByCombinedCode(code, caseSensitive, 9)
                else -> null
            }
        }

        /**
         * Get a `LocaleCode` instance that corresponds to the given pair of
         * language code and country code.
         *
         *
         *
         * This method just calls [ getByCode][.getByCode]`(language, country, true)`.
         * Note that the behavior has changed since the version 1.13.
         * In the older versions, this method was an alias of `getByCode(language, country, false)`.
         *
         *
         * @param language [](href=)//en.wikipedia.org/wiki/ISO_639-1"
         * >ISO 639-1 language code. Or "undefined" (case
         * sensitive). If the given language code is one of legacy
         * ones { "iw", "ji" and "in" }, it is regarded as its newer
         * official counterpart { "he", "yi" and "id" }, respectively.
         * @param country  [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code. Or "UNDEFINED"
         * (case sensitive).
         * @return A `LocaleCode`, or `null` if not found.
         * @see .getByCode
         */
        fun getByCode(language: String?, country: String?): LocaleCode? {
            return getByCode(language, country, true)
        }

        /**
         * Get a `LocaleCode` instance that corresponds to the given pair of
         * language code and country code.
         *
         *
         *
         * This method just calls [ getByCode][.getByCode]`(language, country, false)`.
         *
         *
         * @param language [](href=)//en.wikipedia.org/wiki/ISO_639-1"
         * >ISO 639-1 language code. Or "undefined" (case
         * insensitive). If the given language code is one of legacy
         * ones { "iw", "ji" and "in" }, it is regarded as its newer
         * official counterpart { "he", "yi" and "id" }, respectively.
         * @param country  [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code. Or "UNDEFINED"
         * (case insensitive).
         * @return A `LocaleCode`, or `null` if not found.
         * @see .getByCode
         * @since 1.13
         */
        fun getByCodeIgnoreCase(language: String?, country: String?): LocaleCode? {
            return getByCode(language, country, false)
        }

        /**
         * Get a `LocaleCode` instance that corresponds to the given pair of
         * language code and country code.
         *
         *
         *
         * If `language` is "undefined" and if `country` is `null`
         * or "UNDEFINED", [LocaleCode.undefined][.undefined] is returned.
         *
         *
         * @param language      [](href=)//en.wikipedia.org/wiki/ISO_639-1"
         * >ISO 639-1 language code. Or "undefined".
         * If the given language code is one of legacy ones { "iw",
         * "ji" and "in" }, it is regarded as its newer official
         * counterpart { "he", "yi" and "id" }, respectively.
         * @param country       [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code. Or "UNDEFINED".
         * @param caseSensitive If `true`, the given language code must be lower-case and
         * the given country code, if not `null`, must be upper-case.
         * If `false`, this method internally canonicalizes the given
         * codes and then performs search.
         * @return A `LocaleCode`, or `null` if not found.
         */
        fun getByCode(language: String?, country: String?, caseSensitive: Boolean): LocaleCode? {
            // Canonicalize the given language code.
            var l = language
            var c = country
            l = LanguageCode.canonicalize(l, caseSensitive)
            if (l == null) {
                // There is no LocaleCode whose language is not given.
                return null
            }

            // Canonicalize the given country code.
            c = CountryCode.canonicalize(c, caseSensitive)
            if (l == "undefined" && (c == null || c == "UNDEFINED")) {
                return undefined
            }
            return if (c == null) {
                getByEnumName(l)
            } else {
                getByEnumName(l + "_" + c)
            }
        }

        /**
         * Get a `LocaleCode` instance that corresponds to the given
         * [Locale] instance.
         *
         * @param locale A `Locale` instance.
         * @return A `LocaleCode` instance, or `null` if not found.
         * When the value returned by [getLanguage()][Locale.getLanguage]
         * method of the given instance is `null` or an empty string and
         * the value returned by [getCountry()][Locale.getCountry] method
         * of the given instance is `null` or an empty string,
         * [LocaleCode.undefined][.undefined] is returned.
         */
        fun getByLocale(locale: Locale?): LocaleCode? {
            if (locale == null) {
                return null
            }

            // Locale.getLanguage() returns either an empty string or
            // a lower-case ISO 639 code.
            val language = locale.language

            // Locale.getCountry() returns either an empty string or
            // a upper-case ISO 3166-1 alphe-2 code.
            val country = locale.country
            return if ((language == null || language.isEmpty()) &&
                (country == null || country.isEmpty())
            ) {
                undefined
            } else getByCode(language, country, true)

            // 'language' and 'country' are already lower-case and upper-case,
            // so true can be given as the third argument.
        }

        private fun getByCombinedCode(code: String, caseSensitive: Boolean, splitPosition: Int): LocaleCode? {
            // Get the character that separates the language code from the country code.
            val separator = code[splitPosition]
            if (separator == '_') {
                if (caseSensitive && splitPosition == 2) {
                    // The given code can be handled as enum name.
                    return getByEnumName(code)
                }
            } else if (separator != '-') {
                // Bad format.
                return null
            }

            // Extract the language part and the country part from the given code.
            val language = code.substring(0, splitPosition)
            val country = code.substring(splitPosition + 1)
            return getByCode(language, country, caseSensitive)
        }

        private fun getByEnumName(name: String?): LocaleCode? {
            return try {
                return name?.let { valueOf(it) }
            } catch (e: IllegalArgumentException) {
                null
            }
        }

        /**
         * Get a list of `LocaleCode` instances whose language matches the given one.
         *
         *
         *
         * This method is an alias of [ getByLanguage][.getByLanguage]`(language, true)`.
         * Note that the behavior has changed since the version 1.13. In the older versions,
         * this method was an alias of `getByLanguage(language, false)`.
         *
         *
         * @param language Language code. ISO 639 alpha-2 or alpha-3.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose language matches the given one, the size of the returned
         * list is zero.
         * @since 1.3
         */
        fun getByLanguage(language: String?): List<LocaleCode> {
            return getByLanguage(language, true)
        }

        /**
         * Get a list of `LocaleCode` instances whose language matches the given one.
         *
         *
         *
         * This method is an alias of [ getByLanguage][.getByLanguage]`(language, false)`.
         *
         *
         * @param language Language code. ISO 639 alpha-2 or alpha-3.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose language matches the given one, the size of the returned
         * list is zero.
         * @since 1.13
         */
        fun getByLanguageIgnoreCase(language: String?): List<LocaleCode> {
            return getByLanguage(language, false)
        }

        /**
         * Get a list of `LocaleCode` instances whose language matches the given one.
         *
         *
         *
         * This method is an alias of [ getByLanguage][.getByLanguage]`(`[LanguageCode]`.`[ ][LanguageCode.getByCode]`(language, caseSensitive))`.
         *
         *
         * @param language      Language code. ISO 639 alpha-2 or alpha-3.
         * @param caseSensitive If `true`, the given code should consist of lowercase letters only.
         * If `false`, case is ignored.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose language matches the given one, the size of the returned
         * list is zero.
         * @since 1.3
         */
        fun getByLanguage(
            language: String?,
            caseSensitive: Boolean
        ): List<LocaleCode> {
            return getByLanguage(LanguageCode.getByCode(language, caseSensitive))
        }

        /**
         * Get a list of `LocaleCode` instances whose language matches the given one.
         *
         * @param language `LanguageCode` instance that represents a language.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose language matches the given one, the size of the returned
         * list is zero.
         * @since 1.3
         */
        fun getByLanguage(language: LanguageCode?): List<LocaleCode> {
            val list: MutableList<LocaleCode> = ArrayList()
            if (language == null) {
                return list
            }
            for (code in values()) {
                if (code.language === language) {
                    list.add(code)
                }
            }
            return list
        }

        /**
         * Get a list of `LocaleCode` instances whose country matches the given one.
         *
         *
         *
         * This method is an alias of [ getByCountry][.getByCountry]`(country, true)`.
         * Note that the behavior has changed since the version 1.13. In the older versions,
         * this method was an alias of `getByCountry(country, false)`.
         *
         *
         * @param country Country code. ISO 3166-1 alpha-2 or alpha-3.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose country matches the given one, the size of the returned
         * list is zero.
         * @since 1.3
         */
        fun getByCountry(country: String?): List<LocaleCode> {
            return getByCountry(country, true)
        }

        /**
         * Get a list of `LocaleCode` instances whose country matches the given one.
         *
         *
         *
         * This method is an alias of [ getByCountry][.getByCountry]`(country, false)`.
         *
         *
         * @param country Country code. ISO 3166-1 alpha-2 or alpha-3.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose country matches the given one, the size of the returned
         * list is zero.
         * @since 1.13
         */
        fun getByCountryIgnoreCase(country: String?): List<LocaleCode> {
            return getByCountry(country, false)
        }

        /**
         * Get a list of `LocaleCode` instances whose country matches the given one.
         *
         *
         *
         * This method is an alias of [ getByCountry][.getByCountry]`(`[CountryCode]`.`[ ][CountryCode.getByCode]`(country, caseSensitive))`.
         *
         *
         * @param country       Country code. ISO 3166-1 alpha-2 or alpha-3.
         * @param caseSensitive If `true`, the given code should consist of uppercase letters only.
         * If `false`, case is ignored.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose country matches the given one, the size of the returned
         * list is zero.
         * @since 1.3
         */
        fun getByCountry(
            country: String?,
            caseSensitive: Boolean
        ): List<LocaleCode> {
            return getByCountry(CountryCode.getByCode(country, caseSensitive))
        }

        /**
         * Get a list of `LocaleCode` instances whose country matches the given one.
         *
         * @param country `CountryCode` instance that represents a country.
         * @return List of `LocaleCode` instances. If there is no `LocaleCode`
         * instance whose country matches the given one, the size of the returned
         * list is zero.
         * @since 1.3
         */
        fun getByCountry(country: CountryCode?): List<LocaleCode> {
            val list: MutableList<LocaleCode> = ArrayList()
            if (country == null) {
                return list
            }
            for (code in values()) {
                if (code.country === country) {
                    list.add(code)
                }
            }
            return list
        }

        private fun getUndefinedLocale(): Locale {
            return try {
                // Try to get Locale.ROOT which is available since Java SE 1.6.
                val root = Locale::class.java.getDeclaredField("ROOT")

                // Return Locale.ROOT.
                root[null] as Locale
            } catch (e: Exception) {
                // Simulate Locale.ROOT.
                Locale("", "")
            }
        }
    }

    init {
        string = if (country == null) {
            language.name
        } else {
            language.name + "-" + country.name
        }
    }
}
