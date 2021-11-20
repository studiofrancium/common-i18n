/*
 * Copyright (C) 2012-2015 Neo Visionaries Inc.
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

import java.util.regex.Pattern

/**
 * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
 * language code (3-letter lowercase code).
 *
 *
 *
 * Most languages have just one ISO 639-2 code, but there are some languages
 * that have 2 codes, ISO 639-2/T code ("terminological" code) and ISO 639-2/B
 * code ("bibliographic" code). The table below lists up langueses having two
 * ISO 639-2 codes.
 *
 *
 * <table border="1" style="border-collapse: collapse" cellpadding="5">
 * <tr bgcolor="orange">
 * <th>ISO 639-1</th>
 * <th>ISO 639-2/T</th>
 * <th>ISO 639-2/B</th>
 * <th>Language</th>
</tr> *
 * <tr>
 * <td>[bo][LanguageCode.bo]</td>
 * <td>[bod][LanguageAlpha3Code.bod]</td>
 * <td>[tib][LanguageAlpha3Code.tib]</td>
 * <td>[Tibetan](http://en.wikipedia.org/wiki/Standard_Tibetan)</td>
</tr> *
 * <tr>
 * <td>[eu][LanguageCode.eu]</td>
 * <td>[eus][LanguageAlpha3Code.eus]</td>
 * <td>[baq][LanguageAlpha3Code.baq]</td>
 * <td>[Basque](http://en.wikipedia.org/wiki/Basque_language)</td>
</tr> *
 * <tr>
 * <td>[cs][LanguageCode.cs]</td>
 * <td>[ces][LanguageAlpha3Code.ces]</td>
 * <td>[cze][LanguageAlpha3Code.cze]</td>
 * <td>[Czech](http://en.wikipedia.org/wiki/Czech_language)</td>
</tr> *
 * <tr>
 * <td>[cy][LanguageCode.cy]</td>
 * <td>[cym][LanguageAlpha3Code.cym]</td>
 * <td>[wel][LanguageAlpha3Code.wel]</td>
 * <td>[Welsh](http://en.wikipedia.org/wiki/Welsh_language)</td>
</tr> *
 * <tr>
 * <td>[de][LanguageCode.de]</td>
 * <td>[deu][LanguageAlpha3Code.deu]</td>
 * <td>[ger][LanguageAlpha3Code.ger]</td>
 * <td>[German](http://en.wikipedia.org/wiki/German_language)</td>
</tr> *
 * <tr>
 * <td>[el][LanguageCode.el]</td>
 * <td>[ell][LanguageAlpha3Code.ell]</td>
 * <td>[gre][LanguageAlpha3Code.gre]</td>
 * <td>[Greek](http://en.wikipedia.org/wiki/Greek_language)</td>
</tr> *
 * <tr>
 * <td>[fa][LanguageCode.fa]</td>
 * <td>[fas][LanguageAlpha3Code.fas]</td>
 * <td>[per][LanguageAlpha3Code.per]</td>
 * <td>[Persian](http://en.wikipedia.org/wiki/Persian_language)</td>
</tr> *
 * <tr>
 * <td>[fr][LanguageCode.fr]</td>
 * <td>[fra][LanguageAlpha3Code.fra]</td>
 * <td>[fre][LanguageAlpha3Code.fre]</td>
 * <td>[French](http://en.wikipedia.org/wiki/French_language)</td>
</tr> *
 * <tr>
 * <td>[hy][LanguageCode.hy]</td>
 * <td>[hye][LanguageAlpha3Code.hye]</td>
 * <td>[arm][LanguageAlpha3Code.arm]</td>
 * <td>[Armenian](http://en.wikipedia.org/wiki/Armenian_language)</td>
</tr> *
 * <tr>
 * <td>[is][LanguageCode. is]</td>
 * <td>[isl][LanguageAlpha3Code.isl]</td>
 * <td>[ice][LanguageAlpha3Code.ice]</td>
 * <td>[Icelandic](http://en.wikipedia.org/wiki/Icelandic_language)</td>
</tr> *
 * <tr>
 * <td>[ka][LanguageCode.ka]</td>
 * <td>[kat][LanguageAlpha3Code.kat]</td>
 * <td>[geo][LanguageAlpha3Code.geo]</td>
 * <td>[Georgian](http://en.wikipedia.org/wiki/Georgian_language)</td>
</tr> *
 * <tr>
 * <td>[mi][LanguageCode.mi]</td>
 * <td>[mri][LanguageAlpha3Code.mri]</td>
 * <td>[mao][LanguageAlpha3Code.mao]</td>
 * <td>[M&#257;ori](http://en.wikipedia.org/wiki/M%C4%81ori_language)
</td> *
</tr> *
 * <tr>
 * <td>[mk][LanguageCode.mk]</td>
 * <td>[mkd][LanguageAlpha3Code.mkd]</td>
 * <td>[mac][LanguageAlpha3Code.mac]</td>
 * <td>[Macedonian](http://en.wikipedia.org/wiki/Macedonian_language)
</td> *
</tr> *
 * <tr>
 * <td>[ms][LanguageCode.ms]</td>
 * <td>[msa][LanguageAlpha3Code.msa]</td>
 * <td>[may][LanguageAlpha3Code.may]</td>
 * <td>[Malay](http://en.wikipedia.org/wiki/Malay_language)</td>
</tr> *
 * <tr>
 * <td>[my][LanguageCode.my]</td>
 * <td>[mya][LanguageAlpha3Code.mya]</td>
 * <td>[bur][LanguageAlpha3Code.bur]</td>
 * <td>[Burmese](http://en.wikipedia.org/wiki/Burmese_language)</td>
</tr> *
 * <tr>
 * <td>[nl][LanguageCode.nl]</td>
 * <td>[nld][LanguageAlpha3Code.nld]</td>
 * <td>[dut][LanguageAlpha3Code.dut]</td>
 * <td>[Dutch](http://en.wikipedia.org/wiki/Dutch_language)</td>
</tr> *
 * <tr>
 * <td>[ro][LanguageCode.ro]</td>
 * <td>[ron][LanguageAlpha3Code.ron]</td>
 * <td>[rum][LanguageAlpha3Code.rum]</td>
 * <td>[Romanian](http://en.wikipedia.org/wiki/Romanian_language)</td>
</tr> *
 * <tr>
 * <td>[sk][LanguageCode.sk]</td>
 * <td>[slk][LanguageAlpha3Code.slk]</td>
 * <td>[slo][LanguageAlpha3Code.slo]</td>
 * <td>[Slovak](http://en.wikipedia.org/wiki/Slovak_language)</td>
</tr> *
 * <tr>
 * <td>[sq][LanguageCode.sq]</td>
 * <td>[sqi][LanguageAlpha3Code.sqi]</td>
 * <td>[alb][LanguageAlpha3Code.alb]</td>
 * <td>[Albanian](http://en.wikipedia.org/wiki/Albanian_language)</td>
</tr> *
</table> *
 *
 *
 *
 * ISO 639-2 code for [Newari](http://en.wikipedia.org/wiki/Newari_language) is `new`, but in this enum, the corresponding entry
 * is not `new` but [.New] (the first letter is capital),
 * because `new` is a special word for Java programming language.
 *
 *
 * @author Takahiko Kawasaki
 * @since 1.1
 */
