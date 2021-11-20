/*
 * Copyright (C) 2012-2014 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ee.studiofrancium.common.i18n

import ee.studiofrancium.common.i18n.LanguageCode.ar
import java.util.*
import java.util.regex.Pattern

/**
 * [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
 * language code.
 *
 *
 *
 * Enum names of this enum themselves are represented by
 * [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) code
 * (2-letter lower-case alphabets).
 *
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
 * <span style="color: darkgreen;">// List all the language codes.</span>
 * for (LanguageCode code : LanguageCode.values())
 * {
 * <span style="color: darkgreen;">// For example, "[ar] Arabic" is printed.</span>
 * System.out.format(<span style="color: darkred;">"[%s] %s\n"</span>, code, code.[.getName]);
 * }
 *
 * <span style="color: darkgreen;">// Get a LanguageCode instance by ISO 639-1 code.</span>
 * LanguageCode code = LanguageCode.[getByCode][.getByCode](<span style="color: darkred;">"fr"</span>);
 *
 * <span style="color: darkgreen;">// Convert to a Locale instance.</span>
 * Locale locale = code.[.toLocale];
 *
 * <span style="color: darkgreen;">// Get a LanguageCode by a Locale instance.</span>
 * code = LanguageCode.[getByLocale][.getByLocale](locale);
 *
 * <span style="color: darkgreen;">// Get a list by a regular expression for names.
 * //
 * // The list will contain:
 * //
 * //     LanguageCode.an : Aragonese
 * //     LanguageCode.ja : Japanese
 * //     LanguageCode.jv : Javanese
 * //     LanguageCode.su : Sundanese
 * //     LanguageCode.zh : Chinese
 * //</span>
 * List&lt;LanguageCode&gt; list = LanguageCode.[findByName][.findByName](<span style="color: darkred;">".*nese"</span>);
</pre> *
 *
 * @author Takahiko Kawasaki
 */
