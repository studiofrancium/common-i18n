/*
 * Copyright (C) 2014-2019 Neo Visionaries Inc.
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
import java.util.regex.Pattern

/**
 * Currency code (ISO 4217).
 *
 *
 *
 * The initial entries in this enum was created based on
 * [the official currency &amp; funds code list](http://www.currency-iso.org/en/home/tables/table-a1.html) (ISO 4217) of
 * January 1, 2014.
 *
 *
 * @author Takahiko Kawasaki
 * @see [The official currency &amp; funds code list](http://www.currency-iso.org/en/home/tables/table-a1.html)
 *
 * @see [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
 *
 * @since 1.9
 */
enum class CurrencyCode(
    /**
     * Get the currency name.
     *
     * @return The currency name.
     */
    val value: String,
    /**
     * Get the [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) numeric code.
     *
     * @return The [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
     * numeric code.
     */
    val numeric: Int,
    /**
     * Get the minor unit.
     *
     * @return The minor unit. `-1` means N.A.
     */
    val minorUnit: Int,
    vararg countries: CountryCode
) {
    /**
     * Undefined.
     *
     *
     *
     * This is not an official ISO 4217 code.
     *
     *
     * @see .XXX XXX: 999 No currency
     *
     * @since 1.14
     */
    UNDEFINED("Undefined", -1, -1),

    /**
     * [UAE Dirham](http://en.wikipedia.org/wiki/United_Arab_Emirates_dirham)
     * [numeric code = 784, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AE][CountryCode.AE]: UNITED ARAB EMIRATES
     *
     */
    AED("UAE Dirham", 784, 2, CountryCode.AE),

    /**
     * [Afghani](http://en.wikipedia.org/wiki/Afghan_afghani)
     * [numeric code = 971, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AF][CountryCode.AF]: AFGHANISTAN
     *
     */
    AFN("Afghani", 971, 2, CountryCode.AF),

    /**
     * [Lek](http://en.wikipedia.org/wiki/Albanian_lek)
     * [numeric code = 8, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AL][CountryCode.AL]: ALBANIA
     *
     */
    ALL("Lek", 8, 2, CountryCode.AL),

    /**
     * [Armenian Dram](http://en.wikipedia.org/wiki/Armenian_dram)
     * [numeric code = 51, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AM][CountryCode.AM]: ARMENIA
     *
     */
    AMD("Armenian Dram", 51, 2, CountryCode.AM),

    /**
     * [Netherlands Antillean Guilder](http://en.wikipedia.org/wiki/Netherlands_Antillean_guilder)
     * [numeric code = 532, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CW][CountryCode.CW]: CURAAO
     *  * [SX][CountryCode.SX]: SINT MAARTEN (DUTCH PART)
     *
     */
    ANG("Netherlands Antillean Guilder", 532, 2, CountryCode.CW, CountryCode.SX),

    /**
     * [Kwanza](http://en.wikipedia.org/wiki/Angolan_kwanza)
     * [numeric code = 973, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AO][CountryCode.AO]: ANGOLA
     *
     */
    AOA("Kwanza", 973, 2, CountryCode.AO),

    /**
     * [Argentine Peso](http://en.wikipedia.org/wiki/Argentine_peso)
     * [numeric code = 32, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AR][CountryCode.AR]: ARGENTINA
     *
     */
    ARS("Argentine Peso", 32, 2, CountryCode.AR),

    /**
     * [Australian Dollar](http://en.wikipedia.org/wiki/Australian_dollar)
     * [numeric code = 36, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AU][CountryCode.AU]: AUSTRALIA
     *  * [CC][CountryCode.CC]: COCOS (KEELING) ISLANDS
     *  * [CX][CountryCode.CX]: CHRISTMAS ISLAND
     *  * [HM][CountryCode.HM]: HEARD ISLAND AND McDONALD ISLANDS
     *  * [KI][CountryCode.KI]: KIRIBATI
     *  * [NF][CountryCode.NF]: NORFOLK ISLAND
     *  * [NR][CountryCode.NR]: NAURU
     *  * [TV][CountryCode.TV]: TUVALU
     *
     */
    AUD(
        "Australian Dollar", 36, 2,
        CountryCode.AU, CountryCode.CC, CountryCode.CX, CountryCode.HM,
        CountryCode.KI, CountryCode.NF, CountryCode.NR, CountryCode.TV
    ),

    /**
     * [Aruban Florin](http://en.wikipedia.org/wiki/Aruban_florin)
     * [numeric code = 533, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AW][CountryCode.AW]: ARUBA
     *
     */
    AWG("Aruban Florin", 533, 2, CountryCode.AW),

    /**
     * [Azerbaijanian Manat](http://en.wikipedia.org/wiki/Azerbaijani_manat)
     * [numeric code = 944, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AZ][CountryCode.AZ]: AZERBAIJAN
     *
     */
    AZN("Azerbaijanian Manat", 944, 2, CountryCode.AZ),

    /**
     * [Convertible Mark](http://en.wikipedia.org/wiki/Bosnia_and_Herzegovina_convertible_mark)
     * [numeric code = 977, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BA][CountryCode.BA]: BOSNIA AND HERZEGOVINA
     *
     */
    BAM("Convertible Mark", 977, 2, CountryCode.BA),

    /**
     * [Barbados Dollar](http://en.wikipedia.org/wiki/Barbados_dollar)
     * [numeric code = 52, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BB][CountryCode.BB]: BARBADOS
     *
     */
    BBD("Barbados Dollar", 52, 2, CountryCode.BB),

    /**
     * [Taka](http://en.wikipedia.org/wiki/Bangladeshi_taka)
     * [numeric code = 50, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BD][CountryCode.BD]: BANGLADESH
     *
     */
    BDT("Taka", 50, 2, CountryCode.BD),

    /**
     * [Bulgarian Lev](http://en.wikipedia.org/wiki/Bulgarian_lev)
     * [numeric code = 975, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BG][CountryCode.BG]: BULGARIA
     *
     */
    BGN("Bulgarian Lev", 975, 2, CountryCode.BG),

    /**
     * [Bahraini Dinar](http://en.wikipedia.org/wiki/Bahraini_dinar)
     * [numeric code = 48, minor unit = 3]
     *
     *
     * Used by:
     *
     *  * [BH][CountryCode.BH]: BAHRAIN
     *
     */
    BHD("Bahraini Dinar", 48, 3, CountryCode.BH),

    /**
     * [Burundi Franc](http://en.wikipedia.org/wiki/Burundian_franc)
     * [numeric code = 108, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [BI][CountryCode.BI]: BURUNDI
     *
     */
    BIF("Burundi Franc", 108, 0, CountryCode.BI),

    /**
     * [Bermudian Dollar](http://en.wikipedia.org/wiki/Bermudian_dollar)
     * [numeric code = 60, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BM][CountryCode.BM]: BERMUDA
     *
     */
    BMD("Bermudian Dollar", 60, 2, CountryCode.BM),

    /**
     * [Brunei Dollar](http://en.wikipedia.org/wiki/Brunei_dollar)
     * [numeric code = 96, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BN][CountryCode.BN]: BRUNEI DARUSSALAM
     *
     */
    BND("Brunei Dollar", 96, 2, CountryCode.BN),

    /**
     * [Boliviano](http://en.wikipedia.org/wiki/Boliviano)
     * [numeric code = 68, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BO][CountryCode.BO]: BOLIVIA, PLURINATIONAL STATE OF
     *
     */
    BOB("Boliviano", 68, 2, CountryCode.BO),

    /**
     * Mvdol
     * [numeric code = 984, minor unit = 2, fund]
     *
     *
     * Used by:
     *
     *  * [BO][CountryCode.BO]: BOLIVIA, PLURINATIONAL STATE OF
     *
     */
    BOV("Mvdol", 984, 2, CountryCode.BO) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * [Brazilian Real](http://en.wikipedia.org/wiki/Brazilian_real)
     * [numeric code = 986, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BR][CountryCode.BR]: BRAZIL
     *
     */
    BRL("Brazilian Real", 986, 2, CountryCode.BR),

    /**
     * [Bahamian Dollar](http://en.wikipedia.org/wiki/Bahamian_dollar)
     * [numeric code = 44, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BS][CountryCode.BS]: BAHAMAS
     *
     */
    BSD("Bahamian Dollar", 44, 2, CountryCode.BS),

    /**
     * [Ngultrum](http://en.wikipedia.org/wiki/Bhutanese_ngultrum)
     * [numeric code = 64, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BT][CountryCode.BT]: BHUTAN
     *
     */
    BTN("Ngultrum", 64, 2, CountryCode.BT),

    /**
     * [Pula](http://en.wikipedia.org/wiki/Botswana_pula)
     * [numeric code = 72, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BW][CountryCode.BW]: BOTSWANA
     *
     */
    BWP("Pula", 72, 2, CountryCode.BW),

    /**
     * [Belarusian Ruble](http://en.wikipedia.org/wiki/Belarusian_ruble)
     * [numeric code = 933, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BY][CountryCode.BY]: BELARUS
     *
     *
     *
     *
     * This currency code was added by [ISO 4217 AMENDMENT NUMBER 161](http://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_161.pdf) (18 December 2015). Effective from 1 July 2016.
     *
     *
     * @see [ISO 4217 AMENDMENT NUMBER 161](http://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_161.pdf)
     *
     * @see .BYR
     *
     * @since 1.19
     */
    BYN("Belarusian Ruble", 933, 2, CountryCode.BY),

    /**
     * [Belarusian Ruble](http://en.wikipedia.org/wiki/Belarusian_ruble)
     * [numeric code = 974, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [BY][CountryCode.BY]: BELARUS
     *
     *
     * @see .BYN
     *
     */
    BYR("Belarusian Ruble", 974, 0, CountryCode.BY),

    /**
     * [Belize Dollar](http://en.wikipedia.org/wiki/Belize_dollar)
     * [numeric code = 84, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BZ][CountryCode.BZ]: BELIZE
     *
     */
    BZD("Belize Dollar", 84, 2, CountryCode.BZ),

    /**
     * [Canadian Dollar](http://en.wikipedia.org/wiki/Canadian_dollar)
     * [numeric code = 124, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CA][CountryCode.CA]: CANADA
     *
     */
    CAD("Canadian Dollar", 124, 2, CountryCode.CA),

    /**
     * [Congolese Franc](http://en.wikipedia.org/wiki/Congolese_franc)
     * [numeric code = 976, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CD][CountryCode.CD]: CONGO, THE DEMOCRATIC REPUBLIC OF
     *
     */
    CDF("Congolese Franc", 976, 2, CountryCode.CD),

    /**
     * WIR Euro
     * [numeric code = 947, minor unit = 2, fund]
     *
     *
     * Used by:
     *
     *  * [CH][CountryCode.CH]: SWITZERLAND
     *
     */
    CHE("WIR Euro", 947, 2, CountryCode.CH) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * [Swiss Franc](http://en.wikipedia.org/wiki/Swiss_franc)
     * [numeric code = 756, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CH][CountryCode.CH]: SWITZERLAND
     *  * [LI][CountryCode.LI]: LIECHTENSTEIN
     *
     */
    CHF("Swiss Franc", 756, 2, CountryCode.CH, CountryCode.LI),

    /**
     * WIR Franc
     * [numeric code = 948, minor unit = 2, fund]
     *
     *
     * Used by:
     *
     *  * [CH][CountryCode.CH]: SWITZERLAND
     *
     */
    CHW("WIR Franc", 948, 2, CountryCode.CH) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * [Unidad de Fomento](http://en.wikipedia.org/wiki/Unidad_de_Fomento)
     * [numeric code = 990, minor unit = 0, fund]
     *
     *
     * Used by:
     *
     *  * [CL][CountryCode.CL]: CHILE
     *
     */
    CLF("Unidad de Fomento", 990, 0, CountryCode.CL) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * [Chilean Peso](http://en.wikipedia.org/wiki/Chilean_peso)
     * [numeric code = 152, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [CL][CountryCode.CL]: CHILE
     *
     */
    CLP("Chilean Peso", 152, 0, CountryCode.CL),

    /**
     * [Yuan Renminbi](http://en.wikipedia.org/wiki/Renminbi)
     * [numeric code = 156, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CN][CountryCode.CN]: CHINA
     *
     */
    CNY("Yuan Renminbi", 156, 2, CountryCode.CN),

    /**
     * [Colombian Peso](http://en.wikipedia.org/wiki/Colombian_peso)
     * [numeric code = 170, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CO][CountryCode.CO]: COLOMBIA
     *
     */
    COP("Colombian Peso", 170, 2, CountryCode.CO),

    /**
     * [Unidad de Valor Real](http://en.wikipedia.org/wiki/Unidad_de_Valor_Real)
     * [numeric code = 970, minor unit = 2, fund]
     *
     *
     * Used by:
     *
     *  * [CO][CountryCode.CO]: COLOMBIA
     *
     */
    COU("Unidad de Valor Real", 970, 2, CountryCode.CO) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * [Costa Rican Colon](http://en.wikipedia.org/wiki/Costa_Rican_colon)
     * [numeric code = 188, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CR][CountryCode.CR]: COSTA RICA
     *
     */
    CRC("Costa Rican Colon", 188, 2, CountryCode.CR),

    /**
     * [Peso Convertible](http://en.wikipedia.org/wiki/Cuban_convertible_peso)
     * [numeric code = 931, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CU][CountryCode.CU]: CUBA
     *
     */
    CUC("Peso Convertible", 931, 2, CountryCode.CU),

    /**
     * [Cuban Peso](http://en.wikipedia.org/wiki/Cuban_peso)
     * [numeric code = 192, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CU][CountryCode.CU]: CUBA
     *
     */
    CUP("Cuban Peso", 192, 2, CountryCode.CU),

    /**
     * [Cape Verde Escudo](http://en.wikipedia.org/wiki/Cape_Verde_escudo)
     * [numeric code = 132, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CV][CountryCode.CV]: CAPE VERDE
     *
     */
    CVE("Cape Verde Escudo", 132, 2, CountryCode.CV),

    /**
     * [Czech Koruna](http://en.wikipedia.org/wiki/Czech_koruna)
     * [numeric code = 203, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CZ][CountryCode.CZ]: CZECH REPUBLIC
     *
     */
    CZK("Czech Koruna", 203, 2, CountryCode.CZ),

    /**
     * [Djibouti Franc](http://en.wikipedia.org/wiki/Djiboutian_franc)
     * [numeric code = 262, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [DJ][CountryCode.DJ]: DJIBOUTI
     *
     */
    DJF("Djibouti Franc", 262, 0, CountryCode.DJ),

    /**
     * [Danish Krone](http://en.wikipedia.org/wiki/Danish_krone)
     * [numeric code = 208, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [DK][CountryCode.DK]: DENMARK
     *  * [FO][CountryCode.FO]: FAROE ISLANDS
     *  * [GL][CountryCode.GL]: GREENLAND
     *
     */
    DKK("Danish Krone", 208, 2, CountryCode.DK, CountryCode.FO, CountryCode.GL),

    /**
     * [Dominican Peso](http://en.wikipedia.org/wiki/Dominican_peso)
     * [numeric code = 214, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [DO][CountryCode.DO]: DOMINICAN REPUBLIC
     *
     */
    DOP("Dominican Peso", 214, 2, CountryCode.DO),

    /**
     * [Algerian Dinar](http://en.wikipedia.org/wiki/Algerian_dinar)
     * [numeric code = 12, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [DZ][CountryCode.DZ]: ALGERIA
     *
     */
    DZD("Algerian Dinar", 12, 2, CountryCode.DZ),

    /**
     * [Egyptian Pound](http://en.wikipedia.org/wiki/Egyptian_pound)
     * [numeric code = 818, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [EG][CountryCode.EG]: EGYPT
     *
     */
    EGP("Egyptian Pound", 818, 2, CountryCode.EG),

    /**
     * [Nakfa](http://en.wikipedia.org/wiki/Eritrean_nakfa)
     * [numeric code = 232, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [ER][CountryCode.ER]: ERITREA
     *
     */
    ERN("Nakfa", 232, 2, CountryCode.ER),

    /**
     * [Ethiopian Birr](http://en.wikipedia.org/wiki/Ethiopian_birr)
     * [numeric code = 230, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [ET][CountryCode.ET]: ETHIOPIA
     *
     */
    ETB("Ethiopian Birr", 230, 2, CountryCode.ET),

    /**
     * [Euro](http://en.wikipedia.org/wiki/Euro)
     * [numeric code = 978, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AD][CountryCode.AD]: ANDORRA
     *  * [AT][CountryCode.AT]: AUSTRIA
     *  * [AX][CountryCode.AX]: LAND ISLANDS
     *  * [BE][CountryCode.BE]: BELGIUM
     *  * [BL][CountryCode.BL]: SAINT BARTHLEMY
     *  * [CY][CountryCode.CY]: CYPRUS
     *  * [DE][CountryCode.DE]: GERMANY
     *  * [EE][CountryCode.EE]: ESTONIA
     *  * [ES][CountryCode.ES]: SPAIN
     *  * [EU][CountryCode.EU]: EUROPEAN UNION
     *  * [FI][CountryCode.FI]: FINLAND
     *  * [FR][CountryCode.FR]: FRANCE
     *  * [GF][CountryCode.GF]: FRENCH GUIANA
     *  * [GP][CountryCode.GP]: GUADELOUPE
     *  * [GR][CountryCode.GR]: GREECE
     *  * [IE][CountryCode.IE]: IRELAND
     *  * [IT][CountryCode.IT]: ITALY
     *  * [LT][CountryCode.LT]: LITHUANIA
     *  * [LU][CountryCode.LU]: LUXEMBOURG
     *  * [LV][CountryCode.LV]: LATVIA
     *  * [MC][CountryCode.MC]: MONACO
     *  * [ME][CountryCode.ME]: MONTENEGRO
     *  * [MF][CountryCode.MF]: SAINT MARTIN (FRENCH PART)
     *  * [MQ][CountryCode.MQ]: MARTINIQUE
     *  * [MT][CountryCode.MT]: MALTA
     *  * [NL][CountryCode.NL]: NETHERLANDS
     *  * [PM][CountryCode.PM]: SAINT PIERRE AND MIQUELON
     *  * [PT][CountryCode.PT]: PORTUGAL
     *  * [RE][CountryCode.RE]: RUNION
     *  * [SI][CountryCode.SI]: SLOVENIA
     *  * [SK][CountryCode.SK]: SLOVAKIA
     *  * [SM][CountryCode.SM]: SAN MARINO
     *  * [TF][CountryCode.TF]: FRENCH SOUTHERN TERRITORIES
     *  * [VA][CountryCode.VA]: HOLY SEE (VATICAN CITY STATE)
     *  * [XK][CountryCode.XK]: KOSOVO, REPUBLIC OF
     *  * [YT][CountryCode.YT]: MAYOTTE
     *
     */
    EUR(
        "Euro", 978, 2,
        CountryCode.AD, CountryCode.AT, CountryCode.AX, CountryCode.BE,
        CountryCode.BL, CountryCode.CY, CountryCode.DE, CountryCode.EE,
        CountryCode.ES, CountryCode.EU, CountryCode.FI, CountryCode.FR,
        CountryCode.GF, CountryCode.GP, CountryCode.GR, CountryCode.IE,
        CountryCode.IT, CountryCode.LT, CountryCode.LU, CountryCode.LV,
        CountryCode.MC, CountryCode.ME, CountryCode.MF, CountryCode.MQ,
        CountryCode.MT, CountryCode.NL, CountryCode.PM, CountryCode.PT,
        CountryCode.RE, CountryCode.SI, CountryCode.SK, CountryCode.SM,
        CountryCode.TF, CountryCode.VA, CountryCode.XK, CountryCode.YT
    ),

    /**
     * [Fiji Dollar](http://en.wikipedia.org/wiki/Fiji_dollar)
     * [numeric code = 242, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [FJ][CountryCode.FJ]: FIJI
     *
     */
    FJD("Fiji Dollar", 242, 2, CountryCode.FJ),

    /**
     * [Falkland Islands Pound](http://en.wikipedia.org/wiki/Falkland_Islands_pound)
     * [numeric code = 238, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [FK][CountryCode.FK]: FALKLAND ISLANDS (MALVINAS)
     *
     */
    FKP("Falkland Islands Pound", 238, 2, CountryCode.FK),

    /**
     * [Pound Sterling](http://en.wikipedia.org/wiki/Pound_sterling)
     * [numeric code = 826, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [GB][CountryCode.GB]: UNITED KINGDOM
     *  * [GG][CountryCode.GG]: GUERNSEY
     *  * [IM][CountryCode.IM]: ISLE OF MAN
     *  * [JE][CountryCode.JE]: JERSEY
     *
     */
    GBP(
        "Pound Sterling", 826, 2,
        CountryCode.GB, CountryCode.GG, CountryCode.IM, CountryCode.JE
    ),

    /**
     * [Lari](http://en.wikipedia.org/wiki/Georgian_lari)
     * [numeric code = 981, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [GE][CountryCode.GE]: GEORGIA
     *
     */
    GEL("Lari", 981, 2, CountryCode.GE),

    /**
     * [Ghana Cedi](http://en.wikipedia.org/wiki/Ghanaian_cedi)
     * [numeric code = 936, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [GH][CountryCode.GH]: GHANA
     *
     */
    GHS("Ghana Cedi", 936, 2, CountryCode.GH),

    /**
     * [Gibraltar Pound](http://en.wikipedia.org/wiki/Gibraltar_pound)
     * [numeric code = 292, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [GI][CountryCode.GI]: GIBRALTAR
     *
     */
    GIP("Gibraltar Pound", 292, 2, CountryCode.GI),

    /**
     * [Dalasi](http://en.wikipedia.org/wiki/Gambian_dalasi)
     * [numeric code = 270, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [GM][CountryCode.GM]: GAMBIA
     *
     */
    GMD("Dalasi", 270, 2, CountryCode.GM),

    /**
     * [Guinea Franc](http://en.wikipedia.org/wiki/Guinean_franc)
     * [numeric code = 324, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [GN][CountryCode.GN]: GUINEA
     *
     */
    GNF("Guinea Franc", 324, 0, CountryCode.GN),

    /**
     * [Quetzal](http://en.wikipedia.org/wiki/Guatemalan_quetzal)
     * [numeric code = 320, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [GT][CountryCode.GT]: GUATEMALA
     *
     */
    GTQ("Quetzal", 320, 2, CountryCode.GT),

    /**
     * [Guyana Dollar](http://en.wikipedia.org/wiki/Guyanese_dollar)
     * [numeric code = 328, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [GY][CountryCode.GY]: GUYANA
     *
     */
    GYD("Guyana Dollar", 328, 2, CountryCode.GY),

    /**
     * [Hong Kong Dollar](http://en.wikipedia.org/wiki/Hong_Kong_dollar)
     * [numeric code = 344, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [HK][CountryCode.HK]: HONG KONG
     *
     */
    HKD("Hong Kong Dollar", 344, 2, CountryCode.HK),

    /**
     * [Lempira](http://en.wikipedia.org/wiki/Honduran_lempira)
     * [numeric code = 340, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [HN][CountryCode.HN]: HONDURAS
     *
     */
    HNL("Lempira", 340, 2, CountryCode.HN),

    /**
     * [Croatian Kuna](http://en.wikipedia.org/wiki/Croatian_kuna)
     * [numeric code = 191, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [HR][CountryCode.HR]: CROATIA
     *
     */
    HRK("Croatian Kuna", 191, 2, CountryCode.HR),

    /**
     * [Gourde](http://en.wikipedia.org/wiki/Haitian_gourde)
     * [numeric code = 332, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [HT][CountryCode.HT]: HAITI
     *
     */
    HTG("Gourde", 332, 2, CountryCode.HT),

    /**
     * [Forint](http://en.wikipedia.org/wiki/Hungarian_forint)
     * [numeric code = 348, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [HU][CountryCode.HU]: HUNGARY
     *
     */
    HUF("Forint", 348, 2, CountryCode.HU),

    /**
     * [Rupiah](http://en.wikipedia.org/wiki/Indonesian_rupiah)
     * [numeric code = 360, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [ID][CountryCode.ID]: INDONESIA
     *
     */
    IDR("Rupiah", 360, 2, CountryCode.ID),

    /**
     * [New Israeli Sheqel](http://en.wikipedia.org/wiki/Israeli_new_shekel)
     * [numeric code = 376, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [IL][CountryCode.IL]: ISRAEL
     *
     */
    ILS("New Israeli Sheqel", 376, 2, CountryCode.IL),

    /**
     * [Indian Rupee](http://en.wikipedia.org/wiki/Indian_rupee)
     * [numeric code = 356, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BT][CountryCode.BT]: BHUTAN
     *  * [IN][CountryCode.IN]: INDIA
     *
     */
    INR("Indian Rupee", 356, 2, CountryCode.BT, CountryCode.IN),

    /**
     * [Iraqi Dinar](http://en.wikipedia.org/wiki/Iraqi_dinar)
     * [numeric code = 368, minor unit = 3]
     *
     *
     * Used by:
     *
     *  * [IQ][CountryCode.IQ]: IRAQ
     *
     */
    IQD("Iraqi Dinar", 368, 3, CountryCode.IQ),

    /**
     * [Iranian Rial](http://en.wikipedia.org/wiki/Iranian_rial)
     * [numeric code = 364, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [IR][CountryCode.IR]: IRAN, ISLAMIC REPUBLIC OF
     *
     */
    IRR("Iranian Rial", 364, 2, CountryCode.IR),

    /**
     * [Iceland Krona](http://en.wikipedia.org/wiki/Icelandic_kr%C3%B3na)
     * [numeric code = 352, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [IS][CountryCode.IS]: ICELAND
     *
     */
    ISK("Iceland Krona", 352, 0, CountryCode.IS),

    /**
     * [Jamaican Dollar](http://en.wikipedia.org/wiki/Jamaican_dollar)
     * [numeric code = 388, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [JM][CountryCode.JM]: JAMAICA
     *
     */
    JMD("Jamaican Dollar", 388, 2, CountryCode.JM),

    /**
     * [Jordanian Dinar](http://en.wikipedia.org/wiki/Jordanian_dinar)
     * [numeric code = 400, minor unit = 3]
     *
     *
     * Used by:
     *
     *  * [JO][CountryCode.JO]: JORDAN
     *
     */
    JOD("Jordanian Dinar", 400, 3, CountryCode.JO),

    /**
     * [Yen](http://en.wikipedia.org/wiki/Japanese_yen)
     * [numeric code = 392, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [JP][CountryCode.JP]: JAPAN
     *
     */
    JPY("Yen", 392, 0, CountryCode.JP),

    /**
     * [Kenyan Shilling](http://en.wikipedia.org/wiki/Kenyan_shilling)
     * [numeric code = 404, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [KE][CountryCode.KE]: KENYA
     *
     */
    KES("Kenyan Shilling", 404, 2, CountryCode.KE),

    /**
     * [Som](http://en.wikipedia.org/wiki/Kyrgyzstani_som)
     * [numeric code = 417, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [KG][CountryCode.KG]: KYRGYZSTAN
     *
     */
    KGS("Som", 417, 2, CountryCode.KG),

    /**
     * [Riel](http://en.wikipedia.org/wiki/Cambodian_riel)
     * [numeric code = 116, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [KH][CountryCode.KH]: CAMBODIA
     *
     */
    KHR("Riel", 116, 2, CountryCode.KH),

    /**
     * [Comoro Franc](http://en.wikipedia.org/wiki/Comoro_franc)
     * [numeric code = 174, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [KM][CountryCode.KM]: COMOROS
     *
     */
    KMF("Comoro Franc", 174, 0, CountryCode.KM),

    /**
     * [North Korean Won](http://en.wikipedia.org/wiki/North_Korean_won)
     * [numeric code = 408, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [KP][CountryCode.KP]: KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF
     *
     */
    KPW("North Korean Won", 408, 2, CountryCode.KP),

    /**
     * [Won](http://en.wikipedia.org/wiki/South_Korean_won)
     * [numeric code = 410, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [KR][CountryCode.KR]: KOREA, REPUBLIC OF
     *
     */
    KRW("Won", 410, 0, CountryCode.KR),

    /**
     * [Kuwaiti Dinar](http://en.wikipedia.org/wiki/Kuwaiti_dinar)
     * [numeric code = 414, minor unit = 3]
     *
     *
     * Used by:
     *
     *  * [KW][CountryCode.KW]: KUWAIT
     *
     */
    KWD("Kuwaiti Dinar", 414, 3, CountryCode.KW),

    /**
     * [Cayman Islands Dollar](http://en.wikipedia.org/wiki/Cayman_Islands_dollar)
     * [numeric code = 136, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [KY][CountryCode.KY]: CAYMAN ISLANDS
     *
     */
    KYD("Cayman Islands Dollar", 136, 2, CountryCode.KY),

    /**
     * [Tenge](http://en.wikipedia.org/wiki/Kazakhstani_tenge)
     * [numeric code = 398, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [KZ][CountryCode.KZ]: KAZAKHSTAN
     *
     */
    KZT("Tenge", 398, 2, CountryCode.KZ),

    /**
     * [Kip](http://en.wikipedia.org/wiki/Lao_kip)
     * [numeric code = 418, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [LA][CountryCode.LA]: LAO PEOPLE'S DEMOCRATIC REPUBLIC
     *
     */
    LAK("Kip", 418, 2, CountryCode.LA),

    /**
     * [Lebanese Pound](http://en.wikipedia.org/wiki/Lebanese_pound)
     * [numeric code = 422, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [LB][CountryCode.LB]: LEBANON
     *
     */
    LBP("Lebanese Pound", 422, 2, CountryCode.LB),

    /**
     * [Sri Lanka Rupee](http://en.wikipedia.org/wiki/Sri_Lankan_rupee)
     * [numeric code = 144, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [LK][CountryCode.LK]: SRI LANKA
     *
     */
    LKR("Sri Lanka Rupee", 144, 2, CountryCode.LK),

    /**
     * [Liberian Dollar](http://en.wikipedia.org/wiki/Liberian_dollar)
     * [numeric code = 430, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [LR][CountryCode.LR]: LIBERIA
     *
     */
    LRD("Liberian Dollar", 430, 2, CountryCode.LR),

    /**
     * [Loti](http://en.wikipedia.org/wiki/Lesotho_loti)
     * [numeric code = 426, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [LS][CountryCode.LS]: LESOTHO
     *
     */
    LSL("Loti", 426, 2, CountryCode.LS),

    /**
     * [Lithuanian Litas](http://en.wikipedia.org/wiki/Lithuanian_litas)
     * [numeric code = 440, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [LT][CountryCode.LT]: LITHUANIA
     *
     *
     */
    LTL("Lithuanian Litas", 440, 2, CountryCode.LT),

    /**
     * [Libyan Dinar](http://en.wikipedia.org/wiki/Libyan_dinar)
     * [numeric code = 434, minor unit = 3]
     *
     *
     * Used by:
     *
     *  * [LY][CountryCode.LY]: LIBYA
     *
     */
    LYD("Libyan Dinar", 434, 3, CountryCode.LY),

    /**
     * [Moroccan Dirham](http://en.wikipedia.org/wiki/Moroccan_dirham)
     * [numeric code = 504, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [EH][CountryCode.EH]: WESTERN SAHARA
     *  * [MA][CountryCode.MA]: MOROCCO
     *
     */
    MAD("Moroccan Dirham", 504, 2, CountryCode.EH, CountryCode.MA),

    /**
     * [Moldovan Leu](http://en.wikipedia.org/wiki/Moldovan_leu)
     * [numeric code = 498, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MD][CountryCode.MD]: MOLDOVA, REPUBLIC OF
     *
     */
    MDL("Moldovan Leu", 498, 2, CountryCode.MD),

    /**
     * [Malagasy Ariary](http://en.wikipedia.org/wiki/Malagasy_ariary)
     * [numeric code = 969, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MG][CountryCode.MG]: MADAGASCAR
     *
     */
    MGA("Malagasy Ariary", 969, 2, CountryCode.MG),

    /**
     * [Denar](http://en.wikipedia.org/wiki/Macedonian_denar)
     * [numeric code = 807, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MK][CountryCode.MK]: NORTH MACEDONIA, REPUBLIC OF
     *
     */
    MKD("Denar", 807, 2, CountryCode.MK),

    /**
     * [Kyat](http://en.wikipedia.org/wiki/Myanma_kyat)
     * [numeric code = 104, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MM][CountryCode.MM]: MYANMAR
     *
     */
    MMK("Kyat", 104, 2, CountryCode.MM),

    /**
     * [Tugrik](http://en.wikipedia.org/wiki/Mongolian_t%C3%B6gr%C3%B6g)
     * [numeric code = 496, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MN][CountryCode.MN]: MONGOLIA
     *
     */
    MNT("Tugrik", 496, 2, CountryCode.MN),

    /**
     * [Pataca](http://en.wikipedia.org/wiki/Macanese_pataca)
     * [numeric code = 446, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MO][CountryCode.MO]: MACAO
     *
     */
    MOP("Pataca", 446, 2, CountryCode.MO),

    /**
     * [Ouguiya](http://en.wikipedia.org/wiki/Mauritanian_ouguiya)
     * [numeric code = 478, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MR][CountryCode.MR]: MAURITANIA
     *
     *
     * @see .MRU
     *
     */
    MRO("Ouguiya", 478, 2, CountryCode.MR),

    /**
     * [Ouguiya](http://en.wikipedia.org/wiki/Mauritanian_ouguiya)
     * [numeric code = 929, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MR][CountryCode.MR]: MAURITANIA
     *
     *
     *
     *
     * Excerpted from [ISO 4217 AMENDMENT NUMBER 165](https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_165.pdf):
     *
     *
     * <blockquote>
     *
     * *
     * The Central Bank of Mauritania is carrying out a re-denomination of
     * their local currency, with the entry into circulation of the OUGUIYA.
     * The conversion rate is 10 (old) Ouguiya to 1 (new) Ouguiya (10:1).
     * *
     *
     *
     * *
     * From 1 January 2018 to 30 June 2018, the old and new denominations run concurrently.
     * *
     </blockquote> *
     *
     * @see .MRO
     *
     * @see [ISO 4217 AMENDMENT NUMBER 165](https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_165.pdf)
     *
     * @since 1.23
     */
    MRU("Ouguiya", 929, 2, CountryCode.MR),

    /**
     * [Mauritius Rupee](http://en.wikipedia.org/wiki/Mauritian_rupee)
     * [numeric code = 480, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MU][CountryCode.MU]: MAURITIUS
     *
     */
    MUR("Mauritius Rupee", 480, 2, CountryCode.MU),

    /**
     * [Rufiyaa](http://en.wikipedia.org/wiki/Maldivian_rufiyaa)
     * [numeric code = 462, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MV][CountryCode.MV]: MALDIVES
     *
     */
    MVR("Rufiyaa", 462, 2, CountryCode.MV),

    /**
     * [Kwacha](http://en.wikipedia.org/wiki/Malawian_kwacha)
     * [numeric code = 454, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MW][CountryCode.MW]: MALAWI
     *
     */
    MWK("Kwacha", 454, 2, CountryCode.MW),

    /**
     * [Mexican Peso](http://en.wikipedia.org/wiki/Mexican_peso)
     * [numeric code = 484, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MX][CountryCode.MX]: MEXICO
     *
     */
    MXN("Mexican Peso", 484, 2, CountryCode.MX),

    /**
     * [Mexican Unidad de Inversion (UDI)](http://en.wikipedia.org/wiki/Mexican_Unidad_de_Inversion)
     * [numeric code = 979, minor unit = 2, fund]
     *
     *
     * Used by:
     *
     *  * [MX][CountryCode.MX]: MEXICO
     *
     */
    MXV("Mexican Unidad de Inversion (UDI)", 979, 2, CountryCode.MX) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * [Malaysian Ringgit](http://en.wikipedia.org/wiki/Malaysian_ringgit)
     * [numeric code = 458, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MY][CountryCode.MY]: MALAYSIA
     *
     */
    MYR("Malaysian Ringgit", 458, 2, CountryCode.MY),

    /**
     * [Mozambique Metical](http://en.wikipedia.org/wiki/Mozambican_metical)
     * [numeric code = 943, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [MZ][CountryCode.MZ]: MOZAMBIQUE
     *
     */
    MZN("Mozambique Metical", 943, 2, CountryCode.MZ),

    /**
     * [Namibia Dollar](http://en.wikipedia.org/wiki/Namibian_dollar)
     * [numeric code = 516, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [NA][CountryCode.NA]: NAMIBIA
     *
     */
    NAD("Namibia Dollar", 516, 2, CountryCode.NA),

    /**
     * [Naira](http://en.wikipedia.org/wiki/Nigerian_naira)
     * [numeric code = 566, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [NG][CountryCode.NG]: NIGERIA
     *
     */
    NGN("Naira", 566, 2, CountryCode.NG),

    /**
     * [Cordoba Oro](http://en.wikipedia.org/wiki/Nicaraguan_c%C3%B3rdoba)
     * [numeric code = 558, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [NI][CountryCode.NI]: NICARAGUA
     *
     */
    NIO("Cordoba Oro", 558, 2, CountryCode.NI),

    /**
     * [Norwegian Krone](http://en.wikipedia.org/wiki/Norwegian_krone)
     * [numeric code = 578, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [BV][CountryCode.BV]: BOUVET ISLAND
     *  * [NO][CountryCode.NO]: NORWAY
     *  * [SJ][CountryCode.SJ]: SVALBARD AND JAN MAYEN
     *
     */
    NOK("Norwegian Krone", 578, 2, CountryCode.BV, CountryCode.NO, CountryCode.SJ),

    /**
     * [Nepalese Rupee](http://en.wikipedia.org/wiki/Nepalese_rupee)
     * [numeric code = 524, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [NP][CountryCode.NP]: NEPAL
     *
     */
    NPR("Nepalese Rupee", 524, 2, CountryCode.NP),

    /**
     * [New Zealand Dollar](http://en.wikipedia.org/wiki/New_Zealand_dollar)
     * [numeric code = 554, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [CK][CountryCode.CK]: COOK ISLANDS
     *  * [NU][CountryCode.NU]: NIUE
     *  * [NZ][CountryCode.NZ]: NEW ZEALAND
     *  * [PN][CountryCode.PN]: PITCAIRN
     *  * [TK][CountryCode.TK]: TOKELAU
     *
     */
    NZD(
        "New Zealand Dollar", 554, 2,
        CountryCode.CK, CountryCode.NU, CountryCode.NZ, CountryCode.PN,
        CountryCode.TK
    ),

    /**
     * [Rial Omani](http://en.wikipedia.org/wiki/Omani_rial)
     * [numeric code = 512, minor unit = 3]
     *
     *
     * Used by:
     *
     *  * [OM][CountryCode.OM]: OMAN
     *
     */
    OMR("Rial Omani", 512, 3, CountryCode.OM),

    /**
     * [Balboa](http://en.wikipedia.org/wiki/Panamanian_balboa)
     * [numeric code = 590, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [PA][CountryCode.PA]: PANAMA
     *
     */
    PAB("Balboa", 590, 2, CountryCode.PA),

    /**
     * [Nuevo Sol](http://en.wikipedia.org/wiki/Peruvian_nuevo_sol)
     * [numeric code = 604, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [PE][CountryCode.PE]: PERU
     *
     */
    PEN("Nuevo Sol", 604, 2, CountryCode.PE),

    /**
     * [Kina](http://en.wikipedia.org/wiki/Papua_New_Guinean_kina)
     * [numeric code = 598, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [PG][CountryCode.PG]: PAPUA NEW GUINEA
     *
     */
    PGK("Kina", 598, 2, CountryCode.PG),

    /**
     * [Philippine Peso](http://en.wikipedia.org/wiki/Philippine_peso)
     * [numeric code = 608, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [PH][CountryCode.PH]: PHILIPPINES
     *
     */
    PHP("Philippine Peso", 608, 2, CountryCode.PH),

    /**
     * [Pakistan Rupee](http://en.wikipedia.org/wiki/Pakistani_rupee)
     * [numeric code = 586, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [PK][CountryCode.PK]: PAKISTAN
     *
     */
    PKR("Pakistan Rupee", 586, 2, CountryCode.PK),

    /**
     * [Zloty](http://en.wikipedia.org/wiki/Polish_z%C5%82oty)
     * [numeric code = 985, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [PL][CountryCode.PL]: POLAND
     *
     */
    PLN("Zloty", 985, 2, CountryCode.PL),

    /**
     * [Guarani](http://en.wikipedia.org/wiki/Paraguayan_guaran%C3%AD)
     * [numeric code = 600, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [PY][CountryCode.PY]: PARAGUAY
     *
     */
    PYG("Guarani", 600, 0, CountryCode.PY),

    /**
     * [Qatari Rial](http://en.wikipedia.org/wiki/Qatari_riyal)
     * [numeric code = 634, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [QA][CountryCode.QA]: QATAR
     *
     */
    QAR("Qatari Rial", 634, 2, CountryCode.QA),

    /**
     * [New Romanian Leu](http://en.wikipedia.org/wiki/Romanian_Leu)
     * [numeric code = 946, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [RO][CountryCode.RO]: ROMANIA
     *
     */
    RON("New Romanian Leu", 946, 2, CountryCode.RO),

    /**
     * [Serbian Dinar](http://en.wikipedia.org/wiki/Serbian_dinar)
     * [numeric code = 941, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [RS][CountryCode.RS]: SERBIA
     *
     */
    RSD("Serbian Dinar", 941, 2, CountryCode.RS),

    /**
     * [Russian Ruble](http://en.wikipedia.org/wiki/Russian_ruble)
     * [numeric code = 643, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [RU][CountryCode.RU]: RUSSIAN FEDERATION
     *
     *
     * @see .RUR
     */
    RUB("Russian Ruble", 643, 2, CountryCode.RU),

    /**
     * [Russian Ruble](http://en.wikipedia.org/wiki/Russian_ruble)
     * before the 1998 redenomination (1 [.RUB] = 1,000 [.RUR]).
     * [numeric code = 810, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [RU][CountryCode.RU]: RUSSIAN FEDERATION
     *
     *
     * @see .RUB
     *
     * @since 1.20
     */
    RUR("Russian Ruble", 810, 2, CountryCode.RU),

    /**
     * [Rwanda Franc](http://en.wikipedia.org/wiki/Rwandan_franc)
     * [numeric code = 646, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [RW][CountryCode.RW]: RWANDA
     *
     */
    RWF("Rwanda Franc", 646, 0, CountryCode.RW),

    /**
     * [Saudi Riyal](http://en.wikipedia.org/wiki/Saudi_riyal)
     * [numeric code = 682, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SA][CountryCode.SA]: SAUDI ARABIA
     *
     */
    SAR("Saudi Riyal", 682, 2, CountryCode.SA),

    /**
     * [Solomon Islands Dollar](http://en.wikipedia.org/wiki/Solomon_Islands_dollar)
     * [numeric code = 90, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SB][CountryCode.SB]: SOLOMON ISLANDS
     *
     */
    SBD("Solomon Islands Dollar", 90, 2, CountryCode.SB),

    /**
     * [Seychelles Rupee](http://en.wikipedia.org/wiki/Seychelles_rupee)
     * [numeric code = 690, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SC][CountryCode.SC]: SEYCHELLES
     *
     */
    SCR("Seychelles Rupee", 690, 2, CountryCode.SC),

    /**
     * [Sudanese Pound](http://en.wikipedia.org/wiki/Sudanese_pound)
     * [numeric code = 938, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SD][CountryCode.SD]: SUDAN
     *
     */
    SDG("Sudanese Pound", 938, 2, CountryCode.SD),

    /**
     * [Swedish Krona](http://en.wikipedia.org/wiki/Swedish_krona)
     * [numeric code = 752, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SE][CountryCode.SE]: SWEDEN
     *
     */
    SEK("Swedish Krona", 752, 2, CountryCode.SE),

    /**
     * [Singapore Dollar](http://en.wikipedia.org/wiki/Singapore_dollar)
     * [numeric code = 702, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SG][CountryCode.SG]: SINGAPORE
     *
     */
    SGD("Singapore Dollar", 702, 2, CountryCode.SG),

    /**
     * [Saint Helena Pound](http://en.wikipedia.org/wiki/Saint_Helena_pound)
     * [numeric code = 654, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SH][CountryCode.SH]: SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA
     *
     */
    SHP("Saint Helena Pound", 654, 2, CountryCode.SH),

    /**
     * [Leone](http://en.wikipedia.org/wiki/Sierra_Leonean_leone)
     * [numeric code = 694, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SL][CountryCode.SL]: SIERRA LEONE
     *
     */
    SLL("Leone", 694, 2, CountryCode.SL),

    /**
     * [Somali Shilling](http://en.wikipedia.org/wiki/Somali_shilling)
     * [numeric code = 706, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SO][CountryCode.SO]: SOMALIA
     *
     */
    SOS("Somali Shilling", 706, 2, CountryCode.SO),

    /**
     * [Surinam Dollar](http://en.wikipedia.org/wiki/Surinamese_dollar)
     * [numeric code = 968, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SR][CountryCode.SR]: SURINAME
     *
     */
    SRD("Surinam Dollar", 968, 2, CountryCode.SR),

    /**
     * [South Sudanese Pound](http://en.wikipedia.org/wiki/South_Sudanese_pound)
     * [numeric code = 728, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SS][CountryCode.SS]: SOUTH SUDAN
     *
     */
    SSP("South Sudanese Pound", 728, 2, CountryCode.SS),

    /**
     * [Dobra](http://en.wikipedia.org/wiki/S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe_dobra)
     * [numeric code = 678, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [ST][CountryCode.ST]: SAO TOME AND PRINCIPE
     *
     *
     * @see .STN
     *
     */
    STD("Dobra", 678, 2, CountryCode.ST),

    /**
     * [Dobra](http://en.wikipedia.org/wiki/S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe_dobra)
     * [numeric code = 930, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [ST][CountryCode.ST]: SAO TOME AND PRINCIPE
     *
     *
     *
     *
     * Excerpted from [ISO 4217 AMENDMENT NUMBER 164](https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_164.pdf):
     *
     *
     * <blockquote>
     *
     * *
     * The Central Bank of S. Tom and Prncipe is carrying out
     * an important Monetary Reform Project, with the entry into circulation
     * of a new family of DOBRAS. The conversion rate is 1000 (old) Dobras to
     * 1 (new) Dobra (1000:1).
     * *
     *
     *
     * *
     * From 1 January 2018 to 30 June 2018, the old and new denominations run concurrently.
     * *
     </blockquote> *
     *
     * @see .STD
     *
     * @see [ISO 4217 AMENDMENT NUMBER 164](https://www.currency-iso.org/dam/isocy/downloads/dl_currency_iso_amendment_164.pdf)
     *
     * @since 1.23
     */
    STN("Dobra", 930, 2, CountryCode.ST),

    /**
     * [El Salvador Colon](http://en.wikipedia.org/wiki/Salvadoran_col%C3%B3n)
     * [numeric code = 222, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SV][CountryCode.SV]: EL SALVADOR
     *
     */
    SVC("El Salvador Colon", 222, 2, CountryCode.SV),

    /**
     * [Syrian Pound](http://en.wikipedia.org/wiki/Syrian_pound)
     * [numeric code = 760, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SY][CountryCode.SY]: SYRIAN ARAB REPUBLIC
     *
     */
    SYP("Syrian Pound", 760, 2, CountryCode.SY),

    /**
     * [Lilangeni](http://en.wikipedia.org/wiki/Swazi_lilangeni)
     * [numeric code = 748, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [SZ][CountryCode.SZ]: ESWATINI
     *
     */
    SZL("Lilangeni", 748, 2, CountryCode.SZ),

    /**
     * [Baht](http://en.wikipedia.org/wiki/Thai_baht)
     * [numeric code = 764, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TH][CountryCode.TH]: THAILAND
     *
     */
    THB("Baht", 764, 2, CountryCode.TH),

    /**
     * [Somoni](http://en.wikipedia.org/wiki/Tajikistani_somoni)
     * [numeric code = 972, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TJ][CountryCode.TJ]: TAJIKISTAN
     *
     */
    TJS("Somoni", 972, 2, CountryCode.TJ),

    /**
     * [Turkmenistan New Manat](http://en.wikipedia.org/wiki/Turkmenistani_manat)
     * [numeric code = 934, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TM][CountryCode.TM]: TURKMENISTAN
     *
     */
    TMT("Turkmenistan New Manat", 934, 2, CountryCode.TM),

    /**
     * [Tunisian Dinar](http://en.wikipedia.org/wiki/Tunisian_dinar)
     * [numeric code = 788, minor unit = 3]
     *
     *
     * Used by:
     *
     *  * [TN][CountryCode.TN]: TUNISIA
     *
     */
    TND("Tunisian Dinar", 788, 3, CountryCode.TN),

    /**
     * [Pa&#x2bb;anga](http://en.wikipedia.org/wiki/Tongan_pa%CA%BBanga)
     * [numeric code = 776, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TO][CountryCode.TO]: TONGA
     *
     */
    TOP("Pa\u02BBanga", 776, 2, CountryCode.TO),

    /**
     * [Turkish Lira](http://en.wikipedia.org/wiki/Turkish_lira)
     * [numeric code = 949, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TR][CountryCode.TR]: TURKEY
     *
     */
    TRY("Turkish Lira", 949, 2, CountryCode.TR),

    /**
     * [Trinidad and Tobago Dollar](http://en.wikipedia.org/wiki/Trinidad_and_Tobago_dollar)
     * [numeric code = 780, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TT][CountryCode.TT]: TRINIDAD AND TOBAGO
     *
     */
    TTD("Trinidad and Tobago Dollar", 780, 2, CountryCode.TT),

    /**
     * [New Taiwan Dollar](http://en.wikipedia.org/wiki/New_Taiwan_dollar)
     * [numeric code = 901, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TW][CountryCode.TW]: TAIWAN, PROVINCE OF CHINA
     *
     */
    TWD("New Taiwan Dollar", 901, 2, CountryCode.TW),

    /**
     * [Tanzanian Shilling](http://en.wikipedia.org/wiki/Tanzanian_shilling)
     * [numeric code = 834, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [TZ][CountryCode.TZ]: TANZANIA, UNITED REPUBLIC OF
     *
     */
    TZS("Tanzanian Shilling", 834, 2, CountryCode.TZ),

    /**
     * [Hryvnia](http://en.wikipedia.org/wiki/Ukrainian_hryvnia)
     * [numeric code = 980, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [UA][CountryCode.UA]: UKRAINE
     *
     */
    UAH("Hryvnia", 980, 2, CountryCode.UA),

    /**
     * [Uganda Shilling](http://en.wikipedia.org/wiki/Ugandan_shilling)
     * [numeric code = 800, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [UG][CountryCode.UG]: UGANDA
     *
     */
    UGX("Uganda Shilling", 800, 0, CountryCode.UG),

    /**
     * [US Dollar](http://en.wikipedia.org/wiki/United_States_dollar)
     * [numeric code = 840, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AS][CountryCode.AS]: AMERICAN SAMOA
     *  * [BQ][CountryCode.BQ]: BONAIRE, SINT EUSTATIUS AND SABA
     *  * [EC][CountryCode.EC]: ECUADOR
     *  * [FM][CountryCode.FM]: MICRONESIA, FEDERATED STATES OF
     *  * [GU][CountryCode.GU]: GUAM
     *  * [HT][CountryCode.HT]: HAITI
     *  * [IO][CountryCode.IO]: BRITISH INDIAN OCEAN TERRITORY
     *  * [MH][CountryCode.MH]: MARSHALL ISLANDS
     *  * [MP][CountryCode.MP]: NORTHERN MARIANA ISLANDS
     *  * [PA][CountryCode.PA]: PANAMA
     *  * [PR][CountryCode.PR]: PUERTO RICO
     *  * [PW][CountryCode.PW]: PALAU
     *  * [SV][CountryCode.SV]: EL SALVADOR
     *  * [TC][CountryCode.TC]: TURKS AND CAICOS ISLANDS
     *  * [TL][CountryCode.TL]: TIMOR-LESTE
     *  * [UM][CountryCode.UM]: UNITED STATES MINOR OUTLYING ISLANDS
     *  * [US][CountryCode.US]: UNITED STATES
     *  * [VG][CountryCode.VG]: VIRGIN ISLANDS (BRITISH)
     *  * [VI][CountryCode.VI]: VIRGIN ISLANDS (US)
     *
     */
    USD(
        "US Dollar", 840, 2,
        CountryCode.AS, CountryCode.BQ, CountryCode.EC, CountryCode.FM,
        CountryCode.GU, CountryCode.HT, CountryCode.IO, CountryCode.MH,
        CountryCode.MP, CountryCode.PA, CountryCode.PR, CountryCode.PW,
        CountryCode.SV, CountryCode.TC, CountryCode.TL, CountryCode.UM,
        CountryCode.US, CountryCode.VG, CountryCode.VI
    ),

    /**
     * US Dollar (Next day)
     * [numeric code = 997, minor unit = 2, fund]
     *
     *
     * Used by:
     *
     *  * [US][CountryCode.US]: UNITED STATES
     *
     */
    USN("US Dollar (Next day)", 997, 2, CountryCode.US) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * US Dollar (Same day)
     * [numeric code = 998, minor unit = 2, fund]
     *
     *
     * Used by:
     *
     *  * [US][CountryCode.US]: UNITED STATES
     *
     */
    USS("US Dollar (Same day)", 998, 2, CountryCode.US) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * Uruguay Peso en Unidades Indexadas (URUIURUI)
     * [numeric code = 940, minor unit = 0, fund]
     *
     *
     * Used by:
     *
     *  * [UY][CountryCode.UY]: URUGUAY
     *
     */
    UYI("Uruguay Peso en Unidades Indexadas (URUIURUI)", 940, 0, CountryCode.UY) {
        override fun isFund(): Boolean {
            return true
        }
    },

    /**
     * [Peso Uruguayo](http://en.wikipedia.org/wiki/Uruguayan_peso)
     * [numeric code = 858, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [UY][CountryCode.UY]: URUGUAY
     *
     */
    UYU("Peso Uruguayo", 858, 2, CountryCode.UY),

    /**
     * [Uzbekistan Sum](http://en.wikipedia.org/wiki/Uzbekistan_som)
     * [numeric code = 860, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [UZ][CountryCode.UZ]: UZBEKISTAN
     *
     */
    UZS("Uzbekistan Sum", 860, 2, CountryCode.UZ),

    /**
     * [Bolivar](http://en.wikipedia.org/wiki/Venezuelan_bol%C3%ADvar)
     * [numeric code = 937, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [VE][CountryCode.VE]: VENEZUELA, BOLIVARIAN REPUBLIC OF
     *
     *
     * @see .VES
     *
     */
    VEF("Bolivar", 937, 2, CountryCode.VE),

    /**
     * [Bolivar](http://en.wikipedia.org/wiki/Venezuelan_bol%C3%ADvar)
     * [numeric code = 928, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [VE][CountryCode.VE]: VENEZUELA, BOLIVARIAN REPUBLIC OF
     *
     *
     * @see .VEF
     */
    VES("Bolivar Soberano", 928, 2, CountryCode.VE),

    /**
     * [Dong](http://en.wikipedia.org/wiki/Vietnamese_dong)
     * [numeric code = 704, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [VN][CountryCode.VN]: VIET NAM
     *
     */
    VND("Dong", 704, 0, CountryCode.VN),

    /**
     * [Vatu](http://en.wikipedia.org/wiki/Vanuatu_vatu)
     * [numeric code = 548, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [VU][CountryCode.VU]: VANUATU
     *
     */
    VUV("Vatu", 548, 0, CountryCode.VU),

    /**
     * [Tala](http://en.wikipedia.org/wiki/Samoan_tala)
     * [numeric code = 882, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [WS][CountryCode.WS]: SAMOA
     *
     */
    WST("Tala", 882, 2, CountryCode.WS),

    /**
     * [CFA Franc BEAC](http://en.wikipedia.org/wiki/Central_African_CFA_franc)
     * [numeric code = 950, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [CF][CountryCode.CF]: CENTRAL AFRICAN REPUBLIC
     *  * [CG][CountryCode.CG]: CONGO
     *  * [CM][CountryCode.CM]: CAMEROON
     *  * [GA][CountryCode.GA]: GABON
     *  * [GQ][CountryCode.GQ]: EQUATORIAL GUINEA
     *  * [TD][CountryCode.TD]: CHAD
     *
     */
    XAF(
        "CFA Franc BEAC", 950, 0,
        CountryCode.CF, CountryCode.CG, CountryCode.CM, CountryCode.GA,
        CountryCode.GQ, CountryCode.TD
    ),

    /**
     * [Silver](http://en.wikipedia.org/wiki/Silver)
     * [numeric code = 961, minor unit = -1, precious metal]
     */
    XAG("Silver", 961, -1) {
        override fun isPreciousMetal(): Boolean {
            return true
        }
    },

    /**
     * [Gold](http://en.wikipedia.org/wiki/Gold)
     * [numeric code = 959, minor unit = -1, precious metal]
     */
    XAU("Gold", 959, -1) {
        override fun isPreciousMetal(): Boolean {
            return true
        }
    },

    /**
     * [Bond Markets Unit European Composite Unit (EURCO)](http://en.wikipedia.org/wiki/European_Composite_Unit)
     * [numeric code = 955, minor unit = -1]
     */
    XBA("Bond Markets Unit European Composite Unit (EURCO)", 955, -1),

    /**
     * [Bond Markets Unit European Monetary Unit (E.M.U.-6)](http://en.wikipedia.org/wiki/European_Monetary_Unit)
     * [numeric code = 956, minor unit = -1]
     */
    XBB("Bond Markets Unit European Monetary Unit (E.M.U.-6)", 956, -1),

    /**
     * [Bond Markets Unit European Unit of Account 9 (E.U.A.-9)](http://en.wikipedia.org/wiki/European_Unit_of_Account_9)
     * [numeric code = 957, minor unit = -1]
     */
    XBC("Bond Markets Unit European Unit of Account 9 (E.U.A.-9)", 957, -1),

    /**
     * [Bond Markets Unit European Unit of Account 17 (E.U.A.-17)](http://en.wikipedia.org/wiki/European_Unit_of_Account_17)
     * [numeric code = 958, minor unit = -1]
     */
    XBD("Bond Markets Unit European Unit of Account 17 (E.U.A.-17)", 958, -1),

    /**
     * [East Caribbean Dollar](http://en.wikipedia.org/wiki/East_Caribbean_dollar)
     * [numeric code = 951, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [AG][CountryCode.AG]: ANTIGUA AND BARBUDA
     *  * [AI][CountryCode.AI]: ANGUILLA
     *  * [DM][CountryCode.DM]: DOMINICA
     *  * [GD][CountryCode.GD]: GRENADA
     *  * [KN][CountryCode.KN]: SAINT KITTS AND NEVIS
     *  * [LC][CountryCode.LC]: SAINT LUCIA
     *  * [MS][CountryCode.MS]: MONTSERRAT
     *  * [VC][CountryCode.VC]: SAINT VINCENT AND THE GRENADINES
     *
     */
    XCD(
        "East Caribbean Dollar", 951, 2,
        CountryCode.AG, CountryCode.AI, CountryCode.DM, CountryCode.GD,
        CountryCode.KN, CountryCode.LC, CountryCode.MS, CountryCode.VC
    ),

    /**
     * [SDR (Special Drawing Right)](http://en.wikipedia.org/wiki/Special_drawing_rights)
     * [numeric code = 960, minor unit = -1]
     */
    XDR("SDR (Special Drawing Right)", 960, -1),

    /**
     * [CFA Franc BCEAO](http://en.wikipedia.org/wiki/West_African_CFA_franc)
     * [numeric code = 952, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [BF][CountryCode.BF]: BURKINA FASO
     *  * [BJ][CountryCode.BJ]: BENIN
     *  * [CI][CountryCode.CI]: CTE D'IVOIRE
     *  * [GW][CountryCode.GW]: GUINEA-BISSAU
     *  * [ML][CountryCode.ML]: MALI
     *  * [NE][CountryCode.NE]: NIGER
     *  * [SN][CountryCode.SN]: SENEGAL
     *  * [TG][CountryCode.TG]: TOGO
     *
     */
    XOF(
        "CFA Franc BCEAO", 952, 0,
        CountryCode.BF, CountryCode.BJ, CountryCode.CI, CountryCode.GW,
        CountryCode.ML, CountryCode.NE, CountryCode.SN, CountryCode.TG
    ),

    /**
     * [Palladium](http://en.wikipedia.org/wiki/Palladium)
     * [numeric code = 964, minor unit = -1, precious metal]
     */
    XPD("Palladium", 964, -1) {
        override fun isPreciousMetal(): Boolean {
            return true
        }
    },

    /**
     * [CFP Franc](http://en.wikipedia.org/wiki/CFP_franc)
     * [numeric code = 953, minor unit = 0]
     *
     *
     * Used by:
     *
     *  * [NC][CountryCode.NC]: NEW CALEDONIA
     *  * [PF][CountryCode.PF]: FRENCH POLYNESIA
     *  * [WF][CountryCode.WF]: WALLIS AND FUTUNA
     *
     */
    XPF("CFP Franc", 953, 0, CountryCode.NC, CountryCode.PF, CountryCode.WF),

    /**
     * [Platinum](http://en.wikipedia.org/wiki/Platinum)
     * [numeric code = 962, minor unit = -1, precious metal]
     */
    XPT("Platinum", 962, -1) {
        override fun isPreciousMetal(): Boolean {
            return true
        }
    },

    /**
     * [Sucre](http://en.wikipedia.org/wiki/SUCRE)
     * [numeric code = 994, minor unit = -1]
     */
    XSU("Sucre", 994, -1),

    /**
     * Codes specifically reserved for testing purposes.
     * [numeric code = 963, minor unit = -1]
     */
    XTS("Codes specifically reserved for testing purposes", 963, -1),

    /**
     * ADB Unit of Account
     * [numeric code = 965, minor unit = -1]
     */
    XUA("ADB Unit of Account", 965, -1),

    /**
     * The codes assigned for transactions where no currency is involved
     * [numeric code = 999, minor unit = -1]
     */
    XXX("The codes assigned for transactions where no currency is involved", 999, -1),

    /**
     * [Yemeni Rial](http://en.wikipedia.org/wiki/Yemeni_rial)
     * [numeric code = 886, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [YE][CountryCode.YE]: YEMEN
     *
     */
    YER("Yemeni Rial", 886, 2, CountryCode.YE),

    /**
     * [Rand](http://en.wikipedia.org/wiki/South_African_rand)
     * [numeric code = 710, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [LS][CountryCode.LS]: LESOTHO
     *  * [NA][CountryCode.NA]: NAMIBIA
     *  * [ZA][CountryCode.ZA]: SOUTH AFRICA
     *
     */
    ZAR("Rand", 710, 2, CountryCode.LS, CountryCode.NA, CountryCode.ZA),

    /**
     * [Zambian Kwacha](http://en.wikipedia.org/wiki/Zambian_kwacha)
     * [numeric code = 967, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [ZM][CountryCode.ZM]: ZAMBIA
     *
     */
    ZMW("Zambian Kwacha", 967, 2, CountryCode.ZM),

    /**
     * [Zimbabwe Dollar](http://en.wikipedia.org/wiki/Zimbabwe_dollar)
     * [numeric code = 932, minor unit = 2]
     *
     *
     * Used by:
     *
     *  * [ZW][CountryCode.ZW]: ZIMBABWE
     *
     */
    ZWL("Zimbabwe Dollar", 932, 2, CountryCode.ZW);

    companion object {
        private val numericMap: MutableMap<Int, CurrencyCode> = HashMap()

        /**
         * Get a `CurrencyCode` that corresponds to the given
         * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * alpha-3 code.
         *
         *
         *
         * This method calls [getByCode][.getByCode]`(code, true)`.
         * Note that the behavior has changed since the version 1.13. In the older versions,
         * this method was an alias of `getByCode(code, false)`.
         *
         *
         * @param code [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * alpha-3 code.
         * When `"UNDEFINED"` is given, [CurrencyCode.UNDEFINED][.UNDEFINED]
         * is returned.
         * @return A `CurrencyCode` instance, or `null` if not found.
         * @see .getByCode
         */
        fun getByCode(code: String?): CurrencyCode? {
            return getByCode(code, true)
        }

        /**
         * Get a `CurrencyCode` that corresponds to the given
         * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * alpha-3 code.
         *
         *
         *
         * This method calls [getByCode][.getByCode]`(code, false)`.
         *
         *
         * @param code [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * alpha-3 code. Or `"UNDEFINED"` (case insensitive).
         * @return A `CurrencyCode` instance, or `null` if not found.
         * @see .getByCode
         * @since 1.13
         */
        fun getByCodeIgnoreCase(code: String?): CurrencyCode? {
            return getByCode(code, false)
        }

        /**
         * Get a `CurrencyCode` that corresponds to the given
         * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * alpha-3 code.
         *
         * @param code          [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * alpha-3 code.
         * Or `"UNDEFINED"` (its case sensitivity depends on the value of
         * `caseSensitive`).
         * @param caseSensitive If `true`, the given code should consist of upper-case letters only.
         * If `false`, this method internally canonicalizes the given code by
         * [String.toUpperCase] and then performs search. For example,
         * `getByCode("jpy", true)` returns `null`, but on the other hand,
         * `getByCode("jpy", false)` returns [CurrencyCode.JPY][.JPY].
         * @return A `CurrencyCode` instance, or `null` if not found.
         */
        fun getByCode(code: String?, caseSensitive: Boolean): CurrencyCode? {
            var c = code
            c = canonicalize(c, caseSensitive)
            return if (c == null) {
                null
            } else try {
                valueOf(c)
            } catch (e: IllegalArgumentException) {
                null
            }
        }

        /**
         * Get a `CurrencyCode` that corresponds to the given
         * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * numeric code.
         *
         * @param code [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
         * numeric code.
         * @return A `CurrencyCode` instance, or `null` if not found.
         * If 0 or a negative value is given, `null` is returned.
         */
        fun getByCode(code: Int): CurrencyCode? {
            return if (code <= 0) {
                null
            } else numericMap[code]
        }

        private fun canonicalize(code: String?, caseSensitive: Boolean): String? {
            if (code == null || code.isEmpty()) {
                return null
            }
            return if (caseSensitive) {
                code
            } else {
                code.uppercase()
            }
        }

        /**
         * Get a list of `CurrencyCode` instances whose country
         * list contains the specified country.
         *
         *
         *
         * This method is an alias of [ getByCountry][.getByCountry]`(country, true)`.
         * Note that the behavior has changed since the version 1.13.
         * In the older versions, this method was an alias of `getByCountry(code, false)`.
         *
         *
         * @param country Country code. ISO 3166-1 alpha-2 or alpha-3.
         * @return List of `CurrencyCode` instances. If there is no
         * `CurrencyCode` instance whose country list contains
         * the specified country, the size of the returned list is zero.
         */
        fun getByCountry(country: String?): List<CurrencyCode> {
            return getByCountry(country, true)
        }

        /**
         * Get a list of `CurrencyCode` instances whose country
         * list contains the specified country.
         *
         *
         *
         * This method is an alias of [ getByCountry][.getByCountry]`(country, false)`.
         *
         *
         * @param country Country code. ISO 3166-1 alpha-2 or alpha-3.
         * @return List of `CurrencyCode` instances. If there is no
         * `CurrencyCode` instance whose country list contains
         * the specified country, the size of the returned list is zero.
         * @since 1.13
         */
        fun getByCountryIgnoreCase(country: String?): List<CurrencyCode> {
            return getByCountry(country, false)
        }

        /**
         * Get a list of `CurrencyCode` instances whose country
         * list contains the specified country.
         *
         *
         *
         * This method is an alias of [ getByCountry][.getByCountry]`(`[CountryCode]`.`[ ][CountryCode.getByCode]`(country, caseSensitive))`.
         *
         *
         * @param country       Country code. ISO 3166-1 alpha-2 or alpha-3.
         * @param caseSensitive If `true`, the given code should consist of uppercase
         * letters only. If `false`, case is ignored.
         * @return List of `CurrencyCode` instances. If there is no
         * `CurrencyCode` instance whose country list contains
         * the specified country, the size of the returned list is zero.
         */
        fun getByCountry(country: String?, caseSensitive: Boolean): List<CurrencyCode> {
            return getByCountry(CountryCode.Companion.getByCode(country, caseSensitive))
        }

        /**
         * Get a list of `CurrencyCode` instances whose country list
         * contains the specified country.
         *
         * @param country `CountryCode` instance that represents a country.
         * @return List of `CurrencyCode` instances. If there is no
         * `CurrencyCode` instance whose country list contains
         * the specified country, the size of the returned list is zero.
         */
        fun getByCountry(country: CountryCode?): List<CurrencyCode> {
            val list: MutableList<CurrencyCode> = ArrayList()
            if (country == null) {
                return list
            }
            for (currency in values()) {
                for (cc in currency.countryList) {
                    if (cc === country) {
                        list.add(currency)
                    }
                }
            }
            return list
        }

        /**
         * Get a list of `CurrencyCode` by a name regular expression.
         *
         *
         *
         * This method is almost equivalent to [ findByName][.findByName]`(Pattern.compile(regex))`.
         *
         *
         * @param regex Regular expression for names.
         * @return List of `CurrencyCode`. If nothing has matched,
         * an empty list is returned.
         * @throws IllegalArgumentException               `regex` is `null`.
         * @throws java.util.regex.PatternSyntaxException `regex` failed to be compiled.
         * @since 1.11
         */
        fun findByValue(regex: String?): List<CurrencyCode> {
            requireNotNull(regex) { "regex is null." }

            // Compile the regular expression. This may throw
            // java.util.regex.PatternSyntaxException.
            val pattern = Pattern.compile(regex)
            return findByValue(pattern)
        }

        /**
         * Get a list of `CurrencyCode` by a name pattern.
         *
         *
         *
         * For example, the list obtained by the code snippet below:
         *
         *
         * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
         * Pattern pattern = Pattern.compile(<span style="color: darkred;">".*Ruble"</span>);
         * List&lt;CurrencyCode&gt; list = CurrencyCode.findByName(pattern);</pre>
         *
         *
         *
         * contains 4 `CurrencyCode`s as listed below.
         *
         *
         *
         *  1. [.BYN] : Belarusian Ruble
         *  1. [.BYR] : Belarusian Ruble
         *  1. [.RUB] : Russian Ruble
         *  1. [.RUR] : Russian Ruble
         *
         *
         * @param pattern Pattern to match names.
         * @return List of `CurrencyCde`. If nothing has matched,
         * an empty list is returned.
         * @throws IllegalArgumentException `pattern` is `null`.
         * @since 1.11
         */
        fun findByValue(pattern: Pattern?): List<CurrencyCode> {
            requireNotNull(pattern) { "pattern is null." }
            val list: MutableList<CurrencyCode> = ArrayList()
            for (entry in values()) {
                // If the name matches the given pattern.
                if (pattern.matcher(entry.value).matches()) {
                    list.add(entry)
                }
            }
            return list
        }

        init {
            for (cc in values()) {
                numericMap[cc.numeric] = cc
            }
        }
    }

    /**
     * Get the list of countries using this currency.
     *
     * @return The list of countries using this currency.
     */
    val countryList: List<CountryCode>

    /**
     * Check if this currency code represents a fund.
     *
     *
     *
     * `CurrencyCode` instances listed below return `true`.
     *
     *
     *
     *  * [.BOV] Mvdol
     *  * [.CHE] WIR EUro
     *  * [.CHW] WIR Franc
     *  * [.CLF] Unidad de Fomento
     *  * [.COU] Unidad de Valor Real
     *  * [.MXV] Mexican Unidad de Inversion (UDI)
     *  * [.USN] US Dollar (Next day)
     *  * [.USS] US Dollar (Same day)
     *  * [.UYI] Uruguay Peso en Unidades
     *
     *
     * @return True if this currency code represents a fund.
     */
    open fun isFund(): Boolean {
        return false
    }

    /**
     * Check if this currency code represents a precious metal.
     *
     *
     *
     * `CurrencyCode` instances listed below return `true`.
     *
     *
     *
     *  * [.XAG] Silver
     *  * [.XAU] Gold
     *  * [.XPD] Palladium
     *  * [.XPT] Platinum
     *
     *
     * @return True if this currency code represents a precious metal.
     */
    open fun isPreciousMetal(): Boolean {
        return false
    }

    // Currency.getInstance(String) throws IllegalArgumentException
    // when the given ISO 4217 code is not supported.
    /**
     * Get the [Currency] instance that corresponds to
     * this currency code.
     *
     *
     *
     * This method is an alias of [Currency]`.`[ ][Currency.getInstance]`(this.name())`.
     * The only difference is that this method returns `null`
     * when `Currency.getInstance(String)` throws `IllegalArgumentException`.
     *
     *
     * @return A [Currency] instance, or `null` if this
     * ISO 4217 code is not supported by the implementation
     * of [Currency.getInstance].
     * @see Currency.getInstance
     */
    val currency: Currency?
        get() = try {
            Currency.getInstance(name)
        } catch (e: IllegalArgumentException) {
            // Currency.getInstance(String) throws IllegalArgumentException
            // when the given ISO 4217 code is not supported.
            null
        }

    init {
        countryList = countries.toList()
    }
}