enum class LanguageAlpha3Code(
    /**
     * Language name value.
     */
    val value: String
) {
    /**
     * Undefined.
     *
     *
     *
     * This is not an official ISO 639-2 code.
     *
     *
     * @see .und und: Undetermined
     *
     * @see .zxx zxx: No linguistic content
     *
     * @since 1.14
     */
    undefined("Undefined") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.undefined
        }
    },

    /**
     * [Afar](http://en.wikipedia.org/wiki/Afar_language)
     * ([aa][LanguageCode.aa]).
     */
    aar("Afar") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.aa
        }
    },

    /**
     * [Austro-Asiatic languages](http://en.wikipedia.org/wiki/Austro-Asiatic_languages)
     *
     * @since 1.10
     */
    aav("Austro-Asiatic languages"),

    /**
     * [Abkhaz](http://en.wikipedia.org/wiki/Abkhaz_language)
     * ([ab][LanguageCode.ab]).
     */
    abk("Abkhaz") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ab
        }
    },

    /**
     * [Achinese](http://en.wikipedia.org/wiki/Achinese_language)
     *
     * @since 1.10
     */
    ace("Achinese"),

    /**
     * [Acoli](http://en.wikipedia.org/wiki/Acoli_language)
     *
     * @since 1.10
     */
    ach("Acoli"),

    /**
     * [Adangme](http://en.wikipedia.org/wiki/Adangme_language)
     *
     * @since 1.10
     */
    ada("Adangme"),

    /**
     * [Adyghe](http://en.wikipedia.org/wiki/Adyghe_language)
     *
     * @since 1.10
     */
    ady("Adyghe"),

    /**
     * [Afro-Asiatic languages](http://en.wikipedia.org/wiki/Afro-Asiatic_languages)
     *
     * @since 1.10
     */
    afa("Afro-Asiatic languages"),

    /**
     * [Afrihili](http://en.wikipedia.org/wiki/Afrihili_language)
     *
     * @since 1.10
     */
    afh("Afrihili"),

    /**
     * [Afrikaans](http://en.wikipedia.org/wiki/Afrikaans_language)
     * ([af][LanguageCode.af]).
     */
    afr("Afrikaans") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.af
        }
    },

    /**
     * [Ainu (Japan)](http://en.wikipedia.org/wiki/Ainu_language_(Japan))
     *
     * @since 1.10
     */
    ain("Ainu (Japan)"),

    /**
     * [Akan](http://en.wikipedia.org/wiki/Akan_language)
     * ([ak][LanguageCode.ak]).
     */
    aka("Akan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ak
        }
    },

    /**
     * [Akkadian](http://en.wikipedia.org/wiki/Akkadian_language)
     *
     * @since 1.10
     */
    akk("Akkadian"),

    /**
     * [Albanian](http://en.wikipedia.org/wiki/Albanian_language)
     * ([sq][LanguageCode.sq]) for bibliographic applications.
     *
     * @see .sqi
     */
    alb("Albanian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sq
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return sqi
        }
    },

    /**
     * [Aleut](http://en.wikipedia.org/wiki/Aleut_language)
     *
     * @since 1.10
     */
    ale("Aleut"),

    /**
     * [Algonquian languages](http://en.wikipedia.org/wiki/Algonquian_languages)
     *
     * @since 1.10
     */
    alg("Algonquian languages"),

    /**
     * [Southern Altai](http://en.wikipedia.org/wiki/Southern_Altai_language)
     *
     * @since 1.10
     */
    alt("Southern Altai"),

    /**
     * [Atlantic-Congo languages<a></a>
 *
 * @since 1.10
](http://en.wikipedia.org/wiki/Atlantic-Congo_languages) */
    alv("Atlantic-Congo languages"),

    /**
     * [Amharic](http://en.wikipedia.org/wiki/Amharic_language)
     * ([am][LanguageCode.am]).
     */
    amh("Amharic") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.am
        }
    },

    /**
     * [Old English](http://en.wikipedia.org/wiki/Old_English_language) (ca&#0046; 450-1100)
     *
     * @since 1.10
     */
    ang("Old English"),

    /**
     * [Angika](http://en.wikipedia.org/wiki/Angika_language)
     *
     * @since 1.10
     */
    anp("Angika"),

    /**
     * [Apache languages](http://en.wikipedia.org/wiki/Apache_languages)
     *
     * @since 1.10
     */
    apa("Apache languages"),

    /**
     * [Alacalufan languages](http://en.wikipedia.org/wiki/Alacalufan_languages)
     *
     * @since 1.10
     */
    aqa("Alacalufan languages"),

    /**
     * [Algic languages](http://en.wikipedia.org/wiki/Algic_languages)
     *
     * @since 1.10
     */
    aql("Algic languages"),

    /**
     * [Arabic](http://en.wikipedia.org/wiki/Arabic_language)
     * ([ar][LanguageCode.ar]).
     */
    ara("Arabic") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ar
        }
    },

    /**
     * [Official Aramaic](http://en.wikipedia.org/wiki/Official_Aramaic_language) (700-300 BCE)
     *
     * @since 1.10
     */
    arc("Official Aramaic"),

    /**
     * [Aragonese](http://en.wikipedia.org/wiki/Aragonese_language)
     * ([an][LanguageCode.an]).
     */
    arg("Aragonese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.an
        }
    },

    /**
     * [Armenian](http://en.wikipedia.org/wiki/Armenian_language)
     * ([hy][LanguageCode.hy]) for bibliographic applications.
     *
     * @see .hye
     */
    arm("Armenian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.hy
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return hye
        }
    },

    /**
     * [Mapudungun](http://en.wikipedia.org/wiki/Mapudungun_language)
     *
     * @since 1.10
     */
    arn("Mapudungun"),

    /**
     * [Arapaho](http://en.wikipedia.org/wiki/Arapaho_language)
     *
     * @since 1.10
     */
    arp("Arapaho"),

    /**
     * [Artificial languages](http://en.wikipedia.org/wiki/Artificial_languages)
     *
     * @since 1.10
     */
    art("Artificial languages"),

    /**
     * [Arawak](http://en.wikipedia.org/wiki/Arawak_language)
     *
     * @since 1.10
     */
    arw("Arawak"),

    /**
     * [Assamese](http://en.wikipedia.org/wiki/Assamese_language)
     * ([as][LanguageCode. as]).
     */
    asm("Assamese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.`as`
        }
    },

    /**
     * [Asturian](http://en.wikipedia.org/wiki/Asturian_language)
     *
     * @since 1.10
     */
    ast("Asturian"),

    /**
     * [Athapascan languages](http://en.wikipedia.org/wiki/Athapascan_languages)
     *
     * @since 1.10
     */
    ath("Athapascan languages"),

    /**
     * [Arauan languages](http://en.wikipedia.org/wiki/Arauan_languages)
     *
     * @since 1.10
     */
    auf("Arauan languages"),

    /**
     * [Australian languages](http://en.wikipedia.org/wiki/Australian_languages)
     *
     * @since 1.10
     */
    aus("Australian languages"),

    /**
     * [Avaric](http://en.wikipedia.org/wiki/Avar_language)
     * ([av][LanguageCode.av]).
     */
    ava("Avaric") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.av
        }
    },

    /**
     * [Avestan](http://en.wikipedia.org/wiki/Avestan_language)
     * ([ae][LanguageCode.ae]).
     */
    ave("Avestan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ae
        }
    },

    /**
     * [Awadhi](http://en.wikipedia.org/wiki/Awadhi_language)
     *
     * @since 1.10
     */
    awa("Awadhi"),

    /**
     * [Arawakan languages](http://en.wikipedia.org/wiki/Arawakan_languages)
     *
     * @since 1.10
     */
    awd("Arawakan languages"),

    /**
     * [Aymara](http://en.wikipedia.org/wiki/Aymara_language)
     * ([ay][LanguageCode.ay]).
     */
    aym("Aymara") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ay
        }
    },

    /**
     * [Uto-Aztecan languages](http://en.wikipedia.org/wiki/Uto-Aztecan_languages)
     *
     * @since 1.10
     */
    azc("Uto-Aztecan languages"),

    /**
     * [Azerbaijani](http://en.wikipedia.org/wiki/Azerbaijani_language)
     * ([az][LanguageCode.az]).
     */
    aze("Azerbaijani") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.az
        }
    },

    /**
     * [Banda languages](http://en.wikipedia.org/wiki/Banda_languages)
     *
     * @since 1.10
     */
    bad("Banda languages"),

    /**
     * [Bamileke languages](http://en.wikipedia.org/wiki/Bamileke_languages)
     *
     * @since 1.10
     */
    bai("Bamileke languages"),

    /**
     * [Bashkir](http://en.wikipedia.org/wiki/Bashkir_language)
     * ([ba][LanguageCode.ba]).
     */
    bak("Bashkir") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ba
        }
    },

    /**
     * [Baluchi](http://en.wikipedia.org/wiki/Baluchi_language)
     */
    bal("Baluchi"),

    /**
     * [Bambara](http://en.wikipedia.org/wiki/Bambara_language)
     * ([bm][LanguageCode.bm]).
     */
    bam("Bambara") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bm
        }
    },

    /**
     * [Balinese](http://en.wikipedia.org/wiki/Balinese_language)
     *
     * @since 1.10
     */
    ban("Balinese"),

    /**
     * [Basque](http://en.wikipedia.org/wiki/Basque_language)
     * ([eu][LanguageCode.eu]) for bibliographic applications.
     *
     * @see .eus
     */
    baq("Basque") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.eu
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return eus
        }
    },

    /**
     * [Basa (Cameroon)](http://en.wikipedia.org/wiki/Basa_language_(Cameroon))
     *
     * @since 1.10
     */
    bas("Basa (Cameroon)"),

    /**
     * [Baltic languages](http://en.wikipedia.org/wiki/Baltic_languages)
     *
     * @since 1.10
     */
    bat("Baltic languages"),

    /**
     * [Beja](http://en.wikipedia.org/wiki/Beja_language)
     *
     * @since 1.10
     */
    bej("Beja"),

    /**
     * [Belarusian](http://en.wikipedia.org/wiki/Belarusian_language)
     * ([be][LanguageCode.be]).
     */
    bel("Belarusian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.be
        }
    },

    /**
     * [Bemba (Zambia)](http://en.wikipedia.org/wiki/Bemba_language_(Zambia))
     *
     * @since 1.10
     */
    bem("Bemba (Zambia)"),

    /**
     * [Bengali](http://en.wikipedia.org/wiki/Bengali_language)
     * ([bn][LanguageCode.bn]).
     */
    ben("Bengali") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bn
        }
    },

    /**
     * [Berber languages](http://en.wikipedia.org/wiki/Berber_languages)
     *
     * @since 1.10
     */
    ber("Berber languages"),

    /**
     * [Bhojpuri](http://en.wikipedia.org/wiki/Bhojpuri_language)
     *
     * @since 1.10
     */
    bho("Bhojpuri"),

    /**
     * [Bihari](http://en.wikipedia.org/wiki/Bihari_languages)
     * ([bh][LanguageCode.bh]).
     */
    bih("Bihari languages") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bh
        }
    },

    /**
     * [Bikol](http://en.wikipedia.org/wiki/Bikol_language)
     *
     * @since 1.10
     */
    bik("Bikol"),

    /**
     * [Bini](http://en.wikipedia.org/wiki/Bini_language)
     *
     * @since 1.10
     */
    bin("Bini"),

    /**
     * [Bislama](http://en.wikipedia.org/wiki/Bislama_language)
     * ([bi][LanguageCode.bi]).
     */
    bis("Bislama") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bi
        }
    },

    /**
     * [Siksika](http://en.wikipedia.org/wiki/Siksika_language)
     *
     * @since 1.10
     */
    bla("Siksika"),

    /**
     * [Bantu languages](http://en.wikipedia.org/wiki/Bantu_languages)
     *
     * @since 1.10
     */
    bnt("Bantu languages"),

    /**
     * [Tibetan](http://en.wikipedia.org/wiki/Standard_Tibetan)
     * ([bo][LanguageCode.bo]) for terminology applications.
     *
     * @see .tib
     */
    bod("Tibetan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bo
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return tib
        }
    },

    /**
     * [Bosnian](http://en.wikipedia.org/wiki/Bosnian_language)
     * ([bs][LanguageCode.bs]).
     */
    bos("Bosnian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bs
        }
    },

    /**
     * [Braj](http://en.wikipedia.org/wiki/Braj_language)
     *
     * @since 1.10
     */
    bra("Braj"),

    /**
     * [Breton](http://en.wikipedia.org/wiki/Breton_language)
     * ([br][LanguageCode.br]).
     */
    bre("Breton") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.br
        }
    },

    /**
     * [Batak languages](http://en.wikipedia.org/wiki/Batak_languages)
     *
     * @since 1.10
     */
    btk("Batak languages"),

    /**
     * [Buriat](http://en.wikipedia.org/wiki/Buriat_language)
     *
     * @since 1.10
     */
    bua("Buriat"),

    /**
     * [Buginese](http://en.wikipedia.org/wiki/Buginese_language)
     *
     * @since 1.10
     */
    bug("Buginese"),

    /**
     * [Bulgarian](http://en.wikipedia.org/wiki/Bulgarian_language)
     * ([bg][LanguageCode.bg]).
     */
    bul("Bulgarian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bg
        }
    },

    /**
     * [Burmese](http://en.wikipedia.org/wiki/Burmese_language)
     * ([my][LanguageCode.my]) for bibliographic applications.
     *
     * @see .mya
     */
    bur("Burmese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.my
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return mya
        }
    },

    /**
     * [Bilin](http://en.wikipedia.org/wiki/Bilin_language)
     *
     * @since 1.10
     */
    byn("Bilin"),

    /**
     * [Caddo](http://en.wikipedia.org/wiki/Caddo_language)
     *
     * @since 1.10
     */
    cad("Caddo"),

    /**
     * [Central American Indian languages](http://en.wikipedia.org/wiki/Central_American_Indian_languages)
     *
     * @since 1.10
     */
    cai("Central American Indian languages"),

    /**
     * [Galibi Carib](http://en.wikipedia.org/wiki/Galibi_Carib_language)
     *
     * @since 1.10
     */
    car("Galibi Carib"),

    /**
     * [Catalan](http://en.wikipedia.org/wiki/Catalan_language)
     * ([ca][LanguageCode.ca]).
     */
    cat("Catalan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ca
        }
    },

    /**
     * [Caucasian languages](http://en.wikipedia.org/wiki/Caucasian_languages)
     *
     * @since 1.10
     */
    cau("Caucasian languages"),

    /**
     * [Chibchan languages](http://en.wikipedia.org/wiki/Chibchan_languages)
     *
     * @since 1.10
     */
    cba("Chibchan languages"),

    /**
     * [North Caucasian languages](http://en.wikipedia.org/wiki/North_Caucasian_languages)
     *
     * @since 1.10
     */
    ccn("North Caucasian languages"),

    /**
     * [South Caucasian languages](http://en.wikipedia.org/wiki/South_Caucasian_languages)
     *
     * @since 1.10
     */
    ccs("South Caucasian languages"),

    /**
     * [Chadic languages](http://en.wikipedia.org/wiki/Chadic_languages)
     *
     * @since 1.10
     */
    cdc("Chadic languages"),

    /**
     * [Caddoan languages](http://en.wikipedia.org/wiki/Caddoan_languages)
     *
     * @since 1.10
     */
    cdd("Caddoan languages"),

    /**
     * [Cebuano](http://en.wikipedia.org/wiki/Cebuano_language)
     *
     * @since 1.10
     */
    ceb("Cebuano"),

    /**
     * [Celtic languages](http://en.wikipedia.org/wiki/Celtic_languages)
     *
     * @since 1.10
     */
    cel("Celtic languages"),

    /**
     * [Czech](http://en.wikipedia.org/wiki/Czech_language)
     * ([cs][LanguageCode.cs]) for terminology applications.
     *
     * @see .cze
     */
    ces("Czech") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.cs
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return cze
        }
    },

    /**
     * [Chamorro](http://en.wikipedia.org/wiki/Chamorro_language)
     * ([ch][LanguageCode.ch]).
     */
    cha("Chamorro") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ch
        }
    },

    /**
     * [Chibcha](http://en.wikipedia.org/wiki/Chibcha_language)
     *
     * @since 1.10
     */
    chb("Chibcha"),

    /**
     * [Chechen](http://en.wikipedia.org/wiki/Chechen_language)
     * ([ce][LanguageCode.ce]).
     */
    che("Chechen") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ce
        }
    },

    /**
     * [Chagatai](http://en.wikipedia.org/wiki/Chagatai_language)
     *
     * @since 1.10
     */
    chg("Chagatai"),

    /**
     * [Chinese](http://en.wikipedia.org/wiki/Chinese_language)
     * ([zh][LanguageCode.zh]) for bibliographic applications.
     *
     * @see .zho
     */
    chi("Chinese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.zh
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return zho
        }
    },

    /**
     * [Chuukese](http://en.wikipedia.org/wiki/Chuukese_language)
     *
     * @since 1.10
     */
    chk("Chuukese"),

    /**
     * [Mari (Russia)](http://en.wikipedia.org/wiki/Mari_language_(Russia))
     *
     * @since 1.10
     */
    chm("Mari (Russia)"),

    /**
     * [Chinook jargon](http://en.wikipedia.org/wiki/Chinook_jargon_language)
     *
     * @since 1.10
     */
    chn("Chinook jargon"),

    /**
     * [Choctaw](http://en.wikipedia.org/wiki/Choctaw_language)
     *
     * @since 1.10
     */
    cho("Choctaw"),

    /**
     * [Chipewyan](http://en.wikipedia.org/wiki/Chipewyan_language)
     *
     * @since 1.10
     */
    chp("Chipewyan"),

    /**
     * [Cherokee](http://en.wikipedia.org/wiki/Cherokee_language)
     *
     * @since 1.10
     */
    chr("Cherokee"),

    /**
     * [Church
 * Slavonic](http://en.wikipedia.org/wiki/Old_Church_Slavonic)
     * ([cu][LanguageCode.cu]).
     */
    chu("Church Slavic") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.cu
        }
    },

    /**
     * [Chuvash](http://en.wikipedia.org/wiki/Chuvash_language)
     * ([cv][LanguageCode.cv]).
     */
    chv("Chuvash") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.cv
        }
    },

    /**
     * [Cheyenne](http://en.wikipedia.org/wiki/Cheyenne_language)
     *
     * @since 1.10
     */
    chy("Cheyenne"),

    /**
     * [Chamic languages](http://en.wikipedia.org/wiki/Chamic_languages)
     *
     * @since 1.10
     */
    cmc("Chamic languages"),

    /**
     * [Coptic](http://en.wikipedia.org/wiki/Coptic_language)
     *
     * @since 1.1.0
     */
    cop("Coptic"),

    /**
     * [Cornish](http://en.wikipedia.org/wiki/Cornish_language)
     * ([kw][LanguageCode.kw]).
     */
    cor("Comish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kw
        }
    },

    /**
     * [Corsican](http://en.wikipedia.org/wiki/Corsican_language)
     * ([co][LanguageCode.co]).
     */
    cos("Corsican") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.co
        }
    },

    /**
     * [English based Creoles](http://en.wikipedia.org/wiki/English_based_Creoles) and
     * [pidgins](http://en.wikipedia.org/wiki/English_based_pidgins)
     *
     * @since 1.10
     */
    cpe("English based Creoles and pidgins"),

    /**
     * [French-Based Creoles](http://en.wikipedia.org/wiki/French-Based_Creoles) and
     * [pidgins](http://en.wikipedia.org/wiki/French-Based_pidgins)
     *
     * @since 1.10
     */
    cpf("French-Based Creoles and pidgins"),

    /**
     * [Portuguese-Based Creoles](http://en.wikipedia.org/wiki/Portuguese-Based_Creoles) and
     * [pidgins](http://en.wikipedia.org/wiki/Portuguese-Based_pidgins)
     *
     * @since 1.10
     */
    cpp("Portuguese-Based Creoles and pidgins"),

    /**
     * [Cree](http://en.wikipedia.org/wiki/Cree_language)
     * ([cr][LanguageCode.cr]).
     */
    cre("Cree") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.cr
        }
    },

    /**
     * [Crimean Tatar](http://en.wikipedia.org/wiki/Crimean_Tatar_language)
     *
     * @since 1.10
     */
    crh("Crimean Tatar"),

    /**
     * [Creoles](http://en.wikipedia.org/wiki/Creole_language) and
     * [pidgins](http://en.wikipedia.org/wiki/Pidgin_language)
     *
     * @since 1.10
     */
    crp("Creoles and pidgins"),

    /**
     * [Kashubian](http://en.wikipedia.org/wiki/Kashubian_language)
     *
     * @since 1.10
     */
    csb("Kashubian"),

    /**
     * [Central Sudanic languages](http://en.wikipedia.org/wiki/Central_Sudanic_languages)
     *
     * @since 1.10
     */
    csu("Central Sudanic languages"),

    /**
     * [Cushitic languages](http://en.wikipedia.org/wiki/Cushitic_languages)
     *
     * @since 1.10
     */
    cus("Cushitic languages"),

    /**
     * [Welsh](http://en.wikipedia.org/wiki/Welsh_language)
     * ([cy][LanguageCode.cy]) for terminology applications.
     *
     * @see .wel
     */
    cym("Welsh") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.cy
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return wel
        }
    },

    /**
     * [Czech](http://en.wikipedia.org/wiki/Czech_language)
     * ([cs][LanguageCode.cs]) for bibliographic applications.
     *
     * @see .ces
     */
    cze("Czech") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.cs
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return ces
        }
    },

    /**
     * [Dakota](http://en.wikipedia.org/wiki/Dakota_language)
     *
     * @since 1.10
     */
    dak("Dakota"),

    /**
     * [Danish](http://en.wikipedia.org/wiki/Danish_language)
     * [da][LanguageCode.da]).
     */
    dan("Danish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.da
        }
    },

    /**
     * [Dargwa](http://en.wikipedia.org/wiki/Dargwa_language)
     *
     * @since 1.10
     */
    dar("Dargwa"),

    /**
     * [Land Dayak languages](http://en.wikipedia.org/wiki/Land_Dayak_languages)
     *
     * @since 1.10
     */
    day("Land Dayak languages"),

    /**
     * [Delaware](http://en.wikipedia.org/wiki/Delaware_language)
     *
     * @since 1.10
     */
    del("Delaware"),

    /**
     * [Slave (Athapascan)](http://en.wikipedia.org/wiki/Slave_language_(Athapascan))
     *
     * @since 1.10
     */
    den("Slave (Athapascan)"),

    /**
     * [German](http://en.wikipedia.org/wiki/German_language)
     * ([de][LanguageCode.de]) for terminology applications.
     *
     * @see .ger
     */
    deu("German") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.de
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return ger
        }
    },

    /**
     * [Dogrib](http://en.wikipedia.org/wiki/Dogrib_language)
     *
     * @since 1.10
     */
    dgr("Dogrib"),

    /**
     * [Dinka](http://en.wikipedia.org/wiki/Dinka_language)
     *
     * @since 1.10
     */
    din("Dinka"),

    /**
     * [Dhivehi](http://en.wikipedia.org/wiki/Dhivehi_language)
     * ([dv][LanguageCode.dv]).
     */
    div("Dhivehi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.dv
        }
    },

    /**
     * [Mande languages](http://en.wikipedia.org/wiki/Mande_languages)
     *
     * @since 1.10
     */
    dmn("Mande languages"),

    /**
     * [Dogri](http://en.wikipedia.org/wiki/Dogri_language) (macrolanguage)
     *
     * @since 1.10
     */
    doi("Dogri"),

    /**
     * [Dravidian languages](http://en.wikipedia.org/wiki/Dravidian_languages)
     *
     * @since 1.10
     */
    dra("Dravidian languages"),

    /**
     * [Lower Sorbian](http://en.wikipedia.org/wiki/Lower_Sorbian_language)
     *
     * @since 1.10
     */
    dsb("Lower Sorbian"),

    /**
     * [Duala](http://en.wikipedia.org/wiki/Duala_language)
     *
     * @since 1.10
     */
    dua("Duala"),

    /**
     * [Middle Dutch](http://en.wikipedia.org/wiki/Middle_Dutch_language) (ca. 1050-1350)
     *
     * @since 1.10
     */
    dum("Middle Dutch"),

    /**
     * [Dutch](http://en.wikipedia.org/wiki/Dutch_language)
     * ([nl][LanguageCode.nl]) for bibliography applications.
     *
     * @see .nld
     */
    dut("Dutch") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.nl
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return nld
        }
    },

    /**
     * [Dyula](http://en.wikipedia.org/wiki/Dyula_language)
     *
     * @since 1.10
     */
    dyu("Dyula"),

    /**
     * [Dzongkha](http://en.wikipedia.org/wiki/Dzongkha_language)
     * ([dz][LanguageCode.dz]).
     */
    dzo("Dzongkha") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.dz
        }
    },

    /**
     * [Efik](http://en.wikipedia.org/wiki/Efik_language)
     *
     * @since 1.10
     */
    efi("Efik"),

    /**
     * [Egyptian languages](http://en.wikipedia.org/wiki/Egyptian_languages)
     *
     * @since 1.10
     */
    egx("Egyptian languages"),

    /**
     * [Egyptian (Ancient)](http://en.wikipedia.org/wiki/Egyptian_language_(Ancient))
     *
     * @since 1.10
     */
    egy("Egyptian (Ancient)"),

    /**
     * [Ekajuk](http://en.wikipedia.org/wiki/Ekajuk_language)
     *
     * @since 1.10
     */
    eka("Ekajuk"),

    /**
     * [Modern Greek](http://en.wikipedia.org/wiki/Modern_Greek_language) (1453-)
     * ([el][LanguageCode.el]) for terminology applications.
     *
     * @see .gre Modern Greek
     * @see .grc Acient Greek
     */
    ell("Modern Greek") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.el
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return gre
        }
    },

    /**
     * [Elamite](http://en.wikipedia.org/wiki/Elamite_language)
     *
     * @since 1.10
     */
    elx("Elamite"),

    /**
     * [English](http://en.wikipedia.org/wiki/English_language)
     * ([en][LanguageCode.en]).
     */
    eng("English") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.en
        }
    },

    /**
     * [Middle English](http://en.wikipedia.org/wiki/Middle_English_language) (1100-1500)
     */
    enm("Middle English"),

    /**
     * [Esperanto](http://en.wikipedia.org/wiki/Esperanto)
     * ([eo][LanguageCode.eo]).
     */
    epo("Esperanto") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.eo
        }
    },

    /**
     * [Estonian](http://en.wikipedia.org/wiki/Estonian_language)
     * ([et][LanguageCode.et]).
     */
    est("Estonian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.et
        }
    },

    /**
     * [Eskimo-Aleut languages](http://en.wikipedia.org/wiki/Eskimo-Aleut_languages)
     *
     * @since 1.10
     */
    esx("Eskimo-Aleut languages"),

    /**
     * [Basque](http://en.wikipedia.org/wiki/Basque_language) (family)
     *
     * @since 1.10
     */
    euq("Basque"),

    /**
     * [Basque](http://en.wikipedia.org/wiki/Basque_language) (family)
     * ([eu][LanguageCode.eu]) for terminology applications.
     *
     * @see .baq
     */
    eus("Basque (family)") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.eu
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return baq
        }
    },

    /**
     * [Ewe](http://en.wikipedia.org/wiki/Ewe_language)
     * ([ee][LanguageCode.ee]).
     */
    ewe("Ewe") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ee
        }
    },

    /**
     * [Ewondo](http://en.wikipedia.org/wiki/Ewondo_language)
     *
     * @since 1.10
     */
    ewo("Ewondo"),

    /**
     * [Fang (Equatorial Guinea)](http://en.wikipedia.org/wiki/Fang_language_(Equatorial_Guinea))
     *
     * @since 1.10
     */
    fan("Fang (Equatorial Guinea)"),

    /**
     * [Faroese](http://en.wikipedia.org/wiki/Faroese_language)
     * ([fo][LanguageCode.fo]).
     */
    fao("Faroese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fo
        }
    },

    /**
     * [Persian](http://en.wikipedia.org/wiki/Persian_language)
     * ([fa][LanguageCode.fa]) for terminology applications.
     *
     * @see .per
     */
    fas("Persian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fa
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return per
        }
    },

    /**
     * [Fanti](http://en.wikipedia.org/wiki/Fanti_language)
     *
     * @since 1.10
     */
    fat("Fanti"),

    /**
     * [Fijian](http://en.wikipedia.org/wiki/Fijian_language)
     * ([fj][LanguageCode.fj]).
     */
    fij("Fijian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fj
        }
    },

    /**
     * [Filipino](http://en.wikipedia.org/wiki/Filipino_language)
     *
     * @since 1.10
     */
    fil("Filipino"),

    /**
     * [Finnish](http://en.wikipedia.org/wiki/Finnish_language)
     * ([fi][LanguageCode.fi]).
     */
    fin("Finnish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fi
        }
    },

    /**
     * [Finno-Ugrian languages](http://en.wikipedia.org/wiki/Finno-Ugrian_languages)
     *
     * @since 1.10
     */
    fiu("Finno-Ugrian languages"),

    /**
     * [Fon](http://en.wikipedia.org/wiki/Fon_language)
     *
     * @since 1.10
     */
    fon("Fon"),

    /**
     * [Formosan languages](http://en.wikipedia.org/wiki/Formosan_languages)
     *
     * @since 1.10
     */
    fox("Formosan languages"),

    /**
     * [French](http://en.wikipedia.org/wiki/French_language)
     * ([fr][LanguageCode.fr]) for terminology applications.
     *
     * @see .fre
     */
    fra("French") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fr
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return fre
        }
    },

    /**
     * [French](http://en.wikipedia.org/wiki/French_language)
     * ([fr][LanguageCode.fr]) for bibliographic applications.
     *
     * @see .fra
     */
    fre("French") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fr
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return fra
        }
    },

    /**
     * [Middle French](http://en.wikipedia.org/wiki/Middle_French_language) (ca&#0046; 1400-1600)
     *
     * @since 1.10
     */
    frm("Middle French"),

    /**
     * [Old French](http://en.wikipedia.org/wiki/Old_French_language) (842-ca&#0046; 1400)
     *
     * @since 1.10
     */
    fro("Old French"),

    /**
     * [Northern Frisian](http://en.wikipedia.org/wiki/Northern_Frisian_language)
     *
     * @since 1.10
     */
    frr("Northern Frisian"),

    /**
     * [Eastern Frisian](http://en.wikipedia.org/wiki/Eastern_Frisian_language)
     *
     * @since 1.10
     */
    frs("Eastern Frisian"),

    /**
     * [West
 * Frisian](http://en.wikipedia.org/wiki/West_Frisian_language)
     * ([fy][LanguageCode.fy]).
     */
    fry("West Frisian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fy
        }
    },

    /**
     * [Fula](http://en.wikipedia.org/wiki/Fula_language)
     * ([ff][LanguageCode.ff]).
     */
    ful("Fula") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ff
        }
    },

    /**
     * [Friulian](http://en.wikipedia.org/wiki/Friulian_language)
     *
     * @since 1.10
     */
    fur("Friulian"),

    /**
     * [Ga](http://en.wikipedia.org/wiki/Ga_language)
     *
     * @since 1.10
     */
    gaa("Ga"),

    /**
     * [Gayo](http://en.wikipedia.org/wiki/Gayo_language)
     *
     * @since 1.10
     */
    gay("Gayo"),

    /**
     * [Gbaya (Central African Republic)](http://en.wikipedia.org/wiki/Gbaya_language_(Central_African_Republic))
     *
     * @since 1.10
     */
    gba("Gbaya (Central African Republic)"),

    /**
     * [Germanic languages](http://en.wikipedia.org/wiki/Germanic_languages)
     *
     * @since 1.10
     */
    gem("Germanic languages"),

    /**
     * [Georgian](http://en.wikipedia.org/wiki/Georgian_language)
     * ([ka][LanguageCode.ka]) for bibliographic applications.
     *
     * @see .kat
     */
    geo("Georgian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ka
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return kat
        }
    },

    /**
     * [German](http://en.wikipedia.org/wiki/German_language)
     * ([de][LanguageCode.de]) for bibliographic applications.
     *
     * @see .deu
     */
    ger("German") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.de
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return deu
        }
    },

    /**
     * [Geez](http://en.wikipedia.org/wiki/Geez_language)
     *
     * @since 1.10
     */
    gez("Geez"),

    /**
     * [Gilbertese](http://en.wikipedia.org/wiki/Gilbertese_language)
     *
     * @since 1.10
     */
    gil("Gilbertese"),

    /**
     * [Scottish
 * Gaelic](http://en.wikipedia.org/wiki/Scottish_Gaelic_language)
     * ([gd][LanguageCode.gd]).
     */
    gla("Scottish Gaelic") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.gd
        }
    },

    /**
     * [Irish](http://en.wikipedia.org/wiki/Irish_language)
     * ([ga][LanguageCode.ga]).
     */
    gle("Irish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ga
        }
    },

    /**
     * [Galician](http://en.wikipedia.org/wiki/Galician_language)
     * ([gl][LanguageCode.gl]).
     */
    glg("Galician") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.gl
        }
    },

    /**
     * [Manx](http://en.wikipedia.org/wiki/Manx_language)
     * ([gv][LanguageCode.gv]).
     */
    glv("Manx") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.gv
        }
    },

    /**
     * [East Germanic languages](http://en.wikipedia.org/wiki/East_Germanic_languages)
     *
     * @since 1.10
     */
    gme("East Germanic languages"),

    /**
     * [Middle High German](http://en.wikipedia.org/wiki/Middle_High_German_language) (ca&#0046; 1050-1500)
     *
     * @since 1.10
     */
    gmh("Middle High German"),

    /**
     * [North Germanic languages](http://en.wikipedia.org/wiki/North_Germanic_languages)
     *
     * @since 1.10
     */
    gmq("North Germanic languages"),

    /**
     * [West Germanic languages](http://en.wikipedia.org/wiki/West_Germanic_languages)
     *
     * @since 1.10
     */
    gmw("West Germanic languages"),

    /**
     * [Old High German](http://en.wikipedia.org/wiki/Old_High_German_language) (ca&#0046; 750-1050)
     *
     * @since 1.10
     */
    goh("Old High German"),

    /**
     * [Gondi](http://en.wikipedia.org/wiki/Gondi_language)
     *
     * @since 1.10
     */
    gon("Gondi"),

    /**
     * [Gorontalo](http://en.wikipedia.org/wiki/Gorontalo_language)
     *
     * @since 1.10
     */
    gor("Gorontalo"),

    /**
     * [Gothic](http://en.wikipedia.org/wiki/Gothic_language)
     *
     * @since 1.10
     */
    got("Gothic"),

    /**
     * [Grebo](http://en.wikipedia.org/wiki/Grebo_language)
     *
     * @since 1.10
     */
    grb("Grebo"),

    /**
     * [Ancient Greek](http://en.wikipedia.org/wiki/Ancient_Greek_language) (to 1453)
     *
     * @see .ell Modern Greek
     * @since 1.10
     */
    grc("Ancient Greek"),

    /**
     * [Modern Greek](http://en.wikipedia.org/wiki/Modern_Greek_language) (1453-)
     * ([el][LanguageCode.el]) for bibliographic applications.
     *
     * @see .ell Modern Greek
     * @see .grc Acient Greek
     */
    gre("Modern Greek") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.el
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return ell
        }
    },

    /**
     * [Greek languages](http://en.wikipedia.org/wiki/Greek_languages)
     *
     * @since 1.10
     */
    grk("Greek languages"),

    /**
     * [Guaran&iacute
 * ;](http://en.wikipedia.org/wiki/Guaran%C3%AD_language)
     * ([gn][LanguageCode.gn]).
     */
    grn("Guaran\u00ED") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.gn
        }
    },

    /**
     * [Swiss German](http://en.wikipedia.org/wiki/Swiss_German_language)
     *
     * @since 1.10
     */
    gsw("Swiss German"),

    /**
     * [Gujarati](http://en.wikipedia.org/wiki/Gujarati_language)
     * ([gu][LanguageCode.gu]).
     */
    guj("Gujarati") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.gu
        }
    },

    /**
     * [Gwich&#x2bc;in](http://en.wikipedia.org/wiki/Gwich%CA%BCin_language)
     *
     * @since 1.10
     */
    gwi("Gwich\u02BCin"),

    /**
     * [Haida](http://en.wikipedia.org/wiki/Haida_language)
     *
     * @since 1.10
     */
    hai("Haida"),

    /**
     * [Haitian](http://en.wikipedia.org/wiki/Haitian_Creole_language)
     * ([ht][LanguageCode.ht]).
     */
    hat("Haitian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ht
        }
    },

    /**
     * [Hausa](http://en.wikipedia.org/wiki/Hausa_language)
     * ([ha][LanguageCode.ha]).
     */
    hau("Hausa") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ha
        }
    },

    /**
     * [Hawaiian](http://en.wikipedia.org/wiki/Hawaiian_language)
     *
     * @since 1.10
     */
    haw("Hawaiian"),

    /**
     * [Hebrew](http://en.wikipedia.org/wiki/Hebrew_language)
     * ([he][LanguageCode.he]).
     */
    heb("Hebrew") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.he
        }
    },

    /**
     * [Herero](http://en.wikipedia.org/wiki/Herero_language)
     * ([hz][LanguageCode.hz]).
     */
    her("Herero") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.hz
        }
    },

    /**
     * [Hiligaynon](http://en.wikipedia.org/wiki/Hiligaynon_language)
     *
     * @since 1.10
     */
    hil("Hiligaynon"),

    /**
     * [Himachali languages](http://en.wikipedia.org/wiki/Himachali_languages)
     *
     * @since 1.10
     */
    him("Himachali languages"),

    /**
     * [Hindi](http://en.wikipedia.org/wiki/Hindi)
     * ([hi][LanguageCode.hi]).
     */
    hin("Hindi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.hi
        }
    },

    /**
     * [Hittite](http://en.wikipedia.org/wiki/Hittite_language)
     *
     * @since 1.10
     */
    hit("Hittite"),

    /**
     * [Hmong](http://en.wikipedia.org/wiki/Hmong_language)
     *
     * @since 1.10
     */
    hmn("Hmong"),

    /**
     * [Hiri Motu](http://en.wikipedia.org/wiki/Hiri_Motu_language)
     * ([ho][LanguageCode.ho]).
     */
    hmo("Hiri Motu") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ho
        }
    },

    /**
     * [Hmong-Mien languages](http://en.wikipedia.org/wiki/Hmong-Mien_languages)
     *
     * @since 1.10
     */
    hmx("Hmong-Mien languages"),

    /**
     * [Hokan languages](http://en.wikipedia.org/wiki/Hokan_languages)
     *
     * @since 1.10
     */
    hok("Hokan languages"),

    /**
     * [Croatian](http://en.wikipedia.org/wiki/Croatian_language)
     * ([hr][LanguageCode.hr]).
     */
    hrv("Croatian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.hr
        }
    },

    /**
     * [Upper Sorbian](http://en.wikipedia.org/wiki/Upper_Sorbian_language)
     *
     * @since 1.10
     */
    hsb("Upper Sorbian"),

    /**
     * [Hungarian](http://en.wikipedia.org/wiki/Hungarian_language)
     * ([hu][LanguageCode.hu]).
     */
    hun("Hungarian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.hu
        }
    },

    /**
     * [Hupa](http://en.wikipedia.org/wiki/Hupa_language)
     *
     * @since 1.10
     */
    hup("Hupa"),

    /**
     * [Armenian](http://en.wikipedia.org/wiki/Armenian_language)
     * ([hy][LanguageCode.hy]) for terminology applications.
     *
     * @see .arm
     */
    hye("Armenian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.hy
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return arm
        }
    },

    /**
     * [Armenian](http://en.wikipedia.org/wiki/Armenian_language) (family)
     *
     * @since 1.10
     */
    hyx("Armenian (family)"),

    /**
     * [Iban](http://en.wikipedia.org/wiki/Iban_language)
     *
     * @since 1.10
     */
    iba("Iban"),

    /**
     * [Igbo](http://en.wikipedia.org/wiki/Igbo_language)
     * ([ig][LanguageCode.ig]).
     */
    ibo("Igbo") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ig
        }
    },

    /**
     * [Icelandic](http://en.wikipedia.org/wiki/Icelandic_language)
     * ([is][LanguageCode. is]) for biblioraphic applications.
     *
     * @see .isl
     */
    ice("Icelandic") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.`is`
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return isl
        }
    },

    /**
     * [Ido](http://en.wikipedia.org/wiki/Ido)
     * ([io][LanguageCode.io]).
     */
    ido("Ido") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.io
        }
    },

    /**
     * [Nuosu](http://en.wikipedia.org/wiki/Nuosu_language)
     * ([ii][LanguageCode.ii]).
     */
    iii("Nuosu") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ii
        }
    },

    /**
     * [Indo-Iranian languages](http://en.wikipedia.org/wiki/Indo-Iranian_languages)
     *
     * @since 1.10
     */
    iir("Indo-Iranian languages"),

    /**
     * [Ijo languages](http://en.wikipedia.org/wiki/Ijo_languages)
     *
     * @since 1.10
     */
    ijo("Ijo languages"),

    /**
     * [Inuktitut](http://en.wikipedia.org/wiki/Inuktitut)
     * ([iu][LanguageCode.iu]).
     */
    iku("Inuktitut") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.iu
        }
    },

    /**
     * [Interlingue](http://en.wikipedia.org/wiki/Interlingue_language)
     * ([ie][LanguageCode.ie]).
     */
    ile("Interlingue") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ie
        }
    },

    /**
     * [Iloko](http://en.wikipedia.org/wiki/Iloko_language)
     *
     * @since 1.10
     */
    ilo("Iloko"),

    /**
     * [Interlingua](http://en.wikipedia.org/wiki/Interlingua)
     * [ia][LanguageCode.ia]).
     */
    ina("Interlingua") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ia
        }
    },

    /**
     * [Interlingua (International Auxiliary Language Association)](http://en.wikipedia.org/wiki/Interlingua_language_(International_Auxiliary_Language_Association))
     *
     * @since 1.10
     */
    inc("Interlingua (International Auxiliary Language Association)"),

    /**
     * [Indonesian](http://en.wikipedia.org/wiki/Indonesian_language)
     * ([id][LanguageCode.id]).
     */
    ind("Indonesian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.id
        }
    },

    /**
     * [Indo-European languages](http://en.wikipedia.org/wiki/Indo-European_languages)
     *
     * @since 1.10
     */
    ine("Indo-European languages"),

    /**
     * [Ingush](http://en.wikipedia.org/wiki/Ingush_language)
     *
     * @since 1.10
     */
    inh("Ingush"),

    /**
     * [Inupiaq](http://en.wikipedia.org/wiki/Inupiaq_language)
     * ([ik][LanguageCode.ik]).
     */
    ipk("Inupiaq") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ik
        }
    },

    /**
     * [Iranian languages](http://en.wikipedia.org/wiki/Iranian_languages)
     *
     * @since 1.10
     */
    ira("Iranian languages"),

    /**
     * [Iroquoian languages](http://en.wikipedia.org/wiki/Iroquoian_languages)
     *
     * @since 1.10
     */
    iro("Iroquoian languages"),

    /**
     * [Icelandic](http://en.wikipedia.org/wiki/Icelandic_language)
     * ([is][LanguageCode. is]) for terminology applications.
     *
     * @see .ice
     */
    isl("Icelandic") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.`is`
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return ice
        }
    },

    /**
     * [Italian](http://en.wikipedia.org/wiki/Italian_language)
     * ([it][LanguageCode.it]).
     */
    ita("Italian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.it
        }
    },

    /**
     * [Italic languages](http://en.wikipedia.org/wiki/Italic_languages)
     *
     * @since 1.10
     */
    itc("Italic languages"),

    /**
     * [Javanese](http://en.wikipedia.org/wiki/Javanese_language)
     * ([jv][LanguageCode.jv]).
     */
    jav("Javanese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.jv
        }
    },

    /**
     * [Lojban](http://en.wikipedia.org/wiki/Lojban_language)
     *
     * @since 1.10
     */
    jbo("Lojban"),

    /**
     * [Japanese](http://en.wikipedia.org/wiki/Japanese_language)
     * ([ja][LanguageCode.ja]).
     */
    jpn("Japanese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ja
        }
    },

    /**
     * [Judeo-Persian](http://en.wikipedia.org/wiki/Judeo-Persian_language)
     *
     * @since 1.10
     */
    jpr("Judeo-Persian"),

    /**
     * [Japanese](http://en.wikipedia.org/wiki/Japanese_language) (family)
     *
     * @since 1.10
     */
    jpx("Japanese (family)"),

    /**
     * [Judeo-Arabic](http://en.wikipedia.org/wiki/Judeo-Arabic_language)
     *
     * @since 1.10
     */
    jrb("Judeo-Arabic"),

    /**
     * [Kara-Kalpak](http://en.wikipedia.org/wiki/Kara-Kalpak_language)
     *
     * @since 1.10
     */
    kaa("Kara-Kalpak"),

    /**
     * [Kabyle](http://en.wikipedia.org/wiki/Kabyle_language)
     *
     * @since 1.10
     */
    kab("Kabyle"),

    /**
     * [Kachin](http://en.wikipedia.org/wiki/Kachin_language)
     *
     * @since 1.10
     */
    kac("Kachin"),

    /**
     * [Kalaallisut](http://en.wikipedia.org/wiki/Kalaallisut_language)
     * ([kl][LanguageCode.kl]).
     */
    kal("Kalaallisut") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kl
        }
    },

    /**
     * [Kamba (Kenya)](http://en.wikipedia.org/wiki/Kamba_language_(Kenya))
     *
     * @since 1.10
     */
    kam("Kamba (Kenya)"),

    /**
     * [Kannada](http://en.wikipedia.org/wiki/Kannada_language)
     * ([kn][LanguageCode.kn]).
     */
    kan("Kannada") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kn
        }
    },

    /**
     * [Karen languages](http://en.wikipedia.org/wiki/Karen_languages)
     *
     * @since 1.10
     */
    kar("Karen languages"),

    /**
     * [Kashmiri](http://en.wikipedia.org/wiki/Kashmiri_language)
     * ([ks][LanguageCode.ks]).
     */
    kas("Kashmiri") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ks
        }
    },

    /**
     * [Georgian](http://en.wikipedia.org/wiki/Georgian_language)
     * ([ka][LanguageCode.ka]) for terminology applications.
     *
     * @see .geo
     */
    kat("Georgian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ka
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return geo
        }
    },

    /**
     * [Kanuri](http://en.wikipedia.org/wiki/Kanuri_language)
     * ([kr][LanguageCode.kr]).
     */
    kau("Kanuri") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kr
        }
    },

    /**
     * [Kawi](http://en.wikipedia.org/wiki/Kawi_language)
     *
     * @since 1.10
     */
    kaw("Kawi"),

    /**
     * [Kazakh](http://en.wikipedia.org/wiki/Kazakh_language)
     * ([kk][LanguageCode.kk]).
     */
    kaz("Kazakh") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kk
        }
    },

    /**
     * [Kabardian](http://en.wikipedia.org/wiki/Kabardian_language)
     *
     * @since 1.10
     */
    kbd("Kabardian"),

    /**
     * [Kordofanian languages](http://en.wikipedia.org/wiki/Kordofanian_languages)
     *
     * @since 1.10
     */
    kdo("Kordofanian languages"),

    /**
     * [Khasi](http://en.wikipedia.org/wiki/Khasi_language)
     *
     * @since 1.10
     */
    kha("Khasi"),

    /**
     * [Khoisan languages](http://en.wikipedia.org/wiki/Khoisan_languages)
     *
     * @since 1.10
     */
    khi("Khoisan languages"),

    /**
     * [Khmer](http://en.wikipedia.org/wiki/Khmer_language)
     * ([km][LanguageCode.km]).
     */
    khm("Central Khmer") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.km
        }
    },

    /**
     * [Khotanese](http://en.wikipedia.org/wiki/Khotanese_language)
     *
     * @since 1.10
     */
    kho("Khotanese"),

    /**
     * [Kikuyu](http://en.wikipedia.org/wiki/Gikuyu_language)
     * ([ki][LanguageCode.ki]).
     */
    kik("Kikuyu") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ki
        }
    },

    /**
     * [Kinyarwanda](http://en.wikipedia.org/wiki/Kinyarwanda)
     * ([rw][LanguageCode.rw]).
     */
    kin("Kinyarwanda") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.rw
        }
    },

    /**
     * [Kyrgyz](http://en.wikipedia.org/wiki/Kyrgyz_language)
     * ([ky][LanguageCode.ky]).
     */
    kir("Kirghiz") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ky
        }
    },

    /**
     * [Kimbundu](http://en.wikipedia.org/wiki/Kimbundu_language)
     *
     * @since 1.10
     */
    kmb("Kimbundu"),

    /**
     * [Konkani](http://en.wikipedia.org/wiki/Konkani_language) (macrolanguage)
     *
     * @since 1.10
     */
    kok("Konkani"),

    /**
     * [Komi](http://en.wikipedia.org/wiki/Komi_language)
     * ([kv][LanguageCode.kv]).
     */
    kom("Komi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kv
        }
    },

    /**
     * [Kongo](http://en.wikipedia.org/wiki/Kongo_language)
     * ([kg][LanguageCode.kg]).
     */
    kon("Kongo") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kg
        }
    },

    /**
     * [Korean](http://en.wikipedia.org/wiki/Korean_language)
     * ([ko][LanguageCode.ko]).
     */
    kor("Korean") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ko
        }
    },

    /**
     * [Kosraean](http://en.wikipedia.org/wiki/Kosraean_language)
     *
     * @since 1.10
     */
    kos("Kosraean"),

    /**
     * [Kpelle](http://en.wikipedia.org/wiki/Kpelle_language)
     *
     * @since 1.10
     */
    kpe("Kpelle"),

    /**
     * [Karachay-Balkar](http://en.wikipedia.org/wiki/Karachay-Balkar_language)
     *
     * @since 1.10
     */
    krc("Karachay-Balkar"),

    /**
     * [Karelian](http://en.wikipedia.org/wiki/Karelian_language)
     *
     * @since 1.10
     */
    krl("Karelian"),

    /**
     * [Kru languages](http://en.wikipedia.org/wiki/Kru_languages)
     *
     * @since 1.10
     */
    kro("Kru languages"),

    /**
     * [Kurukh](http://en.wikipedia.org/wiki/Kurukh_language)
     *
     * @since 1.10
     */
    kru("Kurukh"),

    /**
     * [Kwanyama](http://en.wikipedia.org/wiki/Kwanyama)
     * ([kj][LanguageCode.kj]).
     */
    kua("Kuanyama") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.kj
        }
    },

    /**
     * [Kumyk](http://en.wikipedia.org/wiki/Kumyk_language)
     *
     * @since 1.10
     */
    kum("Kumyk"),

    /**
     * [Kurdish](http://en.wikipedia.org/wiki/Kurdish_language)
     * ([ku][LanguageCode.ku]).
     */
    kur("Kurdish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ku
        }
    },

    /**
     * [Kutenai](http://en.wikipedia.org/wiki/Kutenai_language)
     *
     * @since 1.10
     */
    kut("Kutenai"),

    /**
     * [Ladino](http://en.wikipedia.org/wiki/Ladino_language)
     *
     * @since 1.10
     */
    lad("Ladino"),

    /**
     * [Lahnda](http://en.wikipedia.org/wiki/Lahnda_language)
     *
     * @since 1.10
     */
    lah("Lahnda"),

    /**
     * [Lamba](http://en.wikipedia.org/wiki/Lamba_language)
     *
     * @since 1.10
     */
    lam("Lamba"),

    /**
     * [Lao](http://en.wikipedia.org/wiki/Lao_language)
     * ([lo][LanguageCode.lo]).
     */
    lao("Lao") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.lo
        }
    },

    /**
     * [Latin](http://en.wikipedia.org/wiki/Latin)
     * ([la][LanguageCode.la]).
     */
    lat("Latin") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.la
        }
    },

    /**
     * [Latvian](http://en.wikipedia.org/wiki/Latvian_language)
     * ([lv][LanguageCode.lv]).
     */
    lav("Latvian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.lv
        }
    },

    /**
     * [Lezghian](http://en.wikipedia.org/wiki/Lezghian_language)
     *
     * @since 1.10
     */
    lez("Lezghian"),

    /**
     * [Limburgish](http://en.wikipedia.org/wiki/Limburgish_language)
     * ([li][LanguageCode.li]).
     */
    lim("Limburgan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.li
        }
    },

    /**
     * [Lingala](http://en.wikipedia.org/wiki/Lingala_language)
     * ([ln][LanguageCode.ln]).
     */
    lin("Lingala") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ln
        }
    },

    /**
     * [Lithuanian](http://en.wikipedia.org/wiki/Lithuanian_language)
     * ([lt][LanguageCode.lt]).
     */
    lit("Lithuanian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.lt
        }
    },

    /**
     * [Mongo](http://en.wikipedia.org/wiki/Mongo_language)
     *
     * @since 1.10
     */
    lol("Mongo"),

    /**
     * [Lozi](http://en.wikipedia.org/wiki/Lozi_language)
     *
     * @since 1.10
     */
    loz("Lozi"),

    /**
     * [
 * Luxembourgish](http://en.wikipedia.org/wiki/Luxembourgish_language)
     * ([lb][LanguageCode.lb]).
     */
    ltz("Luxembourgish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.lb
        }
    },

    /**
     * [Luba-Lulua](http://en.wikipedia.org/wiki/Luba-Lulua_language)
     *
     * @since 1.10
     */
    lua("Luba-Lulua"),

    /**
     * [Luba-Katanga](http://en.wikipedia.org/wiki/Tshiluba_language)
     * ([lu][LanguageCode.lu]).
     */
    lub("Luba-Katanga") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.lu
        }
    },

    /**
     * [Ganda](http://en.wikipedia.org/wiki/Luganda)
     * ([lg][LanguageCode.lg]).
     */
    lug("Ganda") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.lg
        }
    },

    /**
     * [Luiseno](http://en.wikipedia.org/wiki/Luiseno_language)
     *
     * @since 1.10
     */
    lui("Luiseno"),

    /**
     * [Lunda](http://en.wikipedia.org/wiki/Lunda_language)
     *
     * @since 1.10
     */
    lun("Lunda"),

    /**
     * [Luo (Kenya and Tanzania)](http://en.wikipedia.org/wiki/Luo_language_(Kenya_and_Tanzania))
     *
     * @since 1.10
     */
    luo("Luo (Kenya and Tanzania)"),

    /**
     * [Lushai](http://en.wikipedia.org/wiki/Lushai_language)
     *
     * @since 1.10
     */
    lus("Lushai"),

    /**
     * [Macedonian](http://en.wikipedia.org/wiki/Macedonian_language)
     * ([mk][LanguageCode.mk]) for bibliographic applications.
     *
     * @see .mkd
     */
    mac("Macedonian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mk
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return mkd
        }
    },

    /**
     * [Madurese](http://en.wikipedia.org/wiki/Madurese_language)
     *
     * @since 1.10
     */
    mad("Madurese"),

    /**
     * [Magahi](http://en.wikipedia.org/wiki/Magahi_language)
     *
     * @since 1.10
     */
    mag("Magahi"),

    /**
     * [Marshallese](http://en.wikipedia.org/wiki/Marshallese_language)
     * ([mh][LanguageCode.mh]).
     */
    mah("Marshallese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mh
        }
    },

    /**
     * [Maithili](http://en.wikipedia.org/wiki/Maithili_language)
     *
     * @since 1.10
     */
    mai("Maithili"),

    /**
     * [Makasar](http://en.wikipedia.org/wiki/Makasar_language)
     *
     * @since 1.10
     */
    mak("Makasar"),

    /**
     * [Malayalam](http://en.wikipedia.org/wiki/Malayalam_language)
     * ([ml][LanguageCode.ml]).
     */
    mal("Malayalam") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ml
        }
    },

    /**
     * [Mandingo](http://en.wikipedia.org/wiki/Manding_languages)
     *
     * @since 1.10
     */
    man("Mandingo"),

    /**
     * [M&#257;ori](http://en.wikipedia.org/wiki/M%C4%81ori_language)
     * ([mi][LanguageCode.mi]) for bibliographic applications.
     *
     * @see .mri
     */
    mao("M\u0101ori") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mi
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return mri
        }
    },

    /**
     * [Austronesian languages](http://en.wikipedia.org/wiki/Austronesian_languages)
     *
     * @since 1.10
     */
    map("Austronesian languages"),

    /**
     * [Marathi](http://en.wikipedia.org/wiki/Marathi_language)
     * ([mr][LanguageCode.mr]).
     */
    mar("Marathi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mr
        }
    },

    /**
     * [Masai](http://en.wikipedia.org/wiki/Masai_language)
     *
     * @since 1.10
     */
    mas("Masai"),

    /**
     * [Malay](http://en.wikipedia.org/wiki/Malay_language) (macrolanguage)
     * ([ms][LanguageCode.ms]) for bibliographic applications.
     *
     * @see .msa
     */
    may("Malay") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ms
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return msa
        }
    },

    /**
     * [Moksha](http://en.wikipedia.org/wiki/Moksha_language)
     *
     * @since 1.10
     */
    mdf("Moksha"),

    /**
     * [Mandar](http://en.wikipedia.org/wiki/Mandar_language)
     *
     * @since 1.10
     */
    mdr("Mandar"),

    /**
     * [Mende (Sierra Leone)](http://en.wikipedia.org/wiki/Mende_language_(Sierra_Leone))
     *
     * @since 1.10
     */
    men("Mende (Sierra Leone)"),

    /**
     * [Middle Irish](http://en.wikipedia.org/wiki/Middle_Irish_language) (900-1200)
     *
     * @since 1.10
     */
    mga("Middle Irish"),

    /**
     * [Mi'kmaq](http://en.wikipedia.org/wiki/Mi%27kmaq_language)
     *
     * @since 1.10
     */
    mic("Mi'kmaq"),

    /**
     * [Minangkabau](http://en.wikipedia.org/wiki/Minangkabau_language)
     *
     * @since 1.10
     */
    min("Minangkabau"),

    /**
     * Uncoded languages.
     *
     * @since 1.10
     */
    mis("Uncoded languages"),

    /**
     * [Macedonian](http://en.wikipedia.org/wiki/Macedonian_language)
     * ([mk][LanguageCode.mk]) for terminology applications.
     *
     * @see .mac
     */
    mkd("Macedonian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mk
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return mac
        }
    },

    /**
     * [Mon-Khmer languages](http://en.wikipedia.org/wiki/Mon-Khmer_languages)
     *
     * @since 1.10
     */
    mkh("Mon-Khmer languages"),

    /**
     * [Malagasy](http://en.wikipedia.org/wiki/Malagasy_language)
     * ([mg][LanguageCode.mg]).
     */
    mlg("Malagasy") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mg
        }
    },

    /**
     * [Maltese](http://en.wikipedia.org/wiki/Maltese_language)
     * ([mt][LanguageCode.mt]).
     */
    mlt("Maltese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mt
        }
    },

    /**
     * [Manchu](http://en.wikipedia.org/wiki/Manchu_language)
     *
     * @since 1.10
     */
    mnc("Manchu"),

    /**
     * [Manipuri](http://en.wikipedia.org/wiki/Manipuri_language)
     *
     * @since 1.10
     */
    mni("Manipuri"),

    /**
     * [Manobo languages](http://en.wikipedia.org/wiki/Manobo_languages)
     *
     * @since 1.10
     */
    mno("Manobo languages"),

    /**
     * [Mohawk](http://en.wikipedia.org/wiki/Mohawk_language)
     *
     * @since 1.10
     */
    moh("Mohawk"),

    /**
     * [Mongolian](http://en.wikipedia.org/wiki/Mongolian_language)
     * ([mn][LanguageCode.mn]).
     */
    mon("Mongolian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mn
        }
    },

    /**
     * [Mossi](http://en.wikipedia.org/wiki/Mossi_language)
     *
     * @since 1.10
     */
    mos("Mossi"),

    /**
     * [M&#257;ori](http://en.wikipedia.org/wiki/M%C4%81ori_language)
     * ([mi][LanguageCode.mi]) for terminology applications.
     *
     * @see .mao
     */
    mri("M\u0101ori") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.mi
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return mao
        }
    },

    /**
     * [Malay](http://en.wikipedia.org/wiki/Malay_language)
     * ([ms][LanguageCode.ms]) for terminology applications.
     *
     * @see .may
     */
    msa("Malay") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ms
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return may
        }
    },

    /**
     * Multiple languages.
     *
     * @since 1.10
     */
    mul("Multiple languages"),

    /**
     * [Munda languages](http://en.wikipedia.org/wiki/Munda_languages)
     *
     * @since 1.10
     */
    mun("Munda languages"),

    /**
     * [Creek](http://en.wikipedia.org/wiki/Creek_language)
     *
     * @since 1.10
     */
    mus("Creek"),

    /**
     * [Mirandese](http://en.wikipedia.org/wiki/Mirandese_language)
     *
     * @since 1.10
     */
    mwl("Mirandese"),

    /**
     * [Marwari](http://en.wikipedia.org/wiki/Marwari_language)
     *
     * @since 1.10
     */
    mwr("Marwari"),

    /**
     * [Burmese](http://en.wikipedia.org/wiki/Burmese_language)
     * ([my][LanguageCode.my]) for terminology applications.
     *
     * @see .bur
     */
    mya("Burmese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.my
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return bur
        }
    },

    /**
     * [Mayan languages](http://en.wikipedia.org/wiki/Mayan_languages)
     *
     * @since 1.10
     */
    myn("Mayan languages"),

    /**
     * [Erzya](http://en.wikipedia.org/wiki/Erzya_language)
     *
     * @since 1.10
     */
    myv("Erzya"),

    /**
     * [Nahuatl languages](http://en.wikipedia.org/wiki/Nahuatl_languages)
     *
     * @since 1.10
     */
    nah("Nahuatl languages"),

    /**
     * [North American Indian](http://en.wikipedia.org/wiki/North_American_Indian_languages)
     *
     * @since 1.10
     */
    nai("North American Indian"),

    /**
     * [Neapolitan](http://en.wikipedia.org/wiki/Neapolitan_language)
     *
     * @since 1.10
     */
    nap("Neapolitan"),

    /**
     * [Nauru](http://en.wikipedia.org/wiki/Nauruan_language)
     * ([na][LanguageCode.na]).
     */
    nau("Nauru") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.na
        }
    },

    /**
     * [Navajo](http://en.wikipedia.org/wiki/Navajo_language)
     * ([nv][LanguageCode.nv]).
     */
    nav("Navajo") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.nv
        }
    },

    /**
     * [Southern
 * Ndebele](http://en.wikipedia.org/wiki/Southern_Ndebele_language)
     * ([nr][LanguageCode.nr]).
     */
    nbl("South Ndebele") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.nr
        }
    },

    /**
     * [Northern
 * Ndebele](http://en.wikipedia.org/wiki/Northern_Ndebele_language)
     * ([nd][LanguageCode.nd]).
     */
    nde("North Ndebele") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.nd
        }
    },

    /**
     * [Ndonga](http://en.wikipedia.org/wiki/Ndonga)
     * ([ng][LanguageCode.ng]).
     */
    ndo("Ndonga") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ng
        }
    },

    /**
     * [Low German](http://en.wikipedia.org/wiki/Low_German_language)
     *
     * @since 1.10
     */
    nds("Low German"),

    /**
     * [Nepali](http://en.wikipedia.org/wiki/Nepali_language) (macrolanguage)
     * ([ne][LanguageCode.ne]).
     */
    nep("Nepali") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ne
        }
    },

    /**
     * [Newari](http://en.wikipedia.org/wiki/Newari_language)
     *
     *
     *
     * Because `new` is a special word for Java programming
     * language, `new` cannot be used as an enum entry.
     * So, the first letter of this entry is a capital letter.
     *
     *
     *
     *
     * `toString()` method of this instance (`New`)
     * returns `"new"`.
     *
     *
     * @since 1.10
     */
    New("Newari") {
        override fun toString(): String {
            return "new"
        }
    },

    /**
     * [Trans-New Guinea languages](http://en.wikipedia.org/wiki/Trans-New_Guinea_languages)
     *
     * @since 1.10
     */
    ngf("Trans-New Guinea languages"),

    /**
     * [Nias](http://en.wikipedia.org/wiki/Nias_language)
     *
     * @since 1.10
     */
    nia("Nias"),

    /**
     * [Niger-Kordofanian languages](http://en.wikipedia.org/wiki/Niger-Kordofanian_languages)
     *
     * @since 1.10
     */
    nic("Niger-Kordofanian languages"),

    /**
     * [Niuean](http://en.wikipedia.org/wiki/Niuean_language)
     *
     * @since 1.10
     */
    niu("Niuean"),

    /**
     * [Dutch](http://en.wikipedia.org/wiki/Dutch_language)
     * ([nl][LanguageCode.nl]) for terminology applications.
     *
     * @see .dut
     */
    nld("Dutch") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.nl
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return dut
        }
    },

    /**
     * [Norwegian Nynorsk](http://en.wikipedia.org/wiki/Nynorsk)
     * ([nn][LanguageCode.nn]).
     */
    nno("Norwegian Nynorsk") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.nn
        }
    },

    /**
     * [Norwegian
 * Bokml](http://en.wikipedia.org/wiki/Bokm%C3%A5l)
     * ([nb][LanguageCode.nb]).
     */
    nob("Norwegian Bokm\u00E5l") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.nb
        }
    },

    /**
     * [Nogai](http://en.wikipedia.org/wiki/Nogai_language)
     *
     * @since 1.10
     */
    nog("Nogai"),

    /**
     * [Old Norse](http://en.wikipedia.org/wiki/Old_Norse_language)
     *
     * @since 1.10
     */
    non("Old Norse"),

    /**
     * [Norwegian](http://en.wikipedia.org/wiki/Norwegian_language)
     * ([no][LanguageCode.no]).
     */
    nor("Norwegian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.no
        }
    },

    /**
     * [N'Ko](http://en.wikipedia.org/wiki/N%27Ko_language)
     *
     * @since 1.10
     */
    nqo("N'Ko"),

    /**
     * [Pedi](http://en.wikipedia.org/wiki/Pedi_language)
     *
     * @since 1.10
     */
    nso("Pedi"),

    /**
     * [Nubian languages](http://en.wikipedia.org/wiki/Nubian_languages)
     *
     * @since 1.10
     */
    nub("Nubian languages"),

    /**
     * [Classical Newari](http://en.wikipedia.org/wiki/Classical_Newari_language)
     *
     * @since 1.10
     */
    nwc("Classical Newari"),

    /**
     * [Chichewa](http://en.wikipedia.org/wiki/Chichewa_language)
     * ([ny][LanguageCode.ny]).
     */
    nya("Nyanja") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ny
        }
    },

    /**
     * [Nyamwezi](http://en.wikipedia.org/wiki/Nyamwezi_language)
     *
     * @since 1.10
     */
    nym("Nyamwezi"),

    /**
     * [Nyankole](http://en.wikipedia.org/wiki/Nyankole_language)
     *
     * @since 1.10
     */
    nyn("Nyankole"),

    /**
     * [Nyoro](http://en.wikipedia.org/wiki/Nyoro_language)
     *
     * @since 1.10
     */
    nyo("Nyoro"),

    /**
     * [Nzima](Nzima)
     *
     * @since 1.10
     */
    nzi("Nzima"),

    /**
     * [Occitan](http://en.wikipedia.org/wiki/Occitan_language) (post 1500)
     * ([oc][LanguageCode.oc]).
     */
    oci("Occitan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.oc
        }
    },

    /**
     * [Ojibwe](http://en.wikipedia.org/wiki/Ojibwe_language)
     * ([oj][LanguageCode.oj]).
     */
    oji("Ojibwa") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.oj
        }
    },

    /**
     * [Oto-Manguean languages](http://en.wikipedia.org/wiki/Oto-Manguean_languages)
     *
     * @since 1.10
     */
    omq("Oto-Manguean languages"),

    /**
     * [Omotic languages](http://en.wikipedia.org/wiki/Omotic_languages)
     *
     * @since 1.10
     */
    omv("Omotic languages"),

    /**
     * [Oriya](http://en.wikipedia.org/wiki/Oriya_language) (macrolanguage)
     * ([or][LanguageCode.or]).
     */
    ori("Oriya") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.or
        }
    },

    /**
     * [Oromo](http://en.wikipedia.org/wiki/Oromo_language)
     * ([om][LanguageCode.om]).
     */
    orm("Oromo") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.om
        }
    },

    /**
     * [Osage](http://en.wikipedia.org/wiki/Osage_language)
     *
     * @since 1.10
     */
    osa("Osage"),

    /**
     * [Ossetian](http://en.wikipedia.org/wiki/Ossetic_language)
     * ([os][LanguageCode.os]).
     */
    oss("Ossetian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.os
        }
    },

    /**
     * [Ottoman Turkish](http://en.wikipedia.org/wiki/Ottoman_Turkish_language) (1500-1928)
     *
     * @since 1.10
     */
    ota("Ottoman Turkish"),

    /**
     * [Otomian languages](http://en.wikipedia.org/wiki/Otomian_languages)
     *
     * @since 1.10
     */
    oto("Otomian languages"),

    /**
     * [Papuan languages](http://en.wikipedia.org/wiki/Papuan_languages)
     *
     * @since 1.10
     */
    paa("Papuan languages"),

    /**
     * [Pangasinan](http://en.wikipedia.org/wiki/Pangasinan_language)
     *
     * @since 1.10
     */
    pag("Pangasinan"),

    /**
     * [Pahlavi](http://en.wikipedia.org/wiki/Pahlavi_language)
     *
     * @since 1.10
     */
    pal("Pahlavi"),

    /**
     * [Pampanga](http://en.wikipedia.org/wiki/Pampanga_language)
     *
     * @since 1.10
     */
    pam("Pampanga"),

    /**
     * [Punjabi](http://en.wikipedia.org/wiki/Punjabi_language)
     * ([pa][LanguageCode.pa]).
     */
    pan("Panjabi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.pa
        }
    },

    /**
     * [Papiamento](http://en.wikipedia.org/wiki/Papiamento_language)
     *
     * @since 1.10
     */
    pap("Papiamento"),

    /**
     * [Palauan](http://en.wikipedia.org/wiki/Palauan_language)
     *
     * @since 1.10
     */
    pau("Palauan"),

    /**
     * [Old Persian](http://en.wikipedia.org/wiki/Old_Persian_language) (ca. 600-400 B.C.)
     */
    peo("Old Persian"),

    /**
     * [Persian](http://en.wikipedia.org/wiki/Persian_language)
     * ([fa][LanguageCode.fa]) for bibliographic applications.
     *
     * @see .fas
     */
    per("Persian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.fa
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return fas
        }
    },

    /**
     * [Philippine languages](http://en.wikipedia.org/wiki/Philippine_languages)
     *
     * @since 1.10
     */
    phi("Philippine languages"),

    /**
     * [Phoenician](http://en.wikipedia.org/wiki/Phoenician_language)
     *
     * @since 1.10
     */
    phn("Phoenician"),

    /**
     * [Central Malayo-Polynesian languages](http://en.wikipedia.org/wiki/Central_Malayo-Polynesian_languages)
     *
     * @since 1.10
     */
    plf("Central Malayo-Polynesian languages"),

    /**
     * [P&#257;li](http://en.wikipedia.org/wiki/P%C4%81li_language)
     * ([pi][LanguageCode.pi]).
     */
    pli("P\u0101li") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.pi
        }
    },

    /**
     * [Polish](http://en.wikipedia.org/wiki/Polish_language)
     * ([pl][LanguageCode.pl]).
     */
    pol("Polish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.pl
        }
    },

    /**
     * [Pohnpeian](http://en.wikipedia.org/wiki/Pohnpeian_language)
     *
     * @since 1.10
     */
    pon("Pohnpeian"),

    /**
     * [Portuguese](http://en.wikipedia.org/wiki/Portuguese_language)
     * ([pt][LanguageCode.pt]).
     */
    por("Portuguese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.pt
        }
    },

    /**
     * [Malayo-Polynesian languages](http://en.wikipedia.org/wiki/Malayo-Polynesian_languages)
     *
     * @since 1.10
     */
    poz("Malayo-Polynesian languages"),

    /**
     * [Eastern Malayo-Polynesian languages](http://en.wikipedia.org/wiki/Eastern_Malayo-Polynesian_languages)
     *
     * @since 1.10
     */
    pqe("Eastern Malayo-Polynesian languages"),

    /**
     * [Western Malayo-Polynesian languages](http://en.wikipedia.org/wiki/Western_Malayo-Polynesian_languages)
     *
     * @since 1.10
     */
    pqw("Western Malayo-Polynesian languages"),

    /**
     * [Prakrit languages](http://en.wikipedia.org/wiki/Prakrit_languages)
     *
     * @since 1.10
     */
    pra("Prakrit languages"),

    /**
     * [Old Provenal]() (to 1500)
     *
     * @since 1.10
     */
    pro("Old Proven\u00E7al"),

    /**
     * [Pashto](http://en.wikipedia.org/wiki/Pashto_language)
     * ([ps][LanguageCode.ps]).
     */
    pus("Pushto") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ps
        }
    },

    /**
     * [Quechua](http://en.wikipedia.org/wiki/Quechua_language)
     * ([qu][LanguageCode.qu]).
     */
    que("Quechua") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.qu
        }
    },

    /**
     * [Quechuan](http://en.wikipedia.org/wiki/Quechuan_language) (family)
     *
     * @since 1.10
     */
    qwe("Quechuan (family)"),

    /**
     * [Rajasthani](http://en.wikipedia.org/wiki/Rajasthani_language)
     *
     * @since 1.10
     */
    raj("Rajasthani"),

    /**
     * [Rapanui](http://en.wikipedia.org/wiki/Rapanui_language)
     *
     * @since 1.10
     */
    rap("Rapanui"),

    /**
     * [Rarotongan](http://en.wikipedia.org/wiki/Rarotongan_language)
     *
     * @since 1.10
     */
    rar("Rarotongan"),

    /**
     * [Romance languages](http://en.wikipedia.org/wiki/Romance_languages)
     *
     * @since 1.10
     */
    roa("Romance languages"),

    /**
     * [Romansh](http://en.wikipedia.org/wiki/Romansh_language)
     * ([rm][LanguageCode.rm])
     */
    roh("Romansh") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.rm
        }
    },

    /**
     * [Romany](http://en.wikipedia.org/wiki/Romany_language)
     *
     * @since 1.10
     */
    rom("Romany"),

    /**
     * [Romanian](http://en.wikipedia.org/wiki/Romanian_language)
     * ([ro][LanguageCode.ro]) for terminology applications.
     *
     * @see .rum
     */
    ron("Romanian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ro
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return rum
        }
    },

    /**
     * [Romanian](http://en.wikipedia.org/wiki/Romanian_language)
     * ([ro][LanguageCode.ro]) for bibliographic applications.
     *
     * @see .ron
     */
    rum("Romansh") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ro
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return ron
        }
    },

    /**
     * [Kirundi](http://en.wikipedia.org/wiki/Kirundi)
     * ([rn][LanguageCode.rn]).
     */
    run("Kirundi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.rn
        }
    },

    /**
     * [Macedo-Romanian](http://en.wikipedia.org/wiki/Macedo-Romanian_language)
     *
     * @since 1.10
     */
    rup("Macedo-Romanian"),

    /**
     * [Russian](http://en.wikipedia.org/wiki/Russian_language)
     * ([ru][LanguageCode.ru]).
     */
    rus("Russian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ru
        }
    },

    /**
     * [Sango](http://en.wikipedia.org/wiki/Sango_language)
     *
     * @since 1.10
     */
    sad("Sango"),

    /**
     * [Sango](http://en.wikipedia.org/wiki/Sango_language)
     * ([sg][LanguageCode.sg]).
     */
    sag("Sango") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sg
        }
    },

    /**
     * [Yakut](http://en.wikipedia.org/wiki/Yakut_language)
     *
     * @since 1.10
     */
    sah("Yakut"),

    /**
     * [South American Indian languages](http://en.wikipedia.org/wiki/South_American_Indian_languages)
     *
     * @since 1.10
     */
    sai("South American Indian languages"),

    /**
     * [Salishan languages](http://en.wikipedia.org/wiki/Salishan_languages)
     *
     * @since 1.10
     */
    sal("Salishan languages"),

    /**
     * [Samaritan Aramaic](http://en.wikipedia.org/wiki/Samaritan_Aramaic_language)
     *
     * @since 1.10
     */
    sam("Samaritan Aramaic"),

    /**
     * [Sanskrit](http://en.wikipedia.org/wiki/Sanskrit)
     * ([sa][LanguageCode.sa]).
     */
    san("Sanskrit") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sa
        }
    },

    /**
     * [Sasak](http://en.wikipedia.org/wiki/Sasak_language)
     *
     * @since 1.10
     */
    sas("Sasak"),

    /**
     * [Santali](http://en.wikipedia.org/wiki/Santali_language)
     *
     * @since 1.10
     */
    sat("Santali"),

    /**
     * [Sicilian](http://en.wikipedia.org/wiki/Sicilian_language)
     *
     * @since 1.10
     */
    scn("Sicilian"),

    /**
     * [Scots](http://en.wikipedia.org/wiki/Scots_language)
     *
     * @since 1.10
     */
    sco("Scots"),

    /**
     * [Eastern Sudanic languages](http://en.wikipedia.org/wiki/Eastern_Sudanic_languages)
     *
     * @since 1.10
     */
    sdv("Eastern Sudanic languages"),

    /**
     * [Selkup](http://en.wikipedia.org/wiki/Selkup_language)
     *
     * @since 1.10
     */
    sel("Selkup"),

    /**
     * [Semitic languages](http://en.wikipedia.org/wiki/Semitic_languages)
     *
     * @since 1.10
     */
    sem("Semitic languages"),

    /**
     * [Old Irish](http://en.wikipedia.org/wiki/Old_Irish_language) (to 900)
     *
     * @since 1.10
     */
    sga("Old Irish"),

    /**
     * [Sign languages](http://en.wikipedia.org/wiki/Sign_languages)
     *
     * @since 1.10
     */
    sgn("Sign languages"),

    /**
     * [Shan](http://en.wikipedia.org/wiki/Shan_language)
     *
     * @since 1.10
     */
    shn("Shan"),

    /**
     * [Sidamo](http://en.wikipedia.org/wiki/Sidamo_language)
     *
     * @since 1.10
     */
    sid("Sidamo"),

    /**
     * [Sinhala](http://en.wikipedia.org/wiki/Sinhala_language)
     * ([si][LanguageCode.si]).
     */
    sin("Sinhala") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.si
        }
    },

    /**
     * [Siouan languages](http://en.wikipedia.org/wiki/Siouan_languages)
     *
     * @since 1.10
     */
    sio("Siouan languages"),

    /**
     * [Sino-Tibetan languages](http://en.wikipedia.org/wiki/Sino-Tibetan_languages)
     *
     * @since 1.10
     */
    sit("Sino-Tibetan languages"),

    /**
     * [Slavic languages](http://en.wikipedia.org/wiki/Slavic_languages)
     *
     * @since 1.10
     */
    sla("Slavic languages"),

    /**
     * [Slovak](http://en.wikipedia.org/wiki/Slovak_language)
     * ([sk][LanguageCode.sk]) for terminology aplications.
     *
     * @see .slo
     */
    slk("Slovak") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sk
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return slo
        }
    },

    /**
     * [Slovak](http://en.wikipedia.org/wiki/Slovak_language)
     * ([sk][LanguageCode.sk]) for bibliographic aplications.
     *
     * @see .slk
     */
    slo("Slovak") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sk
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return slk
        }
    },

    /**
     * [Slovene](http://en.wikipedia.org/wiki/Slovene_language)
     * ([sl][LanguageCode.sl]).
     */
    slv("Slovene") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sl
        }
    },

    /**
     * [Southern Sami](http://en.wikipedia.org/wiki/Southern_Sami_language)
     *
     * @since 1.10
     */
    sma("Southern Sami"),

    /**
     * [Northern Sami](http://en.wikipedia.org/wiki/Northern_Sami)
     * ([se][LanguageCode.se]).
     */
    sme("Northern Sami") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.se
        }
    },

    /**
     * [Sami languages](http://en.wikipedia.org/wiki/Sami_languages)
     *
     * @since 1.10
     */
    smi("Sami languages"),

    /**
     * [Lule Sami](http://en.wikipedia.org/wiki/Lule_Sami_language)
     *
     * @since 1.10
     */
    smj("Lule Sami"),

    /**
     * [Inari Sami](http://en.wikipedia.org/wiki/Inari_Sami_language)
     *
     * @since 1.10
     */
    smn("Inari Sami"),

    /**
     * [Samoan](http://en.wikipedia.org/wiki/Samoan_language)
     * ([sm][LanguageCode.sm]).
     */
    smo("Samoan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sm
        }
    },

    /**
     * [Skolt Sami](http://en.wikipedia.org/wiki/Skolt_Sami_language)
     *
     * @since 1.10
     */
    sms("Skolt Sami"),

    /**
     * [Shona](http://en.wikipedia.org/wiki/Shona_language)
     * ([sn][LanguageCode.sn]).
     */
    sna("Shona") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sn
        }
    },

    /**
     * [Sindhi](http://en.wikipedia.org/wiki/Sindhi_language)
     * ([sd][LanguageCode.sd]).
     */
    snd("Sindhi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sd
        }
    },

    /**
     * [Soninke](http://en.wikipedia.org/wiki/Soninke_language)
     *
     * @since 1.10
     */
    snk("Soninke"),

    /**
     * [Sogdian](http://en.wikipedia.org/wiki/Sogdian_language)
     *
     * @since 1.10
     */
    sog("Sogdian"),

    /**
     * [Somali](http://en.wikipedia.org/wiki/Somali_language)
     * ([so][LanguageCode.so]).
     */
    som("Somali") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.so
        }
    },

    /**
     * [Songhai languages](http://en.wikipedia.org/wiki/Songhai_languages)
     *
     * @since 1.10
     */
    son("Songhai languages"),

    /**
     * [Southern Sotho](http://en.wikipedia.org/wiki/Sotho_language)
     * ([st][LanguageCode.st]).
     */
    sot("Southern Sotho") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.st
        }
    },

    /**
     * [Spanish](http://en.wikipedia.org/wiki/Spanish_language)
     * ([es][LanguageCode.es]).
     */
    spa("Spanish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.es
        }
    },

    /**
     * [Albanian](http://en.wikipedia.org/wiki/Albanian_language)
     * ([sq][LanguageCode.sq]) for terminology applications.
     *
     * @see .alb
     */
    sqi("Albanian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sq
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return alb
        }
    },

    /**
     * [Albanian languages](http://en.wikipedia.org/wiki/Albanian_languages)
     *
     * @since 1.10
     */
    sqj("Albanian languages"),

    /**
     * [Sardinian](http://en.wikipedia.org/wiki/Sardinian_language)
     * ([sc][LanguageCode.sc]).
     */
    srd("Sardinian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sc
        }
    },

    /**
     * [Sranan Tongo](http://en.wikipedia.org/wiki/Sranan_Tongo_language)
     *
     * @since 1.10
     */
    srn("Sranan Tongo"),

    /**
     * [Serbian](http://en.wikipedia.org/wiki/Serbian_language)
     * ([sr][LanguageCode.sr]).
     */
    srp("Serbian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sr
        }
    },

    /**
     * [Serer](http://en.wikipedia.org/wiki/Serer_language)
     *
     * @since 1.10
     */
    srr("Serer"),

    /**
     * [Nilo-Saharan languages](http://en.wikipedia.org/wiki/Nilo-Saharan_languages)
     *
     * @since 1.10
     */
    ssa("Nilo-Saharan languages"),

    /**
     * [Swati](http://en.wikipedia.org/wiki/Swati_language)
     * ([ss][LanguageCode.ss]).
     */
    ssw("Swati") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ss
        }
    },

    /**
     * [Sukuma](http://en.wikipedia.org/wiki/Sukuma_language)
     *
     * @since 1.10
     */
    suk("Sukuma"),

    /**
     * [Sundanese](http://en.wikipedia.org/wiki/Sundanese_language)
     * ([su][LanguageCode.su]).
     */
    sun("Sundanese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.su
        }
    },

    /**
     * [Susu](http://en.wikipedia.org/wiki/Susu_language)
     *
     * @since 1.10
     */
    sus("Susu"),

    /**
     * [Sumerian](http://en.wikipedia.org/wiki/Sumerian_language)
     *
     * @since 1.10
     */
    sux("Sumerian"),

    /**
     * [Swahili](http://en.wikipedia.org/wiki/Swahili_language) (macrolanguage)
     * ([sw][LanguageCode.sw]).
     */
    swa("Swahili") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sw
        }
    },

    /**
     * [Swedish](http://en.wikipedia.org/wiki/Swedish_language)
     * ([sv][LanguageCode.sv]).
     */
    swe("Swedish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.sv
        }
    },

    /**
     * [Classical Syriac](http://en.wikipedia.org/wiki/Classical_Syriac_language)
     *
     * @since 1.10
     */
    syc("Classical Syriac"),

    /**
     * [Samoyedic languages](http://en.wikipedia.org/wiki/Samoyedic_languages)
     *
     * @since 1.10
     */
    syd("Samoyedic languages"),

    /**
     * [Syriac](http://en.wikipedia.org/wiki/Syriac_language)
     *
     * @since 1.10
     */
    syr("Syriac"),

    /**
     * [Tahitian](http://en.wikipedia.org/wiki/Tahitian_language)
     * ([ty][LanguageCode.ty]).
     */
    tah("Tahitian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ty
        }
    },

    /**
     * [Tai languages](http://en.wikipedia.org/wiki/Tai_languages)
     *
     * @since 1.10
     */
    tai("Tai languages"),

    /**
     * [Tamil](http://en.wikipedia.org/wiki/Tamil_language)
     * ([ta][LanguageCode.ta]).
     */
    tam("Tamil") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ta
        }
    },

    /**
     * [Tatar](http://en.wikipedia.org/wiki/Tatar_language)
     * ([tt][LanguageCode.tt]).
     */
    tat("Tatar") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.tt
        }
    },

    /**
     * [Tibeto-Burman languages](http://en.wikipedia.org/wiki/Tibeto-Burman_languages)
     *
     * @since 1.10
     */
    tbq("Tibeto-Burman languages"),

    /**
     * [Telugu](http://en.wikipedia.org/wiki/Telugu_language)
     * ([te][LanguageCode.te]).
     */
    tel("Telugu") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.te
        }
    },

    /**
     * [Timne](http://en.wikipedia.org/wiki/Timne_language)
     *
     * @since 1.10
     */
    tem("Timne"),

    /**
     * [Tereno](http://en.wikipedia.org/wiki/Tereno_language)
     *
     * @since 1.10
     */
    ter("Tereno"),

    /**
     * [Tetum](http://en.wikipedia.org/wiki/Tetum_language)
     *
     * @since 1.10
     */
    tet("Tetum"),

    /**
     * [Tajik](http://en.wikipedia.org/wiki/Tajik_language)
     * ([tg][LanguageCode.tg]).
     */
    tgk("Tajik") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.tg
        }
    },

    /**
     * [Tagalog](http://en.wikipedia.org/wiki/Tagalog_language)
     * ([tl][LanguageCode.tl]).
     */
    tgl("Tagalog") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.tl
        }
    },

    /**
     * [Thai](http://en.wikipedia.org/wiki/Thai_language)
     * ([th][LanguageCode.th]).
     */
    tha("Thai") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.th
        }
    },

    /**
     * [Tibetan](http://en.wikipedia.org/wiki/Standard_Tibetan)
     * ([bo][LanguageCode.bo]) for terminology applications.
     *
     * @see .bod
     */
    tib("Tibetan") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.bo
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return bod
        }
    },

    /**
     * [Tigre](http://en.wikipedia.org/wiki/Tigre_language)
     *
     * @since 1.10
     */
    tig("Tigre"),

    /**
     * [Tigrinya](http://en.wikipedia.org/wiki/Tigrinya_language)
     * ([ti][LanguageCode.ti]).
     */
    tir("Tigrinya") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ti
        }
    },

    /**
     * [Tiv](http://en.wikipedia.org/wiki/Tiv_language)
     *
     * @since 1.10
     */
    tiv("Tiv"),

    /**
     * [Tokelau](http://en.wikipedia.org/wiki/Tokelau_language)
     *
     * @since 1.10
     */
    tkl("Tokelau"),

    /**
     * [Klingon](http://en.wikipedia.org/wiki/Klingon_language)
     *
     * @since 1.10
     */
    tlh("Klingon"),

    /**
     * [Tlingit](http://en.wikipedia.org/wiki/Tlingit_language)
     *
     * @since 1.10
     */
    tli("Tlingit"),

    /**
     * [Tamashek](http://en.wikipedia.org/wiki/Tamashek_language)
     *
     * @since 1.10
     */
    tmh("Tamashek"),

    /**
     * [Tonga (Nyasa)](http://en.wikipedia.org/wiki/Tonga_language_(Nyasa))
     *
     * @since 1.10
     */
    tog("Tonga (Nyasa)"),

    /**
     * [Tonga (Tonga Islands)](http://en.wikipedia.org/wiki/Tonga_language_(Tonga_Islands))
     * ([to][LanguageCode.to]).
     */
    ton("Tonga (Tonga Islands)") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.to
        }
    },

    /**
     * [Tok Pisin](http://en.wikipedia.org/wiki/Tok_Pisin_language)
     *
     * @since 1.10
     */
    tpi("Tok Pisin"),

    /**
     * [Turkic languages](http://en.wikipedia.org/wiki/Turkic_languages)
     *
     * @since 1.10
     */
    trk("Turkic languages"),

    /**
     * [Tsimshian](http://en.wikipedia.org/wiki/Tsimshian_language)
     *
     * @since 1.10
     */
    tsi("Tsimshian"),

    /**
     * [Tswana](http://en.wikipedia.org/wiki/Tswana_language)
     * ([tn][LanguageCode.tn]).
     */
    tsn("Tswana") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.tn
        }
    },

    /**
     * [Tsonga](http://en.wikipedia.org/wiki/Tsonga_language)
     * ([ts][LanguageCode.ts]).
     */
    tso("Tsonga") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ts
        }
    },

    /**
     * [Turkmen](http://en.wikipedia.org/wiki/Turkmen_language)
     * ([tk][LanguageCode.tk]).
     */
    tuk("Turkmen") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.tk
        }
    },

    /**
     * [Tumbuka](http://en.wikipedia.org/wiki/Tumbuka_language)
     *
     * @since 1.10
     */
    tum("Tumbuka"),

    /**
     * [Tupi languages](http://en.wikipedia.org/wiki/Tupi_languages)
     *
     * @since 1.10
     */
    tup("Tupi languages"),

    /**
     * [Turkish](http://en.wikipedia.org/wiki/Turkish_language)
     * ([tr][LanguageCode.tr]).
     */
    tur("Turkish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.tr
        }
    },

    /**
     * [Altaic languages](http://en.wikipedia.org/wiki/Altaic_languages)
     *
     * @since 1.10
     */
    tut("Altaic languages"),

    /**
     * [Tungus languages](http://en.wikipedia.org/wiki/Tungus_languages)
     *
     * @since 1.10
     */
    tuw("Tungus languages"),

    /**
     * [Tuvalu](http://en.wikipedia.org/wiki/Tuvalu_language)
     *
     * @since 1.10
     */
    tvl("Tuvalu"),

    /**
     * [Twi](http://en.wikipedia.org/wiki/Twi)
     * ([tw][LanguageCode.tw]).
     */
    twi("Twi") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.tw
        }
    },

    /**
     * [Tuvinian](http://en.wikipedia.org/wiki/Tuvinian_language)
     *
     * @since 1.10
     */
    tyv("Tuvinian"),

    /**
     * [Udmurt](http://en.wikipedia.org/wiki/Udmurt_language)
     *
     * @since 1.10
     */
    udm("Udmurt"),

    /**
     * [Ugaritic](http://en.wikipedia.org/wiki/Ugaritic_language)
     *
     * @since 1.10
     */
    uga("Ugaritic"),

    /**
     * [Uighur](http://en.wikipedia.org/wiki/Uyghur_language)
     * ([ug][LanguageCode.ug]).
     */
    uig("Uighur") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ug
        }
    },

    /**
     * [Ukrainian](http://en.wikipedia.org/wiki/Ukrainian_language)
     * ([uk][LanguageCode.uk]).
     */
    ukr("Ukrainian") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.uk
        }
    },

    /**
     * [Umbundu](http://en.wikipedia.org/wiki/Umbundu_language)
     *
     * @since 1.10
     */
    umb("Umbundu"),

    /**
     * Undetermined.
     *
     * @since 1.10
     */
    und("Undetermined"),

    /**
     * [Urdu](http://en.wikipedia.org/wiki/Urdu)
     * ([ur][LanguageCode.ur]).
     */
    urd("Urdu") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ur
        }
    },

    /**
     * [Uralic languages](http://en.wikipedia.org/wiki/Uralic_languages)
     *
     * @since 1.10
     */
    urj("Uralic languages"),

    /**
     * [Uzbek](http://en.wikipedia.org/wiki/Uzbek_language)
     * ([uz][LanguageCode.uz]).
     */
    uzb("Uzbek") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.uz
        }
    },

    /**
     * [Vai](http://en.wikipedia.org/wiki/Vai_language)
     *
     * @since 1.10
     */
    vai("Vai"),

    /**
     * [Venda](http://en.wikipedia.org/wiki/Venda_language)
     * ([ve][LanguageCode.ve]).
     */
    ven("Venda") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.ve
        }
    },

    /**
     * [Vietnamese](http://en.wikipedia.org/wiki/Vietnamese_language)
     * ([vi][LanguageCode.vi]).
     */
    vie("Vietnamese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.vi
        }
    },

    /**
     * [Volapk](http://en.wikipedia.org/wiki/Volap%C3%BCk)
     * ([vo][LanguageCode.vo]).
     */
    vol("Volap\u00FCk") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.vo
        }
    },

    /**
     * [Votic](http://en.wikipedia.org/wiki/Votic_language)
     *
     * @since 1.10
     */
    vot("Votic"),

    /**
     * [Wakashan languages](http://en.wikipedia.org/wiki/Wakashan_languages)
     *
     * @since 1.10
     */
    wak("Wakashan languages"),

    /**
     * [Wolaytta](http://en.wikipedia.org/wiki/Wolaytta_language)
     *
     * @since 1.10
     */
    wal("Wolaytta"),

    /**
     * [Waray (Philippines)](http://en.wikipedia.org/wiki/Waray_language_(Philippines))
     *
     * @since 1.10
     */
    war("Waray (Philippines)"),

    /**
     * [Washo](http://en.wikipedia.org/wiki/Washo_language)
     *
     * @since 1.10
     */
    was("Washo"),

    /**
     * [Welsh](http://en.wikipedia.org/wiki/Welsh_language)
     * ([cy][LanguageCode.cy]) for bibliographic applications.
     *
     * @see .cym
     */
    wel("Welsh") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.cy
        }

        override fun getUsage(): Usage {
            return Usage.BIBLIOGRAPHY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return cym
        }
    },

    /**
     * [Sorbian languages](http://en.wikipedia.org/wiki/Sorbian_languages)
     *
     * @since 1.10
     */
    wen("Sorbian languages"),

    /**
     * [Walloon](http://en.wikipedia.org/wiki/Walloon_language)
     * ([wa][LanguageCode.wa]).
     */
    wln("Walloon") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.wa
        }
    },

    /**
     * [Wolof](http://en.wikipedia.org/wiki/Wolof_language)
     * ([wo][LanguageCode.wo]).
     */
    wol("Wolof") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.wo
        }
    },

    /**
     * [Kalmyk](http://en.wikipedia.org/wiki/Kalmyk_language)
     *
     * @since 1.10
     */
    xal("Kalmyk"),

    /**
     * [Mongolian languages](http://en.wikipedia.org/wiki/Mongolian_languages)
     *
     * @since 1.10
     */
    xgn("Mongolian languages"),

    /**
     * [Xhosa](http://en.wikipedia.org/wiki/Xhosa_language)
     * ([xh][LanguageCode.xh]).
     */
    xho("Xhosa") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.xh
        }
    },

    /**
     * [Na-Dene languages](http://en.wikipedia.org/wiki/Na-Dene_languages)
     *
     * @since 1.10
     */
    xnd("Na-Dene languages"),

    /**
     * [Yao](http://en.wikipedia.org/wiki/Yao_language)
     *
     * @since 1.10
     */
    yao("Yao"),

    /**
     * [Yapese](http://en.wikipedia.org/wiki/Yapese_language)
     *
     * @since 1.10
     */
    yap("Yapese"),

    /**
     * [Yiddish](http://en.wikipedia.org/wiki/Yiddish_language)
     * ([yi][LanguageCode.yi]).
     */
    yid("Yiddish") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.yi
        }
    },

    /**
     * [Yoruba](http://en.wikipedia.org/wiki/Yoruba_language)
     * ([yo][LanguageCode.yo]).
     */
    yor("Yoruba") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.yo
        }
    },

    /**
     * [Yupik languages](http://en.wikipedia.org/wiki/Yupik_languages)
     *
     * @since 1.10
     */
    ypk("Yupik languages"),

    /**
     * [Zapotec](http://en.wikipedia.org/wiki/Zapotec_language)
     *
     * @since 1.10
     */
    zap("Zapotec"),

    /**
     * [Blissymbols](http://en.wikipedia.org/wiki/Blissymbols_language)
     *
     * @since 1.10
     */
    zbl("Blissymbols"),

    /**
     * [Zenaga](http://en.wikipedia.org/wiki/Zenaga_language)
     *
     * @since 1.10
     */
    zen("Zenaga"),

    /**
     * [Zhuang](http://en.wikipedia.org/wiki/Zhuang_languages)
     * ([za][LanguageCode.za]).
     */
    zha("Zhuang") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.za
        }
    },

    /**
     * [Chinese](http://en.wikipedia.org/wiki/Chinese_language)
     * ([zh][LanguageCode.zh]) for terminology applications.
     *
     * @see .chi
     */
    zho("Chinese") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.zh
        }

        override fun getUsage(): Usage {
            return Usage.TERMINOLOGY
        }

        override fun getSynonym(): LanguageAlpha3Code {
            return chi
        }
    },

    /**
     * [Chinese](http://en.wikipedia.org/wiki/Chinese_language) (family)
     *
     * @since 1.10
     */
    zhx("Chinese (family)"),

    /**
     * [East Slavic languages](http://en.wikipedia.org/wiki/East_Slavic_languages)
     *
     * @since 1.10
     */
    zle("East Slavic languages"),

    /**
     * [South Slavic languages](http://en.wikipedia.org/wiki/South_Slavic_languages)
     *
     * @since 1.10
     */
    zls("South Slavic languages"),

    /**
     * [West Slavic languages](http://en.wikipedia.org/wiki/West_Slavic_languages)
     *
     * @since 1.10
     */
    zlw("West Slavic languages"),

    /**
     * [Zande languages](http://en.wikipedia.org/wiki/Zande_languages)
     *
     * @since 1.10
     */
    znd("Zande languages"),

    /**
     * [Zulu](http://en.wikipedia.org/wiki/Zulu_language)
     * ([zu][LanguageCode.zu]).
     */
    zul("Zulu") {
        override fun getAlpha2(): LanguageCode {
            return LanguageCode.zu
        }
    },

    /**
     * [Zuni](http://en.wikipedia.org/wiki/Zuni_language)
     *
     * @since 1.10
     */
    zun("Zuni"),

    /**
     * No linguistic content.
     *
     * @since 1.10
     */
    zxx("No linguistic content"),

    /**
     * [Zaza](http://en.wikipedia.org/wiki/Zaza_language)
     *
     * @since 1.10
     */
    zza("Zaza");

    /**
     * The usage of this language code.
     *
     * @since 1.1
     */
    enum class Usage {
        /**
         * Code for terminology applications (ISO 639-2/T).
         */
        TERMINOLOGY,

        /**
         * Code for bibliographic applications (ISO 639-2/B).
         */
        BIBLIOGRAPHY,

        /**
         * For all applications including both terminology and
         * bibliographic applications.
         */
        COMMON
    }
    /**
     * Get the language name.
     *
     * @return The language name.
     */

    /**
     * Get [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
     * language code.
     *
     * @return [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
     * language code. This method may return `null`.
     */
    open fun getAlpha2(): LanguageCode? {
        return null
    }

    /**
     * Get the usage of this language code.
     *
     *
     *
     * Most language codes return [Usage.COMMON].
     *
     *
     * @return The usage of this language code.
     */
    open fun getUsage(): Usage {
        return Usage.COMMON
    }

    /**
     * Get the synonym of this code.
     *
     *
     *
     * In most cases, this method simply returns `this` object. On
     * the other hand, language codes that have two alpha-3 codes, namely, ISO
     * 639-2/T code ("terminological" code) and ISO 639-2/B code
     * ("bibliographic" code), return their counterparts. For example,
     * [LanguageAlpha3Code.deu][.deu]`.getSynonym()` returns
     * [LanguageAlpha3Code.ger][.ger].
     *
     *
     * @return [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
     * language code.
     */
    open fun getSynonym(): LanguageAlpha3Code? {
        return this
    }

    /**
     * Get the bibliographic code of this language.
     *
     *
     *
     * Most languages have just one [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code and they
     * simply return `this` object. Only ISO 639-2/T codes
     * ("terminological" codes) return counterpart objects. For example,
     * [LanguageAlpha3Code.fra]`.getAlpha3B()`
     * returns [LanguageAlpha3Code.fre].
     *
     *
     * @return The bibliographic code of this language.
     */
    open fun getAlpha3B(): LanguageAlpha3Code? {
        if (getUsage() == Usage.BIBLIOGRAPHY) {
            return this
        } else {
            return getSynonym()
        }
    }

    /**
     * Get the terminological code of this language.
     *
     *
     *
     * Most languages have just one [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code and they
     * simply return `this` object. Only ISO 639-2/B codes
     * ("bibliographic" codes) return counterpart objects. For example,
     * [LanguageAlpha3Code.fre]`.getAlpha3T()`
     * returns [LanguageAlpha3Code.fra].
     *
     *
     *
     * @return The terminological code of this language.
     */
    open fun getAlpha3T(): LanguageAlpha3Code? {
        if (getUsage() == Usage.TERMINOLOGY) {
            return this
        } else {
            return getSynonym()
        }
    }

    companion object {
        /**
         * Get a `LanguageAlpha3Code` that corresponds to a given
         * [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) code
         * (2-letter lowercase code) or
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code
         * (3-letter lowercase code).
         *
         *
         *
         * This method calls [getByCode][.getByCode]`(code, true)`.
         * Note that the behavior has changed since the version 1.13. In the older versions,
         * this method was an alias of `getByCode(code, false)`.
         *
         *
         * @param code An [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
         * code (2-letter lowercase code) or an
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
         * code (3-letter lowercase code). Or "undefined".
         * Note that if the given code is one of legacy language codes
         * ("iw", "ji" and "in"), it is treated as its official counterpart
         * ("he", "yi" and "id"), respectively. For example, if "in" is
         * given, this method returns [LanguageAlpha3Code.ind][.ind].
         * @return A `LanguageAlpha3Code` instance, or `null` if not found.
         * If [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
         * code (2-letter code) is given and the language has two
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
         * codes, ISO 639/T code ("terminological" code) is returned.
         */
        fun getByCode(code: String?): LanguageAlpha3Code? {
            return getByCode(code, true)
        }

        /**
         * Get a `LanguageAlpha3Code` that corresponds to a given
         * [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) code
         * (2-letter lowercase code) or
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code
         * (3-letter lowercase code).
         *
         *
         *
         * This method calls [getByCode][.getByCode]`(code, false)`.
         *
         *
         * @param code An [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
         * code (2-letter lowercase code) or an
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
         * code (3-letter lowercase code). Or "undefined" (case insensitive).
         * Note that if the given code is one of legacy language codes
         * ("iw", "ji" and "in"), it is treated as its official counterpart
         * ("he", "yi" and "id"), respectively. For example, if "in" is
         * given, this method returns [LanguageAlpha3Code.ind][.ind].
         * @return A `LanguageAlpha3Code` instance, or `null` if not found.
         * If [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
         * code (2-letter code) is given and the language has two
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
         * codes, ISO 639/T code ("terminological" code) is returned.
         * @since 1.13
         */
        fun getByCodeIgnoreCase(code: String?): LanguageAlpha3Code? {
            return getByCode(code, false)
        }

        /**
         * Get a `LanguageAlpha3Code` that corresponds to a given
         * [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) code
         * (2-letter lowercase code) or
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code
         * (3-letter lowercase code).
         *
         * @param code          An [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
         * code (2-letter lowercase code) or an
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
         * code (3-letter lowercase code). Or "undefined" (its case
         * sensitivity depends on the value of `caseSensitive`).
         * Note that if the given code is one of legacy language codes
         * ("iw", "ji" and "in"), it is treated as its official counterpart
         * ("he", "yi" and "id"), respectively. For example, if "in" is
         * given, this method returns [LanguageAlpha3Code.ind][.ind].
         * @param caseSensitive If `true`, the given code should consist of lowercase letters only.
         * If `false`, this method internally canonicalizes the given code by
         * [String.toLowerCase] and then performs search. For
         * example, `getByCode("JPN", true)` returns `null`, but on the
         * other hand, `getByCode("JPN", false)` returns [                      LanguageAlpha3Code.jpn][.jpn].
         *
         *
         * As an exceptional case, both `getByCode("New", true)` and
         * `getByCode("new", true)` return [.New] (Newari).
         * @return A `LanguageAlpha3Code` instance, or `null` if not found.
         * If [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
         * code (2-letter code) is given and the language has two
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
         * codes, ISO 639/T code ("terminological" code) is returned.
         */
        fun getByCode(code: String?, caseSensitive: Boolean): LanguageAlpha3Code? {
            var c = code
            c = canonicalize(c, caseSensitive)
            if (c == null) {
                return null
            }
            when (c.length) {
                2 -> {
                }
                3, 9 -> return getByEnumName(c)
                else -> return null
            }
            c = LanguageCode.canonicalize(c, caseSensitive)
            val alpha2: LanguageCode = LanguageCode.getByEnumName(c) ?: return null
            return alpha2.getAlpha3()
        }

        fun getByEnumName(name: String?): LanguageAlpha3Code? {
            return try {
                return name?.let { valueOf(it) }
            } catch (e: IllegalArgumentException) {
                null
            }
        }

        private fun canonicalize(code: String?, caseSensitive: Boolean): String? {
            var c = code
            if (c == null || c.isEmpty()) {
                return null
            }
            if (!caseSensitive) {
                c = c.lowercase()
            }

            // A special case for Newari.
            if (c == "new") {
                c = "New"
            }
            return c
        }

        /**
         * Get a list of `LanguageAlpha3Code` by a name regular expression.
         *
         *
         *
         * This method is almost equivalent to [ findByName][.findByName]`(Pattern.compile(regex))`.
         *
         *
         * @param regex Regular expression for names.
         * @return List of `LanguageAlpha3Code`. If nothing has matched,
         * an empty list is returned.
         * @throws IllegalArgumentException               `regex` is `null`.
         * @throws java.util.regex.PatternSyntaxException `regex` failed to be compiled.
         * @since 1.11
         */
        fun findByName(regex: String?): List<LanguageAlpha3Code> {
            requireNotNull(regex) { "regex is null." }

            // Compile the regular expression. This may throw
            // java.util.regex.PatternSyntaxException.
            val pattern = Pattern.compile(regex)
            return findByName(pattern)
        }

        /**
         * Get a list of `LanguageAlpha3Code` by a name pattern.
         *
         *
         *
         * For example, the list obtained by the code snippet below:
         *
         *
         * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
         * Pattern pattern = Pattern.compile(<span style="color: darkred;">"Old.*"</span>);
         * List&lt;LanguageAlpha3Code&gt; list = LanguageAlpha3Code.findByName(pattern);</pre>
         *
         *
         *
         * contains 7 `LanguageAlpha3Code`s as listed below.
         *
         *
         *
         *  1. [.ang] : Old English
         *  1. [.fro] : Old French
         *  1. [.goh] : Old High German
         *  1. [.non] : Old Norse
         *  1. [.peo] : Old Persian
         *  1. [.pro] : Old Provenal
         *  1. [.sga] : Old Irish
         *
         *
         * @param pattern Pattern to match names.
         * @return List of `LanguageAlpha3Code`. If nothing has matched,
         * an empty list is returned.
         * @throws IllegalArgumentException `pattern` is `null`.
         * @since 1.11
         */
        fun findByName(pattern: Pattern?): List<LanguageAlpha3Code> {
            requireNotNull(pattern) { "pattern is null." }
            val list: MutableList<LanguageAlpha3Code> = ArrayList()
            for (entry in values()) {
                // If the name matches the given pattern.
                if (pattern.matcher(entry.value).matches()) {
                    list.add(entry)
                }
            }
            return list
        }
    }
}