enum class LanguageCode {
    /**
     * Undefined.
     *
     *
     *
     * This is not an official ISO 639-1 code.
     *
     *
     * @since 1.14
     */
    undefined {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.undefined
        }
    },

    /**
     * [Afar](http://en.wikipedia.org/wiki/Afar_language)
     * ([aar][LanguageAlpha3Code.aar]).
     */
    aa {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.aar
        }
    },

    /**
     * [Abkhaz](http://en.wikipedia.org/wiki/Abkhaz_language)
     * ([abk][LanguageAlpha3Code.abk]).
     */
    ab {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.abk
        }
    },

    /**
     * [Avestan](http://en.wikipedia.org/wiki/Avestan_language)
     * ([ave][LanguageAlpha3Code.ave]).
     */
    ae {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ave
        }
    },

    /**
     * [Afrikaans](http://en.wikipedia.org/wiki/Afrikaans_language)
     * ([afr][LanguageAlpha3Code.afr]).
     */
    af {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.afr
        }
    },

    /**
     * [Akan](http://en.wikipedia.org/wiki/Akan_language)
     * ([aka][LanguageAlpha3Code.aka]).
     */
    ak {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.aka
        }
    },

    /**
     * [Amharic](http://en.wikipedia.org/wiki/Amharic_language)
     * ([amh][LanguageAlpha3Code.amh]).
     */
    am {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.amh
        }
    },

    /**
     * [Aragonese](http://en.wikipedia.org/wiki/Aragonese_language)
     * ([arg][LanguageAlpha3Code.arg]).
     */
    an {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.arg
        }
    },

    /**
     * [Arabic](http://en.wikipedia.org/wiki/Arabic_language)
     * ([ara][LanguageAlpha3Code.ara]).
     */
    ar {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ara
        }
    },

    /**
     * [Assamese](http://en.wikipedia.org/wiki/Assamese_language)
     * ([asm][LanguageAlpha3Code.asm]).
     */
    `as` {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.asm
        }
    },

    /**
     * [Avaric](http://en.wikipedia.org/wiki/Avar_language)
     * ([ava][LanguageAlpha3Code.ava]).
     */
    av {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ava
        }
    },

    /**
     * [Aymara](http://en.wikipedia.org/wiki/Aymara_language)
     * ([aym][LanguageAlpha3Code.aym]).
     */
    ay {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.aym
        }
    },

    /**
     * [Azerbaijani](http://en.wikipedia.org/wiki/Azerbaijani_language)
     * ([aze][LanguageAlpha3Code.aze]).
     */
    az {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.aze
        }
    },

    /**
     * [Bashkir](http://en.wikipedia.org/wiki/Bashkir_language)
     * ([bak][LanguageAlpha3Code.bak]).
     */
    ba {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bak
        }
    },

    /**
     * [Belarusian](http://en.wikipedia.org/wiki/Belarusian_language)
     * ([bel][LanguageAlpha3Code.bel]).
     */
    be {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bel
        }
    },

    /**
     * [Bulgarian](http://en.wikipedia.org/wiki/Bulgarian_language)
     * ([bul][LanguageAlpha3Code.bul]).
     */
    bg {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bul
        }
    },

    /**
     * [Bihari](http://en.wikipedia.org/wiki/Bihari_languages)
     * ([bih][LanguageAlpha3Code.bih]).
     */
    bh {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bih
        }
    },

    /**
     * [Bislama](http://en.wikipedia.org/wiki/Bislama_language)
     * ([bis][LanguageAlpha3Code.bis]).
     */
    bi {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bis
        }
    },

    /**
     * [Bambara](http://en.wikipedia.org/wiki/Bambara_language)
     * ([bam][LanguageAlpha3Code.bam]).
     */
    bm {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bam
        }
    },

    /**
     * [Bengali](http://en.wikipedia.org/wiki/Bengali_language)
     * ([ben][LanguageAlpha3Code.ben]).
     */
    bn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ben
        }
    },

    /**
     * [Tibetan](http://en.wikipedia.org/wiki/Standard_Tibetan)
     * ([bod][LanguageAlpha3Code.bod], [tib][LanguageAlpha3Code.tib]).
     */
    bo {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bod
        }
    },

    /**
     * [Breton](http://en.wikipedia.org/wiki/Breton_language)
     * ([bre][LanguageAlpha3Code.bre]).
     */
    br {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bre
        }
    },

    /**
     * [Bosnian](http://en.wikipedia.org/wiki/Bosnian_language)
     * ([bos][LanguageAlpha3Code.bos]).
     */
    bs {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.bos
        }
    },

    /**
     * [Catalan](http://en.wikipedia.org/wiki/Catalan_language)
     * ([cat][LanguageAlpha3Code.cat]).
     */
    ca {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.cat
        }
    },

    /**
     * [Chechen](http://en.wikipedia.org/wiki/Chechen_language)
     * ([che][LanguageAlpha3Code.che]).
     */
    ce {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.che
        }
    },

    /**
     * [Chamorro](http://en.wikipedia.org/wiki/Chamorro_language)
     * ([cha][LanguageAlpha3Code.cha]).
     */
    ch {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.cha
        }
    },

    /**
     * [Corsican](http://en.wikipedia.org/wiki/Corsican_language)
     * ([cos][LanguageAlpha3Code.cos]).
     */
    co {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.cos
        }
    },

    /**
     * [Cree](http://en.wikipedia.org/wiki/Cree_language)
     * ([cre][LanguageAlpha3Code.cre]).
     */
    cr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.cre
        }
    },

    /**
     * [Czech](http://en.wikipedia.org/wiki/Czech_language)
     * ([ces][LanguageAlpha3Code.ces], [cze][LanguageAlpha3Code.cze]).
     */
    cs {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ces
        }
    },

    /**
     * [Church Slavonic](http://en.wikipedia.org/wiki/Old_Church_Slavonic)
     * ([chu][LanguageAlpha3Code.chu]).
     */
    cu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.chu
        }
    },

    /**
     * [Chuvash](http://en.wikipedia.org/wiki/Chuvash_language)
     * ([chv][LanguageAlpha3Code.chv]).
     */
    cv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.chv
        }
    },

    /**
     * [Welsh](http://en.wikipedia.org/wiki/Welsh_language)
     * ([cym][LanguageAlpha3Code.cym], [wel][LanguageAlpha3Code.wel]).
     */
    cy {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.cym
        }
    },

    /**
     * [Danish](http://en.wikipedia.org/wiki/Danish_language)
     * ([dan][LanguageAlpha3Code.dan]).
     */
    da {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.dan
        }
    },

    /**
     * [German](http://en.wikipedia.org/wiki/German_language)
     * ([deu][LanguageAlpha3Code.deu], [ger][LanguageAlpha3Code.ger]).
     */
    de {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.deu
        }

        override fun toLocale(): Locale? {
            return Locale.GERMAN
        }
    },

    /**
     * [Dhivehi](http://en.wikipedia.org/wiki/Dhivehi_language)
     * ([div][LanguageAlpha3Code.div]).
     */
    dv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.div
        }
    },

    /**
     * [Dzongkha](http://en.wikipedia.org/wiki/Dzongkha_language)
     * ([dzo][LanguageAlpha3Code.dzo]).
     */
    dz {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.dzo
        }
    },

    /**
     * [Ewe](http://en.wikipedia.org/wiki/Ewe_language)
     * ([ewe][LanguageAlpha3Code.ewe]).
     */
    ee {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ewe
        }
    },

    /**
     * [Greek](http://en.wikipedia.org/wiki/Greek_language)
     * ([ell][LanguageAlpha3Code.ell], [gre][LanguageAlpha3Code.gre]).
     */
    el {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ell
        }
    },

    /**
     * [English](http://en.wikipedia.org/wiki/English_language)
     * ([eng][LanguageAlpha3Code.eng]).
     */
    en {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.eng
        }

        override fun toLocale(): Locale? {
            return Locale.ENGLISH
        }
    },

    /**
     * [Esperanto](http://en.wikipedia.org/wiki/Esperanto)
     * ([epo][LanguageAlpha3Code.epo]).
     */
    eo {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.epo
        }
    },

    /**
     * [Spanish](http://en.wikipedia.org/wiki/Spanish_language)
     * ([spa][LanguageAlpha3Code.spa]).
     */
    es {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.spa
        }
    },

    /**
     * [Estonian](http://en.wikipedia.org/wiki/Estonian_language)
     * ([est][LanguageAlpha3Code.est]).
     */
    et {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.est
        }
    },

    /**
     * [Basque](http://en.wikipedia.org/wiki/Basque_language)
     * ([eus][LanguageAlpha3Code.eus], [baq][LanguageAlpha3Code.baq]).
     */
    eu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.eus
        }
    },

    /**
     * [Persian](http://en.wikipedia.org/wiki/Persian_language)
     * ([fas][LanguageAlpha3Code.fas], [per][LanguageAlpha3Code.per]).
     */
    fa {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.fas
        }
    },

    /**
     * [Fula](http://en.wikipedia.org/wiki/Fula_language)
     * ([ful][LanguageAlpha3Code.ful]).
     */
    ff {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ful
        }
    },

    /**
     * [Finnish](http://en.wikipedia.org/wiki/Finnish_language)
     * ([fin][LanguageAlpha3Code.fin]).
     */
    fi {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.fin
        }
    },

    /**
     * [Fijian](http://en.wikipedia.org/wiki/Fijian_language)
     * ([fij][LanguageAlpha3Code.fij]).
     */
    fj {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.fij
        }
    },

    /**
     * [Faroese](http://en.wikipedia.org/wiki/Faroese_language)
     * ([fao][LanguageAlpha3Code.fao]).
     */
    fo {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.fao
        }
    },

    /**
     * [French](http://en.wikipedia.org/wiki/French_language)
     * ([fra][LanguageAlpha3Code.fra], [fre][LanguageAlpha3Code.fre]).
     */
    fr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.fra
        }

        override fun toLocale(): Locale? {
            return Locale.FRENCH
        }
    },

    /**
     * [West Frisian](http://en.wikipedia.org/wiki/West_Frisian_language)
     * ([fry][LanguageAlpha3Code.fry]).
     */
    fy {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.fry
        }
    },

    /**
     * [Irish](http://en.wikipedia.org/wiki/Irish_language)
     * ([gle][LanguageAlpha3Code.gle]).
     */
    ga {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.gle
        }
    },

    /**
     * [Scottish Gaelic](http://en.wikipedia.org/wiki/Scottish_Gaelic_language)
     * ([gla][LanguageAlpha3Code.gla]).
     */
    gd {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.gla
        }
    },

    /**
     * [Galician](http://en.wikipedia.org/wiki/Galician_language)
     * ([glg][LanguageAlpha3Code.glg]).
     */
    gl {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.glg
        }
    },

    /**
     * [Guaran](http://en.wikipedia.org/wiki/Guaran%C3%AD_language)
     * ([grn][LanguageAlpha3Code.grn]).
     */
    gn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.grn
        }
    },

    /**
     * [Gujarati](http://en.wikipedia.org/wiki/Gujarati_language)
     * ([guj][LanguageAlpha3Code.guj]).
     */
    gu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.guj
        }
    },

    /**
     * [Manx](http://en.wikipedia.org/wiki/Manx_language)
     * ([glv][LanguageAlpha3Code.glv]).
     */
    gv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.glv
        }
    },

    /**
     * [Hausa](http://en.wikipedia.org/wiki/Hausa_language)
     * ([hau][LanguageAlpha3Code.hau]).
     */
    ha {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.hau
        }
    },

    /**
     * [Hebrew](http://en.wikipedia.org/wiki/Hebrew_language)
     * ([heb][LanguageAlpha3Code.heb]).
     */
    he {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.heb
        }
    },

    /**
     * [Hindi](http://en.wikipedia.org/wiki/Hindi)
     * ([hin][LanguageAlpha3Code.hin]).
     */
    hi {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.hin
        }
    },

    /**
     * [Hiri Motu](http://en.wikipedia.org/wiki/Hiri_Motu_language)
     * ([hmo][LanguageAlpha3Code.hmo]).
     */
    ho {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.hmo
        }
    },

    /**
     * [Croatian](http://en.wikipedia.org/wiki/Croatian_language)
     * ([hrv][LanguageAlpha3Code.hrv]).
     */
    hr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.hrv
        }
    },

    /**
     * [Haitian](http://en.wikipedia.org/wiki/Haitian_Creole_language)
     * ([hat][LanguageAlpha3Code.hat]).
     */
    ht {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.hat
        }
    },

    /**
     * [Hungarian](http://en.wikipedia.org/wiki/Hungarian_language)
     * ([hun][LanguageAlpha3Code.hun]).
     */
    hu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.hun
        }
    },

    /**
     * [Armenian](http://en.wikipedia.org/wiki/Armenian_language)
     * ([hye][LanguageAlpha3Code.hye], [arm][LanguageAlpha3Code.arm]).
     */
    hy {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.hye
        }
    },

    /**
     * [Herero](http://en.wikipedia.org/wiki/Herero_language)
     * ([her][LanguageAlpha3Code.her]).
     */
    hz {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.her
        }
    },

    /**
     * [Interlingua](http://en.wikipedia.org/wiki/Interlingua)
     * ([ina][LanguageAlpha3Code.ina]).
     */
    ia {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ina
        }
    },

    /**
     * [Indonesian](http://en.wikipedia.org/wiki/Indonesian_language)
     * ([ind][LanguageAlpha3Code.ind]).
     */
    id {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ind
        }
    },

    /**
     * [Interlingue](http://en.wikipedia.org/wiki/Interlingue_language)
     * ([ile][LanguageAlpha3Code.ile]).
     */
    ie {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ile
        }
    },

    /**
     * [Igbo](http://en.wikipedia.org/wiki/Igbo_language)
     * ([ibo][LanguageAlpha3Code.ibo]).
     */
    ig {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ibo
        }
    },

    /**
     * [Nuosu](http://en.wikipedia.org/wiki/Nuosu_language)
     * ([iii][LanguageAlpha3Code.iii]).
     */
    ii {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.iii
        }
    },

    /**
     * [Inupiaq](http://en.wikipedia.org/wiki/Inupiaq_language)
     * ([ipk][LanguageAlpha3Code.ipk]).
     */
    ik {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ipk
        }
    },

    /**
     * [Ido](http://en.wikipedia.org/wiki/Ido)
     * ([ido][LanguageAlpha3Code.ido]).
     */
    io {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ido
        }
    },

    /**
     * [Icelandic](http://en.wikipedia.org/wiki/Icelandic_language)
     * ([isl][LanguageAlpha3Code.isl], [ice][LanguageAlpha3Code.ice]).
     */
    `is` {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.isl
        }
    },

    /**
     * [Italian](http://en.wikipedia.org/wiki/Italian_language)
     * ([ita][LanguageAlpha3Code.ita]).
     */
    it {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ita
        }

        override fun toLocale(): Locale? {
            return Locale.ITALIAN
        }
    },

    /**
     * [Inuktitut](http://en.wikipedia.org/wiki/Inuktitut)
     * ([iku][LanguageAlpha3Code.iku]).
     */
    iu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.iku
        }
    },

    /**
     * [Japanese](http://en.wikipedia.org/wiki/Japanese_language)
     * ([jpn][LanguageAlpha3Code.jpn]).
     */
    ja {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.jpn
        }

        override fun toLocale(): Locale? {
            return Locale.JAPANESE
        }
    },

    /**
     * [Javanese](http://en.wikipedia.org/wiki/Javanese_language)
     * ([jav][LanguageAlpha3Code.jav]).
     */
    jv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.jav
        }
    },

    /**
     * [Georgian](http://en.wikipedia.org/wiki/Georgian_language)
     * ([kat][LanguageAlpha3Code.kat], [geo][LanguageAlpha3Code.geo]).
     */
    ka {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kat
        }
    },

    /**
     * [Kongo](http://en.wikipedia.org/wiki/Kongo_language)
     * ([kon][LanguageAlpha3Code.kon]).
     */
    kg {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kon
        }
    },

    /**
     * [Kikuyu](http://en.wikipedia.org/wiki/Gikuyu_language)
     * ([kik][LanguageAlpha3Code.kik]).
     */
    ki {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kik
        }
    },

    /**
     * [Kwanyama](http://en.wikipedia.org/wiki/Kwanyama)
     * ([kua][LanguageAlpha3Code.kua]).
     */
    kj {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kua
        }
    },

    /**
     * [Kazakh](http://en.wikipedia.org/wiki/Kazakh_language)
     * ([kaz][LanguageAlpha3Code.kaz]).
     */
    kk {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kaz
        }
    },

    /**
     * [Kalaallisut](http://en.wikipedia.org/wiki/Kalaallisut_language)
     * ([kal][LanguageAlpha3Code.kal]).
     */
    kl {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kal
        }
    },

    /**
     * [Khmer](http://en.wikipedia.org/wiki/Khmer_language)
     * ([khm][LanguageAlpha3Code.khm]).
     */
    km {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.khm
        }
    },

    /**
     * [Kannada](http://en.wikipedia.org/wiki/Kannada_language)
     * ([kan][LanguageAlpha3Code.kan]).
     */
    kn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kan
        }
    },

    /**
     * [Korean](http://en.wikipedia.org/wiki/Korean_language)
     * ([kor][LanguageAlpha3Code.kor]).
     */
    ko {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kor
        }

        override fun toLocale(): Locale? {
            return Locale.KOREAN
        }
    },

    /**
     * [Kanuri](http://en.wikipedia.org/wiki/Kanuri_language)
     * ([kau][LanguageAlpha3Code.kau]).
     */
    kr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kau
        }
    },

    /**
     * [Kashmiri](http://en.wikipedia.org/wiki/Kashmiri_language)
     * ([kas][LanguageAlpha3Code.kas]).
     */
    ks {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kas
        }
    },

    /**
     * [Kurdish](http://en.wikipedia.org/wiki/Kurdish_language)
     * ([kur][LanguageAlpha3Code.kur]).
     */
    ku {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kur
        }
    },

    /**
     * [Komi](http://en.wikipedia.org/wiki/Komi_language)
     * ([kom][LanguageAlpha3Code.kom]).
     */
    kv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kom
        }
    },

    /**
     * [Cornish](http://en.wikipedia.org/wiki/Cornish_language)
     * ([cor][LanguageAlpha3Code.cor]).
     */
    kw {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.cor
        }
    },

    /**
     * [Kyrgyz](http://en.wikipedia.org/wiki/Kyrgyz_language)
     * ([kir][LanguageAlpha3Code.kir]).
     */
    ky {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kir
        }
    },

    /**
     * [Latin](http://en.wikipedia.org/wiki/Latin)
     * ([lat][LanguageAlpha3Code.lat]).
     */
    la {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lat
        }
    },

    /**
     * [Luxembourgish](http://en.wikipedia.org/wiki/Luxembourgish_language)
     * ([ltz][LanguageAlpha3Code.ltz]).
     */
    lb {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ltz
        }
    },

    /**
     * [Ganda](http://en.wikipedia.org/wiki/Luganda)
     * ([lug][LanguageAlpha3Code.lug]).
     */
    lg {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lug
        }
    },

    /**
     * [Limburgish](http://en.wikipedia.org/wiki/Limburgish_language)
     * ([lim][LanguageAlpha3Code.lim]).
     */
    li {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lim
        }
    },

    /**
     * [Lingala](http://en.wikipedia.org/wiki/Lingala_language)
     * ([lin][LanguageAlpha3Code.lin]).
     */
    ln {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lin
        }
    },

    /**
     * [Lao](http://en.wikipedia.org/wiki/Lao_language)
     * ([lao][LanguageAlpha3Code.lao]).
     */
    lo {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lao
        }
    },

    /**
     * [Lithuanian](http://en.wikipedia.org/wiki/Lithuanian_language)
     * ([lit][LanguageAlpha3Code.lit]).
     */
    lt {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lit
        }
    },

    /**
     * [Luba-Katanga](http://en.wikipedia.org/wiki/Tshiluba_language)
     * ([lub][LanguageAlpha3Code.lub]).
     */
    lu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lub
        }
    },

    /**
     * [Latvian](http://en.wikipedia.org/wiki/Latvian_language)
     * ([lav][LanguageAlpha3Code.lav]).
     */
    lv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.lav
        }
    },

    /**
     * [Malagasy](http://en.wikipedia.org/wiki/Malagasy_language)
     * ([mlg][LanguageAlpha3Code.mlg]).
     */
    mg {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mlg
        }
    },

    /**
     * [Marshallese](http://en.wikipedia.org/wiki/Marshallese_language)
     * ([mah][LanguageAlpha3Code.mah]).
     */
    mh {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mah
        }
    },

    /**
     * [M&#257;ori](http://en.wikipedia.org/wiki/M%C4%81ori_language)
     * ([mir][LanguageAlpha3Code.mri], [mao][LanguageAlpha3Code.mao]).
     */
    mi {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mri
        }
    },

    /**
     * [Macedonian](http://en.wikipedia.org/wiki/Macedonian_language)
     * ([mkd][LanguageAlpha3Code.mkd], [mac][LanguageAlpha3Code.mac])).
     */
    mk {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mkd
        }
    },

    /**
     * [Malayalam](http://en.wikipedia.org/wiki/Malayalam_language)
     * ([mal][LanguageAlpha3Code.mal]).
     */
    ml {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mal
        }
    },

    /**
     * [Mongolian](http://en.wikipedia.org/wiki/Mongolian_language)
     * ([mon][LanguageAlpha3Code.mon]).
     */
    mn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mon
        }
    },

    /**
     * [Marathi](http://en.wikipedia.org/wiki/Marathi_language)
     * ([mar][LanguageAlpha3Code.mar]).
     */
    mr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mar
        }
    },

    /**
     * [Malay](http://en.wikipedia.org/wiki/Malay_language)
     * ([msa][LanguageAlpha3Code.msa], [may][LanguageAlpha3Code.may]).
     */
    ms {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.msa
        }
    },

    /**
     * [Maltese](http://en.wikipedia.org/wiki/Maltese_language)
     * ([mlt][LanguageAlpha3Code.mlt]).
     */
    mt {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mlt
        }
    },

    /**
     * [Burmese](http://en.wikipedia.org/wiki/Burmese_language)
     * ([may][LanguageAlpha3Code.mya], [bur][LanguageAlpha3Code.bur]).
     */
    my {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.mya
        }
    },

    /**
     * [Nauru](http://en.wikipedia.org/wiki/Nauruan_language)
     * ([nau][LanguageAlpha3Code.nau]).
     */
    na {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nau
        }
    },

    /**
     * [Norwegian Bokml](http://en.wikipedia.org/wiki/Bokm%C3%A5l)
     * ([nob][LanguageAlpha3Code.nob]).
     */
    nb {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nob
        }
    },

    /**
     * [Northern Ndebele](http://en.wikipedia.org/wiki/Northern_Ndebele_language)
     * ([nde][LanguageAlpha3Code.nde]).
     */
    nd {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nde
        }
    },

    /**
     * [Nepali](http://en.wikipedia.org/wiki/Nepali_language)
     * ([nep][LanguageAlpha3Code.nep]).
     */
    ne {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nep
        }
    },

    /**
     * [Ndonga](http://en.wikipedia.org/wiki/Ndonga)
     * ([ndo][LanguageAlpha3Code.ndo]).
     */
    ng {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ndo
        }
    },

    /**
     * [Dutch](http://en.wikipedia.org/wiki/Dutch_language)
     * ([nld][LanguageAlpha3Code.nld], [dut][LanguageAlpha3Code.dut]).
     */
    nl {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nld
        }
    },

    /**
     * [Norwegian Nynorsk](http://en.wikipedia.org/wiki/Nynorsk)
     * ([nno][LanguageAlpha3Code.nno]).
     */
    nn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nno
        }
    },

    /**
     * [Norwegian](http://en.wikipedia.org/wiki/Norwegian_language)
     * ([nor][LanguageAlpha3Code.nor]).
     *
     * @see [Sprkkoder for POSIX locale i Norge](http://i18n.skolelinux.no/localekoder.txt)
     *
     * @see [Red Hat Bugzilla – Bug 532487 Legacy Norwegian locale
     ](https://bugzilla.redhat.com/show_bug.cgi?id=532487) */
    no {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nor
        }
    },

    /**
     * [Southern Ndebele](http://en.wikipedia.org/wiki/Southern_Ndebele_language)
     * ([nbl][LanguageAlpha3Code.nbl]).
     */
    nr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nbl
        }
    },

    /**
     * [Navajo](http://en.wikipedia.org/wiki/Navajo_language)
     * ([nav][LanguageAlpha3Code.nav]).
     */
    nv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nav
        }
    },

    /**
     * [Chichewa](http://en.wikipedia.org/wiki/Chichewa_language)
     * ([nya][LanguageAlpha3Code.nya]).
     */
    ny {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.nya
        }
    },

    /**
     * [Occitan](http://en.wikipedia.org/wiki/Occitan_language)
     * ([oci][LanguageAlpha3Code.oci]).
     */
    oc {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.oci
        }
    },

    /**
     * [Ojibwe](http://en.wikipedia.org/wiki/Ojibwe_language)
     * ([oji][LanguageAlpha3Code.oji]).
     */
    oj {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.oji
        }
    },

    /**
     * [Oromo](http://en.wikipedia.org/wiki/Oromo_language)
     * ([orm][LanguageAlpha3Code.orm]).
     */
    om {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.orm
        }
    },

    /**
     * [Oriya](http://en.wikipedia.org/wiki/Oriya_language)
     * ([ori][LanguageAlpha3Code.ori]).
     */
    or {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ori
        }
    },

    /**
     * [Ossetian](http://en.wikipedia.org/wiki/Ossetic_language)
     * ([oss][LanguageAlpha3Code.oss]).
     */
    os {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.oss
        }
    },

    /**
     * [Punjabi](http://en.wikipedia.org/wiki/Punjabi_language)
     * ([pan][LanguageAlpha3Code.pan]).
     */
    pa {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.pan
        }
    },

    /**
     * [P&#257;li](http://en.wikipedia.org/wiki/P%C4%81li_language)
     * ([pli][LanguageAlpha3Code.pli]).
     */
    pi {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.pli
        }
    },

    /**
     * [Polish](http://en.wikipedia.org/wiki/Polish_language)
     * ([pol][LanguageAlpha3Code.pol]).
     */
    pl {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.pol
        }
    },

    /**
     * [Pashto](http://en.wikipedia.org/wiki/Pashto_language)
     * ([pus][LanguageAlpha3Code.pus]).
     */
    ps {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.pus
        }
    },

    /**
     * [Portuguese](http://en.wikipedia.org/wiki/Portuguese_language)
     * ([por][LanguageAlpha3Code.por]).
     */
    pt {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.por
        }
    },

    /**
     * [Quechua](http://en.wikipedia.org/wiki/Quechua_language)
     * ([que][LanguageAlpha3Code.que]).
     */
    qu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.que
        }
    },

    /**
     * [Romansh](http://en.wikipedia.org/wiki/Romansh_language)
     * ([roh][LanguageAlpha3Code.roh]).
     */
    rm {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.roh
        }
    },

    /**
     * [Kirundi](http://en.wikipedia.org/wiki/Kirundi)
     * ([run][LanguageAlpha3Code.run]).
     */
    rn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.run
        }
    },

    /**
     * [Romanian](http://en.wikipedia.org/wiki/Romanian_language)
     * ([ron][LanguageAlpha3Code.ron], [rum][LanguageAlpha3Code.rum]).
     */
    ro {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ron
        }
    },

    /**
     * [Russian](http://en.wikipedia.org/wiki/Russian_language)
     * ([run][LanguageAlpha3Code.run]).
     */
    ru {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.rus
        }
    },

    /**
     * [Kinyarwanda](http://en.wikipedia.org/wiki/Kinyarwanda)
     * ([kin][LanguageAlpha3Code.kin]).
     */
    rw {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.kin
        }
    },

    /**
     * [Sanskrit](http://en.wikipedia.org/wiki/Sanskrit)
     * ([san][LanguageAlpha3Code.san]).
     */
    sa {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.san
        }
    },

    /**
     * [Sardinian](http://en.wikipedia.org/wiki/Sardinian_language)
     * ([srd][LanguageAlpha3Code.srd]).
     */
    sc {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.srd
        }
    },

    /**
     * [Sindhi](http://en.wikipedia.org/wiki/Sindhi_language)
     * ([snd][LanguageAlpha3Code.snd]).
     */
    sd {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.snd
        }
    },

    /**
     * [Northern Sami](http://en.wikipedia.org/wiki/Northern_Sami)
     * ([sme][LanguageAlpha3Code.sme]).
     */
    se {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.sme
        }
    },

    /**
     * [Sango](http://en.wikipedia.org/wiki/Sango_language)
     * ([sag][LanguageAlpha3Code.sag]).
     */
    sg {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.sag
        }
    },

    /**
     * [Sinhala](http://en.wikipedia.org/wiki/Sinhala_language)
     * ([sin][LanguageAlpha3Code.sin]).
     */
    si {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.sin
        }
    },

    /**
     * [Slovak](http://en.wikipedia.org/wiki/Slovak_language)
     * ([slk][LanguageAlpha3Code.slk], [slo][LanguageAlpha3Code.slo]).
     */
    sk {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.slk
        }
    },

    /**
     * [Slovene](http://en.wikipedia.org/wiki/Slovene_language)
     * ([slv][LanguageAlpha3Code.slv]).
     */
    sl {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.slv
        }
    },

    /**
     * [Samoan](http://en.wikipedia.org/wiki/Samoan_language)
     * ([smo][LanguageAlpha3Code.smo]).
     */
    sm {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.smo
        }
    },

    /**
     * [Shona](http://en.wikipedia.org/wiki/Shona_language)
     * ([sna][LanguageAlpha3Code.sna]).
     */
    sn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.sna
        }
    },

    /**
     * [Somali](http://en.wikipedia.org/wiki/Somali_language)
     * ([som][LanguageAlpha3Code.som]).
     */
    so {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.som
        }
    },

    /**
     * [Albanian](http://en.wikipedia.org/wiki/Albanian_language)
     * ([sqi][LanguageAlpha3Code.sqi], [alb][LanguageAlpha3Code.alb]).
     */
    sq {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.sqi
        }
    },

    /**
     * [Serbian](http://en.wikipedia.org/wiki/Serbian_language)
     * ([srp][LanguageAlpha3Code.srp]).
     */
    sr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.srp
        }
    },

    /**
     * [Swati](http://en.wikipedia.org/wiki/Swati_language)
     * ([ssw][LanguageAlpha3Code.ssw]).
     */
    ss {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ssw
        }
    },

    /**
     * [Southern Sotho](http://en.wikipedia.org/wiki/Sotho_language)
     * ([sot][LanguageAlpha3Code.sot]).
     */
    st {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.sot
        }
    },

    /**
     * [Sundanese](http://en.wikipedia.org/wiki/Sundanese_language)
     * ([sun][LanguageAlpha3Code.sun]).
     */
    su {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.sun
        }
    },

    /**
     * [Swedish](http://en.wikipedia.org/wiki/Swedish_language)
     * ([swe][LanguageAlpha3Code.swe]).
     */
    sv {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.swe
        }
    },

    /**
     * [Swahili](http://en.wikipedia.org/wiki/Swahili_language)
     * ([swa][LanguageAlpha3Code.swa]).
     */
    sw {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.swa
        }
    },

    /**
     * [Tamil](http://en.wikipedia.org/wiki/Tamil_language)
     * ([tam][LanguageAlpha3Code.tam]).
     */
    ta {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tam
        }
    },

    /**
     * [Telugu](http://en.wikipedia.org/wiki/Telugu_language)
     * ([tel][LanguageAlpha3Code.tel]).
     */
    te {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tel
        }
    },

    /**
     * [Tajik](http://en.wikipedia.org/wiki/Tajik_language)
     * ([tgk][LanguageAlpha3Code.tgk]).
     */
    tg {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tgk
        }
    },

    /**
     * [Thai](http://en.wikipedia.org/wiki/Thai_language)
     * ([tha][LanguageAlpha3Code.tha]).
     */
    th {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tha
        }
    },

    /**
     * [Tigrinya](http://en.wikipedia.org/wiki/Tigrinya_language)
     * ([tir][LanguageAlpha3Code.tir]).
     */
    ti {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tir
        }
    },

    /**
     * [Turkmen](http://en.wikipedia.org/wiki/Turkmen_language)
     * ([tuk][LanguageAlpha3Code.tuk]).
     */
    tk {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tuk
        }
    },

    /**
     * [Tagalog](http://en.wikipedia.org/wiki/Tagalog_language)
     * ([tgl][LanguageAlpha3Code.tgl]).
     */
    tl {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tgl
        }
    },

    /**
     * [Tswana](http://en.wikipedia.org/wiki/Tswana_language)
     * ([tsn][LanguageAlpha3Code.tsn]).
     */
    tn {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tsn
        }
    },

    /**
     * [Tongan](http://en.wikipedia.org/wiki/Tongan_language)
     * ([ton][LanguageAlpha3Code.ton]).
     */
    to {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ton
        }
    },

    /**
     * [Turkish](http://en.wikipedia.org/wiki/Turkish_language)
     * ([tur][LanguageAlpha3Code.tur]).
     */
    tr {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tur
        }
    },

    /**
     * [Tsonga](http://en.wikipedia.org/wiki/Tsonga_language)
     * ([tso][LanguageAlpha3Code.tso]).
     */
    ts {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tso
        }
    },

    /**
     * [Tatar](http://en.wikipedia.org/wiki/Tatar_language)
     * ([tat][LanguageAlpha3Code.tat]).
     */
    tt {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tat
        }
    },

    /**
     * [Twi](http://en.wikipedia.org/wiki/Twi)
     * ([twi][LanguageAlpha3Code.twi]).
     */
    tw {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.twi
        }
    },

    /**
     * [Tahitian](http://en.wikipedia.org/wiki/Tahitian_language)
     * ([tah][LanguageAlpha3Code.tah]).
     */
    ty {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.tah
        }
    },

    /**
     * [Uighur](http://en.wikipedia.org/wiki/Uyghur_language)
     * ([uig][LanguageAlpha3Code.uig]).
     */
    ug {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.uig
        }
    },

    /**
     * [Ukrainian](http://en.wikipedia.org/wiki/Ukrainian_language)
     * ([ukr][LanguageAlpha3Code.ukr]).
     */
    uk {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ukr
        }
    },

    /**
     * [Urdu](http://en.wikipedia.org/wiki/Urdu)
     * ([urd][LanguageAlpha3Code.urd]).
     */
    ur {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.urd
        }
    },

    /**
     * [Uzbek](http://en.wikipedia.org/wiki/Uzbek_language)
     * ([uzb][LanguageAlpha3Code.uzb]).
     */
    uz {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.uzb
        }
    },

    /**
     * [Venda](http://en.wikipedia.org/wiki/Venda_language)
     * ([ven][LanguageAlpha3Code.ven]).
     */
    ve {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.ven
        }
    },

    /**
     * [Vietnamese](http://en.wikipedia.org/wiki/Vietnamese_language)
     * ([vie][LanguageAlpha3Code.vie]).
     */
    vi {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.vie
        }
    },

    /**
     * [Volapk](http://en.wikipedia.org/wiki/Volap%C3%BCk)
     * ([vol][LanguageAlpha3Code.vol]).
     */
    vo {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.vol
        }
    },

    /**
     * [Walloon](http://en.wikipedia.org/wiki/Walloon_language)
     * ([wln][LanguageAlpha3Code.wln]).
     */
    wa {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.wln
        }
    },

    /**
     * [Wolof](http://en.wikipedia.org/wiki/Wolof_language)
     * ([wol][LanguageAlpha3Code.wol]).
     */
    wo {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.wol
        }
    },

    /**
     * [Xhosa](http://en.wikipedia.org/wiki/Xhosa_language)
     * ([xho][LanguageAlpha3Code.xho]).
     */
    xh {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.xho
        }
    },

    /**
     * [Yiddish](http://en.wikipedia.org/wiki/Yiddish_language)
     * ([yid][LanguageAlpha3Code.yid]).
     */
    yi {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.yid
        }
    },

    /**
     * [Yoruba](http://en.wikipedia.org/wiki/Yoruba_language)
     * ([yor][LanguageAlpha3Code.yor]).
     */
    yo {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.yor
        }
    },

    /**
     * [Zhuang](http://en.wikipedia.org/wiki/Zhuang_languages)
     * ([zha][LanguageAlpha3Code.zha]).
     */
    za {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.zha
        }
    },

    /**
     * [Chinese](http://en.wikipedia.org/wiki/Chinese_language)
     * ([zho][LanguageAlpha3Code.zho], [chi][LanguageAlpha3Code.chi]).
     */
    zh {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.zho
        }

        override fun toLocale(): Locale? {
            return Locale.CHINESE
        }
    },

    /**
     * [Zulu](http://en.wikipedia.org/wiki/Zulu_language)
     * ([zul][LanguageAlpha3Code.zul]).
     */
    zu {
        override fun getAlpha3(): LanguageAlpha3Code {
            return LanguageAlpha3Code.zul
        }
    };

    /**
     * Get the language name.
     *
     * @return The language name.
     */
    open fun getValue(): String? {
        return getAlpha3()?.value
    }

    /**
     * Convert this `LanguageCode` instance to a [Locale] instance.
     *
     *
     *
     * In most cases, this method creates a new `Locale` instance
     * every time it is called, but some `LanguageCode` instances return
     * their corresponding entries in `Locale` class. For example,
     * [LanguageCode.ja][.ja] always returns [Locale.JAPANESE].
     *
     *
     *
     *
     * The table below lists `LanguageCode` entries whose `toLocale()`
     * do not create new `Locale` instances but return entries in
     * `Locale` class.
     *
     *
     * <table border="1" style="border-collapse: collapse;" cellpadding="5">
     * <tr bgcolor="#FF8C00">
     * <th>LanguageCode</th>
     * <th>Locale</th>
     </tr> *
     * <tr>
     * <td>[LanguageCode.de]</td>
     * <td>[Locale.GERMAN]</td>
     </tr> *
     * <tr>
     * <td>[LanguageCode.en]</td>
     * <td>[Locale.ENGLISH]</td>
     </tr> *
     * <tr>
     * <td>[LanguageCode.fr]</td>
     * <td>[Locale.FRENCH]</td>
     </tr> *
     * <tr>
     * <td>[LanguageCode.it]</td>
     * <td>[Locale.ITALIAN]</td>
     </tr> *
     * <tr>
     * <td>[LanguageCode.ja]</td>
     * <td>[Locale.JAPANESE]</td>
     </tr> *
     * <tr>
     * <td>[LanguageCode.ko]</td>
     * <td>[Locale.KOREAN]</td>
     </tr> *
     * <tr>
     * <td>[LanguageCode.zh]</td>
     * <td>[Locale.CHINESE]</td>
     </tr> *
     </table> *
     *
     * @return A `Locale` instance that matches this `LanguageCode`.
     */
    open fun toLocale(): Locale? {
        return Locale(name)
    }

    /**
     * Get [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
     * language code (3-letter lowercase code(s)).
     *
     *
     *
     * Most languages have just one corresponding ISO 639-2 code, but
     * some languages have two ISO 639-2 codes. They are known as
     * "bibliographic" code (ISO 639-2/B code) and "terminological"
     * code (ISO 639-2/T code). This method returns ISO 639-2/T code.
     * If you want to get ISO 639-2/B code, write like below.
     *
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * LanguageCode alpha2 = ...;
     *
     * [LanguageAlpha3Code] alpha3B = alpha2.[.getAlpha3].[ ][LanguageAlpha3Code.getAlpha3B];
     </pre> *
     *
     *
     *
     * The above code does no harm for most `LanguageCode`s that have
     * just one ISO 639-2 code. [ getAlpha3B()][LanguageAlpha3Code.getAlpha3B] of such `LanguageAlpha3Code` instances just return
     * themselves (= `this` object).
     *
     *
     *
     *
     * The table below lists languages having two ISO 639-2 codes.
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
     * <td>[M&#257;ori](http://en.wikipedia.org/wiki/M%C4%81ori_language)</td>
     </tr> *
     * <tr>
     * <td>[mk][LanguageCode.mk]</td>
     * <td>[mkd][LanguageAlpha3Code.mkd]</td>
     * <td>[mac][LanguageAlpha3Code.mac]</td>
     * <td>[Macedonian](http://en.wikipedia.org/wiki/Macedonian_language)</td>
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
     * @return [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
     * language code.
     * @since 1.1
     */
    open fun getAlpha3(): LanguageAlpha3Code? {
        return null
    }

    companion object {
        /**
         * Get a `LanguageCode` that corresponds to a given
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
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code
         * (3-letter lowercase code). Or "undefined" (case sensitive).
         * Note that if the given code is one of legacy language codes
         * ("iw", "ji" and "in"), it is treated as its official counterpart
         * ("he", "yi" and "id", respectively). For example, if "in" is given,
         * this method returns [LanguageCode.id][.id].
         * @return A `LanguageCode` instance, or `null` if not found.
         */
        fun getByCode(code: String?): LanguageCode? {
            return getByCode(code, true)
        }

        /**
         * Get a `LanguageCode` that corresponds to a given
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
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code
         * (3-letter lowercase code). Or "undefined" (case insensitive).
         * Note that if the given code is one of legacy language codes
         * ("iw", "ji" and "in"), it is treated as its official counterpart
         * ("he", "yi" and "id", respectively). For example, if "in" is given,
         * this method returns [LanguageCode.id][.id].
         * @return A `LanguageCode` instance, or `null` if not found.
         * @since 1.13
         */
        fun getByCodeIgnoreCase(code: String?): LanguageCode? {
            return getByCode(code, false)
        }

        /**
         * Get a `LanguageCode` that corresponds to a given
         * [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) code
         * (2-letter lowercase code) or
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code
         * (3-letter lowercase code).
         *
         * @param code          An [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
         * code (2-letter lowercase code) or an
         * [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2) code
         * (3-letter lowercase code). Or "undefined" (its case sensitivity
         * depends on the value of `caseSensitive`).
         * Note that if the given code is one of legacy language codes
         * ("iw", "ji" and "in"), it is treated as its official counterpart
         * ("he", "yi" and "id", respectively). For example, if "in" is given,
         * this method returns [LanguageCode.id][.id].
         * @param caseSensitive If `true`, the given code should consist of lowercase letters only.
         * If `false`, this method internally canonicalizes the given code by
         * [String.toLowerCase] and then performs search. For example,
         * `getByCode("JA", true)` returns `null`, but on the other hand,
         * `getByCode("JA", false)` returns [LanguageCode.ja][.ja].
         * @return A `LanguageCode` instance, or `null` if not found.
         */
        fun getByCode(code: String?, caseSensitive: Boolean): LanguageCode? {
            var c = code
            c = canonicalize(c, caseSensitive)
            if (c == null) {
                return null
            }
            when (c.length) {
                2, 9 -> return getByEnumName(c)
                3 -> {
                }
                else -> return null
            }
            val alpha3: LanguageAlpha3Code = LanguageAlpha3Code.getByEnumName(c) ?: return null

            // LanguageAlpha3Code.getAlpha2() may return null.
            return alpha3.getAlpha2()
        }

        fun getByEnumName(name: String?): LanguageCode? {
            return try {
                return name?.let { valueOf(it) }
            } catch (e: IllegalArgumentException) {
                null
            }
        }

        /**
         * Get a `LanguageCode` that corresponds to the language code of
         * the given [Locale] instance.
         *
         * @param locale A `Locale` instance.
         * @return A `LanguageCode` instance, or `null` if not found.
         * When [getLanguage()][Locale.getLanguage] method of the
         * given `Locale` instance returns `null` or an
         * empty string, [LanguageCode.undefined][.undefined] is
         * returned.
         * @see Locale.getLanguage
         */
        fun getByLocale(locale: Locale?): LanguageCode? {
            if (locale == null) {
                return null
            }

            // Locale.getLanguage() returns a lowercase ISO 639 code.
            val language = locale.language
            return if (language == null || language.isEmpty()) {
                undefined
            } else getByCode(language, true)
        }

        /**
         * Canonicalize the given language code.
         *
         *
         *  1. If the given code is `null` or an empty string,
         * `null` is returned.
         *  1. Otherwise, if the given code matches one of three legacy
         * language code ("iw", "ji" and "in"), its official counterpart
         * ("he", "yi" and "id", respectively) is returned. Note that
         * `String.equals(Object)` is used for comparison if
         * `caseSensitive` is `true` and that
         * `String.equalsIgnoreCase(String)` is used if
         * `caseSensitive` is `false`.
         *  1. Otherwise, if `caseSensitive` is `true`,
         * the given code is returned as is.
         *  1. Otherwise, `code.toLowercase()` is returned.
         *
         *
         * @param code          ISO 639-1 code.
         * @param caseSensitive `true` if the code should be handled case-sensitively.
         * @return Canonicalized language code.
         */
        fun canonicalize(code: String?, caseSensitive: Boolean): String? {
            if (code == null || code.isEmpty()) {
                return null
            }

            // Support legacy language codes. Map three obsolete language codes
            // { "iw", "ji", "in" } to new official ones { "he", "yi", "id" }.
            val legacy = arrayOf("iw", "ji", "in")
            val official = arrayOf("he", "yi", "id")
            for (i in legacy.indices) {
                if (caseSensitive) {
                    if (code == legacy[i]) {
                        return official[i]
                    }
                } else {
                    if (code.equals(legacy[i], ignoreCase = true)) {
                        return official[i]
                    }
                }
            }
            return if (caseSensitive) {
                code
            } else {
                code.lowercase()
            }
        }

        /**
         * Get a list of `LanguageCode` by a name regular expression.
         *
         *
         *
         * This method is almost equivalent to [ findByName][.findByName]`(Pattern.compile(regex))`.
         *
         *
         * @param regex Regular expression for names.
         * @return List of `LanguageCode`. If nothing has matched,
         * an empty list is returned.
         * @throws IllegalArgumentException               `regex` is `null`.
         * @throws java.util.regex.PatternSyntaxException `regex` failed to be compiled.
         * @since 1.11
         */
        fun findByValue(regex: String?): List<LanguageCode> {
            requireNotNull(regex) { "regex is null." }

            // Compile the regular expression. This may throw
            // java.util.regex.PatternSyntaxException.
            val pattern = Pattern.compile(regex)
            return findByValue(pattern)
        }

        /**
         * Get a list of `LanguageCode` by a name pattern.
         *
         *
         *
         * For example, the list obtained by the code snippet below:
         *
         *
         * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black; padding: 0.5em;">
         * Pattern pattern = Pattern.compile(<span style="color: darkred;">".*nese"</span>);
         * List&lt;LanguageCode&gt; list = LanguageCode.findByName(pattern);</pre>
         *
         *
         *
         * contains 5 `LanguageCode`s as listed below.
         *
         *
         *
         *  1. [.an] : Aragonese
         *  1. [.ja] : Japanese
         *  1. [.jv] : Javanese
         *  1. [.su] : Sundanese
         *  1. [.zh] : Chinese
         *
         *
         * @param pattern Pattern to match names.
         * @return List of `LanguageCode`. If nothing has matched,
         * an empty list is returned.
         * @throws IllegalArgumentException `pattern` is `null`.
         * @since 1.11
         */
        fun findByValue(pattern: Pattern?): List<LanguageCode> {
            requireNotNull(pattern) { "pattern is null." }
            val list: MutableList<LanguageCode> = ArrayList()
            for (entry in values()) {
                // If the name matches the given pattern.
                if (entry.getValue() != null && pattern.matcher(entry.getValue()!!).matches()) {
                    list.add(entry)
                }
            }
            return list
        }
    }
}
